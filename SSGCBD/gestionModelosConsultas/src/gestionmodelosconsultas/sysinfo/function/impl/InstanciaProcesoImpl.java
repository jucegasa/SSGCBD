/**
 */
package gestionmodelosconsultas.sysinfo.function.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.function.Actividad;
import gestionmodelosconsultas.sysinfo.function.FunctionPackage;
import gestionmodelosconsultas.sysinfo.function.InstanciaProceso;

import gestionmodelosconsultas.sysinfo.people.Actor;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

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
 * An implementation of the model object '<em><b>Instancia Proceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl#getActividades <em>Actividades</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl#getActorResponsable <em>Actor Responsable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanciaProcesoImpl extends ElementoModeloImpl implements InstanciaProceso {
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
	 * The cached value of the '{@link #getActividades() <em>Actividades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActividades()
	 * @generated
	 * @ordered
	 */
	protected EList<Actividad> actividades;

	/**
	 * The cached value of the '{@link #getActorResponsable() <em>Actor Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorResponsable()
	 * @generated
	 * @ordered
	 */
	protected Actor actorResponsable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanciaProcesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.INSTANCIA_PROCESO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.INSTANCIA_PROCESO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actividad> getActividades() {
		if (actividades == null) {
			actividades = new EObjectContainmentWithInverseEList<Actividad>(Actividad.class, this, FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES, FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO);
		}
		return actividades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional getUnidadOrganizacional() {
		if (eContainerFeatureID() != FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL) return null;
		return (UnidadOrganizacional)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidadOrganizacional, FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional) {
		if (newUnidadOrganizacional != eInternalContainer() || (eContainerFeatureID() != FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL && newUnidadOrganizacional != null)) {
			if (EcoreUtil.isAncestor(this, newUnidadOrganizacional))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidadOrganizacional != null)
				msgs = ((InternalEObject)newUnidadOrganizacional).eInverseAdd(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS, UnidadOrganizacional.class, msgs);
			msgs = basicSetUnidadOrganizacional(newUnidadOrganizacional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL, newUnidadOrganizacional, newUnidadOrganizacional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActorResponsable() {
		if (actorResponsable != null && actorResponsable.eIsProxy()) {
			InternalEObject oldActorResponsable = (InternalEObject)actorResponsable;
			actorResponsable = (Actor)eResolveProxy(oldActorResponsable);
			if (actorResponsable != oldActorResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE, oldActorResponsable, actorResponsable));
			}
		}
		return actorResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActorResponsable() {
		return actorResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActorResponsable(Actor newActorResponsable, NotificationChain msgs) {
		Actor oldActorResponsable = actorResponsable;
		actorResponsable = newActorResponsable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE, oldActorResponsable, newActorResponsable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorResponsable(Actor newActorResponsable) {
		if (newActorResponsable != actorResponsable) {
			NotificationChain msgs = null;
			if (actorResponsable != null)
				msgs = ((InternalEObject)actorResponsable).eInverseRemove(this, PeoplePackage.ACTOR__PROCESOS_RESPONSABLE, Actor.class, msgs);
			if (newActorResponsable != null)
				msgs = ((InternalEObject)newActorResponsable).eInverseAdd(this, PeoplePackage.ACTOR__PROCESOS_RESPONSABLE, Actor.class, msgs);
			msgs = basicSetActorResponsable(newActorResponsable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE, newActorResponsable, newActorResponsable));
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
			case FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActividades()).basicAdd(otherEnd, msgs);
			case FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidadOrganizacional((UnidadOrganizacional)otherEnd, msgs);
			case FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE:
				if (actorResponsable != null)
					msgs = ((InternalEObject)actorResponsable).eInverseRemove(this, PeoplePackage.ACTOR__PROCESOS_RESPONSABLE, Actor.class, msgs);
				return basicSetActorResponsable((Actor)otherEnd, msgs);
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
			case FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES:
				return ((InternalEList<?>)getActividades()).basicRemove(otherEnd, msgs);
			case FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL:
				return basicSetUnidadOrganizacional(null, msgs);
			case FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE:
				return basicSetActorResponsable(null, msgs);
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
			case FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS, UnidadOrganizacional.class, msgs);
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
			case FunctionPackage.INSTANCIA_PROCESO__DESCRIPCION:
				return getDescripcion();
			case FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES:
				return getActividades();
			case FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional();
			case FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE:
				if (resolve) return getActorResponsable();
				return basicGetActorResponsable();
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
			case FunctionPackage.INSTANCIA_PROCESO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES:
				getActividades().clear();
				getActividades().addAll((Collection<? extends Actividad>)newValue);
				return;
			case FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)newValue);
				return;
			case FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE:
				setActorResponsable((Actor)newValue);
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
			case FunctionPackage.INSTANCIA_PROCESO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES:
				getActividades().clear();
				return;
			case FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)null);
				return;
			case FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE:
				setActorResponsable((Actor)null);
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
			case FunctionPackage.INSTANCIA_PROCESO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES:
				return actividades != null && !actividades.isEmpty();
			case FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional() != null;
			case FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE:
				return actorResponsable != null;
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
		result.append(')');
		return result.toString();
	}

} //InstanciaProcesoImpl
