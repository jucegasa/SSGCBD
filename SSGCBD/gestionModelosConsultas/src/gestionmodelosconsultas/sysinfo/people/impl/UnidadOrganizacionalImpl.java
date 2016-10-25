/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;
import gestionmodelosconsultas.sysinfo.data.docmgt.Copias;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;

import gestionmodelosconsultas.sysinfo.function.FunctionPackage;
import gestionmodelosconsultas.sysinfo.function.InstanciaProceso;

import gestionmodelosconsultas.sysinfo.network.Deposito;
import gestionmodelosconsultas.sysinfo.network.Depositos;
import gestionmodelosconsultas.sysinfo.network.Edificio;
import gestionmodelosconsultas.sysinfo.network.NetworkPackage;

import gestionmodelosconsultas.sysinfo.people.Actor;
import gestionmodelosconsultas.sysinfo.people.Actores;
import gestionmodelosconsultas.sysinfo.people.Organizacion;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.Rol;
import gestionmodelosconsultas.sysinfo.people.Roles;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unidad Organizacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getOrganizacion <em>Organizacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getEdificio <em>Edificio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getUnidadPadre <em>Unidad Padre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getTheActores <em>The Actores</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getDepositos <em>Depositos</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getCopias <em>Copias</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getCopia <em>Copia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getSusDepositos <em>Sus Depositos</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl#getInstanciacionesprocesos <em>Instanciacionesprocesos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnidadOrganizacionalImpl extends QuienImpl implements UnidadOrganizacional {
	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> rol;

	/**
	 * The cached value of the '{@link #getEdificio() <em>Edificio</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdificio()
	 * @generated
	 * @ordered
	 */
	protected EList<Edificio> edificio;

	/**
	 * The cached value of the '{@link #getUnidad() <em>Unidad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidad()
	 * @generated
	 * @ordered
	 */
	protected EList<UnidadOrganizacional> unidad;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getTheActores() <em>The Actores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheActores()
	 * @generated
	 * @ordered
	 */
	protected Actores theActores;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected Roles roles;

	/**
	 * The cached value of the '{@link #getDepositos() <em>Depositos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositos()
	 * @generated
	 * @ordered
	 */
	protected Depositos depositos;

	/**
	 * The cached value of the '{@link #getCopias() <em>Copias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopias()
	 * @generated
	 * @ordered
	 */
	protected Copias copias;

	/**
	 * The cached value of the '{@link #getCopia() <em>Copia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopia()
	 * @generated
	 * @ordered
	 */
	protected EList<Copia> copia;

	/**
	 * The cached value of the '{@link #getSusDepositos() <em>Sus Depositos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSusDepositos()
	 * @generated
	 * @ordered
	 */
	protected EList<Deposito> susDepositos;

	/**
	 * The cached value of the '{@link #getInstanciacionesprocesos() <em>Instanciacionesprocesos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanciacionesprocesos()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanciaProceso> instanciacionesprocesos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnidadOrganizacionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getRol() {
		if (rol == null) {
			rol = new EObjectContainmentWithInverseEList<Rol>(Rol.class, this, PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL, PeoplePackage.ROL__UNIDAD_ORGANIZACIONAL);
		}
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizacion getOrganizacion() {
		if (eContainerFeatureID() != PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION) return null;
		return (Organizacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizacion(Organizacion newOrganizacion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganizacion, PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizacion(Organizacion newOrganizacion) {
		if (newOrganizacion != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION && newOrganizacion != null)) {
			if (EcoreUtil.isAncestor(this, newOrganizacion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganizacion != null)
				msgs = ((InternalEObject)newOrganizacion).eInverseAdd(this, PeoplePackage.ORGANIZACION__ORGANIZACION, Organizacion.class, msgs);
			msgs = basicSetOrganizacion(newOrganizacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION, newOrganizacion, newOrganizacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edificio> getEdificio() {
		if (edificio == null) {
			edificio = new EObjectWithInverseResolvingEList.ManyInverse<Edificio>(Edificio.class, this, PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO, NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL);
		}
		return edificio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnidadOrganizacional> getUnidad() {
		if (unidad == null) {
			unidad = new EObjectContainmentWithInverseEList<UnidadOrganizacional>(UnidadOrganizacional.class, this, PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD, PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE);
		}
		return unidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional getUnidadPadre() {
		if (eContainerFeatureID() != PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE) return null;
		return (UnidadOrganizacional)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadPadre(UnidadOrganizacional newUnidadPadre, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidadPadre, PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadPadre(UnidadOrganizacional newUnidadPadre) {
		if (newUnidadPadre != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE && newUnidadPadre != null)) {
			if (EcoreUtil.isAncestor(this, newUnidadPadre))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidadPadre != null)
				msgs = ((InternalEObject)newUnidadPadre).eInverseAdd(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD, UnidadOrganizacional.class, msgs);
			msgs = basicSetUnidadPadre(newUnidadPadre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE, newUnidadPadre, newUnidadPadre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentWithInverseEList<Actor>(Actor.class, this, PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR, PeoplePackage.ACTOR__UNIDAD);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actores getTheActores() {
		return theActores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheActores(Actores newTheActores, NotificationChain msgs) {
		Actores oldTheActores = theActores;
		theActores = newTheActores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES, oldTheActores, newTheActores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheActores(Actores newTheActores) {
		if (newTheActores != theActores) {
			NotificationChain msgs = null;
			if (theActores != null)
				msgs = ((InternalEObject)theActores).eInverseRemove(this, PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL, Actores.class, msgs);
			if (newTheActores != null)
				msgs = ((InternalEObject)newTheActores).eInverseAdd(this, PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL, Actores.class, msgs);
			msgs = basicSetTheActores(newTheActores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES, newTheActores, newTheActores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(Roles newRoles, NotificationChain msgs) {
		Roles oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(Roles newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, PeoplePackage.ROLES__UNIDAD_ORGANIZACIONAL, Roles.class, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, PeoplePackage.ROLES__UNIDAD_ORGANIZACIONAL, Roles.class, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depositos getDepositos() {
		return depositos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepositos(Depositos newDepositos, NotificationChain msgs) {
		Depositos oldDepositos = depositos;
		depositos = newDepositos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS, oldDepositos, newDepositos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepositos(Depositos newDepositos) {
		if (newDepositos != depositos) {
			NotificationChain msgs = null;
			if (depositos != null)
				msgs = ((InternalEObject)depositos).eInverseRemove(this, NetworkPackage.DEPOSITOS__UNIDAD_ORGANIZACIONAL, Depositos.class, msgs);
			if (newDepositos != null)
				msgs = ((InternalEObject)newDepositos).eInverseAdd(this, NetworkPackage.DEPOSITOS__UNIDAD_ORGANIZACIONAL, Depositos.class, msgs);
			msgs = basicSetDepositos(newDepositos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS, newDepositos, newDepositos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copias getCopias() {
		return copias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopias(Copias newCopias, NotificationChain msgs) {
		Copias oldCopias = copias;
		copias = newCopias;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS, oldCopias, newCopias);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopias(Copias newCopias) {
		if (newCopias != copias) {
			NotificationChain msgs = null;
			if (copias != null)
				msgs = ((InternalEObject)copias).eInverseRemove(this, DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL, Copias.class, msgs);
			if (newCopias != null)
				msgs = ((InternalEObject)newCopias).eInverseAdd(this, DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL, Copias.class, msgs);
			msgs = basicSetCopias(newCopias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS, newCopias, newCopias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copia> getCopia() {
		if (copia == null) {
			copia = new EObjectContainmentWithInverseEList<Copia>(Copia.class, this, PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA, DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL);
		}
		return copia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deposito> getSusDepositos() {
		if (susDepositos == null) {
			susDepositos = new EObjectContainmentWithInverseEList<Deposito>(Deposito.class, this, PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS, NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL);
		}
		return susDepositos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanciaProceso> getInstanciacionesprocesos() {
		if (instanciacionesprocesos == null) {
			instanciacionesprocesos = new EObjectContainmentWithInverseEList<InstanciaProceso>(InstanciaProceso.class, this, PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS, FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL);
		}
		return instanciacionesprocesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRol()).basicAdd(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganizacion((Organizacion)otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdificio()).basicAdd(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnidad()).basicAdd(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidadPadre((UnidadOrganizacional)otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActor()).basicAdd(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES:
				if (theActores != null)
					msgs = ((InternalEObject)theActores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES, null, msgs);
				return basicSetTheActores((Actores)otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES:
				if (roles != null)
					msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES, null, msgs);
				return basicSetRoles((Roles)otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS:
				if (depositos != null)
					msgs = ((InternalEObject)depositos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS, null, msgs);
				return basicSetDepositos((Depositos)otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS:
				if (copias != null)
					msgs = ((InternalEObject)copias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS, null, msgs);
				return basicSetCopias((Copias)otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCopia()).basicAdd(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSusDepositos()).basicAdd(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstanciacionesprocesos()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL:
				return ((InternalEList<?>)getRol()).basicRemove(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION:
				return basicSetOrganizacion(null, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO:
				return ((InternalEList<?>)getEdificio()).basicRemove(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD:
				return ((InternalEList<?>)getUnidad()).basicRemove(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE:
				return basicSetUnidadPadre(null, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES:
				return basicSetTheActores(null, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES:
				return basicSetRoles(null, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS:
				return basicSetDepositos(null, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS:
				return basicSetCopias(null, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA:
				return ((InternalEList<?>)getCopia()).basicRemove(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS:
				return ((InternalEList<?>)getSusDepositos()).basicRemove(otherEnd, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS:
				return ((InternalEList<?>)getInstanciacionesprocesos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.ORGANIZACION__ORGANIZACION, Organizacion.class, msgs);
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD, UnidadOrganizacional.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL:
				return getRol();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION:
				return getOrganizacion();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO:
				return getEdificio();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD:
				return getUnidad();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE:
				return getUnidadPadre();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR:
				return getActor();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES:
				return getTheActores();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES:
				return getRoles();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS:
				return getDepositos();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS:
				return getCopias();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA:
				return getCopia();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS:
				return getSusDepositos();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS:
				return getInstanciacionesprocesos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL:
				getRol().clear();
				getRol().addAll((Collection<? extends Rol>)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION:
				setOrganizacion((Organizacion)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO:
				getEdificio().clear();
				getEdificio().addAll((Collection<? extends Edificio>)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD:
				getUnidad().clear();
				getUnidad().addAll((Collection<? extends UnidadOrganizacional>)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE:
				setUnidadPadre((UnidadOrganizacional)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES:
				setTheActores((Actores)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES:
				setRoles((Roles)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS:
				setDepositos((Depositos)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS:
				setCopias((Copias)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA:
				getCopia().clear();
				getCopia().addAll((Collection<? extends Copia>)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS:
				getSusDepositos().clear();
				getSusDepositos().addAll((Collection<? extends Deposito>)newValue);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS:
				getInstanciacionesprocesos().clear();
				getInstanciacionesprocesos().addAll((Collection<? extends InstanciaProceso>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL:
				getRol().clear();
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION:
				setOrganizacion((Organizacion)null);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO:
				getEdificio().clear();
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD:
				getUnidad().clear();
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE:
				setUnidadPadre((UnidadOrganizacional)null);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR:
				getActor().clear();
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES:
				setTheActores((Actores)null);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES:
				setRoles((Roles)null);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS:
				setDepositos((Depositos)null);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS:
				setCopias((Copias)null);
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA:
				getCopia().clear();
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS:
				getSusDepositos().clear();
				return;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS:
				getInstanciacionesprocesos().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL:
				return rol != null && !rol.isEmpty();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION:
				return getOrganizacion() != null;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO:
				return edificio != null && !edificio.isEmpty();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD:
				return unidad != null && !unidad.isEmpty();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE:
				return getUnidadPadre() != null;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR:
				return actor != null && !actor.isEmpty();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES:
				return theActores != null;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES:
				return roles != null;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS:
				return depositos != null;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS:
				return copias != null;
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA:
				return copia != null && !copia.isEmpty();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS:
				return susDepositos != null && !susDepositos.isEmpty();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS:
				return instanciacionesprocesos != null && !instanciacionesprocesos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnidadOrganizacionalImpl
