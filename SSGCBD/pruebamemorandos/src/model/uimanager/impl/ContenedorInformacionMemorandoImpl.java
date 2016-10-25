/**
 */
package model.uimanager.impl;

import model.uimanager.ContenedorInformacionMemorando;
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
 * An implementation of the model object '<em><b>Contenedor Informacion Memorando</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.uimanager.impl.ContenedorInformacionMemorandoImpl#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}</li>
 *   <li>{@link model.uimanager.impl.ContenedorInformacionMemorandoImpl#getUnidado <em>Unidado</em>}</li>
 *   <li>{@link model.uimanager.impl.ContenedorInformacionMemorandoImpl#getRemitente <em>Remitente</em>}</li>
 *   <li>{@link model.uimanager.impl.ContenedorInformacionMemorandoImpl#getFecha <em>Fecha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContenedorInformacionMemorandoImpl extends MinimalEObjectImpl.Container implements ContenedorInformacionMemorando {
	/**
	 * The default value of the '{@link #getUnidado() <em>Unidado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidado()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIDADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnidado() <em>Unidado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidado()
	 * @generated
	 * @ordered
	 */
	protected String unidado = UNIDADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemitente() <em>Remitente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemitente()
	 * @generated
	 * @ordered
	 */
	protected static final String REMITENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemitente() <em>Remitente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemitente()
	 * @generated
	 * @ordered
	 */
	protected String remitente = REMITENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorInformacionMemorandoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimanagerPackage.Literals.CONTENEDOR_INFORMACION_MEMORANDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VentanaMemorandoViewModel getOwnedByVentanaMemorandoViewModel() {
		if (eContainerFeatureID() != UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL) return null;
		return (VentanaMemorandoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel newOwnedByVentanaMemorandoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByVentanaMemorandoViewModel, UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByVentanaMemorandoViewModel(VentanaMemorandoViewModel newOwnedByVentanaMemorandoViewModel) {
		if (newOwnedByVentanaMemorandoViewModel != eInternalContainer() || (eContainerFeatureID() != UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL && newOwnedByVentanaMemorandoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByVentanaMemorandoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByVentanaMemorandoViewModel != null)
				msgs = ((InternalEObject)newOwnedByVentanaMemorandoViewModel).eInverseAdd(this, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO, VentanaMemorandoViewModel.class, msgs);
			msgs = basicSetOwnedByVentanaMemorandoViewModel(newOwnedByVentanaMemorandoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL, newOwnedByVentanaMemorandoViewModel, newOwnedByVentanaMemorandoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnidado() {
		return unidado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidado(String newUnidado) {
		String oldUnidado = unidado;
		unidado = newUnidado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO, oldUnidado, unidado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemitente() {
		return remitente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemitente(String newRemitente) {
		String oldRemitente = remitente;
		remitente = newRemitente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE, oldRemitente, remitente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(String newFecha) {
		String oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByVentanaMemorandoViewModel((VentanaMemorandoViewModel)otherEnd, msgs);
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
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return basicSetOwnedByVentanaMemorandoViewModel(null, msgs);
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
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO, VentanaMemorandoViewModel.class, msgs);
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
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return getOwnedByVentanaMemorandoViewModel();
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO:
				return getUnidado();
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE:
				return getRemitente();
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__FECHA:
				return getFecha();
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
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				setOwnedByVentanaMemorandoViewModel((VentanaMemorandoViewModel)newValue);
				return;
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO:
				setUnidado((String)newValue);
				return;
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE:
				setRemitente((String)newValue);
				return;
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__FECHA:
				setFecha((String)newValue);
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
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				setOwnedByVentanaMemorandoViewModel((VentanaMemorandoViewModel)null);
				return;
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO:
				setUnidado(UNIDADO_EDEFAULT);
				return;
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE:
				setRemitente(REMITENTE_EDEFAULT);
				return;
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__FECHA:
				setFecha(FECHA_EDEFAULT);
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
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL:
				return getOwnedByVentanaMemorandoViewModel() != null;
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO:
				return UNIDADO_EDEFAULT == null ? unidado != null : !UNIDADO_EDEFAULT.equals(unidado);
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE:
				return REMITENTE_EDEFAULT == null ? remitente != null : !REMITENTE_EDEFAULT.equals(remitente);
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unidado: ");
		result.append(unidado);
		result.append(", remitente: ");
		result.append(remitente);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(')');
		return result.toString();
	}

} //ContenedorInformacionMemorandoImpl
