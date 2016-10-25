/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;
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
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ValueImpl#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ValueImpl#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value {
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
	 * The cached value of the '{@link #getElementoRealizacionValueAttribute() <em>Elemento Realizacion Value Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoRealizacionValueAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoRealizacionValueAttribute> elementoRealizacionValueAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoRealizacionValueAttribute> getElementoRealizacionValueAttribute() {
		if (elementoRealizacionValueAttribute == null) {
			elementoRealizacionValueAttribute = new EObjectWithInverseResolvingEList.ManyInverse<ElementoRealizacionValueAttribute>(ElementoRealizacionValueAttribute.class, this, EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES);
		}
		return elementoRealizacionValueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizacionDiagramEntity getRealizacionDiagramEntity() {
		if (eContainerFeatureID() != EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY) return null;
		return (RealizacionDiagramEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRealizacionDiagramEntity, EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity) {
		if (newRealizacionDiagramEntity != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY && newRealizacionDiagramEntity != null)) {
			if (EcoreUtil.isAncestor(this, newRealizacionDiagramEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRealizacionDiagramEntity != null)
				msgs = ((InternalEObject)newRealizacionDiagramEntity).eInverseAdd(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES, RealizacionDiagramEntity.class, msgs);
			msgs = basicSetRealizacionDiagramEntity(newRealizacionDiagramEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY, newRealizacionDiagramEntity, newRealizacionDiagramEntity));
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
			case EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementoRealizacionValueAttribute()).basicAdd(otherEnd, msgs);
			case EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRealizacionDiagramEntity((RealizacionDiagramEntity)otherEnd, msgs);
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
			case EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return ((InternalEList<?>)getElementoRealizacionValueAttribute()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY:
				return basicSetRealizacionDiagramEntity(null, msgs);
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
			case EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY:
				return eInternalContainer().eInverseRemove(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES, RealizacionDiagramEntity.class, msgs);
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
			case EntitymodelPackage.VALUE__VALUE:
				return getValue();
			case EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return getElementoRealizacionValueAttribute();
			case EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY:
				return getRealizacionDiagramEntity();
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
			case EntitymodelPackage.VALUE__VALUE:
				setValue((String)newValue);
				return;
			case EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				getElementoRealizacionValueAttribute().clear();
				getElementoRealizacionValueAttribute().addAll((Collection<? extends ElementoRealizacionValueAttribute>)newValue);
				return;
			case EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)newValue);
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
			case EntitymodelPackage.VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				getElementoRealizacionValueAttribute().clear();
				return;
			case EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)null);
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
			case EntitymodelPackage.VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EntitymodelPackage.VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE:
				return elementoRealizacionValueAttribute != null && !elementoRealizacionValueAttribute.isEmpty();
			case EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY:
				return getRealizacionDiagramEntity() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
