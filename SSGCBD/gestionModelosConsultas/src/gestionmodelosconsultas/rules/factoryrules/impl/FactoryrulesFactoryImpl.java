/**
 */
package gestionmodelosconsultas.rules.factoryrules.impl;

import gestionmodelosconsultas.rules.factoryrules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryrulesFactoryImpl extends EFactoryImpl implements FactoryrulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FactoryrulesFactory init() {
		try {
			FactoryrulesFactory theFactoryrulesFactory = (FactoryrulesFactory)EPackage.Registry.INSTANCE.getEFactory(FactoryrulesPackage.eNS_URI);
			if (theFactoryrulesFactory != null) {
				return theFactoryrulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactoryrulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryrulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FactoryrulesPackage.RULES_FACTORY: return createRulesFactory();
			case FactoryrulesPackage.RULE: return createRule();
			case FactoryrulesPackage.ENTITY_NAME: return createEntityName();
			case FactoryrulesPackage.RELATION_NAME: return createRelationName();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory createRulesFactory() {
		RulesFactoryImpl rulesFactory = new RulesFactoryImpl();
		return rulesFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityName createEntityName() {
		EntityNameImpl entityName = new EntityNameImpl();
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationName createRelationName() {
		RelationNameImpl relationName = new RelationNameImpl();
		return relationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryrulesPackage getFactoryrulesPackage() {
		return (FactoryrulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FactoryrulesPackage getPackage() {
		return FactoryrulesPackage.eINSTANCE;
	}

} //FactoryrulesFactoryImpl
