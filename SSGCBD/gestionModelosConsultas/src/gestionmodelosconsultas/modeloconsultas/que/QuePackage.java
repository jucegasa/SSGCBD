/**
 */
package gestionmodelosconsultas.modeloconsultas.que;

import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.que.QueFactory
 * @model kind="package"
 * @generated
 */
public interface QuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "que";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/que.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.que";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuePackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.que.impl.DocumentoImpl <em>Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.que.impl.DocumentoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl#getDocumento()
	 * @generated
	 */
	int DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__OWNER = DocmgtPackage.DOCUMENTO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__CONTEXTO = DocmgtPackage.DOCUMENTO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__NOMBRE = DocmgtPackage.DOCUMENTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__FROM = DocmgtPackage.DOCUMENTO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TO = DocmgtPackage.DOCUMENTO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DOC = DocmgtPackage.DOCUMENTO__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DESCRIPCION = DocmgtPackage.DOCUMENTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TITULO = DocmgtPackage.DOCUMENTO__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__EDICION = DocmgtPackage.DOCUMENTO__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__VIGENCIA = DocmgtPackage.DOCUMENTO__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ESTADO = DocmgtPackage.DOCUMENTO__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_VERSION = DocmgtPackage.DOCUMENTO__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__CONTEXTO_DOCUMENTO = DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__PALABRA_CLAVE = DocmgtPackage.DOCUMENTO__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_CONTENIDO = DocmgtPackage.DOCUMENTO__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_ITEM = DocmgtPackage.DOCUMENTO__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DERIVADAS = DocmgtPackage.DOCUMENTO__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__BASE = DocmgtPackage.DOCUMENTO__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_BASELINE = DocmgtPackage.DOCUMENTO__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__THE_TIPO_DOCUMENTO = DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__PRODUCTO = DocmgtPackage.DOCUMENTO__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__THE_ROL = DocmgtPackage.DOCUMENTO__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ASOCIADO = DocmgtPackage.DOCUMENTO__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TABLA_RETENCION_DOCUMENTAL = DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__EXPEDIENTE = DocmgtPackage.DOCUMENTO__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__OBSERVACION = DocmgtPackage.DOCUMENTO__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ANEXO = DocmgtPackage.DOCUMENTO__ANEXO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ORDER = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__EA_DIAGRAM = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__LIST_CAMPOS = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FEATURE_COUNT = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO___REGISTRAR = DocmgtPackage.DOCUMENTO___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO___APROBAR = DocmgtPackage.DOCUMENTO___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO___EXPIRAR = DocmgtPackage.DOCUMENTO___EXPIRAR;

	/**
	 * The number of operations of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_OPERATION_COUNT = DocmgtPackage.DOCUMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.que.impl.ComunicacionImpl <em>Comunicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.que.impl.ComunicacionImpl
	 * @see gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl#getComunicacion()
	 * @generated
	 */
	int COMUNICACION = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__OWNER = ComunicacionPackage.COMUNICACION__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__CONTEXTO = ComunicacionPackage.COMUNICACION__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__NOMBRE = ComunicacionPackage.COMUNICACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__FROM = ComunicacionPackage.COMUNICACION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__TO = ComunicacionPackage.COMUNICACION__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DOC = ComunicacionPackage.COMUNICACION__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DESCRIPCION = ComunicacionPackage.COMUNICACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__TITULO = ComunicacionPackage.COMUNICACION__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__EDICION = ComunicacionPackage.COMUNICACION__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__VIGENCIA = ComunicacionPackage.COMUNICACION__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ESTADO = ComunicacionPackage.COMUNICACION__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_VERSION = ComunicacionPackage.COMUNICACION__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__CONTEXTO_DOCUMENTO = ComunicacionPackage.COMUNICACION__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__PALABRA_CLAVE = ComunicacionPackage.COMUNICACION__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_CONTENIDO = ComunicacionPackage.COMUNICACION__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_ITEM = ComunicacionPackage.COMUNICACION__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DERIVADAS = ComunicacionPackage.COMUNICACION__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__BASE = ComunicacionPackage.COMUNICACION__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_BASELINE = ComunicacionPackage.COMUNICACION__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__THE_TIPO_DOCUMENTO = ComunicacionPackage.COMUNICACION__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__PRODUCTO = ComunicacionPackage.COMUNICACION__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__THE_ROL = ComunicacionPackage.COMUNICACION__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ASOCIADO = ComunicacionPackage.COMUNICACION__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__TABLA_RETENCION_DOCUMENTAL = ComunicacionPackage.COMUNICACION__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__EXPEDIENTE = ComunicacionPackage.COMUNICACION__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__OBSERVACION = ComunicacionPackage.COMUNICACION__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ANEXO = ComunicacionPackage.COMUNICACION__ANEXO;

	/**
	 * The feature id for the '<em><b>Destinatario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DESTINATARIO = ComunicacionPackage.COMUNICACION__DESTINATARIO;

	/**
	 * The feature id for the '<em><b>Remitente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__REMITENTE = ComunicacionPackage.COMUNICACION__REMITENTE;

	/**
	 * The feature id for the '<em><b>Numero Radicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__NUMERO_RADICADO = ComunicacionPackage.COMUNICACION__NUMERO_RADICADO;

	/**
	 * The feature id for the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ASUNTO = ComunicacionPackage.COMUNICACION__ASUNTO;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__CONTENIDO = ComunicacionPackage.COMUNICACION__CONTENIDO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ORDER = ComunicacionPackage.COMUNICACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__EA_DIAGRAM = ComunicacionPackage.COMUNICACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__LIST_CAMPOS = ComunicacionPackage.COMUNICACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comunicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_FEATURE_COUNT = ComunicacionPackage.COMUNICACION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION___REGISTRAR = ComunicacionPackage.COMUNICACION___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION___APROBAR = ComunicacionPackage.COMUNICACION___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION___EXPIRAR = ComunicacionPackage.COMUNICACION___EXPIRAR;

	/**
	 * The number of operations of the '<em>Comunicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_OPERATION_COUNT = ComunicacionPackage.COMUNICACION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.que.Documento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.que.Documento
	 * @generated
	 */
	EClass getDocumento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.que.Comunicacion <em>Comunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comunicacion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.que.Comunicacion
	 * @generated
	 */
	EClass getComunicacion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueFactory getQueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.que.impl.DocumentoImpl <em>Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.que.impl.DocumentoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl#getDocumento()
		 * @generated
		 */
		EClass DOCUMENTO = eINSTANCE.getDocumento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.que.impl.ComunicacionImpl <em>Comunicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.que.impl.ComunicacionImpl
		 * @see gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl#getComunicacion()
		 * @generated
		 */
		EClass COMUNICACION = eINSTANCE.getComunicacion();

	}

} //QuePackage
