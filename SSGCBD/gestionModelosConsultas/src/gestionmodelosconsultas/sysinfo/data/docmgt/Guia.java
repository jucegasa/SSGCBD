/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Documento que contiene información importante en la elaboración del documento de Autoevaluación.
 * 
 * Responsable:
 * - Unidad Organizacional:Worker
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getSuTipo <em>Su Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getGuia()
 * @model
 * @generated
 */
public interface Guia extends Documento {
	/**
	 * Returns the value of the '<em><b>Orientacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getGuia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientacion</em>' container reference.
	 * @see #setOrientacion(Orientacion)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getGuia_Orientacion()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getGuia
	 * @model opposite="Guia"
	 * @generated
	 */
	Orientacion getOrientacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getOrientacion <em>Orientacion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientacion</em>' container reference.
	 * @see #getOrientacion()
	 * @generated
	 */
	void setOrientacion(Orientacion value);

	/**
	 * Returns the value of the '<em><b>Su Tipo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getGuia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Tipo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Tipo</em>' reference.
	 * @see #setSuTipo(TipoDocumento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getGuia_SuTipo()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getGuia
	 * @model opposite="guia" required="true"
	 * @generated
	 */
	TipoDocumento getSuTipo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getSuTipo <em>Su Tipo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Tipo</em>' reference.
	 * @see #getSuTipo()
	 * @generated
	 */
	void setSuTipo(TipoDocumento value);

} // Guia
