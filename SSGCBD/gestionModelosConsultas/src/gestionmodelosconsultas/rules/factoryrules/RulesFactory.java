/**
 */
package gestionmodelosconsultas.rules.factoryrules;

import gestionmodelosconsultas.ModelFactory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory#getListRuleDiagramEntity <em>List Rule Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getRulesFactory()
 * @model
 * @generated
 */
public interface RulesFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.ModelFactory#getRulesFactory <em>Rules Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory</em>' container reference.
	 * @see #setModelFactory(ModelFactory)
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getRulesFactory_ModelFactory()
	 * @see gestionmodelosconsultas.ModelFactory#getRulesFactory
	 * @model opposite="rulesFactory"
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory#getModelFactory <em>Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory</em>' container reference.
	 * @see #getModelFactory()
	 * @generated
	 */
	void setModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>List Rule Diagram Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.rules.factoryrules.Rule}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.rules.factoryrules.Rule#getRulesFactory <em>Rules Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Rule Diagram Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Rule Diagram Entity</em>' containment reference list.
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#getRulesFactory_ListRuleDiagramEntity()
	 * @see gestionmodelosconsultas.rules.factoryrules.Rule#getRulesFactory
	 * @model opposite="RulesFactory" containment="true"
	 * @generated
	 */
	EList<Rule> getListRuleDiagramEntity();

} // RulesFactory
