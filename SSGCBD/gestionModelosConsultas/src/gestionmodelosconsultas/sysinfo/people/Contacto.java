/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.memoms.comunicacion.Comunicacion;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contacto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Contacto#getDirectorio <em>Directorio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Contacto#getQuien <em>Quien</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Contacto#getMensaje <em>Mensaje</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Contacto#getDestinatariocomunicacion <em>Destinatariocomunicacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Contacto#getRemitentecomunicacion <em>Remitentecomunicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getContacto()
 * @model
 * @generated
 */
public interface Contacto extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Directorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Directorio#getContacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directorio</em>' container reference.
	 * @see #setDirectorio(Directorio)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getContacto_Directorio()
	 * @see gestionmodelosconsultas.sysinfo.people.Directorio#getContacto
	 * @model opposite="Contacto"
	 * @generated
	 */
	Directorio getDirectorio();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getDirectorio <em>Directorio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directorio</em>' container reference.
	 * @see #getDirectorio()
	 * @generated
	 */
	void setDirectorio(Directorio value);

	/**
	 * Returns the value of the '<em><b>Quien</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Quien}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Quien#getContacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quien</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quien</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getContacto_Quien()
	 * @see gestionmodelosconsultas.sysinfo.people.Quien#getContacto
	 * @model opposite="contacto" required="true"
	 * @generated
	 */
	EList<Quien> getQuien();

	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getContacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mensaje</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getContacto_Mensaje()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getContacto
	 * @model opposite="Contacto" required="true"
	 * @generated
	 */
	EList<Mensaje> getMensaje();

	/**
	 * Returns the value of the '<em><b>Destinatariocomunicacion</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getDestinatario <em>Destinatario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinatariocomunicacion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinatariocomunicacion</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getContacto_Destinatariocomunicacion()
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getDestinatario
	 * @model opposite="destinatario"
	 * @generated
	 */
	EList<Comunicacion> getDestinatariocomunicacion();

	/**
	 * Returns the value of the '<em><b>Remitentecomunicacion</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getRemitente <em>Remitente</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remitentecomunicacion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remitentecomunicacion</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getContacto_Remitentecomunicacion()
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getRemitente
	 * @model opposite="remitente"
	 * @generated
	 */
	EList<Comunicacion> getRemitentecomunicacion();

} // Contacto
