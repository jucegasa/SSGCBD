/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import reportes.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reportes.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link reportes.domain.Domain#getUI <em>UI</em>}</li>
 * </ul>
 * </p>
 *
 * @see reportes.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reportes.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see reportes.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see reportes.ModelFactory#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link reportes.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>UI</b></em>' reference list.
	 * The list contents are of type {@link reportes.ui.UI}.
	 * It is bidirectional and its opposite is '{@link reportes.ui.UI#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' reference list.
	 * @see reportes.domain.DomainPackage#getDomain_UI()
	 * @see reportes.ui.UI#getDomain
	 * @model type="reportes.ui.UI" opposite="Domain"
	 * @generated
	 */
	EList getUI();

} // Domain
