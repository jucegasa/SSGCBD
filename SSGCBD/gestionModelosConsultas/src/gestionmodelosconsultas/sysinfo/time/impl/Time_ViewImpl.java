/**
 */
package gestionmodelosconsultas.sysinfo.time.impl;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.time.Agenda;
import gestionmodelosconsultas.sysinfo.time.TimePackage;
import gestionmodelosconsultas.sysinfo.time.Time_View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.Time_ViewImpl#getAgenda <em>Agenda</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Time_ViewImpl extends PaqueteImpl implements Time_View {
	/**
	 * The cached value of the '{@link #getAgenda() <em>Agenda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgenda()
	 * @generated
	 * @ordered
	 */
	protected Agenda agenda;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Time_ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.TIME_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agenda getAgenda() {
		return agenda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgenda(Agenda newAgenda, NotificationChain msgs) {
		Agenda oldAgenda = agenda;
		agenda = newAgenda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.TIME_VIEW__AGENDA, oldAgenda, newAgenda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgenda(Agenda newAgenda) {
		if (newAgenda != agenda) {
			NotificationChain msgs = null;
			if (agenda != null)
				msgs = ((InternalEObject)agenda).eInverseRemove(this, TimePackage.AGENDA__TIME_VIEW, Agenda.class, msgs);
			if (newAgenda != null)
				msgs = ((InternalEObject)newAgenda).eInverseAdd(this, TimePackage.AGENDA__TIME_VIEW, Agenda.class, msgs);
			msgs = basicSetAgenda(newAgenda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIME_VIEW__AGENDA, newAgenda, newAgenda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimePackage.TIME_VIEW__AGENDA:
				if (agenda != null)
					msgs = ((InternalEObject)agenda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIME_VIEW__AGENDA, null, msgs);
				return basicSetAgenda((Agenda)otherEnd, msgs);
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
			case TimePackage.TIME_VIEW__AGENDA:
				return basicSetAgenda(null, msgs);
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
			case TimePackage.TIME_VIEW__AGENDA:
				return getAgenda();
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
			case TimePackage.TIME_VIEW__AGENDA:
				setAgenda((Agenda)newValue);
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
			case TimePackage.TIME_VIEW__AGENDA:
				setAgenda((Agenda)null);
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
			case TimePackage.TIME_VIEW__AGENDA:
				return agenda != null;
		}
		return super.eIsSet(featureID);
	}

} //Time_ViewImpl
