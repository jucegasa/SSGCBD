/**
 */
package model.uimanager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Informacion Memorando</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.uimanager.ContenedorInformacionMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}</li>
 *   <li>{@link model.uimanager.ContenedorInformacionMemorando#getUnidado <em>Unidado</em>}</li>
 *   <li>{@link model.uimanager.ContenedorInformacionMemorando#getRemitente <em>Remitente</em>}</li>
 *   <li>{@link model.uimanager.ContenedorInformacionMemorando#getFecha <em>Fecha</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.uimanager.UimanagerPackage#getContenedorInformacionMemorando()
 * @model
 * @generated
 */
public interface ContenedorInformacionMemorando extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Ventana Memorando View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorInformacionMemorando <em>The Contenedor Informacion Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Ventana Memorando View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Ventana Memorando View Model</em>' container reference.
	 * @see #setOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel)
	 * @see model.uimanager.UimanagerPackage#getContenedorInformacionMemorando_OwnedByVentanaMemorandoViewModel()
	 * @see model.uimanager.VentanaMemorandoViewModel#getTheContenedorInformacionMemorando
	 * @model opposite="theContenedorInformacionMemorando" required="true" transient="false"
	 * @generated
	 */
	VentanaMemorandoViewModel getOwnedByVentanaMemorandoViewModel();

	/**
	 * Sets the value of the '{@link model.uimanager.ContenedorInformacionMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Ventana Memorando View Model</em>' container reference.
	 * @see #getOwnedByVentanaMemorandoViewModel()
	 * @generated
	 */
	void setOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel value);

	/**
	 * Returns the value of the '<em><b>Unidado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidado</em>' attribute.
	 * @see #setUnidado(String)
	 * @see model.uimanager.UimanagerPackage#getContenedorInformacionMemorando_Unidado()
	 * @model dataType="model.String"
	 * @generated
	 */
	String getUnidado();

	/**
	 * Sets the value of the '{@link model.uimanager.ContenedorInformacionMemorando#getUnidado <em>Unidado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidado</em>' attribute.
	 * @see #getUnidado()
	 * @generated
	 */
	void setUnidado(String value);

	/**
	 * Returns the value of the '<em><b>Remitente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remitente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remitente</em>' attribute.
	 * @see #setRemitente(String)
	 * @see model.uimanager.UimanagerPackage#getContenedorInformacionMemorando_Remitente()
	 * @model dataType="model.String"
	 * @generated
	 */
	String getRemitente();

	/**
	 * Sets the value of the '{@link model.uimanager.ContenedorInformacionMemorando#getRemitente <em>Remitente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remitente</em>' attribute.
	 * @see #getRemitente()
	 * @generated
	 */
	void setRemitente(String value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(String)
	 * @see model.uimanager.UimanagerPackage#getContenedorInformacionMemorando_Fecha()
	 * @model dataType="model.String"
	 * @generated
	 */
	String getFecha();

	/**
	 * Sets the value of the '{@link model.uimanager.ContenedorInformacionMemorando#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(String value);

} // ContenedorInformacionMemorando
