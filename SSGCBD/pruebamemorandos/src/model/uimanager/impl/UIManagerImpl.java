/**
 */
package model.uimanager.impl;

import model.FactoryModel;
import model.ModelPackage;

import model.domain.Domain;
import model.domain.DomainPackage;

import model.uimanager.UIManager;
import model.uimanager.UimanagerPackage;
import model.uimanager.VentanaMemorandoViewModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.uimanager.impl.UIManagerImpl#getOwnedByFactoryModel <em>Owned By Factory Model</em>}</li>
 *   <li>{@link model.uimanager.impl.UIManagerImpl#getTheVentanaMemorandoViewModel <em>The Ventana Memorando View Model</em>}</li>
 *   <li>{@link model.uimanager.impl.UIManagerImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIManagerImpl extends MinimalEObjectImpl.Container implements UIManager {
	/**
	 * The cached value of the '{@link #getTheVentanaMemorandoViewModel() <em>The Ventana Memorando View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheVentanaMemorandoViewModel()
	 * @generated
	 * @ordered
	 */
	protected VentanaMemorandoViewModel theVentanaMemorandoViewModel;

	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimanagerPackage.Literals.UI_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryModel getOwnedByFactoryModel() {
		if (eContainerFeatureID() != UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL) return null;
		return (FactoryModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByFactoryModel(FactoryModel newOwnedByFactoryModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByFactoryModel, UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByFactoryModel(FactoryModel newOwnedByFactoryModel) {
		if (newOwnedByFactoryModel != eInternalContainer() || (eContainerFeatureID() != UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL && newOwnedByFactoryModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByFactoryModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByFactoryModel != null)
				msgs = ((InternalEObject)newOwnedByFactoryModel).eInverseAdd(this, ModelPackage.FACTORY_MODEL__THE_UI_MANAGER, FactoryModel.class, msgs);
			msgs = basicSetOwnedByFactoryModel(newOwnedByFactoryModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL, newOwnedByFactoryModel, newOwnedByFactoryModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VentanaMemorandoViewModel getTheVentanaMemorandoViewModel() {
		return theVentanaMemorandoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheVentanaMemorandoViewModel(VentanaMemorandoViewModel newTheVentanaMemorandoViewModel, NotificationChain msgs) {
		VentanaMemorandoViewModel oldTheVentanaMemorandoViewModel = theVentanaMemorandoViewModel;
		theVentanaMemorandoViewModel = newTheVentanaMemorandoViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL, oldTheVentanaMemorandoViewModel, newTheVentanaMemorandoViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheVentanaMemorandoViewModel(VentanaMemorandoViewModel newTheVentanaMemorandoViewModel) {
		if (newTheVentanaMemorandoViewModel != theVentanaMemorandoViewModel) {
			NotificationChain msgs = null;
			if (theVentanaMemorandoViewModel != null)
				msgs = ((InternalEObject)theVentanaMemorandoViewModel).eInverseRemove(this, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER, VentanaMemorandoViewModel.class, msgs);
			if (newTheVentanaMemorandoViewModel != null)
				msgs = ((InternalEObject)newTheVentanaMemorandoViewModel).eInverseAdd(this, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER, VentanaMemorandoViewModel.class, msgs);
			msgs = basicSetTheVentanaMemorandoViewModel(newTheVentanaMemorandoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL, newTheVentanaMemorandoViewModel, newTheVentanaMemorandoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (theDomain != null && theDomain.eIsProxy()) {
			InternalEObject oldTheDomain = (InternalEObject)theDomain;
			theDomain = (Domain)eResolveProxy(oldTheDomain);
			if (theDomain != oldTheDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimanagerPackage.UI_MANAGER__THE_DOMAIN, oldTheDomain, theDomain));
			}
		}
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetTheDomain() {
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		Domain oldTheDomain = theDomain;
		theDomain = newTheDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimanagerPackage.UI_MANAGER__THE_DOMAIN, oldTheDomain, newTheDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != theDomain) {
			NotificationChain msgs = null;
			if (theDomain != null)
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI_MANAGER, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_UI_MANAGER, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.UI_MANAGER__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByFactoryModel((FactoryModel)otherEnd, msgs);
			case UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL:
				if (theVentanaMemorandoViewModel != null)
					msgs = ((InternalEObject)theVentanaMemorandoViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL, null, msgs);
				return basicSetTheVentanaMemorandoViewModel((VentanaMemorandoViewModel)otherEnd, msgs);
			case UimanagerPackage.UI_MANAGER__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI_MANAGER, Domain.class, msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
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
			case UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL:
				return basicSetOwnedByFactoryModel(null, msgs);
			case UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL:
				return basicSetTheVentanaMemorandoViewModel(null, msgs);
			case UimanagerPackage.UI_MANAGER__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
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
			case UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL:
				return eInternalContainer().eInverseRemove(this, ModelPackage.FACTORY_MODEL__THE_UI_MANAGER, FactoryModel.class, msgs);
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
			case UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL:
				return getOwnedByFactoryModel();
			case UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL:
				return getTheVentanaMemorandoViewModel();
			case UimanagerPackage.UI_MANAGER__THE_DOMAIN:
				if (resolve) return getTheDomain();
				return basicGetTheDomain();
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
			case UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL:
				setOwnedByFactoryModel((FactoryModel)newValue);
				return;
			case UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL:
				setTheVentanaMemorandoViewModel((VentanaMemorandoViewModel)newValue);
				return;
			case UimanagerPackage.UI_MANAGER__THE_DOMAIN:
				setTheDomain((Domain)newValue);
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
			case UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL:
				setOwnedByFactoryModel((FactoryModel)null);
				return;
			case UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL:
				setTheVentanaMemorandoViewModel((VentanaMemorandoViewModel)null);
				return;
			case UimanagerPackage.UI_MANAGER__THE_DOMAIN:
				setTheDomain((Domain)null);
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
			case UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL:
				return getOwnedByFactoryModel() != null;
			case UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL:
				return theVentanaMemorandoViewModel != null;
			case UimanagerPackage.UI_MANAGER__THE_DOMAIN:
				return theDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //UIManagerImpl
