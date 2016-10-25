/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Modelo Resultado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getKey <em>Key</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getListElementoModeloResultado <em>List Elemento Modelo Resultado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getElementoModeloResultado <em>Elemento Modelo Resultado</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getElementoModeloResultado()
 * @model abstract="true"
 * @generated
 */
public interface ElementoModeloResultado extends ResultElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getElementoModeloResultado_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getElementoModeloResultado <em>Elemento Modelo Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elemento Modelo Resultado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elemento Modelo Resultado</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getElementoModeloResultado_ListElementoModeloResultado()
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getElementoModeloResultado
	 * @model opposite="ElementoModeloResultado" containment="true"
	 * @generated
	 */
	EList<ElementoModeloResultado> getListElementoModeloResultado();

	/**
	 * Returns the value of the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getListElementoModeloResultado <em>List Elemento Modelo Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Modelo Resultado</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Modelo Resultado</em>' container reference.
	 * @see #setElementoModeloResultado(ElementoModeloResultado)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getElementoModeloResultado_ElementoModeloResultado()
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getListElementoModeloResultado
	 * @model opposite="listElementoModeloResultado"
	 * @generated
	 */
	ElementoModeloResultado getElementoModeloResultado();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getElementoModeloResultado <em>Elemento Modelo Resultado</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento Modelo Resultado</em>' container reference.
	 * @see #getElementoModeloResultado()
	 * @generated
	 */
	void setElementoModeloResultado(ElementoModeloResultado value);

} // ElementoModeloResultado
