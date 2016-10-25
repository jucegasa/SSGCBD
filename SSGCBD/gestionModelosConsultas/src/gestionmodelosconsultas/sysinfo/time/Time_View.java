/**
 */
package gestionmodelosconsultas.sysinfo.time;

import gestionmodelosconsultas.sysinfo.Paquete;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.Time_View#getAgenda <em>Agenda</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getTime_View()
 * @model
 * @generated
 */
public interface Time_View extends Paquete {
	/**
	 * Returns the value of the '<em><b>Agenda</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.time.Agenda#getTime_View <em>Time View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agenda</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agenda</em>' containment reference.
	 * @see #setAgenda(Agenda)
	 * @see gestionmodelosconsultas.sysinfo.time.TimePackage#getTime_View_Agenda()
	 * @see gestionmodelosconsultas.sysinfo.time.Agenda#getTime_View
	 * @model opposite="Time_View" containment="true" required="true"
	 * @generated
	 */
	Agenda getAgenda();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.time.Time_View#getAgenda <em>Agenda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda</em>' containment reference.
	 * @see #getAgenda()
	 * @generated
	 */
	void setAgenda(Agenda value);

} // Time_View
