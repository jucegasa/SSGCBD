/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un item es una entrada al indice del documento.
 * 
 * 1. adv. c. U. para hacer distinción de artículos o capítulos en una escritura u otro instrumento, o como señal de adición. 
 *  2. m. Cada uno de dichos artículos o capítulos. 
 *  3. m. Aditamento, añadidura. 
 *  4. m. Inform. Cada uno de los elementos que forman parte de un dato. 
 *  5. m. Psicol. Cada una de las partes o unidades de que se compone una prueba, un test, un cuestionario. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getTexto <em>Texto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getHInt <em>HInt</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuContenido <em>Su Contenido</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * texto que aparece en la entrada del contenido cuando se genera el indice del documento.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getItem_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

	/**
	 * Returns the value of the '<em><b>HInt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es el texto de ayuda para la posterior elaboración de cada item dentro del documento.  Es similar a el texto azul que aparece en las plantillas del RUP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HInt</em>' attribute.
	 * @see #setHInt(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getItem_HInt()
	 * @model
	 * @generated
	 */
	String getHInt();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getHInt <em>HInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HInt</em>' attribute.
	 * @see #getHInt()
	 * @generated
	 */
	void setHInt(String value);

	/**
	 * Returns the value of the '<em><b>Su Contenido</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuItem <em>Su Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Contenido</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Contenido</em>' container reference.
	 * @see #setSuContenido(Contenido)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getItem_SuContenido()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuItem
	 * @model opposite="suItem" required="true"
	 * @generated
	 */
	Contenido getSuContenido();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuContenido <em>Su Contenido</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Contenido</em>' container reference.
	 * @see #getSuContenido()
	 * @generated
	 */
	void setSuContenido(Contenido value);

	/**
	 * Returns the value of the '<em><b>Su Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuItem <em>Su Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Documento</em>' reference.
	 * @see #setSuDocumento(Documento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getItem_SuDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuItem
	 * @model opposite="suItem" required="true"
	 * @generated
	 */
	Documento getSuDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuDocumento <em>Su Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Documento</em>' reference.
	 * @see #getSuDocumento()
	 * @generated
	 */
	void setSuDocumento(Documento value);

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuItem <em>Su Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baseline</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseline</em>' container reference.
	 * @see #setBaseline(Baseline)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getItem_Baseline()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuItem
	 * @model opposite="suItem"
	 * @generated
	 */
	Baseline getBaseline();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getBaseline <em>Baseline</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline</em>' container reference.
	 * @see #getBaseline()
	 * @generated
	 */
	void setBaseline(Baseline value);

} // Item
