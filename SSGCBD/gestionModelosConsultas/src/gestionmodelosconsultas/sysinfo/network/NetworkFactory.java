/**
 */
package gestionmodelosconsultas.sysinfo.network;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage
 * @generated
 */
public interface NetworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkFactory eINSTANCE = gestionmodelosconsultas.sysinfo.network.impl.NetworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Disco</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disco</em>'.
	 * @generated
	 */
	Disco createDisco();

	/**
	 * Returns a new object of class '<em>Armario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armario</em>'.
	 * @generated
	 */
	Armario createArmario();

	/**
	 * Returns a new object of class '<em>Deposito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deposito</em>'.
	 * @generated
	 */
	Deposito createDeposito();

	/**
	 * Returns a new object of class '<em>Network View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network View</em>'.
	 * @generated
	 */
	Network_View createNetwork_View();

	/**
	 * Returns a new object of class '<em>Edificio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edificio</em>'.
	 * @generated
	 */
	Edificio createEdificio();

	/**
	 * Returns a new object of class '<em>Depositos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depositos</em>'.
	 * @generated
	 */
	Depositos createDepositos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NetworkPackage getNetworkPackage();

} //NetworkFactory
