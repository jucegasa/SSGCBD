/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.people.Contacto;

import gestionmodelosconsultas.sysinfo.time.Fecha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mensaje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Distribucion es una clase que representa la la distribucion de una copia. Una copia puede ser distribuida varias veces, cada vez en una diferente ubicacion. La distribucion puede ser via correo electronico, por intranet, o por internet. Los atributos tipicos son remitente, destinatario, y metodo de distribucion.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getDistribucion <em>Distribucion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getAsunto <em>Asunto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getMensaje <em>Mensaje</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getCopia <em>Copia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getContacto <em>Contacto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getFecha <em>Fecha</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getMensaje()
 * @model
 * @generated
 */
public interface Mensaje extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Distribucion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribucion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribucion</em>' container reference.
	 * @see #setDistribucion(Distribucion)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getMensaje_Distribucion()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getMensaje
	 * @model opposite="Mensaje"
	 * @generated
	 */
	Distribucion getDistribucion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getDistribucion <em>Distribucion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribucion</em>' container reference.
	 * @see #getDistribucion()
	 * @generated
	 */
	void setDistribucion(Distribucion value);

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
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getMensaje_Asunto()
	 * @model
	 * @generated
	 */
	String getAsunto();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getAsunto <em>Asunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asunto</em>' attribute.
	 * @see #getAsunto()
	 * @generated
	 */
	void setAsunto(String value);

	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mensaje</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' attribute.
	 * @see #setMensaje(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getMensaje_Mensaje()
	 * @model
	 * @generated
	 */
	String getMensaje();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getMensaje <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mensaje</em>' attribute.
	 * @see #getMensaje()
	 * @generated
	 */
	void setMensaje(String value);

	/**
	 * Returns the value of the '<em><b>Copia</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copia</em>' reference.
	 * @see #setCopia(Copia)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getMensaje_Copia()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getMensaje
	 * @model opposite="Mensaje" required="true"
	 * @generated
	 */
	Copia getCopia();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getCopia <em>Copia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copia</em>' reference.
	 * @see #getCopia()
	 * @generated
	 */
	void setCopia(Copia value);

	/**
	 * Returns the value of the '<em><b>Contacto</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Contacto}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacto</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacto</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getMensaje_Contacto()
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getMensaje
	 * @model opposite="Mensaje" required="true"
	 * @generated
	 */
	EList<Contacto> getContacto();

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' reference.
	 * @see #setFecha(Fecha)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getMensaje_Fecha()
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha#getMensaje
	 * @model opposite="Mensaje" required="true"
	 * @generated
	 */
	Fecha getFecha();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getFecha <em>Fecha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' reference.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(Fecha value);

} // Mensaje
