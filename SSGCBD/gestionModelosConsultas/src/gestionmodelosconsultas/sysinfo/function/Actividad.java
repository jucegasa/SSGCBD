/**
 */
package gestionmodelosconsultas.sysinfo.function;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import gestionmodelosconsultas.sysinfo.people.Actor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.Actividad#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.Actividad#getEstado <em>Estado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.Actividad#getEjecutantes <em>Ejecutantes</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.Actividad#getInstanciaProceso <em>Instancia Proceso</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.Actividad#getGenera <em>Genera</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getActividad()
 * @model
 * @generated
 */
public interface Actividad extends ElementoModelo {
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
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getActividad_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getActividad_Estado()
	 * @model
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Ejecutantes</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Actor}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Actor#getEjecuta <em>Ejecuta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejecutantes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejecutantes</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getActividad_Ejecutantes()
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getEjecuta
	 * @model opposite="ejecuta" required="true"
	 * @generated
	 */
	EList<Actor> getEjecutantes();

	/**
	 * Returns the value of the '<em><b>Instancia Proceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instancia Proceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instancia Proceso</em>' container reference.
	 * @see #setInstanciaProceso(InstanciaProceso)
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getActividad_InstanciaProceso()
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActividades
	 * @model opposite="actividades"
	 * @generated
	 */
	InstanciaProceso getInstanciaProceso();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getInstanciaProceso <em>Instancia Proceso</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instancia Proceso</em>' container reference.
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	void setInstanciaProceso(InstanciaProceso value);

	/**
	 * Returns the value of the '<em><b>Genera</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAsociado <em>Asociado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genera</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genera</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.function.FunctionPackage#getActividad_Genera()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAsociado
	 * @model opposite="asociado"
	 * @generated
	 */
	EList<Documento> getGenera();

} // Actividad
