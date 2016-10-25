/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.ModelElementEntity;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.TipoModelElementEntity;

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
 * An implementation of the model object '<em><b>Elemento Realizacion Diagram Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl#getNombreModelElementEntity <em>Nombre Model Element Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl#getModelElementEntity <em>Model Element Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl#getListElementoRealizacionAttribute <em>List Elemento Realizacion Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementoRealizacionDiagramEntityImpl extends MinimalEObjectImpl.Container implements ElementoRealizacionDiagramEntity {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoModelElementEntity TIPO_EDEFAULT = TipoModelElementEntity.ENTITY;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoModelElementEntity tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreModelElementEntity() <em>Nombre Model Element Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreModelElementEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_MODEL_ELEMENT_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreModelElementEntity() <em>Nombre Model Element Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreModelElementEntity()
	 * @generated
	 * @ordered
	 */
	protected String nombreModelElementEntity = NOMBRE_MODEL_ELEMENT_ENTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelElementEntity() <em>Model Element Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementEntity()
	 * @generated
	 * @ordered
	 */
	protected ModelElementEntity modelElementEntity;

	/**
	 * The cached value of the '{@link #getListElementoRealizacionAttribute() <em>List Elemento Realizacion Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElementoRealizacionAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoRealizacionValueAttribute> listElementoRealizacionAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoRealizacionDiagramEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.ELEMENTO_REALIZACION_DIAGRAM_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoModelElementEntity getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoModelElementEntity newTipo) {
		TipoModelElementEntity oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreModelElementEntity() {
		return nombreModelElementEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreModelElementEntity(String newNombreModelElementEntity) {
		String oldNombreModelElementEntity = nombreModelElementEntity;
		nombreModelElementEntity = newNombreModelElementEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY, oldNombreModelElementEntity, nombreModelElementEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementEntity getModelElementEntity() {
		if (modelElementEntity != null && modelElementEntity.eIsProxy()) {
			InternalEObject oldModelElementEntity = (InternalEObject)modelElementEntity;
			modelElementEntity = (ModelElementEntity)eResolveProxy(oldModelElementEntity);
			if (modelElementEntity != oldModelElementEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY, oldModelElementEntity, modelElementEntity));
			}
		}
		return modelElementEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementEntity basicGetModelElementEntity() {
		return modelElementEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelElementEntity(ModelElementEntity newModelElementEntity, NotificationChain msgs) {
		ModelElementEntity oldModelElementEntity = modelElementEntity;
		modelElementEntity = newModelElementEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY, oldModelElementEntity, newModelElementEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElementEntity(ModelElementEntity newModelElementEntity) {
		if (newModelElementEntity != modelElementEntity) {
			NotificationChain msgs = null;
			if (modelElementEntity != null)
				msgs = ((InternalEObject)modelElementEntity).eInverseRemove(this, EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY, ModelElementEntity.class, msgs);
			if (newModelElementEntity != null)
				msgs = ((InternalEObject)newModelElementEntity).eInverseAdd(this, EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY, ModelElementEntity.class, msgs);
			msgs = basicSetModelElementEntity(newModelElementEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY, newModelElementEntity, newModelElementEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizacionDiagramEntity getRealizacionDiagramEntity() {
		if (eContainerFeatureID() != EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY) return null;
		return (RealizacionDiagramEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRealizacionDiagramEntity, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity) {
		if (newRealizacionDiagramEntity != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY && newRealizacionDiagramEntity != null)) {
			if (EcoreUtil.isAncestor(this, newRealizacionDiagramEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRealizacionDiagramEntity != null)
				msgs = ((InternalEObject)newRealizacionDiagramEntity).eInverseAdd(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY, RealizacionDiagramEntity.class, msgs);
			msgs = basicSetRealizacionDiagramEntity(newRealizacionDiagramEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY, newRealizacionDiagramEntity, newRealizacionDiagramEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoRealizacionValueAttribute> getListElementoRealizacionAttribute() {
		if (listElementoRealizacionAttribute == null) {
			listElementoRealizacionAttribute = new EObjectContainmentWithInverseEList<ElementoRealizacionValueAttribute>(ElementoRealizacionValueAttribute.class, this, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE, EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY);
		}
		return listElementoRealizacionAttribute;
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY:
				if (modelElementEntity != null)
					msgs = ((InternalEObject)modelElementEntity).eInverseRemove(this, EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY, ModelElementEntity.class, msgs);
				return basicSetModelElementEntity((ModelElementEntity)otherEnd, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRealizacionDiagramEntity((RealizacionDiagramEntity)otherEnd, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListElementoRealizacionAttribute()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY:
				return basicSetModelElementEntity(null, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY:
				return basicSetRealizacionDiagramEntity(null, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE:
				return ((InternalEList<?>)getListElementoRealizacionAttribute()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY:
				return eInternalContainer().eInverseRemove(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY, RealizacionDiagramEntity.class, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO:
				return getTipo();
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY:
				return getNombreModelElementEntity();
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY:
				if (resolve) return getModelElementEntity();
				return basicGetModelElementEntity();
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY:
				return getRealizacionDiagramEntity();
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE:
				return getListElementoRealizacionAttribute();
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO:
				setTipo((TipoModelElementEntity)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY:
				setNombreModelElementEntity((String)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY:
				setModelElementEntity((ModelElementEntity)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE:
				getListElementoRealizacionAttribute().clear();
				getListElementoRealizacionAttribute().addAll((Collection<? extends ElementoRealizacionValueAttribute>)newValue);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY:
				setNombreModelElementEntity(NOMBRE_MODEL_ELEMENT_ENTITY_EDEFAULT);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY:
				setModelElementEntity((ModelElementEntity)null);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)null);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE:
				getListElementoRealizacionAttribute().clear();
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO:
				return tipo != TIPO_EDEFAULT;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY:
				return NOMBRE_MODEL_ELEMENT_ENTITY_EDEFAULT == null ? nombreModelElementEntity != null : !NOMBRE_MODEL_ELEMENT_ENTITY_EDEFAULT.equals(nombreModelElementEntity);
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY:
				return modelElementEntity != null;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY:
				return getRealizacionDiagramEntity() != null;
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE:
				return listElementoRealizacionAttribute != null && !listElementoRealizacionAttribute.isEmpty();
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", nombreModelElementEntity: ");
		result.append(nombreModelElementEntity);
		result.append(')');
		return result.toString();
	}

} //ElementoRealizacionDiagramEntityImpl
