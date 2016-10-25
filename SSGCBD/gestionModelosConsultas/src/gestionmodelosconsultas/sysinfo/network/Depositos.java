/**
 */
package gestionmodelosconsultas.sysinfo.network;

import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depositos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Depositos#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Depositos#getDeposito <em>Deposito</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDepositos()
 * @model
 * @generated
 */
public interface Depositos extends EObject {
	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getDepositos <em>Depositos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #setUnidadOrganizacional(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDepositos_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getDepositos
	 * @model opposite="Depositos"
	 * @generated
	 */
	UnidadOrganizacional getUnidadOrganizacional();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.network.Depositos#getUnidadOrganizacional <em>Unidad Organizacional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	void setUnidadOrganizacional(UnidadOrganizacional value);

	/**
	 * Returns the value of the '<em><b>Deposito</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.network.Deposito}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getDepositos <em>Depositos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposito</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposito</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDepositos_Deposito()
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getDepositos
	 * @model opposite="Depositos" containment="true" required="true"
	 * @generated
	 */
	EList<Deposito> getDeposito();

} // Depositos
