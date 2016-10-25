/**
 */
package gestionmodelosconsultas.modeloconsultas.model;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getOrder <em>Order</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getEADiagram <em>EA Diagram</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getTarget <em>Target</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estereotipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estereotipo</em>' attribute.
	 * @see #setEstereotipo(String)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getRelacion_Estereotipo()
	 * @model
	 * @generated
	 */
	String getEstereotipo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getEstereotipo <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estereotipo</em>' attribute.
	 * @see #getEstereotipo()
	 * @generated
	 */
	void setEstereotipo(String value);

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
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getRelacion_Order()
	 * @model
	 * @generated
	 */
	Integer getOrder();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>EA Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListRelacion <em>List Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EA Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EA Diagram</em>' container reference.
	 * @see #setEADiagram(EADiagram)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getRelacion_EADiagram()
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListRelacion
	 * @model opposite="listRelacion"
	 * @generated
	 */
	EADiagram getEADiagram();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getEADiagram <em>EA Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EA Diagram</em>' container reference.
	 * @see #getEADiagram()
	 * @generated
	 */
	void setEADiagram(EADiagram value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ElementoConsulta)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getRelacion_Target()
	 * @model required="true"
	 * @generated
	 */
	ElementoConsulta getTarget();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ElementoConsulta value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ElementoConsulta)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getRelacion_Source()
	 * @model required="true"
	 * @generated
	 */
	ElementoConsulta getSource();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ElementoConsulta value);

} // Relacion
