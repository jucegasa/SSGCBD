/**
 */
package gestionmodelosconsultas.modeloconsultas.que;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.que.QuePackage
 * @generated
 */
public interface QueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.que.impl.QueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Documento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documento</em>'.
	 * @generated
	 */
	Documento createDocumento();

	/**
	 * Returns a new object of class '<em>Comunicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comunicacion</em>'.
	 * @generated
	 */
	Comunicacion createComunicacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuePackage getQuePackage();

} //QueFactory
