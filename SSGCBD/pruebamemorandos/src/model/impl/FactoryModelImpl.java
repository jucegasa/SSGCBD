/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.FactoryModel;
import model.ModelPackage;

import model.domain.Domain;
import model.domain.DomainPackage;

import model.uimanager.UIManager;
import model.uimanager.UimanagerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FactoryModelImpl#getTheUIManager <em>The UI Manager</em>}</li>
 *   <li>{@link model.impl.FactoryModelImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactoryModelImpl extends MinimalEObjectImpl.Container implements FactoryModel {
	/**
	 * The cached value of the '{@link #getTheUIManager() <em>The UI Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUIManager()
	 * @generated
	 * @ordered
	 */
	protected UIManager theUIManager;

	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' containment reference.
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
	protected FactoryModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FACTORY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIManager getTheUIManager() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FACTORY_MODEL__THE_UI_MANAGER, oldTheUIManager, newTheUIManager);
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
				msgs = ((InternalEObject)theUIManager).eInverseRemove(this, UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL, UIManager.class, msgs);
			if (newTheUIManager != null)
				msgs = ((InternalEObject)newTheUIManager).eInverseAdd(this, UimanagerPackage.UI_MANAGER__OWNED_BY_FACTORY_MODEL, UIManager.class, msgs);
			msgs = basicSetTheUIManager(newTheUIManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FACTORY_MODEL__THE_UI_MANAGER, newTheUIManager, newTheUIManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FACTORY_MODEL__THE_DOMAIN, oldTheDomain, newTheDomain);
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
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__OWNED_BY_FACTORY_MODEL, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FACTORY_MODEL__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryModel cargar() {
		ModelPackage modelPackage = ModelPackage.eINSTANCE; 
		FactoryModel factoryModel = null;
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/dataformmodel/persistencia/dataform.model");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
		resource.load(java.util.Collections.EMPTY_MAP);
		factoryModel = (FactoryModel) resource.getContents().get(0);
		} catch (java.io.IOException e) {
		e.printStackTrace();
		}
		return factoryModel;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void salvar() {
		FactoryModel factoryModel = this;
		 org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/dataformmodel/persistencia/dataform.model");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(factoryModel);
		try {
		resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
		e.printStackTrace();
		}
		return;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FACTORY_MODEL__THE_UI_MANAGER:
				if (theUIManager != null)
					msgs = ((InternalEObject)theUIManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FACTORY_MODEL__THE_UI_MANAGER, null, msgs);
				return basicSetTheUIManager((UIManager)otherEnd, msgs);
			case ModelPackage.FACTORY_MODEL__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FACTORY_MODEL__THE_DOMAIN, null, msgs);
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
			case ModelPackage.FACTORY_MODEL__THE_UI_MANAGER:
				return basicSetTheUIManager(null, msgs);
			case ModelPackage.FACTORY_MODEL__THE_DOMAIN:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FACTORY_MODEL__THE_UI_MANAGER:
				return getTheUIManager();
			case ModelPackage.FACTORY_MODEL__THE_DOMAIN:
				return getTheDomain();
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
			case ModelPackage.FACTORY_MODEL__THE_UI_MANAGER:
				setTheUIManager((UIManager)newValue);
				return;
			case ModelPackage.FACTORY_MODEL__THE_DOMAIN:
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
			case ModelPackage.FACTORY_MODEL__THE_UI_MANAGER:
				setTheUIManager((UIManager)null);
				return;
			case ModelPackage.FACTORY_MODEL__THE_DOMAIN:
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
			case ModelPackage.FACTORY_MODEL__THE_UI_MANAGER:
				return theUIManager != null;
			case ModelPackage.FACTORY_MODEL__THE_DOMAIN:
				return theDomain != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.FACTORY_MODEL___CARGAR:
				return cargar();
			case ModelPackage.FACTORY_MODEL___SALVAR:
				salvar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FactoryModelImpl
