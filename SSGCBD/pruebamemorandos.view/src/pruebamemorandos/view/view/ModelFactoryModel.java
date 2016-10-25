package pruebamemorandos.view.view;
import model.*;
import pruebamemorandos.view.view.views.*;
import model.uimanager.*;
import model.domain.*;
import patrones.FactoryPatrones;


public class ModelFactoryModel {

//------------------------------  Singleton ------------------------------------------------

// Clase estatica oculta. Tan solo se instanciara el singleton una vez

   private static class SingletonHolder { 

       private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
   }

           // Método para obtener la instancia de nuestra clase

   public static ModelFactoryModel getInstance()  { 
       return SingletonHolder.eINSTANCE;
   }
   VentanaMemorandoViewPart ventanaMemorandoViewPart = null;
    public VentanaMemorandoViewPart getVentanaMemorandoViewPart(){
       return  ventanaMemorandoViewPart;
    }

    public void setVentanaMemorandoViewPart(VentanaMemorandoViewPart ventanaMemorandoViewPart) {
      this.ventanaMemorandoViewPart = ventanaMemorandoViewPart ;
    }

      FactoryModel modelFactory = ModelFactory.eINSTANCE.createFactoryModel();                 
FactoryPatrones factoryPatrones = patrones.PatronesFactory.eINSTANCE.createFactoryPatrones();  

  public ModelFactoryModel() {
      // TODO Auto-generated constructor stub
         FactoryModel tempModelFactory = modelFactory;
        modelFactory = modelFactory.cargar();
        factoryPatrones = factoryPatrones.cargar();
        if(modelFactory == null){
           modelFactory = ModelFactory.eINSTANCE.createFactoryModel();
    }
 }
    public FactoryModel getFactoryModel() {
      // TODO Auto-generated method stub
     return modelFactory;
  }
       public FactoryPatrones getFactoryPatrones() {     
          return factoryPatrones;
   }
       public void armarDomain(){
           QueryModelPattern queryModelPattern = new QueryModelPattern();
           queryModelPattern.armarDomain();
}     
    public void salvar(){
        modelFactory.salvar();
     }
     public void update (){
       FactoryModel tempModelFactory = modelFactory;
        modelFactory = modelFactory.cargar();
       if(modelFactory == null){
          modelFactory = ModelFactory.eINSTANCE.createFactoryModel();
      }
   }
}