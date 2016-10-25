/**
 */
package gestionmodelosconsultas.sysinfo.function.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import gestionmodelosconsultas.sysinfo.function.Actividad;
import gestionmodelosconsultas.sysinfo.function.FunctionPackage;
import gestionmodelosconsultas.sysinfo.function.InstanciaProceso;

import gestionmodelosconsultas.sysinfo.people.Actor;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;

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
 * An implementation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl#getEjecutantes <em>Ejecutantes</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl#getInstanciaProceso <em>Instancia Proceso</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl#getGenera <em>Genera</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadImpl extends ElementoModeloImpl implements Actividad {
	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEjecutantes() <em>Ejecutantes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjecutantes()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> ejecutantes;

	/**
	 * The cached value of the '{@link #getGenera() <em>Genera</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenera()
	 * @generated
	 * @ordered
	 */
	protected EList<Documento> genera;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.ACTIVIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.ACTIVIDAD__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.ACTIVIDAD__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getEjecutantes() {
		if (ejecutantes == null) {
			ejecutantes = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, FunctionPackage.ACTIVIDAD__EJECUTANTES, PeoplePackage.ACTOR__EJECUTA);
		}
		return ejecutantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanciaProceso getInstanciaProceso() {
		if (eContainerFeatureID() != FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO) return null;
		return (InstanciaProceso)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanciaProceso(InstanciaProceso newInstanciaProceso, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInstanciaProceso, FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanciaProceso(InstanciaProceso newInstanciaProceso) {
		if (newInstanciaProceso != eInternalContainer() || (eContainerFeatureID() != FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO && newInstanciaProceso != null)) {
			if (EcoreUtil.isAncestor(this, newInstanciaProceso))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInstanciaProceso != null)
				msgs = ((InternalEObject)newInstanciaProceso).eInverseAdd(this, FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES, InstanciaProceso.class, msgs);
			msgs = basicSetInstanciaProceso(newInstanciaProceso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO, newInstanciaProceso, newInstanciaProceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documento> getGenera() {
		if (genera == null) {
			genera = new EObjectWithInverseResolvingEList.ManyInverse<Documento>(Documento.class, this, FunctionPackage.ACTIVIDAD__GENERA, DocmgtPackage.DOCUMENTO__ASOCIADO);
		}
		return genera;
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
			case FunctionPackage.ACTIVIDAD__EJECUTANTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEjecutantes()).basicAdd(otherEnd, msgs);
			case FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInstanciaProceso((InstanciaProceso)otherEnd, msgs);
			case FunctionPackage.ACTIVIDAD__GENERA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenera()).basicAdd(otherEnd, msgs);
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
			case FunctionPackage.ACTIVIDAD__EJECUTANTES:
				return ((InternalEList<?>)getEjecutantes()).basicRemove(otherEnd, msgs);
			case FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO:
				return basicSetInstanciaProceso(null, msgs);
			case FunctionPackage.ACTIVIDAD__GENERA:
				return ((InternalEList<?>)getGenera()).basicRemove(otherEnd, msgs);
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
			case FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO:
				return eInternalContainer().eInverseRemove(this, FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES, InstanciaProceso.class, msgs);
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
			case FunctionPackage.ACTIVIDAD__DESCRIPCION:
				return getDescripcion();
			case FunctionPackage.ACTIVIDAD__ESTADO:
				return getEstado();
			case FunctionPackage.ACTIVIDAD__EJECUTANTES:
				return getEjecutantes();
			case FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO:
				return getInstanciaProceso();
			case FunctionPackage.ACTIVIDAD__GENERA:
				return getGenera();
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
			case FunctionPackage.ACTIVIDAD__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case FunctionPackage.ACTIVIDAD__ESTADO:
				setEstado((String)newValue);
				return;
			case FunctionPackage.ACTIVIDAD__EJECUTANTES:
				getEjecutantes().clear();
				getEjecutantes().addAll((Collection<? extends Actor>)newValue);
				return;
			case FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO:
				setInstanciaProceso((InstanciaProceso)newValue);
				return;
			case FunctionPackage.ACTIVIDAD__GENERA:
				getGenera().clear();
				getGenera().addAll((Collection<? extends Documento>)newValue);
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
			case FunctionPackage.ACTIVIDAD__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case FunctionPackage.ACTIVIDAD__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case FunctionPackage.ACTIVIDAD__EJECUTANTES:
				getEjecutantes().clear();
				return;
			case FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO:
				setInstanciaProceso((InstanciaProceso)null);
				return;
			case FunctionPackage.ACTIVIDAD__GENERA:
				getGenera().clear();
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
			case FunctionPackage.ACTIVIDAD__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case FunctionPackage.ACTIVIDAD__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case FunctionPackage.ACTIVIDAD__EJECUTANTES:
				return ejecutantes != null && !ejecutantes.isEmpty();
			case FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO:
				return getInstanciaProceso() != null;
			case FunctionPackage.ACTIVIDAD__GENERA:
				return genera != null && !genera.isEmpty();
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
		result.append(" (descripcion: ");
		result.append(descripcion);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //ActividadImpl
