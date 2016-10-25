/**
 */
package gestionmodelosconsultas.memoms.impl;

import gestionmodelosconsultas.memoms.MemoFactory;
import gestionmodelosconsultas.memoms.MemomsPackage;

import gestionmodelosconsultas.memoms.comunicacion.Circular;
import gestionmodelosconsultas.memoms.comunicacion.Memorando;

import gestionmodelosconsultas.memoms.info.Actividad;
import gestionmodelosconsultas.memoms.info.InfoPackage;
import gestionmodelosconsultas.memoms.info.TablaRetencionDocumental;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memo Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.impl.MemoFactoryImpl#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.impl.MemoFactoryImpl#getActividad <em>Actividad</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.impl.MemoFactoryImpl#getMemorando <em>Memorando</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.impl.MemoFactoryImpl#getCircular <em>Circular</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoFactoryImpl extends ElementoModeloImpl implements MemoFactory {
	/**
	 * The cached value of the '{@link #getTablaRetencionDocumental() <em>Tabla Retencion Documental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 * @ordered
	 */
	protected TablaRetencionDocumental tablaRetencionDocumental;

	/**
	 * The cached value of the '{@link #getActividad() <em>Actividad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActividad()
	 * @generated
	 * @ordered
	 */
	protected EList<Actividad> actividad;

	/**
	 * The cached value of the '{@link #getMemorando() <em>Memorando</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorando()
	 * @generated
	 * @ordered
	 */
	protected EList<Memorando> memorando;

	/**
	 * The cached value of the '{@link #getCircular() <em>Circular</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircular()
	 * @generated
	 * @ordered
	 */
	protected EList<Circular> circular;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemomsPackage.Literals.MEMO_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablaRetencionDocumental getTablaRetencionDocumental() {
		return tablaRetencionDocumental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTablaRetencionDocumental(TablaRetencionDocumental newTablaRetencionDocumental, NotificationChain msgs) {
		TablaRetencionDocumental oldTablaRetencionDocumental = tablaRetencionDocumental;
		tablaRetencionDocumental = newTablaRetencionDocumental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL, oldTablaRetencionDocumental, newTablaRetencionDocumental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablaRetencionDocumental(TablaRetencionDocumental newTablaRetencionDocumental) {
		if (newTablaRetencionDocumental != tablaRetencionDocumental) {
			NotificationChain msgs = null;
			if (tablaRetencionDocumental != null)
				msgs = ((InternalEObject)tablaRetencionDocumental).eInverseRemove(this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY, TablaRetencionDocumental.class, msgs);
			if (newTablaRetencionDocumental != null)
				msgs = ((InternalEObject)newTablaRetencionDocumental).eInverseAdd(this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY, TablaRetencionDocumental.class, msgs);
			msgs = basicSetTablaRetencionDocumental(newTablaRetencionDocumental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL, newTablaRetencionDocumental, newTablaRetencionDocumental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actividad> getActividad() {
		if (actividad == null) {
			actividad = new EObjectContainmentWithInverseEList<Actividad>(Actividad.class, this, MemomsPackage.MEMO_FACTORY__ACTIVIDAD, InfoPackage.ACTIVIDAD__MEMO_FACTORY);
		}
		return actividad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memorando> getMemorando() {
		if (memorando == null) {
			memorando = new EObjectContainmentEList<Memorando>(Memorando.class, this, MemomsPackage.MEMO_FACTORY__MEMORANDO);
		}
		return memorando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Circular> getCircular() {
		if (circular == null) {
			circular = new EObjectContainmentEList<Circular>(Circular.class, this, MemomsPackage.MEMO_FACTORY__CIRCULAR);
		}
		return circular;
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
			case MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL:
				if (tablaRetencionDocumental != null)
					msgs = ((InternalEObject)tablaRetencionDocumental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL, null, msgs);
				return basicSetTablaRetencionDocumental((TablaRetencionDocumental)otherEnd, msgs);
			case MemomsPackage.MEMO_FACTORY__ACTIVIDAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActividad()).basicAdd(otherEnd, msgs);
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
			case MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL:
				return basicSetTablaRetencionDocumental(null, msgs);
			case MemomsPackage.MEMO_FACTORY__ACTIVIDAD:
				return ((InternalEList<?>)getActividad()).basicRemove(otherEnd, msgs);
			case MemomsPackage.MEMO_FACTORY__MEMORANDO:
				return ((InternalEList<?>)getMemorando()).basicRemove(otherEnd, msgs);
			case MemomsPackage.MEMO_FACTORY__CIRCULAR:
				return ((InternalEList<?>)getCircular()).basicRemove(otherEnd, msgs);
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
			case MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL:
				return getTablaRetencionDocumental();
			case MemomsPackage.MEMO_FACTORY__ACTIVIDAD:
				return getActividad();
			case MemomsPackage.MEMO_FACTORY__MEMORANDO:
				return getMemorando();
			case MemomsPackage.MEMO_FACTORY__CIRCULAR:
				return getCircular();
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
			case MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL:
				setTablaRetencionDocumental((TablaRetencionDocumental)newValue);
				return;
			case MemomsPackage.MEMO_FACTORY__ACTIVIDAD:
				getActividad().clear();
				getActividad().addAll((Collection<? extends Actividad>)newValue);
				return;
			case MemomsPackage.MEMO_FACTORY__MEMORANDO:
				getMemorando().clear();
				getMemorando().addAll((Collection<? extends Memorando>)newValue);
				return;
			case MemomsPackage.MEMO_FACTORY__CIRCULAR:
				getCircular().clear();
				getCircular().addAll((Collection<? extends Circular>)newValue);
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
			case MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL:
				setTablaRetencionDocumental((TablaRetencionDocumental)null);
				return;
			case MemomsPackage.MEMO_FACTORY__ACTIVIDAD:
				getActividad().clear();
				return;
			case MemomsPackage.MEMO_FACTORY__MEMORANDO:
				getMemorando().clear();
				return;
			case MemomsPackage.MEMO_FACTORY__CIRCULAR:
				getCircular().clear();
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
			case MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL:
				return tablaRetencionDocumental != null;
			case MemomsPackage.MEMO_FACTORY__ACTIVIDAD:
				return actividad != null && !actividad.isEmpty();
			case MemomsPackage.MEMO_FACTORY__MEMORANDO:
				return memorando != null && !memorando.isEmpty();
			case MemomsPackage.MEMO_FACTORY__CIRCULAR:
				return circular != null && !circular.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoFactoryImpl
