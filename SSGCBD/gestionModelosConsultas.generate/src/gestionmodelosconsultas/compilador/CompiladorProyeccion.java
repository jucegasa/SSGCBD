package gestionmodelosconsultas.compilador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute;
import gestionmodelosconsultas.entitymodel.EntitymodelFactory;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.TipoModelElementEntity;
import gestionmodelosconsultas.entitymodel.Value;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
import gestionmodelosconsultas.rules.factoryrules.EntityName;

public class CompiladorProyeccion {

	public void compilarProyeccion(ModelFactory modelFactory) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		ArrayList<String> entidades = new ArrayList<String>();
		ArrayList<String[]> atributosSeleccion = new ArrayList<String[]>();
		ArrayList<String[]> atributosCriterio = new ArrayList<String[]>();
		ArrayList<String> relaciones = new ArrayList<String>();
		ArrayList<String[]> elementosReglas = new ArrayList<String[]>();
		ArrayList<String[]> elementosFaltantes  = new ArrayList<String[]>();
		
		entidades = obtenerEntidades(modelFactory);
		atributosSeleccion = obtenerAtributosSeleccion(modelFactory);
		atributosCriterio = obtenerAtributosCriterios(modelFactory);
		relaciones = obtenerRelaciones(modelFactory);
		elementosReglas = obtenerElementosReglas(modelFactory);
		elementosFaltantes = obtenerElementosFaltantes(elementosReglas, relaciones, entidades);
		
