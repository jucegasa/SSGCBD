/**
 */
package gestionmodelosconsultas.entitymodel.util;

import gestionmodelosconsultas.entitymodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage
 * @generated
 */
public class EntitymodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EntitymodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitymodelSwitch() {
		if (modelPackage == null) {
			modelPackage = EntitymodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EntitymodelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseModelElementEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.ENTITY_RELATION: {
				EntityRelation entityRelation = (EntityRelation)theEObject;
				T result = caseEntityRelation(entityRelation);
				if (result == null) result = caseModelElementEntity(entityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.SIMPLE_RELATION: {
				SimpleRelation simpleRelation = (SimpleRelation)theEObject;
				T result = caseSimpleRelation(simpleRelation);
				if (result == null) result = caseEntityRelation(simpleRelation);
				if (result == null) result = caseModelElementEntity(simpleRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.ASSOCIATIVE_ENTITY: {
				AssociativeEntity associativeEntity = (AssociativeEntity)theEObject;
				T result = caseAssociativeEntity(associativeEntity);
				if (result == null) result = caseEntity(associativeEntity);
				if (result == null) result = caseModelElementEntity(associativeEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.MODEL_ELEMENT_ENTITY: {
				ModelElementEntity modelElementEntity = (ModelElementEntity)theEObject;
				T result = caseModelElementEntity(modelElementEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.DIAGRAM_ENTITY: {
				DiagramEntity diagramEntity = (DiagramEntity)theEObject;
				T result = caseDiagramEntity(diagramEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY: {
				RealizacionDiagramEntity realizacionDiagramEntity = (RealizacionDiagramEntity)theEObject;
				T result = caseRealizacionDiagramEntity(realizacionDiagramEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.ELEMENTO_REALIZACION_DIAGRAM_ENTITY: {
				ElementoRealizacionDiagramEntity elementoRealizacionDiagramEntity = (ElementoRealizacionDiagramEntity)theEObject;
				T result = caseElementoRealizacionDiagramEntity(elementoRealizacionDiagramEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.ELEMENTO_REALIZACION_VALUE_ATTRIBUTE: {
				ElementoRealizacionValueAttribute elementoRealizacionValueAttribute = (ElementoRealizacionValueAttribute)theEObject;
				T result = caseElementoRealizacionValueAttribute(elementoRealizacionValueAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE: {
				ElementoRealizacionVisibleAttribute elementoRealizacionVisibleAttribute = (ElementoRealizacionVisibleAttribute)theEObject;
				T result = caseElementoRealizacionVisibleAttribute(elementoRealizacionVisibleAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntitymodelPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRelation(EntityRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRelation(SimpleRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associative Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associative Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociativeEntity(AssociativeEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementEntity(ModelElementEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramEntity(DiagramEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizacion Diagram Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizacion Diagram Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizacionDiagramEntity(RealizacionDiagramEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Realizacion Diagram Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Realizacion Diagram Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoRealizacionDiagramEntity(ElementoRealizacionDiagramEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Realizacion Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Realizacion Value Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoRealizacionValueAttribute(ElementoRealizacionValueAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Realizacion Visible Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Realizacion Visible Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoRealizacionVisibleAttribute(ElementoRealizacionVisibleAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EntitymodelSwitch
