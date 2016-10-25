/**
 */
package gestionmodelosconsultas.rules.factoryrules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.ChildRule#getName <em>Name</em>}</li>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.ChildRule#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getChildRule()
 * @model abstract="true"
 * @generated
 */
public interface ChildRule extends EObject {
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
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getChildRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.rules.factoryrules.ChildRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.rules.factoryrules.Rule#getListChildRule <em>List Child Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getChildRule_Rule()
	 * @see gestionmodelosconsultas.rules.factoryrules.Rule#getListChildRule
	 * @model opposite="listChildRule"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.rules.factoryrules.ChildRule#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // ChildRule
