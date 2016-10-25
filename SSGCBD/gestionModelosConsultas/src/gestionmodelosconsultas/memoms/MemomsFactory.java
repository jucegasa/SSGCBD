/**
 */
package gestionmodelosconsultas.memoms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.memoms.MemomsPackage
 * @generated
 */
public interface MemomsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemomsFactory eINSTANCE = gestionmodelosconsultas.memoms.impl.MemomsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memo Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memo Factory</em>'.
	 * @generated
	 */
	MemoFactory createMemoFactory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MemomsPackage getMemomsPackage();

} //MemomsFactory
