/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.ui.impl;

import model.FactoryModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import reportes.ModelFactory;
import reportes.ui.Reporte;
import reportes.ui.UI;
import reportes.ui.UiPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reporte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reportes.ui.impl.ReporteImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReporteImpl extends EObjectImpl implements Reporte {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReporteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UiPackage.Literals.REPORTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		if (eContainerFeatureID() != UiPackage.REPORTE__THE_UI) return null;
		return (UI)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheUI, UiPackage.REPORTE__THE_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != eInternalContainer() || (eContainerFeatureID() != UiPackage.REPORTE__THE_UI && newTheUI != null)) {
			if (EcoreUtil.isAncestor(this, newTheUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_REPORTE, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.REPORTE__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generarReporte() {
		/*
		tooldataform.ModelFactory modelFactoryDF = null;
		tooldataform.model.model.ModelFactoryModel modelFactoryModelDF = ModelFactoryModel.getInstance();
		modelFactoryDF = modelFactoryModelDF.getModelFactory();
	*/	
		
		
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.REPORTE__THE_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.REPORTE__THE_UI:
				return basicSetTheUI(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UiPackage.REPORTE__THE_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_REPORTE, UI.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.REPORTE__THE_UI:
				return getTheUI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiPackage.REPORTE__THE_UI:
				setTheUI((UI)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiPackage.REPORTE__THE_UI:
				setTheUI((UI)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiPackage.REPORTE__THE_UI:
				return getTheUI() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReporteImpl
