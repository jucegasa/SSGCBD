/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;
import gestionmodelosconsultas.sysinfo.data.docmgt.Copias;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;

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
 * An implementation of the model object '<em><b>Copias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiasImpl#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiasImpl#getCopia <em>Copia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopiasImpl extends MinimalEObjectImpl.Container implements Copias {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopiasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.COPIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional getUnidadOrganizacional() {
		if (eContainerFeatureID() != DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL) return null;
		return (UnidadOrganizacional)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidadOrganizacional, DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional) {
		if (newUnidadOrganizacional != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL && newUnidadOrganizacional != null)) {
			if (EcoreUtil.isAncestor(this, newUnidadOrganizacional))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidadOrganizacional != null)
				msgs = ((InternalEObject)newUnidadOrganizacional).eInverseAdd(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS, UnidadOrganizacional.class, msgs);
			msgs = basicSetUnidadOrganizacional(newUnidadOrganizacional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL, newUnidadOrganizacional, newUnidadOrganizacional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copia> getCopia() {
		if (copia == null) {
			copia = new EObjectContainmentWithInverseEList<Copia>(Copia.class, this, DocmgtPackage.COPIAS__COPIA, DocmgtPackage.COPIA__COPIAS);
		}
		return copia;
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
			case DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidadOrganizacional((UnidadOrganizacional)otherEnd, msgs);
			case DocmgtPackage.COPIAS__COPIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCopia()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL:
				return basicSetUnidadOrganizacional(null, msgs);
			case DocmgtPackage.COPIAS__COPIA:
				return ((InternalEList<?>)getCopia()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS, UnidadOrganizacional.class, msgs);
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
			case DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional();
			case DocmgtPackage.COPIAS__COPIA:
				return getCopia();
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
			case DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)newValue);
				return;
			case DocmgtPackage.COPIAS__COPIA:
				getCopia().clear();
				getCopia().addAll((Collection<? extends Copia>)newValue);
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
			case DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)null);
				return;
			case DocmgtPackage.COPIAS__COPIA:
				getCopia().clear();
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
			case DocmgtPackage.COPIAS__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional() != null;
			case DocmgtPackage.COPIAS__COPIA:
				return copia != null && !copia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CopiasImpl
