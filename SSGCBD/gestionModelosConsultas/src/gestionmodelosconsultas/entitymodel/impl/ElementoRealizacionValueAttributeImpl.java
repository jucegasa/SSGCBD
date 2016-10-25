/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.Attribute;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.Value;

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
 * An implementation of the model object '<em><b>Elemento Realizacion Value Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl#getValueAttribute <em>Value Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementoRealizacionValueAttributeImpl extends MinimalEObjectImpl.Container implements ElementoRealizacionValueAttribute {
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
	 * The cached value of the '{@link #getValueAttribute() <em>Value Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> valueAttribute;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoRealizacionValueAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getValueAttribute() {
		if (valueAttribute == null) {
			valueAttribute = new EObjectWithInverseResolvingEList.ManyInverse<Attribute>(Attribute.class, this, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE, EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE);
		}
		return valueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoRealizacionDiagramEntity getElementoRealizacionDiagramEntity() {
		if (eContainerFeatureID() != EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY) return null;
		return (ElementoRealizacionDiagramEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementoRealizacionDiagramEntity(ElementoRealizacionDiagramEntity newElementoRealizacionDiagramEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElementoRealizacionDiagramEntity, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementoRealizacionDiagramEntity(ElementoRealizacionDiagramEntity newElementoRealizacionDiagramEntity) {
		if (newElementoRealizacionDiagramEntity != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY && newElementoRealizacionDiagramEntity != null)) {
			if (EcoreUtil.isAncestor(this, newElementoRealizacionDiagramEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElementoRealizacionDiagramEntity != null)
				msgs = ((InternalEObject)newElementoRealizacionDiagramEntity).eInverseAdd(this, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE, ElementoRealizacionDiagramEntity.class, msgs);
			msgs = basicSetElementoRealizacionDiagramEntity(newElementoRealizacionDiagramEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY, newElementoRealizacionDiagramEntity, newElementoRealizacionDiagramEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectWithInverseResolvingEList.ManyInverse<Value>(Value.class, this, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES, EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE);
		}
		return values;
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueAttribute()).basicAdd(otherEnd, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElementoRealizacionDiagramEntity((ElementoRealizacionDiagramEntity)otherEnd, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE:
				return ((InternalEList<?>)getValueAttribute()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return basicSetElementoRealizacionDiagramEntity(null, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return eInternalContainer().eInverseRemove(this, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE, ElementoRealizacionDiagramEntity.class, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE:
				return getNombre();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE:
				return getValueAttribute();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return getElementoRealizacionDiagramEntity();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES:
				return getValues();
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE:
				getValueAttribute().clear();
				getValueAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				setElementoRealizacionDiagramEntity((ElementoRealizacionDiagramEntity)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE:
				getValueAttribute().clear();
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				setElementoRealizacionDiagramEntity((ElementoRealizacionDiagramEntity)null);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES:
				getValues().clear();
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE:
				return valueAttribute != null && !valueAttribute.isEmpty();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return getElementoRealizacionDiagramEntity() != null;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES:
				return values != null && !values.isEmpty();
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

} //ElementoRealizacionValueAttributeImpl
