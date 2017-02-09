package reportes.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.util.AreaReference;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.emf.common.util.EList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Woodstox;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional;

public class ExcelGenerator {
	
	private String absolutePath;
	
	private XSSFWorkbook workbook;
	
	private XSSFSheet newDataSheet;
	
	private XSSFSheet dataSheet;
	
	private XSSFSheet sheet;
	
	
	ModelFactory modelFactoryGC;
	
	/**
	 * Matriz variable con los datos del Excel
	 */
	private ArrayList<ArrayList<String>> resultSet;
	
	/**
	 *  Se guardan los titulos que tienen el filtro
	 */
	private ArrayList<String> listFilter;
	
	/**
	 *  Se guardan las posiciones de los filtros
	 */
	private ArrayList<Coordinate> posFilters;
	
	/**
	 *  Se crea un map con llave string y el valor de la columna que le corresponde en el result set
	 */
	private Map<String, Integer> titlesMap;
	
	/**
	 * Se guardan los valores unicos de cada columna del resultset
	 */
	private ArrayList<Set<String>> setResult;
	
	/**
	 * Se crea un arreglo de los valores del primer filtro que es el unico que no tiene dependencia
	 */
	private String[] listFixed;
	
	/**
	 * Resultado de la consulta
	 */
	private Resultado resultado;
	
	private ArrayList<String> listaTuplas;
	
	private ArrayList<String> columns;
	
	
	ArrayList< String > columnsNames;
	ArrayList <Integer> columnsIndex;
	
	/**
	 * Entero que acumula el numero de filtros indirectos
	 */
	private int acc;
	
	private int firstRowFilter;
	
	int posRowIniData;
	
	int posCellIniData;
	
	/**
	 * @param absolutePath
	 * @param listFilter
	 * @param posFilters
	 * @param modelFactoryGC 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public ExcelGenerator(String absolutePath, ArrayList<String> listFilter, ArrayList<Coordinate> posFilters,
			ModelFactory modelFactoryGC, int posRowIniData, int posCellIniData) throws FileNotFoundException, IOException {
		
		this.absolutePath = absolutePath;
		this.listFilter = listFilter;
		this.posFilters = posFilters;
		this.posRowIniData = posRowIniData;
		this.posCellIniData = posCellIniData;
		firstRowFilter = 2;
		
		titlesMap = new HashMap<String, Integer>();
		
		listaTuplas = new ArrayList<String>();
		columns  =    new ArrayList<String>();
		columnsNames = new ArrayList<String>();
		columnsIndex = new ArrayList<Integer>();
		
		this.modelFactoryGC = modelFactoryGC;
		
		resultado = modelFactoryGC.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListResultado().get(0);
		
		workbook = readFile();
		
		//resultSet = getResulSet(dataSheet);
		//createNames();
		//init();
		
		//execute(listFilter, titlesMap, acc, posRowIniData, posCellIniData);
		//saveExcel();
	}
	
	
	public void createRelations() throws FileNotFoundException, IOException{
		
		sheet = workbook.getSheetAt(0);
		
		if(workbook.getSheet("Datos")==null){
			newDataSheet = workbook.createSheet("Datos");
		}else{
			workbook.removeSheetAt(workbook.getSheetIndex("Datos"));
			newDataSheet = workbook.createSheet("Datos");
		}
		
		resultSet = getResulSet(dataSheet);
		createNames();
		init();				
		execute(listFilter, titlesMap, acc, posRowIniData, posCellIniData);
		saveExcel();	
	}
	
	public void init() {
		
		
		titlesMap = getTitles(resultSet);
		setResult = removeDuplicateValues(resultSet);
		
		String cadena = listFilter.get(0);
		Integer n = titlesMap.get(cadena);
		listFixed = setResult.get(n)
				.toArray(new String[setResult.get(n).size()]);
		createListBox(listFixed, sheet, posFilters.get(0).x, posFilters.get(0).y);

		// Se crean las dependencias de los filtros
		ArrayList<Map<String, Set<String>>> listDependenceMap = createDependence(resultSet, titlesMap, listFilter);

		acc = 0;
		
		// Se escribe en la sheet para utilizar los datos dentro del workbook
		for (int i = 0; i < listDependenceMap.size(); i++) {
			buildDataSheet(newDataSheet, listDependenceMap.get(i), acc);
			acc += listDependenceMap.get(i).size();
		}

	}
	
	

	
	public void initDataSheet(int indexColum [] ) throws FileNotFoundException, IOException{
		//dataSheet = workbook.createSheet();
			
		ElementoModeloResultado element;
		
		for(int i=0;i<resultado.getListResultElement().size();i++){
			element = (ElementoModeloResultado) resultado.getListResultElement().get(i);
			String s = getAtributtes(element);
			exploreResult(element.getListElementoModeloResultado(),s);	
		}
		
		dataSheet = workbook.createSheet();
		
		
		for(int i=0;i<listaTuplas.size();i++){
			String s= listaTuplas.get(i);
			Row r = dataSheet.createRow(i);
			
			String tuplas[] = s.split(",");
			
			for(int j=0;j<indexColum.length;j++){
				Cell c = r.createCell(j);
				c.setCellValue(  tuplas[  indexColum[j] ] );
			}
		}
		
		saveExcel();
	}
	
		
	public void writeFileColumns() throws IOException{
		
		
		ElementoModeloResultado element = (ElementoModeloResultado) resultado.getListResultElement().get(0);
		getColumnsNames(element);
		exploreColumns(element.getListElementoModeloResultado());
		
		dataSheet = workbook.getSheet("ResultSet");
		if(dataSheet == null)
			dataSheet = workbook.createSheet("ResultSet");
		
		createTable(columns, 1);
		saveExcel();
	}
	
	
	private void createTable(ArrayList<String> columns, int tam) {
		
		XSSFTable table =  dataSheet.createTable();
		
		CTTable cttable = table.getCTTable();
		
		CTTableStyleInfo table_style = cttable.addNewTableStyleInfo();
	    table_style.setName("TableStyleMedium9"); 
	    table_style.setShowColumnStripes(false); //showColumnStripes=0
	    table_style.setShowRowStripes(true); //showRowStripes=1
		
	    /* Define the data range including headers */
	    AreaReference my_data_range = new AreaReference(new CellReference(0, 0), new CellReference(tam, columns.size()-1));
	    
