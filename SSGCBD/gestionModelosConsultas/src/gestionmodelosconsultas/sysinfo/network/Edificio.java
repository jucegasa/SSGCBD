/**
 */
package gestionmodelosconsultas.sysinfo.network;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edificio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Edificio#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Edificio#getNetwork_View <em>Network View</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getEdificio()
 * @model
 * @generated
 */
public interface Edificio extends Paquete {
	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getEdificio <em>Edificio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getEdificio_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getEdificio
	 * @model opposite="Edificio" required="true"
	 * @generated
	 */
	EList<UnidadOrganizacional> getUnidadOrganizacional();

	/**
	 * Returns the value of the '<em><b>Network View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Network_View#getEdificio <em>Edificio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network View</em>' container reference.
	 * @see #setNetwork_View(Network_View)
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getEdificio_Network_View()
	 * @see gestionmodelosconsultas.sysinfo.network.Network_View#getEdificio
	 * @model opposite="Edificio"
	 * @generated
	 */
	Network_View getNetwork_View();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.network.Edificio#getNetwork_View <em>Network View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network View</em>' container reference.
	 * @see #getNetwork_View()
	 * @generated
	 */
	void setNetwork_View(Network_View value);

} // Edificio
