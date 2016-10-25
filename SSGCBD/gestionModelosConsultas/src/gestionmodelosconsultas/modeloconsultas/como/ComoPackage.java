/**
 */
package gestionmodelosconsultas.modeloconsultas.como;

import gestionmodelosconsultas.sysinfo.function.FunctionPackage;

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
 * @see gestionmodelosconsultas.modeloconsultas.como.ComoFactory
 * @model kind="package"
 * @generated
 */
public interface ComoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "como";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/como.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.como";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComoPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.como.impl.ActividadProcesoImpl <em>Actividad Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.como.impl.ActividadProcesoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl#getActividadProceso()
	 * @generated
	 */
	int ACTIVIDAD_PROCESO = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__OWNER = FunctionPackage.ACTIVIDAD__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__CONTEXTO = FunctionPackage.ACTIVIDAD__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__NOMBRE = FunctionPackage.ACTIVIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__FROM = FunctionPackage.ACTIVIDAD__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__TO = FunctionPackage.ACTIVIDAD__TO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__DESCRIPCION = FunctionPackage.ACTIVIDAD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__ESTADO = FunctionPackage.ACTIVIDAD__ESTADO;

	/**
	 * The feature id for the '<em><b>Ejecutantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__EJECUTANTES = FunctionPackage.ACTIVIDAD__EJECUTANTES;

	/**
	 * The feature id for the '<em><b>Instancia Proceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__INSTANCIA_PROCESO = FunctionPackage.ACTIVIDAD__INSTANCIA_PROCESO;

	/**
	 * The feature id for the '<em><b>Genera</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__GENERA = FunctionPackage.ACTIVIDAD__GENERA;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__ORDER = FunctionPackage.ACTIVIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__EA_DIAGRAM = FunctionPackage.ACTIVIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__LIST_CAMPOS = FunctionPackage.ACTIVIDAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actividad Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO_FEATURE_COUNT = FunctionPackage.ACTIVIDAD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Actividad Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO_OPERATION_COUNT = FunctionPackage.ACTIVIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.como.impl.InstanciaProcesoImpl <em>Instancia Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.como.impl.InstanciaProcesoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl#getInstanciaProceso()
	 * @generated
	 */
	int INSTANCIA_PROCESO = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__OWNER = FunctionPackage.INSTANCIA_PROCESO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__CONTEXTO = FunctionPackage.INSTANCIA_PROCESO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__NOMBRE = FunctionPackage.INSTANCIA_PROCESO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__FROM = FunctionPackage.INSTANCIA_PROCESO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__TO = FunctionPackage.INSTANCIA_PROCESO__TO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__DESCRIPCION = FunctionPackage.INSTANCIA_PROCESO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__ACTIVIDADES = FunctionPackage.INSTANCIA_PROCESO__ACTIVIDADES;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL = FunctionPackage.INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL;

	/**
	 * The feature id for the '<em><b>Actor Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__ACTOR_RESPONSABLE = FunctionPackage.INSTANCIA_PROCESO__ACTOR_RESPONSABLE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__ORDER = FunctionPackage.INSTANCIA_PROCESO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__EA_DIAGRAM = FunctionPackage.INSTANCIA_PROCESO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__LIST_CAMPOS = FunctionPackage.INSTANCIA_PROCESO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instancia Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO_FEATURE_COUNT = FunctionPackage.INSTANCIA_PROCESO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instancia Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO_OPERATION_COUNT = FunctionPackage.INSTANCIA_PROCESO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.como.ActividadProceso <em>Actividad Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Proceso</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.como.ActividadProceso
	 * @generated
	 */
	EClass getActividadProceso();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.como.InstanciaProceso <em>Instancia Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancia Proceso</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.como.InstanciaProceso
	 * @generated
	 */
	EClass getInstanciaProceso();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComoFactory getComoFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.como.impl.ActividadProcesoImpl <em>Actividad Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.como.impl.ActividadProcesoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl#getActividadProceso()
		 * @generated
		 */
		EClass ACTIVIDAD_PROCESO = eINSTANCE.getActividadProceso();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.como.impl.InstanciaProcesoImpl <em>Instancia Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.como.impl.InstanciaProcesoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl#getInstanciaProceso()
		 * @generated
		 */
		EClass INSTANCIA_PROCESO = eINSTANCE.getInstanciaProceso();

	}

} //ComoPackage