	    /* Set Range to the Table */
	    cttable.setRef(my_data_range.formatAsString());
	    cttable.setDisplayName("ResultSet");      /* this is the display name of the table */
	    cttable.setName("ResultSet");    /* This maps to "displayName" attribute in <table>, OOXML */            
	    cttable.setId(1L); //id attribute against table as long value
	    
	    CTTableColumns columnsTable = cttable.addNewTableColumns();
	    columnsTable.setCount(columns.size()); //define number of columns
	    
	    /* Define Header Information for the Table */
	    XSSFRow row = dataSheet.createRow(0);
	    XSSFCell cell;
	    
	    
	    for (int i = 0; i < columns.size(); i++) {
	    	CTTableColumn column = columnsTable.addNewTableColumn();   
	    	column.setName("Column");      
	        column.setId(i+1);
	        cell = row.createCell(i);
            cell.setCellValue(columns.get(i));
	    }
	    
	}
	
	public void createDataSheet() throws FileNotFoundException, IOException {
		
		workbook = readFile();
		dataSheet = workbook.getSheet("ResultSet");						 
		XSSFRow row = dataSheet.getRow(1);
		XSSFCell cell;
	
		for(int i =0; i < columns.size(); i++){
			cell  = row.getCell(i);
			if(cell != null){
				String value = getCellValue(cell);
				if(value!=""){
					columnsNames.add(value);
					columnsIndex.add(i);
				}
			}
		}
		
		workbook.removeSheetAt( workbook.getSheetIndex("ResultSet"));
		
		ElementoModeloResultado element;
		for(int i=0; i<resultado.getListResultElement().size(); i++){
			element = (ElementoModeloResultado) resultado.getListResultElement().get(i);
			String s = getAtributtes(element);
			exploreResult(element.getListElementoModeloResultado(),s);	
		}
		
		for(int i=0;i<listaTuplas.size();i++){
			System.out.println(listaTuplas.get(i));
		}
		
		if(listFilter.size() == 0) {
			
			dataSheet = workbook.getSheetAt(0);
			for(int i=0, rowIndex = posRowIniData; i < listaTuplas.size(); i++, rowIndex++){
				String s= listaTuplas.get(i);
				Row r = dataSheet.getRow(rowIndex);
				if(r == null) r = dataSheet.createRow(rowIndex);
				String tuplas[] = s.split(",");
				
				for(int j=0, cellIndex = posCellIniData; j < columnsIndex.size(); j++, cellIndex++){
					Cell c = r.getCell(cellIndex);
					if(c == null) c = r.createCell(cellIndex);
					c.setCellValue(tuplas[columnsIndex.get(j)]);
				}
			}
			
		} else {
			
			dataSheet = workbook.createSheet("ResultSet");
			createTable(columnsNames, listaTuplas.size());
			for(int i=0; i<listaTuplas.size(); i++){
				String s= listaTuplas.get(i);
				Row r = dataSheet.createRow(i+1);
				String tuplas[] = s.split(",");
				
				for(int j=0;j<columnsIndex.size();j++){
					Cell c = r.createCell(j);
					c.setCellValue(tuplas[columnsIndex.get(j)]);
				}
			}
		}
		
		saveExcel();
	}
	
	public void exploreColumns(EList<ElementoModeloResultado> listaR ){
		
		if(listaR.size() == 0)
			return;
		
		ElementoModeloResultado ans = listaR.get(0);
		getColumnsNames(ans);
		exploreColumns(ans.getListElementoModeloResultado());
	}
	
	public void exploreResult(EList<ElementoModeloResultado> listaR, String tupla){
		
		if(listaR.size() == 0){
			listaTuplas.add(tupla);
			return;
		}
		
		ElementoModeloResultado ans;
		for(int i=0;i < listaR.size();i++){
			ans = listaR.get(i);
			String s = getAtributtes(ans);
			exploreResult(ans.getListElementoModeloResultado() ,tupla+ "," +s);
		}
	}

	public void execute(ArrayList<String> listFilter, Map<String, Integer> titlesMap,
			int acc, int posRowIniData, int posCellIniData) {
		
		// Se escriben las formulas de indirecto en el Excel
		setIndirect();

		// Se escribe la formula de contar valores del resultset en el Excel
		countFormula(acc + 1, 0);

		// Se escribe la formula que actualiza los datos en la tabla
		theFormula(posRowIniData+1, posCellIniData, acc + 1, 0, titlesMap.get(listFilter.get(listFilter.size() - 1)), resultSet.get(0).size(), resultSet.size());
	}
	
	public XSSFWorkbook readFile() throws FileNotFoundException, IOException {
		// Se lee el archivo
		FileInputStream file = new FileInputStream(new File(absolutePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		return workbook;
	}

	public void saveExcel() throws FileNotFoundException, IOException {
		// Se escribe el archivo con las modificaciones
		FileOutputStream fileOutputStream;
		fileOutputStream = new FileOutputStream(absolutePath);
		workbook.write(fileOutputStream);
		fileOutputStream.close();
	}

	public void createNames() {
		// Se borran los nombres del workbook para actualizarlos
		deleteNames(workbook);

		// Se crean los nombres en el workbook de las columnas del result set
		nameTableToNameRange(dataSheet, resultSet.get(0));
	}
	
	public void readSheet() {
		
		// Se obtienen las sheet necesarias para el proceso
		if (workbook.getSheet("Datos") == null) {
			newDataSheet = workbook.createSheet("Datos");
		} else {
			workbook.removeSheetAt(workbook.getSheetIndex("Datos"));
			newDataSheet = workbook.createSheet("Datos");
		}
		
		int numSheet = workbook.getNumberOfSheets();
		dataSheet = workbook.getSheetAt(numSheet - 2);
		sheet = workbook.getSheetAt(0);
	}

	/**
	 * Dado un numero base 0, retorna la letra de la columna correspondiente de
	 * Excel
	 * 
	 * @param col
	 *            numero base 0 que desea saber la letra de la columna en Excel
	 * @return letra de la columna correspondiente de Excel
	 */
	public String getNumToCol(int col) {
		return CellReference.convertNumToColString(col);
	}

	/**
	 * Metodo para extraer los datos de una hoja de calculo de Excel. Los datos
	 * se leen por filas
	 * 
	 * @param sheet
	 *            Hoja de calculo a la que se le extraen los datos
	 * @return una matriz variable de Strings con los valores de la hoja de
	 *         Calculo
	 */
	public ArrayList<ArrayList<String>> getResulSet(Sheet sheet) {

		ArrayList<ArrayList<String>> resultSet = new ArrayList<>();

		Iterator<Row> rowIterator = sheet.iterator();
		Row row;
		while (rowIterator.hasNext()) {
			row = rowIterator.next();

			Iterator<Cell> cellIterator = row.cellIterator();
			Cell celda;
			ArrayList<String> tupla = new ArrayList<>();
			while (cellIterator.hasNext()) {
				celda = cellIterator.next();
				celda.setCellType(Cell.CELL_TYPE_STRING);
				tupla.add(celda.getStringCellValue());
			}
			resultSet.add(tupla);
		}

		return resultSet;
	}

	/**
	 * Metodo para eliminar datos repetidos de una columna de los datos
	 * extraidos de la hoja de calculo de Excel
	 * 
	 * @param resultSet
	 *            Matriz variable de los datos extraidos de la hoja de calculo
	 *            de Excel
	 * @param column
	 *            Columna base 0 a la que se le van a eliminar los repetidos
	 * @return un conjunto de string sin repetir
	 */
	public Set<String> getSetColum(ArrayList<ArrayList<String>> resultSet, int column) {
		Set<String> setColumn = new HashSet<>();
		for (int i = 1; i < resultSet.size(); i++) {
			setColumn.add(resultSet.get(i).get(column));
		}
		return setColumn;
	}

	/**
	 * Metodo para tener un mapa con un conjunto de datos asociados a la llave
	 * 
	 * @param resultSet
	 *            Matriz variable de los datos extraidos de la hoja de calculo
	 *            de Excel
	 * @param columnSorce
	 *            columna de la matriz que hace a la llave del mapa
	 * @param columnTarget
	 *            columna de la matriz que hace a los valores asociados a la
	 *            llave del mapa
	 * @return un mapa con los valores asociados
	 */
	public  Map<String, Set<String>> getMapOfColumnByColumn(ArrayList<ArrayList<String>> resultSet,
			int columnSorce, int columnTarget) {
		Map<String, Set<String>> mapColumn = new HashMap<>();
		for (int i = 1; i < resultSet.size(); i++) {
			String key = resultSet.get(i).get(columnSorce);
			String value = resultSet.get(i).get(columnTarget);
			if (mapColumn.get(key) == null) {
				Set<String> name = new HashSet<>();
				name.add(value);
				mapColumn.put(key, name);
			} else {
				mapColumn.get(key).add(value);
			}
		}
		return mapColumn;
	}

	/**
	 * Metodo para crear una lista en el Excel en una posicion (row,col)
	 * especifica con un arreglo eo
	 * 
	 * @param list
	 *            arreglo de string con las opciones de la lista
	 * @param sheet
	 *            hoja de calculo donde se va a crear la lista
	 * @param row
	 *            fila donde se crea la lista
	 * @param col
	 *            columna donde se crea la lista
	 */
	public  void createListBox(String[] list, Sheet sheet, int row, int col) {
		XSSFDataValidationHelper helper = new XSSFDataValidationHelper((XSSFSheet) sheet);
		XSSFDataValidationConstraint constraint = (XSSFDataValidationConstraint) helper
				.createExplicitListConstraint(list);
		CellRangeAddressList regions = new CellRangeAddressList(row, row, col, col);
		XSSFDataValidation dataValidation = (XSSFDataValidation) helper.createValidation(constraint, regions);
		sheet.addValidationData(dataValidation);
	}

	/**
	 * Metodo para agregar al Excel los datos necesarios para darle nombres al
	 * conjunto de datos en el Excel
	 * 
	 * @param sheet
	 *            hoja de calculo donde se van a agregar los datos
	 * @param map
	 *            datos que se van a agregar. La estructura de datos es un mapa.
	 *            El key es el nombre del rango. El value es el conjunto de
	 *            datos en el rango
	 * @param rowN
	 *            fila donde se va a empezar a adicionar los datos en el Excel
	 */
	public  void buildDataSheet(Sheet sheet, Map<String, Set<String>> map, int rowN) {
		Row row = null;
		Cell cell = null;
		Name name = null;
		int i = rowN;
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			int j = 0; 
			String key = (String) it.next();
			row = sheet.createRow(i);
			for (String value : map.get(key)) {
				cell = row.createCell(j);
				cell.setCellValue(value);
				j++;
			}
			name = sheet.getWorkbook().createName();
			name.setNameName(key.replaceAll(" ", "_"));
			String colIni = getNumToCol(0);
			String colFin = getNumToCol(j - 1);
			System.out.println(sheet.getSheetName() + "!$" + colIni + "$" + (i + 1) + ":$" + colFin + "$" + (i + 1));
			name.setRefersToFormula(
					sheet.getSheetName() + "!$" + colIni + "$" + (i + 1) + ":$" + colFin + "$" + (i + 1));
			i++;
		}
	}

	/**
	 * Metodo para realizar la formula de indirecto en las celdas
	 * correspondientes
	 * 
	 * @param sheet
	 *            hoja de calculo donde se va a realizar la formula
	 * @param posFilters
	 *            Lista con las posiciones de los filtros
	 */
	public  void setIndirect() {
		DataValidationHelper helper = sheet.getDataValidationHelper();
		DataValidationConstraint constraint = null;
		DataValidation validation = null;
		for (int i = 1; i < posFilters.size(); i++) {
			String cell = getNumToCol(posFilters.get(i-1).getY());
			constraint = helper.createFormulaListConstraint(
					"INDIRECT(SUBSTITUTE(" + sheet.getSheetName() + "!$" + cell + "$" + (posFilters.get(i-1).getX() + 1) + ",\" \", \"_\"))");
			System.out.println(posFilters.get(i-1).getX()+" "+posFilters.get(i-1).getX()+" "+posFilters.get(i-1).getY()+" "+posFilters.get(i-1).getY());
			System.out.println(
					"INDIRECT(SUBSTITUTE(" + sheet.getSheetName() + "!$" + cell + "$" + (posFilters.get(i-1).getX() + 1) + ",\" \", \"_\"))");
			
			validation = helper.createValidation(constraint, new CellRangeAddressList(posFilters.get(i).getX(),
					posFilters.get(i).getX(), posFilters.get(i).getY(), posFilters.get(i).getY()));
			sheet.addValidationData(validation);
		}
	}

	/**
	 * Metodo para borrar los nombres de los rangos de un Excel
	 * 
	 * @param workbook
	 *            Archivo excel al que se le van a borrar los nombres de los
	 *            rangos
	 */
	public  void deleteNames(XSSFWorkbook workbook) {
		int n = workbook.getNumberOfNames();
		while (n != 0) {
			String del = workbook.getNameAt(0).getNameName();
			workbook.removeName(del);
			n--;
		}
	}

	/**
	 * Metodo para asignarle el nombre del rango a cada columna de la tabla del
	 * conjunto de datos
	 * 
	 * @param sheet
	 *            hoja de calculo que tiene los datos
	 * @param names
	 *            lista de nombres de los rangos
	 */
	public  void nameTableToNameRange(Sheet sheet, ArrayList<String> names) {
		XSSFWorkbook workbook = (XSSFWorkbook) sheet.getWorkbook();
		Name name = null;
		for (int i = 0; i < names.size(); i++) {
			name = workbook.createName();
			name.setNameName(names.get(i).replaceAll(" ", "_"));
			name.setRefersToFormula("ResultSet[" + names.get(i) + "]");
		}
	}

	/**
	 * Metodo para asignarle a una celda la formula de contar el numero de
	 * apariciones en un rango de la tabla
	 * 
	 * @param sourceSheet
	 *            hoja de calculo donde esta el criterio para contar
	 * @param sourceRow
	 *            fila donde esta el criterio para contar
	 * @param sourceCell
	 *            celda donde esta el criterio para contar
	 * @param targetSheet
	 *            hoja de calculo donde va a ir la formula de contar
	 * @param targetRow
	 *            fila donde va a ir la formula de contar
	 * @param targetCell
	 *            celda donde va a ir la formula de contar
	 * @param toCount
	 *            nombre del rango que se va a contar
	 */
	public  void countFormula(int targetRow, int targetCell) {
		Row row = newDataSheet.createRow(targetRow);
		Cell cell = row.createCell(targetCell);
		String formula = "COUNTIFS(ResultSet["+listFilter.get(0)+"],"+sheet.getSheetName()+"!"+getNumToCol(posFilters.get(0).getY())+(posFilters.get(0).getX()+1);
		for(int i = 1; i < listFilter.size();i++){
			formula+=",ResultSet["+listFilter.get(i)+"],"+sheet.getSheetName()+"!"+getNumToCol(posFilters.get(i).getY())+(posFilters.get(i).getX()+1);
		}
		formula+=")";
		cell.setCellFormula(formula);
		System.out.println(formula);
	}

	/**
	 * Metodo para filtrar los datos por un criterio indicado
	 * 
	 * @param sheetFormula
	 *            Hoja de calculo donde se va a agregar la formula
	 * @param targetRow
	 *            Primera fila donde se va a agregar la formula
	 * @param targetCell
	 *            Primera columna donde se va agregar la formula
	 * @param filterRow
	 *            Posicion de la fila donde esta el criterio del filtro
	 * @param filterCell
	 *            Posicion de la columna donde esta el criterio del filtro
	 * @param sheetCount
	 *            Hoja de calculo donde esta la cantidad de personas que se van
	 *            a filtrar
	 * @param countRow
	 *            Posicion de la fila donde esta la cantidad de personas que se
	 *            van a filtrar
	 * @param countCell
	 *            Posicion de la columna donde esta la cantidad de personas que
	 *            se van a filtrar
	 * @param infoSheet
	 *            Hoja de calculo donde esta el conjunto de datos
	 * @param firstRowFilter
	 *            Posicion de la fila donde comienza los datos del filtro
	 * @param firstCellFilter
	 *            Posicion de la columna donde comienza los datos del filtro
	 * @param sizeX
	 *            Numero de columnas del conjunto de datos
	 * @param sizeY
	 *            Numero de filas del conjunto de datos
	 * @param filter
	 *            El nombre del filtro
	 */
	public  void theFormula(int targetRow, int targetCell, int countRow, int countCell, int firstCellFilter,
			int sizeX, int sizeY) {
		String hoja1 = sheet.getSheetName();
		String hoja2 = dataSheet.getSheetName();
		for (int i = 0; i < sizeY; i++) {
			for (int j = 0; j < sizeX; j++) {
				String filas = "ROWS(" + hoja1 + "!" + getNumToCol(targetCell + j) + "$" + targetRow + ":" + hoja1 + "!"
						+ getNumToCol(targetCell + j) + (targetRow + i) + ")";
				int n = listFilter.size();
				String constraint ="(("+listFilter.get(n-1).replaceAll(" ", "_")+"=$"+getNumToCol(posFilters.get(n-1).getY())+"$"+(posFilters.get(n-1).getX()+1)+")";
				for (int k = n-2; k >= 0; k--) {
					constraint += "*("+listFilter.get(k).replaceAll(" ", "_") + "=$" + getNumToCol(posFilters.get(k).getY()) + "$" + (posFilters.get(k).getX()+1)+")";
				}
				constraint+=")";
				String si = "IF(" + constraint + ",ROW(" + listFilter.get(listFilter.size()-1).replaceAll(" ", "_")
						+ ")-ROW(" + hoja2 + "!$" + getNumToCol(firstCellFilter) + "$" + firstRowFilter + ")+1)";
				String formula = "IF(" + filas + "<=" + newDataSheet.getSheetName() + "!$" + getNumToCol(countCell) + "$"
						+ (countRow + 1) + ",INDEX(INDIRECT(SUBSTITUTE(" + getNumToCol(targetCell + j) + "$" + (targetRow - 1)
						+ ",\" \",\"_\")),SMALL(" + si + "," + filas + ")),\"\")";
				System.out.println(formula);
				sheet.setArrayFormula(formula,
						new CellRangeAddress((targetRow + i) - 1, (targetRow + i) - 1, targetCell + j, targetCell + j));
			}
		}

	}

	/**
	 * Define las dependencias del resultado por el orden de la lista de filtros
	 * 
	 * @param resultSet
	 *            Conjunto de resultados leidos del Excel y guardados en una
	 *            matriz volatil
	 * @param titlesMap
	 *            Mapa de titulos el cual tiene como llave un string que es el
	 *            titulo de la columna correspondiente al conjunto de resultados
	 * @param listFilter
	 *            Lista de strings con el nombre de lo que se quiera filtrar
	 * @return Lista de dependencia de datos
	 */
	public  ArrayList<Map<String, Set<String>>> createDependence(ArrayList<ArrayList<String>> resultSet,
			Map<String, Integer> titlesMap, ArrayList<String> listFilter) {
		
		ArrayList<Map<String, Set<String>>> listDependenceMap = new ArrayList<>();
		
		for (int i = 1; i < listFilter.size(); i++)
			listDependenceMap.add(getMapOfColumnByColumn(resultSet, titlesMap.get(listFilter.get((i - 1))),
					titlesMap.get(listFilter.get(i))));
		
		return listDependenceMap;
	}

	/**
	 * Obtiene los titulos del resultset y los guarda en un mapa
	 * 
	 * @param resultSet
	 *            Conjunto de resultados que tiene el Excel
	 * @return un mapa con llave string que son los titulos de las columnas y de
	 *         valor integer que es la posicion de la columna del resultset
	 */
	public  Map<String, Integer> getTitles(ArrayList<ArrayList<String>> resultSet) {
		Map<String, Integer> titlesMap = new HashMap<>();
		
		for (int i = 0; i < resultSet.get(0).size(); i++) {
			String key = resultSet.get(0).get(i);
			titlesMap.put(key, new Integer(i));
		}
		return titlesMap;
	}

	/**
	 * Borra los valores repetidos del resultset. Los valores unicos quedan en
	 * un Set. Guarda el resultado en una lista. La lista son las columnas del
	 * resultSet
	 * 
	 * @param resultSet
	 *            Conjunto de resultados que tiene el Excel
	 * @return Una lista de valores sin repetir de cada columna.
	 */
	public  ArrayList<Set<String>> removeDuplicateValues(ArrayList<ArrayList<String>> resultSet) {
		ArrayList<Set<String>> setResult = new ArrayList<>();
		for (int i = 0; i < resultSet.get(0).size(); i++)
			setResult.add(getSetColum(resultSet, i));
		return setResult;
	}
	
	
	
	void getNameColumns(ResultElement element){
		

	}
	
	public String getAtributtes(ResultElement element){
		
		String answer = "";
		
		if(element instanceof UnidadOrganizacional){
			
			UnidadOrganizacional unidadOrganizacional = (UnidadOrganizacional) element;
			if(unidadOrganizacional.getNombre()!=null)
				answer+=unidadOrganizacional.getNombre();
			
		} else if(element instanceof Actor){
			
			Actor  actor = (Actor) element;
			
			if(actor.getNombre()!=null ){
				answer+= actor.getNombre();
			}
			if(actor.getApellido()!=null){
				if(answer.length()>0) answer+= ",";
				answer+= actor.getApellido();
			}
			if(actor.getEmail()!=null){
				if(answer.length()>0) answer+= ",";
				answer+=actor.getEmail();
			}
		} else if(element instanceof Rol){
			
			Rol rol = (Rol) element;
			
			if(rol.getNombre()!=null )
				answer+=rol.getNombre();
			
			if(rol.getDescripcion()!= null ){
				if(answer.length()>0) answer+= ",";
					answer+=rol.getDescripcion();			
			}

		}else if(element instanceof Contacto){
			
			Contacto contacto  = (Contacto) element;
		
			if(contacto.getNombre()!= null)
				answer+= contacto.getNombre();
			
			if(contacto.getUsername()!= null ){
				if(answer.length()>0) answer+= ",";
				answer+=contacto.getUsername();
			}
			if(contacto.getTelefono()!= null ){
				if(answer.length()>0) answer+= ",";
				answer+= contacto.getTelefono();
			}
			if(contacto.getPassword()!= null ){
				if(answer.length()>0) answer+= ",";
				answer+= contacto.getPassword();
			}
		} else if(element instanceof Documento){
				
			 Documento documento = (Documento) element; 	
			 
			 if(documento.getTitulo()!= null )
				 answer+= documento.getTitulo();
			
			 if(documento.getTipo()!= null ){
				if(answer.length()>0) answer+= ",";
				 answer+=documento.getTipo();
			 }		
			if( documento.getFechaCreacion()!=null ){
				if(answer.length()>0) answer+= ",";
				answer+=documento.getFechaCreacion();
			}
				
			if(documento.getEstado()!= null ){
				if(answer.length()>0) answer+= ",";
				answer+= documento.getEstado();
			}
			if(documento.getComentarios()!= null ){
				if(answer.length()>0) answer+= ",";
				answer+= documento.getComentarios();
			}
			if(documento.getEdicion()!= null ){
				if(answer.length()>0) answer+= ",";
				answer+=documento.getEdicion(); 
			}
			if(documento.getAnexo()!= null ){
				if(answer.length()>0) answer+= ",";
				answer+=documento.getAnexo(); 
			}
		} else if(element instanceof Comunicacion){
			
			Comunicacion comunicacion = (Comunicacion) element;
			
			 if(comunicacion.getAsunto()!=null )
				 answer+= comunicacion.getAsunto();
			 
		} else if(element instanceof ActividadProceso){
			
			ActividadProceso actividadProceso = (ActividadProceso) element;
			
			if(actividadProceso.getNombre()!=null )
				answer+= actividadProceso.getNombre();
			
			if(actividadProceso.getDescripcion()!=null ){
				if(answer.length()>0) answer+= ",";
				answer+= actividadProceso.getDescripcion();
			}
			if(actividadProceso.getFechaInicio()!=null){
				if(answer.length()>0) answer+= ",";
					answer+= actividadProceso.getFechaInicio();
			}
			if(actividadProceso.getFechaFin()!=null ){
				if(answer.length()>0) answer+= ",";
				answer+=actividadProceso.getFechaFin();
			}
		} else if(element instanceof InstanciaProceso){
			
			InstanciaProceso instanciaProceso = (InstanciaProceso) element;
			
			if(instanciaProceso.getNombre()!=null )
				 answer+= instanciaProceso.getNombre();
			
			if(instanciaProceso.getDescripcion()!=null ){
				if(answer.length()>0) answer+= ",";
				answer+=instanciaProceso.getDescripcion();
			}
		} else if(element instanceof Deposito){
			
			Deposito deposito = (Deposito) element;
			
			if(deposito.getDescripcion()!=null )
				 answer+= deposito.getDescripcion();
			
		} else if(element instanceof Disco){
			
			Disco disco = (Disco) element;
			
			if(disco.getReferencia()!=null )
				 answer+= disco.getReferencia();
			
			if(disco.getDescripcion()!=null){
				if(answer.length()>0) answer+= ",";
					answer+=disco.getDescripcion();
			}
		} else if(element instanceof Armario){
			
			Armario armario = (Armario) element;
			
			if(armario.getDescripcion()!=null )
				 answer+= armario.getDescripcion();
		}
		
		return answer;
	}
	
	void getColumnsNames(ResultElement element){
		
		if(element instanceof UnidadOrganizacional){
			
			UnidadOrganizacional unidadOrganizacional = (UnidadOrganizacional) element;
			if(unidadOrganizacional.getNombre()!=null)
				columns.add("Nombre UnidadOrganizacional");
			
		} else if(element instanceof Actor){
			
			Actor  actor = (Actor) element;
			
			if(actor.getNombre()!=null )
				columns.add("Nombre Actor");
			
			if(actor.getApellido()!=null)
				columns.add("Apellido Actor");
			
			if(actor.getEmail()!=null)
				columns.add("Email Actor");
			
		} else if(element instanceof Rol){
			
			Rol rol = (Rol) element;
			
			if(rol.getNombre()!=null )
				columns.add("Nombre Rol");
			
			if(rol.getDescripcion()!=null )
				columns.add("Descripcion Rol");
			
		}else if(element instanceof Contacto){
			
			Contacto contacto  = (Contacto) element;
		
			if(contacto.getNombre()!= null)
				columns.add("Nombre Contacto");
			
			if(contacto.getUsername()!= null )
				columns.add("Username Contacto");
			
			if(contacto.getTelefono()!= null )
				columns.add("Telefono Contacto");
			
			if(contacto.getPassword()!= null )
				columns.add("Password Contacto");
			
		} else if(element instanceof Documento){
				
			 Documento documento = (Documento) element; 	
			 
			 if(documento.getTitulo()!= null )
				 columns.add("Titulo Documento");
			
			 if(documento.getTipo()!= null )
				 columns.add("Tipo Documento");
				
			if( documento.getFechaCreacion()!=null )
				columns.add("FechaCreacion Documento");
				
			if(documento.getEstado()!= null )
				columns.add("Estado Documento");
			
			if(documento.getComentarios()!= null )
				columns.add("Comentarios Documento");
			
			if(documento.getEdicion()!= null )
				columns.add("Edicion Documento");
			
			if(documento.getAnexo()!= null )
				columns.add("Anexo Documento");
			 
		} else if(element instanceof Comunicacion){
			
			Comunicacion comunicacion = (Comunicacion) element;
			
			 if(comunicacion.getAsunto()!=null )
				 columns.add("Asunto Comunicacion");
			 
		} else if(element instanceof ActividadProceso){
			
			ActividadProceso actividadProceso = (ActividadProceso) element;
			
			if(actividadProceso.getNombre()!=null )
				columns.add("Nombre Actividad Proceso");
			
			if(actividadProceso.getDescripcion()!=null )
				columns.add("Descripcion ActividadProceso");
			
			if(actividadProceso.getFechaInicio()!=null)
				columns.add("FechaInicio ActividadProceso");
			
			if(actividadProceso.getFechaFin()!=null )
				columns.add("FechaFin actividadProceso");
			
		} else if(element instanceof InstanciaProceso){
			
			InstanciaProceso instanciaProceso = (InstanciaProceso) element;
			
			if(instanciaProceso.getNombre()!=null )
				columns.add("Nombre InstanciaProceso");
			
			if(instanciaProceso.getDescripcion()!=null )
				columns.add("Descripcion Instancia Proceso");
			
		} else if(element instanceof Deposito){
			
			Deposito deposito = (Deposito) element;
			
			if(deposito.getDescripcion()!=null )
				columns.add("Descripcion Deposito");
			
		} else if(element instanceof Disco){
			
			Disco disco = (Disco) element;
			
			if(disco.getReferencia()!=null )
				columns.add("Disco Referencia");
			
			if(disco.getDescripcion()!=null)
				columns.add("Descripcion Disco");
			
		} else if(element instanceof Armario){
			
			Armario armario = (Armario) element;
			
			if(armario.getDescripcion()!=null )
				columns.add("Descripcion Armario");
		}
	}
	
	/**
	 * Metodo que sirve para capturar valores de las celdas en excel
	 * y transformarlas en string
	 * @param cell celda que queremos extraer su valor
	 * @return un string con el contenido de la celda 	
	 */
	public String getCellValue(Cell cell){
		 int cel_Type = cell.getCellType();                           
	     String res="";
		 switch(cel_Type){
	     	case 0: res+=cell.getNumericCellValue();
	             	break;
	     	case 1: res+=cell.getStringCellValue();
	     			break;
	     	case 4:res+=cell.getBooleanCellValue();
	             	break;
	     	case 3:res+="";
	     			break; 
	     }
		 return res;
	}


	public ArrayList<String> getListFilter() {
		return listFilter;
	}

	public void setListFilter(ArrayList<String> listFilter) {
		this.listFilter = listFilter;
	}
	
	
}
