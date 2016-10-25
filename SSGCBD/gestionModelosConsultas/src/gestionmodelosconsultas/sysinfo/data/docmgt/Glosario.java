/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.data.Data_View;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glosario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getData_View <em>Data View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getPalabraClave <em>Palabra Clave</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getGlosario()
 * @model
 * @generated
 */
public interface Glosario extends Paquete {
	/**
	 * Returns the value of the '<em><b>Data View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data View</em>' container reference.
	 * @see #setData_View(Data_View)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getGlosario_Data_View()
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getGlosario
	 * @model opposite="Glosario"
	 * @generated
	 */
	Data_View getData_View();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getData_View <em>Data View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data View</em>' container reference.
	 * @see #getData_View()
	 * @generated
	 */
	void setData_View(Data_View value);

	/**
	 * Returns the value of the '<em><b>Palabra Clave</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palabra Clave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palabra Clave</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getGlosario_PalabraClave()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getGlosario
	 * @model opposite="Glosario" containment="true" required="true"
	 * @generated
	 */
	EList<PalabraClave> getPalabraClave();

} // Glosario
