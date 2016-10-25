/**
 */
package gestionmodelosconsultas.modeloconsultas.donde;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.donde.DondePackage
 * @generated
 */
public interface DondeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DondeFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.donde.impl.DondeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deposito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deposito</em>'.
	 * @generated
	 */
	Deposito createDeposito();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DondePackage getDondePackage();

} //DondeFactory
