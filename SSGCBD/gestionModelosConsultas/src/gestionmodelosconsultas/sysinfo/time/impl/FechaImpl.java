/**
 */
package gestionmodelosconsultas.sysinfo.time.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fecha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.FechaImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.FechaImpl#getMes <em>Mes</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.FechaImpl#getAno <em>Ano</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.FechaImpl#getCalendario <em>Calendario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.time.impl.FechaImpl#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FechaImpl extends ElementoModeloImpl implements Fecha {
	/**
	 * The default value of the '{@link #getDia() <em>Dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDia()
	 * @generated
	 * @ordered
	 */
	protected static final String DIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDia() <em>Dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDia()
	 * @generated
	 * @ordered
	 */
	protected String dia = DIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMes() <em>Mes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMes()
	 * @generated
	 * @ordered
	 */
	protected static final String MES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMes() <em>Mes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMes()
	 * @generated
	 * @ordered
	 */
	protected String mes = MES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAno() <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAno()
	 * @generated
	 * @ordered
	 */
	protected static final String ANO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAno() <em>Ano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAno()
	 * @generated
	 * @ordered
	 */
	protected String ano = ANO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMensaje() <em>Mensaje</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected EList<Mensaje> mensaje;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FechaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.FECHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDia(String newDia) {
		String oldDia = dia;
		dia = newDia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.FECHA__DIA, oldDia, dia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMes() {
		return mes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMes(String newMes) {
		String oldMes = mes;
		mes = newMes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.FECHA__MES, oldMes, mes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAno() {
		return ano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAno(String newAno) {
		String oldAno = ano;
		ano = newAno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.FECHA__ANO, oldAno, ano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendario getCalendario() {
		if (eContainerFeatureID() != TimePackage.FECHA__CALENDARIO) return null;
		return (Calendario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalendario(Calendario newCalendario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCalendario, TimePackage.FECHA__CALENDARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendario(Calendario newCalendario) {
		if (newCalendario != eInternalContainer() || (eContainerFeatureID() != TimePackage.FECHA__CALENDARIO && newCalendario != null)) {
			if (EcoreUtil.isAncestor(this, newCalendario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCalendario != null)
				msgs = ((InternalEObject)newCalendario).eInverseAdd(this, TimePackage.CALENDARIO__FECHA, Calendario.class, msgs);
			msgs = basicSetCalendario(newCalendario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.FECHA__CALENDARIO, newCalendario, newCalendario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mensaje> getMensaje() {
		if (mensaje == null) {
			mensaje = new EObjectWithInverseResolvingEList<Mensaje>(Mensaje.class, this, TimePackage.FECHA__MENSAJE, DocmgtPackage.MENSAJE__FECHA);
		}
		return mensaje;
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
			case TimePackage.FECHA__CALENDARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCalendario((Calendario)otherEnd, msgs);
			case TimePackage.FECHA__MENSAJE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMensaje()).basicAdd(otherEnd, msgs);
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
			case TimePackage.FECHA__CALENDARIO:
				return basicSetCalendario(null, msgs);
			case TimePackage.FECHA__MENSAJE:
				return ((InternalEList<?>)getMensaje()).basicRemove(otherEnd, msgs);
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
			case TimePackage.FECHA__CALENDARIO:
				return eInternalContainer().eInverseRemove(this, TimePackage.CALENDARIO__FECHA, Calendario.class, msgs);
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
			case TimePackage.FECHA__DIA:
				return getDia();
			case TimePackage.FECHA__MES:
				return getMes();
			case TimePackage.FECHA__ANO:
				return getAno();
			case TimePackage.FECHA__CALENDARIO:
				return getCalendario();
			case TimePackage.FECHA__MENSAJE:
				return getMensaje();
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
			case TimePackage.FECHA__DIA:
				setDia((String)newValue);
				return;
			case TimePackage.FECHA__MES:
				setMes((String)newValue);
				return;
			case TimePackage.FECHA__ANO:
				setAno((String)newValue);
				return;
			case TimePackage.FECHA__CALENDARIO:
				setCalendario((Calendario)newValue);
				return;
			case TimePackage.FECHA__MENSAJE:
				getMensaje().clear();
				getMensaje().addAll((Collection<? extends Mensaje>)newValue);
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
			case TimePackage.FECHA__DIA:
				setDia(DIA_EDEFAULT);
				return;
			case TimePackage.FECHA__MES:
				setMes(MES_EDEFAULT);
				return;
			case TimePackage.FECHA__ANO:
				setAno(ANO_EDEFAULT);
				return;
			case TimePackage.FECHA__CALENDARIO:
				setCalendario((Calendario)null);
				return;
			case TimePackage.FECHA__MENSAJE:
				getMensaje().clear();
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
			case TimePackage.FECHA__DIA:
				return DIA_EDEFAULT == null ? dia != null : !DIA_EDEFAULT.equals(dia);
			case TimePackage.FECHA__MES:
				return MES_EDEFAULT == null ? mes != null : !MES_EDEFAULT.equals(mes);
			case TimePackage.FECHA__ANO:
				return ANO_EDEFAULT == null ? ano != null : !ANO_EDEFAULT.equals(ano);
			case TimePackage.FECHA__CALENDARIO:
				return getCalendario() != null;
			case TimePackage.FECHA__MENSAJE:
				return mensaje != null && !mensaje.isEmpty();
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
		result.append(" (dia: ");
		result.append(dia);
		result.append(", mes: ");
		result.append(mes);
		result.append(", ano: ");
		result.append(ano);
		result.append(')');
		return result.toString();
	}

} //FechaImpl
