/**
 */
package gestionmodelosconsultas.modeloconsultas.como;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.como.ComoPackage
 * @generated
 */
public interface ComoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComoFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.como.impl.ComoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actividad Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Proceso</em>'.
	 * @generated
	 */
	ActividadProceso createActividadProceso();

	/**
	 * Returns a new object of class '<em>Instancia Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancia Proceso</em>'.
	 * @generated
	 */
	InstanciaProceso createInstanciaProceso();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComoPackage getComoPackage();

} //ComoFactory
