/**
 */
package gestionmodelosconsultas.rules.factoryrules.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;
import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;
import gestionmodelosconsultas.rules.factoryrules.Rule;
import gestionmodelosconsultas.rules.factoryrules.RulesFactory;

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
 * An implementation of the model object '<em><b>Rules Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.impl.RulesFactoryImpl#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.impl.RulesFactoryImpl#getListRuleDiagramEntity <em>List Rule Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulesFactoryImpl extends MinimalEObjectImpl.Container implements RulesFactory {
	/**
	 * The cached value of the '{@link #getListRuleDiagramEntity() <em>List Rule Diagram Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRuleDiagramEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> listRuleDiagramEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryrulesPackage.Literals.RULES_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		if (eContainerFeatureID() != FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelFactory(ModelFactory newModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelFactory, FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactory(ModelFactory newModelFactory) {
		if (newModelFactory != eInternalContainer() || (eContainerFeatureID() != FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY && newModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelFactory != null)
				msgs = ((InternalEObject)newModelFactory).eInverseAdd(this, GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY, ModelFactory.class, msgs);
			msgs = basicSetModelFactory(newModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY, newModelFactory, newModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getListRuleDiagramEntity() {
		if (listRuleDiagramEntity == null) {
			listRuleDiagramEntity = new EObjectContainmentWithInverseEList<Rule>(Rule.class, this, FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY, FactoryrulesPackage.RULE__RULES_FACTORY);
		}
		return listRuleDiagramEntity;
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
			case FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelFactory((ModelFactory)otherEnd, msgs);
			case FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListRuleDiagramEntity()).basicAdd(otherEnd, msgs);
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
			case FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY:
				return basicSetModelFactory(null, msgs);
			case FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY:
				return ((InternalEList<?>)getListRuleDiagramEntity()).basicRemove(otherEnd, msgs);
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
			case FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY, ModelFactory.class, msgs);
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
			case FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY:
				return getModelFactory();
			case FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY:
				return getListRuleDiagramEntity();
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
			case FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY:
				setModelFactory((ModelFactory)newValue);
				return;
			case FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY:
				getListRuleDiagramEntity().clear();
				getListRuleDiagramEntity().addAll((Collection<? extends Rule>)newValue);
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
			case FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY:
				setModelFactory((ModelFactory)null);
				return;
			case FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY:
				getListRuleDiagramEntity().clear();
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
			case FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY:
				return getModelFactory() != null;
			case FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY:
				return listRuleDiagramEntity != null && !listRuleDiagramEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RulesFactoryImpl
