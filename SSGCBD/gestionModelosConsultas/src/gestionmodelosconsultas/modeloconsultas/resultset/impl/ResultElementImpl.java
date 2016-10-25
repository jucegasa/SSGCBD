/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultElementImpl#getResultado <em>Resultado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResultElementImpl extends MinimalEObjectImpl.Container implements ResultElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsetPackage.Literals.RESULT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultado getResultado() {
		if (eContainerFeatureID() != ResultsetPackage.RESULT_ELEMENT__RESULTADO) return null;
		return (Resultado)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultado(Resultado newResultado, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResultado, ResultsetPackage.RESULT_ELEMENT__RESULTADO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultado(Resultado newResultado) {
		if (newResultado != eInternalContainer() || (eContainerFeatureID() != ResultsetPackage.RESULT_ELEMENT__RESULTADO && newResultado != null)) {
			if (EcoreUtil.isAncestor(this, newResultado))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResultado != null)
				msgs = ((InternalEObject)newResultado).eInverseAdd(this, ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT, Resultado.class, msgs);
			msgs = basicSetResultado(newResultado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsetPackage.RESULT_ELEMENT__RESULTADO, newResultado, newResultado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsetPackage.RESULT_ELEMENT__RESULTADO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResultado((Resultado)otherEnd, msgs);
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
			case ResultsetPackage.RESULT_ELEMENT__RESULTADO:
				return basicSetResultado(null, msgs);
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
			case ResultsetPackage.RESULT_ELEMENT__RESULTADO:
				return eInternalContainer().eInverseRemove(this, ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT, Resultado.class, msgs);
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
			case ResultsetPackage.RESULT_ELEMENT__RESULTADO:
				return getResultado();
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
			case ResultsetPackage.RESULT_ELEMENT__RESULTADO:
				setResultado((Resultado)newValue);
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
			case ResultsetPackage.RESULT_ELEMENT__RESULTADO:
				setResultado((Resultado)null);
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
			case ResultsetPackage.RESULT_ELEMENT__RESULTADO:
				return getResultado() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultElementImpl
