/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

import gestionmodelosconsultas.sysinfo.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * <!-- begin-model-doc -->
 * Metamodelo de documentos
 * <!-- end-model-doc -->
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtFactory
 * @model kind="package"
 * @generated
 */
public interface DocmgtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docmgt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/data/docmgt.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.data.docmgt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocmgtPackage eINSTANCE = gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl <em>Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getDocumento()
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
	int DOCUMENTO__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DOC = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DESCRIPCION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TITULO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__EDICION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__VIGENCIA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ESTADO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_VERSION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__CONTEXTO_DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__PALABRA_CLAVE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_CONTENIDO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_ITEM = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DERIVADAS = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__BASE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__SU_BASELINE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__THE_TIPO_DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__PRODUCTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__THE_ROL = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ASOCIADO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TABLA_RETENCION_DOCUMENTAL = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__EXPEDIENTE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__OBSERVACION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ANEXO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 22;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO___REGISTRAR = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO___APROBAR = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO___EXPIRAR = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.PlantillaImpl <em>Plantilla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.PlantillaImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getPlantilla()
	 * @generated
	 */
	int PLANTILLA = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__OWNER = DOCUMENTO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__CONTEXTO = DOCUMENTO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__NOMBRE = DOCUMENTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__FROM = DOCUMENTO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__TO = DOCUMENTO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__DOC = DOCUMENTO__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__DESCRIPCION = DOCUMENTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__TITULO = DOCUMENTO__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__EDICION = DOCUMENTO__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__VIGENCIA = DOCUMENTO__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__ESTADO = DOCUMENTO__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__SU_VERSION = DOCUMENTO__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__CONTEXTO_DOCUMENTO = DOCUMENTO__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__PALABRA_CLAVE = DOCUMENTO__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__SU_CONTENIDO = DOCUMENTO__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__SU_ITEM = DOCUMENTO__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__DERIVADAS = DOCUMENTO__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__BASE = DOCUMENTO__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__SU_BASELINE = DOCUMENTO__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__THE_TIPO_DOCUMENTO = DOCUMENTO__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__PRODUCTO = DOCUMENTO__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__THE_ROL = DOCUMENTO__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__ASOCIADO = DOCUMENTO__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__TABLA_RETENCION_DOCUMENTAL = DOCUMENTO__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__EXPEDIENTE = DOCUMENTO__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__OBSERVACION = DOCUMENTO__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__ANEXO = DOCUMENTO__ANEXO;

	/**
	 * The feature id for the '<em><b>Orientacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__ORIENTACION = DOCUMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Su Tipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA__SU_TIPO = DOCUMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plantilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA_FEATURE_COUNT = DOCUMENTO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA___REGISTRAR = DOCUMENTO___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA___APROBAR = DOCUMENTO___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA___EXPIRAR = DOCUMENTO___EXPIRAR;

	/**
	 * The number of operations of the '<em>Plantilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTILLA_OPERATION_COUNT = DOCUMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.GuiaImpl <em>Guia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.GuiaImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getGuia()
	 * @generated
	 */
	int GUIA = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__OWNER = DOCUMENTO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__CONTEXTO = DOCUMENTO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__NOMBRE = DOCUMENTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__FROM = DOCUMENTO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__TO = DOCUMENTO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__DOC = DOCUMENTO__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__DESCRIPCION = DOCUMENTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__TITULO = DOCUMENTO__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__EDICION = DOCUMENTO__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__VIGENCIA = DOCUMENTO__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__ESTADO = DOCUMENTO__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__SU_VERSION = DOCUMENTO__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__CONTEXTO_DOCUMENTO = DOCUMENTO__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__PALABRA_CLAVE = DOCUMENTO__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__SU_CONTENIDO = DOCUMENTO__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__SU_ITEM = DOCUMENTO__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__DERIVADAS = DOCUMENTO__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__BASE = DOCUMENTO__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__SU_BASELINE = DOCUMENTO__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__THE_TIPO_DOCUMENTO = DOCUMENTO__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__PRODUCTO = DOCUMENTO__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__THE_ROL = DOCUMENTO__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__ASOCIADO = DOCUMENTO__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__TABLA_RETENCION_DOCUMENTAL = DOCUMENTO__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__EXPEDIENTE = DOCUMENTO__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__OBSERVACION = DOCUMENTO__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__ANEXO = DOCUMENTO__ANEXO;

	/**
	 * The feature id for the '<em><b>Orientacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__ORIENTACION = DOCUMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Su Tipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__SU_TIPO = DOCUMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA_FEATURE_COUNT = DOCUMENTO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA___REGISTRAR = DOCUMENTO___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA___APROBAR = DOCUMENTO___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA___EXPIRAR = DOCUMENTO___EXPIRAR;

	/**
	 * The number of operations of the '<em>Guia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA_OPERATION_COUNT = DOCUMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ListaChequeoImpl <em>Lista Chequeo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ListaChequeoImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getListaChequeo()
	 * @generated
	 */
	int LISTA_CHEQUEO = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__OWNER = DOCUMENTO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__CONTEXTO = DOCUMENTO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__NOMBRE = DOCUMENTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__FROM = DOCUMENTO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__TO = DOCUMENTO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__DOC = DOCUMENTO__DOC;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__DESCRIPCION = DOCUMENTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__TITULO = DOCUMENTO__TITULO;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__EDICION = DOCUMENTO__EDICION;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__VIGENCIA = DOCUMENTO__VIGENCIA;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__ESTADO = DOCUMENTO__ESTADO;

	/**
	 * The feature id for the '<em><b>Su Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__SU_VERSION = DOCUMENTO__SU_VERSION;

	/**
	 * The feature id for the '<em><b>Contexto Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__CONTEXTO_DOCUMENTO = DOCUMENTO__CONTEXTO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__PALABRA_CLAVE = DOCUMENTO__PALABRA_CLAVE;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__SU_CONTENIDO = DOCUMENTO__SU_CONTENIDO;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__SU_ITEM = DOCUMENTO__SU_ITEM;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__DERIVADAS = DOCUMENTO__DERIVADAS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__BASE = DOCUMENTO__BASE;

	/**
	 * The feature id for the '<em><b>Su Baseline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__SU_BASELINE = DOCUMENTO__SU_BASELINE;

	/**
	 * The feature id for the '<em><b>The Tipo Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__THE_TIPO_DOCUMENTO = DOCUMENTO__THE_TIPO_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__PRODUCTO = DOCUMENTO__PRODUCTO;

	/**
	 * The feature id for the '<em><b>The Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__THE_ROL = DOCUMENTO__THE_ROL;

	/**
	 * The feature id for the '<em><b>Asociado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__ASOCIADO = DOCUMENTO__ASOCIADO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__TABLA_RETENCION_DOCUMENTAL = DOCUMENTO__TABLA_RETENCION_DOCUMENTAL;

	/**
	 * The feature id for the '<em><b>Expediente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__EXPEDIENTE = DOCUMENTO__EXPEDIENTE;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__OBSERVACION = DOCUMENTO__OBSERVACION;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__ANEXO = DOCUMENTO__ANEXO;

	/**
	 * The feature id for the '<em><b>Orientacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__ORIENTACION = DOCUMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Su Tipo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO__SU_TIPO = DOCUMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lista Chequeo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO_FEATURE_COUNT = DOCUMENTO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Registrar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO___REGISTRAR = DOCUMENTO___REGISTRAR;

	/**
	 * The operation id for the '<em>Aprobar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO___APROBAR = DOCUMENTO___APROBAR;

	/**
	 * The operation id for the '<em>Expirar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO___EXPIRAR = DOCUMENTO___EXPIRAR;

	/**
	 * The number of operations of the '<em>Lista Chequeo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CHEQUEO_OPERATION_COUNT = DOCUMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ContenidoImpl <em>Contenido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ContenidoImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getContenido()
	 * @generated
	 */
	int CONTENIDO = 4;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENIDO__SU_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Su Documento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENIDO__SU_DOCUMENTO = 1;

	/**
	 * The number of structural features of the '<em>Contenido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENIDO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contenido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENIDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl <em>Tipo Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getTipoDocumento()
	 * @generated
	 */
	int TIPO_DOCUMENTO = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Orientacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__ORIENTACION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lista</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__LISTA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__GUIA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plantilla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__PLANTILLA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO__THE_DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tipo Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tipo Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DOCUMENTO_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl <em>Copia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getCopia()
	 * @generated
	 */
	int COPIA = 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Copias</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__COPIAS = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__FORMATO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consecutivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__CONSECUTIVO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deposito</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__DEPOSITO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__MENSAJE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__PRODUCTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA__UNIDAD_ORGANIZACIONAL = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Copia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Copia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIA_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 7;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DOC = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DESCRIPCION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cuenta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CUENTA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__FORMATO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Su Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__SU_DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__BASE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derivadas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DERIVADAS = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndexEntryImpl <em>Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndexEntryImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getIndexEntry()
	 * @generated
	 */
	int INDEX_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Su Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__SU_DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__INDICE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Su Elemento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__SU_ELEMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.PalabraClaveImpl <em>Palabra Clave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.PalabraClaveImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getPalabraClave()
	 * @generated
	 */
	int PALABRA_CLAVE = 9;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Glosario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE__GLOSARIO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE__DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Palabra Clave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Palabra Clave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALABRA_CLAVE_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 10;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TEXTO = 0;

	/**
	 * The feature id for the '<em><b>HInt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__HINT = 1;

	/**
	 * The feature id for the '<em><b>Su Contenido</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SU_CONTENIDO = 2;

	/**
	 * The feature id for the '<em><b>Su Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SU_DOCUMENTO = 3;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BASELINE = 4;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.BaselineImpl <em>Baseline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.BaselineImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getBaseline()
	 * @generated
	 */
	int BASELINE = 11;

	/**
	 * The feature id for the '<em><b>Su Documento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__SU_DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Su Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__SU_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Baseline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Baseline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndiceImpl <em>Indice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndiceImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getIndice()
	 * @generated
	 */
	int INDICE = 12;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Data View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__DATA_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__INDICE = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Indice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Indice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 13;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__DOC = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__UBICACION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__COPIA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl <em>Mensaje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getMensaje()
	 * @generated
	 */
	int MENSAJE = 14;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Distribucion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__DISTRIBUCION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__ASUNTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__MENSAJE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__COPIA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__CONTACTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__FECHA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.GlosarioImpl <em>Glosario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.GlosarioImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getGlosario()
	 * @generated
	 */
	int GLOSARIO = 15;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Data View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__DATA_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palabra Clave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__PALABRA_CLAVE = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glosario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glosario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.LibreriaImpl <em>Libreria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.LibreriaImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getLibreria()
	 * @generated
	 */
	int LIBRERIA = 16;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Data View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__DATA_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA__DOC = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Libreria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Libreria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DistribucionImpl <em>Distribucion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DistribucionImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getDistribucion()
	 * @generated
	 */
	int DISTRIBUCION = 17;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__MENSAJE = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION__DATA_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distribucion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Distribucion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUCION_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl <em>Orientacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getOrientacion()
	 * @generated
	 */
	int ORIENTACION = 18;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Data View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__DATA_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plantilla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__PLANTILLA = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__GUIA = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lista Chequeo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__LISTA_CHEQUEO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tipo Documento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION__TIPO_DOCUMENTO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Orientacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Orientacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTACION_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl <em>Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getDoc()
	 * @generated
	 */
	int DOC = 19;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__PRODUCTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__VERSION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Libreria</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__LIBRERIA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiasImpl <em>Copias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiasImpl
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getCopias()
	 * @generated
	 */
	int COPIAS = 20;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIAS__UNIDAD_ORGANIZACIONAL = 0;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIAS__COPIA = 1;

	/**
	 * The number of structural features of the '<em>Copias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Copias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIAS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento
	 * @generated
	 */
	EClass getDocumento();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Doc</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDoc()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Doc();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDescripcion()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTitulo()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEdicion <em>Edicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edicion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEdicion()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Edicion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getVigencia <em>Vigencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vigencia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getVigencia()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Vigencia();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getEstado()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Estado();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuVersion <em>Su Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Su Version</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuVersion()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_SuVersion();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getContextoDocumento <em>Contexto Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexto Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getContextoDocumento()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_ContextoDocumento();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getPalabraClave <em>Palabra Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Palabra Clave</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getPalabraClave()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_PalabraClave();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuContenido <em>Su Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Su Contenido</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuContenido()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_SuContenido();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuItem <em>Su Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Su Item</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuItem()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_SuItem();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDerivadas <em>Derivadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivadas</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getDerivadas()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Derivadas();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getBase()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Base();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuBaseline <em>Su Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Su Baseline</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getSuBaseline()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_SuBaseline();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheTipoDocumento <em>The Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Tipo Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheTipoDocumento()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_TheTipoDocumento();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getProducto()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Producto();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheRol <em>The Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>The Rol</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheRol()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_TheRol();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAsociado <em>Asociado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asociado</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAsociado()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Asociado();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabla Retencion Documental</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTablaRetencionDocumental()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_TablaRetencionDocumental();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getExpediente <em>Expediente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expediente</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getExpediente()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Expediente();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getObservacion <em>Observacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getObservacion()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Observacion();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAnexo <em>Anexo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anexo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getAnexo()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Anexo();

	/**
	 * Returns the meta object for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#Registrar() <em>Registrar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registrar</em>' operation.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#Registrar()
	 * @generated
	 */
	EOperation getDocumento__Registrar();

	/**
	 * Returns the meta object for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#Aprobar() <em>Aprobar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aprobar</em>' operation.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#Aprobar()
	 * @generated
	 */
	EOperation getDocumento__Aprobar();

	/**
	 * Returns the meta object for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#Expirar() <em>Expirar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expirar</em>' operation.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#Expirar()
	 * @generated
	 */
	EOperation getDocumento__Expirar();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla <em>Plantilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plantilla</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla
	 * @generated
	 */
	EClass getPlantilla();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orientacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getOrientacion()
	 * @see #getPlantilla()
	 * @generated
	 */
	EReference getPlantilla_Orientacion();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getSuTipo <em>Su Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Su Tipo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getSuTipo()
	 * @see #getPlantilla()
	 * @generated
	 */
	EReference getPlantilla_SuTipo();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Guia
	 * @generated
	 */
	EClass getGuia();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orientacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getOrientacion()
	 * @see #getGuia()
	 * @generated
	 */
	EReference getGuia_Orientacion();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getSuTipo <em>Su Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Su Tipo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getSuTipo()
	 * @see #getGuia()
	 * @generated
	 */
	EReference getGuia_SuTipo();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo <em>Lista Chequeo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lista Chequeo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo
	 * @generated
	 */
	EClass getListaChequeo();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orientacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getOrientacion()
	 * @see #getListaChequeo()
	 * @generated
	 */
	EReference getListaChequeo_Orientacion();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getSuTipo <em>Su Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Su Tipo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getSuTipo()
	 * @see #getListaChequeo()
	 * @generated
	 */
	EReference getListaChequeo_SuTipo();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido <em>Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenido</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Contenido
	 * @generated
	 */
	EClass getContenido();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuItem <em>Su Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Su Item</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuItem()
	 * @see #getContenido()
	 * @generated
	 */
	EReference getContenido_SuItem();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Su Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Contenido#getSuDocumento()
	 * @see #getContenido()
	 * @generated
	 */
	EReference getContenido_SuDocumento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento <em>Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento
	 * @generated
	 */
	EClass getTipoDocumento();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orientacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getOrientacion()
	 * @see #getTipoDocumento()
	 * @generated
	 */
	EReference getTipoDocumento_Orientacion();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getLista <em>Lista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lista</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getLista()
	 * @see #getTipoDocumento()
	 * @generated
	 */
	EReference getTipoDocumento_Lista();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getGuia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getGuia()
	 * @see #getTipoDocumento()
	 * @generated
	 */
	EReference getTipoDocumento_Guia();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getPlantilla <em>Plantilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plantilla</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getPlantilla()
	 * @see #getTipoDocumento()
	 * @generated
	 */
	EReference getTipoDocumento_Plantilla();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getTheDocumento <em>The Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>The Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getTheDocumento()
	 * @see #getTipoDocumento()
	 * @generated
	 */
	EReference getTipoDocumento_TheDocumento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia
	 * @generated
	 */
	EClass getCopia();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getCopias <em>Copias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Copias</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getCopias()
	 * @see #getCopia()
	 * @generated
	 */
	EReference getCopia_Copias();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getFormato <em>Formato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formato</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getFormato()
	 * @see #getCopia()
	 * @generated
	 */
	EAttribute getCopia_Formato();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getConsecutivo <em>Consecutivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consecutivo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getConsecutivo()
	 * @see #getCopia()
	 * @generated
	 */
	EAttribute getCopia_Consecutivo();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getDeposito <em>Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deposito</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getDeposito()
	 * @see #getCopia()
	 * @generated
	 */
	EReference getCopia_Deposito();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mensaje</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getMensaje()
	 * @see #getCopia()
	 * @generated
	 */
	EReference getCopia_Mensaje();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getProducto()
	 * @see #getCopia()
	 * @generated
	 */
	EReference getCopia_Producto();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getUnidadOrganizacional()
	 * @see #getCopia()
	 * @generated
	 */
	EReference getCopia_UnidadOrganizacional();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Doc</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDoc()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Doc();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDescripcion()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getCuenta <em>Cuenta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cuenta</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getCuenta()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Cuenta();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getFormato <em>Formato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formato</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getFormato()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Formato();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Su Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getSuDocumento()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_SuDocumento();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getBase()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Base();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDerivadas <em>Derivadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivadas</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Version#getDerivadas()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Derivadas();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Entry</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry
	 * @generated
	 */
	EClass getIndexEntry();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Su Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuDocumento()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_SuDocumento();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Indice</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getIndice()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_Indice();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuElemento <em>Su Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Su Elemento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuElemento()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_SuElemento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave <em>Palabra Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palabra Clave</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave
	 * @generated
	 */
	EClass getPalabraClave();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Glosario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getGlosario()
	 * @see #getPalabraClave()
	 * @generated
	 */
	EReference getPalabraClave_Glosario();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave#getDocumento()
	 * @see #getPalabraClave()
	 * @generated
	 */
	EReference getPalabraClave_Documento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getTexto()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Texto();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getHInt <em>HInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HInt</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getHInt()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_HInt();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuContenido <em>Su Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Su Contenido</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuContenido()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_SuContenido();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Su Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getSuDocumento()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_SuDocumento();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Item#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Baseline</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Item#getBaseline()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Baseline();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baseline</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Baseline
	 * @generated
	 */
	EClass getBaseline();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuDocumento <em>Su Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Su Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuDocumento()
	 * @see #getBaseline()
	 * @generated
	 */
	EReference getBaseline_SuDocumento();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuItem <em>Su Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Su Item</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Baseline#getSuItem()
	 * @see #getBaseline()
	 * @generated
	 */
	EReference getBaseline_SuItem();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indice</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Indice
	 * @generated
	 */
	EClass getIndice();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getData_View()
	 * @see #getIndice()
	 * @generated
	 */
	EReference getIndice_Data_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indice</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getIndice()
	 * @see #getIndice()
	 * @generated
	 */
	EReference getIndice_Indice();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Doc</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDoc()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Doc();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getUbicacion <em>Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ubicacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getUbicacion()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Ubicacion();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getDocumento()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Documento();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Copia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getCopia()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Copia();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mensaje</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje
	 * @generated
	 */
	EClass getMensaje();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getDistribucion <em>Distribucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Distribucion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getDistribucion()
	 * @see #getMensaje()
	 * @generated
	 */
	EReference getMensaje_Distribucion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getAsunto <em>Asunto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asunto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getAsunto()
	 * @see #getMensaje()
	 * @generated
	 */
	EAttribute getMensaje_Asunto();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mensaje</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getMensaje()
	 * @see #getMensaje()
	 * @generated
	 */
	EAttribute getMensaje_Mensaje();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getCopia()
	 * @see #getMensaje()
	 * @generated
	 */
	EReference getMensaje_Copia();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getContacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contacto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getContacto()
	 * @see #getMensaje()
	 * @generated
	 */
	EReference getMensaje_Contacto();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fecha</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getFecha()
	 * @see #getMensaje()
	 * @generated
	 */
	EReference getMensaje_Fecha();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glosario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Glosario
	 * @generated
	 */
	EClass getGlosario();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getData_View()
	 * @see #getGlosario()
	 * @generated
	 */
	EReference getGlosario_Data_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getPalabraClave <em>Palabra Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Palabra Clave</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getPalabraClave()
	 * @see #getGlosario()
	 * @generated
	 */
	EReference getGlosario_PalabraClave();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Libreria <em>Libreria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libreria</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Libreria
	 * @generated
	 */
	EClass getLibreria();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getData_View()
	 * @see #getLibreria()
	 * @generated
	 */
	EReference getLibreria_Data_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getDoc()
	 * @see #getLibreria()
	 * @generated
	 */
	EReference getLibreria_Doc();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion <em>Distribucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribucion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion
	 * @generated
	 */
	EClass getDistribucion();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mensaje</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getMensaje()
	 * @see #getDistribucion()
	 * @generated
	 */
	EReference getDistribucion_Mensaje();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getData_View()
	 * @see #getDistribucion()
	 * @generated
	 */
	EReference getDistribucion_Data_View();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion
	 * @generated
	 */
	EClass getOrientacion();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getData_View()
	 * @see #getOrientacion()
	 * @generated
	 */
	EReference getOrientacion_Data_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getPlantilla <em>Plantilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plantilla</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getPlantilla()
	 * @see #getOrientacion()
	 * @generated
	 */
	EReference getOrientacion_Plantilla();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getGuia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getGuia()
	 * @see #getOrientacion()
	 * @generated
	 */
	EReference getOrientacion_Guia();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getListaChequeo <em>Lista Chequeo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Chequeo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getListaChequeo()
	 * @see #getOrientacion()
	 * @generated
	 */
	EReference getOrientacion_ListaChequeo();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getTipoDocumento <em>Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipo Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getTipoDocumento()
	 * @see #getOrientacion()
	 * @generated
	 */
	EReference getOrientacion_TipoDocumento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc
	 * @generated
	 */
	EClass getDoc();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getDocumento()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_Documento();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Producto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getProducto()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_Producto();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getVersion()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_Version();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getLibreria <em>Libreria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Libreria</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Doc#getLibreria()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_Libreria();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias <em>Copias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copias</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copias
	 * @generated
	 */
	EClass getCopias();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getUnidadOrganizacional()
	 * @see #getCopias()
	 * @generated
	 */
	EReference getCopias_UnidadOrganizacional();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getCopia()
	 * @see #getCopias()
	 * @generated
	 */
	EReference getCopias_Copia();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocmgtFactory getDocmgtFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl <em>Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getDocumento()
		 * @generated
		 */
		EClass DOCUMENTO = eINSTANCE.getDocumento();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__DOC = eINSTANCE.getDocumento_Doc();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__DESCRIPCION = eINSTANCE.getDocumento_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TITULO = eINSTANCE.getDocumento_Titulo();

		/**
		 * The meta object literal for the '<em><b>Edicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__EDICION = eINSTANCE.getDocumento_Edicion();

		/**
		 * The meta object literal for the '<em><b>Vigencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__VIGENCIA = eINSTANCE.getDocumento_Vigencia();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__ESTADO = eINSTANCE.getDocumento_Estado();

		/**
		 * The meta object literal for the '<em><b>Su Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__SU_VERSION = eINSTANCE.getDocumento_SuVersion();

		/**
		 * The meta object literal for the '<em><b>Contexto Documento</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__CONTEXTO_DOCUMENTO = eINSTANCE.getDocumento_ContextoDocumento();

		/**
		 * The meta object literal for the '<em><b>Palabra Clave</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__PALABRA_CLAVE = eINSTANCE.getDocumento_PalabraClave();

		/**
		 * The meta object literal for the '<em><b>Su Contenido</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__SU_CONTENIDO = eINSTANCE.getDocumento_SuContenido();

		/**
		 * The meta object literal for the '<em><b>Su Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__SU_ITEM = eINSTANCE.getDocumento_SuItem();

		/**
		 * The meta object literal for the '<em><b>Derivadas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__DERIVADAS = eINSTANCE.getDocumento_Derivadas();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__BASE = eINSTANCE.getDocumento_Base();

		/**
		 * The meta object literal for the '<em><b>Su Baseline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__SU_BASELINE = eINSTANCE.getDocumento_SuBaseline();

		/**
		 * The meta object literal for the '<em><b>The Tipo Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__THE_TIPO_DOCUMENTO = eINSTANCE.getDocumento_TheTipoDocumento();

		/**
		 * The meta object literal for the '<em><b>Producto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__PRODUCTO = eINSTANCE.getDocumento_Producto();

		/**
		 * The meta object literal for the '<em><b>The Rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__THE_ROL = eINSTANCE.getDocumento_TheRol();

		/**
		 * The meta object literal for the '<em><b>Asociado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__ASOCIADO = eINSTANCE.getDocumento_Asociado();

		/**
		 * The meta object literal for the '<em><b>Tabla Retencion Documental</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__TABLA_RETENCION_DOCUMENTAL = eINSTANCE.getDocumento_TablaRetencionDocumental();

		/**
		 * The meta object literal for the '<em><b>Expediente</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__EXPEDIENTE = eINSTANCE.getDocumento_Expediente();

		/**
		 * The meta object literal for the '<em><b>Observacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__OBSERVACION = eINSTANCE.getDocumento_Observacion();

		/**
		 * The meta object literal for the '<em><b>Anexo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__ANEXO = eINSTANCE.getDocumento_Anexo();

		/**
		 * The meta object literal for the '<em><b>Registrar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENTO___REGISTRAR = eINSTANCE.getDocumento__Registrar();

		/**
		 * The meta object literal for the '<em><b>Aprobar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENTO___APROBAR = eINSTANCE.getDocumento__Aprobar();

		/**
		 * The meta object literal for the '<em><b>Expirar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENTO___EXPIRAR = eINSTANCE.getDocumento__Expirar();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.PlantillaImpl <em>Plantilla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.PlantillaImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getPlantilla()
		 * @generated
		 */
		EClass PLANTILLA = eINSTANCE.getPlantilla();

		/**
		 * The meta object literal for the '<em><b>Orientacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTILLA__ORIENTACION = eINSTANCE.getPlantilla_Orientacion();

		/**
		 * The meta object literal for the '<em><b>Su Tipo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTILLA__SU_TIPO = eINSTANCE.getPlantilla_SuTipo();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.GuiaImpl <em>Guia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.GuiaImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getGuia()
		 * @generated
		 */
		EClass GUIA = eINSTANCE.getGuia();

		/**
		 * The meta object literal for the '<em><b>Orientacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUIA__ORIENTACION = eINSTANCE.getGuia_Orientacion();

		/**
		 * The meta object literal for the '<em><b>Su Tipo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUIA__SU_TIPO = eINSTANCE.getGuia_SuTipo();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ListaChequeoImpl <em>Lista Chequeo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ListaChequeoImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getListaChequeo()
		 * @generated
		 */
		EClass LISTA_CHEQUEO = eINSTANCE.getListaChequeo();

		/**
		 * The meta object literal for the '<em><b>Orientacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTA_CHEQUEO__ORIENTACION = eINSTANCE.getListaChequeo_Orientacion();

		/**
		 * The meta object literal for the '<em><b>Su Tipo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTA_CHEQUEO__SU_TIPO = eINSTANCE.getListaChequeo_SuTipo();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ContenidoImpl <em>Contenido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ContenidoImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getContenido()
		 * @generated
		 */
		EClass CONTENIDO = eINSTANCE.getContenido();

		/**
		 * The meta object literal for the '<em><b>Su Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENIDO__SU_ITEM = eINSTANCE.getContenido_SuItem();

		/**
		 * The meta object literal for the '<em><b>Su Documento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENIDO__SU_DOCUMENTO = eINSTANCE.getContenido_SuDocumento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl <em>Tipo Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getTipoDocumento()
		 * @generated
		 */
		EClass TIPO_DOCUMENTO = eINSTANCE.getTipoDocumento();

		/**
		 * The meta object literal for the '<em><b>Orientacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_DOCUMENTO__ORIENTACION = eINSTANCE.getTipoDocumento_Orientacion();

		/**
		 * The meta object literal for the '<em><b>Lista</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_DOCUMENTO__LISTA = eINSTANCE.getTipoDocumento_Lista();

		/**
		 * The meta object literal for the '<em><b>Guia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_DOCUMENTO__GUIA = eINSTANCE.getTipoDocumento_Guia();

		/**
		 * The meta object literal for the '<em><b>Plantilla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_DOCUMENTO__PLANTILLA = eINSTANCE.getTipoDocumento_Plantilla();

		/**
		 * The meta object literal for the '<em><b>The Documento</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_DOCUMENTO__THE_DOCUMENTO = eINSTANCE.getTipoDocumento_TheDocumento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl <em>Copia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getCopia()
		 * @generated
		 */
		EClass COPIA = eINSTANCE.getCopia();

		/**
		 * The meta object literal for the '<em><b>Copias</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIA__COPIAS = eINSTANCE.getCopia_Copias();

		/**
		 * The meta object literal for the '<em><b>Formato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPIA__FORMATO = eINSTANCE.getCopia_Formato();

		/**
		 * The meta object literal for the '<em><b>Consecutivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPIA__CONSECUTIVO = eINSTANCE.getCopia_Consecutivo();

		/**
		 * The meta object literal for the '<em><b>Deposito</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIA__DEPOSITO = eINSTANCE.getCopia_Deposito();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIA__MENSAJE = eINSTANCE.getCopia_Mensaje();

		/**
		 * The meta object literal for the '<em><b>Producto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIA__PRODUCTO = eINSTANCE.getCopia_Producto();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIA__UNIDAD_ORGANIZACIONAL = eINSTANCE.getCopia_UnidadOrganizacional();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__DOC = eINSTANCE.getVersion_Doc();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DESCRIPCION = eINSTANCE.getVersion_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Cuenta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__CUENTA = eINSTANCE.getVersion_Cuenta();

		/**
		 * The meta object literal for the '<em><b>Formato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__FORMATO = eINSTANCE.getVersion_Formato();

		/**
		 * The meta object literal for the '<em><b>Su Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__SU_DOCUMENTO = eINSTANCE.getVersion_SuDocumento();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__BASE = eINSTANCE.getVersion_Base();

		/**
		 * The meta object literal for the '<em><b>Derivadas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__DERIVADAS = eINSTANCE.getVersion_Derivadas();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndexEntryImpl <em>Index Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndexEntryImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getIndexEntry()
		 * @generated
		 */
		EClass INDEX_ENTRY = eINSTANCE.getIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Su Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ENTRY__SU_DOCUMENTO = eINSTANCE.getIndexEntry_SuDocumento();

		/**
		 * The meta object literal for the '<em><b>Indice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ENTRY__INDICE = eINSTANCE.getIndexEntry_Indice();

		/**
		 * The meta object literal for the '<em><b>Su Elemento</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ENTRY__SU_ELEMENTO = eINSTANCE.getIndexEntry_SuElemento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.PalabraClaveImpl <em>Palabra Clave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.PalabraClaveImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getPalabraClave()
		 * @generated
		 */
		EClass PALABRA_CLAVE = eINSTANCE.getPalabraClave();

		/**
		 * The meta object literal for the '<em><b>Glosario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALABRA_CLAVE__GLOSARIO = eINSTANCE.getPalabraClave_Glosario();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALABRA_CLAVE__DOCUMENTO = eINSTANCE.getPalabraClave_Documento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TEXTO = eINSTANCE.getItem_Texto();

		/**
		 * The meta object literal for the '<em><b>HInt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__HINT = eINSTANCE.getItem_HInt();

		/**
		 * The meta object literal for the '<em><b>Su Contenido</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__SU_CONTENIDO = eINSTANCE.getItem_SuContenido();

		/**
		 * The meta object literal for the '<em><b>Su Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__SU_DOCUMENTO = eINSTANCE.getItem_SuDocumento();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__BASELINE = eINSTANCE.getItem_Baseline();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.BaselineImpl <em>Baseline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.BaselineImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getBaseline()
		 * @generated
		 */
		EClass BASELINE = eINSTANCE.getBaseline();

		/**
		 * The meta object literal for the '<em><b>Su Documento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE__SU_DOCUMENTO = eINSTANCE.getBaseline_SuDocumento();

		/**
		 * The meta object literal for the '<em><b>Su Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE__SU_ITEM = eINSTANCE.getBaseline_SuItem();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndiceImpl <em>Indice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndiceImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getIndice()
		 * @generated
		 */
		EClass INDICE = eINSTANCE.getIndice();

		/**
		 * The meta object literal for the '<em><b>Data View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDICE__DATA_VIEW = eINSTANCE.getIndice_Data_View();

		/**
		 * The meta object literal for the '<em><b>Indice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDICE__INDICE = eINSTANCE.getIndice_Indice();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__DOC = eINSTANCE.getProducto_Doc();

		/**
		 * The meta object literal for the '<em><b>Ubicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__UBICACION = eINSTANCE.getProducto_Ubicacion();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__DOCUMENTO = eINSTANCE.getProducto_Documento();

		/**
		 * The meta object literal for the '<em><b>Copia</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__COPIA = eINSTANCE.getProducto_Copia();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl <em>Mensaje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getMensaje()
		 * @generated
		 */
		EClass MENSAJE = eINSTANCE.getMensaje();

		/**
		 * The meta object literal for the '<em><b>Distribucion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENSAJE__DISTRIBUCION = eINSTANCE.getMensaje_Distribucion();

		/**
		 * The meta object literal for the '<em><b>Asunto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENSAJE__ASUNTO = eINSTANCE.getMensaje_Asunto();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENSAJE__MENSAJE = eINSTANCE.getMensaje_Mensaje();

		/**
		 * The meta object literal for the '<em><b>Copia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENSAJE__COPIA = eINSTANCE.getMensaje_Copia();

		/**
		 * The meta object literal for the '<em><b>Contacto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENSAJE__CONTACTO = eINSTANCE.getMensaje_Contacto();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENSAJE__FECHA = eINSTANCE.getMensaje_Fecha();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.GlosarioImpl <em>Glosario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.GlosarioImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getGlosario()
		 * @generated
		 */
		EClass GLOSARIO = eINSTANCE.getGlosario();

		/**
		 * The meta object literal for the '<em><b>Data View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSARIO__DATA_VIEW = eINSTANCE.getGlosario_Data_View();

		/**
		 * The meta object literal for the '<em><b>Palabra Clave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSARIO__PALABRA_CLAVE = eINSTANCE.getGlosario_PalabraClave();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.LibreriaImpl <em>Libreria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.LibreriaImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getLibreria()
		 * @generated
		 */
		EClass LIBRERIA = eINSTANCE.getLibreria();

		/**
		 * The meta object literal for the '<em><b>Data View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA__DATA_VIEW = eINSTANCE.getLibreria_Data_View();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA__DOC = eINSTANCE.getLibreria_Doc();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DistribucionImpl <em>Distribucion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DistribucionImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getDistribucion()
		 * @generated
		 */
		EClass DISTRIBUCION = eINSTANCE.getDistribucion();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUCION__MENSAJE = eINSTANCE.getDistribucion_Mensaje();

		/**
		 * The meta object literal for the '<em><b>Data View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUCION__DATA_VIEW = eINSTANCE.getDistribucion_Data_View();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl <em>Orientacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getOrientacion()
		 * @generated
		 */
		EClass ORIENTACION = eINSTANCE.getOrientacion();

		/**
		 * The meta object literal for the '<em><b>Data View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIENTACION__DATA_VIEW = eINSTANCE.getOrientacion_Data_View();

		/**
		 * The meta object literal for the '<em><b>Plantilla</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIENTACION__PLANTILLA = eINSTANCE.getOrientacion_Plantilla();

		/**
		 * The meta object literal for the '<em><b>Guia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIENTACION__GUIA = eINSTANCE.getOrientacion_Guia();

		/**
		 * The meta object literal for the '<em><b>Lista Chequeo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIENTACION__LISTA_CHEQUEO = eINSTANCE.getOrientacion_ListaChequeo();

		/**
		 * The meta object literal for the '<em><b>Tipo Documento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIENTACION__TIPO_DOCUMENTO = eINSTANCE.getOrientacion_TipoDocumento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl <em>Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getDoc()
		 * @generated
		 */
		EClass DOC = eINSTANCE.getDoc();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__DOCUMENTO = eINSTANCE.getDoc_Documento();

		/**
		 * The meta object literal for the '<em><b>Producto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__PRODUCTO = eINSTANCE.getDoc_Producto();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__VERSION = eINSTANCE.getDoc_Version();

		/**
		 * The meta object literal for the '<em><b>Libreria</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__LIBRERIA = eINSTANCE.getDoc_Libreria();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiasImpl <em>Copias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiasImpl
		 * @see gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl#getCopias()
		 * @generated
		 */
		EClass COPIAS = eINSTANCE.getCopias();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIAS__UNIDAD_ORGANIZACIONAL = eINSTANCE.getCopias_UnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Copia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIAS__COPIA = eINSTANCE.getCopias_Copia();

	}

} //DocmgtPackage
