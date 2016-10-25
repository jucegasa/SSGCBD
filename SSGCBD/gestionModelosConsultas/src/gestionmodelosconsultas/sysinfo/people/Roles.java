/**
 */
package gestionmodelosconsultas.sysinfo.people;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Roles#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Roles#getRol <em>Rol</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getRoles()
 * @model
 * @generated
 */
public interface Roles extends EObject {
	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #setUnidadOrganizacional(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getRoles_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRoles
	 * @model opposite="Roles"
	 * @generated
	 */
	UnidadOrganizacional getUnidadOrganizacional();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Roles#getUnidadOrganizacional <em>Unidad Organizacional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	void setUnidadOrganizacional(UnidadOrganizacional value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Rol}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Rol#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getRoles_Rol()
	 * @see gestionmodelosconsultas.sysinfo.people.Rol#getRoles
	 * @model opposite="Roles" containment="true" required="true"
	 * @generated
	 */
	EList<Rol> getRol();

} // Roles
