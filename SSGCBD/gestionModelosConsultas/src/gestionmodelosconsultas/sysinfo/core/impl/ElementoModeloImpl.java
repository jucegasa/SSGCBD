/**
 */
package gestionmodelosconsultas.sysinfo.core.impl;

import gestionmodelosconsultas.sysinfo.Paquete;
import gestionmodelosconsultas.sysinfo.SysinfoPackage;

import gestionmodelosconsultas.sysinfo.core.CorePackage;
import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry;

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
 * An implementation of the model object '<em><b>Elemento Modelo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl#getContexto <em>Contexto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl#getFrom <em>From</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementoModeloImpl extends MinimalEObjectImpl.Container implements ElementoModelo {
	/**
	 * The cached value of the '{@link #getContexto() <em>Contexto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexto()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexEntry> contexto;

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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoModelo> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoModelo> to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoModeloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ELEMENTO_MODELO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquete getOwner() {
		if (eContainerFeatureID() != CorePackage.ELEMENTO_MODELO__OWNER) return null;
		return (Paquete)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Paquete newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, CorePackage.ELEMENTO_MODELO__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Paquete newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != CorePackage.ELEMENTO_MODELO__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, SysinfoPackage.PAQUETE__ELEMENT, Paquete.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENTO_MODELO__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntry> getContexto() {
		if (contexto == null) {
			contexto = new EObjectWithInverseResolvingEList.ManyInverse<IndexEntry>(IndexEntry.class, this, CorePackage.ELEMENTO_MODELO__CONTEXTO, DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO);
		}
		return contexto;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENTO_MODELO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoModelo> getFrom() {
		if (from == null) {
			from = new EObjectWithInverseResolvingEList.ManyInverse<ElementoModelo>(ElementoModelo.class, this, CorePackage.ELEMENTO_MODELO__FROM, CorePackage.ELEMENTO_MODELO__TO);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoModelo> getTo() {
		if (to == null) {
			to = new EObjectWithInverseResolvingEList.ManyInverse<ElementoModelo>(ElementoModelo.class, this, CorePackage.ELEMENTO_MODELO__TO, CorePackage.ELEMENTO_MODELO__FROM);
		}
		return to;
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
			case CorePackage.ELEMENTO_MODELO__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Paquete)otherEnd, msgs);
			case CorePackage.ELEMENTO_MODELO__CONTEXTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContexto()).basicAdd(otherEnd, msgs);
			case CorePackage.ELEMENTO_MODELO__FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrom()).basicAdd(otherEnd, msgs);
			case CorePackage.ELEMENTO_MODELO__TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTo()).basicAdd(otherEnd, msgs);
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
			case CorePackage.ELEMENTO_MODELO__OWNER:
				return basicSetOwner(null, msgs);
			case CorePackage.ELEMENTO_MODELO__CONTEXTO:
				return ((InternalEList<?>)getContexto()).basicRemove(otherEnd, msgs);
			case CorePackage.ELEMENTO_MODELO__FROM:
				return ((InternalEList<?>)getFrom()).basicRemove(otherEnd, msgs);
			case CorePackage.ELEMENTO_MODELO__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ELEMENTO_MODELO__OWNER:
				return eInternalContainer().eInverseRemove(this, SysinfoPackage.PAQUETE__ELEMENT, Paquete.class, msgs);
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
			case CorePackage.ELEMENTO_MODELO__OWNER:
				return getOwner();
			case CorePackage.ELEMENTO_MODELO__CONTEXTO:
				return getContexto();
			case CorePackage.ELEMENTO_MODELO__NOMBRE:
				return getNombre();
			case CorePackage.ELEMENTO_MODELO__FROM:
				return getFrom();
			case CorePackage.ELEMENTO_MODELO__TO:
				return getTo();
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
			case CorePackage.ELEMENTO_MODELO__OWNER:
				setOwner((Paquete)newValue);
				return;
			case CorePackage.ELEMENTO_MODELO__CONTEXTO:
				getContexto().clear();
				getContexto().addAll((Collection<? extends IndexEntry>)newValue);
				return;
			case CorePackage.ELEMENTO_MODELO__NOMBRE:
				setNombre((String)newValue);
				return;
			case CorePackage.ELEMENTO_MODELO__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends ElementoModelo>)newValue);
				return;
			case CorePackage.ELEMENTO_MODELO__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ElementoModelo>)newValue);
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
			case CorePackage.ELEMENTO_MODELO__OWNER:
				setOwner((Paquete)null);
				return;
			case CorePackage.ELEMENTO_MODELO__CONTEXTO:
				getContexto().clear();
				return;
			case CorePackage.ELEMENTO_MODELO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CorePackage.ELEMENTO_MODELO__FROM:
				getFrom().clear();
				return;
			case CorePackage.ELEMENTO_MODELO__TO:
				getTo().clear();
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
			case CorePackage.ELEMENTO_MODELO__OWNER:
				return getOwner() != null;
			case CorePackage.ELEMENTO_MODELO__CONTEXTO:
				return contexto != null && !contexto.isEmpty();
			case CorePackage.ELEMENTO_MODELO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CorePackage.ELEMENTO_MODELO__FROM:
				return from != null && !from.isEmpty();
			case CorePackage.ELEMENTO_MODELO__TO:
				return to != null && !to.isEmpty();
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

} //ElementoModeloImpl