		transformarProyeccionRealizacion(entidades, atributosCriterio, atributosSeleccion, relaciones, elementosFaltantes, modelFactory);
	}

	/**
	 * obtiene los elemetntos faltantes comparando las entidades y relaciones con los elementos de las reglas
	 * @param elementosReglas
	 * @param relaciones
	 * @param entidades
	 * @return
	 */
	private ArrayList<String[]> obtenerElementosFaltantes(
			ArrayList<String[]> elementosReglas, ArrayList<String> relaciones,
			ArrayList<String> entidades) {
		// TODO Auto-generated method stub
		ArrayList<String[]> elementosFaltantes = new ArrayList<String[]>();		
		for (int i = 0; i < elementosReglas.size(); i++) {
			
			for (int j = 0; j < elementosReglas.size(); j++) {
				
				if(elementosReglas.get(i)[1].equals(elementosReglas.get(j)[1])){
					
					if(i!=j){
						
						elementosReglas.remove(j);
						j--;
					}
				}
			}
		}
		
		
		int bandera = 0;
		for (String[] elementoRegla : elementosReglas) {
			bandera = 0;
			if(elementoRegla[0].equals("entidad")){
				
				for (String entidad : entidades) {
					
					if(elementoRegla[1].equals(entidad)){
						bandera =1;
					}
				}
			}
			if(elementoRegla[0].equals("relacion")){
				
				for (String relacion : relaciones) {
					
					if(elementoRegla[1].equals(relacion)){
						bandera =1;
					}
				}
			}
			
		
			if(bandera==0){
				elementosFaltantes.add(elementoRegla);
			}
			
		}
		return elementosFaltantes;
	}

	/**
	 * Se encarga de transfromar los datos de la proyeccion en una realizaci�n
	 * @param entidades
	 * @param atributosCriterio
	 * @param atributosSeleccion
	 * @param relaciones
	 * @param elementosReglas
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private void transformarProyeccionRealizacion(ArrayList<String> entidades,
			ArrayList<String[]> atributosCriterio,
			ArrayList<String[]> atributosSeleccion,
			ArrayList<String> relaciones, ArrayList<String[]> elementosReglas,
			ModelFactory modelFactory) throws ClassNotFoundException, SQLException {
		
		if (modelFactory.getFactoryModeloConsultas().getListModeloConsulta()
				.get(0).getRealizacionDiagramEntity() != null) {
			
			for (int i = 0; i < modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListElementoRealizacionDiagramEntity().size(); i++) {
				
				if(!modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().isEmpty()){
					
					for (int j = 0; j <modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().size(); j++) {
						
						modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().get(j).getValues().clear();
						modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().get(j).getValueAttribute().clear();
					}
					modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().clear();
					
				}
				modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListElementoRealizacionDiagramEntity().get(i).setModelElementEntity(null);
			}
			if(modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getRealizacionVisibleAttribute().getVisibleAttribute().size()>0){
				
				modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getRealizacionVisibleAttribute().getVisibleAttribute().clear();
			}
			if(!modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListValues().isEmpty()){
				modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().getListValues().clear();
			}
			modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getRealizacionDiagramEntity().setModeloConsulta(null);
			modelFactory.getFactoryModeloConsultas().getListModeloConsulta()
			.get(0).setRealizacionDiagramEntity(null);

		}
		
			RealizacionDiagramEntity realizacionDiagramEntity = EntitymodelFactory.eINSTANCE.createRealizacionDiagramEntity();
			//ENTIDADES
			for(String entidadTemp : entidades){
				
				for(int i=0; i<modelFactory.getDiagramEntity().getListEntity().size();i++){
					
					if(modelFactory.getDiagramEntity().getListEntity().get(i).getName().equals(entidadTemp)){
						
						ElementoRealizacionDiagramEntity elementoEntidad = EntitymodelFactory.eINSTANCE.createElementoRealizacionDiagramEntity();
						elementoEntidad.setTipo(TipoModelElementEntity.ENTITY);
						elementoEntidad.setNombreModelElementEntity(entidadTemp);
						elementoEntidad.setModelElementEntity(modelFactory.getDiagramEntity().getListEntity().get(i));
						realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().add(elementoEntidad);
						break;
					}
				}
			}
			//RELACIONES
			for(String relacionTemp : relaciones){
				
				for(int i=0; i<modelFactory.getDiagramEntity().getListEntityRelation().size();i++){
					
					if(modelFactory.getDiagramEntity().getListEntityRelation().get(i).getName().equals(relacionTemp)){
						
						ElementoRealizacionDiagramEntity elementoEntidad = EntitymodelFactory.eINSTANCE.createElementoRealizacionDiagramEntity();
						elementoEntidad.setTipo(TipoModelElementEntity.RELATION);
						elementoEntidad.setNombreModelElementEntity(relacionTemp);
						elementoEntidad.setModelElementEntity(modelFactory.getDiagramEntity().getListEntityRelation().get(i));
						realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().add(elementoEntidad);
						break;
					}
				}
			}
			//ATRIBUTOS DE SELECCION
			ElementoRealizacionVisibleAttribute visibleAttribute = EntitymodelFactory.eINSTANCE.createElementoRealizacionVisibleAttribute();
			visibleAttribute.setNombre("Seleccion");
			for(String[] atributoTemp: atributosSeleccion){
				
				for(int i=0; i<modelFactory.getDiagramEntity().getListEntity().size();i++){
					
					if(modelFactory.getDiagramEntity().getListEntity().get(i).getName().equals(atributoTemp[0])){
						
						for(int j=0; j<modelFactory.getDiagramEntity().getListEntity().get(i).getListAttributes().size();j++){
							
							if(modelFactory.getDiagramEntity().getListEntity().get(i).getListAttributes().get(j).getName().equals(atributoTemp[1])){
								
								visibleAttribute.getVisibleAttribute().add(modelFactory.getDiagramEntity().getListEntity().get(i).getListAttributes().get(j));
								break;
							}
							
						}
						
						break;
					}
				}
				
			}
			realizacionDiagramEntity.setRealizacionVisibleAttribute(visibleAttribute);
			//ENTIDADES, RELACIONES REGLAS
			for(String[] reglaTemp: elementosReglas){
				
				if(reglaTemp[0].equals("entidad")){
					
					for(int i=0; i<modelFactory.getDiagramEntity().getListEntity().size();i++){
						
						if(modelFactory.getDiagramEntity().getListEntity().get(i).getName().equals(reglaTemp[1])){
							
							ElementoRealizacionDiagramEntity elementoEntidad = EntitymodelFactory.eINSTANCE.createElementoRealizacionDiagramEntity();
							elementoEntidad.setTipo(TipoModelElementEntity.ENTITY);
							elementoEntidad.setNombreModelElementEntity(reglaTemp[1]);
							elementoEntidad.setModelElementEntity(modelFactory.getDiagramEntity().getListEntity().get(i));
							realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().add(elementoEntidad);
							break;
						}
					}
				}else{
											
						for(int i=0; i<modelFactory.getDiagramEntity().getListEntityRelation().size();i++){
							
							if(modelFactory.getDiagramEntity().getListEntityRelation().get(i).getName().equals(reglaTemp[1])){
								
								ElementoRealizacionDiagramEntity elementoEntidad = EntitymodelFactory.eINSTANCE.createElementoRealizacionDiagramEntity();
								elementoEntidad.setTipo(TipoModelElementEntity.RELATION);
								elementoEntidad.setNombreModelElementEntity(reglaTemp[1]);
								elementoEntidad.setModelElementEntity(modelFactory.getDiagramEntity().getListEntityRelation().get(i));
								realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().add(elementoEntidad);
								break;
							}
						}
					
				}
				
				
			}
			//ATRIBUTOS DE CRITERIO
			for(String[] atributoTemp: atributosCriterio){
				int bandera1 = 0;
				for (int i = 0; i < realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().size() ; i++) {
					
					if(realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getTipo().getName().equals("entity")
							&&realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getNombreModelElementEntity().equals(atributoTemp[1])){
						bandera1=1;
						if(realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().isEmpty()){
							
							ElementoRealizacionValueAttribute valueAttribute = EntitymodelFactory.eINSTANCE.createElementoRealizacionValueAttribute();
							valueAttribute.setNombre(atributoTemp[0]);
							
							for(int k=0; k<modelFactory.getDiagramEntity().getListEntity().size();k++){
								
								if(modelFactory.getDiagramEntity().getListEntity().get(k).getName().equals(atributoTemp[1])){
									
									for(int j=0; j<modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().size();j++){
										
										if(modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().get(j).getName().equals(atributoTemp[2])){
											
											valueAttribute.getValueAttribute().add(modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().get(j));
											Value value = EntitymodelFactory.eINSTANCE.createValue();
											value.setValue(atributoTemp[3]);
											realizacionDiagramEntity.getListValues().add(value);
											valueAttribute.getValues().add(value);
											realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().add(valueAttribute);
											break;
										}
										
									}
									
									break;
								}
								
							}
							
						}else{
							int band = 0;
							for (int h = 0; h < realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().size(); h++) {
								
								if(realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().get(h).getNombre().equals(atributoTemp[0])){
									band = 1;
									for(int k=0; k<modelFactory.getDiagramEntity().getListEntity().size();k++){
										
										if(modelFactory.getDiagramEntity().getListEntity().get(k).getName().equals(atributoTemp[1])){
											
											for(int j=0; j<modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().size();j++){
												
												if(modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().get(j).getName().equals(atributoTemp[2])){
													
													realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().get(h).getValueAttribute().add(modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().get(j));
													Value value = EntitymodelFactory.eINSTANCE.createValue();
													value.setValue(atributoTemp[3]);
													realizacionDiagramEntity.getListValues().add(value);
													realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().get(h).getValues().add(value);
													
													break;
												}
												
											}
											
											break;
										}
									}
									
								
								}
									
							}
							if(band==0){
								
								ElementoRealizacionValueAttribute valueAttribute = EntitymodelFactory.eINSTANCE.createElementoRealizacionValueAttribute();
								valueAttribute.setNombre(atributoTemp[0]);
								
								for(int k=0; k<modelFactory.getDiagramEntity().getListEntity().size();k++){
									
									if(modelFactory.getDiagramEntity().getListEntity().get(k).getName().equals(atributoTemp[1])){
										
										for(int j=0; j<modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().size();j++){
											
											if(modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().get(j).getName().equals(atributoTemp[2])){
												
												valueAttribute.getValueAttribute().add(modelFactory.getDiagramEntity().getListEntity().get(k).getListAttributes().get(j));
												Value value = EntitymodelFactory.eINSTANCE.createValue();
												value.setValue(atributoTemp[3]);
												realizacionDiagramEntity.getListValues().add(value);
												valueAttribute.getValues().add(value);
												realizacionDiagramEntity.getListElementoRealizacionDiagramEntity().get(i).getListElementoRealizacionAttribute().add(valueAttribute);
												
												break;
											}
											
										}
										
										break;
									}
								}
							}
							
							
							
						}
					}
					if(bandera1==1){
						break;
					}
				}
				
				
				
			}
			
			
			modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).setRealizacionDiagramEntity(realizacionDiagramEntity);
		
		
		modelFactory.salvar();
		CompiladorRealizacion compiladorRealizacion = new CompiladorRealizacion();
		compiladorRealizacion.compilarRealizacionDiagramEntity(modelFactory);
		this.compiladorRealizacion = compiladorRealizacion;
	}
	
	private CompiladorRealizacion compiladorRealizacion;
	
	public CompiladorRealizacion getCompiladorRealizacion() {
		return compiladorRealizacion;
	}

	public void setCompiladorRealizacion(CompiladorRealizacion compiladorRealizacion) {
		this.compiladorRealizacion = compiladorRealizacion;
	}

	/**
	 * Obtiene los elementos de la regla
	 * @param modelFactory
	 * @return
	 */
	private ArrayList<String[]> obtenerElementosReglas(ModelFactory modelFactory) {
		// TODO Auto-generated method stub
		ArrayList<String[]> elementosReglas = new ArrayList<String[]>();

		for(int i=0; i<modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){
			
			if(modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) instanceof Proyeccion){
				
				elementosReglas = obtenerElementosReglas(modelFactory, (Proyeccion) modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i));
				break;
			}
		}
		return elementosReglas;
	}

	/**
	 * Obtiene los elementos que pertenecen a las reglas
	 * @param modelFactory
	 * @param proyeccion
	 * @return
	 */
	private ArrayList<String[]> obtenerElementosReglas(
			ModelFactory modelFactory, Proyeccion proyeccion) {
		// TODO Auto-generated method stub
		
		ArrayList<String[]> sourceTarget = new ArrayList<String[]>();
		ArrayList<String[]> elementosRules = new ArrayList<String[]>();
		for(int i=0; i<proyeccion.getListRelacion().size();i++){
			
			String[] sourceTargetArray = new String[2];
			
			sourceTargetArray[0] = proyeccion.getListRelacion().get(i).getSource().getClass().getSimpleName().toLowerCase().substring(0, proyeccion.getListRelacion().get(i).getSource().getClass().getSimpleName().length()-4);
			sourceTargetArray[1] = proyeccion.getListRelacion().get(i).getTarget().getClass().getSimpleName().toLowerCase().substring(0, proyeccion.getListRelacion().get(i).getTarget().getClass().getSimpleName().length()-4);
			
			sourceTarget.add(sourceTargetArray);
		}
	
		
		for(int i=0;i<modelFactory.getRulesFactory().getListRuleDiagramEntity().size();i++){
				
			for(int j=0; j<sourceTarget.size();j++){
			
				
				if(modelFactory.getRulesFactory().getListRuleDiagramEntity().get(i).getName().equals(sourceTarget.get(j)[0]+"_"+sourceTarget.get(j)[1])
						||modelFactory.getRulesFactory().getListRuleDiagramEntity().get(i).getName().equals(sourceTarget.get(j)[1]+"_"+sourceTarget.get(j)[0])){
					
					
					for(int k=0; k<modelFactory.getRulesFactory().getListRuleDiagramEntity().get(i).getListChildRule().size();k++){
						
						if(modelFactory.getRulesFactory().getListRuleDiagramEntity().get(i).getListChildRule().get(k) instanceof EntityName){
							
							String[] entity = new String[2];
							entity[0] = "entidad";
							entity[1] = modelFactory.getRulesFactory().getListRuleDiagramEntity().get(i).getListChildRule().get(k).getName();
							elementosRules.add(entity);
						}else{
							String[] relation = new String[2];
							relation[0] = "relacion";
							relation[1] = modelFactory.getRulesFactory().getListRuleDiagramEntity().get(i).getListChildRule().get(k).getName();
							elementosRules.add(relation);
						}
					}
					break;	
				}
			}
		}
		
		return elementosRules;
	}

	/**
	 * Se obtienen las relaciones de la seleccion
	 * @param modelFactory
	 * @return
	 */
	private ArrayList<String> obtenerRelaciones(ModelFactory modelFactory) {
		// TODO Auto-generated method stub
		ArrayList<String> relaciones = new ArrayList<String>();

		for(int i=0; i<modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){
			
			if(modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) instanceof Proyeccion){
				
				relaciones = obtenerSeleccionEnProyeccion(modelFactory, (Proyeccion) modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i));
				break;
			}
		}
		return relaciones;
	}

	/**
	 * Obtener los datos de la seleccion de la E-R
	 * @param modelFactory
	 * @param proyeccion
	 * @return
	 */
	private ArrayList<String> obtenerSeleccionEnProyeccion(
			ModelFactory modelFactory, Proyeccion proyeccion) {
		// TODO Auto-generated method stub
		ArrayList<String[]> sourceTarget = new ArrayList<String[]>();
		ArrayList<String> relaciones = new ArrayList<String>();
		for(int i=0; i<proyeccion.getListRelacion().size();i++){
			int band = 0;
			String[] sourceTargetArray = new String[2];
			sourceTargetArray[0] = proyeccion.getListRelacion().get(i).getSource().getClass().getSimpleName().toLowerCase().substring(0, proyeccion.getListRelacion().get(i).getSource().getClass().getSimpleName().length()-4);
			sourceTargetArray[1] = proyeccion.getListRelacion().get(i).getTarget().getClass().getSimpleName().toLowerCase().substring(0, proyeccion.getListRelacion().get(i).getTarget().getClass().getSimpleName().length()-4);
			
			for (int j = 0; j < sourceTarget.size(); j++) {
				
				if((sourceTargetArray[0]+"_"+sourceTargetArray[1]).equals(sourceTarget.get(j)[0]+"_"+sourceTarget.get(j)[1])
						||(sourceTargetArray[0]+"_"+sourceTargetArray[1]).equals(sourceTarget.get(j)[1]+"_"+sourceTarget.get(j)[0])){
					band = 1;
				}
			}
			if(band ==0){
				
				sourceTarget.add(sourceTargetArray);
			}
		}
		
		for(int j=0; j<sourceTarget.size();j++){
			
			for(int i=0;i<modelFactory.getDiagramEntity().getListEntityRelation().size();i++){
			
				
				if(modelFactory.getDiagramEntity().getListEntityRelation().get(i).getName().equals(sourceTarget.get(j)[0]+"_"+sourceTarget.get(j)[1])
						||modelFactory.getDiagramEntity().getListEntityRelation().get(i).getName().equals(sourceTarget.get(j)[1]+"_"+sourceTarget.get(j)[0])){
					
					relaciones.add(modelFactory.getDiagramEntity().getListEntityRelation().get(i).getName());
					
				}
			}
		}
		
		return relaciones;
	}

	/**
	 * Obtiene los criterios de la seleccion
	 * @param modelFactory
	 * @return
	 */
	private ArrayList<String[]> obtenerAtributosCriterios(
			ModelFactory modelFactory) {
		// TODO Auto-generated method stub
		ArrayList<String[]> atributos = new ArrayList<String[]>();
		
		for(int i=0; i<modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){
			
			if(modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) instanceof Proyeccion){
				
				atributos = obtenerAtributosCriteriosEnProyeccion(modelFactory, (Proyeccion) modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i));
				break;
			}
		}
		return atributos;
	}

	/**
	 * Obtiene los criterios de los elementos de la proyeccion
	 * @param modelFactory
	 * @param proyeccion
	 * @return
	 */
	private ArrayList<String[]> obtenerAtributosCriteriosEnProyeccion(
			ModelFactory modelFactory, Proyeccion proyeccion) {
		// TODO Auto-generated method stub
		ArrayList<String[]> atributosCriterios = new ArrayList<String[]>();
		
		for(int i=0; i<proyeccion.getListElementoConsulta().size();i++){
			
			String nameElement=proyeccion.getListElementoConsulta().get(i).getClass().getSimpleName().toLowerCase().substring(0, proyeccion.getListElementoConsulta().get(i).getClass().getSimpleName().length()-4);
			for(int j=0; j<modelFactory.getDiagramEntity().getListEntity().size();j++){
				
				if(nameElement.equals(modelFactory.getDiagramEntity().getListEntity().get(j).getName())){
					
					for(int k=0; k<proyeccion.getListElementoConsulta().get(i).getListCampos().size();k++){
						
						if(proyeccion.getListElementoConsulta().get(i).getListCampos().get(k).getCriterio()!=null
								&&proyeccion.getListElementoConsulta().get(i).getListCampos().get(k).getCriterio().length()>0){
							String[] atributo = {Integer.toString(i),nameElement,proyeccion.getListElementoConsulta().get(i).getListCampos().get(k).getNombreCampo().getName(), proyeccion.getListElementoConsulta().get(i).getListCampos().get(k).getCriterio()};
							atributosCriterios.add(atributo);
							
						}
						
					}
					break;
				}
				
			}
		}
		
		
		return atributosCriterios;
	}

	/**
	 * Obtiene los atributos que van en la seleccion
	 * @param modelFactory
	 * @return
	 */
	private ArrayList<String[]> obtenerAtributosSeleccion(
			ModelFactory modelFactory) {
		// TODO Auto-generated method stub
		ArrayList<String[]> atributos = new ArrayList<String[]>();
		
		for(int i=0; i<modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){
			
			if(modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) instanceof Proyeccion){
				
				atributos = obtenerAtributosEnProyeccion(modelFactory, (Proyeccion) modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i));
				break;
			}
		}
		return atributos;
	}

	/**
	 * Obitene los atributos de la proyeccion
	 * @param modelFactory
	 * @param proyeccion
	 * @return
	 */
	private ArrayList<String[]> obtenerAtributosEnProyeccion(
			ModelFactory modelFactory, Proyeccion proyeccion) {
		// TODO Auto-generated method stub
		ArrayList<String[]> atributosSeleccion = new ArrayList<String[]>();
				
		for(int i=0; i<proyeccion.getListElementoConsulta().size();i++){
		
			
			String nameElement=proyeccion.getListElementoConsulta().get(i).getClass().getSimpleName().toLowerCase().substring(0, proyeccion.getListElementoConsulta().get(i).getClass().getSimpleName().length()-4);
			for(int j=0; j<modelFactory.getDiagramEntity().getListEntity().size();j++){
				
				if(nameElement.equals(modelFactory.getDiagramEntity().getListEntity().get(j).getName())){
					
					for(int k=0; k<proyeccion.getListElementoConsulta().get(i).getListCampos().size();k++){
						
						//if(proyeccion.getListElementoConsulta().get(i).getListCampos().get(k).isSeleccion()){
							String[] atributo = {nameElement,proyeccion.getListElementoConsulta().get(i).getListCampos().get(k).getNombreCampo().getName()};
							atributosSeleccion.add(atributo);
							
						//}
						
					}
					break;
				}
				
			}
		}
		
		
		return atributosSeleccion;
	}

	/**
	 * Obtiene las Entidades que representan los elementos de la consulta
	 * @param modelFactory
	 * @return
	 */
	public ArrayList<String> obtenerEntidades(ModelFactory modelFactory) {
		// TODO Auto-generated method stub
		ArrayList<String> entidades = new ArrayList<String>();
		
		for(int i=0; i<modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){
			
			if(modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) instanceof Proyeccion){
				
				entidades = obtenerEntidadesEnProyeccion(modelFactory, (Proyeccion) modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i));
				break;
			}
		}
		return entidades;
	}

	/**
	 * Se comparan los elementos de la proyeccion con los elementos de las entidades
	 * @param modelFactory
	 * @param proyeccion
	 * @return
	 */
	private ArrayList<String> obtenerEntidadesEnProyeccion(
			ModelFactory modelFactory, Proyeccion proyeccion) {
		// TODO Auto-generated method stub
		ArrayList<String> entidadesDiagram = new ArrayList<String>();
		ArrayList<String> elementosConsulta = new ArrayList<String>();
		ArrayList<String> entidades = new ArrayList<String>();
		
		
		for(int i=0; i<proyeccion.getListElementoConsulta().size();i++){
			
			elementosConsulta.add(proyeccion.getListElementoConsulta().get(i).getClass().getSimpleName().toLowerCase().substring(0, proyeccion.getListElementoConsulta().get(i).getClass().getSimpleName().length()-4));
		}
		
		for(int i=0; i<modelFactory.getDiagramEntity().getListEntity().size();i++){
			
			entidadesDiagram.add(modelFactory.getDiagramEntity().getListEntity().get(i).getName());
		}
		
		for(String entidadTemp : entidadesDiagram){
			
			for(String elementoTemp: elementosConsulta){
				
				if(elementoTemp.equals(entidadTemp)){
					entidades.add(entidadTemp);
					break;
				}
			}
		}	
		return entidades;
	}	
}
