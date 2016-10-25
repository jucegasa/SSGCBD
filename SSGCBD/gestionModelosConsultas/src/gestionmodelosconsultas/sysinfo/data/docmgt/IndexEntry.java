/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Index entry es una clase usada para "indexar" (indice), Un docuemento puede ser indexado en una version, tipo de documento, o autor, por ejemplo. Cada Index Entry es una referencia a uno o mas objetos, como autor, titulo, o tema, y es un indice para justo un documento. El indice es una estrategia para identificar documentos a través de un set de informacion asociada con el documento.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getIndice <em>Indice</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuElemento <em>Su Elemento</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getIndexEntry()
 * @model
 * @generated
 */
public interface IndexEntry extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Su Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getContextoDocumento <em>Contexto Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Documento</em>' reference.
	 * @see #setSuDocumento(Documento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getIndexEntry_SuDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getContextoDocumento
	 * @model opposite="contextoDocumento" required="true"
	 * @generated
	 */
	Documento getSuDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuDocumento <em>Su Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Documento</em>' reference.
	 * @see #getSuDocumento()
	 * @generated
	 */
	void setSuDocumento(Documento value);

	/**
	 * Returns the value of the '<em><b>Indice</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice</em>' container reference.
	 * @see #setIndice(Indice)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getIndexEntry_Indice()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getIndice
	 * @model opposite="indice"
	 * @generated
	 */
	Indice getIndice();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getIndice <em>Indice</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice</em>' container reference.
	 * @see #getIndice()
	 * @generated
	 */
	void setIndice(Indice value);

	/**
	 * Returns the value of the '<em><b>Su Elemento</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.core.ElementoModelo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getContexto <em>Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Elemento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Elemento</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getIndexEntry_SuElemento()
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getContexto
	 * @model opposite="contexto"
	 * @generated
	 */
	EList<ElementoModelo> getSuElemento();

} // IndexEntry
