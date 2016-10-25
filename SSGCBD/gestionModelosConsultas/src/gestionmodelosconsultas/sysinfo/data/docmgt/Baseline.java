/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baseline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuItem <em>Su Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getBaseline()
 * @model
 * @generated
 */
public interface Baseline extends EObject {
	/**
	 * Returns the value of the '<em><b>Su Documento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuBaseline <em>Su Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Documento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Documento</em>' container reference.
	 * @see #setSuDocumento(Documento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getBaseline_SuDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuBaseline
	 * @model opposite="suBaseline" required="true"
	 * @generated
	 */
	Documento getSuDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuDocumento <em>Su Documento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Documento</em>' container reference.
	 * @see #getSuDocumento()
	 * @generated
	 */
	void setSuDocumento(Documento value);

	/**
	 * Returns the value of the '<em><b>Su Item</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Item}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Item</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getBaseline_SuItem()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getBaseline
	 * @model opposite="Baseline" containment="true" required="true"
	 * @generated
	 */
	EList<Item> getSuItem();

} // Baseline
