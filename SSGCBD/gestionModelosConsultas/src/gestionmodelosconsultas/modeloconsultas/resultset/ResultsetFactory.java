/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage
 * @generated
 */
public interface ResultsetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsetFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resultado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resultado</em>'.
	 * @generated
	 */
	Resultado createResultado();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResultsetPackage getResultsetPackage();

} //ResultsetFactory
