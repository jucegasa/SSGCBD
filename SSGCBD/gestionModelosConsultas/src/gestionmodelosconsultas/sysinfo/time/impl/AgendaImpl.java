/**
 */
package gestionmodelosconsultas.sysinfo.time.impl;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.time.Agenda;
import gestionmodelosconsultas.sysinfo.time.Calendario;
import gestionmodelosconsultas.sysinfo.time.TimePackage;
import gestionmodelosconsultas.sysinfo.time.Time_View;

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
 * An implementation of the model object '<em><b>Agenda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.AgendaImpl#getTime_View <em>Time View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.AgendaImpl#getCalendario <em>Calendario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgendaImpl extends PaqueteImpl implements Agenda {
	/**
	 * The cached value of the '{@link #getCalendario() <em>Calendario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendario()
	 * @generated
	 * @ordered
	 */
	protected EList<Calendario> calendario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgendaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.AGENDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time_View getTime_View() {
		if (eContainerFeatureID() != TimePackage.AGENDA__TIME_VIEW) return null;
		return (Time_View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime_View(Time_View newTime_View, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTime_View, TimePackage.AGENDA__TIME_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_View(Time_View newTime_View) {
		if (newTime_View != eInternalContainer() || (eContainerFeatureID() != TimePackage.AGENDA__TIME_VIEW && newTime_View != null)) {
			if (EcoreUtil.isAncestor(this, newTime_View))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTime_View != null)
				msgs = ((InternalEObject)newTime_View).eInverseAdd(this, TimePackage.TIME_VIEW__AGENDA, Time_View.class, msgs);
			msgs = basicSetTime_View(newTime_View, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.AGENDA__TIME_VIEW, newTime_View, newTime_View));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Calendario> getCalendario() {
		if (calendario == null) {
			calendario = new EObjectContainmentWithInverseEList<Calendario>(Calendario.class, this, TimePackage.AGENDA__CALENDARIO, TimePackage.CALENDARIO__AGENDA);
		}
		return calendario;
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
			case TimePackage.AGENDA__TIME_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTime_View((Time_View)otherEnd, msgs);
			case TimePackage.AGENDA__CALENDARIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalendario()).basicAdd(otherEnd, msgs);
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
			case TimePackage.AGENDA__TIME_VIEW:
				return basicSetTime_View(null, msgs);
			case TimePackage.AGENDA__CALENDARIO:
				return ((InternalEList<?>)getCalendario()).basicRemove(otherEnd, msgs);
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
			case TimePackage.AGENDA__TIME_VIEW:
				return eInternalContainer().eInverseRemove(this, TimePackage.TIME_VIEW__AGENDA, Time_View.class, msgs);
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
			case TimePackage.AGENDA__TIME_VIEW:
				return getTime_View();
			case TimePackage.AGENDA__CALENDARIO:
				return getCalendario();
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
			case TimePackage.AGENDA__TIME_VIEW:
				setTime_View((Time_View)newValue);
				return;
			case TimePackage.AGENDA__CALENDARIO:
				getCalendario().clear();
				getCalendario().addAll((Collection<? extends Calendario>)newValue);
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
			case TimePackage.AGENDA__TIME_VIEW:
				setTime_View((Time_View)null);
				return;
			case TimePackage.AGENDA__CALENDARIO:
				getCalendario().clear();
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
			case TimePackage.AGENDA__TIME_VIEW:
				return getTime_View() != null;
			case TimePackage.AGENDA__CALENDARIO:
				return calendario != null && !calendario.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgendaImpl
