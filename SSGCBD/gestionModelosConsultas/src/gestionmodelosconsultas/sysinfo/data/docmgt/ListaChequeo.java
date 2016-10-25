/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista Chequeo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Documento que sirve para verificar la consistencia, completitud y validez del documento de autoevaluación.
 * 
 * Responsable:
 * - Unidad Organizacional:Worker
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getSuTipo <em>Su Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getListaChequeo()
 * @model
 * @generated
 */
public interface ListaChequeo extends Documento {
	/**
	 * Returns the value of the '<em><b>Orientacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getListaChequeo <em>Lista Chequeo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientacion</em>' container reference.
	 * @see #setOrientacion(Orientacion)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getListaChequeo_Orientacion()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getListaChequeo
	 * @model opposite="ListaChequeo"
	 * @generated
	 */
	Orientacion getOrientacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getOrientacion <em>Orientacion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientacion</em>' container reference.
	 * @see #getOrientacion()
	 * @generated
	 */
	void setOrientacion(Orientacion value);

	/**
	 * Returns the value of the '<em><b>Su Tipo</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getLista <em>Lista</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Tipo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Tipo</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getListaChequeo_SuTipo()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getLista
	 * @model opposite="lista"
	 * @generated
	 */
	EList<TipoDocumento> getSuTipo();

} // ListaChequeo
