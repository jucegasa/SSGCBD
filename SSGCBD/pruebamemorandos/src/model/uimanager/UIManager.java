/**
 */
package model.uimanager;

import model.FactoryModel;

import model.domain.Domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.uimanager.UIManager#getOwnedByFactoryModel <em>Owned By Factory Model</em>}</li>
 *   <li>{@link model.uimanager.UIManager#getTheVentanaMemorandoViewModel <em>The Ventana Memorando View Model</em>}</li>
 *   <li>{@link model.uimanager.UIManager#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.uimanager.UimanagerPackage#getUIManager()
 * @model
 * @generated
 */
public interface UIManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Factory Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.FactoryModel#getTheUIManager <em>The UI Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Factory Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Factory Model</em>' container reference.
	 * @see #setOwnedByFactoryModel(FactoryModel)
	 * @see model.uimanager.UimanagerPackage#getUIManager_OwnedByFactoryModel()
	 * @see model.FactoryModel#getTheUIManager
	 * @model opposite="theUIManager" required="true" transient="false"
	 * @generated
	 */
	FactoryModel getOwnedByFactoryModel();

	/**
	 * Sets the value of the '{@link model.uimanager.UIManager#getOwnedByFactoryModel <em>Owned By Factory Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Factory Model</em>' container reference.
	 * @see #getOwnedByFactoryModel()
	 * @generated
	 */
	void setOwnedByFactoryModel(FactoryModel value);

	/**
	 * Returns the value of the '<em><b>The Ventana Memorando View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.VentanaMemorandoViewModel#getTheUiManager <em>The Ui Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Ventana Memorando View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Ventana Memorando View Model</em>' containment reference.
	 * @see #setTheVentanaMemorandoViewModel(VentanaMemorandoViewModel)
	 * @see model.uimanager.UimanagerPackage#getUIManager_TheVentanaMemorandoViewModel()
	 * @see model.uimanager.VentanaMemorandoViewModel#getTheUiManager
	 * @model opposite="theUiManager" containment="true" required="true"
	 * @generated
	 */
	VentanaMemorandoViewModel getTheVentanaMemorandoViewModel();

	/**
	 * Sets the value of the '{@link model.uimanager.UIManager#getTheVentanaMemorandoViewModel <em>The Ventana Memorando View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Ventana Memorando View Model</em>' containment reference.
	 * @see #getTheVentanaMemorandoViewModel()
	 * @generated
	 */
	void setTheVentanaMemorandoViewModel(VentanaMemorandoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.domain.Domain#getTheUIManager <em>The UI Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' reference.
	 * @see #setTheDomain(Domain)
	 * @see model.uimanager.UimanagerPackage#getUIManager_TheDomain()
	 * @see model.domain.Domain#getTheUIManager
	 * @model opposite="theUIManager" required="true"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link model.uimanager.UIManager#getTheDomain <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

} // UIManager
