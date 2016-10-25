/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see gestionmodelosconsultas.entitymodel.EntitymodelFactory
 * @model kind="package"
 * @generated
 */
public interface EntitymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entitymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/entitymodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.entitymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntitymodelPackage eINSTANCE = gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.ModelElementEntityImpl <em>Model Element Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.ModelElementEntityImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getModelElementEntity()
	 * @generated
	 */
	int MODEL_ELEMENT_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_ENTITY__STEREOTYPE = 1;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Model Element Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Element Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.EntityImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = MODEL_ELEMENT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__STEREOTYPE = MODEL_ELEMENT_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY;

	/**
	 * The feature id for the '<em><b>Owned By Factory Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OWNED_BY_FACTORY_ENTITY = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LIST_ATTRIBUTES = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = MODEL_ELEMENT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl <em>Entity Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getEntityRelation()
	 * @generated
	 */
	int ENTITY_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__NAME = MODEL_ELEMENT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__STEREOTYPE = MODEL_ELEMENT_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY;

	/**
	 * The feature id for the '<em><b>Atributte Foreing Key Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atributte Primary Key Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__MULTIPLICITY_SOURCE = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__MULTIPLICITY_TARGET = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>The Factory Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__THE_FACTORY_ENTITY = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__SOURCE = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION__TARGET = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Entity Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_FEATURE_COUNT = MODEL_ELEMENT_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Entity Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_OPERATION_COUNT = MODEL_ELEMENT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.SimpleRelationImpl <em>Simple Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.SimpleRelationImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getSimpleRelation()
	 * @generated
	 */
	int SIMPLE_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__NAME = ENTITY_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__STEREOTYPE = ENTITY_RELATION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = ENTITY_RELATION__ELEMENTO_REALIZACION_DIAGRAM_ENTITY;

	/**
	 * The feature id for the '<em><b>Atributte Foreing Key Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE = ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE;

	/**
	 * The feature id for the '<em><b>Atributte Primary Key Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET = ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__MULTIPLICITY_SOURCE = ENTITY_RELATION__MULTIPLICITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__MULTIPLICITY_TARGET = ENTITY_RELATION__MULTIPLICITY_TARGET;

	/**
	 * The feature id for the '<em><b>The Factory Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__THE_FACTORY_ENTITY = ENTITY_RELATION__THE_FACTORY_ENTITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__SOURCE = ENTITY_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION__TARGET = ENTITY_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Simple Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION_FEATURE_COUNT = ENTITY_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RELATION_OPERATION_COUNT = ENTITY_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.AssociativeEntityImpl <em>Associative Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.AssociativeEntityImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getAssociativeEntity()
	 * @generated
	 */
	int ASSOCIATIVE_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__STEREOTYPE = ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY;

	/**
	 * The feature id for the '<em><b>Owned By Factory Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__OWNED_BY_FACTORY_ENTITY = ENTITY__OWNED_BY_FACTORY_ENTITY;

	/**
	 * The feature id for the '<em><b>List Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__LIST_ATTRIBUTES = ENTITY__LIST_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Associative Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Associative Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.AttributeImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBLE = 3;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Value Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Visible Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.DiagramEntityImpl <em>Diagram Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.DiagramEntityImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getDiagramEntity()
	 * @generated
	 */
	int DIAGRAM_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ENTITY__MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>List Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ENTITY__LIST_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>List Entity Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ENTITY__LIST_ENTITY_RELATION = 2;

	/**
	 * The number of structural features of the '<em>Diagram Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagram Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl <em>Realizacion Diagram Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getRealizacionDiagramEntity()
	 * @generated
	 */
	int REALIZACION_DIAGRAM_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Modelo Consulta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA = 0;

	/**
	 * The feature id for the '<em><b>List Elemento Realizacion Diagram Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Realizacion Visible Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>List Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_DIAGRAM_ENTITY__LIST_VALUES = 3;

	/**
	 * The number of structural features of the '<em>Realizacion Diagram Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_DIAGRAM_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Realizacion Diagram Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_DIAGRAM_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl <em>Elemento Realizacion Diagram Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getElementoRealizacionDiagramEntity()
	 * @generated
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Nombre Model Element Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Model Element Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Realizacion Diagram Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>List Elemento Realizacion Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Elemento Realizacion Diagram Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Elemento Realizacion Diagram Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_DIAGRAM_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl <em>Elemento Realizacion Value Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getElementoRealizacionValueAttribute()
	 * @generated
	 */
	int ELEMENTO_REALIZACION_VALUE_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Value Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES = 3;

	/**
	 * The number of structural features of the '<em>Elemento Realizacion Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VALUE_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Elemento Realizacion Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VALUE_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionVisibleAttributeImpl <em>Elemento Realizacion Visible Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionVisibleAttributeImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getElementoRealizacionVisibleAttribute()
	 * @generated
	 */
	int ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Realizacion Diagram Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Visible Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Elemento Realizacion Visible Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Elemento Realizacion Visible Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.impl.ValueImpl
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Elemento Realizacion Value Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Realizacion Diagram Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__REALIZACION_DIAGRAM_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.AttributeType
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 12;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.Multiplicity
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 13;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.TipoModelElementEntity <em>Tipo Model Element Entity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.TipoModelElementEntity
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getTipoModelElementEntity()
	 * @generated
	 */
	int TIPO_MODEL_ELEMENT_ENTITY = 14;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.entitymodel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.entitymodel.Type
	 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 15;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.Entity#getOwnedByFactoryEntity <em>Owned By Factory Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Factory Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Entity#getOwnedByFactoryEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_OwnedByFactoryEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.entitymodel.Entity#getListAttributes <em>List Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Attributes</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Entity#getListAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ListAttributes();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.EntityRelation <em>Entity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Relation</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation
	 * @generated
	 */
	EClass getEntityRelation();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getAtributteForeingKeySource <em>Atributte Foreing Key Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atributte Foreing Key Source</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getAtributteForeingKeySource()
	 * @see #getEntityRelation()
	 * @generated
	 */
	EAttribute getEntityRelation_AtributteForeingKeySource();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getAtributtePrimaryKeyTarget <em>Atributte Primary Key Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atributte Primary Key Target</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getAtributtePrimaryKeyTarget()
	 * @see #getEntityRelation()
	 * @generated
	 */
	EAttribute getEntityRelation_AtributtePrimaryKeyTarget();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicitySource()
	 * @see #getEntityRelation()
	 * @generated
	 */
	EAttribute getEntityRelation_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicityTarget()
	 * @see #getEntityRelation()
	 * @generated
	 */
	EAttribute getEntityRelation_MultiplicityTarget();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getTheFactoryEntity <em>The Factory Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Factory Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getTheFactoryEntity()
	 * @see #getEntityRelation()
	 * @generated
	 */
	EReference getEntityRelation_TheFactoryEntity();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getSource()
	 * @see #getEntityRelation()
	 * @generated
	 */
	EReference getEntityRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getTarget()
	 * @see #getEntityRelation()
	 * @generated
	 */
	EReference getEntityRelation_Target();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.SimpleRelation <em>Simple Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Relation</em>'.
	 * @see gestionmodelosconsultas.entitymodel.SimpleRelation
	 * @generated
	 */
	EClass getSimpleRelation();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.AssociativeEntity <em>Associative Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associative Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.AssociativeEntity
	 * @generated
	 */
	EClass getAssociativeEntity();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.Attribute#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#isVisible()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visible();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.Attribute#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Type</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeType();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.Attribute#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getEntity()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Entity();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elemento Realizacion Value Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionValueAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ElementoRealizacionValueAttribute();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionVisibleAttribute <em>Elemento Realizacion Visible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elemento Realizacion Visible Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionVisibleAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ElementoRealizacionVisibleAttribute();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.ModelElementEntity <em>Model Element Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ModelElementEntity
	 * @generated
	 */
	EClass getModelElementEntity();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ModelElementEntity#getName()
	 * @see #getModelElementEntity()
	 * @generated
	 */
	EAttribute getModelElementEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ModelElementEntity#getStereotype()
	 * @see #getModelElementEntity()
	 * @generated
	 */
	EAttribute getModelElementEntity_Stereotype();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elemento Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ModelElementEntity#getElementoRealizacionDiagramEntity()
	 * @see #getModelElementEntity()
	 * @generated
	 */
	EReference getModelElementEntity_ElementoRealizacionDiagramEntity();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.DiagramEntity <em>Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.DiagramEntity
	 * @generated
	 */
	EClass getDiagramEntity();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Factory</em>'.
	 * @see gestionmodelosconsultas.entitymodel.DiagramEntity#getModelFactory()
	 * @see #getDiagramEntity()
	 * @generated
	 */
	EReference getDiagramEntity_ModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntity <em>List Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntity()
	 * @see #getDiagramEntity()
	 * @generated
	 */
	EReference getDiagramEntity_ListEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntityRelation <em>List Entity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Entity Relation</em>'.
	 * @see gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntityRelation()
	 * @see #getDiagramEntity()
	 * @generated
	 */
	EReference getDiagramEntity_ListEntityRelation();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity
	 * @generated
	 */
	EClass getRealizacionDiagramEntity();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getModeloConsulta <em>Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Modelo Consulta</em>'.
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getModeloConsulta()
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	EReference getRealizacionDiagramEntity_ModeloConsulta();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListElementoRealizacionDiagramEntity <em>List Elemento Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Elemento Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListElementoRealizacionDiagramEntity()
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	EReference getRealizacionDiagramEntity_ListElementoRealizacionDiagramEntity();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getRealizacionVisibleAttribute <em>Realizacion Visible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realizacion Visible Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getRealizacionVisibleAttribute()
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	EReference getRealizacionDiagramEntity_RealizacionVisibleAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListValues <em>List Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Values</em>'.
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListValues()
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	EReference getRealizacionDiagramEntity_ListValues();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity
	 * @generated
	 */
	EClass getElementoRealizacionDiagramEntity();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getTipo()
	 * @see #getElementoRealizacionDiagramEntity()
	 * @generated
	 */
	EAttribute getElementoRealizacionDiagramEntity_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getNombreModelElementEntity <em>Nombre Model Element Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Model Element Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getNombreModelElementEntity()
	 * @see #getElementoRealizacionDiagramEntity()
	 * @generated
	 */
	EAttribute getElementoRealizacionDiagramEntity_NombreModelElementEntity();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getModelElementEntity <em>Model Element Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getModelElementEntity()
	 * @see #getElementoRealizacionDiagramEntity()
	 * @generated
	 */
	EReference getElementoRealizacionDiagramEntity_ModelElementEntity();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getRealizacionDiagramEntity()
	 * @see #getElementoRealizacionDiagramEntity()
	 * @generated
	 */
	EReference getElementoRealizacionDiagramEntity_RealizacionDiagramEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getListElementoRealizacionAttribute <em>List Elemento Realizacion Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Elemento Realizacion Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getListElementoRealizacionAttribute()
	 * @see #getElementoRealizacionDiagramEntity()
	 * @generated
	 */
	EReference getElementoRealizacionDiagramEntity_ListElementoRealizacionAttribute();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Realizacion Value Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute
	 * @generated
	 */
	EClass getElementoRealizacionValueAttribute();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getNombre()
	 * @see #getElementoRealizacionValueAttribute()
	 * @generated
	 */
	EAttribute getElementoRealizacionValueAttribute_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValueAttribute <em>Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValueAttribute()
	 * @see #getElementoRealizacionValueAttribute()
	 * @generated
	 */
	EReference getElementoRealizacionValueAttribute_ValueAttribute();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Elemento Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getElementoRealizacionDiagramEntity()
	 * @see #getElementoRealizacionValueAttribute()
	 * @generated
	 */
	EReference getElementoRealizacionValueAttribute_ElementoRealizacionDiagramEntity();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValues()
	 * @see #getElementoRealizacionValueAttribute()
	 * @generated
	 */
	EReference getElementoRealizacionValueAttribute_Values();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute <em>Elemento Realizacion Visible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Realizacion Visible Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute
	 * @generated
	 */
	EClass getElementoRealizacionVisibleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getNombre()
	 * @see #getElementoRealizacionVisibleAttribute()
	 * @generated
	 */
	EAttribute getElementoRealizacionVisibleAttribute_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getRealizacionDiagramEntity()
	 * @see #getElementoRealizacionVisibleAttribute()
	 * @generated
	 */
	EReference getElementoRealizacionVisibleAttribute_RealizacionDiagramEntity();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getVisibleAttribute <em>Visible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visible Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getVisibleAttribute()
	 * @see #getElementoRealizacionVisibleAttribute()
	 * @generated
	 */
	EReference getElementoRealizacionVisibleAttribute_VisibleAttribute();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.entitymodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.entitymodel.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.entitymodel.Value#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elemento Realizacion Value Attribute</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Value#getElementoRealizacionValueAttribute()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_ElementoRealizacionValueAttribute();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.entitymodel.Value#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Value#getRealizacionDiagramEntity()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_RealizacionDiagramEntity();

	/**
	 * Returns the meta object for enum '{@link gestionmodelosconsultas.entitymodel.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see gestionmodelosconsultas.entitymodel.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link gestionmodelosconsultas.entitymodel.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link gestionmodelosconsultas.entitymodel.TipoModelElementEntity <em>Tipo Model Element Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Model Element Entity</em>'.
	 * @see gestionmodelosconsultas.entitymodel.TipoModelElementEntity
	 * @generated
	 */
	EEnum getTipoModelElementEntity();

	/**
	 * Returns the meta object for enum '{@link gestionmodelosconsultas.entitymodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see gestionmodelosconsultas.entitymodel.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntitymodelFactory getEntitymodelFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.EntityImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Owned By Factory Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__OWNED_BY_FACTORY_ENTITY = eINSTANCE.getEntity_OwnedByFactoryEntity();

		/**
		 * The meta object literal for the '<em><b>List Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__LIST_ATTRIBUTES = eINSTANCE.getEntity_ListAttributes();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl <em>Entity Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.EntityRelationImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getEntityRelation()
		 * @generated
		 */
		EClass ENTITY_RELATION = eINSTANCE.getEntityRelation();

		/**
		 * The meta object literal for the '<em><b>Atributte Foreing Key Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE = eINSTANCE.getEntityRelation_AtributteForeingKeySource();

		/**
		 * The meta object literal for the '<em><b>Atributte Primary Key Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET = eINSTANCE.getEntityRelation_AtributtePrimaryKeyTarget();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION__MULTIPLICITY_SOURCE = eINSTANCE.getEntityRelation_MultiplicitySource();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION__MULTIPLICITY_TARGET = eINSTANCE.getEntityRelation_MultiplicityTarget();

		/**
		 * The meta object literal for the '<em><b>The Factory Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION__THE_FACTORY_ENTITY = eINSTANCE.getEntityRelation_TheFactoryEntity();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION__SOURCE = eINSTANCE.getEntityRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION__TARGET = eINSTANCE.getEntityRelation_Target();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.SimpleRelationImpl <em>Simple Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.SimpleRelationImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getSimpleRelation()
		 * @generated
		 */
		EClass SIMPLE_RELATION = eINSTANCE.getSimpleRelation();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.AssociativeEntityImpl <em>Associative Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.AssociativeEntityImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getAssociativeEntity()
		 * @generated
		 */
		EClass ASSOCIATIVE_ENTITY = eINSTANCE.getAssociativeEntity();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.AttributeImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBLE = eINSTANCE.getAttribute_Visible();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_TYPE = eINSTANCE.getAttribute_AttributeType();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ENTITY = eINSTANCE.getAttribute_Entity();

		/**
		 * The meta object literal for the '<em><b>Elemento Realizacion Value Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE = eINSTANCE.getAttribute_ElementoRealizacionValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Elemento Realizacion Visible Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE = eINSTANCE.getAttribute_ElementoRealizacionVisibleAttribute();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.ModelElementEntityImpl <em>Model Element Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.ModelElementEntityImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getModelElementEntity()
		 * @generated
		 */
		EClass MODEL_ELEMENT_ENTITY = eINSTANCE.getModelElementEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_ENTITY__NAME = eINSTANCE.getModelElementEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_ENTITY__STEREOTYPE = eINSTANCE.getModelElementEntity_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getModelElementEntity_ElementoRealizacionDiagramEntity();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.DiagramEntityImpl <em>Diagram Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.DiagramEntityImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getDiagramEntity()
		 * @generated
		 */
		EClass DIAGRAM_ENTITY = eINSTANCE.getDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ENTITY__MODEL_FACTORY = eINSTANCE.getDiagramEntity_ModelFactory();

		/**
		 * The meta object literal for the '<em><b>List Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ENTITY__LIST_ENTITY = eINSTANCE.getDiagramEntity_ListEntity();

		/**
		 * The meta object literal for the '<em><b>List Entity Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ENTITY__LIST_ENTITY_RELATION = eINSTANCE.getDiagramEntity_ListEntityRelation();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl <em>Realizacion Diagram Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.RealizacionDiagramEntityImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getRealizacionDiagramEntity()
		 * @generated
		 */
		EClass REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getRealizacionDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Modelo Consulta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA = eINSTANCE.getRealizacionDiagramEntity_ModeloConsulta();

		/**
		 * The meta object literal for the '<em><b>List Elemento Realizacion Diagram Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getRealizacionDiagramEntity_ListElementoRealizacionDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Realizacion Visible Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE = eINSTANCE.getRealizacionDiagramEntity_RealizacionVisibleAttribute();

		/**
		 * The meta object literal for the '<em><b>List Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION_DIAGRAM_ENTITY__LIST_VALUES = eINSTANCE.getRealizacionDiagramEntity_ListValues();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl <em>Elemento Realizacion Diagram Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionDiagramEntityImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getElementoRealizacionDiagramEntity()
		 * @generated
		 */
		EClass ELEMENTO_REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getElementoRealizacionDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO = eINSTANCE.getElementoRealizacionDiagramEntity_Tipo();

		/**
		 * The meta object literal for the '<em><b>Nombre Model Element Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY = eINSTANCE.getElementoRealizacionDiagramEntity_NombreModelElementEntity();

		/**
		 * The meta object literal for the '<em><b>Model Element Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY = eINSTANCE.getElementoRealizacionDiagramEntity_ModelElementEntity();

		/**
		 * The meta object literal for the '<em><b>Realizacion Diagram Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getElementoRealizacionDiagramEntity_RealizacionDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>List Elemento Realizacion Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE = eINSTANCE.getElementoRealizacionDiagramEntity_ListElementoRealizacionAttribute();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl <em>Elemento Realizacion Value Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionValueAttributeImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getElementoRealizacionValueAttribute()
		 * @generated
		 */
		EClass ELEMENTO_REALIZACION_VALUE_ATTRIBUTE = eINSTANCE.getElementoRealizacionValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE = eINSTANCE.getElementoRealizacionValueAttribute_Nombre();

		/**
		 * The meta object literal for the '<em><b>Value Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE = eINSTANCE.getElementoRealizacionValueAttribute_ValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Elemento Realizacion Diagram Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getElementoRealizacionValueAttribute_ElementoRealizacionDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES = eINSTANCE.getElementoRealizacionValueAttribute_Values();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionVisibleAttributeImpl <em>Elemento Realizacion Visible Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.ElementoRealizacionVisibleAttributeImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getElementoRealizacionVisibleAttribute()
		 * @generated
		 */
		EClass ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE = eINSTANCE.getElementoRealizacionVisibleAttribute();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE = eINSTANCE.getElementoRealizacionVisibleAttribute_Nombre();

		/**
		 * The meta object literal for the '<em><b>Realizacion Diagram Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getElementoRealizacionVisibleAttribute_RealizacionDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Visible Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE = eINSTANCE.getElementoRealizacionVisibleAttribute_VisibleAttribute();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.impl.ValueImpl
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '<em><b>Elemento Realizacion Value Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE = eINSTANCE.getValue_ElementoRealizacionValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Realizacion Diagram Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getValue_RealizacionDiagramEntity();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.AttributeType
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.Multiplicity
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.TipoModelElementEntity <em>Tipo Model Element Entity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.TipoModelElementEntity
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getTipoModelElementEntity()
		 * @generated
		 */
		EEnum TIPO_MODEL_ELEMENT_ENTITY = eINSTANCE.getTipoModelElementEntity();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.entitymodel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.entitymodel.Type
		 * @see gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //EntitymodelPackage
