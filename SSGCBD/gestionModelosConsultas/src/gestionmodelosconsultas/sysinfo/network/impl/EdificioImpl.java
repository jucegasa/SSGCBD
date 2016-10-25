/**
 */
package gestionmodelosconsultas.sysinfo.network.impl;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.network.Edificio;
import gestionmodelosconsultas.sysinfo.network.NetworkPackage;
import gestionmodelosconsultas.sysinfo.network.Network_View;

import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
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
 * An implementation of the model object '<em><b>Edificio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.EdificioImpl#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.EdificioImpl#getNetwork_View <em>Network View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdificioImpl extends PaqueteImpl implements Edificio {
	/**
	 * The cached value of the '{@link #getUnidadOrganizacional() <em>Unidad Organizacional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidadOrganizacional()
	 * @generated
	 * @ordered
	 */
	protected EList<UnidadOrganizacional> unidadOrganizacional;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdificioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.EDIFICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnidadOrganizacional> getUnidadOrganizacional() {
		if (unidadOrganizacional == null) {
			unidadOrganizacional = new EObjectWithInverseResolvingEList.ManyInverse<UnidadOrganizacional>(UnidadOrganizacional.class, this, NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL, PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO);
		}
		return unidadOrganizacional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network_View getNetwork_View() {
		if (eContainerFeatureID() != NetworkPackage.EDIFICIO__NETWORK_VIEW) return null;
		return (Network_View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork_View(Network_View newNetwork_View, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNetwork_View, NetworkPackage.EDIFICIO__NETWORK_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork_View(Network_View newNetwork_View) {
		if (newNetwork_View != eInternalContainer() || (eContainerFeatureID() != NetworkPackage.EDIFICIO__NETWORK_VIEW && newNetwork_View != null)) {
			if (EcoreUtil.isAncestor(this, newNetwork_View))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNetwork_View != null)
				msgs = ((InternalEObject)newNetwork_View).eInverseAdd(this, NetworkPackage.NETWORK_VIEW__EDIFICIO, Network_View.class, msgs);
			msgs = basicSetNetwork_View(newNetwork_View, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDIFICIO__NETWORK_VIEW, newNetwork_View, newNetwork_View));
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
			case NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnidadOrganizacional()).basicAdd(otherEnd, msgs);
			case NetworkPackage.EDIFICIO__NETWORK_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNetwork_View((Network_View)otherEnd, msgs);
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
			case NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL:
				return ((InternalEList<?>)getUnidadOrganizacional()).basicRemove(otherEnd, msgs);
			case NetworkPackage.EDIFICIO__NETWORK_VIEW:
				return basicSetNetwork_View(null, msgs);
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
			case NetworkPackage.EDIFICIO__NETWORK_VIEW:
				return eInternalContainer().eInverseRemove(this, NetworkPackage.NETWORK_VIEW__EDIFICIO, Network_View.class, msgs);
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
			case NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional();
			case NetworkPackage.EDIFICIO__NETWORK_VIEW:
				return getNetwork_View();
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
			case NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL:
				getUnidadOrganizacional().clear();
				getUnidadOrganizacional().addAll((Collection<? extends UnidadOrganizacional>)newValue);
				return;
			case NetworkPackage.EDIFICIO__NETWORK_VIEW:
				setNetwork_View((Network_View)newValue);
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
			case NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL:
				getUnidadOrganizacional().clear();
				return;
			case NetworkPackage.EDIFICIO__NETWORK_VIEW:
				setNetwork_View((Network_View)null);
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
			case NetworkPackage.EDIFICIO__UNIDAD_ORGANIZACIONAL:
				return unidadOrganizacional != null && !unidadOrganizacional.isEmpty();
			case NetworkPackage.EDIFICIO__NETWORK_VIEW:
				return getNetwork_View() != null;
		}
		return super.eIsSet(featureID);
	}

} //EdificioImpl
