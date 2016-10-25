/**
 */
package model.uimanager.impl;

import java.util.Collection;

import model.uimanager.ContenedorMemorando;
import model.uimanager.MemorandoViewModel;
import model.uimanager.UimanagerPackage;
import model.uimanager.VentanaMemorandoViewModel;

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
 * An implementation of the model object '<em><b>Contenedor Memorando</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.uimanager.impl.ContenedorMemorandoImpl#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}</li>
 *   <li>{@link model.uimanager.impl.ContenedorMemorandoImpl#getListMemorando <em>List Memorando</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContenedorMemorandoImpl extends MinimalEObjectImpl.Container implements ContenedorMemorando {
	/**
	 * The cached value of the '{@link #getListMemorando() <em>List Memorando</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMemorando()
	 * @generated
	 * @ordered
	 */
	protected EList<MemorandoViewModel> listMemorando;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMemorandoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimanagerPackage.Literals.CONTENEDOR_MEMORANDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VentanaMemorandoViewModel getOwnedByVentanaMemorandoViewModel() {
		if (eContainerFeatureID() != UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL) return null;
		return (VentanaMemorandoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel newOwnedByVentanaMemorandoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByVentanaMemorandoViewModel, UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel newOwnedByVentanaMemorandoViewModel) {
		if (newOwnedByVentanaMemorandoViewModel != eInternalContainer() || (eContainerFeatureID() != UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL && newOwnedByVentanaMemorandoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByVentanaMemorandoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByVentanaMemorandoViewModel != null)
				msgs = ((InternalEObject)newOwnedByVentanaMemorandoViewModel).eInverseAdd(this, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO, VentanaMemorandoViewModel.class, msgs);
			msgs = basicSetOwnedByVentanaMemorandoViewModel(newOwnedByVentanaMemorandoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, newOwnedByVentanaMemorandoViewModel, newOwnedByVentanaMemorandoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemorandoViewModel> getListMemorando() {
		if (listMemorando == null) {
			listMemorando = new EObjectContainmentWithInverseEList<MemorandoViewModel>(MemorandoViewModel.class, this, UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO, UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO);
		}
		return listMemorando;
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
			case UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByVentanaMemorandoViewModel((VentanaMemorandoViewModel)otherEnd, msgs);
			case UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListMemorando()).basicAdd(otherEnd, msgs);
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
			case UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return basicSetOwnedByVentanaMemorandoViewModel(null, msgs);
			case UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO:
				return ((InternalEList<?>)getListMemorando()).basicRemove(otherEnd, msgs);
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
			case UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO, VentanaMemorandoViewModel.class, msgs);
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
			case UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return getOwnedByVentanaMemorandoViewModel();
			case UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO:
				return getListMemorando();
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
			case UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				setOwnedByVentanaMemorandoViewModel((VentanaMemorandoViewModel)newValue);
				return;
			case UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO:
				getListMemorando().clear();
				getListMemorando().addAll((Collection<? extends MemorandoViewModel>)newValue);
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
			case UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				setOwnedByVentanaMemorandoViewModel((VentanaMemorandoViewModel)null);
				return;
			case UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO:
				getListMemorando().clear();
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
			case UimanagerPackage.CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return getOwnedByVentanaMemorandoViewModel() != null;
			case UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO:
				return listMemorando != null && !listMemorando.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContenedorMemorandoImpl
