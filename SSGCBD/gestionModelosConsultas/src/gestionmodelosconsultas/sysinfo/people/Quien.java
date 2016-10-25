/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Quien#getContacto <em>Contacto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Quien#getTheDocumento <em>The Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getQuien()
 * @model
 * @generated
 */
public interface Quien extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Contacto</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getQuien <em>Quien</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacto</em>' reference.
	 * @see #setContacto(Contacto)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getQuien_Contacto()
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getQuien
	 * @model opposite="quien" required="true"
	 * @generated
	 */
	Contacto getContacto();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Quien#getContacto <em>Contacto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contacto</em>' reference.
	 * @see #getContacto()
	 * @generated
	 */
	void setContacto(Contacto value);

	/**
	 * Returns the value of the '<em><b>The Documento</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheRol <em>The Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Documento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Documento</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getQuien_TheDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheRol
	 * @model opposite="theRol"
	 * @generated
	 */
	EList<Documento> getTheDocumento();

} // Quien
