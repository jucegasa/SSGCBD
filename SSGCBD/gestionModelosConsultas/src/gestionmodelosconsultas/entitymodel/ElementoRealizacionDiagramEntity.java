/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Realizacion Diagram Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getTipo <em>Tipo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getNombreModelElementEntity <em>Nombre Model Element Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getModelElementEntity <em>Model Element Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getListElementoRealizacionAttribute <em>List Elemento Realizacion Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionDiagramEntity()
 * @model
 * @generated
 */
public interface ElementoRealizacionDiagramEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The default value is <code>"entity"</code>.
	 * The literals are from the enumeration {@link gestionmodelosconsultas.entitymodel.TipoModelElementEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.TipoModelElementEntity
	 * @see #setTipo(TipoModelElementEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionDiagramEntity_Tipo()
	 * @model default="entity"
	 * @generated
	 */
	TipoModelElementEntity getTipo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.TipoModelElementEntity
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoModelElementEntity value);

	/**
	 * Returns the value of the '<em><b>Nombre Model Element Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Model Element Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Model Element Entity</em>' attribute.
	 * @see #setNombreModelElementEntity(String)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionDiagramEntity_NombreModelElementEntity()
	 * @model
	 * @generated
	 */
	String getNombreModelElementEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getNombreModelElementEntity <em>Nombre Model Element Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Model Element Entity</em>' attribute.
	 * @see #getNombreModelElementEntity()
	 * @generated
	 */
	void setNombreModelElementEntity(String value);

	/**
	 * Returns the value of the '<em><b>Model Element Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ModelElementEntity#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Entity</em>' reference.
	 * @see #setModelElementEntity(ModelElementEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionDiagramEntity_ModelElementEntity()
	 * @see gestionmodelosconsultas.entitymodel.ModelElementEntity#getElementoRealizacionDiagramEntity
	 * @model opposite="ElementoRealizacionDiagramEntity" required="true"
	 * @generated
	 */
	ModelElementEntity getModelElementEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getModelElementEntity <em>Model Element Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element Entity</em>' reference.
	 * @see #getModelElementEntity()
	 * @generated
	 */
	void setModelElementEntity(ModelElementEntity value);

	/**
	 * Returns the value of the '<em><b>Realizacion Diagram Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListElementoRealizacionDiagramEntity <em>List Elemento Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizacion Diagram Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizacion Diagram Entity</em>' container reference.
	 * @see #setRealizacionDiagramEntity(RealizacionDiagramEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionDiagramEntity_RealizacionDiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListElementoRealizacionDiagramEntity
	 * @model opposite="listElementoRealizacionDiagramEntity"
	 * @generated
	 */
	RealizacionDiagramEntity getRealizacionDiagramEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizacion Diagram Entity</em>' container reference.
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	void setRealizacionDiagramEntity(RealizacionDiagramEntity value);

	/**
	 * Returns the value of the '<em><b>List Elemento Realizacion Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elemento Realizacion Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elemento Realizacion Attribute</em>' containment reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionDiagramEntity_ListElementoRealizacionAttribute()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getElementoRealizacionDiagramEntity
	 * @model opposite="ElementoRealizacionDiagramEntity" containment="true"
	 * @generated
	 */
	EList<ElementoRealizacionValueAttribute> getListElementoRealizacionAttribute();

} // ElementoRealizacionDiagramEntity
