/**
 */
package gestionmodelosconsultas.rules.factoryrules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.Rule#getName <em>Name</em>}</li>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.Rule#getRulesFactory <em>Rules Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.Rule#getListChildRule <em>List Child Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.rules.factoryrules.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory#getListRuleDiagramEntity <em>List Rule Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules Factory</em>' container reference.
	 * @see #setRulesFactory(RulesFactory)
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getRule_RulesFactory()
	 * @see gestionmodelosconsultas.rules.factoryrules.RulesFactory#getListRuleDiagramEntity
	 * @model opposite="listRuleDiagramEntity"
	 * @generated
	 */
	RulesFactory getRulesFactory();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.rules.factoryrules.Rule#getRulesFactory <em>Rules Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules Factory</em>' container reference.
	 * @see #getRulesFactory()
	 * @generated
	 */
	void setRulesFactory(RulesFactory value);

	/**
	 * Returns the value of the '<em><b>List Child Rule</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.rules.factoryrules.ChildRule}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.rules.factoryrules.ChildRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Child Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Child Rule</em>' containment reference list.
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getRule_ListChildRule()
	 * @see gestionmodelosconsultas.rules.factoryrules.ChildRule#getRule
	 * @model opposite="Rule" containment="true"
	 * @generated
	 */
	EList<ChildRule> getListChildRule();

} // Rule
