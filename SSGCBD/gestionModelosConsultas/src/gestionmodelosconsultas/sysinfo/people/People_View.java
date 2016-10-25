/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.sysinfo.Paquete;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>People View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.People_View#getDirectorio <em>Directorio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.People_View#getOrganizacion <em>Organizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getPeople_View()
 * @model
 * @generated
 */
public interface People_View extends Paquete {
	/**
	 * Returns the value of the '<em><b>Directorio</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Directorio#getPeople_View <em>People View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directorio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directorio</em>' containment reference.
	 * @see #setDirectorio(Directorio)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getPeople_View_Directorio()
	 * @see gestionmodelosconsultas.sysinfo.people.Directorio#getPeople_View
	 * @model opposite="People_View" containment="true" required="true"
	 * @generated
	 */
	Directorio getDirectorio();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.People_View#getDirectorio <em>Directorio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directorio</em>' containment reference.
	 * @see #getDirectorio()
	 * @generated
	 */
	void setDirectorio(Directorio value);

	/**
	 * Returns the value of the '<em><b>Organizacion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Organizacion#getPeople_View <em>People View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizacion</em>' containment reference.
	 * @see #setOrganizacion(Organizacion)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getPeople_View_Organizacion()
	 * @see gestionmodelosconsultas.sysinfo.people.Organizacion#getPeople_View
	 * @model opposite="People_View" containment="true" required="true"
	 * @generated
	 */
	Organizacion getOrganizacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.People_View#getOrganizacion <em>Organizacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizacion</em>' containment reference.
	 * @see #getOrganizacion()
	 * @generated
	 */
	void setOrganizacion(Organizacion value);

} // People_View
