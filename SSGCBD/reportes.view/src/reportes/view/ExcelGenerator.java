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
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelGenerator {
	
	private String absolutePath;
	
	private XSSFWorkbook workbook;
	
	private Sheet newDataSheet;
	
	private Sheet dataSheet;
	
	private Sheet sheet;
	
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
	ArrayList<Set<String>> setResult;
	
	/**
	 * Se crea un arreglo de los valores del primer filtro que es el unico que no tiene dependencia
	 */
	String[] listFixed;
	
	/**
	 * Entero que acumula el numero de filtros indirectos
	 */
	private int acc;
	
	private int firstRowFilter;
	
	/**
	 * @param absolutePath
	 * @param listFilter
	 * @param posFilters
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public ExcelGenerator(String absolutePath, ArrayList<String> listFilter, ArrayList<Coordinate> posFilters,int posRowIniData, int posCellIniData) throws FileNotFoundException, IOException {
		
		this.absolutePath = absolutePath;
		this.listFilter = listFilter;
		this.posFilters = posFilters;
		firstRowFilter = 2;
		 
		workbook = readFile();
		resultSet = getResulSet(dataSheet);
		createNames();
		init();
	
		execute(listFilter, titlesMap, acc, posRowIniData, posCellIniData);
		saveExcel();
	}

	public void init() {

		titlesMap = getTitles(resultSet);
		setResult = removeDuplicateValues(resultSet);

		listFixed = setResult.get(titlesMap.get(listFilter.get(0)))
				.toArray(new String[setResult.get(titlesMap.get(listFilter.get(0))).size()]);
		createListBox(listFixed, sheet, 0, 3);

		// Se crean las dependencias de los filtros
		ArrayList<Map<String, Set<String>>> listDependenceMap = createDependence(resultSet, titlesMap, listFilter);

		acc = 0;
		
		// Se escribe en la sheet para utilizar los datos dentro del workbook
		for (int i = 0; i < listDependenceMap.size(); i++) {
			buildDataSheet(newDataSheet, listDependenceMap.get(i), acc);
			acc += listDependenceMap.get(i).size();
		}

	}

	public void execute(ArrayList<String> listFilter,
			Map<String, Integer> titlesMap, int acc, int posRowIniData, int posCellIniData) {
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
					"INDIRECT(" + sheet.getSheetName() + "!$" + cell + "$" + (posFilters.get(i-1).getX() + 1) + ")");
			System.out.println(
					"INDIRECT(" + sheet.getSheetName() + "!$" + cell + "$" + (posFilters.get(i-1).getX() + 1) + ")");
			validation = helper.createValidation(constraint, new CellRangeAddressList(posFilters.get(i-1).getX(),
					posFilters.get(i-1).getX(), posFilters.get(i-1).getY(), posFilters.get(i-1).getY()));
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
			name.setRefersToFormula("Tabla1[" + names.get(i) + "]");
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
		String formula = "COUNTIFS(Tabla1["+listFilter.get(0)+"],"+sheet.getSheetName()+"!"+getNumToCol(posFilters.get(0).getY())+(posFilters.get(0).getX()+1);
		for(int i = 1; i < listFilter.size();i++){
			formula+=",Tabla1["+listFilter.get(i)+"],"+sheet.getSheetName()+"!"+getNumToCol(posFilters.get(i).getY())+(posFilters.get(i).getX()+1);
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
						+ (countRow + 1) + ",INDEX(INDIRECT(" + getNumToCol(targetCell + j) + "$" + (targetRow - 1)
						+ "),SMALL(" + si + "," + filas + ")),\"\")";
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

}
