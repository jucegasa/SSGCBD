/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getCopia <em>Copia</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopias()
 * @model
 * @generated
 */
public interface Copias extends EObject {
	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopias <em>Copias</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #setUnidadOrganizacional(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopias_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopias
	 * @model opposite="Copias"
	 * @generated
	 */
	UnidadOrganizacional getUnidadOrganizacional();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getUnidadOrganizacional <em>Unidad Organizacional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	void setUnidadOrganizacional(UnidadOrganizacional value);

	/**
	 * Returns the value of the '<em><b>Copia</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getCopias <em>Copias</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copia</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopias_Copia()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getCopias
	 * @model opposite="Copias" containment="true" required="true"
	 * @generated
	 */
	EList<Copia> getCopia();

} // Copias
