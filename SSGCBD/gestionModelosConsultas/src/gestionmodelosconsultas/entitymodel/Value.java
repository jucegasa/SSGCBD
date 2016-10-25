/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Value#getValue <em>Value</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Value#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Value#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Elemento Realizacion Value Attribute</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Realizacion Value Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Realizacion Value Attribute</em>' reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getValue_ElementoRealizacionValueAttribute()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValues
	 * @model opposite="values"
	 * @generated
	 */
	EList<ElementoRealizacionValueAttribute> getElementoRealizacionValueAttribute();

	/**
	 * Returns the value of the '<em><b>Realizacion Diagram Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListValues <em>List Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizacion Diagram Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizacion Diagram Entity</em>' container reference.
	 * @see #setRealizacionDiagramEntity(RealizacionDiagramEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getValue_RealizacionDiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListValues
	 * @model opposite="listValues"
	 * @generated
	 */
	RealizacionDiagramEntity getRealizacionDiagramEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Value#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizacion Diagram Entity</em>' container reference.
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	void setRealizacionDiagramEntity(RealizacionDiagramEntity value);

} // Value
