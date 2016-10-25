package pruebamemorandos.view.view;
import model.FactoryModel;
import org.eclipse.emf.common.util.EList;
import model.domain.*;
 import patrones.FactoryPatrones;


public class QueryModelPattern {
	    ModelFactoryModel modelFactoryModel;
	    FactoryModel factoryModel;
     FactoryPatrones factoryPatrones;

   public QueryModelPattern() {
   		modelFactoryModel = ModelFactoryModel.getInstance();
   		factoryModel = modelFactoryModel.getFactoryModel();
  		factoryPatrones = modelFactoryModel.getFactoryPatrones();  
}
   public void armarDomain(){

      }

}
