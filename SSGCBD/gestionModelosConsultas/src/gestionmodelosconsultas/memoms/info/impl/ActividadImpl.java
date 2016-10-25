/**
 */
package gestionmodelosconsultas.memoms.info.impl;

import gestionmodelosconsultas.memoms.MemoFactory;
import gestionmodelosconsultas.memoms.MemomsPackage;

import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;
import gestionmodelosconsultas.memoms.comunicacion.Memorando;

import gestionmodelosconsultas.memoms.info.Actividad;
import gestionmodelosconsultas.memoms.info.InfoPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ActividadImpl#getMemorando <em>Memorando</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ActividadImpl#getMemoFactory <em>Memo Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ActividadImpl#getId <em>Id</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ActividadImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.ActividadImpl#getEstado <em>Estado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadImpl extends MinimalEObjectImpl.Container implements Actividad {
	/**
	 * The cached value of the '{@link #getMemorando() <em>Memorando</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorando()
	 * @generated
	 * @ordered
	 */
	protected EList<Memorando> memorando;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
		return InfoPackage.Literals.ACTIVIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memorando> getMemorando() {
		if (memorando == null) {
			memorando = new EObjectWithInverseResolvingEList.ManyInverse<Memorando>(Memorando.class, this, InfoPackage.ACTIVIDAD__MEMORANDO, ComunicacionPackage.MEMORANDO__ACTIVIDAD);
		}
		return memorando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoFactory getMemoFactory() {
		if (eContainerFeatureID() != InfoPackage.ACTIVIDAD__MEMO_FACTORY) return null;
		return (MemoFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoFactory(MemoFactory newMemoFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMemoFactory, InfoPackage.ACTIVIDAD__MEMO_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoFactory(MemoFactory newMemoFactory) {
		if (newMemoFactory != eInternalContainer() || (eContainerFeatureID() != InfoPackage.ACTIVIDAD__MEMO_FACTORY && newMemoFactory != null)) {
			if (EcoreUtil.isAncestor(this, newMemoFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMemoFactory != null)
				msgs = ((InternalEObject)newMemoFactory).eInverseAdd(this, MemomsPackage.MEMO_FACTORY__ACTIVIDAD, MemoFactory.class, msgs);
			msgs = basicSetMemoFactory(newMemoFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.ACTIVIDAD__MEMO_FACTORY, newMemoFactory, newMemoFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.ACTIVIDAD__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.ACTIVIDAD__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.ACTIVIDAD__ESTADO, oldEstado, estado));
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
			case InfoPackage.ACTIVIDAD__MEMORANDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemorando()).basicAdd(otherEnd, msgs);
			case InfoPackage.ACTIVIDAD__MEMO_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMemoFactory((MemoFactory)otherEnd, msgs);
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
			case InfoPackage.ACTIVIDAD__MEMORANDO:
				return ((InternalEList<?>)getMemorando()).basicRemove(otherEnd, msgs);
			case InfoPackage.ACTIVIDAD__MEMO_FACTORY:
				return basicSetMemoFactory(null, msgs);
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
			case InfoPackage.ACTIVIDAD__MEMO_FACTORY:
				return eInternalContainer().eInverseRemove(this, MemomsPackage.MEMO_FACTORY__ACTIVIDAD, MemoFactory.class, msgs);
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
			case InfoPackage.ACTIVIDAD__MEMORANDO:
				return getMemorando();
			case InfoPackage.ACTIVIDAD__MEMO_FACTORY:
				return getMemoFactory();
			case InfoPackage.ACTIVIDAD__ID:
				return getId();
			case InfoPackage.ACTIVIDAD__DESCRIPCION:
				return getDescripcion();
			case InfoPackage.ACTIVIDAD__ESTADO:
				return getEstado();
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
			case InfoPackage.ACTIVIDAD__MEMORANDO:
				getMemorando().clear();
				getMemorando().addAll((Collection<? extends Memorando>)newValue);
				return;
			case InfoPackage.ACTIVIDAD__MEMO_FACTORY:
				setMemoFactory((MemoFactory)newValue);
				return;
			case InfoPackage.ACTIVIDAD__ID:
				setId((String)newValue);
				return;
			case InfoPackage.ACTIVIDAD__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case InfoPackage.ACTIVIDAD__ESTADO:
				setEstado((String)newValue);
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
			case InfoPackage.ACTIVIDAD__MEMORANDO:
				getMemorando().clear();
				return;
			case InfoPackage.ACTIVIDAD__MEMO_FACTORY:
				setMemoFactory((MemoFactory)null);
				return;
			case InfoPackage.ACTIVIDAD__ID:
				setId(ID_EDEFAULT);
				return;
			case InfoPackage.ACTIVIDAD__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case InfoPackage.ACTIVIDAD__ESTADO:
				setEstado(ESTADO_EDEFAULT);
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
			case InfoPackage.ACTIVIDAD__MEMORANDO:
				return memorando != null && !memorando.isEmpty();
			case InfoPackage.ACTIVIDAD__MEMO_FACTORY:
				return getMemoFactory() != null;
			case InfoPackage.ACTIVIDAD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InfoPackage.ACTIVIDAD__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case InfoPackage.ACTIVIDAD__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //ActividadImpl
