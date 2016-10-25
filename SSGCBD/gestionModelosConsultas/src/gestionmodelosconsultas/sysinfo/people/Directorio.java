/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.sysinfo.Paquete;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directorio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Directorio#getPeople_View <em>People View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Directorio#getContacto <em>Contacto</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getDirectorio()
 * @model
 * @generated
 */
public interface Directorio extends Paquete {
	/**
	 * Returns the value of the '<em><b>People View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.People_View#getDirectorio <em>Directorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People View</em>' container reference.
	 * @see #setPeople_View(People_View)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getDirectorio_People_View()
	 * @see gestionmodelosconsultas.sysinfo.people.People_View#getDirectorio
	 * @model opposite="Directorio"
	 * @generated
	 */
	People_View getPeople_View();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Directorio#getPeople_View <em>People View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>People View</em>' container reference.
	 * @see #getPeople_View()
	 * @generated
	 */
	void setPeople_View(People_View value);

	/**
	 * Returns the value of the '<em><b>Contacto</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Contacto}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getDirectorio <em>Directorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacto</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getDirectorio_Contacto()
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getDirectorio
	 * @model opposite="Directorio" containment="true" required="true"
	 * @generated
	 */
	EList<Contacto> getContacto();

} // Directorio
