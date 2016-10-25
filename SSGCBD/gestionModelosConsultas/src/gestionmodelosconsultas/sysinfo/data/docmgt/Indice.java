/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.data.Data_View;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getData_View <em>Data View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getIndice <em>Indice</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getIndice()
 * @model
 * @generated
 */
public interface Indice extends Paquete {
	/**
	 * Returns the value of the '<em><b>Data View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data View</em>' container reference.
	 * @see #setData_View(Data_View)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getIndice_Data_View()
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getIndice
	 * @model opposite="Indice"
	 * @generated
	 */
	Data_View getData_View();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getData_View <em>Data View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data View</em>' container reference.
	 * @see #getData_View()
	 * @generated
	 */
	void setData_View(Data_View value);

	/**
	 * Returns the value of the '<em><b>Indice</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getIndice_Indice()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getIndice
	 * @model opposite="Indice" containment="true" required="true"
	 * @generated
	 */
	EList<IndexEntry> getIndice();

} // Indice
