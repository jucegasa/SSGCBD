/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultque;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comunicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getIdComunicacion <em>Id Comunicacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getAsunto <em>Asunto</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultquePackage#getComunicacion()
 * @model
 * @generated
 */
public interface Comunicacion extends ElementoModeloResultado {
	/**
	 * Returns the value of the '<em><b>Id Comunicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Comunicacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Comunicacion</em>' attribute.
	 * @see #setIdComunicacion(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultquePackage#getComunicacion_IdComunicacion()
	 * @model
	 * @generated
	 */
	String getIdComunicacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getIdComunicacion <em>Id Comunicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Comunicacion</em>' attribute.
	 * @see #getIdComunicacion()
	 * @generated
	 */
	void setIdComunicacion(String value);

	/**
	 * Returns the value of the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asunto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asunto</em>' attribute.
	 * @see #setAsunto(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultquePackage#getComunicacion_Asunto()
	 * @model
	 * @generated
	 */
	String getAsunto();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getAsunto <em>Asunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asunto</em>' attribute.
	 * @see #getAsunto()
	 * @generated
	 */
	void setAsunto(String value);

} // Comunicacion
