package gestionmodelosconsultas.compilador;

import java.sql.SQLException;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.consulta.ConsultaGenerica;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;

public class CompiladorRealizacion {
	
	private ConsultaGenerica consultaGenerica;
	public ConsultaGenerica getConsultaGenerica() {
		return consultaGenerica;
	}
	public void setConsultaGenerica(ConsultaGenerica consultaGenerica) {
		this.consultaGenerica = consultaGenerica;
	}
	public void compilarRealizacionDiagramEntity(ModelFactory modelFactory) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
//		RealizacionDiagramEntity realizacionDiagramEntity = obtenerRealizacionDiagramEntity(modelFactory);
//		if(realizacionDiagramEntity!=null){
			
			consultaGenerica = new ConsultaGenerica();
			consultaGenerica.GenerarConsulta(modelFactory);
//		}
//		else{
//			System.out.println("No hay una Realizacion");
//		}
	}



}
