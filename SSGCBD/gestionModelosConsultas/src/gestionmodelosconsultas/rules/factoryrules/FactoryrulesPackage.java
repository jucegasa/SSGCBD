/**
 */
package gestionmodelosconsultas.rules.factoryrules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesFactory
 * @model kind="package"
 * @generated
 */
public interface FactoryrulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "factoryrules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/rules/factoryrules.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.rules.factoryrules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryrulesPackage eINSTANCE = gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.RulesFactoryImpl <em>Rules Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.RulesFactoryImpl
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getRulesFactory()
	 * @generated
	 */
	int RULES_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FACTORY__MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>List Rule Diagram Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Rules Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rules Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.RuleImpl
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULES_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>List Child Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LIST_CHILD_RULE = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.ChildRuleImpl <em>Child Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.ChildRuleImpl
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getChildRule()
	 * @generated
	 */
	int CHILD_RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RULE__RULE = 1;

	/**
	 * The number of structural features of the '<em>Child Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Child Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.EntityNameImpl <em>Entity Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.EntityNameImpl
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getEntityName()
	 * @generated
	 */
	int ENTITY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAME__NAME = CHILD_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAME__RULE = CHILD_RULE__RULE;

	/**
	 * The number of structural features of the '<em>Entity Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAME_FEATURE_COUNT = CHILD_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAME_OPERATION_COUNT = CHILD_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.RelationNameImpl <em>Relation Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.RelationNameImpl
	 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getRelationName()
	 * @generated
	 */
	int RELATION_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_NAME__NAME = CHILD_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_NAME__RULE = CHILD_RULE__RULE;

	/**
	 * The number of structural features of the '<em>Relation Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_NAME_FEATURE_COUNT = CHILD_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_NAME_OPERATION_COUNT = CHILD_RULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory <em>Rules Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules Factory</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.RulesFactory
	 * @generated
	 */
	EClass getRulesFactory();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Factory</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.RulesFactory#getModelFactory()
	 * @see #getRulesFactory()
	 * @generated
	 */
	EReference getRulesFactory_ModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory#getListRuleDiagramEntity <em>List Rule Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Rule Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.RulesFactory#getListRuleDiagramEntity()
	 * @see #getRulesFactory()
	 * @generated
	 */
	EReference getRulesFactory_ListRuleDiagramEntity();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.rules.factoryrules.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.rules.factoryrules.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.rules.factoryrules.Rule#getRulesFactory <em>Rules Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rules Factory</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.Rule#getRulesFactory()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulesFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.rules.factoryrules.Rule#getListChildRule <em>List Child Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Child Rule</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.Rule#getListChildRule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ListChildRule();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.rules.factoryrules.ChildRule <em>Child Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Rule</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.ChildRule
	 * @generated
	 */
	EClass getChildRule();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.rules.factoryrules.ChildRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.ChildRule#getName()
	 * @see #getChildRule()
	 * @generated
	 */
	EAttribute getChildRule_Name();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.rules.factoryrules.ChildRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.ChildRule#getRule()
	 * @see #getChildRule()
	 * @generated
	 */
	EReference getChildRule_Rule();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.rules.factoryrules.EntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Name</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.EntityName
	 * @generated
	 */
	EClass getEntityName();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.rules.factoryrules.RelationName <em>Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Name</em>'.
	 * @see gestionmodelosconsultas.rules.factoryrules.RelationName
	 * @generated
	 */
	EClass getRelationName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FactoryrulesFactory getFactoryrulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.RulesFactoryImpl <em>Rules Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.RulesFactoryImpl
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getRulesFactory()
		 * @generated
		 */
		EClass RULES_FACTORY = eINSTANCE.getRulesFactory();

		/**
		 * The meta object literal for the '<em><b>Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_FACTORY__MODEL_FACTORY = eINSTANCE.getRulesFactory_ModelFactory();

		/**
		 * The meta object literal for the '<em><b>List Rule Diagram Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY = eINSTANCE.getRulesFactory_ListRuleDiagramEntity();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.RuleImpl
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Rules Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULES_FACTORY = eINSTANCE.getRule_RulesFactory();

		/**
		 * The meta object literal for the '<em><b>List Child Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__LIST_CHILD_RULE = eINSTANCE.getRule_ListChildRule();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.ChildRuleImpl <em>Child Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.ChildRuleImpl
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getChildRule()
		 * @generated
		 */
		EClass CHILD_RULE = eINSTANCE.getChildRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_RULE__NAME = eINSTANCE.getChildRule_Name();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_RULE__RULE = eINSTANCE.getChildRule_Rule();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.EntityNameImpl <em>Entity Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.EntityNameImpl
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getEntityName()
		 * @generated
		 */
		EClass ENTITY_NAME = eINSTANCE.getEntityName();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.rules.factoryrules.impl.RelationNameImpl <em>Relation Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.RelationNameImpl
		 * @see gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl#getRelationName()
		 * @generated
		 */
		EClass RELATION_NAME = eINSTANCE.getRelationName();

	}

} //FactoryrulesPackage
