/**
 */
package model.uimanager.impl;

import model.uimanager.ContenedorMemorando;
import model.uimanager.MemorandoViewModel;
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
 * An implementation of the model object '<em><b>Memorando View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.uimanager.impl.MemorandoViewModelImpl#getOwnedByMemorando <em>Owned By Memorando</em>}</li>
 *   <li>{@link model.uimanager.impl.MemorandoViewModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.uimanager.impl.MemorandoViewModelImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link model.uimanager.impl.MemorandoViewModelImpl#getHora <em>Hora</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemorandoViewModelImpl extends MinimalEObjectImpl.Container implements MemorandoViewModel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected String hora = HORA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemorandoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimanagerPackage.Literals.MEMORANDO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMemorando getOwnedByMemorando() {
		if (eContainerFeatureID() != UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO) return null;
		return (ContenedorMemorando)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByMemorando(ContenedorMemorando newOwnedByMemorando, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByMemorando, UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByMemorando(ContenedorMemorando newOwnedByMemorando) {
		if (newOwnedByMemorando != eInternalContainer() || (eContainerFeatureID() != UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO && newOwnedByMemorando != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByMemorando))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByMemorando != null)
				msgs = ((InternalEObject)newOwnedByMemorando).eInverseAdd(this, UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO, ContenedorMemorando.class, msgs);
			msgs = basicSetOwnedByMemorando(newOwnedByMemorando, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO, newOwnedByMemorando, newOwnedByMemorando));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.MEMORANDO_VIEW_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.MEMORANDO_VIEW_MODEL__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHora(String newHora) {
		String oldHora = hora;
		hora = newHora;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimanagerPackage.MEMORANDO_VIEW_MODEL__HORA, oldHora, hora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByMemorando((ContenedorMemorando)otherEnd, msgs);
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
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO:
				return basicSetOwnedByMemorando(null, msgs);
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
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO:
				return eInternalContainer().eInverseRemove(this, UimanagerPackage.CONTENEDOR_MEMORANDO__LIST_MEMORANDO, ContenedorMemorando.class, msgs);
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
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO:
				return getOwnedByMemorando();
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__ID:
				return getId();
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__TIPO:
				return getTipo();
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__HORA:
				return getHora();
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
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO:
				setOwnedByMemorando((ContenedorMemorando)newValue);
				return;
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__ID:
				setId((String)newValue);
				return;
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__TIPO:
				setTipo((String)newValue);
				return;
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__HORA:
				setHora((String)newValue);
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
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO:
				setOwnedByMemorando((ContenedorMemorando)null);
				return;
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__HORA:
				setHora(HORA_EDEFAULT);
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
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO:
				return getOwnedByMemorando() != null;
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case UimanagerPackage.MEMORANDO_VIEW_MODEL__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", hora: ");
		result.append(hora);
		result.append(')');
		return result.toString();
	}

} //MemorandoViewModelImpl
