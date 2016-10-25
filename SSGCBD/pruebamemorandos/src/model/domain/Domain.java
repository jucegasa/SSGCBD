/**
 */
package model.domain;

import model.FactoryModel;

import model.uimanager.UIManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.domain.Domain#getOwnedByFactoryModel <em>Owned By Factory Model</em>}</li>
 *   <li>{@link model.domain.Domain#getTheUIManager <em>The UI Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Factory Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.FactoryModel#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Factory Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Factory Model</em>' container reference.
	 * @see #setOwnedByFactoryModel(FactoryModel)
	 * @see model.domain.DomainPackage#getDomain_OwnedByFactoryModel()
	 * @see model.FactoryModel#getTheDomain
	 * @model opposite="theDomain" required="true" transient="false"
	 * @generated
	 */
	FactoryModel getOwnedByFactoryModel();

	/**
	 * Sets the value of the '{@link model.domain.Domain#getOwnedByFactoryModel <em>Owned By Factory Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Factory Model</em>' container reference.
	 * @see #getOwnedByFactoryModel()
	 * @generated
	 */
	void setOwnedByFactoryModel(FactoryModel value);

	/**
	 * Returns the value of the '<em><b>The UI Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.UIManager#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI Manager</em>' reference.
	 * @see #setTheUIManager(UIManager)
	 * @see model.domain.DomainPackage#getDomain_TheUIManager()
	 * @see model.uimanager.UIManager#getTheDomain
	 * @model opposite="theDomain" required="true"
	 * @generated
	 */
	UIManager getTheUIManager();

	/**
	 * Sets the value of the '{@link model.domain.Domain#getTheUIManager <em>The UI Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI Manager</em>' reference.
	 * @see #getTheUIManager()
	 * @generated
	 */
	void setTheUIManager(UIManager value);

} // Domain
