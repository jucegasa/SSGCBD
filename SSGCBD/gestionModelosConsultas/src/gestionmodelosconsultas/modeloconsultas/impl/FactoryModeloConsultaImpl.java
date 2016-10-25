/**
 */
package gestionmodelosconsultas.modeloconsultas.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;
import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta;
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
 * An implementation of the model object '<em><b>Factory Modelo Consulta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.impl.FactoryModeloConsultaImpl#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.impl.FactoryModeloConsultaImpl#getListModeloConsulta <em>List Modelo Consulta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactoryModeloConsultaImpl extends MinimalEObjectImpl.Container implements FactoryModeloConsulta {
	/**
	 * The cached value of the '{@link #getListModeloConsulta() <em>List Modelo Consulta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListModeloConsulta()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeloConsulta> listModeloConsulta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryModeloConsultaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloconsultasPackage.Literals.FACTORY_MODELO_CONSULTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		if (eContainerFeatureID() != ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelFactory(ModelFactory newModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelFactory, ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactory(ModelFactory newModelFactory) {
		if (newModelFactory != eInternalContainer() || (eContainerFeatureID() != ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY && newModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelFactory != null)
				msgs = ((InternalEObject)newModelFactory).eInverseAdd(this, GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS, ModelFactory.class, msgs);
			msgs = basicSetModelFactory(newModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY, newModelFactory, newModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeloConsulta> getListModeloConsulta() {
		if (listModeloConsulta == null) {
			listModeloConsulta = new EObjectContainmentWithInverseEList<ModeloConsulta>(ModeloConsulta.class, this, ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA, ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA);
		}
		return listModeloConsulta;
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
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelFactory((ModelFactory)otherEnd, msgs);
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListModeloConsulta()).basicAdd(otherEnd, msgs);
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
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY:
				return basicSetModelFactory(null, msgs);
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA:
				return ((InternalEList<?>)getListModeloConsulta()).basicRemove(otherEnd, msgs);
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
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS, ModelFactory.class, msgs);
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
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY:
				return getModelFactory();
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA:
				return getListModeloConsulta();
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
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY:
				setModelFactory((ModelFactory)newValue);
				return;
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA:
				getListModeloConsulta().clear();
				getListModeloConsulta().addAll((Collection<? extends ModeloConsulta>)newValue);
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
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY:
				setModelFactory((ModelFactory)null);
				return;
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA:
				getListModeloConsulta().clear();
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
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY:
				return getModelFactory() != null;
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA:
				return listModeloConsulta != null && !listModeloConsulta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactoryModeloConsultaImpl
