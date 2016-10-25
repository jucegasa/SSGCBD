/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.Value;

import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

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
 * An implementation of the model object '<em><b>Realizacion Diagram Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl#getModeloConsulta <em>Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl#getListElementoRealizacionDiagramEntity <em>List Elemento Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl#getRealizacionVisibleAttribute <em>Realizacion Visible Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizacionDiagramEntityImpl extends MinimalEObjectImpl.Container implements RealizacionDiagramEntity {
	/**
	 * The cached value of the '{@link #getListElementoRealizacionDiagramEntity() <em>List Elemento Realizacion Diagram Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElementoRealizacionDiagramEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoRealizacionDiagramEntity> listElementoRealizacionDiagramEntity;

	/**
	 * The cached value of the '{@link #getRealizacionVisibleAttribute() <em>Realizacion Visible Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizacionVisibleAttribute()
	 * @generated
	 * @ordered
	 */
	protected ElementoRealizacionVisibleAttribute realizacionVisibleAttribute;

	/**
	 * The cached value of the '{@link #getListValues() <em>List Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> listValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizacionDiagramEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.REALIZACION_DIAGRAM_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConsulta getModeloConsulta() {
		if (eContainerFeatureID() != EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA) return null;
		return (ModeloConsulta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeloConsulta(ModeloConsulta newModeloConsulta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModeloConsulta, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeloConsulta(ModeloConsulta newModeloConsulta) {
		if (newModeloConsulta != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA && newModeloConsulta != null)) {
			if (EcoreUtil.isAncestor(this, newModeloConsulta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModeloConsulta != null)
				msgs = ((InternalEObject)newModeloConsulta).eInverseAdd(this, ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY, ModeloConsulta.class, msgs);
			msgs = basicSetModeloConsulta(newModeloConsulta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA, newModeloConsulta, newModeloConsulta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoRealizacionDiagramEntity> getListElementoRealizacionDiagramEntity() {
		if (listElementoRealizacionDiagramEntity == null) {
			listElementoRealizacionDiagramEntity = new EObjectContainmentWithInverseEList<ElementoRealizacionDiagramEntity>(ElementoRealizacionDiagramEntity.class, this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY);
		}
		return listElementoRealizacionDiagramEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoRealizacionVisibleAttribute getRealizacionVisibleAttribute() {
		return realizacionVisibleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizacionVisibleAttribute(ElementoRealizacionVisibleAttribute newRealizacionVisibleAttribute, NotificationChain msgs) {
		ElementoRealizacionVisibleAttribute oldRealizacionVisibleAttribute = realizacionVisibleAttribute;
		realizacionVisibleAttribute = newRealizacionVisibleAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE, oldRealizacionVisibleAttribute, newRealizacionVisibleAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizacionVisibleAttribute(ElementoRealizacionVisibleAttribute newRealizacionVisibleAttribute) {
		if (newRealizacionVisibleAttribute != realizacionVisibleAttribute) {
			NotificationChain msgs = null;
			if (realizacionVisibleAttribute != null)
				msgs = ((InternalEObject)realizacionVisibleAttribute).eInverseRemove(this, EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY, ElementoRealizacionVisibleAttribute.class, msgs);
			if (newRealizacionVisibleAttribute != null)
				msgs = ((InternalEObject)newRealizacionVisibleAttribute).eInverseAdd(this, EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY, ElementoRealizacionVisibleAttribute.class, msgs);
			msgs = basicSetRealizacionVisibleAttribute(newRealizacionVisibleAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE, newRealizacionVisibleAttribute, newRealizacionVisibleAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getListValues() {
		if (listValues == null) {
			listValues = new EObjectContainmentWithInverseEList<Value>(Value.class, this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES, EntitymodelPackage.VALUE__REALIZACION_DIAGRAM_ENTITY);
		}
		return listValues;
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
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModeloConsulta((ModeloConsulta)otherEnd, msgs);
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListElementoRealizacionDiagramEntity()).basicAdd(otherEnd, msgs);
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE:
				if (realizacionVisibleAttribute != null)
					msgs = ((InternalEObject)realizacionVisibleAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE, null, msgs);
				return basicSetRealizacionVisibleAttribute((ElementoRealizacionVisibleAttribute)otherEnd, msgs);
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListValues()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA:
				return basicSetModeloConsulta(null, msgs);
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return ((InternalEList<?>)getListElementoRealizacionDiagramEntity()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE:
				return basicSetRealizacionVisibleAttribute(null, msgs);
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES:
				return ((InternalEList<?>)getListValues()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA:
				return eInternalContainer().eInverseRemove(this, ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY, ModeloConsulta.class, msgs);
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
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA:
				return getModeloConsulta();
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return getListElementoRealizacionDiagramEntity();
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE:
				return getRealizacionVisibleAttribute();
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES:
				return getListValues();
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
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA:
				setModeloConsulta((ModeloConsulta)newValue);
				return;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				getListElementoRealizacionDiagramEntity().clear();
				getListElementoRealizacionDiagramEntity().addAll((Collection<? extends ElementoRealizacionDiagramEntity>)newValue);
				return;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE:
				setRealizacionVisibleAttribute((ElementoRealizacionVisibleAttribute)newValue);
				return;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES:
				getListValues().clear();
				getListValues().addAll((Collection<? extends Value>)newValue);
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
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA:
				setModeloConsulta((ModeloConsulta)null);
				return;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				getListElementoRealizacionDiagramEntity().clear();
				return;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE:
				setRealizacionVisibleAttribute((ElementoRealizacionVisibleAttribute)null);
				return;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES:
				getListValues().clear();
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
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA:
				return getModeloConsulta() != null;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return listElementoRealizacionDiagramEntity != null && !listElementoRealizacionDiagramEntity.isEmpty();
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE:
				return realizacionVisibleAttribute != null;
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__LIST_VALUES:
				return listValues != null && !listValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RealizacionDiagramEntityImpl
