/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * El contenido es equivalente al indice de documento, tal como en word, el contenido se compone de varias entradas de indice de contenido, en este caso item´s.
 * 
 * Al menos uno de los elementos documentales debe contener información del contenido y estructura del documento.
 * 
 * Debe existir una organización de los elementos documentales que se encuentran dentro de un documento.
 * 
 * Responsable:
 * - Unidad Organizacional:Worker
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuItem <em>Su Item</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuDocumento <em>Su Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getContenido()
 * @model
 * @generated
 */
public interface Contenido extends EObject {
	/**
	 * Returns the value of the '<em><b>Su Item</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Item}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuContenido <em>Su Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Item</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getContenido_SuItem()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuContenido
	 * @model opposite="suContenido" containment="true" required="true"
	 * @generated
	 */
	EList<Item> getSuItem();

	/**
	 * Returns the value of the '<em><b>Su Documento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuContenido <em>Su Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Documento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Documento</em>' container reference.
	 * @see #setSuDocumento(Documento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getContenido_SuDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuContenido
	 * @model opposite="suContenido" required="true"
	 * @generated
	 */
	Documento getSuDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuDocumento <em>Su Documento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Documento</em>' container reference.
	 * @see #getSuDocumento()
	 * @generated
	 */
	void setSuDocumento(Documento value);

} // Contenido
