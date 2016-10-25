/**
 */
package gestionmodelosconsultas.memoms.info.impl;

import gestionmodelosconsultas.memoms.info.InfoPackage;
import gestionmodelosconsultas.memoms.info.Observacion;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ObservacionImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ObservacionImpl#getObservacion <em>Observacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ObservacionImpl#getCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservacionImpl extends MinimalEObjectImpl.Container implements Observacion {
	/**
	 * The default value of the '{@link #getObservacion() <em>Observacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservacion()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservacion() <em>Observacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservacion()
	 * @generated
	 * @ordered
	 */
	protected String observacion = OBSERVACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected String check = CHECK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfoPackage.Literals.OBSERVACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getDocumento() {
		if (eContainerFeatureID() != InfoPackage.OBSERVACION__DOCUMENTO) return null;
		return (Documento)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumento(Documento newDocumento, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumento, InfoPackage.OBSERVACION__DOCUMENTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumento(Documento newDocumento) {
		if (newDocumento != eInternalContainer() || (eContainerFeatureID() != InfoPackage.OBSERVACION__DOCUMENTO && newDocumento != null)) {
			if (EcoreUtil.isAncestor(this, newDocumento))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumento != null)
				msgs = ((InternalEObject)newDocumento).eInverseAdd(this, DocmgtPackage.DOCUMENTO__OBSERVACION, Documento.class, msgs);
			msgs = basicSetDocumento(newDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.OBSERVACION__DOCUMENTO, newDocumento, newDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservacion(String newObservacion) {
		String oldObservacion = observacion;
		observacion = newObservacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.OBSERVACION__OBSERVACION, oldObservacion, observacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(String newCheck) {
		String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.OBSERVACION__CHECK, oldCheck, check));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfoPackage.OBSERVACION__DOCUMENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumento((Documento)otherEnd, msgs);
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
			case InfoPackage.OBSERVACION__DOCUMENTO:
				return basicSetDocumento(null, msgs);
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
			case InfoPackage.OBSERVACION__DOCUMENTO:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.DOCUMENTO__OBSERVACION, Documento.class, msgs);
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
			case InfoPackage.OBSERVACION__DOCUMENTO:
				return getDocumento();
			case InfoPackage.OBSERVACION__OBSERVACION:
				return getObservacion();
			case InfoPackage.OBSERVACION__CHECK:
				return getCheck();
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
			case InfoPackage.OBSERVACION__DOCUMENTO:
				setDocumento((Documento)newValue);
				return;
			case InfoPackage.OBSERVACION__OBSERVACION:
				setObservacion((String)newValue);
				return;
			case InfoPackage.OBSERVACION__CHECK:
				setCheck((String)newValue);
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
			case InfoPackage.OBSERVACION__DOCUMENTO:
				setDocumento((Documento)null);
				return;
			case InfoPackage.OBSERVACION__OBSERVACION:
				setObservacion(OBSERVACION_EDEFAULT);
				return;
			case InfoPackage.OBSERVACION__CHECK:
				setCheck(CHECK_EDEFAULT);
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
			case InfoPackage.OBSERVACION__DOCUMENTO:
				return getDocumento() != null;
			case InfoPackage.OBSERVACION__OBSERVACION:
				return OBSERVACION_EDEFAULT == null ? observacion != null : !OBSERVACION_EDEFAULT.equals(observacion);
			case InfoPackage.OBSERVACION__CHECK:
				return CHECK_EDEFAULT == null ? check != null : !CHECK_EDEFAULT.equals(check);
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
		result.append(" (observacion: ");
		result.append(observacion);
		result.append(", check: ");
		result.append(check);
		result.append(')');
		return result.toString();
	}

} //ObservacionImpl
