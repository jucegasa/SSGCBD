/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.memoms.info.Anexo;
import gestionmodelosconsultas.memoms.info.Expediente;
import gestionmodelosconsultas.memoms.info.Observacion;
import gestionmodelosconsultas.memoms.info.TablaRetencionDocumental;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.function.Actividad;

import gestionmodelosconsultas.sysinfo.people.Quien;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 1) Diploma, carta, relación u otro escrito que ilustra acerca de algún hecho, principalmente de los históricos.
 * 2) Cualquier otra cosa que sirve para ilustrar o comprobar algo.
 * 3) Se compone de párrafos o frases, generalmente siguiendo una estructura gramatical predefinida.
 * 
 * Un documento no es mas que una especificación dentro del sistema.  El contenido de un documento se crea por intermedio de uno o mas elementos documentales.
 * 
 * Dentro del sistema no deben crearse múltiples registros para un mismo archivo.  
 * Se debe tener un control de cuantos elementos documentales contiene un documento.
 * 
 * Responsable:
 * - Unidad Organizacional:Worker
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDoc <em>Doc</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEdicion <em>Edicion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getVigencia <em>Vigencia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEstado <em>Estado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuVersion <em>Su Version</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getContextoDocumento <em>Contexto Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getPalabraClave <em>Palabra Clave</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuContenido <em>Su Contenido</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuItem <em>Su Item</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDerivadas <em>Derivadas</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getBase <em>Base</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuBaseline <em>Su Baseline</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheTipoDocumento <em>The Tipo Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getProducto <em>Producto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheRol <em>The Rol</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAsociado <em>Asociado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getExpediente <em>Expediente</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getObservacion <em>Observacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAnexo <em>Anexo</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento()
 * @model
 * @generated
 */
public interface Documento extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' container reference.
	 * @see #setDoc(Doc)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Doc()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getDocumento
	 * @model opposite="Documento"
	 * @generated
	 */
	Doc getDoc();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDoc <em>Doc</em>}' container reference.
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
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Título del documento. 
	 * Para el caso de un documento el título coincide con el nombre.  
	 * Para el caso de un elemento documental el titulo coincide con el título del documento, es decir, el título es el nombre unificador entre el documento y los elementod documentales.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edicion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edicion</em>' attribute.
	 * @see #setEdicion(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Edicion()
	 * @model
	 * @generated
	 */
	String getEdicion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEdicion <em>Edicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edicion</em>' attribute.
	 * @see #getEdicion()
	 * @generated
	 */
	void setEdicion(String value);

	/**
	 * Returns the value of the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * La vigencia le da valor a un documento dentro de un periodo de tiempo, a su vez, este valor le da valor a la autoevaluación dentro de un periodo de tiempo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vigencia</em>' attribute.
	 * @see #setVigencia(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Vigencia()
	 * @model
	 * @generated
	 */
	String getVigencia();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getVigencia <em>Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vigencia</em>' attribute.
	 * @see #getVigencia()
	 * @generated
	 */
	void setVigencia(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mantiene la información del estado de cada documento.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(Integer)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Estado()
	 * @model
	 * @generated
	 */
	Integer getEstado();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(Integer value);

	/**
	 * Returns the value of the '<em><b>Su Version</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Version</em>' reference.
	 * @see #setSuVersion(Version)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_SuVersion()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getSuDocumento
	 * @model opposite="suDocumento" required="true"
	 * @generated
	 */
	Version getSuVersion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuVersion <em>Su Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Version</em>' reference.
	 * @see #getSuVersion()
	 * @generated
	 */
	void setSuVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Contexto Documento</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexto Documento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexto Documento</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_ContextoDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuDocumento
	 * @model opposite="suDocumento" required="true"
	 * @generated
	 */
	EList<IndexEntry> getContextoDocumento();

	/**
	 * Returns the value of the '<em><b>Palabra Clave</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palabra Clave</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palabra Clave</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_PalabraClave()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getDocumento
	 * @model opposite="Documento" required="true"
	 * @generated
	 */
	EList<PalabraClave> getPalabraClave();

	/**
	 * Returns the value of the '<em><b>Su Contenido</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Contenido</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Contenido</em>' containment reference.
	 * @see #setSuContenido(Contenido)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_SuContenido()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuDocumento
	 * @model opposite="suDocumento" containment="true" required="true"
	 * @generated
	 */
	Contenido getSuContenido();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuContenido <em>Su Contenido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Contenido</em>' containment reference.
	 * @see #getSuContenido()
	 * @generated
	 */
	void setSuContenido(Contenido value);

	/**
	 * Returns the value of the '<em><b>Su Item</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Item}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Item</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_SuItem()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuDocumento
	 * @model opposite="suDocumento" required="true"
	 * @generated
	 */
	EList<Item> getSuItem();

	/**
	 * Returns the value of the '<em><b>Derivadas</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivadas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivadas</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Derivadas()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getBase
	 * @model opposite="base" required="true"
	 * @generated
	 */
	EList<Documento> getDerivadas();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDerivadas <em>Derivadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Documento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Base()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDerivadas
	 * @model opposite="derivadas" required="true"
	 * @generated
	 */
	Documento getBase();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Documento value);

	/**
	 * Returns the value of the '<em><b>Su Baseline</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Su Baseline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Su Baseline</em>' containment reference.
	 * @see #setSuBaseline(Baseline)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_SuBaseline()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuDocumento
	 * @model opposite="suDocumento" containment="true" required="true"
	 * @generated
	 */
	Baseline getSuBaseline();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuBaseline <em>Su Baseline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Su Baseline</em>' containment reference.
	 * @see #getSuBaseline()
	 * @generated
	 */
	void setSuBaseline(Baseline value);

	/**
	 * Returns the value of the '<em><b>The Tipo Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getTheDocumento <em>The Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Tipo Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tipo Documento</em>' reference.
	 * @see #setTheTipoDocumento(TipoDocumento)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_TheTipoDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getTheDocumento
	 * @model opposite="theDocumento" required="true"
	 * @generated
	 */
	TipoDocumento getTheTipoDocumento();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheTipoDocumento <em>The Tipo Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Tipo Documento</em>' reference.
	 * @see #getTheTipoDocumento()
	 * @generated
	 */
	void setTheTipoDocumento(TipoDocumento value);

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' reference.
	 * @see #setProducto(Producto)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Producto()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDocumento
	 * @model opposite="Documento" required="true"
	 * @generated
	 */
	Producto getProducto();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getProducto <em>Producto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producto</em>' reference.
	 * @see #getProducto()
	 * @generated
	 */
	void setProducto(Producto value);

	/**
	 * Returns the value of the '<em><b>The Rol</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.people.Quien}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.Quien#getTheDocumento <em>The Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Rol</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Rol</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_TheRol()
	 * @see gestionmodelosconsultas.sysinfo.people.Quien#getTheDocumento
	 * @model opposite="theDocumento"
	 * @generated
	 */
	EList<Quien> getTheRol();

	/**
	 * Returns the value of the '<em><b>Asociado</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.function.Actividad}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getGenera <em>Genera</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asociado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociado</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Asociado()
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getGenera
	 * @model opposite="genera"
	 * @generated
	 */
	EList<Actividad> getAsociado();

	/**
	 * Returns the value of the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabla Retencion Documental</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla Retencion Documental</em>' reference.
	 * @see #setTablaRetencionDocumental(TablaRetencionDocumental)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_TablaRetencionDocumental()
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDocumento
	 * @model opposite="Documento" required="true"
	 * @generated
	 */
	TablaRetencionDocumental getTablaRetencionDocumental();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla Retencion Documental</em>' reference.
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 */
	void setTablaRetencionDocumental(TablaRetencionDocumental value);

	/**
	 * Returns the value of the '<em><b>Expediente</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.info.Expediente}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.Expediente#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expediente</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expediente</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Expediente()
	 * @see gestionmodelosconsultas.memoms.info.Expediente#getDocumento
	 * @model opposite="Documento"
	 * @generated
	 */
	EList<Expediente> getExpediente();

	/**
	 * Returns the value of the '<em><b>Observacion</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.info.Observacion}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.Observacion#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observacion</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Observacion()
	 * @see gestionmodelosconsultas.memoms.info.Observacion#getDocumento
	 * @model opposite="Documento" containment="true"
	 * @generated
	 */
	EList<Observacion> getObservacion();

	/**
	 * Returns the value of the '<em><b>Anexo</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.info.Anexo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.Anexo#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anexo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anexo</em>' containment reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getDocumento_Anexo()
	 * @see gestionmodelosconsultas.memoms.info.Anexo#getDocumento
	 * @model opposite="Documento" containment="true"
	 * @generated
	 */
	EList<Anexo> getAnexo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Responsable: Unidad Organizacional:Worker
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void Registrar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Responsable: Unidad Organizacional:Worker
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void Aprobar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Responsable: Unidad Organizacional:Worker
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void Expirar();

} // Documento
