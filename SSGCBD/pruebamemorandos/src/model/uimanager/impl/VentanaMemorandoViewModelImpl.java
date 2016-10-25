/**
 */
package model.uimanager.impl;

import model.uimanager.ContenedorInformacionMemorando;
import model.uimanager.ContenedorMemorando;
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
 * An implementation of the model object '<em><b>Ventana Memorando View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.uimanager.impl.VentanaMemorandoViewModelImpl#getTheUiManager <em>The Ui Manager</em>}</li>
 *   <li>{@link model.uimanager.impl.VentanaMemorandoViewModelImpl#getTheContenedorInformacionMemorando <em>The Contenedor Informacion Memorando</em>}</li>
 *   <li>{@link model.uimanager.impl.VentanaMemorandoViewModelImpl#getTheContenedorMemorando <em>The Contenedor Memorando</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VentanaMemorandoViewModelImpl extends MinimalEObjectImpl.Container implements VentanaMemorandoViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorInformacionMemorando() <em>The Contenedor Informacion Memorando</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorInformacionMemorando()
	 * @generated
	 * @ordered
	 */
	protected ContenedorInformacionMemorando theContenedorInformacionMemorando;

	/**
	 * The cached value of the '{@link #getTheContenedorMemorando() <em>The Contenedor Memorando</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMemorando()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMemorando theContenedorMemorando;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VentanaMemorandoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimanagerPackage.Literals.VENTANA_MEMORANDO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIManager getTheUiManager() {
		if (eContainerFeatureID() != UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER) return null;
		return (UIManager)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUiManager(UIManager newTheUiManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheUiManager, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUiManager(UIManager newTheUiManager) {
		if (newTheUiManager != eInternalContainer() || (eContainerFeatureID() != UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER && newTheUiManager != null)) {
			if (EcoreUtil.isAncestor(this, newTheUiManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheUiManager != null)
				msgs = ((InternalEObject)newTheUiManager).eInverseAdd(this, UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL, UIManager.class, msgs);
			msgs = basicSetTheUiManager(newTheUiManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER, newTheUiManager, newTheUiManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformacionMemorando getTheContenedorInformacionMemorando() {
		return theContenedorInformacionMemorando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorInformacionMemorando(ContenedorInformacionMemorando newTheContenedorInformacionMemorando, NotificationChain msgs) {
		ContenedorInformacionMemorando oldTheContenedorInformacionMemorando = theContenedorInformacionMemorando;
		theContenedorInformacionMemorando = newTheContenedorInformacionMemorando;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO, oldTheContenedorInformacionMemorando, newTheContenedorInformacionMemorando);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorInformacionMemorando(ContenedorInformacionMemorando newTheContenedorInformacionMemorando) {
		if (newTheContenedorInformacionMemorando != theContenedorInformacionMemorando) {
			NotificationChain msgs = null;
			if (theContenedorInformacionMemorando != null)
				msgs = ((InternalEObject)theContenedorInformacionMemorando).eInverseRemove(this, UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, ContenedorInformacionMemorando.class, msgs);
			if (newTheContenedorInformacionMemorando != null)
				msgs = ((InternalEObject)newTheContenedorInformacionMemorando).eInverseAdd(this, UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, ContenedorInformacionMemorando.class, msgs);
			msgs = basicSetTheContenedorInformacionMemorando(newTheContenedorInformacionMemorando, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO, newTheContenedorInformacionMemorando, newTheContenedorInformacionMemorando));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMemorando getTheContenedorMemorando() {
		return theContenedorMemorando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMemorando(ContenedorMemorando newTheContenedorMemorando, NotificationChain msgs) {
		ContenedorMemorando oldTheContenedorMemorando = theContenedorMemorando;
		theContenedorMemorando = newTheContenedorMemorando;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO, oldTheContenedorMemorando, newTheContenedorMemorando);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMemorando(ContenedorMemorando newTheContenedorMemorando) {
		if (newTheContenedorMemorando != theContenedorMemorando) {
			NotificationChain msgs = null;
			if (theContenedorMemorando != null)
				msgs = ((InternalEObject)theContenedorMemorando).eInverseRemove(this, UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, ContenedorMemorando.class, msgs);
			if (newTheContenedorMemorando != null)
				msgs = ((InternalEObject)newTheContenedorMemorando).eInverseAdd(this, UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, ContenedorMemorando.class, msgs);
			msgs = basicSetTheContenedorMemorando(newTheContenedorMemorando, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO, newTheContenedorMemorando, newTheContenedorMemorando));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheUiManager((UIManager)otherEnd, msgs);
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO:
				if (theContenedorInformacionMemorando != null)
					msgs = ((InternalEObject)theContenedorInformacionMemorando).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO, null, msgs);
				return basicSetTheContenedorInformacionMemorando((ContenedorInformacionMemorando)otherEnd, msgs);
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO:
				if (theContenedorMemorando != null)
					msgs = ((InternalEObject)theContenedorMemorando).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO, null, msgs);
				return basicSetTheContenedorMemorando((ContenedorMemorando)otherEnd, msgs);
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
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER:
				return basicSetTheUiManager(null, msgs);
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO:
				return basicSetTheContenedorInformacionMemorando(null, msgs);
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO:
				return basicSetTheContenedorMemorando(null, msgs);
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
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER:
				return eInternalContainer().eInverseRemove(this, UimanagerPackage.UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL, UIManager.class, msgs);
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
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER:
				return getTheUiManager();
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO:
				return getTheContenedorInformacionMemorando();
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO:
				return getTheContenedorMemorando();
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
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER:
				setTheUiManager((UIManager)newValue);
				return;
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO:
				setTheContenedorInformacionMemorando((ContenedorInformacionMemorando)newValue);
				return;
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO:
				setTheContenedorMemorando((ContenedorMemorando)newValue);
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
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER:
				setTheUiManager((UIManager)null);
				return;
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO:
				setTheContenedorInformacionMemorando((ContenedorInformacionMemorando)null);
				return;
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO:
				setTheContenedorMemorando((ContenedorMemorando)null);
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
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER:
				return getTheUiManager() != null;
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO:
				return theContenedorInformacionMemorando != null;
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO:
				return theContenedorMemorando != null;
		}
		return super.eIsSet(featureID);
	}

} //VentanaMemorandoViewModelImpl
