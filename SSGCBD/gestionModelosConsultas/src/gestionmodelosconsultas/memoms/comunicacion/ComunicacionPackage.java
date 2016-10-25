/**
 */
package gestionmodelosconsultas.memoms.comunicacion;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see gestionmodelosconsultas.memoms.comunicacion.ComunicacionFactory
 * @model kind="package"
 * @generated
 */
public interface ComunicacionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comunicacion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/memoms/comunicacion.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.memoms.comunicacion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComunicacionPackage eINSTANCE = gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl <em>Comunicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl
	 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl#getComunicacion()
	 * @generated
	 */
	int COMUNICACION = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__OWNER = DocmgtPackage.DOCUMENTO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__CONTEXTO = DocmgtPackage.DOCUMENTO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__NOMBRE = DocmgtPackage.DOCUMENTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__FROM = DocmgtPackage.DOCUMENTO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__TO = DocmgtPackage.DOCUMENTO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DOC = DocmgtPackage.DOCUMENTO__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DESCRIPCION = DocmgtPackage.DOCUMENTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__TITULO = DocmgtPackage.DOCUMENTO__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__EDICION = DocmgtPackage.DOCUMENTO__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__VIGENCIA = DocmgtPackage.DOCUMENTO__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ESTADO = DocmgtPackage.DOCUMENTO__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_VERSION = DocmgtPackage.DOCUMENTO__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__CONTEXTO_DOCUMENTO = DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__PALABRA_CLAVE = DocmgtPackage.DOCUMENTO__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_CONTENIDO = DocmgtPackage.DOCUMENTO__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_ITEM = DocmgtPackage.DOCUMENTO__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DERIVADAS = DocmgtPackage.DOCUMENTO__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__BASE = DocmgtPackage.DOCUMENTO__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__SU_BASELINE = DocmgtPackage.DOCUMENTO__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__THE_TIPO_DOCUMENTO = DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__PRODUCTO = DocmgtPackage.DOCUMENTO__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__THE_ROL = DocmgtPackage.DOCUMENTO__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ASOCIADO = DocmgtPackage.DOCUMENTO__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__TABLA_RETENCION_DOCUMENTAL = DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__EXPEDIENTE = DocmgtPackage.DOCUMENTO__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__OBSERVACION = DocmgtPackage.DOCUMENTO__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ANEXO = DocmgtPackage.DOCUMENTO__ANEXO;

	/**
	 * The feature id for the '<em><b>Destinatario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__DESTINATARIO = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remitente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__REMITENTE = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numero Radicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__NUMERO_RADICADO = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ASUNTO = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__CONTENIDO = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Comunicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_FEATURE_COUNT = DocmgtPackage.DOCUMENTO_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION___REGISTRAR = DocmgtPackage.DOCUMENTO___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION___APROBAR = DocmgtPackage.DOCUMENTO___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION___EXPIRAR = DocmgtPackage.DOCUMENTO___EXPIRAR;

	/**
	 * The number of operations of the '<em>Comunicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_OPERATION_COUNT = DocmgtPackage.DOCUMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.comunicacion.impl.MemorandoImpl <em>Memorando</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.comunicacion.impl.MemorandoImpl
	 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl#getMemorando()
	 * @generated
	 */
	int MEMORANDO = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__OWNER = COMUNICACION__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__CONTEXTO = COMUNICACION__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__NOMBRE = COMUNICACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__FROM = COMUNICACION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__TO = COMUNICACION__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__DOC = COMUNICACION__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__DESCRIPCION = COMUNICACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__TITULO = COMUNICACION__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__EDICION = COMUNICACION__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__VIGENCIA = COMUNICACION__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__ESTADO = COMUNICACION__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__SU_VERSION = COMUNICACION__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__CONTEXTO_DOCUMENTO = COMUNICACION__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__PALABRA_CLAVE = COMUNICACION__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__SU_CONTENIDO = COMUNICACION__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__SU_ITEM = COMUNICACION__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__DERIVADAS = COMUNICACION__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__BASE = COMUNICACION__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__SU_BASELINE = COMUNICACION__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__THE_TIPO_DOCUMENTO = COMUNICACION__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__PRODUCTO = COMUNICACION__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__THE_ROL = COMUNICACION__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__ASOCIADO = COMUNICACION__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__TABLA_RETENCION_DOCUMENTAL = COMUNICACION__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__EXPEDIENTE = COMUNICACION__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__OBSERVACION = COMUNICACION__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__ANEXO = COMUNICACION__ANEXO;

	/**
	 * The feature id for the '<em><b>Destinatario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__DESTINATARIO = COMUNICACION__DESTINATARIO;

	/**
	 * The feature id for the '<em><b>Remitente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__REMITENTE = COMUNICACION__REMITENTE;

	/**
	 * The feature id for the '<em><b>Numero Radicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__NUMERO_RADICADO = COMUNICACION__NUMERO_RADICADO;

	/**
	 * The feature id for the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__ASUNTO = COMUNICACION__ASUNTO;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__CONTENIDO = COMUNICACION__CONTENIDO;

	/**
	 * The feature id for the '<em><b>Actividad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO__ACTIVIDAD = COMUNICACION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memorando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_FEATURE_COUNT = COMUNICACION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO___REGISTRAR = COMUNICACION___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO___APROBAR = COMUNICACION___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO___EXPIRAR = COMUNICACION___EXPIRAR;

	/**
	 * The number of operations of the '<em>Memorando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_OPERATION_COUNT = COMUNICACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.comunicacion.impl.CircularImpl <em>Circular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.comunicacion.impl.CircularImpl
	 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl#getCircular()
	 * @generated
	 */
	int CIRCULAR = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__OWNER = COMUNICACION__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__CONTEXTO = COMUNICACION__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__NOMBRE = COMUNICACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__FROM = COMUNICACION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__TO = COMUNICACION__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__DOC = COMUNICACION__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__DESCRIPCION = COMUNICACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__TITULO = COMUNICACION__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__EDICION = COMUNICACION__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__VIGENCIA = COMUNICACION__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__ESTADO = COMUNICACION__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__SU_VERSION = COMUNICACION__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__CONTEXTO_DOCUMENTO = COMUNICACION__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__PALABRA_CLAVE = COMUNICACION__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__SU_CONTENIDO = COMUNICACION__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__SU_ITEM = COMUNICACION__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__DERIVADAS = COMUNICACION__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__BASE = COMUNICACION__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__SU_BASELINE = COMUNICACION__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__THE_TIPO_DOCUMENTO = COMUNICACION__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__PRODUCTO = COMUNICACION__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__THE_ROL = COMUNICACION__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__ASOCIADO = COMUNICACION__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__TABLA_RETENCION_DOCUMENTAL = COMUNICACION__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__EXPEDIENTE = COMUNICACION__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__OBSERVACION = COMUNICACION__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__ANEXO = COMUNICACION__ANEXO;

	/**
	 * The feature id for the '<em><b>Destinatario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__DESTINATARIO = COMUNICACION__DESTINATARIO;

	/**
	 * The feature id for the '<em><b>Remitente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__REMITENTE = COMUNICACION__REMITENTE;

	/**
	 * The feature id for the '<em><b>Numero Radicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__NUMERO_RADICADO = COMUNICACION__NUMERO_RADICADO;

	/**
	 * The feature id for the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__ASUNTO = COMUNICACION__ASUNTO;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR__CONTENIDO = COMUNICACION__CONTENIDO;

	/**
	 * The number of structural features of the '<em>Circular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_FEATURE_COUNT = COMUNICACION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR___REGISTRAR = COMUNICACION___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR___APROBAR = COMUNICACION___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR___EXPIRAR = COMUNICACION___EXPIRAR;

	/**
	 * The number of operations of the '<em>Circular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_OPERATION_COUNT = COMUNICACION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion <em>Comunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comunicacion</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion
	 * @generated
	 */
	EClass getComunicacion();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getDestinatario <em>Destinatario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destinatario</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getDestinatario()
	 * @see #getComunicacion()
	 * @generated
	 */
	EReference getComunicacion_Destinatario();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getRemitente <em>Remitente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remitente</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getRemitente()
	 * @see #getComunicacion()
	 * @generated
	 */
	EReference getComunicacion_Remitente();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getNumeroRadicado <em>Numero Radicado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Radicado</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getNumeroRadicado()
	 * @see #getComunicacion()
	 * @generated
	 */
	EAttribute getComunicacion_NumeroRadicado();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getAsunto <em>Asunto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asunto</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getAsunto()
	 * @see #getComunicacion()
	 * @generated
	 */
	EAttribute getComunicacion_Asunto();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getContenido <em>Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenido</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Comunicacion#getContenido()
	 * @see #getComunicacion()
	 * @generated
	 */
	EAttribute getComunicacion_Contenido();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.comunicacion.Memorando <em>Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memorando</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Memorando
	 * @generated
	 */
	EClass getMemorando();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.memoms.comunicacion.Memorando#getActividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actividad</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Memorando#getActividad()
	 * @see #getMemorando()
	 * @generated
	 */
	EReference getMemorando_Actividad();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.comunicacion.Circular <em>Circular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circular</em>'.
	 * @see gestionmodelosconsultas.memoms.comunicacion.Circular
	 * @generated
	 */
	EClass getCircular();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComunicacionFactory getComunicacionFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl <em>Comunicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl
		 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl#getComunicacion()
		 * @generated
		 */
		EClass COMUNICACION = eINSTANCE.getComunicacion();

		/**
		 * The meta object literal for the '<em><b>Destinatario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMUNICACION__DESTINATARIO = eINSTANCE.getComunicacion_Destinatario();

		/**
		 * The meta object literal for the '<em><b>Remitente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMUNICACION__REMITENTE = eINSTANCE.getComunicacion_Remitente();

		/**
		 * The meta object literal for the '<em><b>Numero Radicado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMUNICACION__NUMERO_RADICADO = eINSTANCE.getComunicacion_NumeroRadicado();

		/**
		 * The meta object literal for the '<em><b>Asunto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMUNICACION__ASUNTO = eINSTANCE.getComunicacion_Asunto();

		/**
		 * The meta object literal for the '<em><b>Contenido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMUNICACION__CONTENIDO = eINSTANCE.getComunicacion_Contenido();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.comunicacion.impl.MemorandoImpl <em>Memorando</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.comunicacion.impl.MemorandoImpl
		 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl#getMemorando()
		 * @generated
		 */
		EClass MEMORANDO = eINSTANCE.getMemorando();

		/**
		 * The meta object literal for the '<em><b>Actividad</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORANDO__ACTIVIDAD = eINSTANCE.getMemorando_Actividad();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.comunicacion.impl.CircularImpl <em>Circular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.comunicacion.impl.CircularImpl
		 * @see gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl#getCircular()
		 * @generated
		 */
		EClass CIRCULAR = eINSTANCE.getCircular();

	}

} //ComunicacionPackage
