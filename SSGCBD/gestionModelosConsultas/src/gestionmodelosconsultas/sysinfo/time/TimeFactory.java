/**
 */
package gestionmodelosconsultas.sysinfo.time;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.sysinfo.time.TimePackage
 * @generated
 */
public interface TimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeFactory eINSTANCE = gestionmodelosconsultas.sysinfo.time.impl.TimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time View</em>'.
	 * @generated
	 */
	Time_View createTime_View();

	/**
	 * Returns a new object of class '<em>Fecha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fecha</em>'.
	 * @generated
	 */
	Fecha createFecha();

	/**
	 * Returns a new object of class '<em>Calendario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendario</em>'.
	 * @generated
	 */
	Calendario createCalendario();

	/**
	 * Returns a new object of class '<em>Agenda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agenda</em>'.
	 * @generated
	 */
	Agenda createAgenda();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimePackage getTimePackage();

} //TimeFactory
