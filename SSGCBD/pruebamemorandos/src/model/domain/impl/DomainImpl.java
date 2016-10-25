/**
 */
package model.domain.impl;

import model.FactoryModel;
import model.ModelPackage;

import model.domain.Domain;
import model.domain.DomainPackage;

import model.uimanager.UIManager;
import model.uimanager.UimanagerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.domain.impl.DomainImpl#getOwnedByFactoryModel <em>Owned By Factory Model</em>}</li>
 *   <li>{@link model.domain.impl.DomainImpl#getTheUIManager <em>The UI Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getTheUIManager() <em>The UI Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUIManager()
	 * @generated
	 * @ordered
	 */
	protected UIManager theUIManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryModel getOwnedByFactoryModel() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL) return null;
		return (FactoryModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByFactoryModel(FactoryModel newOwnedByFactoryModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByFactoryModel, DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByFactoryModel(FactoryModel newOwnedByFactoryModel) {
		if (newOwnedByFactoryModel != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL && newOwnedByFactoryModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByFactoryModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByFactoryModel != null)
				msgs = ((InternalEObject)newOwnedByFactoryModel).eInverseAdd(this, ModelPackage.FACTORY_MODEL__THE_DOMAIN, FactoryModel.class, msgs);
			msgs = basicSetOwnedByFactoryModel(newOwnedByFactoryModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL, newOwnedByFactoryModel, newOwnedByFactoryModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIManager getTheUIManager() {
		if (theUIManager != null && theUIManager.eIsProxy()) {
			InternalEObject oldTheUIManager = (InternalEObject)theUIManager;
			theUIManager = (UIManager)eResolveProxy(oldTheUIManager);
			if (theUIManager != oldTheUIManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__THE_UI_MANAGER, oldTheUIManager, theUIManager));
			}
		}
		return theUIManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIManager basicGetTheUIManager() {
		return theUIManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUIManager(UIManager newTheUIManager, NotificationChain msgs) {
		UIManager oldTheUIManager = theUIManager;
		theUIManager = newTheUIManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI_MANAGER, oldTheUIManager, newTheUIManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUIManager(UIManager newTheUIManager) {
		if (newTheUIManager != theUIManager) {
			NotificationChain msgs = null;
			if (theUIManager != null)
				msgs = ((InternalEObject)theUIManager).eInverseRemove(this, UimanagerPackage.UI_MANAGER__THE_DOMAIN, UIManager.class, msgs);
			if (newTheUIManager != null)
				msgs = ((InternalEObject)newTheUIManager).eInverseAdd(this, UimanagerPackage.UI_MANAGER__THE_DOMAIN, UIManager.class, msgs);
			msgs = basicSetTheUIManager(newTheUIManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI_MANAGER, newTheUIManager, newTheUIManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByFactoryModel((FactoryModel)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI_MANAGER:
				if (theUIManager != null)
					msgs = ((InternalEObject)theUIManager).eInverseRemove(this, UimanagerPackage.UI_MANAGER__THE_DOMAIN, UIManager.class, msgs);
				return basicSetTheUIManager((UIManager)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL:
				return basicSetOwnedByFactoryModel(null, msgs);
			case DomainPackage.DOMAIN__THE_UI_MANAGER:
				return basicSetTheUIManager(null, msgs);
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
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL:
				return eInternalContainer().eInverseRemove(this, ModelPackage.FACTORY_MODEL__THE_DOMAIN, FactoryModel.class, msgs);
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
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL:
				return getOwnedByFactoryModel();
			case DomainPackage.DOMAIN__THE_UI_MANAGER:
				if (resolve) return getTheUIManager();
				return basicGetTheUIManager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL:
				setOwnedByFactoryModel((FactoryModel)newValue);
				return;
			case DomainPackage.DOMAIN__THE_UI_MANAGER:
				setTheUIManager((UIManager)newValue);
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
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL:
				setOwnedByFactoryModel((FactoryModel)null);
				return;
			case DomainPackage.DOMAIN__THE_UI_MANAGER:
				setTheUIManager((UIManager)null);
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
			case DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL:
				return getOwnedByFactoryModel() != null;
			case DomainPackage.DOMAIN__THE_UI_MANAGER:
				return theUIManager != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
