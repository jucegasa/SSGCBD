/**
 */
package gestionmodelosconsultas.sysinfo.function;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

import gestionmodelosconsultas.sysinfo.core.CorePackage;

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
 * @see gestionmodelosconsultas.sysinfo.function.FunctionFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "function";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/function.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.function";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionPackage eINSTANCE = gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.function.impl.Function_ViewImpl <em>Function View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.function.impl.Function_ViewImpl
	 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getFunction_View()
	 * @generated
	 */
	int FUNCTION_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Function View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VIEW_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl <em>Actividad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl
	 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getActividad()
	 * @generated
	 */
	int ACTIVIDAD = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__DESCRIPCION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__ESTADO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ejecutantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__EJECUTANTES = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instancia Proceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__INSTANCIA_PROCESO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Genera</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__GENERA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl <em>Instancia Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl
	 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getInstanciaProceso()
	 * @generated
	 */
	int INSTANCIA_PROCESO = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__DESCRIPCION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__ACTIVIDADES = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actor Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__ACTOR_RESPONSABLE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instancia Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Instancia Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.function.impl.ProcesoImpl <em>Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.function.impl.ProcesoImpl
	 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getProceso()
	 * @generated
	 */
	int PROCESO = 3;

	/**
	 * The number of structural features of the '<em>Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.function.Function_View <em>Function View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Function_View
	 * @generated
	 */
	EClass getFunction_View();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.function.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad
	 * @generated
	 */
	EClass getActividad();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getDescripcion()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getEstado()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Estado();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getEjecutantes <em>Ejecutantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ejecutantes</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getEjecutantes()
	 * @see #getActividad()
	 * @generated
	 */
	EReference getActividad_Ejecutantes();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getInstanciaProceso <em>Instancia Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Instancia Proceso</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getInstanciaProceso()
	 * @see #getActividad()
	 * @generated
	 */
	EReference getActividad_InstanciaProceso();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.function.Actividad#getGenera <em>Genera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Genera</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Actividad#getGenera()
	 * @see #getActividad()
	 * @generated
	 */
	EReference getActividad_Genera();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso <em>Instancia Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancia Proceso</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso
	 * @generated
	 */
	EClass getInstanciaProceso();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getDescripcion()
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	EAttribute getInstanciaProceso_Descripcion();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actividades</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActividades()
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	EReference getInstanciaProceso_Actividades();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getUnidadOrganizacional()
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	EReference getInstanciaProceso_UnidadOrganizacional();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActorResponsable <em>Actor Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Responsable</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.InstanciaProceso#getActorResponsable()
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	EReference getInstanciaProceso_ActorResponsable();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.function.Proceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceso</em>'.
	 * @see gestionmodelosconsultas.sysinfo.function.Proceso
	 * @generated
	 */
	EClass getProceso();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionFactory getFunctionFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.function.impl.Function_ViewImpl <em>Function View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.function.impl.Function_ViewImpl
		 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getFunction_View()
		 * @generated
		 */
		EClass FUNCTION_VIEW = eINSTANCE.getFunction_View();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl <em>Actividad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.function.impl.ActividadImpl
		 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getActividad()
		 * @generated
		 */
		EClass ACTIVIDAD = eINSTANCE.getActividad();

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
		 * The meta object literal for the '<em><b>Ejecutantes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD__EJECUTANTES = eINSTANCE.getActividad_Ejecutantes();

		/**
		 * The meta object literal for the '<em><b>Instancia Proceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD__INSTANCIA_PROCESO = eINSTANCE.getActividad_InstanciaProceso();

		/**
		 * The meta object literal for the '<em><b>Genera</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD__GENERA = eINSTANCE.getActividad_Genera();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl <em>Instancia Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.function.impl.InstanciaProcesoImpl
		 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getInstanciaProceso()
		 * @generated
		 */
		EClass INSTANCIA_PROCESO = eINSTANCE.getInstanciaProceso();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCIA_PROCESO__DESCRIPCION = eINSTANCE.getInstanciaProceso_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Actividades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCIA_PROCESO__ACTIVIDADES = eINSTANCE.getInstanciaProceso_Actividades();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCIA_PROCESO__UNIDAD_ORGANIZACIONAL = eINSTANCE.getInstanciaProceso_UnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Actor Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCIA_PROCESO__ACTOR_RESPONSABLE = eINSTANCE.getInstanciaProceso_ActorResponsable();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.function.impl.ProcesoImpl <em>Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.function.impl.ProcesoImpl
		 * @see gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl#getProceso()
		 * @generated
		 */
		EClass PROCESO = eINSTANCE.getProceso();

	}

} //FunctionPackage
