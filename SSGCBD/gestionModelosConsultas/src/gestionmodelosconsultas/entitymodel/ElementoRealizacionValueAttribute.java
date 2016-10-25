/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Realizacion Value Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValueAttribute <em>Value Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionValueAttribute()
 * @model
 * @generated
 */
public interface ElementoRealizacionValueAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionValueAttribute_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Value Attribute</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.Attribute}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attribute</em>' reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionValueAttribute_ValueAttribute()
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionValueAttribute
	 * @model opposite="ElementoRealizacionValueAttribute"
	 * @generated
	 */
	EList<Attribute> getValueAttribute();

	/**
	 * Returns the value of the '<em><b>Elemento Realizacion Diagram Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getListElementoRealizacionAttribute <em>List Elemento Realizacion Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Realizacion Diagram Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Realizacion Diagram Entity</em>' container reference.
	 * @see #setElementoRealizacionDiagramEntity(ElementoRealizacionDiagramEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionValueAttribute_ElementoRealizacionDiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getListElementoRealizacionAttribute
	 * @model opposite="listElementoRealizacionAttribute"
	 * @generated
	 */
	ElementoRealizacionDiagramEntity getElementoRealizacionDiagramEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getElementoRealizacionDiagramEntity <em>Elemento Realizacion Diagram Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento Realizacion Diagram Entity</em>' container reference.
	 * @see #getElementoRealizacionDiagramEntity()
	 * @generated
	 */
	void setElementoRealizacionDiagramEntity(ElementoRealizacionDiagramEntity value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.Value}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.Value#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionValueAttribute_Values()
	 * @see gestionmodelosconsultas.entitymodel.Value#getElementoRealizacionValueAttribute
	 * @model opposite="ElementoRealizacionValueAttribute"
	 * @generated
	 */
	EList<Value> getValues();

} // ElementoRealizacionValueAttribute
