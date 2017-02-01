package reportes.view;

import tooldataform.ModelFactory;
import tooldataform.core.CoreFactory;
import tooldataform.core.Domain_Diagram;
import tooldataform.core.Project;
import tooldataform.formmodel.concreta.ColumView;
import tooldataform.formmodel.concreta.ComboView;
import tooldataform.formmodel.concreta.ConcretaFactory;
import tooldataform.formmodel.concreta.Container;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.ItemCombo;
import tooldataform.formmodel.concreta.LabelView;
import tooldataform.formmodel.concreta.TableView;
import tooldataform.formmodel.containers.GraphicalContainer;
import tooldataform.pmoo.Clase;
import tooldataform.pmoo.PmooFactory;
import tooldataform.pmoo.Valores;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DataformGenerator{
	
	//--------------------------------------------------------
	//Atributos
	//--------------------------------------------------------
	
	 /**
	  * Model factory del dataform
	  */
	 protected ModelFactory modelFactory;
	 
	 /**
	  * Objeto del proyecto Dataform
	  */
	 protected Project project;
	 
	 /**
	  * Diagrama dataform
	  * contiene la produccion de 
	  * los elementos capturados 
	  * en el excel
	  */
	 protected DataForm_Diagram dataformDiagram;
	 
	 /**
	  * Domain Diagram necesario
	  * para generar la view part
	  */
	 protected Domain_Diagram domainDiagram;
	 
	 /**
	  * Clase que pertenece al domainDiagram
	  * para generar la view part
	  */
	 protected Clase domainClase;
	 
	 /**
	  * Interfaz grafica que contiene todos 
	  * los elementos capturados en el excel
	  */
	 protected Interface interface1;
	 
	 /**
	  * Contenedor Principal que contiene todos
	  * los elementos de la interfaz
	  */
	 protected Container container;
	 
	 /**
	  * Contiene la ruta de los archivos xmls
	  * extraidos en el excel
	  */
	 protected String path;
	 
	 /**
	  * Contiene la ruta abosoluta del excel
	  * a capturar
	  */
	 protected String absolutePath;
	 
	 /**
	  * Coleccion que contiene el conjunto de
	  * dimensiones de las tablas identificadas 
	  * en el excel
	  */
	 protected ArrayList<String> listTables;
	 
	 /**
	  * Contiene el conjunto de nombres de los
	  * combobox identificados en el excel
	  */
	 protected ArrayList<String> listComboBox;
	 
	 /**
	  * Contiene el conjunto de cordenadas de los
	  * combobox identificados en el excel
	  */
	 protected ArrayList<Coordinate> listComboCordinate;
	 
	 /**
	  * Contiene la dimension del excel 
	  */
	 protected String dimens;
	 
	 /**
	  * Contiene la cantidad de Contenedores que existen
	  * en el excel
	  */
	 protected int nContainers;
	 
	 /**
	  * 
	  * Contiene la cantidad de Tablas que existen en el excel
	  */
	 protected int nTables;
	 
	 /**
	  * Posicion relativa en X que cada contenedor
	  * debe tener como referencia  
	  */
	 protected int nx;
	 
	 /**
	  * Posicion relativa en y que cada contenedor
	  * debe tener como referencia  
	  */
	 protected int ny;
	 
	 /**
	  * Arreglo que contiene las posibles adyacencias en X
	  * de una celda. Se necesita para el BFS
	  */
	 protected int xs[] = {1,-1, 0, 0};
	 	 
	 /**
	  * Arreglo que contiene las posibles adyacencias en Y
	  * de una celda. Se necesita para el BFS
	  */
	 protected int ys[] = {0,0, 1, -1};
	
	 /**
	  * Matriz de visitados que representa 
	  */
	 protected int visit[][];
	
	 /**
	  * Con tiene las regiones combinadas que existen en cada fila
	  */
	 protected ArrayList<MergedRegion> mergedRegions[];
	 
	 /**
	  * Con tiene la lista de contenedores graficos que represetan
	  * las tablas que existen en el excel
	  */
	 protected ArrayList<GraphicalContainer> tablas;
	 
	 /**
	  * Hoja del archivo excel que se esta analizando
	  */
	 protected Sheet sheet;
	 
	 /**
	  * Objeto que sirve para representar el archivo excel
	  * que se quiere analzar
	  */
	 protected Workbook libro;
	 
	/**
	 * Lista que contiene las coordenadas de inicio de cada contenedor
	 */
	protected ArrayList<Coordinate> coordenadasInicioContenedores;
	
	protected ArrayList<Coordinate> coordenadasFinContenedores;
	
	protected int posRowIniData;
	
	protected int posCellIniData;
	
	protected String nombresComboBox[];
	
	protected Coordinate coordenadasComboBox[];
	
	protected int cantidadCombos; 
	 
	//--------------------------------------------------------
	//Constructor
	//--------------------------------------------------------
	
	 public DataformGenerator(String ruta,String as) {
		 this.path = "OpenXML/"+ruta+"/xl/";
		 this.absolutePath = as;
		 
		 /*Inicializacion de las listas para evitar 
		  *NullPointer Exception
		  */
		 listTables = new ArrayList<String>();
		 listComboBox = new ArrayList<String>();
		 listComboCordinate = new ArrayList<Coordinate>();
		 tablas = new ArrayList<GraphicalContainer>();
		 coordenadasInicioContenedores = new ArrayList<Coordinate>();
		 coordenadasFinContenedores  = new ArrayList<Coordinate>();
		 
		 nombresComboBox = new String [100];
		 coordenadasComboBox = new Coordinate[100];
		 
	 }
	 
	//--------------------------------------------------------
	//Metodos
	//--------------------------------------------------------
	 
	public ArrayList<String> getListComboBox() {
		return listComboBox;
	}

	public void setListComboBox(ArrayList<String> listComboBox) {
		this.listComboBox = listComboBox;
	}

	public ArrayList<Coordinate> getListComboCordinate() {
		return listComboCordinate;
	}

	public void setListComboCordinate(ArrayList<Coordinate> listComboCordinate) {
		this.listComboCordinate = listComboCordinate;
	}
	 
	public int getPosRowIniData() {
		return posRowIniData;
	}

	public void setPosRowIniData(int posRowIniData) {
		this.posRowIniData = posRowIniData;
	}

	public int getPosCellIniData() {
		return posCellIniData;
	}

	public void setPosCellIniData(int posCellIniData) {
		this.posCellIniData = posCellIniData;
	}

	/**
	 * Metodo que hace los llamados necesarios a los otros metodos
	 * para generar la produccion del Dataform
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 */
	public void generate() throws ParserConfigurationException, SAXException, IOException, EncryptedDocumentException, InvalidFormatException{
		
		//Incializa la model factory y el diagrama para agregar elementos en el
		Init();
		
		//Se carga el excel a analizar
		InputStream is = new FileInputStream(absolutePath);
	    libro = WorkbookFactory.create(is);
	    sheet = libro.getSheetAt(0);
	    
	    getOrderViewModel();
	    
	    for(int i=0;i < cantidadCombos ;i++ ){
	    	listComboBox.add(nombresComboBox[i]);
	    	listComboCordinate.add(coordenadasComboBox[i]);
	    }
	    
        //Se realiza identifican y se agregan las mergedRegions
	    identifyMergedRegions();
          
		//Identifica las tablas en el XML y obtiene sus dimenciones
		getTables();
		
		//En el libro de visitados, marca dichas tablas para que no sean analizadas 
		//en el metodo de getExtraInformation
		MarcarTablas(listTables);
		
		//Se encarga de indetificar los componentes restantes que estan en el excel
		//Ya sea contenedores, labels, combobox etc
		getExtraInformation();
		
		searchBegin();
		
		//Se salva la produccion  del dataform
		salvarDF();
	}

	private void searchBegin() {
		// TODO Auto-generated method stub
		Row r;
		Cell c;
		for(int i = 0; i < visit.length; i++) {
			r = sheet.getRow(i);
			if (r != null)
			for(int j = 0; j < visit[0].length; j++) {
				c = r.getCell(j);
				if(c != null) {
					c.setCellType(Cell.CELL_TYPE_STRING);
					if(c.getStringCellValue().equals(".")) {
						posRowIniData = i;
						posCellIniData = j;
					}
				}
			}
		}
	}

	/**
	 * Metodo que sirve para setear los bounds de un contenedor en el dataform
	 * @param graphicalContainer contenedor al cual se le quiere setear los bounds
	 * @param x posicion en x donde se ubicara el contenedor
	 * @param y posicion en y donde se ubicara el contenedor
	 * @param width ancho del contenedor
	 * @param height largo del contenedor
	 */
	public void setBoundsGraphicalContainer( GraphicalContainer graphicalContainer,int x, int y, int width, int height) {
		graphicalContainer.setWidth(new Integer(width));
		graphicalContainer.setHeight(new Integer(height));
		graphicalContainer.setPositionX(x);
		graphicalContainer.setPositionY(y);
	}
	
	/**
	 * Metodo que sirve para setear los atributos de una relacion
	 * @param c relacion de contaiment a la cual se le setearean los atributos
	 * @param i i dentificador de la tabla que es due�a de la relacion
	 */
	public void setAtributesContaimentRelation(tooldataform.formmodel.concreta.Containment c, String  name){
		c.setAMultiplicidad(tooldataform.pmoo.Cardinalidad.N);
		c.setBMultiplicidad(tooldataform.pmoo.Cardinalidad.N);
		c.setANavegable(Valores.SI);
		c.setBNavegable(Valores.SI);
		c.setBinding(Valores.SI);
		c.setARol("ownedByTable"+name);
		c.setBRol("listTable"+name);
		c.setName("name"+name);
	}
	
	/**
	 * Metodo que inicializa la produccion del Dataform
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public void Init() throws ParserConfigurationException, SAXException, IOException{
		
		/*Obtiene la dimenscion del excel
		 *formato de la dimension
		 *ejemplo: A3:D7
		 */
		dimens = getDimention();
		
		String inicio = dimens.split(":")[0];
		String fin = 	dimens.split(":")[1];
		
		//Se obtienen las dimensiones de la matriz de visitados
		int w = toInt(stractColumn(fin)); int h = ( Integer.parseInt(capturarNumeros(fin)));
		visit = new int[ h + 1][w +1 ];
		nContainers = 1;
		//Se obtienen las coordenandas relativas
		Coordinate coordinate = getCoordinates(inicio);
		nx = coordinate.getX();   ny = coordinate.getY();
		
		/* Se obtiene el size de la interfaz
		 * Formato x, y.
		 */
		Coordinate size = getSizes(inicio, fin);
		
		//Se instancian los objetos necesarios para crear la produccion
		modelFactory    = tooldataform.TooldataformFactory.eINSTANCE.createModelFactory();
		project         = CoreFactory.eINSTANCE.createProject();
		dataformDiagram = ConcretaFactory.eINSTANCE.createDataForm_Diagram();
		domainDiagram   = CoreFactory.eINSTANCE.createDomain_Diagram();
		interface1      = ConcretaFactory.eINSTANCE.createInterface();
		container       = ConcretaFactory.eINSTANCE.createContainer();
		
		
		//Se dan las dimensiones y ubicacion de la interfaz
		setBoundsGraphicalContainer(interface1, 10, 10 ,size.getX()  + 120, size.getY() + 100);	
		setBoundsGraphicalContainer(container, 15, 15, size.getX()  + 80, size.getX()  + 60);
		
		/*Se relacionan adecuadamente los objetos incializados anteriormente
		 *Para generar un dataform sin errores
		 */
		dataformDiagram.setTheInterface(interface1);
		dataformDiagram.setOwnedByProject(project);
		dataformDiagram.setItsDiagram(domainDiagram);
		dataformDiagram.setName("model.tooldataform_diagram");
		
		domainClase = PmooFactory.eINSTANCE.createClase();
		domainClase.setName("Domain");
		domainDiagram.getListClase().add(domainClase);
		
		project.getListDiagram().add(domainDiagram);
		project.getListDataFormDiagram().add(dataformDiagram);
		project.setTheModelFactory(modelFactory);
		
		interface1.getListGraphicalContainer().add(container);
		
		modelFactory.getListProyecto().add(project);
	}
	
	
	/**
	 * Metodo que obtiene los combobox que estan en el reporte.
	 * @param libro Documento XLS del cual se captura la forma del reporte.
	 */
	public void getOrderViewModel(){
		
		/*Se obtiene la ultima fila a analizar
		 *de la hoja
		 */
		int nmax = sheet.getLastRowNum()+1;
		
		//Objeto necesario para obtener una celda en el excel
		Cell c;
		//Obejto necesario para obtener una fila en el excel
		Row r = null;
		
		cantidadCombos = 0;
		//Recorre la hoja hasta encontrar el primer Combo
		for (int i = 0; i <nmax; i++) {
			r =  sheet.getRow(i);
        	if(r == null) continue;
        	for (int j = 0; j <r.getLastCellNum(); j++) {
	    		c = r.getCell(j);
	            
	    		if(c != null && getCellValue(c).contains("*") ) { 
	            	//Es combo          	
	    			
	    			int id = Integer.parseInt( getCellValue(c).substring(1) );
	    			
	    			//listComboCordinate.add(new Coordinate(i, j-1));
	    			
	    			visit[i][j] = visit[i][j-1]= ++nContainers;
	    			
	    			c = r.getCell(j-1);
	    			
	    			nombresComboBox[id-1]= getCellValue(c);
	    			coordenadasComboBox[id-1]= new Coordinate(i, j);
	    			
	    			ComboView combo =  ConcretaFactory.eINSTANCE.createComboView();
	    			combo.setName(getCellValue(c));
	    			setBoundsGraphicalContainer(combo, 0 , 0, 200, 50);
	    			ItemCombo item = ConcretaFactory.eINSTANCE.createItemCombo();
	    			item.setName("nombre");
	    			combo.setTheItem(item);
	    			container .getListGraphicalContainer().add(combo);
	    			cantidadCombos++;
	            }
	        }
	    }
	}	
	

	
	/**
	 * Este metodo se encarga de identificar, extraer y marcar
	 * informacion adicional que se encuentra en el excel, tales
	 * como; contenedores adicionales, lables, combobox, etc.
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public void getExtraInformation() throws IOException{
        
        //Se recorre la hoja para extraer la futura 
        recorrerHoja();
	}
	
	/**
	 * Metodo que obtiene la lista de 
	 * regiones combinadas de toda la hoja
	 * y explora esa zona para obtener la adecuada 
	 * abstracción del view model
	 */
	public void identifyMergedRegions(){
			
		//Obtiene la lista de merged regions de la hoja
		List<CellRangeAddress> sortedRegions = sheet.getMergedRegions();
	
		//Ordenamos de mayor a menor las regiones con respecto a las filas
		Collections.sort(sortedRegions, new rangeComparator());
		
		//Inicializamos la estructura de datos que se tiene por conveniencia
		//y facilidad para manejar las regiones combinadas
		InitMergedRegions(sortedRegions);
		
		//Se expoloran todas las regiones de la hoja
		for(int i=0;i<sortedRegions.size();i++){
			CellRangeAddress range = sortedRegions.get(i);  
			
			if(visit[range.getFirstRow()][range.getFirstColumn()] == 0){
			
				String textRange = sheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()).getStringCellValue();
				MergedRegion mergeRegion = new MergedRegion(textRange, range.getFirstColumn(), range.getLastColumn(), 
						range.getFirstRow(), range.getLastRow());
				GraphicalContainer container = exploreMergedRegios(mergeRegion);
				this.container.getListGraphicalContainer().add(container);
				visitRegion(mergeRegion);
				nContainers++;
			}	
		}
	}
	
	public boolean searchMergeRegion(MergedRegion range, int nextRow) {
		
		for(int j=0; j<mergedRegions[nextRow].size(); j++){
			
			MergedRegion nextMergeRegion = mergedRegions[nextRow].get(j);
			
			if(nextMergeRegion.getFirstColumn() >= range.getFirstColumn() 
					&& nextMergeRegion.getFirstColumn() <= range.getLastColumn()) {
				
				return true;
			}
		}
		return false;
	}
	
	public GraphicalContainer exploreMergedRegios(MergedRegion range){
				
		GraphicalContainer container =  ConcretaFactory.eINSTANCE.createContainer();
		container.setName(range.getText());
		int firstRow = range.getFirstRow(), lastRow = range.getLastRow();
		int firstColumn = range.getFirstColumn(), lastColumn = range.getLastColumn();
		
		int nextRow = firstRow + (lastRow - firstRow+ 1);
		
		if(mergedRegions[nextRow].size() == 0 || !searchMergeRegion(range, nextRow)) {
			
			ArrayList<String> columns = getTableColumns(range, nextRow);
			TableView table = createTable(range, columns);
			container.getListGraphicalContainer().add(table);
			int deep = visitTable(range);
			setBoundsGraphicalContainer(table, 15, 15, columns.size()*100 , (deep-range.getFirstRow())*20);
			
			tooldataform.formmodel.concreta.Containment c = ConcretaFactory.eINSTANCE.createContainment();
			setAtributesContaimentRelation(c,"");
			
			//Se agrega el source y target de la relacion
			c.getSource().add(container);
			c.getTarget().add(table);
			
			setBoundsGraphicalContainer(container, 15, 15 ,  table.getWidth() + 40 , table.getHeight() + 40);
			return container;
		}
		
		for(int i=0;i<mergedRegions[nextRow].size();i++) {
			
			MergedRegion nextMergeRegin = mergedRegions[nextRow].get(i);
			
			if(nextMergeRegin.getFirstColumn()>=firstColumn && nextMergeRegin.getLastColumn()<=lastColumn){
				
				if(!isTableColumn(nextMergeRegin)){ 
					//sevisita
					visitRegion(nextMergeRegin);
					GraphicalContainer subContainer = exploreMergedRegios(nextMergeRegin);
					container.getListGraphicalContainer().add(subContainer);
					
				} else {
					
					//Se construye la tabla
					//Se visita las tuplas de la tabla y los encabezaos
					//Se agrega al contenedor y se retorna
					
					ArrayList<String> columns = getTableColumns(range, nextRow);
					TableView table = createTable(range, columns);
					
					container.getListGraphicalContainer().add(table);
					int deep = visitTable(range);
					setBoundsGraphicalContainer(table, 15, 15, columns.size()*100 , (deep-range.getFirstRow())*20);
					
					tooldataform.formmodel.concreta.Containment c = ConcretaFactory.eINSTANCE.createContainment();
					setAtributesContaimentRelation(c,"");
					
					//Se agrega el source y target de la relacion
					c.getSource().add(container);
					c.getTarget().add(table);
					
					setBoundsGraphicalContainer(container, 15, 15 ,  table.getWidth() + 40 , table.getHeight() + 40);
					break;
				}
			}
		}
		
		int x  = container.getListGraphicalContainer().get(0).getWidth();
		int y  = container.getListGraphicalContainer().get(0).getPositionY();
		
		x+= 15; y+= 15;
		
	
		for(int i = 1  ;i < container.getListGraphicalContainer().size();i++){
			x+=40;
			container.getListGraphicalContainer().get(i).setPositionX(x);
			x+= container.getListGraphicalContainer().get(i).getWidth();
			y = Math.max(y,  container.getListGraphicalContainer().get(i).getHeight());
		}
		
		x+=15;
		
		if(container.getListGraphicalContainer().size()>1)
			setBoundsGraphicalContainer(container, 15, 15, x, y);
		
		return container;
	}
	
	public int visitTable(MergedRegion region){
		
		int fila=  region.getFirstRow();
		Row r = sheet.getRow(fila);
		
		int columa = region.getFirstColumn();
		Cell c;
		while(r!=null){
			c = r.getCell(columa);
			if(c==null)
				break;
			
			for(int i=columa;i<= region.getLastColumn();i++){
				visit[fila][i] = nContainers;
			}
			r = sheet.getRow(++fila);
		}
		return fila;
	}
	public ArrayList<String> getTableColumns(MergedRegion region, int nextRow) {
		
		ArrayList<String> columns = new ArrayList<String>();
		String column;
		
		int i = region.getFirstColumn();
		while (i <= region.getLastColumn()) {
			
			column = sheet.getRow(nextRow).getCell(i).getStringCellValue();
			columns.add(column);
			
			if(isCellRange(nextRow, i)) {
				
				for(int j=0; j<mergedRegions[nextRow].size(); j++){
					
					MergedRegion nextMergeRegion = mergedRegions[nextRow].get(j);
					
					if(nextMergeRegion.getFirstColumn()==i){
						
						if(nextMergeRegion.getFirstColumn() == nextMergeRegion.getLastColumn()) {
							
							i++;
							break;
						}	
						
						i += nextMergeRegion.getLastColumn() - i + 1;
						break;
					}
				}
				
			} else {
				
				i++;
			}
		}
		
		return columns;
	}
	
	public TableView createTable(MergedRegion region, ArrayList<String> columns){
		
		//Se crea  la instancia de la tabla
		TableView table = ConcretaFactory.eINSTANCE.createTableView();
		table.setName(region.getText());
		
		//Se agregan las colummnas a la tabla
		for(int j=0;j<columns.size();j++){
			ColumView c= ConcretaFactory.eINSTANCE.createColumView();
			c.setName(columns.get(j));
			table.getListColumView().add(c);
		}
		
		return table;
	}
	
	public boolean isTableColumn(MergedRegion mergeRegion) {
		
		int firstRow = mergeRegion.getFirstRow(), lastRow = mergeRegion.getLastRow();
		int firstColumn = mergeRegion.getFirstColumn(), lastColumn = mergeRegion.getLastColumn();
		int nextRow = firstRow + (lastRow - firstRow + 1);
	
		for(int i=0;i<mergedRegions[nextRow].size();i++){
			
			MergedRegion nextMergeRegin = mergedRegions[nextRow].get(i);
			if(nextMergeRegin.getFirstColumn()==firstColumn &&  nextMergeRegin.getLastColumn()==lastColumn){
				
				return true;
			}
		}
		
		if(firstColumn == lastColumn) return true;
		
		return false;
	}
	public boolean isTable(int i, int j){
		if(visit[i][j]>=1 && visit[i][j]<=nTables)
			return true;
		return false;
	}

	public void visitRegion(MergedRegion mergeRegion){
		
		for(int i = mergeRegion.getFirstRow(); i <= mergeRegion.getLastRow(); i++)
			for(int j = mergeRegion.getFirstColumn(); j <= mergeRegion.getLastColumn(); j++)
				visit[i][j] = nContainers;
			
	}
	
	@SuppressWarnings("unchecked")
	public void InitMergedRegions(List<CellRangeAddress> sortedRegions ){
		
		if(sortedRegions.size()==0)
			return;
		mergedRegions = new ArrayList [sortedRegions.get(sortedRegions.size()-1).getLastRow()+10]; 
		
		for(int i =0 ; i< mergedRegions.length;i++){
			mergedRegions[i] = new ArrayList<MergedRegion>();
		}
		
		for(int i=0;i< sortedRegions.size();i++){
			CellRangeAddress range = sortedRegions.get(i);
			
			//TODO No se si la variable i represente la ROW de la MergeRegion
			String text = sheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()).getStringCellValue();
			mergedRegions[range.getFirstRow()].add(new MergedRegion(text, range.getFirstColumn(), range.getLastColumn(), 
					range.getFirstRow(), range.getLastRow()));
		}	
	}
	
	public boolean isCellRange(int i, int l){
		
		if(mergedRegions[i].size()!=0){
			for(int j=0;j<mergedRegions[i].size();j++){
				if(mergedRegions[i].get(j).getFirstColumn()<= l && mergedRegions[i].get(j).getLastColumn() >= l )
					return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo que srive para extraer la dimension del excel
	 * la dimension esta denotada como la maxima cantidad
	 * de filas y columnas que se utilizan para crear el 
	 * formulario
	 * @return un string en formato: CeldaIncial:CeldaFinal 
	 *          ejemplo : C3:09
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public String getDimention()throws ParserConfigurationException, SAXException, IOException{
		
		//Carga el xml del excel
		Document doc = getXML(path+"worksheets/sheet1.xml");
		doc.getDocumentElement().normalize();
		
		//Obtiene el tag Dimension
		NodeList nList = doc.getElementsByTagName("dimension");
		Node node = nList.item(0);
		String s="";
		if(node.getNodeType()==Node.ELEMENT_NODE){
			Element e = (Element)node;
			s = e.getAttribute("ref");
		}
		return s;
	}
	
	/**
	 * Este metodo explora el xml del excel y se encarga de obtener
	 * el numero total de tablas que se encuentran en el
	 * @return el numero de tablas marcadas en el excel
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public  int getNumberTables() throws ParserConfigurationException, SAXException, IOException{		
		
		//Carga el xml del excel
		Document doc = getXML(path+"worksheets/sheet1.xml");
		doc.getDocumentElement().normalize();	
		
		//Obtiene el tag que contiene la lista de tablas
		NodeList nList = doc.getElementsByTagName("tablePart");
		
		return nList.getLength();
	}
	
	/**
	 * Este metodo se encarga de explorar el xml del excel
	 * y se encarga de extraer las propiedades de cada tabla
	 * que se encuentran en el y agregar las tablas a la 
	 * producci�n del datafrom
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public void getTables() throws ParserConfigurationException, SAXException, IOException{
		
		//Obtiene el numero de tablas a agregar al dataform
		int n = getNumberTables();
		nContainers = n+1;
		nTables =n;
		//Documento xml del excel
		Document doc;
		for(int i=1;i<=n;i++){
			
			//Se crea el container que contendr� la tabla
			Container containerTablas = ConcretaFactory.eINSTANCE.createContainer();
			containerTablas.setName("Table"+i);
			
			//Se lee el archivo xml relacionado con la tabla a analizar
			doc = getXML(path +"tables/table"+i+".xml");
			
			//Se obtiene la dimension de la tabla
			String s="";
			NodeList es = doc.getElementsByTagName("autoFilter");
			Node node = es.item(0);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element e = (Element)node;
				s = e.getAttribute("ref");
				listTables.add(s);
			}
			
			//Se extrae la dimencion de la tabla
			String inicio = s.split(":")[0];
			String fin = 	s.split(":")[1];
			
		
			//Se obtienen las coordenandas y el size de la tabla
			Coordinate coordinates= getCoordinates(inicio);
			Coordinate size = getSizes(inicio, fin);
			coordenadasInicioContenedores.add(coordinates);
			coordenadasFinContenedores.add( getCoordinates(fin));
			
			//Se obtienen las columnas
			NodeList nList = doc.getElementsByTagName("tableColumn");
			ArrayList<String> columnas = new ArrayList<String>();			
			for (int j = 0; j < nList.getLength(); j++) {
				Node nNode = nList.item(j);
				if(nNode.getNodeType()==Node.ELEMENT_NODE){
					Element e = (Element)nNode;
					columnas.add(e.getAttribute("name"));
				}
			}
			
			//Se crea  la instancia de la tabla
			TableView tb = ConcretaFactory.eINSTANCE.createTableView();
			tb.setName("Table"+i);
			
			//Se agregan las colummnas a la tabla
			for(int j=0;j<columnas.size();j++){
				ColumView c= ConcretaFactory.eINSTANCE.createColumView();
				c.setName(columnas.get(j));
				tb.getListColumView().add(c);
			}
			
			//Se setean las dimensiones y posicion de la tabla
			setBoundsGraphicalContainer(tb, 15, 15, size.getX()+10, size.getY());
			
			//Se setean las dimensiones y posicion del contenedor
			setBoundsGraphicalContainer(containerTablas,coordinates.getX() - nx , coordinates.getY() - ny ,size.getX() + 40, size.getY() + 40);
			
			//Se agrega la tabla al contenedor
			containerTablas.getListGraphicalContainer().add(tb);
			
			//Se crea la relacion de contaiment para que la tabla se pueda visualizar
			tooldataform.formmodel.concreta.Containment c = ConcretaFactory.eINSTANCE.createContainment();
			setAtributesContaimentRelation(c,"" + i);
			
			//Se agrega el source y target de la relacion
			c.getSource().add(containerTablas);
			c.getTarget().add(tb);
			
			//Se agrega la relacion  al diagrama
			dataformDiagram.getListarelacion().add(c);
			
			tablas.add(containerTablas);
			//Se agrega el contendor a la interfaz 
			container.getListGraphicalContainer().add(containerTablas);
		}	
	}
	
	/**
	 * Metodo que se encarga de guardar en el archivo la produccion realizada
	 * cuando se analiza el excel
	 */
	public void salvarDF(){
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/GestionConsultas/domain/model.tooldataform");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactory);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Metodo que se encarga de cargar un documento xml
	 * dado a travez de una url y cargarlo en un objeto 
	 * de tipo documento
	 * @param url ruta donde se encuentra el xml a cargar
	 * @return un objeto de tipo documento con todas las propiedades del xml cargado
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public Document getXML(String url)throws ParserConfigurationException, SAXException, IOException{
		File fXmlFile = new File(url);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		return doc;
	}
	
	/**
	 * Metsodo que se encarga de marcar las celdas de las  tablas obtenidas en el metodo getTables
	 * para cuando se obtenga las demas informacion, estas celdas no sean analizadas
	 * @param sizes coleccion de strings que contienen las dimencions de las tablas
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 */
	public void MarcarTablas(ArrayList<String> sizes) throws IOException, EncryptedDocumentException, InvalidFormatException{
       
        for(int i=0;i<sizes.size();i++){
        	//Se obtiene la dimension de la tabla que viene en formato "CeldaInicio:CeldaFinal" ejemplo: C1:P44
        	String inicio = sizes.get(i).split(":")[0], fin =  sizes.get(i).split(":")[1];
        	
        	//Se recorre las filas de la dimension
        	for(int  j = Integer.parseInt(capturarNumeros(inicio))-1 ; j <Integer.parseInt(capturarNumeros(fin)) ;j++){
        		
        		//Se obtiene la columna inicial y final
        		int wf= toInt(stractColumn(fin))-1;
        		int wi = toInt(stractColumn(inicio))-1;
        		
        		//Se recorre las columnas de la dimension
        		for(int k = wi; k <=wf;k++ ){
        			visit[j][k] = i+1;
        		}
        	}
        }
	}
	
	
	/**
	 * Metodo que sirve para reorganizar las posiciones X y Y de los contenedores de las tablas
	 * leyendo el archivo de visitados y contando cuantos contenedores tiene por encima y por debajo
	 * @param sheetV Hoja de visitados que contiene la informacionde los contenedores
	 */
	public void reOrganizarTablas(){
		
		for(int i=0;i<coordenadasInicioContenedores.size();i++){
			
			int x = coordenadasInicioContenedores.get(i).getX();
			int y = coordenadasInicioContenedores.get(i).getY();
			
			int h = getAmountContainersH(y);
			int v = getAmountContainersV(x);
			
			int c = calculateV(x);
			int b = calculateH(y);
			
			int contenedor = visit[x][y] -1;
			
			int xs= h*100 + 40;
			
			if(h>0)
			 xs+=(b) +  ( (y-h-ny)*40);
			
			int ys = (v*20)+ 25;
			
			int s  = (x-v-nx);
			
			if(v>0)
			 ys+= c + (s* 15);
			
			container.getListGraphicalContainer().get(contenedor).setPositionX(xs);
			container.getListGraphicalContainer().get(contenedor).setPositionY(ys);
		}
	}
	
	/**
	 * Extrae la posicion maxima de valores no nulos en el excel
	 * @param a lista a analizar
	 * @return la fila maxima encontrada
	 */
	public int getMaxX(ArrayList<Coordinate> a){		
		int max = -1;
		for(int i=0;i<a.size();i++){
			if(a.get(i).getX() > max){
				max = a.get(i).getY();
			}
		}
		return max;
	}
	
	/**
	 * Metodo que indica cuando una posicion es valida para el BFS
	 * @param i fila i 
	 * @param j columna j
	 * @return Verdadero si se encuentra en el rango especificado 
	 * 		   Falso si no cumple
	 */
	public  boolean isValid(int i, int j) {
		if(i >= 0 && i < visit.length  && j >= 0 && j < visit[0].length)
			return true;
		return false;
	}
	
	/**
	 * Algorithmo que sirve para explorar una serie de celdas
	 * NO NULAS en el excel original a partir de un punto dado
	 * Para mas informacion Consultar el funcionamiento del 
	 * ALGORITMO BFS en internet
	 * @param i fila inicial en donde se empieza a explorar
	 * @param j columna inicila en donde se empieza a explorar
	 * @param sheetL Hoja del libro original
	 * @param sheetV Hoja del libro de visitados
	 * @return una lista de coordenadas con las celdas que se visitaron en la exploracion
	 */
	public ArrayList<Coordinate> bfs(int i, int j) {	
		
		//Se extrae la fila y columna inicial
		Row r = sheet.getRow(i);
		Cell c = r.getCell(j);
		
		//Arreglo que contiene las celdas visitadas en la exploracion
		ArrayList<Coordinate> res = new ArrayList<Coordinate>();
 		
		//Se prepara la fila y columna en el excel de visitados
		visit[i][j] = nContainers;
	
		
		//Agregamos la posicion inicial al arreglo de celdas a retornar
		res.add(new Coordinate(i, j));
		
		//Cola que contendran las celdas a analizar
		Queue<Cell> q =   new LinkedList<Cell>();
		q.add(c);
		
		/*
		 *Mientras que haya celdas a analizar
		 *Se analizaran sus adyacencias para 
		 *encontrar mas celdas No nulas
		 */
		while (!q.isEmpty()) {	
			Cell u = q.peek();
			q.poll();
			
			//Se observan las adyacencias de esta celda
			//Las adyancencias de una celda son
			//Arriba, Abajo, Izquierda y Derecha
			
			for(int k = 0; k < 4; k++) {
				
				//Se obtiene la posible adyacencia en x y en y
				int vx = u.getRowIndex()    + xs[k];
				int vy = u.getColumnIndex() + ys[k];
				
				//Se verifica si es  una adyacencia valida
				if(isValid(vx, vy)){
					
					//Si la fila no esta creada en el original
					//No se analiza
					r = sheet.getRow(vx);
					if(r==null) continue;
					c = r.getCell(vy);
					
					//Si la celda no esta creada o esta vacia NO se analiza
					if (c !=null && c.getCellType()!=Cell.CELL_TYPE_BLANK ) {
						
						//Se marca en el excel de visitados esta celda 
						//Como analizada para no analizarla mas
						if(visit[vx][vy] == 0){
							visit[vx][vy] = nContainers;
							//Se agrega a lista la celda (vx,vy) como celda
							//No NULA y NO VACIA
							res.add(new Coordinate(vx, vy));
							q.add(c);
						}
					}						
				}
			}
		}
		nContainers++;
		return res;
	}

	/**
	 * Este metodo se encarga de recorrer la hoja del excel original
	 * Con el fin de buscar informacion adicional para la construccion 
	 * del dataform, en este metodo se identifican nuevos contendores
	 * y labels que sirven de informacion  de contexto para el reporte
	 * @param libro Libro de excel el cual se quiere capturar el modelo mental
	 * @param visit Libro de excel que contiene cuales celdas ya se han analizado
 	 * @throws IOException
	 */
	public void recorrerHoja() throws IOException {
		
		//Se obtiene la ultima fila a anlizar
		int nmax = sheet.getLastRowNum()+1;
		
 		for (int i = 0; i <nmax; i++) {
        	
 			//Si la fila no esta creada en el libro orignial, no se analiza y se continua
 			Row r =  sheet.getRow(i);
        	if(r==null) continue;
        	
        	//Se recorre la fila hasta la ultima columna NO NULA
        	for (int j = 0; j <r.getLastCellNum(); j++) {
	    		
        		//Se obtienen las celdas del original y el visitado en la posicion J
        		Cell c = r.getCell(j);
        		
        		//Si la celda es nula en el original no se analiza y se continua
	            if(c != null && visit[i][j] == 0) { 
	            	
	            	//Si la celda esta vacia no se analiza y se continua 
	            	if(c.getCellType()==Cell.CELL_TYPE_BLANK)
	            		continue;
	            	
	            	Container containerTablas = createContainer(i, j);
	            	
	         		container.getListGraphicalContainer().add(containerTablas);
	            }
	        }
	    }
 		
 		//Se reorganizan las tablas
 		reOrganizarTablas();
	}
	
	
	public Container createContainer(int i, int j){
		
		//Se crea la instancia del contendor a agregar
        Container containerTablas = ConcretaFactory.eINSTANCE.createContainer();
	    containerTablas.setName("Container"+ (nContainers));
	    
		//Se ejecuta el BFS con el fin de buscar 
    	//Mas celdas no nulas 
    	//Para almacenarlas en un mismo contendor
    	ArrayList<Coordinate> res = bfs( i, j);
    	
    	//Se ordenan las celdas encontradas
    	Collections.sort(res);
    	
    	
    	int m = res.size(); 	
    	coordenadasInicioContenedores.add(res.get(0));
    	coordenadasFinContenedores.add(res.get(m-1));
    	
    	//Se extraen las dimenciones del contenedor que contendra a las celdas encontradas
    	String key =res.get(0).getX() +"-"+ res.get(0).getY() +":" + res.get(m-1).getX() +"-" + res.get(m-1).getY();
    	    
    	//Se delimita el inicio y el final del conentendor
    	String inicio = key.split(":")[0]; String fin  = key.split(":")[1];
    		
 		Coordinate size = getSizes2(inicio, fin);
 			
		//Se setean los bounds al contenedor se deja en la posicion 0 0
		setBoundsGraphicalContainer(containerTablas,0 , 0,  size.getX() + 20, size.getY() + 40);
			
		//Posiciones relativas para el contenido del contenedor
 		Coordinate relativo = getCoordinates2(res.get(0).getX() +"-" +res.get(0).getY());
 		int relativex = relativo.getX();
 		int relativey = relativo.getY();
 			
 		for(int k=0;k<m;k++){
 			
 			//Se obtiene el X y el Y del componente 
 			int x = res.get(k).getX();    int y = res.get(k).getY();
 				
 			//Se obtiene su valor
 			Row rr = sheet.getRow(x);  Cell  cc = rr.getCell(y);
 			String e = getCellValue(cc);
 				
 			//Se Obtienen las coordenadas NO Relativas al contenedor
 			Coordinate cor = getCoordinates2(x+"-"+y);
 				
 			//Se crea la instancia del label
 			LabelView label = ConcretaFactory.eINSTANCE.createLabelView();
 			label.setName(e);
 				
 			//Se setean los bounds
 			label.setId("label"+ (char)(k+64));
 			label.setWidth(new Integer(-1));
    		label.setHeight(new Integer(-1));
    		label.setPositionX(new Integer(cor.getX() - relativex + 20 ));
    		label.setPositionY(new Integer(cor.getY() - relativey + 10));
 				
    		//Se agrega al contenedor
    		containerTablas.getListIndividualElementDataForm().add(label);
 		}
 		return containerTablas;
	}
		
	/**
	 * Este metodo sirve para contar cuantos
	 * Contenedores existen hasta la posicion i
	 * verticalmente, es decir, los contenedores
	 * que estan por encima de este contenedor
	 * @param i numero de fila donde se encuentra el contenedor
	 * @param j numero de columna donde se encuentra el contenedor
	 * @param finY final del arhivo en columnas
	 * @param sheetV hoja de visitados para verificar los contendores
	 * @return la cantidad de conta iner que hay por encima del contenedor 
	 * 		   que se encuentra en la posicion (i, j) del excel
	 */
	public int getAmountContainersV(int y){
		int res=0;
		for(int i=y-1;i>=0;i--)
			for(int j =0;j<visit[0].length;j++)
				if(visit[i][j]!=0){
					res++;
					break;
				}
		return res;
	}
	
	public int calculateV(int y){
		int res=0;
		for(int i=y-1;i>=0;i--)
			for(int j =0;j<visit[0].length;j++)
				if(visit[i][j]!=0){
					if(coordenadasFinContenedores.get( visit[i][j]-1 ).x== i){
						 i = coordenadasInicioContenedores.get( visit[i][j]-1).x;
						 res+=40;
						 break;
					 }
				}
		return res;
	}
	
	public int calculateH(int x){
		int res=0;	
		for(int i =x-1;i>=0;i--)
			for(int j=0;j<visit.length;j++)
				if(visit[j][i]!=0){
					if(coordenadasFinContenedores.get( visit[j][i]-1 ).y== i){
						 i = coordenadasInicioContenedores.get( visit[j][i]-1).y;
						 res+=40;
						 break;
					 }
				}
		return res;
	}
	
	/**
	 * Este metodo sirve para contar cuantos
	 * Contenedores existen desde 0 hasta la columna j
	 * horizontalmente, es decir, los contenedores
	 * que estan a la izquierda de este contenedor
	 * @param i numero de fila donde se encuentra el contenedor
	 * @param j numero de columna donde se encuentra el contenedor
	 * @param fini final del arhivo en fi�as
	 * @param sheetV hoja de visitados para verificar los contendores
	 * @return la cantidad de containers que hay a la izquierda del contenedor 
	 * 		   que se encuentra en la posicion (i, j) del excel
	 */
	public int getAmountContainersH(int x){	
		int res=0;	
		for(int i =x-1;i>=0;i--)
			for(int j=0;j<visit.length;j++)
				if(visit[j][i]!=0){
					res++;
					break;
			    }
		return res;
	}
	
	/**
	 * Este metodo sirve para extraer los numero de una celda que venga en el formato de celdas en excel
	 * por ejemplo si la celda es la AA345 este metodo retornar� 345 en formato string
	 * @param s string que contiene la celda a la cual le queremos extraer los numeros para saber la fila
	 * @return un string con los numeros consecutivos del string por parametro
	 */
	public String capturarNumeros(String s){
		int i=0;
		for(;i<s.length();i++){
			if( s.charAt(i) >= 65 && s.charAt(i)<=90){
				continue;
			}else{
				break;
			}
		}
		return s.substring(i);
	}
	
	/**
	 * Este metodo sirve para obtener las coordenadas x,y de una celda dada del excel
	 * @param inicio variable string que viene en formato "L*N*" ejemplo de esta expresion regular: AA123
	 * @return un objeto de tipo Coordinate con las coordenadas (x,y)
	 */
	public Coordinate getCoordinates(String inicio){
		int w = toInt(stractColumn(inicio))-1;
		int h = ( Integer.parseInt(capturarNumeros(inicio))-1);
		return new Coordinate (h,w);
	}
	
	/**
	 * Este metodo sirve para calcular el tama�o en pixeles de un contenedor
	 * a traves de sus dimensiones de filas y columnas establecidas en el excel
	 * @param inicio es la celda donde empieza el contendor. (esquina izquierda superior)
	 * @param fin es la celda donde termina el contenedor. (esquina derecha inferior)
	 * @return una Coordinate con las dimensiones de ancho y largo en pixeles del contenedor
	 */
	public Coordinate getSizes(String inicio,String fin){
		int wf= toInt(stractColumn(fin))-1;
		int wi = toInt(stractColumn(inicio))-1;
		int w = ( wf - wi + 1)*100;
		int h = ( Integer.parseInt(capturarNumeros(fin)) - Integer.parseInt(capturarNumeros(inicio)) + 1)*20;  
		return new Coordinate(w,h);
	}
	
	/**
	 * Este metodo sirve para extraer la parte literaria de una celda en excel,
	 * la cual indica la poiscion de la columna columna donde se encuentra la celda
	 * @param s es un string que viene con el formato "L*N*". un ejemplo de esta expresion regular:
	 * 		 	A123 XML1234
	 * @return un string que contiene todos los literares de la celda si la celda por parametro es la
	 * 			XML1234 el metodo retornarpa XML
	 */
	public String stractColumn(String s){
		String res="";
		for(int i=0;i<s.length();i++){
			if( s.charAt(i) >= 65 && s.charAt(i)<=90){
				res+= s.charAt(i);
			}else{
				break;
			}
		}
		return res;
	}
	
	/**
	 * Este metodo realiza la misma funcion que getSizes pero con la diferencias
	 * que este recibe en diferente formato. El formato que recibe es 
	 *  "numerodefila-numerocolumna" 
	 * @param inicio establece inicio del contenedor en este formato (esquina superior izquierda)
	 * @param fin    establece el fin del contenedor en este formato(esquina inferior derecha)
	 * @return un Coordinate con las dimensiones en pixeles del contenedor encontrado
	 */
	public  Coordinate getSizes2(String inicio,String fin){
		String ws1 = inicio.split("-")[1];  String hs1 = inicio.split("-")[0];
		String ws2 = fin.split("-")[1];     String hs2 = fin.split("-")[0];
		int w = ( (Integer.parseInt(ws2))  -  (Integer.parseInt(ws1)) + 1 )*100;
		int h = ( Integer.parseInt(hs2) - Integer.parseInt((hs1)) + 1)*20 ;  
		return new Coordinate(w, h);
	}
	
	/**
	 * Este metodo realiza la misma fuincion que getCoordinate pero se diferencia en que
	 * este metodo recibe en diferente formato la celda inicial. El formato que recibe es  "numerodefila-numerocolumna"  
	 * @param inicio establece inicio del contenedor en este formato (esquina superior izquierda)
	 * @return un Coordinate con las coordenadas "x" y "y" del contenedor
	 */
	public  Coordinate getCoordinates2(String inicio){
		String ws = inicio.split("-")[1];
		String hs = inicio.split("-")[0];
		int w = Integer.parseInt(ws)*80;
		int h = Integer.parseInt(hs)*20;
		return new Coordinate(w, h);
	}
	
	/**
	 * Este metodo sirve para leer una secuencia de litares de excel
	 * y convertirlo a una varible entera, por ejemplo, el literal AA 
	 * en entero es 27
	 * @param s un string que contiene la secuencia de literales excel
	 * @return un valor entero que significa el numero de columna que indica este literal
	 */
	public int toInt(String s){
		int res =0;
		int m = s.length()-1;
		int e=0;
		for(int i=m;i>=0;i--){
			res += ( (s.charAt(i) - 64))*pow(26,e);
			e++;
		}
		return res;
	}
	
	/**
	 * Metodo de potencia implementado para evitar errores
	 * de presision ofrecidos por la libreria math.
	 * @param b base
	 * @param e exponente
	 * @return b^e
	 */
	public int pow(int b,int e){
		int res =1;	
		for(int i=0;i<e;i++){
			res*=b;
		}
		return res;
	}
	
	
	public String[] getNombresComboBox() {
		return nombresComboBox;
	}

	public void setNombresComboBox(String[] nombresComboBox) {
		this.nombresComboBox = nombresComboBox;
	}

	public int getCantidadCombos() {
		return cantidadCombos;
	}

	public void setCantidadCombos(int cantidadCombos) {
		this.cantidadCombos = cantidadCombos;
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
}

class rangeComparator implements Comparator<CellRangeAddress>{
	 @Override
	 public int compare(CellRangeAddress o1, CellRangeAddress o2) {
		 if(o1.getFirstRow() > o2.getFirstRow()){
				return 1;
		 }
		 else if ( o1.getFirstRow() == o2.getFirstRow()){
				if( o1.getFirstColumn() > o2.getFirstColumn())
					return 1;
				else if(o1.getFirstColumn() == o2.getFirstColumn())
					return 0;
		}
		return -1;
	 }
}