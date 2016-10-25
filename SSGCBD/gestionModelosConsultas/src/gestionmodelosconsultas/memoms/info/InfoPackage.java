/**
 */
package gestionmodelosconsultas.memoms.info;

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
 * @see gestionmodelosconsultas.memoms.info.InfoFactory
 * @model kind="package"
 * @generated
 */
public interface InfoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "info";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/memoms/info.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.memoms.info";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfoPackage eINSTANCE = gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.info.impl.ObservacionImpl <em>Observacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.info.impl.ObservacionImpl
	 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getObservacion()
	 * @generated
	 */
	int OBSERVACION = 0;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVACION__DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Observacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVACION__OBSERVACION = 1;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVACION__CHECK = 2;

	/**
	 * The number of structural features of the '<em>Observacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Observacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.info.impl.ExpedienteImpl <em>Expediente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.info.impl.ExpedienteImpl
	 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getExpediente()
	 * @generated
	 */
	int EXPEDIENTE = 1;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPEDIENTE__DOCUMENTO = 0;

	/**
	 * The number of structural features of the '<em>Expediente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPEDIENTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expediente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPEDIENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.info.impl.AnexoImpl <em>Anexo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.info.impl.AnexoImpl
	 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getAnexo()
	 * @generated
	 */
	int ANEXO = 2;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANEXO__DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANEXO__ID = 1;

	/**
	 * The feature id for the '<em><b>Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANEXO__ARCHIVO = 2;

	/**
	 * The number of structural features of the '<em>Anexo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANEXO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Anexo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANEXO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.info.impl.ActividadImpl <em>Actividad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.info.impl.ActividadImpl
	 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getActividad()
	 * @generated
	 */
	int ACTIVIDAD = 3;

	/**
	 * The feature id for the '<em><b>Memorando</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__MEMORANDO = 0;

	/**
	 * The feature id for the '<em><b>Memo Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__MEMO_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__ID = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__DESCRIPCION = 3;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__ESTADO = 4;

	/**
	 * The number of structural features of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl <em>Tabla Retencion Documental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl
	 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getTablaRetencionDocumental()
	 * @generated
	 */
	int TABLA_RETENCION_DOCUMENTAL = 4;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_RETENCION_DOCUMENTAL__DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Serie Documental</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL = 1;

	/**
	 * The feature id for the '<em><b>Memo Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_RETENCION_DOCUMENTAL__DESCRIPCION = 3;

	/**
	 * The number of structural features of the '<em>Tabla Retencion Documental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_RETENCION_DOCUMENTAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tabla Retencion Documental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_RETENCION_DOCUMENTAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl <em>Serie Documental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl
	 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getSerieDocumental()
	 * @generated
	 */
	int SERIE_DOCUMENTAL = 5;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL = 0;

	/**
	 * The feature id for the '<em><b>Subserie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__SUBSERIE = 1;

	/**
	 * The feature id for the '<em><b>Serie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__SERIE = 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__CODIGO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__NOMBRE = 4;

	/**
	 * The feature id for the '<em><b>Retencion Anios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__RETENCION_ANIOS = 5;

	/**
	 * The feature id for the '<em><b>Disposicion Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__DISPOSICION_FINAL = 6;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL__DESCRIPCION = 7;

	/**
	 * The number of structural features of the '<em>Serie Documental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Serie Documental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_DOCUMENTAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.info.Observacion <em>Observacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observacion</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Observacion
	 * @generated
	 */
	EClass getObservacion();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.memoms.info.Observacion#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Observacion#getDocumento()
	 * @see #getObservacion()
	 * @generated
	 */
	EReference getObservacion_Documento();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.Observacion#getObservacion <em>Observacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observacion</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Observacion#getObservacion()
	 * @see #getObservacion()
	 * @generated
	 */
	EAttribute getObservacion_Observacion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.Observacion#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Observacion#getCheck()
	 * @see #getObservacion()
	 * @generated
	 */
	EAttribute getObservacion_Check();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.info.Expediente <em>Expediente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expediente</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Expediente
	 * @generated
	 */
	EClass getExpediente();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.memoms.info.Expediente#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Expediente#getDocumento()
	 * @see #getExpediente()
	 * @generated
	 */
	EReference getExpediente_Documento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.info.Anexo <em>Anexo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anexo</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Anexo
	 * @generated
	 */
	EClass getAnexo();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.memoms.info.Anexo#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Anexo#getDocumento()
	 * @see #getAnexo()
	 * @generated
	 */
	EReference getAnexo_Documento();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.Anexo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Anexo#getId()
	 * @see #getAnexo()
	 * @generated
	 */
	EAttribute getAnexo_Id();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.Anexo#getArchivo <em>Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archivo</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Anexo#getArchivo()
	 * @see #getAnexo()
	 * @generated
	 */
	EAttribute getAnexo_Archivo();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.info.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Actividad
	 * @generated
	 */
	EClass getActividad();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.memoms.info.Actividad#getMemorando <em>Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memorando</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Actividad#getMemorando()
	 * @see #getActividad()
	 * @generated
	 */
	EReference getActividad_Memorando();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.memoms.info.Actividad#getMemoFactory <em>Memo Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Memo Factory</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Actividad#getMemoFactory()
	 * @see #getActividad()
	 * @generated
	 */
	EReference getActividad_MemoFactory();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.Actividad#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Actividad#getId()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Id();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.Actividad#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Actividad#getDescripcion()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.Actividad#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see gestionmodelosconsultas.memoms.info.Actividad#getEstado()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Estado();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental <em>Tabla Retencion Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla Retencion Documental</em>'.
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental
	 * @generated
	 */
	EClass getTablaRetencionDocumental();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDocumento()
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 */
	EReference getTablaRetencionDocumental_Documento();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getSerieDocumental <em>Serie Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serie Documental</em>'.
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getSerieDocumental()
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 */
	EReference getTablaRetencionDocumental_SerieDocumental();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getMemoFactory <em>Memo Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Memo Factory</em>'.
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getMemoFactory()
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 */
	EReference getTablaRetencionDocumental_MemoFactory();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDescripcion()
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 */
	EAttribute getTablaRetencionDocumental_Descripcion();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.info.SerieDocumental <em>Serie Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serie Documental</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental
	 * @generated
	 */
	EClass getSerieDocumental();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tabla Retencion Documental</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getTablaRetencionDocumental()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EReference getSerieDocumental_TablaRetencionDocumental();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getSubserie <em>Subserie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subserie</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getSubserie()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EReference getSerieDocumental_Subserie();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getSerie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serie</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getSerie()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EReference getSerieDocumental_Serie();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getCodigo()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EAttribute getSerieDocumental_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getNombre()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EAttribute getSerieDocumental_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getRetencionAnios <em>Retencion Anios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retencion Anios</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getRetencionAnios()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EAttribute getSerieDocumental_RetencionAnios();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getDisposicionFinal <em>Disposicion Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposicion Final</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getDisposicionFinal()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EAttribute getSerieDocumental_DisposicionFinal();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getDescripcion()
	 * @see #getSerieDocumental()
	 * @generated
	 */
	EAttribute getSerieDocumental_Descripcion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfoFactory getInfoFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.info.impl.ObservacionImpl <em>Observacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.info.impl.ObservacionImpl
		 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getObservacion()
		 * @generated
		 */
		EClass OBSERVACION = eINSTANCE.getObservacion();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVACION__DOCUMENTO = eINSTANCE.getObservacion_Documento();

		/**
		 * The meta object literal for the '<em><b>Observacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVACION__OBSERVACION = eINSTANCE.getObservacion_Observacion();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVACION__CHECK = eINSTANCE.getObservacion_Check();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.info.impl.ExpedienteImpl <em>Expediente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.info.impl.ExpedienteImpl
		 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getExpediente()
		 * @generated
		 */
		EClass EXPEDIENTE = eINSTANCE.getExpediente();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPEDIENTE__DOCUMENTO = eINSTANCE.getExpediente_Documento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.info.impl.AnexoImpl <em>Anexo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.info.impl.AnexoImpl
		 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getAnexo()
		 * @generated
		 */
		EClass ANEXO = eINSTANCE.getAnexo();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANEXO__DOCUMENTO = eINSTANCE.getAnexo_Documento();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANEXO__ID = eINSTANCE.getAnexo_Id();

		/**
		 * The meta object literal for the '<em><b>Archivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANEXO__ARCHIVO = eINSTANCE.getAnexo_Archivo();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.info.impl.ActividadImpl <em>Actividad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.info.impl.ActividadImpl
		 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getActividad()
		 * @generated
		 */
		EClass ACTIVIDAD = eINSTANCE.getActividad();

		/**
		 * The meta object literal for the '<em><b>Memorando</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD__MEMORANDO = eINSTANCE.getActividad_Memorando();

		/**
		 * The meta object literal for the '<em><b>Memo Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD__MEMO_FACTORY = eINSTANCE.getActividad_MemoFactory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__ID = eINSTANCE.getActividad_Id();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__DESCRIPCION = eINSTANCE.getActividad_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__ESTADO = eINSTANCE.getActividad_Estado();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl <em>Tabla Retencion Documental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl
		 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getTablaRetencionDocumental()
		 * @generated
		 */
		EClass TABLA_RETENCION_DOCUMENTAL = eINSTANCE.getTablaRetencionDocumental();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA_RETENCION_DOCUMENTAL__DOCUMENTO = eINSTANCE.getTablaRetencionDocumental_Documento();

		/**
		 * The meta object literal for the '<em><b>Serie Documental</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL = eINSTANCE.getTablaRetencionDocumental_SerieDocumental();

		/**
		 * The meta object literal for the '<em><b>Memo Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY = eINSTANCE.getTablaRetencionDocumental_MemoFactory();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA_RETENCION_DOCUMENTAL__DESCRIPCION = eINSTANCE.getTablaRetencionDocumental_Descripcion();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl <em>Serie Documental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl
		 * @see gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl#getSerieDocumental()
		 * @generated
		 */
		EClass SERIE_DOCUMENTAL = eINSTANCE.getSerieDocumental();

		/**
		 * The meta object literal for the '<em><b>Tabla Retencion Documental</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL = eINSTANCE.getSerieDocumental_TablaRetencionDocumental();

		/**
		 * The meta object literal for the '<em><b>Subserie</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIE_DOCUMENTAL__SUBSERIE = eINSTANCE.getSerieDocumental_Subserie();

		/**
		 * The meta object literal for the '<em><b>Serie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIE_DOCUMENTAL__SERIE = eINSTANCE.getSerieDocumental_Serie();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE_DOCUMENTAL__CODIGO = eINSTANCE.getSerieDocumental_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE_DOCUMENTAL__NOMBRE = eINSTANCE.getSerieDocumental_Nombre();

		/**
		 * The meta object literal for the '<em><b>Retencion Anios</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE_DOCUMENTAL__RETENCION_ANIOS = eINSTANCE.getSerieDocumental_RetencionAnios();

		/**
		 * The meta object literal for the '<em><b>Disposicion Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE_DOCUMENTAL__DISPOSICION_FINAL = eINSTANCE.getSerieDocumental_DisposicionFinal();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE_DOCUMENTAL__DESCRIPCION = eINSTANCE.getSerieDocumental_Descripcion();

	}

} //InfoPackage
