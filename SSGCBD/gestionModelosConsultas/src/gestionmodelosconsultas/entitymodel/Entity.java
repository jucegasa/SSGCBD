/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Entity#getOwnedByFactoryEntity <em>Owned By Factory Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Entity#getListAttributes <em>List Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends ModelElementEntity {
	/**
	 * Returns the value of the '<em><b>Owned By Factory Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntity <em>List Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Factory Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Factory Entity</em>' container reference.
	 * @see #setOwnedByFactoryEntity(DiagramEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntity_OwnedByFactoryEntity()
	 * @see gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntity
	 * @model opposite="listEntity"
	 * @generated
	 */
	DiagramEntity getOwnedByFactoryEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Entity#getOwnedByFactoryEntity <em>Owned By Factory Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Factory Entity</em>' container reference.
	 * @see #getOwnedByFactoryEntity()
	 * @generated
	 */
	void setOwnedByFactoryEntity(DiagramEntity value);

	/**
	 * Returns the value of the '<em><b>List Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.Attribute}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.Attribute#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Attributes</em>' containment reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntity_ListAttributes()
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getEntity
	 * @model opposite="Entity" containment="true"
	 * @generated
	 */
	EList<Attribute> getListAttributes();

} // Entity
