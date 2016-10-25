/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.DataPackage;
import gestionmodelosconsultas.sysinfo.data.Data_View;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry;
import gestionmodelosconsultas.sysinfo.data.docmgt.Indice;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

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
 * An implementation of the model object '<em><b>Indice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndiceImpl#getData_View <em>Data View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndiceImpl#getIndice <em>Indice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndiceImpl extends PaqueteImpl implements Indice {
	/**
	 * The cached value of the '{@link #getIndice() <em>Indice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndice()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexEntry> indice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.INDICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_View getData_View() {
		if (eContainerFeatureID() != DocmgtPackage.INDICE__DATA_VIEW) return null;
		return (Data_View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData_View(Data_View newData_View, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newData_View, DocmgtPackage.INDICE__DATA_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_View(Data_View newData_View) {
		if (newData_View != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.INDICE__DATA_VIEW && newData_View != null)) {
			if (EcoreUtil.isAncestor(this, newData_View))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newData_View != null)
				msgs = ((InternalEObject)newData_View).eInverseAdd(this, DataPackage.DATA_VIEW__INDICE, Data_View.class, msgs);
			msgs = basicSetData_View(newData_View, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.INDICE__DATA_VIEW, newData_View, newData_View));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntry> getIndice() {
		if (indice == null) {
			indice = new EObjectContainmentWithInverseEList<IndexEntry>(IndexEntry.class, this, DocmgtPackage.INDICE__INDICE, DocmgtPackage.INDEX_ENTRY__INDICE);
		}
		return indice;
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
			case DocmgtPackage.INDICE__DATA_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetData_View((Data_View)otherEnd, msgs);
			case DocmgtPackage.INDICE__INDICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndice()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.INDICE__DATA_VIEW:
				return basicSetData_View(null, msgs);
			case DocmgtPackage.INDICE__INDICE:
				return ((InternalEList<?>)getIndice()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.INDICE__DATA_VIEW:
				return eInternalContainer().eInverseRemove(this, DataPackage.DATA_VIEW__INDICE, Data_View.class, msgs);
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
			case DocmgtPackage.INDICE__DATA_VIEW:
				return getData_View();
			case DocmgtPackage.INDICE__INDICE:
				return getIndice();
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
			case DocmgtPackage.INDICE__DATA_VIEW:
				setData_View((Data_View)newValue);
				return;
			case DocmgtPackage.INDICE__INDICE:
				getIndice().clear();
				getIndice().addAll((Collection<? extends IndexEntry>)newValue);
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
			case DocmgtPackage.INDICE__DATA_VIEW:
				setData_View((Data_View)null);
				return;
			case DocmgtPackage.INDICE__INDICE:
				getIndice().clear();
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
			case DocmgtPackage.INDICE__DATA_VIEW:
				return getData_View() != null;
			case DocmgtPackage.INDICE__INDICE:
				return indice != null && !indice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndiceImpl
