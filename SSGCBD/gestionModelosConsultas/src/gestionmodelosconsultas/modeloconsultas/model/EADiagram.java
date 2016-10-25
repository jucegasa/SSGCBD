/**
 */
package gestionmodelosconsultas.modeloconsultas.model;

import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListRelacion <em>List Relacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getModeloConsulta <em>Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListElementoConsulta <em>List Elemento Consulta</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getEADiagram()
 * @model abstract="true"
 * @generated
 */
public interface EADiagram extends EObject {
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
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getEADiagram_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>List Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.model.Relacion}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getEADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Relacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Relacion</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getEADiagram_ListRelacion()
	 * @see gestionmodelosconsultas.modeloconsultas.model.Relacion#getEADiagram
	 * @model opposite="EADiagram" containment="true"
	 * @generated
	 */
	EList<Relacion> getListRelacion();

	/**
	 * Returns the value of the '<em><b>Modelo Consulta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListEADiagram <em>List EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo Consulta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo Consulta</em>' container reference.
	 * @see #setModeloConsulta(ModeloConsulta)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getEADiagram_ModeloConsulta()
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListEADiagram
	 * @model opposite="listEADiagram"
	 * @generated
	 */
	ModeloConsulta getModeloConsulta();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getModeloConsulta <em>Modelo Consulta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelo Consulta</em>' container reference.
	 * @see #getModeloConsulta()
	 * @generated
	 */
	void setModeloConsulta(ModeloConsulta value);

	/**
	 * Returns the value of the '<em><b>List Elemento Consulta</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getEADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elemento Consulta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elemento Consulta</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getEADiagram_ListElementoConsulta()
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getEADiagram
	 * @model opposite="EADiagram" containment="true"
	 * @generated
	 */
	EList<ElementoConsulta> getListElementoConsulta();

} // EADiagram
