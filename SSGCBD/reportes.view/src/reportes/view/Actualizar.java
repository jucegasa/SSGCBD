package reportes.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import gestionconsultassqlmodels.generate.conexionBD.DataConnection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Actualizar {
	
	private String fileName;
	
	private String filePath;
	
	private String stringQuery;
	
	private XSSFWorkbook workbook;
	
	private DataConnection dc;
	
	private String consulta;
	
	private ArrayList<Coordinate> posFilter;
	
	private ArrayList<String> listFilter;
	
	public Actualizar(String fileName, String filePath) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		
		this.fileName = fileName;
		this.filePath = filePath;
		dc = DataConnection.getInstance();
		workbook = readFile();
	}
	
	public XSSFWorkbook readFile() throws FileNotFoundException, IOException {
		// Se lee el archivo
		FileInputStream file = new FileInputStream(new File(filePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		return workbook;
	}
	
	public void saveExcel() throws FileNotFoundException, IOException {
		// Se escribe el archivo con las modificaciones
		FileOutputStream fileOutputStream;
		fileOutputStream = new FileOutputStream(filePath);
		workbook.write(fileOutputStream);
		fileOutputStream.close();
	}
	
	public void executeQuery() throws SQLException, FileNotFoundException, IOException{
		Connection connection = dc.getConnection();
		PreparedStatement ps = (PreparedStatement)connection.prepareStatement(stringQuery);
		ResultSet rs = ps.executeQuery();
		
		ExcelGenerator excelGenerator = new ExcelGenerator(filePath,listFilter,posFilter);
		excelGenerator.createDataSheet(rs);
		
		if(excelGenerator.getListFilter().size() != 0)
			excelGenerator.createRelations();
	}
	
	public void readSheetQuery() {
		
		// Se obtienen las sheet necesarias para el proceso
		XSSFSheet sheet = workbook.getSheet("Query");
		if (sheet != null) {
			XSSFRow row = sheet.getRow(0);
			XSSFCell cell = row.getCell(0);
			stringQuery = cell.getStringCellValue();
		}
		
		posFilter = new ArrayList<Coordinate>();
		listFilter = new ArrayList<String>();
		
		Cell c;
		Row r;
		String x,y,name;
		for(int i=1;i<sheet.getLastRowNum();i++){
			r  = sheet.getRow(i);
			
			c = r.getCell(0);
			x = c.getStringCellValue();
			
			c = r.getCell(1);
			y = c.getStringCellValue();
			
			c = r.getCell(2);
			name = c.getStringCellValue();
			
			posFilter.add(new Coordinate(Integer.parseInt(x), Integer.parseInt(y)));
			listFilter.add(name);
		}
		r = sheet.getRow(sheet.getLastRowNum());
		
		c = r.getCell(0);
		x = c.getStringCellValue();
		
		c = r.getCell(1);
		y = c.getStringCellValue();
		posFilter.add(new Coordinate(Integer.parseInt(x), Integer.parseInt(y)));
	}
	
	public void refresh() throws SQLException, FileNotFoundException, IOException {
		readSheetQuery();
		executeQuery();
	}
	

}
