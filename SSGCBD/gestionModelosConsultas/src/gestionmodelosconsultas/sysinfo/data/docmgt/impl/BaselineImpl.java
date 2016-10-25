/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Baseline;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Item;

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
 * An implementation of the model object '<em><b>Baseline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.BaselineImpl#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.BaselineImpl#getSuItem <em>Su Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaselineImpl extends MinimalEObjectImpl.Container implements Baseline {
	/**
	 * The cached value of the '{@link #getSuItem() <em>Su Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> suItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaselineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.BASELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getSuDocumento() {
		if (eContainerFeatureID() != DocmgtPackage.BASELINE__SU_DOCUMENTO) return null;
		return (Documento)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuDocumento(Documento newSuDocumento, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuDocumento, DocmgtPackage.BASELINE__SU_DOCUMENTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuDocumento(Documento newSuDocumento) {
		if (newSuDocumento != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.BASELINE__SU_DOCUMENTO && newSuDocumento != null)) {
			if (EcoreUtil.isAncestor(this, newSuDocumento))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuDocumento != null)
				msgs = ((InternalEObject)newSuDocumento).eInverseAdd(this, DocmgtPackage.DOCUMENTO__SU_BASELINE, Documento.class, msgs);
			msgs = basicSetSuDocumento(newSuDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.BASELINE__SU_DOCUMENTO, newSuDocumento, newSuDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getSuItem() {
		if (suItem == null) {
			suItem = new EObjectContainmentWithInverseEList<Item>(Item.class, this, DocmgtPackage.BASELINE__SU_ITEM, DocmgtPackage.ITEM__BASELINE);
		}
		return suItem;
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
			case DocmgtPackage.BASELINE__SU_DOCUMENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuDocumento((Documento)otherEnd, msgs);
			case DocmgtPackage.BASELINE__SU_ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuItem()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.BASELINE__SU_DOCUMENTO:
				return basicSetSuDocumento(null, msgs);
			case DocmgtPackage.BASELINE__SU_ITEM:
				return ((InternalEList<?>)getSuItem()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.BASELINE__SU_DOCUMENTO:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.DOCUMENTO__SU_BASELINE, Documento.class, msgs);
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
			case DocmgtPackage.BASELINE__SU_DOCUMENTO:
				return getSuDocumento();
			case DocmgtPackage.BASELINE__SU_ITEM:
				return getSuItem();
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
			case DocmgtPackage.BASELINE__SU_DOCUMENTO:
				setSuDocumento((Documento)newValue);
				return;
			case DocmgtPackage.BASELINE__SU_ITEM:
				getSuItem().clear();
				getSuItem().addAll((Collection<? extends Item>)newValue);
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
			case DocmgtPackage.BASELINE__SU_DOCUMENTO:
				setSuDocumento((Documento)null);
				return;
			case DocmgtPackage.BASELINE__SU_ITEM:
				getSuItem().clear();
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
			case DocmgtPackage.BASELINE__SU_DOCUMENTO:
				return getSuDocumento() != null;
			case DocmgtPackage.BASELINE__SU_ITEM:
				return suItem != null && !suItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaselineImpl
