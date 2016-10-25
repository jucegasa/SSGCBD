/**
 */
package gestionmodelosconsultas.memoms.comunicacion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage
 * @generated
 */
public interface ComunicacionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComunicacionFactory eINSTANCE = gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memorando</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memorando</em>'.
	 * @generated
	 */
	Memorando createMemorando();

	/**
	 * Returns a new object of class '<em>Circular</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular</em>'.
	 * @generated
	 */
	Circular createCircular();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComunicacionPackage getComunicacionPackage();

} //ComunicacionFactory
