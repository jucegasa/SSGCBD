/**
 */
package model.uimanager;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Memorando</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.uimanager.ContenedorMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}</li>
 *   <li>{@link model.uimanager.ContenedorMemorando#getListMemorando <em>List Memorando</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.uimanager.UimanagerPackage#getContenedorMemorando()
 * @model
 * @generated
 */
public interface ContenedorMemorando extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Ventana Memorando View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorMemorando <em>The Contenedor Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Ventana Memorando View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Ventana Memorando View Model</em>' container reference.
	 * @see #setOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel)
	 * @see model.uimanager.UimanagerPackage#getContenedorMemorando_OwnedByVentanaMemorandoViewModel()
	 * @see model.uimanager.VentanaMemorandoViewModel#getTheContenedorMemorando
	 * @model opposite="theContenedorMemorando" required="true" transient="false"
	 * @generated
	 */
	VentanaMemorandoViewModel getOwnedByVentanaMemorandoViewModel();

	/**
	 * Sets the value of the '{@link model.uimanager.ContenedorMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Ventana Memorando View Model</em>' container reference.
	 * @see #getOwnedByVentanaMemorandoViewModel()
	 * @generated
	 */
	void setOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel value);

	/**
	 * Returns the value of the '<em><b>List Memorando</b></em>' containment reference list.
	 * The list contents are of type {@link model.uimanager.MemorandoViewModel}.
	 * It is bidirectional and its opposite is '{@link model.uimanager.MemorandoViewModel#getOwnedByMemorando <em>Owned By Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Memorando</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Memorando</em>' containment reference list.
	 * @see model.uimanager.UimanagerPackage#getContenedorMemorando_ListMemorando()
	 * @see model.uimanager.MemorandoViewModel#getOwnedByMemorando
	 * @model opposite="ownedByMemorando" containment="true"
	 * @generated
	 */
	EList<MemorandoViewModel> getListMemorando();

} // ContenedorMemorando
