/**
 */
package gestionmodelosconsultas.sysinfo.time;

import gestionmodelosconsultas.sysinfo.Paquete;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Agenda#getTime_View <em>Time View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Agenda#getCalendario <em>Calendario</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getAgenda()
 * @model
 * @generated
 */
public interface Agenda extends Paquete {
	/**
	 * Returns the value of the '<em><b>Time View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Time_View#getAgenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time View</em>' container reference.
	 * @see #setTime_View(Time_View)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getAgenda_Time_View()
	 * @see gestionmodelosconsultas.sysinfo.time.Time_View#getAgenda
	 * @model opposite="Agenda"
	 * @generated
	 */
	Time_View getTime_View();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Agenda#getTime_View <em>Time View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time View</em>' container reference.
	 * @see #getTime_View()
	 * @generated
	 */
	void setTime_View(Time_View value);

	/**
	 * Returns the value of the '<em><b>Calendario</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.time.Calendario}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getAgenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendario</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getAgenda_Calendario()
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getAgenda
	 * @model opposite="Agenda" containment="true" required="true"
	 * @generated
	 */
	EList<Calendario> getCalendario();

} // Agenda
