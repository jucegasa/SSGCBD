/**
 */
package gestionmodelosconsultas.sysinfo.function;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage
 * @generated
 */
public interface FunctionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionFactory eINSTANCE = gestionmodelosconsultas.sysinfo.function.impl.FunctionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function View</em>'.
	 * @generated
	 */
	Function_View createFunction_View();

	/**
	 * Returns a new object of class '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad</em>'.
	 * @generated
	 */
	Actividad createActividad();

	/**
	 * Returns a new object of class '<em>Instancia Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancia Proceso</em>'.
	 * @generated
	 */
	InstanciaProceso createInstanciaProceso();

	/**
	 * Returns a new object of class '<em>Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proceso</em>'.
	 * @generated
	 */
	Proceso createProceso();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionPackage getFunctionPackage();

} //FunctionFactory
