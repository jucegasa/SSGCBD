/**
 */
package gestionmodelosconsultas.modeloconsultas.quien.impl;

import gestionmodelosconsultas.modeloconsultas.model.Campo;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import gestionmodelosconsultas.modeloconsultas.quien.QuienPackage;
import gestionmodelosconsultas.modeloconsultas.quien.UnidadOrganizacional;

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
 * An implementation of the model object '<em><b>Unidad Organizacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl#getEADiagram <em>EA Diagram</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl#getListCampos <em>List Campos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnidadOrganizacionalImpl extends gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl implements UnidadOrganizacional {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListCampos() <em>List Campos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListCampos()
	 * @generated
	 * @ordered
	 */
	protected EList<Campo> listCampos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnidadOrganizacionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuienPackage.Literals.UNIDAD_ORGANIZACIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Integer newOrder) {
		Integer oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuienPackage.UNIDAD_ORGANIZACIONAL__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADiagram getEADiagram() {
		if (eContainerFeatureID() != QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM) return null;
		return (EADiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEADiagram(EADiagram newEADiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEADiagram, QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEADiagram(EADiagram newEADiagram) {
		if (newEADiagram != eInternalContainer() || (eContainerFeatureID() != QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM && newEADiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEADiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEADiagram != null)
				msgs = ((InternalEObject)newEADiagram).eInverseAdd(this, ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA, EADiagram.class, msgs);
			msgs = basicSetEADiagram(newEADiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM, newEADiagram, newEADiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Campo> getListCampos() {
		if (listCampos == null) {
			listCampos = new EObjectContainmentWithInverseEList<Campo>(Campo.class, this, QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS, ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA);
		}
		return listCampos;
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEADiagram((EADiagram)otherEnd, msgs);
			case QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListCampos()).basicAdd(otherEnd, msgs);
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM:
				return basicSetEADiagram(null, msgs);
			case QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS:
				return ((InternalEList<?>)getListCampos()).basicRemove(otherEnd, msgs);
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA, EADiagram.class, msgs);
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL__ORDER:
				return getOrder();
			case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM:
				return getEADiagram();
			case QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS:
				return getListCampos();
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL__ORDER:
				setOrder((Integer)newValue);
				return;
			case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM:
				setEADiagram((EADiagram)newValue);
				return;
			case QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS:
				getListCampos().clear();
				getListCampos().addAll((Collection<? extends Campo>)newValue);
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM:
				setEADiagram((EADiagram)null);
				return;
			case QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS:
				getListCampos().clear();
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM:
				return getEADiagram() != null;
			case QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS:
				return listCampos != null && !listCampos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElementoConsulta.class) {
			switch (derivedFeatureID) {
				case QuienPackage.UNIDAD_ORGANIZACIONAL__ORDER: return ModelPackage.ELEMENTO_CONSULTA__ORDER;
				case QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM: return ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;
				case QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS: return ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElementoConsulta.class) {
			switch (baseFeatureID) {
				case ModelPackage.ELEMENTO_CONSULTA__ORDER: return QuienPackage.UNIDAD_ORGANIZACIONAL__ORDER;
				case ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM: return QuienPackage.UNIDAD_ORGANIZACIONAL__EA_DIAGRAM;
				case ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS: return QuienPackage.UNIDAD_ORGANIZACIONAL__LIST_CAMPOS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //UnidadOrganizacionalImpl
