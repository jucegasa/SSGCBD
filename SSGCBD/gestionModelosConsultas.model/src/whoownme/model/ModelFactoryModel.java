package whoownme.model;

import gestionmodelosconsultas.GestionmodelosconsultasFactory;
import gestionmodelosconsultas.ModelFactory;

public class ModelFactoryModel {
	
	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
//------------------------------  Singleton ------------------------------------------------
	ModelFactory modelFactory = GestionmodelosconsultasFactory.eINSTANCE.createModelFactory();
	
//	---constructor SINGLETON -----
	public ModelFactoryModel() {
	
		ModelFactory tempModelFactory = modelFactory;
		modelFactory = modelFactory.cargar();
		
		if(modelFactory == null){
			
			modelFactory = tempModelFactory;
		}
	}

//	getters and setters
	public ModelFactory getModelFactory() {
		return modelFactory;
	}

	public void setModelFactory(ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}

	public void salvar(){
		modelFactory.salvar();
	}
	


	
	

}
