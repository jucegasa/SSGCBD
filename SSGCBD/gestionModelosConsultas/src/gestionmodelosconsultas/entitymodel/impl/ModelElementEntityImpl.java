/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.ModelElementEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ModelElementEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ModelElementEntityImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ModelElementEntityImpl#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelElementEntityImpl extends MinimalEObjectImpl.Container implements ModelElementEntity {
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
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected String stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementoRealizacionDiagramEntity() <em>Elemento Realizacion Diagram Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoRealizacionDiagramEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoRealizacionDiagramEntity> elementoRealizacionDiagramEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.MODEL_ELEMENT_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.MODEL_ELEMENT_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		String oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.MODEL_ELEMENT_ENTITY__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoRealizacionDiagramEntity> getElementoRealizacionDiagramEntity() {
		if (elementoRealizacionDiagramEntity == null) {
			elementoRealizacionDiagramEntity = new EObjectWithInverseResolvingEList<ElementoRealizacionDiagramEntity>(ElementoRealizacionDiagramEntity.class, this, EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY, EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY);
		}
		return elementoRealizacionDiagramEntity;
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
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementoRealizacionDiagramEntity()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return ((InternalEList<?>)getElementoRealizacionDiagramEntity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__NAME:
				return getName();
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__STEREOTYPE:
				return getStereotype();
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return getElementoRealizacionDiagramEntity();
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
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__NAME:
				setName((String)newValue);
				return;
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				getElementoRealizacionDiagramEntity().clear();
				getElementoRealizacionDiagramEntity().addAll((Collection<? extends ElementoRealizacionDiagramEntity>)newValue);
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
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				getElementoRealizacionDiagramEntity().clear();
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
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY:
				return elementoRealizacionDiagramEntity != null && !elementoRealizacionDiagramEntity.isEmpty();
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
		result.append(", stereotype: ");
		result.append(stereotype);
		result.append(')');
		return result.toString();
	}

} //ModelElementEntityImpl
