/**
 */
package gestionmodelosconsultas.memoms.info;

import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anexo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Anexo#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Anexo#getId <em>Id</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Anexo#getArchivo <em>Archivo</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getAnexo()
 * @model
 * @generated
 */
public interface Anexo extends EObject {
	/**
	 * Returns the value of the '<em><b>Documento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAnexo <em>Anexo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' container reference.
	 * @see #setDocumento(Documento)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getAnexo_Documento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAnexo
	 * @model opposite="Anexo"
	 * @generated
	 */
	Documento getDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Anexo#getDocumento <em>Documento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento</em>' container reference.
	 * @see #getDocumento()
	 * @generated
	 */
	void setDocumento(Documento value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getAnexo_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Anexo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archivo</em>' attribute.
	 * @see #setArchivo(Byte)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getAnexo_Archivo()
	 * @model
	 * @generated
	 */
	Byte getArchivo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Anexo#getArchivo <em>Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archivo</em>' attribute.
	 * @see #getArchivo()
	 * @generated
	 */
	void setArchivo(Byte value);

} // Anexo
