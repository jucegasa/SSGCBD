/**
 */
package gestionmodelosconsultas.modeloconsultas;

import gestionmodelosconsultas.ModelFactory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Modelo Consulta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getListModeloConsulta <em>List Modelo Consulta</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getFactoryModeloConsulta()
 * @model
 * @generated
 */
public interface FactoryModeloConsulta extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.ModelFactory#getFactoryModeloConsultas <em>Factory Modelo Consultas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory</em>' container reference.
	 * @see #setModelFactory(ModelFactory)
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getFactoryModeloConsulta_ModelFactory()
	 * @see gestionmodelosconsultas.ModelFactory#getFactoryModeloConsultas
	 * @model opposite="factoryModeloConsultas"
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getModelFactory <em>Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory</em>' container reference.
	 * @see #getModelFactory()
	 * @generated
	 */
	void setModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>List Modelo Consulta</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getFactoryModeloConsulta <em>Factory Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Modelo Consulta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Modelo Consulta</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#getFactoryModeloConsulta_ListModeloConsulta()
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getFactoryModeloConsulta
	 * @model opposite="FactoryModeloConsulta" containment="true"
	 * @generated
	 */
	EList<ModeloConsulta> getListModeloConsulta();

} // FactoryModeloConsulta
