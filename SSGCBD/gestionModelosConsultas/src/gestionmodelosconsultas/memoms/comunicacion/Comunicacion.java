/**
 */
package gestionmodelosconsultas.memoms.comunicacion;

import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import gestionmodelosconsultas.sysinfo.people.Contacto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comunicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getDestinatario <em>Destinatario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getRemitente <em>Remitente</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getNumeroRadicado <em>Numero Radicado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getAsunto <em>Asunto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getContenido <em>Contenido</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getComunicacion()
 * @model abstract="true"
 * @generated
 */
public interface Comunicacion extends Documento {
	/**
	 * Returns the value of the '<em><b>Destinatario</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Contacto}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getDestinatariocomunicacion <em>Destinatariocomunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinatario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinatario</em>' reference list.
	 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getComunicacion_Destinatario()
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getDestinatariocomunicacion
	 * @model opposite="destinatariocomunicacion" required="true"
	 * @generated
	 */
	EList<Contacto> getDestinatario();

	/**
	 * Returns the value of the '<em><b>Remitente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getRemitentecomunicacion <em>Remitentecomunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remitente</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remitente</em>' reference.
	 * @see #setRemitente(Contacto)
	 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getComunicacion_Remitente()
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getRemitentecomunicacion
	 * @model opposite="remitentecomunicacion" required="true"
	 * @generated
	 */
	Contacto getRemitente();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getRemitente <em>Remitente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remitente</em>' reference.
	 * @see #getRemitente()
	 * @generated
	 */
	void setRemitente(Contacto value);

	/**
	 * Returns the value of the '<em><b>Numero Radicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Radicado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Radicado</em>' attribute.
	 * @see #setNumeroRadicado(String)
	 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getComunicacion_NumeroRadicado()
	 * @model
	 * @generated
	 */
	String getNumeroRadicado();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getNumeroRadicado <em>Numero Radicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Radicado</em>' attribute.
	 * @see #getNumeroRadicado()
	 * @generated
	 */
	void setNumeroRadicado(String value);

	/**
	 * Returns the value of the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asunto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asunto</em>' attribute.
	 * @see #setAsunto(String)
	 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getComunicacion_Asunto()
	 * @model
	 * @generated
	 */
	String getAsunto();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getAsunto <em>Asunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asunto</em>' attribute.
	 * @see #getAsunto()
	 * @generated
	 */
	void setAsunto(String value);

	/**
	 * Returns the value of the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenido</em>' attribute.
	 * @see #setContenido(String)
	 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getComunicacion_Contenido()
	 * @model
	 * @generated
	 */
	String getContenido();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getContenido <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenido</em>' attribute.
	 * @see #getContenido()
	 * @generated
	 */
	void setContenido(String value);

} // Comunicacion
