/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.data.Data_View;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getData_View <em>Data View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getPlantilla <em>Plantilla</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getGuia <em>Guia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getListaChequeo <em>Lista Chequeo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getTipoDocumento <em>Tipo Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getOrientacion()
 * @model
 * @generated
 */
public interface Orientacion extends Paquete {
	/**
	 * Returns the value of the '<em><b>Data View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data View</em>' container reference.
	 * @see #setData_View(Data_View)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getOrientacion_Data_View()
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getOrientacion
	 * @model opposite="Orientacion"
	 * @generated
	 */
	Data_View getData_View();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getData_View <em>Data View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data View</em>' container reference.
	 * @see #getData_View()
	 * @generated
	 */
	void setData_View(Data_View value);

	/**
	 * Returns the value of the '<em><b>Plantilla</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plantilla</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantilla</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getOrientacion_Plantilla()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getOrientacion
	 * @model opposite="Orientacion" containment="true" required="true"
	 * @generated
	 */
	EList<Plantilla> getPlantilla();

	/**
	 * Returns the value of the '<em><b>Guia</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guia</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getOrientacion_Guia()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getOrientacion
	 * @model opposite="Orientacion" containment="true" required="true"
	 * @generated
	 */
	EList<Guia> getGuia();

	/**
	 * Returns the value of the '<em><b>Lista Chequeo</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Chequeo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Chequeo</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getOrientacion_ListaChequeo()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getOrientacion
	 * @model opposite="Orientacion" containment="true" required="true"
	 * @generated
	 */
	EList<ListaChequeo> getListaChequeo();

	/**
	 * Returns the value of the '<em><b>Tipo Documento</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Documento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Documento</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getOrientacion_TipoDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getOrientacion
	 * @model opposite="Orientacion" containment="true" required="true"
	 * @generated
	 */
	EList<TipoDocumento> getTipoDocumento();

} // Orientacion
