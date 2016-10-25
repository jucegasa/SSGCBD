/**
 */
package gestionmodelosconsultas.sysinfo.network.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.network.Deposito;
import gestionmodelosconsultas.sysinfo.network.Depositos;
import gestionmodelosconsultas.sysinfo.network.NetworkPackage;

import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
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
 * An implementation of the model object '<em><b>Deposito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl#getDepositos <em>Depositos</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl#getCopia <em>Copia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl#getSuDeposito <em>Su Deposito</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepositoImpl extends PaqueteImpl implements Deposito {
	/**
	 * The cached value of the '{@link #getCopia() <em>Copia</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopia()
	 * @generated
	 * @ordered
	 */
	protected EList<Copia> copia;

	/**
	 * The cached value of the '{@link #getSuDeposito() <em>Su Deposito</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuDeposito()
	 * @generated
	 * @ordered
	 */
	protected EList<Deposito> suDeposito;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepositoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.DEPOSITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depositos getDepositos() {
		if (eContainerFeatureID() != NetworkPackage.DEPOSITO__DEPOSITOS) return null;
		return (Depositos)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepositos(Depositos newDepositos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepositos, NetworkPackage.DEPOSITO__DEPOSITOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepositos(Depositos newDepositos) {
		if (newDepositos != eInternalContainer() || (eContainerFeatureID() != NetworkPackage.DEPOSITO__DEPOSITOS && newDepositos != null)) {
			if (EcoreUtil.isAncestor(this, newDepositos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepositos != null)
				msgs = ((InternalEObject)newDepositos).eInverseAdd(this, NetworkPackage.DEPOSITOS__DEPOSITO, Depositos.class, msgs);
			msgs = basicSetDepositos(newDepositos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.DEPOSITO__DEPOSITOS, newDepositos, newDepositos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copia> getCopia() {
		if (copia == null) {
			copia = new EObjectWithInverseResolvingEList<Copia>(Copia.class, this, NetworkPackage.DEPOSITO__COPIA, DocmgtPackage.COPIA__DEPOSITO);
		}
		return copia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deposito> getSuDeposito() {
		if (suDeposito == null) {
			suDeposito = new EObjectContainmentWithInverseEList<Deposito>(Deposito.class, this, NetworkPackage.DEPOSITO__SU_DEPOSITO, NetworkPackage.DEPOSITO__CONTAINER);
		}
		return suDeposito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deposito getContainer() {
		if (eContainerFeatureID() != NetworkPackage.DEPOSITO__CONTAINER) return null;
		return (Deposito)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Deposito newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, NetworkPackage.DEPOSITO__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Deposito newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != NetworkPackage.DEPOSITO__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, NetworkPackage.DEPOSITO__SU_DEPOSITO, Deposito.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.DEPOSITO__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional getUnidadOrganizacional() {
		if (eContainerFeatureID() != NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL) return null;
		return (UnidadOrganizacional)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidadOrganizacional, NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional) {
		if (newUnidadOrganizacional != eInternalContainer() || (eContainerFeatureID() != NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL && newUnidadOrganizacional != null)) {
			if (EcoreUtil.isAncestor(this, newUnidadOrganizacional))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidadOrganizacional != null)
				msgs = ((InternalEObject)newUnidadOrganizacional).eInverseAdd(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS, UnidadOrganizacional.class, msgs);
			msgs = basicSetUnidadOrganizacional(newUnidadOrganizacional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL, newUnidadOrganizacional, newUnidadOrganizacional));
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
			case NetworkPackage.DEPOSITO__DEPOSITOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepositos((Depositos)otherEnd, msgs);
			case NetworkPackage.DEPOSITO__COPIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCopia()).basicAdd(otherEnd, msgs);
			case NetworkPackage.DEPOSITO__SU_DEPOSITO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuDeposito()).basicAdd(otherEnd, msgs);
			case NetworkPackage.DEPOSITO__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Deposito)otherEnd, msgs);
			case NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidadOrganizacional((UnidadOrganizacional)otherEnd, msgs);
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
			case NetworkPackage.DEPOSITO__DEPOSITOS:
				return basicSetDepositos(null, msgs);
			case NetworkPackage.DEPOSITO__COPIA:
				return ((InternalEList<?>)getCopia()).basicRemove(otherEnd, msgs);
			case NetworkPackage.DEPOSITO__SU_DEPOSITO:
				return ((InternalEList<?>)getSuDeposito()).basicRemove(otherEnd, msgs);
			case NetworkPackage.DEPOSITO__CONTAINER:
				return basicSetContainer(null, msgs);
			case NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL:
				return basicSetUnidadOrganizacional(null, msgs);
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
			case NetworkPackage.DEPOSITO__DEPOSITOS:
				return eInternalContainer().eInverseRemove(this, NetworkPackage.DEPOSITOS__DEPOSITO, Depositos.class, msgs);
			case NetworkPackage.DEPOSITO__CONTAINER:
				return eInternalContainer().eInverseRemove(this, NetworkPackage.DEPOSITO__SU_DEPOSITO, Deposito.class, msgs);
			case NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS, UnidadOrganizacional.class, msgs);
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
			case NetworkPackage.DEPOSITO__DEPOSITOS:
				return getDepositos();
			case NetworkPackage.DEPOSITO__COPIA:
				return getCopia();
			case NetworkPackage.DEPOSITO__SU_DEPOSITO:
				return getSuDeposito();
			case NetworkPackage.DEPOSITO__CONTAINER:
				return getContainer();
			case NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional();
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
			case NetworkPackage.DEPOSITO__DEPOSITOS:
				setDepositos((Depositos)newValue);
				return;
			case NetworkPackage.DEPOSITO__COPIA:
				getCopia().clear();
				getCopia().addAll((Collection<? extends Copia>)newValue);
				return;
			case NetworkPackage.DEPOSITO__SU_DEPOSITO:
				getSuDeposito().clear();
				getSuDeposito().addAll((Collection<? extends Deposito>)newValue);
				return;
			case NetworkPackage.DEPOSITO__CONTAINER:
				setContainer((Deposito)newValue);
				return;
			case NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)newValue);
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
			case NetworkPackage.DEPOSITO__DEPOSITOS:
				setDepositos((Depositos)null);
				return;
			case NetworkPackage.DEPOSITO__COPIA:
				getCopia().clear();
				return;
			case NetworkPackage.DEPOSITO__SU_DEPOSITO:
				getSuDeposito().clear();
				return;
			case NetworkPackage.DEPOSITO__CONTAINER:
				setContainer((Deposito)null);
				return;
			case NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)null);
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
			case NetworkPackage.DEPOSITO__DEPOSITOS:
				return getDepositos() != null;
			case NetworkPackage.DEPOSITO__COPIA:
				return copia != null && !copia.isEmpty();
			case NetworkPackage.DEPOSITO__SU_DEPOSITO:
				return suDeposito != null && !suDeposito.isEmpty();
			case NetworkPackage.DEPOSITO__CONTAINER:
				return getContainer() != null;
			case NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional() != null;
		}
		return super.eIsSet(featureID);
	}

} //DepositoImpl
