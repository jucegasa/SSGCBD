/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDoc <em>Doc</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getUbicacion <em>Ubicacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getCopia <em>Copia</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' container reference.
	 * @see #setDoc(Doc)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getProducto_Doc()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getProducto
	 * @model opposite="Producto"
	 * @generated
	 */
	Doc getDoc();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDoc <em>Doc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' container reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(Doc value);

	/**
	 * Returns the value of the '<em><b>Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * es la ubicación del archivo en el sistema de archivos
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ubicacion</em>' attribute.
	 * @see #setUbicacion(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getProducto_Ubicacion()
	 * @model
	 * @generated
	 */
	String getUbicacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getUbicacion <em>Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubicacion</em>' attribute.
	 * @see #getUbicacion()
	 * @generated
	 */
	void setUbicacion(String value);

	/**
	 * Returns the value of the '<em><b>Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' reference.
	 * @see #setDocumento(Documento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getProducto_Documento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getProducto
	 * @model opposite="Producto" required="true"
	 * @generated
	 */
	Documento getDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDocumento <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento</em>' reference.
	 * @see #getDocumento()
	 * @generated
	 */
	void setDocumento(Documento value);

	/**
	 * Returns the value of the '<em><b>Copia</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copia</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copia</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getProducto_Copia()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getProducto
	 * @model opposite="Producto" required="true"
	 * @generated
	 */
	EList<Copia> getCopia();

} // Producto
