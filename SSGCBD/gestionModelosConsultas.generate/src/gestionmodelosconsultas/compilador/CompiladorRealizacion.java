package gestionmodelosconsultas.compilador;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.consulta.ConsultaGenerica;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;

public class CompiladorRealizacion {

	public void compilarRealizacionDiagramEntity(ModelFactory modelFactory) {
		// TODO Auto-generated method stub
		
//		RealizacionDiagramEntity realizacionDiagramEntity = obtenerRealizacionDiagramEntity(modelFactory);
//		if(realizacionDiagramEntity!=null){
			
			ConsultaGenerica consultaGenerica = new ConsultaGenerica();
			consultaGenerica.GenerarConsulta(modelFactory);
//		}
//		else{
//			System.out.println("No hay una Realizacion");
//		}
	}



}
