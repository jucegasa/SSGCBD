/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Modelo Resultado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl#getKey <em>Key</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl#getListElementoModeloResultado <em>List Elemento Modelo Resultado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl#getElementoModeloResultado <em>Elemento Modelo Resultado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementoModeloResultadoImpl extends ResultElementImpl implements ElementoModeloResultado {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListElementoModeloResultado() <em>List Elemento Modelo Resultado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElementoModeloResultado()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoModeloResultado> listElementoModeloResultado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoModeloResultadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoModeloResultado> getListElementoModeloResultado() {
		if (listElementoModeloResultado == null) {
			listElementoModeloResultado = new EObjectContainmentWithInverseEList<ElementoModeloResultado>(ElementoModeloResultado.class, this, ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO, ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO);
		}
		return listElementoModeloResultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoModeloResultado getElementoModeloResultado() {
		if (eContainerFeatureID() != ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO) return null;
		return (ElementoModeloResultado)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementoModeloResultado(ElementoModeloResultado newElementoModeloResultado, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElementoModeloResultado, ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementoModeloResultado(ElementoModeloResultado newElementoModeloResultado) {
		if (newElementoModeloResultado != eInternalContainer() || (eContainerFeatureID() != ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO && newElementoModeloResultado != null)) {
			if (EcoreUtil.isAncestor(this, newElementoModeloResultado))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElementoModeloResultado != null)
				msgs = ((InternalEObject)newElementoModeloResultado).eInverseAdd(this, ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO, ElementoModeloResultado.class, msgs);
			msgs = basicSetElementoModeloResultado(newElementoModeloResultado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO, newElementoModeloResultado, newElementoModeloResultado));
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
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListElementoModeloResultado()).basicAdd(otherEnd, msgs);
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElementoModeloResultado((ElementoModeloResultado)otherEnd, msgs);
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
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO:
				return ((InternalEList<?>)getListElementoModeloResultado()).basicRemove(otherEnd, msgs);
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO:
				return basicSetElementoModeloResultado(null, msgs);
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
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO:
				return eInternalContainer().eInverseRemove(this, ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO, ElementoModeloResultado.class, msgs);
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
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY:
				return getKey();
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO:
				return getListElementoModeloResultado();
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO:
				return getElementoModeloResultado();
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
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY:
				setKey((String)newValue);
				return;
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO:
				getListElementoModeloResultado().clear();
				getListElementoModeloResultado().addAll((Collection<? extends ElementoModeloResultado>)newValue);
				return;
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO:
				setElementoModeloResultado((ElementoModeloResultado)newValue);
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
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO:
				getListElementoModeloResultado().clear();
				return;
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO:
				setElementoModeloResultado((ElementoModeloResultado)null);
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
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO:
				return listElementoModeloResultado != null && !listElementoModeloResultado.isEmpty();
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO:
				return getElementoModeloResultado() != null;
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
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //ElementoModeloResultadoImpl
