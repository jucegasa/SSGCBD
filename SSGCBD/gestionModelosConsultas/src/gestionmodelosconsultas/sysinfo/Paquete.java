/**
 */
package gestionmodelosconsultas.sysinfo;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.Paquete#getTipo <em>Tipo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.Paquete#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.SysinfoPackage#getPaquete()
 * @model
 * @generated
 */
public interface Paquete extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see gestionmodelosconsultas.sysinfo.SysinfoPackage#getPaquete_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.Paquete#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.core.ElementoModelo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.SysinfoPackage#getPaquete_Element()
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<ElementoModelo> getElement();

} // Paquete
