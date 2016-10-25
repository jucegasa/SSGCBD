/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.sysinfo.Paquete;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organizacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Organizacion#getPeople_View <em>People View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Organizacion#getOrganizacion <em>Organizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getOrganizacion()
 * @model
 * @generated
 */
public interface Organizacion extends Paquete {
	/**
	 * Returns the value of the '<em><b>People View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.People_View#getOrganizacion <em>Organizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People View</em>' container reference.
	 * @see #setPeople_View(People_View)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getOrganizacion_People_View()
	 * @see gestionmodelosconsultas.sysinfo.people.People_View#getOrganizacion
	 * @model opposite="Organizacion"
	 * @generated
	 */
	People_View getPeople_View();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Organizacion#getPeople_View <em>People View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>People View</em>' container reference.
	 * @see #getPeople_View()
	 * @generated
	 */
	void setPeople_View(People_View value);

	/**
	 * Returns the value of the '<em><b>Organizacion</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getOrganizacion <em>Organizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizacion</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getOrganizacion_Organizacion()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getOrganizacion
	 * @model opposite="Organizacion" containment="true" required="true"
	 * @generated
	 */
	EList<UnidadOrganizacional> getOrganizacion();

} // Organizacion
