/**
 */
package gestionmodelosconsultas.sysinfo.network.impl;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.network.Edificio;
import gestionmodelosconsultas.sysinfo.network.NetworkPackage;
import gestionmodelosconsultas.sysinfo.network.Network_View;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.impl.Network_ViewImpl#getEdificio <em>Edificio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Network_ViewImpl extends PaqueteImpl implements Network_View {
	/**
	 * The cached value of the '{@link #getEdificio() <em>Edificio</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdificio()
	 * @generated
	 * @ordered
	 */
	protected EList<Edificio> edificio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Network_ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.NETWORK_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edificio> getEdificio() {
		if (edificio == null) {
			edificio = new EObjectContainmentWithInverseEList<Edificio>(Edificio.class, this, NetworkPackage.NETWORK_VIEW__EDIFICIO, NetworkPackage.EDIFICIO__NETWORK_VIEW);
		}
		return edificio;
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
			case NetworkPackage.NETWORK_VIEW__EDIFICIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdificio()).basicAdd(otherEnd, msgs);
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
			case NetworkPackage.NETWORK_VIEW__EDIFICIO:
				return ((InternalEList<?>)getEdificio()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.NETWORK_VIEW__EDIFICIO:
				return getEdificio();
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
			case NetworkPackage.NETWORK_VIEW__EDIFICIO:
				getEdificio().clear();
				getEdificio().addAll((Collection<? extends Edificio>)newValue);
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
			case NetworkPackage.NETWORK_VIEW__EDIFICIO:
				getEdificio().clear();
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
			case NetworkPackage.NETWORK_VIEW__EDIFICIO:
				return edificio != null && !edificio.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Network_ViewImpl
