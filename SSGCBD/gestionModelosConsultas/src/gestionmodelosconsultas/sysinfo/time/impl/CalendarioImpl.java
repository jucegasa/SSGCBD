/**
 */
package gestionmodelosconsultas.sysinfo.time.impl;

import gestionmodelosconsultas.sysinfo.time.Agenda;
import gestionmodelosconsultas.sysinfo.time.Calendario;
import gestionmodelosconsultas.sysinfo.time.Fecha;
import gestionmodelosconsultas.sysinfo.time.TimePackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Calendario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl#getSuCalendario <em>Su Calendario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalendarioImpl extends MinimalEObjectImpl.Container implements Calendario {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected EList<Fecha> fecha;

	/**
	 * The cached value of the '{@link #getSuCalendario() <em>Su Calendario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuCalendario()
	 * @generated
	 * @ordered
	 */
	protected EList<Calendario> suCalendario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.CALENDARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CALENDARIO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fecha> getFecha() {
		if (fecha == null) {
			fecha = new EObjectContainmentWithInverseEList<Fecha>(Fecha.class, this, TimePackage.CALENDARIO__FECHA, TimePackage.FECHA__CALENDARIO);
		}
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agenda getAgenda() {
		if (eContainerFeatureID() != TimePackage.CALENDARIO__AGENDA) return null;
		return (Agenda)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgenda(Agenda newAgenda, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAgenda, TimePackage.CALENDARIO__AGENDA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgenda(Agenda newAgenda) {
		if (newAgenda != eInternalContainer() || (eContainerFeatureID() != TimePackage.CALENDARIO__AGENDA && newAgenda != null)) {
			if (EcoreUtil.isAncestor(this, newAgenda))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAgenda != null)
				msgs = ((InternalEObject)newAgenda).eInverseAdd(this, TimePackage.AGENDA__CALENDARIO, Agenda.class, msgs);
			msgs = basicSetAgenda(newAgenda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CALENDARIO__AGENDA, newAgenda, newAgenda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Calendario> getSuCalendario() {
		if (suCalendario == null) {
			suCalendario = new EObjectContainmentWithInverseEList<Calendario>(Calendario.class, this, TimePackage.CALENDARIO__SU_CALENDARIO, TimePackage.CALENDARIO__PLAN);
		}
		return suCalendario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendario getPlan() {
		if (eContainerFeatureID() != TimePackage.CALENDARIO__PLAN) return null;
		return (Calendario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(Calendario newPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlan, TimePackage.CALENDARIO__PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(Calendario newPlan) {
		if (newPlan != eInternalContainer() || (eContainerFeatureID() != TimePackage.CALENDARIO__PLAN && newPlan != null)) {
			if (EcoreUtil.isAncestor(this, newPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, TimePackage.CALENDARIO__SU_CALENDARIO, Calendario.class, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CALENDARIO__PLAN, newPlan, newPlan));
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
			case TimePackage.CALENDARIO__FECHA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFecha()).basicAdd(otherEnd, msgs);
			case TimePackage.CALENDARIO__AGENDA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAgenda((Agenda)otherEnd, msgs);
			case TimePackage.CALENDARIO__SU_CALENDARIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuCalendario()).basicAdd(otherEnd, msgs);
			case TimePackage.CALENDARIO__PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlan((Calendario)otherEnd, msgs);
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
			case TimePackage.CALENDARIO__FECHA:
				return ((InternalEList<?>)getFecha()).basicRemove(otherEnd, msgs);
			case TimePackage.CALENDARIO__AGENDA:
				return basicSetAgenda(null, msgs);
			case TimePackage.CALENDARIO__SU_CALENDARIO:
				return ((InternalEList<?>)getSuCalendario()).basicRemove(otherEnd, msgs);
			case TimePackage.CALENDARIO__PLAN:
				return basicSetPlan(null, msgs);
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
			case TimePackage.CALENDARIO__AGENDA:
				return eInternalContainer().eInverseRemove(this, TimePackage.AGENDA__CALENDARIO, Agenda.class, msgs);
			case TimePackage.CALENDARIO__PLAN:
				return eInternalContainer().eInverseRemove(this, TimePackage.CALENDARIO__SU_CALENDARIO, Calendario.class, msgs);
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
			case TimePackage.CALENDARIO__NOMBRE:
				return getNombre();
			case TimePackage.CALENDARIO__FECHA:
				return getFecha();
			case TimePackage.CALENDARIO__AGENDA:
				return getAgenda();
			case TimePackage.CALENDARIO__SU_CALENDARIO:
				return getSuCalendario();
			case TimePackage.CALENDARIO__PLAN:
				return getPlan();
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
			case TimePackage.CALENDARIO__NOMBRE:
				setNombre((String)newValue);
				return;
			case TimePackage.CALENDARIO__FECHA:
				getFecha().clear();
				getFecha().addAll((Collection<? extends Fecha>)newValue);
				return;
			case TimePackage.CALENDARIO__AGENDA:
				setAgenda((Agenda)newValue);
				return;
			case TimePackage.CALENDARIO__SU_CALENDARIO:
				getSuCalendario().clear();
				getSuCalendario().addAll((Collection<? extends Calendario>)newValue);
				return;
			case TimePackage.CALENDARIO__PLAN:
				setPlan((Calendario)newValue);
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
			case TimePackage.CALENDARIO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case TimePackage.CALENDARIO__FECHA:
				getFecha().clear();
				return;
			case TimePackage.CALENDARIO__AGENDA:
				setAgenda((Agenda)null);
				return;
			case TimePackage.CALENDARIO__SU_CALENDARIO:
				getSuCalendario().clear();
				return;
			case TimePackage.CALENDARIO__PLAN:
				setPlan((Calendario)null);
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
			case TimePackage.CALENDARIO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case TimePackage.CALENDARIO__FECHA:
				return fecha != null && !fecha.isEmpty();
			case TimePackage.CALENDARIO__AGENDA:
				return getAgenda() != null;
			case TimePackage.CALENDARIO__SU_CALENDARIO:
				return suCalendario != null && !suCalendario.isEmpty();
			case TimePackage.CALENDARIO__PLAN:
				return getPlan() != null;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //CalendarioImpl
