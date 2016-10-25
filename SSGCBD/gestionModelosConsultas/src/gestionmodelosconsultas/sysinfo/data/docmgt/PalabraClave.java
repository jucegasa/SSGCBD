/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palabra Clave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getGlosario <em>Glosario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getDocumento <em>Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getPalabraClave()
 * @model
 * @generated
 */
public interface PalabraClave extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Glosario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getPalabraClave <em>Palabra Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glosario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosario</em>' container reference.
	 * @see #setGlosario(Glosario)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getPalabraClave_Glosario()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getPalabraClave
	 * @model opposite="PalabraClave"
	 * @generated
	 */
	Glosario getGlosario();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getGlosario <em>Glosario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glosario</em>' container reference.
	 * @see #getGlosario()
	 * @generated
	 */
	void setGlosario(Glosario value);

	/**
	 * Returns the value of the '<em><b>Documento</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getPalabraClave <em>Palabra Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getPalabraClave_Documento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getPalabraClave
	 * @model opposite="PalabraClave" required="true"
	 * @generated
	 */
	EList<Documento> getDocumento();

} // PalabraClave
