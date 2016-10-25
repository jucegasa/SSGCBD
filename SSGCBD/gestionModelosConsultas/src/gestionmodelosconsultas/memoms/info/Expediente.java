/**
 */
package gestionmodelosconsultas.memoms.info;

import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expediente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Expediente#getDocumento <em>Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getExpediente()
 * @model
 * @generated
 */
public interface Expediente extends EObject {
	/**
	 * Returns the value of the '<em><b>Documento</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getExpediente <em>Expediente</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' reference list.
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getExpediente_Documento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getExpediente
	 * @model opposite="Expediente" required="true"
	 * @generated
	 */
	EList<Documento> getDocumento();

} // Expediente
