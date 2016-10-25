/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.entitymodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EntitymodelFactoryImpl extends EFactoryImpl implements EntitymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntitymodelFactory init() {
		try {
			EntitymodelFactory theEntitymodelFactory = (EntitymodelFactory)EPackage.Registry.INSTANCE.getEFactory(EntitymodelPackage.eNS_URI);
			if (theEntitymodelFactory != null) {
				return theEntitymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EntitymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitymodelFactoryImpl() {
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
			case EntitymodelPackage.ENTITY: return createEntity();
			case EntitymodelPackage.ENTITY_RELATION: return createEntityRelation();
			case EntitymodelPackage.SIMPLE_RELATION: return createSimpleRelation();
			case EntitymodelPackage.ASSOCIATIVE_ENTITY: return createAssociativeEntity();
			case EntitymodelPackage.ATTRIBUTE: return createAttribute();
			case EntitymodelPackage.DIAGRAM_ENTITY: return createDiagramEntity();
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY: return createRealizacionDiagramEntity();
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY: return createElementoRealizacionDiagramEntity();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE: return createElementoRealizacionValueAttribute();
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE: return createElementoRealizacionVisibleAttribute();
			case EntitymodelPackage.VALUE: return createValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EntitymodelPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case EntitymodelPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case EntitymodelPackage.TIPO_MODEL_ELEMENT_ENTITY:
				return createTipoModelElementEntityFromString(eDataType, initialValue);
			case EntitymodelPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EntitymodelPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case EntitymodelPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case EntitymodelPackage.TIPO_MODEL_ELEMENT_ENTITY:
				return convertTipoModelElementEntityToString(eDataType, instanceValue);
			case EntitymodelPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelation createEntityRelation() {
		EntityRelationImpl entityRelation = new EntityRelationImpl();
		return entityRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRelation createSimpleRelation() {
		SimpleRelationImpl simpleRelation = new SimpleRelationImpl();
		return simpleRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociativeEntity createAssociativeEntity() {
		AssociativeEntityImpl associativeEntity = new AssociativeEntityImpl();
		return associativeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramEntity createDiagramEntity() {
		DiagramEntityImpl diagramEntity = new DiagramEntityImpl();
		return diagramEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizacionDiagramEntity createRealizacionDiagramEntity() {
		RealizacionDiagramEntityImpl realizacionDiagramEntity = new RealizacionDiagramEntityImpl();
		return realizacionDiagramEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoRealizacionDiagramEntity createElementoRealizacionDiagramEntity() {
		ElementoRealizacionDiagramEntityImpl elementoRealizacionDiagramEntity = new ElementoRealizacionDiagramEntityImpl();
		return elementoRealizacionDiagramEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoRealizacionValueAttribute createElementoRealizacionValueAttribute() {
		ElementoRealizacionValueAttributeImpl elementoRealizacionValueAttribute = new ElementoRealizacionValueAttributeImpl();
		return elementoRealizacionValueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoRealizacionVisibleAttribute createElementoRealizacionVisibleAttribute() {
		ElementoRealizacionVisibleAttributeImpl elementoRealizacionVisibleAttribute = new ElementoRealizacionVisibleAttributeImpl();
		return elementoRealizacionVisibleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoModelElementEntity createTipoModelElementEntityFromString(EDataType eDataType, String initialValue) {
		TipoModelElementEntity result = TipoModelElementEntity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoModelElementEntityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitymodelPackage getEntitymodelPackage() {
		return (EntitymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EntitymodelPackage getPackage() {
		return EntitymodelPackage.eINSTANCE;
	}

} //EntitymodelFactoryImpl
