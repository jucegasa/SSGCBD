/**
 */
package gestionmodelosconsultas.sysinfo.time;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Calendario#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Calendario#getFecha <em>Fecha</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Calendario#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Calendario#getSuCalendario <em>Su Calendario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Calendario#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getCalendario()
 * @model
 * @generated
 */
public interface Calendario extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getCalendario_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.time.Fecha}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getCalendario <em>Calendario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getCalendario_Fecha()
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha#getCalendario
	 * @model opposite="Calendario" containment="true" required="true"
	 * @generated
	 */
	EList<Fecha> getFecha();

	/**
	 * Returns the value of the '<em><b>Agenda</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Agenda#getCalendario <em>Calendario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agenda</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agenda</em>' container reference.
	 * @see #setAgenda(Agenda)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getCalendario_Agenda()
	 * @see gestionmodelosconsultas.sysinfo.time.Agenda#getCalendario
	 * @model opposite="Calendario"
	 * @generated
	 */
	Agenda getAgenda();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getAgenda <em>Agenda</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda</em>' container reference.
	 * @see #getAgenda()
	 * @generated
	 */
	void setAgenda(Agenda value);

	/**
	 * Returns the value of the '<em><b>Su Calendario</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.time.Calendario}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Calendario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Calendario</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getCalendario_SuCalendario()
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getPlan
	 * @model opposite="plan" containment="true"
	 * @generated
	 */
	EList<Calendario> getSuCalendario();

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getSuCalendario <em>Su Calendario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' container reference.
	 * @see #setPlan(Calendario)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getCalendario_Plan()
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getSuCalendario
	 * @model opposite="suCalendario"
	 * @generated
	 */
	Calendario getPlan();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getPlan <em>Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' container reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Calendario value);

} // Calendario
