/**
 */
package gestionmodelosconsultas.memoms.info;

import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Observacion#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Observacion#getObservacion <em>Observacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Observacion#getCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getObservacion()
 * @model
 * @generated
 */
public interface Observacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Documento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getObservacion <em>Observacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' container reference.
	 * @see #setDocumento(Documento)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getObservacion_Documento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getObservacion
	 * @model opposite="Observacion"
	 * @generated
	 */
	Documento getDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Observacion#getDocumento <em>Documento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento</em>' container reference.
	 * @see #getDocumento()
	 * @generated
	 */
	void setDocumento(Documento value);

	/**
	 * Returns the value of the '<em><b>Observacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observacion</em>' attribute.
	 * @see #setObservacion(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getObservacion_Observacion()
	 * @model
	 * @generated
	 */
	String getObservacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Observacion#getObservacion <em>Observacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observacion</em>' attribute.
	 * @see #getObservacion()
	 * @generated
	 */
	void setObservacion(String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' attribute.
	 * @see #setCheck(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getObservacion_Check()
	 * @model
	 * @generated
	 */
	String getCheck();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Observacion#getCheck <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' attribute.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(String value);

} // Observacion
