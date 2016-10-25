/**
 */
package gestionmodelosconsultas.modeloconsultas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage
 * @generated
 */
public interface ModeloconsultasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloconsultasFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelo Consulta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelo Consulta</em>'.
	 * @generated
	 */
	ModeloConsulta createModeloConsulta();

	/**
	 * Returns a new object of class '<em>Factory Modelo Consulta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Modelo Consulta</em>'.
	 * @generated
	 */
	FactoryModeloConsulta createFactoryModeloConsulta();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeloconsultasPackage getModeloconsultasPackage();

} //ModeloconsultasFactory
