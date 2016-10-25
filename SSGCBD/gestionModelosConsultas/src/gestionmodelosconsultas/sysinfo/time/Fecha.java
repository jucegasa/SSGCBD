/**
 */
package gestionmodelosconsultas.sysinfo.time;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fecha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Fecha#getDia <em>Dia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Fecha#getMes <em>Mes</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Fecha#getAno <em>Ano</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Fecha#getCalendario <em>Calendario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Fecha#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getFecha()
 * @model
 * @generated
 */
public interface Fecha extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Dia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dia</em>' attribute.
	 * @see #setDia(String)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getFecha_Dia()
	 * @model
	 * @generated
	 */
	String getDia();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getDia <em>Dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dia</em>' attribute.
	 * @see #getDia()
	 * @generated
	 */
	void setDia(String value);

	/**
	 * Returns the value of the '<em><b>Mes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mes</em>' attribute.
	 * @see #setMes(String)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getFecha_Mes()
	 * @model
	 * @generated
	 */
	String getMes();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getMes <em>Mes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mes</em>' attribute.
	 * @see #getMes()
	 * @generated
	 */
	void setMes(String value);

	/**
	 * Returns the value of the '<em><b>Ano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ano</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ano</em>' attribute.
	 * @see #setAno(String)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getFecha_Ano()
	 * @model
	 * @generated
	 */
	String getAno();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getAno <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ano</em>' attribute.
	 * @see #getAno()
	 * @generated
	 */
	void setAno(String value);

	/**
	 * Returns the value of the '<em><b>Calendario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendario</em>' container reference.
	 * @see #setCalendario(Calendario)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getFecha_Calendario()
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getFecha
	 * @model opposite="Fecha"
	 * @generated
	 */
	Calendario getCalendario();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getCalendario <em>Calendario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendario</em>' container reference.
	 * @see #getCalendario()
	 * @generated
	 */
	void setCalendario(Calendario value);

	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mensaje</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getFecha_Mensaje()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getFecha
	 * @model opposite="Fecha" required="true"
	 * @generated
	 */
	EList<Mensaje> getMensaje();

} // Fecha
