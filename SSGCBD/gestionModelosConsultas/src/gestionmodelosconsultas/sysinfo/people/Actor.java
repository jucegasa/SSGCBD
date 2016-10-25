/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.sysinfo.function.Actividad;
import gestionmodelosconsultas.sysinfo.function.InstanciaProceso;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Actor#getRol <em>Rol</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Actor#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Actor#getActores <em>Actores</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Actor#getEjecuta <em>Ejecuta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.Actor#getProcesosResponsable <em>Procesos Responsable</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Quien {
	/**
	 * Returns the value of the '<em><b>Rol</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Rol}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Rol#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getActor_Rol()
	 * @see gestionmodelosconsultas.sysinfo.people.Rol#getActor
	 * @model opposite="Actor" required="true"
	 * @generated
	 */
	EList<Rol> getRol();

	/**
	 * Returns the value of the '<em><b>Unidad</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad</em>' container reference.
	 * @see #setUnidad(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getActor_Unidad()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getActor
	 * @model opposite="Actor"
	 * @generated
	 */
	UnidadOrganizacional getUnidad();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Actor#getUnidad <em>Unidad</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad</em>' container reference.
	 * @see #getUnidad()
	 * @generated
	 */
	void setUnidad(UnidadOrganizacional value);

	/**
	 * Returns the value of the '<em><b>Actores</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Actores#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actores</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' container reference.
	 * @see #setActores(Actores)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getActor_Actores()
	 * @see gestionmodelosconsultas.sysinfo.people.Actores#getActor
	 * @model opposite="Actor"
	 * @generated
	 */
	Actores getActores();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.Actor#getActores <em>Actores</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actores</em>' container reference.
	 * @see #getActores()
	 * @generated
	 */
	void setActores(Actores value);

	/**
	 * Returns the value of the '<em><b>Ejecuta</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.function.Actividad}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getEjecutantes <em>Ejecutantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejecuta</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejecuta</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getActor_Ejecuta()
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getEjecutantes
	 * @model opposite="ejecutantes"
	 * @generated
	 */
	EList<Actividad> getEjecuta();

	/**
	 * Returns the value of the '<em><b>Procesos Responsable</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActorResponsable <em>Actor Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procesos Responsable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procesos Responsable</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getActor_ProcesosResponsable()
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActorResponsable
	 * @model opposite="actorResponsable"
	 * @generated
	 */
	EList<InstanciaProceso> getProcesosResponsable();

} // Actor
