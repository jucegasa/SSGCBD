/**
 */
package gestionmodelosconsultas.modeloconsultas.cuando;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.cuando.CuandoPackage
 * @generated
 */
public interface CuandoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CuandoFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.cuando.impl.CuandoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fecha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fecha</em>'.
	 * @generated
	 */
	Fecha createFecha();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CuandoPackage getCuandoPackage();

} //CuandoFactory
