package gestionmodelosconsultas.consulta;

import java.sql.SQLException;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;

public class ConsultaGenerica {
	
	private ConsultaMySql consultaMySql;
	public ConsultaMySql getConsultaMySql() {
		return consultaMySql;
	}
	public void setConsultaMySql(ConsultaMySql consultaMySql) {
		this.consultaMySql = consultaMySql;
	}
	/**
	 * Genera la consulta, se espera generar consultas en diferentes lenguajes de consulta
	 * InicialMente Mysql
	 * @param realizacionDiagramEntity
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void GenerarConsulta(
			ModelFactory modelFactory) throws ClassNotFoundException, SQLException {
		
		consultaMySql = new ConsultaMySql();
		consultaMySql.generarTextoConsulta(modelFactory);
		
	}

}
