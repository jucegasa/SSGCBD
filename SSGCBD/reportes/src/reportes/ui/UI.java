/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import reportes.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reportes.ui.UI#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link reportes.ui.UI#getDomain <em>Domain</em>}</li>
 *   <li>{@link reportes.ui.UI#getTheReporte <em>The Reporte</em>}</li>
 * </ul>
 * </p>
 *
 * @see reportes.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reportes.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see reportes.ui.UiPackage#getUI_TheModelFactory()
	 * @see reportes.ModelFactory#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link reportes.ui.UI#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link reportes.domain.Domain}.
	 * It is bidirectional and its opposite is '{@link reportes.domain.Domain#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see reportes.ui.UiPackage#getUI_Domain()
	 * @see reportes.domain.Domain#getUI
	 * @model type="reportes.domain.Domain" opposite="UI"
	 * @generated
	 */
	EList getDomain();

	/**
	 * Returns the value of the '<em><b>The Reporte</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link reportes.ui.Reporte#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Reporte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Reporte</em>' containment reference.
	 * @see #setTheReporte(Reporte)
	 * @see reportes.ui.UiPackage#getUI_TheReporte()
	 * @see reportes.ui.Reporte#getTheUI
	 * @model opposite="theUI" containment="true" required="true"
	 * @generated
	 */
	Reporte getTheReporte();

	/**
	 * Sets the value of the '{@link reportes.ui.UI#getTheReporte <em>The Reporte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Reporte</em>' containment reference.
	 * @see #getTheReporte()
	 * @generated
	 */
	void setTheReporte(Reporte value);

} // UI
