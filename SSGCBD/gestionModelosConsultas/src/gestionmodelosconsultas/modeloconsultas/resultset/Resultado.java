/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset;

import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resultado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getModeloConsulta <em>Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getListResultElement <em>List Result Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getResultado()
 * @model
 * @generated
 */
public interface Resultado extends EObject {
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
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getResultado_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Modelo Consulta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListResultado <em>List Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo Consulta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo Consulta</em>' container reference.
	 * @see #setModeloConsulta(ModeloConsulta)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getResultado_ModeloConsulta()
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListResultado
	 * @model opposite="listResultado"
	 * @generated
	 */
	ModeloConsulta getModeloConsulta();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getModeloConsulta <em>Modelo Consulta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelo Consulta</em>' container reference.
	 * @see #getModeloConsulta()
	 * @generated
	 */
	void setModeloConsulta(ModeloConsulta value);

	/**
	 * Returns the value of the '<em><b>List Result Element</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement#getResultado <em>Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Result Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Result Element</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getResultado_ListResultElement()
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultElement#getResultado
	 * @model opposite="Resultado" containment="true"
	 * @generated
	 */
	EList<ResultElement> getListResultElement();

} // Resultado
