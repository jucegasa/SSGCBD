/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage
 * @generated
 */
public interface EntitymodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntitymodelFactory eINSTANCE = gestionmodelosconsultas.entitymodel.impl.EntitymodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Entity Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Relation</em>'.
	 * @generated
	 */
	EntityRelation createEntityRelation();

	/**
	 * Returns a new object of class '<em>Simple Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Relation</em>'.
	 * @generated
	 */
	SimpleRelation createSimpleRelation();

	/**
	 * Returns a new object of class '<em>Associative Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associative Entity</em>'.
	 * @generated
	 */
	AssociativeEntity createAssociativeEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Diagram Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Entity</em>'.
	 * @generated
	 */
	DiagramEntity createDiagramEntity();

	/**
	 * Returns a new object of class '<em>Realizacion Diagram Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realizacion Diagram Entity</em>'.
	 * @generated
	 */
	RealizacionDiagramEntity createRealizacionDiagramEntity();

	/**
	 * Returns a new object of class '<em>Elemento Realizacion Diagram Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento Realizacion Diagram Entity</em>'.
	 * @generated
	 */
	ElementoRealizacionDiagramEntity createElementoRealizacionDiagramEntity();

	/**
	 * Returns a new object of class '<em>Elemento Realizacion Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento Realizacion Value Attribute</em>'.
	 * @generated
	 */
	ElementoRealizacionValueAttribute createElementoRealizacionValueAttribute();

	/**
	 * Returns a new object of class '<em>Elemento Realizacion Visible Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento Realizacion Visible Attribute</em>'.
	 * @generated
	 */
	ElementoRealizacionVisibleAttribute createElementoRealizacionVisibleAttribute();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EntitymodelPackage getEntitymodelPackage();

} //EntitymodelFactory
