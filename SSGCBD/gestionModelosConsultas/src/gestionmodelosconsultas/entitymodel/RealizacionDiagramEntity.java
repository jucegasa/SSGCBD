/**
 */
package gestionmodelosconsultas.entitymodel;

import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realizacion Diagram Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getModeloConsulta <em>Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListElementoRealizacionDiagramEntity <em>List Elemento Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getRealizacionVisibleAttribute <em>Realizacion Visible Attribute</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getRealizacionDiagramEntity()
 * @model
 * @generated
 */
public interface RealizacionDiagramEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Modelo Consulta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo Consulta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo Consulta</em>' container reference.
	 * @see #setModeloConsulta(ModeloConsulta)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getRealizacionDiagramEntity_ModeloConsulta()
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getRealizacionDiagramEntity
	 * @model opposite="realizacionDiagramEntity"
	 * @generated
	 */
	ModeloConsulta getModeloConsulta();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getModeloConsulta <em>Modelo Consulta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelo Consulta</em>' container reference.
	 * @see #getModeloConsulta()
	 * @generated
	 */
	void setModeloConsulta(ModeloConsulta value);

	/**
	 * Returns the value of the '<em><b>List Elemento Realizacion Diagram Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elemento Realizacion Diagram Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elemento Realizacion Diagram Entity</em>' containment reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getRealizacionDiagramEntity_ListElementoRealizacionDiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity#getRealizacionDiagramEntity
	 * @model opposite="RealizacionDiagramEntity" containment="true"
	 * @generated
	 */
	EList<ElementoRealizacionDiagramEntity> getListElementoRealizacionDiagramEntity();

	/**
	 * Returns the value of the '<em><b>Realizacion Visible Attribute</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizacion Visible Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizacion Visible Attribute</em>' containment reference.
	 * @see #setRealizacionVisibleAttribute(ElementoRealizacionVisibleAttribute)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getRealizacionDiagramEntity_RealizacionVisibleAttribute()
	 * @see gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute#getRealizacionDiagramEntity
	 * @model opposite="RealizacionDiagramEntity" containment="true" required="true"
	 * @generated
	 */
	ElementoRealizacionVisibleAttribute getRealizacionVisibleAttribute();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getRealizacionVisibleAttribute <em>Realizacion Visible Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizacion Visible Attribute</em>' containment reference.
	 * @see #getRealizacionVisibleAttribute()
	 * @generated
	 */
	void setRealizacionVisibleAttribute(ElementoRealizacionVisibleAttribute value);

	/**
	 * Returns the value of the '<em><b>List Values</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.entitymodel.Value}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.Value#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Values</em>' containment reference list.
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getRealizacionDiagramEntity_ListValues()
	 * @see gestionmodelosconsultas.entitymodel.Value#getRealizacionDiagramEntity
	 * @model opposite="RealizacionDiagramEntity" containment="true"
	 * @generated
	 */
	EList<Value> getListValues();

} // RealizacionDiagramEntity
