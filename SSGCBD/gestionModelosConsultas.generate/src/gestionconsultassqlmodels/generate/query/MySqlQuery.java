package gestionconsultassqlmodels.generate.query;

import gestionconsultassqlmodels.generate.conexionBD.DataConnection;
import gestionmodelosconsultas.ModelFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class MySqlQuery {

	private DataConnection mc;
	
	public DataConnection getMc() {
		return mc;
	}

	public  void setMc(DataConnection mc) {
		this.mc = mc;
	}

	private String consulta;
	
	/**
	 * Realiza la Consulta a la base de datos
	 * @param consulta
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public ResultSet consultarCodigo(String consulta) throws ClassNotFoundException, SQLException {
		mc = DataConnection.getInstance();
		this.consulta = consulta;
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

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

}
