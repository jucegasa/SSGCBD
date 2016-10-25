/**
 */
package gestionmodelosconsultas.sysinfo.network;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;

import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deposito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un elemento de almacenamiento es el "lugar" donde se almacenan o guardan la copias. Pueden ser medios magneticos (Disco), o medios fisicos (Armario).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Deposito#getDepositos <em>Depositos</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Deposito#getCopia <em>Copia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Deposito#getSuDeposito <em>Su Deposito</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Deposito#getContainer <em>Container</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Deposito#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDeposito()
 * @model
 * @generated
 */
public interface Deposito extends Paquete {
	/**
	 * Returns the value of the '<em><b>Depositos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Depositos#getDeposito <em>Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depositos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depositos</em>' container reference.
	 * @see #setDepositos(Depositos)
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDeposito_Depositos()
	 * @see gestionmodelosconsultas.sysinfo.network.Depositos#getDeposito
	 * @model opposite="Deposito"
	 * @generated
	 */
	Depositos getDepositos();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getDepositos <em>Depositos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depositos</em>' container reference.
	 * @see #getDepositos()
	 * @generated
	 */
	void setDepositos(Depositos value);

	/**
	 * Returns the value of the '<em><b>Copia</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getDeposito <em>Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copia</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copia</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDeposito_Copia()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getDeposito
	 * @model opposite="Deposito" required="true"
	 * @generated
	 */
	EList<Copia> getCopia();

	/**
	 * Returns the value of the '<em><b>Su Deposito</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.network.Deposito}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Deposito</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Deposito</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDeposito_SuDeposito()
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<Deposito> getSuDeposito();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getSuDeposito <em>Su Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Deposito)
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDeposito_Container()
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getSuDeposito
	 * @model opposite="suDeposito" required="true"
	 * @generated
	 */
	Deposito getContainer();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Deposito value);

	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getSusDepositos <em>Sus Depositos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #setUnidadOrganizacional(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDeposito_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getSusDepositos
	 * @model opposite="susDepositos"
	 * @generated
	 */
	UnidadOrganizacional getUnidadOrganizacional();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getUnidadOrganizacional <em>Unidad Organizacional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	void setUnidadOrganizacional(UnidadOrganizacional value);

} // Deposito
