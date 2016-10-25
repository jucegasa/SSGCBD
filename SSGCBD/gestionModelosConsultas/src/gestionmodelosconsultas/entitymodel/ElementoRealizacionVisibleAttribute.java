/**
 */
package gestionmodelosconsultas.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Realizacion Visible Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getVisibleAttribute <em>Visible Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionVisibleAttribute()
 * @model
 * @generated
 */
public interface ElementoRealizacionVisibleAttribute extends EObject {
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
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionVisibleAttribute_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Realizacion Diagram Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getRealizacionVisibleAttribute <em>Realizacion Visible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizacion Diagram Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizacion Diagram Entity</em>' container reference.
	 * @see #setRealizacionDiagramEntity(RealizacionDiagramEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionVisibleAttribute_RealizacionDiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getRealizacionVisibleAttribute
	 * @model opposite="realizacionVisibleAttribute"
	 * @generated
	 */
	RealizacionDiagramEntity getRealizacionDiagramEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizacion Diagram Entity</em>' container reference.
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	void setRealizacionDiagramEntity(RealizacionDiagramEntity value);

	/**
	 * Returns the value of the '<em><b>Visible Attribute</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.Attribute}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionVisibleAttribute <em>Elemento Realizacion Visible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Attribute</em>' reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getElementoRealizacionVisibleAttribute_VisibleAttribute()
	 * @see gestionmodelosconsultas.entitymodel.Attribute#getElementoRealizacionVisibleAttribute
	 * @model opposite="ElementoRealizacionVisibleAttribute"
	 * @generated
	 */
	EList<Attribute> getVisibleAttribute();

} // ElementoRealizacionVisibleAttribute
