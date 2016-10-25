/**
 */
package gestionmodelosconsultas.modeloconsultas.model;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Consulta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getOrder <em>Order</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getEADiagram <em>EA Diagram</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getListCampos <em>List Campos</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoConsulta()
 * @model abstract="true"
 * @generated
 */
public interface ElementoConsulta extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoConsulta_Order()
	 * @model
	 * @generated
	 */
	Integer getOrder();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>EA Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListElementoConsulta <em>List Elemento Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EA Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EA Diagram</em>' container reference.
	 * @see #setEADiagram(EADiagram)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoConsulta_EADiagram()
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListElementoConsulta
	 * @model opposite="listElementoConsulta"
	 * @generated
	 */
	EADiagram getEADiagram();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getEADiagram <em>EA Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EA Diagram</em>' container reference.
	 * @see #getEADiagram()
	 * @generated
	 */
	void setEADiagram(EADiagram value);

	/**
	 * Returns the value of the '<em><b>List Campos</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.model.Campo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getOwnedElementoConsulta <em>Owned Elemento Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Campos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Campos</em>' containment reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoConsulta_ListCampos()
	 * @see gestionmodelosconsultas.modeloconsultas.model.Campo#getOwnedElementoConsulta
	 * @model opposite="ownedElementoConsulta" containment="true"
	 * @generated
	 */
	EList<Campo> getListCampos();

} // ElementoConsulta
