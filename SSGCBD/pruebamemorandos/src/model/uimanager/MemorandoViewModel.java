/**
 */
package model.uimanager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memorando View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.uimanager.MemorandoViewModel#getOwnedByMemorando <em>Owned By Memorando</em>}</li>
 *   <li>{@link model.uimanager.MemorandoViewModel#getId <em>Id</em>}</li>
 *   <li>{@link model.uimanager.MemorandoViewModel#getTipo <em>Tipo</em>}</li>
 *   <li>{@link model.uimanager.MemorandoViewModel#getHora <em>Hora</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.uimanager.UimanagerPackage#getMemorandoViewModel()
 * @model
 * @generated
 */
public interface MemorandoViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Memorando</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.ContenedorMemorando#getListMemorando <em>List Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Memorando</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Memorando</em>' container reference.
	 * @see #setOwnedByMemorando(ContenedorMemorando)
	 * @see model.uimanager.UimanagerPackage#getMemorandoViewModel_OwnedByMemorando()
	 * @see model.uimanager.ContenedorMemorando#getListMemorando
	 * @model opposite="listMemorando" required="true" transient="false"
	 * @generated
	 */
	ContenedorMemorando getOwnedByMemorando();

	/**
	 * Sets the value of the '{@link model.uimanager.MemorandoViewModel#getOwnedByMemorando <em>Owned By Memorando</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Memorando</em>' container reference.
	 * @see #getOwnedByMemorando()
	 * @generated
	 */
	void setOwnedByMemorando(ContenedorMemorando value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see model.uimanager.UimanagerPackage#getMemorandoViewModel_Id()
	 * @model dataType="model.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link model.uimanager.MemorandoViewModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see model.uimanager.UimanagerPackage#getMemorandoViewModel_Tipo()
	 * @model dataType="model.String"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link model.uimanager.MemorandoViewModel#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hora</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora</em>' attribute.
	 * @see #setHora(String)
	 * @see model.uimanager.UimanagerPackage#getMemorandoViewModel_Hora()
	 * @model dataType="model.String"
	 * @generated
	 */
	String getHora();

	/**
	 * Sets the value of the '{@link model.uimanager.MemorandoViewModel#getHora <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora</em>' attribute.
	 * @see #getHora()
	 * @generated
	 */
	void setHora(String value);

} // MemorandoViewModel
