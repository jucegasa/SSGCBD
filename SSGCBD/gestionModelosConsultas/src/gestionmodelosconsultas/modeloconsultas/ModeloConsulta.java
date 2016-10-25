/**
 */
package gestionmodelosconsultas.modeloconsultas;

import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;

import gestionmodelosconsultas.modeloconsultas.model.EADiagram;

import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelo Consulta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getFactoryModeloConsulta <em>Factory Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListEADiagram <em>List EA Diagram</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListResultado <em>List Resultado</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getModeloConsulta()
 * @model
 * @generated
 */
public interface ModeloConsulta extends EObject {
	/**
	 * Returns the value of the '<em><b>Realizacion Diagram Entity</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getModeloConsulta <em>Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizacion Diagram Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizacion Diagram Entity</em>' containment reference.
	 * @see #setRealizacionDiagramEntity(RealizacionDiagramEntity)
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getModeloConsulta_RealizacionDiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity#getModeloConsulta
	 * @model opposite="ModeloConsulta" containment="true" required="true"
	 * @generated
	 */
	RealizacionDiagramEntity getRealizacionDiagramEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizacion Diagram Entity</em>' containment reference.
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 */
	void setRealizacionDiagramEntity(RealizacionDiagramEntity value);

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
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getModeloConsulta_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Factory Modelo Consulta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getListModeloConsulta <em>List Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Modelo Consulta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Modelo Consulta</em>' container reference.
	 * @see #setFactoryModeloConsulta(FactoryModeloConsulta)
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getModeloConsulta_FactoryModeloConsulta()
	 * @see gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getListModeloConsulta
	 * @model opposite="listModeloConsulta"
	 * @generated
	 */
	FactoryModeloConsulta getFactoryModeloConsulta();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getFactoryModeloConsulta <em>Factory Modelo Consulta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Modelo Consulta</em>' container reference.
	 * @see #getFactoryModeloConsulta()
	 * @generated
	 */
	void setFactoryModeloConsulta(FactoryModeloConsulta value);

	/**
	 * Returns the value of the '<em><b>List EA Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.model.EADiagram}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getModeloConsulta <em>Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List EA Diagram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List EA Diagram</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getModeloConsulta_ListEADiagram()
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram#getModeloConsulta
	 * @model opposite="ModeloConsulta" containment="true"
	 * @generated
	 */
	EList<EADiagram> getListEADiagram();

	/**
	 * Returns the value of the '<em><b>List Resultado</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getModeloConsulta <em>Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Resultado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Resultado</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getModeloConsulta_ListResultado()
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getModeloConsulta
	 * @model opposite="ModeloConsulta" containment="true"
	 * @generated
	 */
	EList<Resultado> getListResultado();

} // ModeloConsulta
