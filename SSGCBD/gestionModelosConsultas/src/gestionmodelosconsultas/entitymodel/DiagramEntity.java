/**
 */
package gestionmodelosconsultas.entitymodel;

import gestionmodelosconsultas.ModelFactory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntity <em>List Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntityRelation <em>List Entity Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getDiagramEntity()
 * @model
 * @generated
 */
public interface DiagramEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.ModelFactory#getDiagramEntity <em>Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory</em>' container reference.
	 * @see #setModelFactory(ModelFactory)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getDiagramEntity_ModelFactory()
	 * @see gestionmodelosconsultas.ModelFactory#getDiagramEntity
	 * @model opposite="diagramEntity"
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getModelFactory <em>Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory</em>' container reference.
	 * @see #getModelFactory()
	 * @generated
	 */
	void setModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>List Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.Entity}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.Entity#getOwnedByFactoryEntity <em>Owned By Factory Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Entity</em>' containment reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getDiagramEntity_ListEntity()
	 * @see gestionmodelosconsultas.entitymodel.Entity#getOwnedByFactoryEntity
	 * @model opposite="ownedByFactoryEntity" containment="true"
	 * @generated
	 */
	EList<Entity> getListEntity();

	/**
	 * Returns the value of the '<em><b>List Entity Relation</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.EntityRelation}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getTheFactoryEntity <em>The Factory Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Entity Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Entity Relation</em>' containment reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getDiagramEntity_ListEntityRelation()
	 * @see gestionmodelosconsultas.entitymodel.EntityRelation#getTheFactoryEntity
	 * @model opposite="theFactoryEntity" containment="true"
	 * @generated
	 */
	EList<EntityRelation> getListEntityRelation();

} // DiagramEntity
