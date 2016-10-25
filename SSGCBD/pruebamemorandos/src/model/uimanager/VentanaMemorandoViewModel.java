/**
 */
package model.uimanager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ventana Memorando View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.uimanager.VentanaMemorandoViewModel#getTheUiManager <em>The Ui Manager</em>}</li>
 *   <li>{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorInformacionMemorando <em>The Contenedor Informacion Memorando</em>}</li>
 *   <li>{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorMemorando <em>The Contenedor Memorando</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.uimanager.UimanagerPackage#getVentanaMemorandoViewModel()
 * @model
 * @generated
 */
public interface VentanaMemorandoViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>The Ui Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.UIManager#getTheVentanaMemorandoViewModel <em>The Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Ui Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Ui Manager</em>' container reference.
	 * @see #setTheUiManager(UIManager)
	 * @see model.uimanager.UimanagerPackage#getVentanaMemorandoViewModel_TheUiManager()
	 * @see model.uimanager.UIManager#getTheVentanaMemorandoViewModel
	 * @model opposite="theVentanaMemorandoViewModel" required="true" transient="false"
	 * @generated
	 */
	UIManager getTheUiManager();

	/**
	 * Sets the value of the '{@link model.uimanager.VentanaMemorandoViewModel#getTheUiManager <em>The Ui Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Ui Manager</em>' container reference.
	 * @see #getTheUiManager()
	 * @generated
	 */
	void setTheUiManager(UIManager value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Informacion Memorando</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.ContenedorInformacionMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Informacion Memorando</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Informacion Memorando</em>' containment reference.
	 * @see #setTheContenedorInformacionMemorando(ContenedorInformacionMemorando)
	 * @see model.uimanager.UimanagerPackage#getVentanaMemorandoViewModel_TheContenedorInformacionMemorando()
	 * @see model.uimanager.ContenedorInformacionMemorando#getOwnedByVentanaMemorandoViewModel
	 * @model opposite="ownedByVentanaMemorandoViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorInformacionMemorando getTheContenedorInformacionMemorando();

	/**
	 * Sets the value of the '{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorInformacionMemorando <em>The Contenedor Informacion Memorando</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Informacion Memorando</em>' containment reference.
	 * @see #getTheContenedorInformacionMemorando()
	 * @generated
	 */
	void setTheContenedorInformacionMemorando(ContenedorInformacionMemorando value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Memorando</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.ContenedorMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Memorando</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Memorando</em>' containment reference.
	 * @see #setTheContenedorMemorando(ContenedorMemorando)
	 * @see model.uimanager.UimanagerPackage#getVentanaMemorandoViewModel_TheContenedorMemorando()
	 * @see model.uimanager.ContenedorMemorando#getOwnedByVentanaMemorandoViewModel
	 * @model opposite="ownedByVentanaMemorandoViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorMemorando getTheContenedorMemorando();

	/**
	 * Sets the value of the '{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorMemorando <em>The Contenedor Memorando</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Memorando</em>' containment reference.
	 * @see #getTheContenedorMemorando()
	 * @generated
	 */
	void setTheContenedorMemorando(ContenedorMemorando value);

} // VentanaMemorandoViewModel
