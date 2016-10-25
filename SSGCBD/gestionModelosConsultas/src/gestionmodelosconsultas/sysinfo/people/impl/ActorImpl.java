/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.sysinfo.function.Actividad;
import gestionmodelosconsultas.sysinfo.function.FunctionPackage;
import gestionmodelosconsultas.sysinfo.function.InstanciaProceso;

import gestionmodelosconsultas.sysinfo.people.Actor;
import gestionmodelosconsultas.sysinfo.people.Actores;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.Rol;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ActorImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ActorImpl#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ActorImpl#getActores <em>Actores</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ActorImpl#getEjecuta <em>Ejecuta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ActorImpl#getProcesosResponsable <em>Procesos Responsable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends QuienImpl implements Actor {
	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> rol;

	/**
	 * The cached value of the '{@link #getEjecuta() <em>Ejecuta</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjecuta()
	 * @generated
	 * @ordered
	 */
	protected EList<Actividad> ejecuta;

	/**
	 * The cached value of the '{@link #getProcesosResponsable() <em>Procesos Responsable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesosResponsable()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanciaProceso> procesosResponsable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeoplePackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getRol() {
		if (rol == null) {
			rol = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this, PeoplePackage.ACTOR__ROL, PeoplePackage.ROL__ACTOR);
		}
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional getUnidad() {
		if (eContainerFeatureID() != PeoplePackage.ACTOR__UNIDAD) return null;
		return (UnidadOrganizacional)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidad(UnidadOrganizacional newUnidad, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidad, PeoplePackage.ACTOR__UNIDAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidad(UnidadOrganizacional newUnidad) {
		if (newUnidad != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.ACTOR__UNIDAD && newUnidad != null)) {
			if (EcoreUtil.isAncestor(this, newUnidad))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidad != null)
				msgs = ((InternalEObject)newUnidad).eInverseAdd(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR, UnidadOrganizacional.class, msgs);
			msgs = basicSetUnidad(newUnidad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.ACTOR__UNIDAD, newUnidad, newUnidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actores getActores() {
		if (eContainerFeatureID() != PeoplePackage.ACTOR__ACTORES) return null;
		return (Actores)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActores(Actores newActores, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActores, PeoplePackage.ACTOR__ACTORES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActores(Actores newActores) {
		if (newActores != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.ACTOR__ACTORES && newActores != null)) {
			if (EcoreUtil.isAncestor(this, newActores))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActores != null)
				msgs = ((InternalEObject)newActores).eInverseAdd(this, PeoplePackage.ACTORES__ACTOR, Actores.class, msgs);
			msgs = basicSetActores(newActores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.ACTOR__ACTORES, newActores, newActores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actividad> getEjecuta() {
		if (ejecuta == null) {
			ejecuta = new EObjectWithInverseResolvingEList.ManyInverse<Actividad>(Actividad.class, this, PeoplePackage.ACTOR__EJECUTA, FunctionPackage.ACTIVIDAD__EJECUTANTES);
		}
		return ejecuta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanciaProceso> getProcesosResponsable() {
		if (procesosResponsable == null) {
			procesosResponsable = new EObjectWithInverseResolvingEList<InstanciaProceso>(InstanciaProceso.class, this, PeoplePackage.ACTOR__PROCESOS_RESPONSABLE, FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE);
		}
		return procesosResponsable;
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
			case PeoplePackage.ACTOR__ROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRol()).basicAdd(otherEnd, msgs);
			case PeoplePackage.ACTOR__UNIDAD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidad((UnidadOrganizacional)otherEnd, msgs);
			case PeoplePackage.ACTOR__ACTORES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActores((Actores)otherEnd, msgs);
			case PeoplePackage.ACTOR__EJECUTA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEjecuta()).basicAdd(otherEnd, msgs);
			case PeoplePackage.ACTOR__PROCESOS_RESPONSABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesosResponsable()).basicAdd(otherEnd, msgs);
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
			case PeoplePackage.ACTOR__ROL:
				return ((InternalEList<?>)getRol()).basicRemove(otherEnd, msgs);
			case PeoplePackage.ACTOR__UNIDAD:
				return basicSetUnidad(null, msgs);
			case PeoplePackage.ACTOR__ACTORES:
				return basicSetActores(null, msgs);
			case PeoplePackage.ACTOR__EJECUTA:
				return ((InternalEList<?>)getEjecuta()).basicRemove(otherEnd, msgs);
			case PeoplePackage.ACTOR__PROCESOS_RESPONSABLE:
				return ((InternalEList<?>)getProcesosResponsable()).basicRemove(otherEnd, msgs);
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
			case PeoplePackage.ACTOR__UNIDAD:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR, UnidadOrganizacional.class, msgs);
			case PeoplePackage.ACTOR__ACTORES:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.ACTORES__ACTOR, Actores.class, msgs);
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
			case PeoplePackage.ACTOR__ROL:
				return getRol();
			case PeoplePackage.ACTOR__UNIDAD:
				return getUnidad();
			case PeoplePackage.ACTOR__ACTORES:
				return getActores();
			case PeoplePackage.ACTOR__EJECUTA:
				return getEjecuta();
			case PeoplePackage.ACTOR__PROCESOS_RESPONSABLE:
				return getProcesosResponsable();
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
			case PeoplePackage.ACTOR__ROL:
				getRol().clear();
				getRol().addAll((Collection<? extends Rol>)newValue);
				return;
			case PeoplePackage.ACTOR__UNIDAD:
				setUnidad((UnidadOrganizacional)newValue);
				return;
			case PeoplePackage.ACTOR__ACTORES:
				setActores((Actores)newValue);
				return;
			case PeoplePackage.ACTOR__EJECUTA:
				getEjecuta().clear();
				getEjecuta().addAll((Collection<? extends Actividad>)newValue);
				return;
			case PeoplePackage.ACTOR__PROCESOS_RESPONSABLE:
				getProcesosResponsable().clear();
				getProcesosResponsable().addAll((Collection<? extends InstanciaProceso>)newValue);
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
			case PeoplePackage.ACTOR__ROL:
				getRol().clear();
				return;
			case PeoplePackage.ACTOR__UNIDAD:
				setUnidad((UnidadOrganizacional)null);
				return;
			case PeoplePackage.ACTOR__ACTORES:
				setActores((Actores)null);
				return;
			case PeoplePackage.ACTOR__EJECUTA:
				getEjecuta().clear();
				return;
			case PeoplePackage.ACTOR__PROCESOS_RESPONSABLE:
				getProcesosResponsable().clear();
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
			case PeoplePackage.ACTOR__ROL:
				return rol != null && !rol.isEmpty();
			case PeoplePackage.ACTOR__UNIDAD:
				return getUnidad() != null;
			case PeoplePackage.ACTOR__ACTORES:
				return getActores() != null;
			case PeoplePackage.ACTOR__EJECUTA:
				return ejecuta != null && !ejecuta.isEmpty();
			case PeoplePackage.ACTOR__PROCESOS_RESPONSABLE:
				return procesosResponsable != null && !procesosResponsable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
