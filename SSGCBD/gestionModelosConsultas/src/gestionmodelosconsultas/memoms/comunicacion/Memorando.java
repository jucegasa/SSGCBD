/**
 */
package gestionmodelosconsultas.memoms.comunicacion;

import gestionmodelosconsultas.memoms.info.Actividad;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memorando</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.Memorando#getActividad <em>Actividad</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getMemorando()
 * @model
 * @generated
 */
public interface Memorando extends Comunicacion {
	/**
	 * Returns the value of the '<em><b>Actividad</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.info.Actividad}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.Actividad#getMemorando <em>Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actividad</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividad</em>' reference list.
	 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage#getMemorando_Actividad()
	 * @see gestionmodelosconsultas.memoms.info.Actividad#getMemorando
	 * @model opposite="Memorando"
	 * @generated
	 */
	EList<Actividad> getActividad();

} // Memorando
