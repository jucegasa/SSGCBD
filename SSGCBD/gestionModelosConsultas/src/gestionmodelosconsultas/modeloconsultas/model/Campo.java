/**
 */
package gestionmodelosconsultas.modeloconsultas.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getNombreCampo <em>Nombre Campo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getCriterio <em>Criterio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Campo#isSeleccion <em>Seleccion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getOwnedElementoConsulta <em>Owned Elemento Consulta</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getCampo()
 * @model
 * @generated
 */
public interface Campo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Campo</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link gestionmodelosconsultas.modeloconsultas.model.NombreCampo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Campo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Campo</em>' attribute.
	 * @see gestionmodelosconsultas.modeloconsultas.model.NombreCampo
	 * @see #setNombreCampo(NombreCampo)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getCampo_NombreCampo()
	 * @model default="default"
	 * @generated
	 */
	NombreCampo getNombreCampo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getNombreCampo <em>Nombre Campo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Campo</em>' attribute.
	 * @see gestionmodelosconsultas.modeloconsultas.model.NombreCampo
	 * @see #getNombreCampo()
	 * @generated
	 */
	void setNombreCampo(NombreCampo value);

	/**
	 * Returns the value of the '<em><b>Criterio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterio</em>' attribute.
	 * @see #setCriterio(String)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getCampo_Criterio()
	 * @model
	 * @generated
	 */
	String getCriterio();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getCriterio <em>Criterio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterio</em>' attribute.
	 * @see #getCriterio()
	 * @generated
	 */
	void setCriterio(String value);

	/**
	 * Returns the value of the '<em><b>Seleccion</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seleccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seleccion</em>' attribute.
	 * @see #setSeleccion(boolean)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getCampo_Seleccion()
	 * @model default="false"
	 * @generated
	 */
	boolean isSeleccion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#isSeleccion <em>Seleccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seleccion</em>' attribute.
	 * @see #isSeleccion()
	 * @generated
	 */
	void setSeleccion(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Elemento Consulta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getListCampos <em>List Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elemento Consulta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elemento Consulta</em>' container reference.
	 * @see #setOwnedElementoConsulta(ElementoConsulta)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getCampo_OwnedElementoConsulta()
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getListCampos
	 * @model opposite="listCampos"
	 * @generated
	 */
	ElementoConsulta getOwnedElementoConsulta();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getOwnedElementoConsulta <em>Owned Elemento Consulta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Elemento Consulta</em>' container reference.
	 * @see #getOwnedElementoConsulta()
	 * @generated
	 */
	void setOwnedElementoConsulta(ElementoConsulta value);

} // Campo
