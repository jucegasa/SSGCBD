/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un documento puede ser una enmienda a otro documento o puede existir en varios formatos o en varios lenguajes. 
 * 
 * De esta manera, se dice que una version de un documento contiene la misma información pero publicada en un diferente formato, lenguaje o medio; de lo contrario, este puede ser un documento totalmente diferente.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDoc <em>Doc</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getCuenta <em>Cuenta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getFormato <em>Formato</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getBase <em>Base</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDerivadas <em>Derivadas</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' container reference.
	 * @see #setDoc(Doc)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion_Doc()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getVersion
	 * @model opposite="Version"
	 * @generated
	 */
	Doc getDoc();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDoc <em>Doc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' container reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(Doc value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * se debe justificar la creación de una nueva versión del documento
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Cuenta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cuenta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuenta</em>' attribute.
	 * @see #setCuenta(Integer)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion_Cuenta()
	 * @model
	 * @generated
	 */
	Integer getCuenta();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getCuenta <em>Cuenta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cuenta</em>' attribute.
	 * @see #getCuenta()
	 * @generated
	 */
	void setCuenta(Integer value);

	/**
	 * Returns the value of the '<em><b>Formato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true: esta versión es semanticamente equivalente a la versión base excepto por un cambio de formato.
	 * 
	 * false: esta versión corresponde a un cambio semántico. Es decir se ha cambiado parcialmente o totalmente el contenido de la versión base.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formato</em>' attribute.
	 * @see #setFormato(Boolean)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion_Formato()
	 * @model
	 * @generated
	 */
	Boolean getFormato();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getFormato <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formato</em>' attribute.
	 * @see #getFormato()
	 * @generated
	 */
	void setFormato(Boolean value);

	/**
	 * Returns the value of the '<em><b>Su Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuVersion <em>Su Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Documento</em>' reference.
	 * @see #setSuDocumento(Documento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion_SuDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuVersion
	 * @model opposite="suVersion" required="true"
	 * @generated
	 */
	Documento getSuDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getSuDocumento <em>Su Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Documento</em>' reference.
	 * @see #getSuDocumento()
	 * @generated
	 */
	void setSuDocumento(Documento value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDerivadas <em>Derivadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Version)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion_Base()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDerivadas
	 * @model opposite="derivadas" required="true"
	 * @generated
	 */
	Version getBase();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Version value);

	/**
	 * Returns the value of the '<em><b>Derivadas</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Version}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivadas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivadas</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getVersion_Derivadas()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getBase
	 * @model opposite="base" required="true"
	 * @generated
	 */
	EList<Version> getDerivadas();

} // Version
