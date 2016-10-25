package gestionmodelosconsultas.consulta;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;

public class ConsultaGenerica {

	/**
	 * Genera la consulta, se espera generar consultas en diferentes lenguajes de consulta
	 * InicialMente Mysql
	 * @param realizacionDiagramEntity
	 */
	public void GenerarConsulta(
			ModelFactory modelFactory) {
		
		ConsultaMySql consultaMySql = new ConsultaMySql();
		consultaMySql.generarTextoConsulta(modelFactory);
		
	}

}
