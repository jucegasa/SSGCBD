/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#isVisible <em>Visible</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#getEntity <em>Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionValueAttribute <em>Elemento Realizacion Value Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionVisibleAttribute <em>Elemento Realizacion Visible Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"string"</code>.
	 * The literals are from the enumeration {@link gestionmodelosconsultas.entitymodel.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.Type
	 * @see #setType(Type)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_Type()
	 * @model default="string"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_Visible()
	 * @model
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Attribute#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' attribute.
	 * The default value is <code>"ordinary"</code>.
	 * The literals are from the enumeration {@link gestionmodelosconsultas.entitymodel.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.AttributeType
	 * @see #setAttributeType(AttributeType)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_AttributeType()
	 * @model default="ordinary"
	 * @generated
	 */
	AttributeType getAttributeType();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Attribute#getAttributeType <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.AttributeType
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.Entity#getListAttributes <em>List Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_Entity()
	 * @see gestionmodelosconsultas.entitymodel.Entity#getListAttributes
	 * @model opposite="listAttributes"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.Attribute#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Elemento Realizacion Value Attribute</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValueAttribute <em>Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Realizacion Value Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Realizacion Value Attribute</em>' reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_ElementoRealizacionValueAttribute()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute#getValueAttribute
	 * @model opposite="valueAttribute"
	 * @generated
	 */
	EList<ElementoRealizacionValueAttribute> getElementoRealizacionValueAttribute();

	/**
	 * Returns the value of the '<em><b>Elemento Realizacion Visible Attribute</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getVisibleAttribute <em>Visible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Realizacion Visible Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Realizacion Visible Attribute</em>' reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getAttribute_ElementoRealizacionVisibleAttribute()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getVisibleAttribute
	 * @model opposite="visibleAttribute"
	 * @generated
	 */
	EList<ElementoRealizacionVisibleAttribute> getElementoRealizacionVisibleAttribute();

} // Attribute
