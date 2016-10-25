package gestionconsultassqlmodels.generate.query;

import gestionconsultassqlmodels.generate.conexionBD.DataConnection;
import gestionmodelosconsultas.ModelFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class MySqlQuery {

	private static DataConnection mc = DataConnection.getInstance();
	
	/**
	 * Realiza la Consulta a la base de datos
	 * @param consulta
	 * @return
	 */
	public ResultSet consultarCodigo(String consulta) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement ps = (PreparedStatement)mc.getConnection().prepareStatement(consulta);
			ResultSet rs = ps.executeQuery();
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

}
