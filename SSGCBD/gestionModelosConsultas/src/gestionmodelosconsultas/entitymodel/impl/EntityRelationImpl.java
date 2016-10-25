/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.Entity;
import gestionmodelosconsultas.entitymodel.EntityRelation;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.Multiplicity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl#getAtributteForeingKeySource <em>Atributte Foreing Key Source</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl#getAtributtePrimaryKeyTarget <em>Atributte Primary Key Target</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl#getTheFactoryEntity <em>The Factory Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRelationImpl extends ModelElementEntityImpl implements EntityRelation {
	/**
	 * The default value of the '{@link #getAtributteForeingKeySource() <em>Atributte Foreing Key Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributteForeingKeySource()
	 * @generated
	 * @ordered
	 */
	protected static final String ATRIBUTTE_FOREING_KEY_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtributteForeingKeySource() <em>Atributte Foreing Key Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributteForeingKeySource()
	 * @generated
	 * @ordered
	 */
	protected String atributteForeingKeySource = ATRIBUTTE_FOREING_KEY_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAtributtePrimaryKeyTarget() <em>Atributte Primary Key Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributtePrimaryKeyTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String ATRIBUTTE_PRIMARY_KEY_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtributtePrimaryKeyTarget() <em>Atributte Primary Key Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributtePrimaryKeyTarget()
	 * @generated
	 * @ordered
	 */
	protected String atributtePrimaryKeyTarget = ATRIBUTTE_PRIMARY_KEY_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicitySource() <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySource()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_SOURCE_EDEFAULT = Multiplicity.MANY_TO_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicitySource() <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySource()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicitySource = MULTIPLICITY_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_TARGET_EDEFAULT = Multiplicity.ONE_TO_MANY;

	/**
	 * The cached value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicityTarget = MULTIPLICITY_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Entity source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Entity target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.ENTITY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtributteForeingKeySource() {
		return atributteForeingKeySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributteForeingKeySource(String newAtributteForeingKeySource) {
		String oldAtributteForeingKeySource = atributteForeingKeySource;
		atributteForeingKeySource = newAtributteForeingKeySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE, oldAtributteForeingKeySource, atributteForeingKeySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtributtePrimaryKeyTarget() {
		return atributtePrimaryKeyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributtePrimaryKeyTarget(String newAtributtePrimaryKeyTarget) {
		String oldAtributtePrimaryKeyTarget = atributtePrimaryKeyTarget;
		atributtePrimaryKeyTarget = newAtributtePrimaryKeyTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET, oldAtributtePrimaryKeyTarget, atributtePrimaryKeyTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicitySource() {
		return multiplicitySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicitySource(Multiplicity newMultiplicitySource) {
		Multiplicity oldMultiplicitySource = multiplicitySource;
		multiplicitySource = newMultiplicitySource == null ? MULTIPLICITY_SOURCE_EDEFAULT : newMultiplicitySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_SOURCE, oldMultiplicitySource, multiplicitySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicityTarget() {
		return multiplicityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityTarget(Multiplicity newMultiplicityTarget) {
		Multiplicity oldMultiplicityTarget = multiplicityTarget;
		multiplicityTarget = newMultiplicityTarget == null ? MULTIPLICITY_TARGET_EDEFAULT : newMultiplicityTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_TARGET, oldMultiplicityTarget, multiplicityTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramEntity getTheFactoryEntity() {
		if (eContainerFeatureID() != EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY) return null;
		return (DiagramEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheFactoryEntity(DiagramEntity newTheFactoryEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheFactoryEntity, EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheFactoryEntity(DiagramEntity newTheFactoryEntity) {
		if (newTheFactoryEntity != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY && newTheFactoryEntity != null)) {
			if (EcoreUtil.isAncestor(this, newTheFactoryEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheFactoryEntity != null)
				msgs = ((InternalEObject)newTheFactoryEntity).eInverseAdd(this, EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION, DiagramEntity.class, msgs);
			msgs = basicSetTheFactoryEntity(newTheFactoryEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY, newTheFactoryEntity, newTheFactoryEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Entity)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntitymodelPackage.ENTITY_RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Entity newSource) {
		Entity oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY_RELATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Entity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntitymodelPackage.ENTITY_RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Entity newTarget) {
		Entity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ENTITY_RELATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheFactoryEntity((DiagramEntity)otherEnd, msgs);
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
			case EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY:
				return basicSetTheFactoryEntity(null, msgs);
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
			case EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY:
				return eInternalContainer().eInverseRemove(this, EntitymodelPackage.DIAGRAM_ENTITY__LIST_ENTITY_RELATION, DiagramEntity.class, msgs);
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
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE:
				return getAtributteForeingKeySource();
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET:
				return getAtributtePrimaryKeyTarget();
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_SOURCE:
				return getMultiplicitySource();
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_TARGET:
				return getMultiplicityTarget();
			case EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY:
				return getTheFactoryEntity();
			case EntitymodelPackage.ENTITY_RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case EntitymodelPackage.ENTITY_RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE:
				setAtributteForeingKeySource((String)newValue);
				return;
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET:
				setAtributtePrimaryKeyTarget((String)newValue);
				return;
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_SOURCE:
				setMultiplicitySource((Multiplicity)newValue);
				return;
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_TARGET:
				setMultiplicityTarget((Multiplicity)newValue);
				return;
			case EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY:
				setTheFactoryEntity((DiagramEntity)newValue);
				return;
			case EntitymodelPackage.ENTITY_RELATION__SOURCE:
				setSource((Entity)newValue);
				return;
			case EntitymodelPackage.ENTITY_RELATION__TARGET:
				setTarget((Entity)newValue);
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
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE:
				setAtributteForeingKeySource(ATRIBUTTE_FOREING_KEY_SOURCE_EDEFAULT);
				return;
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET:
				setAtributtePrimaryKeyTarget(ATRIBUTTE_PRIMARY_KEY_TARGET_EDEFAULT);
				return;
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_SOURCE:
				setMultiplicitySource(MULTIPLICITY_SOURCE_EDEFAULT);
				return;
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_TARGET:
				setMultiplicityTarget(MULTIPLICITY_TARGET_EDEFAULT);
				return;
			case EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY:
				setTheFactoryEntity((DiagramEntity)null);
				return;
			case EntitymodelPackage.ENTITY_RELATION__SOURCE:
				setSource((Entity)null);
				return;
			case EntitymodelPackage.ENTITY_RELATION__TARGET:
				setTarget((Entity)null);
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
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE:
				return ATRIBUTTE_FOREING_KEY_SOURCE_EDEFAULT == null ? atributteForeingKeySource != null : !ATRIBUTTE_FOREING_KEY_SOURCE_EDEFAULT.equals(atributteForeingKeySource);
			case EntitymodelPackage.ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET:
				return ATRIBUTTE_PRIMARY_KEY_TARGET_EDEFAULT == null ? atributtePrimaryKeyTarget != null : !ATRIBUTTE_PRIMARY_KEY_TARGET_EDEFAULT.equals(atributtePrimaryKeyTarget);
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_SOURCE:
				return multiplicitySource != MULTIPLICITY_SOURCE_EDEFAULT;
			case EntitymodelPackage.ENTITY_RELATION__MULTIPLICITY_TARGET:
				return multiplicityTarget != MULTIPLICITY_TARGET_EDEFAULT;
			case EntitymodelPackage.ENTITY_RELATION__THE_FACTORY_ENTITY:
				return getTheFactoryEntity() != null;
			case EntitymodelPackage.ENTITY_RELATION__SOURCE:
				return source != null;
			case EntitymodelPackage.ENTITY_RELATION__TARGET:
				return target != null;
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
		result.append(" (atributteForeingKeySource: ");
		result.append(atributteForeingKeySource);
		result.append(", atributtePrimaryKeyTarget: ");
		result.append(atributtePrimaryKeyTarget);
		result.append(", multiplicitySource: ");
		result.append(multiplicitySource);
		result.append(", multiplicityTarget: ");
		result.append(multiplicityTarget);
		result.append(')');
		return result.toString();
	}

} //EntityRelationImpl
