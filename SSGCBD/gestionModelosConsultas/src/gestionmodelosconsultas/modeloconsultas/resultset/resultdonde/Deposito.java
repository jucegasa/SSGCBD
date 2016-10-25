/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultdonde;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deposito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito#getIdDeposito <em>Id Deposito</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage#getDeposito()
 * @model
 * @generated
 */
public interface Deposito extends ElementoModeloResultado {
	/**
	 * Returns the value of the '<em><b>Id Deposito</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Deposito</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Deposito</em>' attribute.
	 * @see #setIdDeposito(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage#getDeposito_IdDeposito()
	 * @model
	 * @generated
	 */
	String getIdDeposito();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito#getIdDeposito <em>Id Deposito</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Deposito</em>' attribute.
	 * @see #getIdDeposito()
	 * @generated
	 */
	void setIdDeposito(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage#getDeposito_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // Deposito
