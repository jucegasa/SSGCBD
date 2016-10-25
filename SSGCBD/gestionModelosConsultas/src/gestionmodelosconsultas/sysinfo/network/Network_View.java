/**
 */
package gestionmodelosconsultas.sysinfo.network;

import gestionmodelosconsultas.sysinfo.Paquete;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Network_View#getEdificio <em>Edificio</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getNetwork_View()
 * @model
 * @generated
 */
public interface Network_View extends Paquete {
	/**
	 * Returns the value of the '<em><b>Edificio</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.network.Edificio}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Edificio#getNetwork_View <em>Network View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edificio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edificio</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getNetwork_View_Edificio()
	 * @see gestionmodelosconsultas.sysinfo.network.Edificio#getNetwork_View
	 * @model opposite="Network_View" containment="true" required="true"
	 * @generated
	 */
	EList<Edificio> getEdificio();

} // Network_View
