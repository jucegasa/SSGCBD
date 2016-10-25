/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.sysinfo.people.Actor;
import gestionmodelosconsultas.sysinfo.people.Actores;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ActoresImpl#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ActoresImpl#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActoresImpl extends MinimalEObjectImpl.Container implements Actores {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActoresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeoplePackage.Literals.ACTORES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional getUnidadOrganizacional() {
		if (eContainerFeatureID() != PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL) return null;
		return (UnidadOrganizacional)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidadOrganizacional, PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional) {
		if (newUnidadOrganizacional != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL && newUnidadOrganizacional != null)) {
			if (EcoreUtil.isAncestor(this, newUnidadOrganizacional))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidadOrganizacional != null)
				msgs = ((InternalEObject)newUnidadOrganizacional).eInverseAdd(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES, UnidadOrganizacional.class, msgs);
			msgs = basicSetUnidadOrganizacional(newUnidadOrganizacional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL, newUnidadOrganizacional, newUnidadOrganizacional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentWithInverseEList<Actor>(Actor.class, this, PeoplePackage.ACTORES__ACTOR, PeoplePackage.ACTOR__ACTORES);
		}
		return actor;
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
			case PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidadOrganizacional((UnidadOrganizacional)otherEnd, msgs);
			case PeoplePackage.ACTORES__ACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActor()).basicAdd(otherEnd, msgs);
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
			case PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL:
				return basicSetUnidadOrganizacional(null, msgs);
			case PeoplePackage.ACTORES__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
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
			case PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES, UnidadOrganizacional.class, msgs);
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
			case PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional();
			case PeoplePackage.ACTORES__ACTOR:
				return getActor();
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
			case PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)newValue);
				return;
			case PeoplePackage.ACTORES__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
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
			case PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)null);
				return;
			case PeoplePackage.ACTORES__ACTOR:
				getActor().clear();
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
			case PeoplePackage.ACTORES__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional() != null;
			case PeoplePackage.ACTORES__ACTOR:
				return actor != null && !actor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActoresImpl
