/**
 */
package gestionmodelosconsultas.rules.factoryrules.impl;

import gestionmodelosconsultas.rules.factoryrules.ChildRule;
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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.impl.RuleImpl#getRulesFactory <em>Rules Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.rules.factoryrules.impl.RuleImpl#getListChildRule <em>List Child Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
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
	 * The cached value of the '{@link #getListChildRule() <em>List Child Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListChildRule()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildRule> listChildRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryrulesPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryrulesPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		if (eContainerFeatureID() != FactoryrulesPackage.RULE__RULES_FACTORY) return null;
		return (RulesFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRulesFactory(RulesFactory newRulesFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRulesFactory, FactoryrulesPackage.RULE__RULES_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulesFactory(RulesFactory newRulesFactory) {
		if (newRulesFactory != eInternalContainer() || (eContainerFeatureID() != FactoryrulesPackage.RULE__RULES_FACTORY && newRulesFactory != null)) {
			if (EcoreUtil.isAncestor(this, newRulesFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRulesFactory != null)
				msgs = ((InternalEObject)newRulesFactory).eInverseAdd(this, FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY, RulesFactory.class, msgs);
			msgs = basicSetRulesFactory(newRulesFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryrulesPackage.RULE__RULES_FACTORY, newRulesFactory, newRulesFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChildRule> getListChildRule() {
		if (listChildRule == null) {
			listChildRule = new EObjectContainmentWithInverseEList<ChildRule>(ChildRule.class, this, FactoryrulesPackage.RULE__LIST_CHILD_RULE, FactoryrulesPackage.CHILD_RULE__RULE);
		}
		return listChildRule;
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
			case FactoryrulesPackage.RULE__RULES_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRulesFactory((RulesFactory)otherEnd, msgs);
			case FactoryrulesPackage.RULE__LIST_CHILD_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListChildRule()).basicAdd(otherEnd, msgs);
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
			case FactoryrulesPackage.RULE__RULES_FACTORY:
				return basicSetRulesFactory(null, msgs);
			case FactoryrulesPackage.RULE__LIST_CHILD_RULE:
				return ((InternalEList<?>)getListChildRule()).basicRemove(otherEnd, msgs);
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
			case FactoryrulesPackage.RULE__RULES_FACTORY:
				return eInternalContainer().eInverseRemove(this, FactoryrulesPackage.RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY, RulesFactory.class, msgs);
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
			case FactoryrulesPackage.RULE__NAME:
				return getName();
			case FactoryrulesPackage.RULE__RULES_FACTORY:
				return getRulesFactory();
			case FactoryrulesPackage.RULE__LIST_CHILD_RULE:
				return getListChildRule();
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
			case FactoryrulesPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case FactoryrulesPackage.RULE__RULES_FACTORY:
				setRulesFactory((RulesFactory)newValue);
				return;
			case FactoryrulesPackage.RULE__LIST_CHILD_RULE:
				getListChildRule().clear();
				getListChildRule().addAll((Collection<? extends ChildRule>)newValue);
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
			case FactoryrulesPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FactoryrulesPackage.RULE__RULES_FACTORY:
				setRulesFactory((RulesFactory)null);
				return;
			case FactoryrulesPackage.RULE__LIST_CHILD_RULE:
				getListChildRule().clear();
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
			case FactoryrulesPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FactoryrulesPackage.RULE__RULES_FACTORY:
				return getRulesFactory() != null;
			case FactoryrulesPackage.RULE__LIST_CHILD_RULE:
				return listChildRule != null && !listChildRule.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RuleImpl
