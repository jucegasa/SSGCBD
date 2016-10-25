/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement#getResultado <em>Resultado</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getResultElement()
 * @model abstract="true"
 * @generated
 */
public interface ResultElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Resultado</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getListResultElement <em>List Result Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultado</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultado</em>' container reference.
	 * @see #setResultado(Resultado)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#getResultElement_Resultado()
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getListResultElement
	 * @model opposite="listResultElement"
	 * @generated
	 */
	Resultado getResultado();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement#getResultado <em>Resultado</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultado</em>' container reference.
	 * @see #getResultado()
	 * @generated
	 */
	void setResultado(Resultado value);

} // ResultElement
