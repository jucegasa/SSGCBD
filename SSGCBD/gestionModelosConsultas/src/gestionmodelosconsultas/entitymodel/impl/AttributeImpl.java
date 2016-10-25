/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.Attribute;
import gestionmodelosconsultas.entitymodel.AttributeType;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute;
import gestionmodelosconsultas.entitymodel.Entity;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.Type;

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
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl#getElementoRealizacionVisibleAttribute <em>Elemento Realizacion Visible Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeType ATTRIBUTE_TYPE_EDEFAULT = AttributeType.ORDINARY;

	/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected AttributeType attributeType = ATTRIBUTE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementoRealizacionValueAttribute() <em>Elemento Realizacion Value Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoRealizacionValueAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoRealizacionValueAttribute> elementoRealizacionValueAttribute;

	/**
	 * The cached value of the '{@link #getElementoRealizacionVisibleAttribute() <em>Elemento Realizacion Visible Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoRealizacionVisibleAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoRealizacionVisibleAttribute> elementoRealizacionVisibleAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ATTRIBUTE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getAttributeType() {
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(AttributeType newAttributeType) {
		AttributeType oldAttributeType = attributeType;
		attributeType = newAttributeType == null ? ATTRIBUTE_TYPE_EDEFAULT : newAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (eContainerFeatureID() != EntitymodelPackage.ATTRIBUTE__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, EntitymodelPackage.ATTRIBUTE__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.ATTRIBUTE__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EntitymodelPackage.ENTITY__LIST_ATTRIBUTES, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ATTRIBUTE__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoRealizacionValueAttribute> getElementoRealizacionValueAttribute() {
		if (elementoRealizacionValueAttribute == null) {
			elementoRealizacionValueAttribute = new EObjectWithInverseResolvingEList.ManyInverse<ElementoRealizacionValueAttribute>(ElementoRealizacionValueAttribute.class, this, EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE);
		}
		return elementoRealizacionValueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoRealizacionVisibleAttribute> getElementoRealizacionVisibleAttribute() {
		if (elementoRealizacionVisibleAttribute == null) {
			elementoRealizacionVisibleAttribute = new EObjectWithInverseResolvingEList.ManyInverse<ElementoRealizacionVisibleAttribute>(ElementoRealizacionVisibleAttribute.class, this, EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE, EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE);
		}
		return elementoRealizacionVisibleAttribute;
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
			case EntitymodelPackage.ATTRIBUTE__ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntity((Entity)otherEnd, msgs);
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementoRealizacionValueAttribute()).basicAdd(otherEnd, msgs);
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementoRealizacionVisibleAttribute()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.ATTRIBUTE__ENTITY:
				return basicSetEntity(null, msgs);
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return ((InternalEList<?>)getElementoRealizacionValueAttribute()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE:
				return ((InternalEList<?>)getElementoRealizacionVisibleAttribute()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.ATTRIBUTE__ENTITY:
				return eInternalContainer().eInverseRemove(this, EntitymodelPackage.ENTITY__LIST_ATTRIBUTES, Entity.class, msgs);
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
			case EntitymodelPackage.ATTRIBUTE__NAME:
				return getName();
			case EntitymodelPackage.ATTRIBUTE__TYPE:
				return getType();
			case EntitymodelPackage.ATTRIBUTE__VALUE:
				return getValue();
			case EntitymodelPackage.ATTRIBUTE__VISIBLE:
				return isVisible();
			case EntitymodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return getAttributeType();
			case EntitymodelPackage.ATTRIBUTE__ENTITY:
				return getEntity();
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return getElementoRealizacionValueAttribute();
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE:
				return getElementoRealizacionVisibleAttribute();
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
			case EntitymodelPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case EntitymodelPackage.ATTRIBUTE__TYPE:
				setType((Type)newValue);
				return;
			case EntitymodelPackage.ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case EntitymodelPackage.ATTRIBUTE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case EntitymodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((AttributeType)newValue);
				return;
			case EntitymodelPackage.ATTRIBUTE__ENTITY:
				setEntity((Entity)newValue);
				return;
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				getElementoRealizacionValueAttribute().clear();
				getElementoRealizacionValueAttribute().addAll((Collection<? extends ElementoRealizacionValueAttribute>)newValue);
				return;
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE:
				getElementoRealizacionVisibleAttribute().clear();
				getElementoRealizacionVisibleAttribute().addAll((Collection<? extends ElementoRealizacionVisibleAttribute>)newValue);
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
			case EntitymodelPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntitymodelPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EntitymodelPackage.ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EntitymodelPackage.ATTRIBUTE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case EntitymodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
				return;
			case EntitymodelPackage.ATTRIBUTE__ENTITY:
				setEntity((Entity)null);
				return;
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				getElementoRealizacionValueAttribute().clear();
				return;
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE:
				getElementoRealizacionVisibleAttribute().clear();
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
			case EntitymodelPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntitymodelPackage.ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case EntitymodelPackage.ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EntitymodelPackage.ATTRIBUTE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case EntitymodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return attributeType != ATTRIBUTE_TYPE_EDEFAULT;
			case EntitymodelPackage.ATTRIBUTE__ENTITY:
				return getEntity() != null;
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return elementoRealizacionValueAttribute != null && !elementoRealizacionValueAttribute.isEmpty();
			case EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE:
				return elementoRealizacionVisibleAttribute != null && !elementoRealizacionVisibleAttribute.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(", visible: ");
		result.append(visible);
		result.append(", attributeType: ");
		result.append(attributeType);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
