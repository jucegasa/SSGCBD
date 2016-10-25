/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getName <em>Name</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getModelElementEntity()
 * @model abstract="true"
 * @generated
 */
public interface ModelElementEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getModelElementEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getModelElementEntity_Stereotype()
	 * @model
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Elemento Realizacion Diagram Entity</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getModelElementEntity <em>Model Element Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Realizacion Diagram Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Realizacion Diagram Entity</em>' reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getModelElementEntity_ElementoRealizacionDiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getModelElementEntity
	 * @model opposite="modelElementEntity"
	 * @generated
	 */
	EList<ElementoRealizacionDiagramEntity> getElementoRealizacionDiagramEntity();

} // ModelElementEntity
