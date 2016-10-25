/**
 */
package gestionmodelosconsultas.sysinfo.people;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Rol#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Rol#getActor <em>Actor</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Rol#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getRol()
 * @model
 * @generated
 */
public interface Rol extends Quien {
	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #setUnidadOrganizacional(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getRol_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRol
	 * @model opposite="Rol"
	 * @generated
	 */
	UnidadOrganizacional getUnidadOrganizacional();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Rol#getUnidadOrganizacional <em>Unidad Organizacional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	void setUnidadOrganizacional(UnidadOrganizacional value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Actor}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Actor#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getRol_Actor()
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getRol
	 * @model opposite="Rol" required="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Roles#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' container reference.
	 * @see #setRoles(Roles)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getRol_Roles()
	 * @see gestionmodelosconsultas.sysinfo.people.Roles#getRol
	 * @model opposite="Rol"
	 * @generated
	 */
	Roles getRoles();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Rol#getRoles <em>Roles</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' container reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(Roles value);

} // Rol
