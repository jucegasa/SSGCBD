/**
 */
package gestionmodelosconsultas.sysinfo.function;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.people.Actor;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instancia Proceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActividades <em>Actividades</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActorResponsable <em>Actor Responsable</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getInstanciaProceso()
 * @model
 * @generated
 */
public interface InstanciaProceso extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getInstanciaProceso_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Actividades</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.function.Actividad}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getInstanciaProceso <em>Instancia Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actividades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividades</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getInstanciaProceso_Actividades()
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getInstanciaProceso
	 * @model opposite="InstanciaProceso" containment="true" required="true"
	 * @generated
	 */
	EList<Actividad> getActividades();

	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getInstanciacionesprocesos <em>Instanciacionesprocesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #setUnidadOrganizacional(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getInstanciaProceso_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getInstanciacionesprocesos
	 * @model opposite="instanciacionesprocesos"
	 * @generated
	 */
	UnidadOrganizacional getUnidadOrganizacional();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getUnidadOrganizacional <em>Unidad Organizacional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	void setUnidadOrganizacional(UnidadOrganizacional value);

	/**
	 * Returns the value of the '<em><b>Actor Responsable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Actor#getProcesosResponsable <em>Procesos Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Responsable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Responsable</em>' reference.
	 * @see #setActorResponsable(Actor)
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getInstanciaProceso_ActorResponsable()
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getProcesosResponsable
	 * @model opposite="procesosResponsable" required="true"
	 * @generated
	 */
	Actor getActorResponsable();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActorResponsable <em>Actor Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Responsable</em>' reference.
	 * @see #getActorResponsable()
	 * @generated
	 */
	void setActorResponsable(Actor value);

} // InstanciaProceso
