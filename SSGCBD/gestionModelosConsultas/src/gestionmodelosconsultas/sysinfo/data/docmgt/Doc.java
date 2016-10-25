/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getProducto <em>Producto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getVersion <em>Version</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getLibreria <em>Libreria</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDoc()
 * @model
 * @generated
 */
public interface Doc extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Documento</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDoc_Documento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDoc
	 * @model opposite="Doc" containment="true" required="true"
	 * @generated
	 */
	EList<Documento> getDocumento();

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDoc_Producto()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDoc
	 * @model opposite="Doc" containment="true" required="true"
	 * @generated
	 */
	EList<Producto> getProducto();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Version}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDoc_Version()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDoc
	 * @model opposite="Doc" containment="true" required="true"
	 * @generated
	 */
	EList<Version> getVersion();

	/**
	 * Returns the value of the '<em><b>Libreria</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libreria</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libreria</em>' container reference.
	 * @see #setLibreria(Libreria)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDoc_Libreria()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getDoc
	 * @model opposite="Doc"
	 * @generated
	 */
	Libreria getLibreria();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getLibreria <em>Libreria</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libreria</em>' container reference.
	 * @see #getLibreria()
	 * @generated
	 */
	void setLibreria(Libreria value);

} // Doc
