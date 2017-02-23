package gestionconsultassqlmodels.generate.conexionBD;



import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;



public class DataConnection {

	/**
	 * atibutos de la clase
	 */
	private static Connection con;
	private static DataConnection INSTANCE = null;
	
	/**
	 * Constructor
	 */
	public DataConnection() {
		
	}
	
	/**
	 * datos de la conexion
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void performConnection() throws ClassNotFoundException, SQLException{
		
		String host = "10.0.67.30";
		String user = "trabajo";
		String pass = "12345";
		String dtbs = "sysinfo";
		
			Class.forName("com.mysql.jdbc.Driver");
			String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
					+ "?" + "user=" + user + "&password=" + pass;
					con = (Connection) DriverManager.getConnection(newConnectionURL);
					System.out.println("Conexi�n efectuada con �xito");
	
	}
	
	/**
	 * crear una instancia de una conexion
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private synchronized static void createInstance() throws ClassNotFoundException, SQLException {
        if (INSTANCE == null) { 
            INSTANCE = new DataConnection();
            performConnection();
        }
    }
 
    /**
     * metodo para obtener una instancia, si ya existe la retorna, sino la crea
     * @return instancia si existe
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
    public static DataConnection getInstance() throws ClassNotFoundException, SQLException {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
    
    public Connection getConnection(){
    	return con;
    }
    /**
	 * metodo para cerrar la conexi�n
	 */
	public void closeConnection() {
		try {
			con.close();
		}catch (Exception e) {
			System.out.println("Error en el cierre de conexi�n");
		}
	}
}
