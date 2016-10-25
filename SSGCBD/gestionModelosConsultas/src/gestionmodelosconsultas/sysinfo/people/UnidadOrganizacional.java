/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;
import gestionmodelosconsultas.sysinfo.data.docmgt.Copias;

import gestionmodelosconsultas.sysinfo.function.InstanciaProceso;

import gestionmodelosconsultas.sysinfo.network.Deposito;
import gestionmodelosconsultas.sysinfo.network.Depositos;
import gestionmodelosconsultas.sysinfo.network.Edificio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unidad Organizacional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRol <em>Rol</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getOrganizacion <em>Organizacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getEdificio <em>Edificio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidadPadre <em>Unidad Padre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getActor <em>Actor</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getTheActores <em>The Actores</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRoles <em>Roles</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getDepositos <em>Depositos</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopias <em>Copias</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopia <em>Copia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getSusDepositos <em>Sus Depositos</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getInstanciacionesprocesos <em>Instanciacionesprocesos</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional()
 * @model
 * @generated
 */
public interface UnidadOrganizacional extends Quien {
	/**
	 * Returns the value of the '<em><b>Rol</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Rol}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Rol#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Rol()
	 * @see gestionmodelosconsultas.sysinfo.people.Rol#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true" required="true"
	 * @generated
	 */
	EList<Rol> getRol();

	/**
	 * Returns the value of the '<em><b>Organizacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Organizacion#getOrganizacion <em>Organizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizacion</em>' container reference.
	 * @see #setOrganizacion(Organizacion)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Organizacion()
	 * @see gestionmodelosconsultas.sysinfo.people.Organizacion#getOrganizacion
	 * @model opposite="organizacion"
	 * @generated
	 */
	Organizacion getOrganizacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getOrganizacion <em>Organizacion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizacion</em>' container reference.
	 * @see #getOrganizacion()
	 * @generated
	 */
	void setOrganizacion(Organizacion value);

	/**
	 * Returns the value of the '<em><b>Edificio</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.network.Edificio}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Edificio#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edificio</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edificio</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Edificio()
	 * @see gestionmodelosconsultas.sysinfo.network.Edificio#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" required="true"
	 * @generated
	 */
	EList<Edificio> getEdificio();

	/**
	 * Returns the value of the '<em><b>Unidad</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidadPadre <em>Unidad Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Unidad()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidadPadre
	 * @model opposite="unidadPadre" containment="true" required="true"
	 * @generated
	 */
	EList<UnidadOrganizacional> getUnidad();

	/**
	 * Returns the value of the '<em><b>Unidad Padre</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Padre</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Padre</em>' container reference.
	 * @see #setUnidadPadre(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_UnidadPadre()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidad
	 * @model opposite="unidad"
	 * @generated
	 */
	UnidadOrganizacional getUnidadPadre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidadPadre <em>Unidad Padre</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Padre</em>' container reference.
	 * @see #getUnidadPadre()
	 * @generated
	 */
	void setUnidadPadre(UnidadOrganizacional value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Actor}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Actor#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Actor()
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getUnidad
	 * @model opposite="unidad" containment="true" required="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>The Actores</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Actores#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Actores</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Actores</em>' containment reference.
	 * @see #setTheActores(Actores)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_TheActores()
	 * @see gestionmodelosconsultas.sysinfo.people.Actores#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true" required="true"
	 * @generated
	 */
	Actores getTheActores();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getTheActores <em>The Actores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Actores</em>' containment reference.
	 * @see #getTheActores()
	 * @generated
	 */
	void setTheActores(Actores value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Roles#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(Roles)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Roles()
	 * @see gestionmodelosconsultas.sysinfo.people.Roles#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true" required="true"
	 * @generated
	 */
	Roles getRoles();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(Roles value);

	/**
	 * Returns the value of the '<em><b>Depositos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Depositos#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depositos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depositos</em>' containment reference.
	 * @see #setDepositos(Depositos)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Depositos()
	 * @see gestionmodelosconsultas.sysinfo.network.Depositos#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true" required="true"
	 * @generated
	 */
	Depositos getDepositos();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getDepositos <em>Depositos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depositos</em>' containment reference.
	 * @see #getDepositos()
	 * @generated
	 */
	void setDepositos(Depositos value);

	/**
	 * Returns the value of the '<em><b>Copias</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copias</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copias</em>' containment reference.
	 * @see #setCopias(Copias)
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Copias()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true" required="true"
	 * @generated
	 */
	Copias getCopias();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopias <em>Copias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copias</em>' containment reference.
	 * @see #getCopias()
	 * @generated
	 */
	void setCopias(Copias value);

	/**
	 * Returns the value of the '<em><b>Copia</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copia</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Copia()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true" required="true"
	 * @generated
	 */
	EList<Copia> getCopia();

	/**
	 * Returns the value of the '<em><b>Sus Depositos</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.network.Deposito}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sus Depositos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sus Depositos</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_SusDepositos()
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true" required="true"
	 * @generated
	 */
	EList<Deposito> getSusDepositos();

	/**
	 * Returns the value of the '<em><b>Instanciacionesprocesos</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instanciacionesprocesos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanciacionesprocesos</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#getUnidadOrganizacional_Instanciacionesprocesos()
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getUnidadOrganizacional
	 * @model opposite="UnidadOrganizacional" containment="true"
	 * @generated
	 */
	EList<InstanciaProceso> getInstanciacionesprocesos();

} // UnidadOrganizacional
