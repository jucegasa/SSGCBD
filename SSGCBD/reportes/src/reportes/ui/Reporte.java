/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reportes.ui.Reporte#getTheUI <em>The UI</em>}</li>
 * </ul>
 * </p>
 *
 * @see reportes.ui.UiPackage#getReporte()
 * @model
 * @generated
 */
public interface Reporte extends EObject {
	/**
	 * Returns the value of the '<em><b>The UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reportes.ui.UI#getTheReporte <em>The Reporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' container reference.
	 * @see #setTheUI(UI)
	 * @see reportes.ui.UiPackage#getReporte_TheUI()
	 * @see reportes.ui.UI#getTheReporte
	 * @model opposite="theReporte"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link reportes.ui.Reporte#getTheUI <em>The UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' container reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generarReporte();

} // Reporte
