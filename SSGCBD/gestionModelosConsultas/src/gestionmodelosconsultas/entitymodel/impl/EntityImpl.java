/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.Attribute;
import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.Entity;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityImpl#getOwnedByFactoryEntity <em>Owned By Factory Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityImpl#getListAttributes <em>List Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ModelElementEntityImpl implements Entity {
	/**
	 * The cached value of the '{@link #getListAttributes() <em>List Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> listAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramEntity getOwnedByFactoryEntity() {
		if (eContainerFeatureID() != EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY) return null;
		return (DiagramEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByFactoryEntity(DiagramEntity newOwnedByFactoryEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByFactoryEntity, EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByFactoryEntity(DiagramEntity newOwnedByFactoryEntity) {
		if (newOwnedByFactoryEntity != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY && newOwnedByFactoryEntity != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByFactoryEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByFactoryEntity != null)
				msgs = ((InternalEObject)newOwnedByFactoryEntity).eInverseAdd(this, EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY, DiagramEntity.class, msgs);
			msgs = basicSetOwnedByFactoryEntity(newOwnedByFactoryEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY, newOwnedByFactoryEntity, newOwnedByFactoryEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getListAttributes() {
		if (listAttributes == null) {
			listAttributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, EntitymodelPackage.ENTITY__LIST_ATTRIBUTES, EntitymodelPackage.ATTRIBUTE__ENTITY);
		}
		return listAttributes;
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
			case EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByFactoryEntity((DiagramEntity)otherEnd, msgs);
			case EntitymodelPackage.ENTITY__LIST_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListAttributes()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY:
				return basicSetOwnedByFactoryEntity(null, msgs);
			case EntitymodelPackage.ENTITY__LIST_ATTRIBUTES:
				return ((InternalEList<?>)getListAttributes()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY:
				return eInternalContainer().eInverseRemove(this, EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY, DiagramEntity.class, msgs);
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
			case EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY:
				return getOwnedByFactoryEntity();
			case EntitymodelPackage.ENTITY__LIST_ATTRIBUTES:
				return getListAttributes();
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
			case EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY:
				setOwnedByFactoryEntity((DiagramEntity)newValue);
				return;
			case EntitymodelPackage.ENTITY__LIST_ATTRIBUTES:
				getListAttributes().clear();
				getListAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY:
				setOwnedByFactoryEntity((DiagramEntity)null);
				return;
			case EntitymodelPackage.ENTITY__LIST_ATTRIBUTES:
				getListAttributes().clear();
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
			case EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY:
				return getOwnedByFactoryEntity() != null;
			case EntitymodelPackage.ENTITY__LIST_ATTRIBUTES:
				return listAttributes != null && !listAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
