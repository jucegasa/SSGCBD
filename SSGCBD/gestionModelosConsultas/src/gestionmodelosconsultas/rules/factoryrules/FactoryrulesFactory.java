/**
 */
package gestionmodelosconsultas.rules.factoryrules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage
 * @generated
 */
public interface FactoryrulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryrulesFactory eINSTANCE = gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rules Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rules Factory</em>'.
	 * @generated
	 */
	RulesFactory createRulesFactory();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Entity Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Name</em>'.
	 * @generated
	 */
	EntityName createEntityName();

	/**
	 * Returns a new object of class '<em>Relation Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Name</em>'.
	 * @generated
	 */
	RelationName createRelationName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FactoryrulesPackage getFactoryrulesPackage();

} //FactoryrulesFactory
