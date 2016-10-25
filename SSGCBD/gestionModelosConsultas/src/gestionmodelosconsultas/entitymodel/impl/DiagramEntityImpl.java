/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;
import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.Entity;
import gestionmodelosconsultas.entitymodel.EntityRelation;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.DiagramEntityImpl#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.DiagramEntityImpl#getListEntity <em>List Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.DiagramEntityImpl#getListEntityRelation <em>List Entity Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramEntityImpl extends MinimalEObjectImpl.Container implements DiagramEntity {
	/**
	 * The cached value of the '{@link #getListEntity() <em>List Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> listEntity;

	/**
	 * The cached value of the '{@link #getListEntityRelation() <em>List Entity Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListEntityRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityRelation> listEntityRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.DIAGRAM_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		if (eContainerFeatureID() != EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelFactory(ModelFactory newModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelFactory, EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactory(ModelFactory newModelFactory) {
		if (newModelFactory != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY && newModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelFactory != null)
				msgs = ((InternalEObject)newModelFactory).eInverseAdd(this, GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY, ModelFactory.class, msgs);
			msgs = basicSetModelFactory(newModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY, newModelFactory, newModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getListEntity() {
		if (listEntity == null) {
			listEntity = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this, EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY, EntitymodelPackage.ENTITY__OWNED_BY_FACTORY_ENTITY);
		}
		return listEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityRelation> getListEntityRelation() {
		if (listEntityRelation == null) {
			listEntityRelation = new EObjectContainmentWithInverseEList<EntityRelation>(EntityRelation.class, this, EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION, EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY);
		}
		return listEntityRelation;
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
			case EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelFactory((ModelFactory)otherEnd, msgs);
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListEntity()).basicAdd(otherEnd, msgs);
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListEntityRelation()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY:
				return basicSetModelFactory(null, msgs);
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY:
				return ((InternalEList<?>)getListEntity()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION:
				return ((InternalEList<?>)getListEntityRelation()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY, ModelFactory.class, msgs);
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
			case EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY:
				return getModelFactory();
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY:
				return getListEntity();
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION:
				return getListEntityRelation();
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
			case EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY:
				setModelFactory((ModelFactory)newValue);
				return;
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY:
				getListEntity().clear();
				getListEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION:
				getListEntityRelation().clear();
				getListEntityRelation().addAll((Collection<? extends EntityRelation>)newValue);
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
			case EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY:
				setModelFactory((ModelFactory)null);
				return;
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY:
				getListEntity().clear();
				return;
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION:
				getListEntityRelation().clear();
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
			case EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY:
				return getModelFactory() != null;
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY:
				return listEntity != null && !listEntity.isEmpty();
			case EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION:
				return listEntityRelation != null && !listEntityRelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramEntityImpl
