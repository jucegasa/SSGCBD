/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcomo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoPackage
 * @generated
 */
public interface ResultcomoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultcomoFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instancia Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancia Proceso</em>'.
	 * @generated
	 */
	InstanciaProceso createInstanciaProceso();

	/**
	 * Returns a new object of class '<em>Actividad Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Proceso</em>'.
	 * @generated
	 */
	ActividadProceso createActividadProceso();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResultcomoPackage getResultcomoPackage();

} //ResultcomoFactory
