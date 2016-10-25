/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.Attribute;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;

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
 * An implementation of the model object '<em><b>Elemento Realizacion Visible Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionVisibleAttributeImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionVisibleAttributeImpl#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionVisibleAttributeImpl#getVisibleAttribute <em>Visible Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementoRealizacionVisibleAttributeImpl extends MinimalEObjectImpl.Container implements ElementoRealizacionVisibleAttribute {
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
	 * The cached value of the '{@link #getVisibleAttribute() <em>Visible Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> visibleAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoRealizacionVisibleAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizacionDiagramEntity getRealizacionDiagramEntity() {
		if (eContainerFeatureID() != EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY) return null;
		return (RealizacionDiagramEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRealizacionDiagramEntity, EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity) {
		if (newRealizacionDiagramEntity != eInternalContainer() || (eContainerFeatureID() != EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY && newRealizacionDiagramEntity != null)) {
			if (EcoreUtil.isAncestor(this, newRealizacionDiagramEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRealizacionDiagramEntity != null)
				msgs = ((InternalEObject)newRealizacionDiagramEntity).eInverseAdd(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE, RealizacionDiagramEntity.class, msgs);
			msgs = basicSetRealizacionDiagramEntity(newRealizacionDiagramEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY, newRealizacionDiagramEntity, newRealizacionDiagramEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getVisibleAttribute() {
		if (visibleAttribute == null) {
			visibleAttribute = new EObjectWithInverseResolvingEList.ManyInverse<Attribute>(Attribute.class, this, EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE, EntitymodelPackage.ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE);
		}
		return visibleAttribute;
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRealizacionDiagramEntity((RealizacionDiagramEntity)otherEnd, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisibleAttribute()).basicAdd(otherEnd, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY:
				return basicSetRealizacionDiagramEntity(null, msgs);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE:
				return ((InternalEList<?>)getVisibleAttribute()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY:
				return eInternalContainer().eInverseRemove(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE, RealizacionDiagramEntity.class, msgs);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE:
				return getNombre();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY:
				return getRealizacionDiagramEntity();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE:
				return getVisibleAttribute();
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)newValue);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE:
				getVisibleAttribute().clear();
				getVisibleAttribute().addAll((Collection<? extends Attribute>)newValue);
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)null);
				return;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE:
				getVisibleAttribute().clear();
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
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY:
				return getRealizacionDiagramEntity() != null;
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE:
				return visibleAttribute != null && !visibleAttribute.isEmpty();
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

} //ElementoRealizacionVisibleAttributeImpl
