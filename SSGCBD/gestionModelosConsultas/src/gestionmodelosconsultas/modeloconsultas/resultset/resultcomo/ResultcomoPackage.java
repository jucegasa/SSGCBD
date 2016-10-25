/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcomo;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoFactory
 * @model kind="package"
 * @generated
 */
public interface ResultcomoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resultcomo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/resultset/resultcomo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.resultset.resultcomo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultcomoPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.InstanciaProcesoImpl <em>Instancia Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.InstanciaProcesoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoPackageImpl#getInstanciaProceso()
	 * @generated
	 */
	int INSTANCIA_PROCESO = 0;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Id Instancia Proceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__ID_INSTANCIA_PROCESO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__NOMBRE = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO__DESCRIPCION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instancia Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instancia Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCIA_PROCESO_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl <em>Actividad Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoPackageImpl#getActividadProceso()
	 * @generated
	 */
	int ACTIVIDAD_PROCESO = 1;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Id Actividad Proceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__ID_ACTIVIDAD_PROCESO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__NOMBRE = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__DESCRIPCION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__FECHA_INICIO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fecha Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO__FECHA_FIN = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actividad Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Actividad Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_PROCESO_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso <em>Instancia Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancia Proceso</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso
	 * @generated
	 */
	EClass getInstanciaProceso();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso#getIdInstanciaProceso <em>Id Instancia Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Instancia Proceso</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso#getIdInstanciaProceso()
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	EAttribute getInstanciaProceso_IdInstanciaProceso();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso#getNombre()
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	EAttribute getInstanciaProceso_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso#getDescripcion()
	 * @see #getInstanciaProceso()
	 * @generated
	 */
	EAttribute getInstanciaProceso_Descripcion();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso <em>Actividad Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Proceso</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso
	 * @generated
	 */
	EClass getActividadProceso();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getIdActividadProceso <em>Id Actividad Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Actividad Proceso</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getIdActividadProceso()
	 * @see #getActividadProceso()
	 * @generated
	 */
	EAttribute getActividadProceso_IdActividadProceso();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getNombre()
	 * @see #getActividadProceso()
	 * @generated
	 */
	EAttribute getActividadProceso_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getDescripcion()
	 * @see #getActividadProceso()
	 * @generated
	 */
	EAttribute getActividadProceso_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getFechaInicio <em>Fecha Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getFechaInicio()
	 * @see #getActividadProceso()
	 * @generated
	 */
	EAttribute getActividadProceso_FechaInicio();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getFechaFin <em>Fecha Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Fin</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso#getFechaFin()
	 * @see #getActividadProceso()
	 * @generated
	 */
	EAttribute getActividadProceso_FechaFin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultcomoFactory getResultcomoFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.InstanciaProcesoImpl <em>Instancia Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.InstanciaProcesoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoPackageImpl#getInstanciaProceso()
		 * @generated
		 */
		EClass INSTANCIA_PROCESO = eINSTANCE.getInstanciaProceso();

		/**
		 * The meta object literal for the '<em><b>Id Instancia Proceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCIA_PROCESO__ID_INSTANCIA_PROCESO = eINSTANCE.getInstanciaProceso_IdInstanciaProceso();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCIA_PROCESO__NOMBRE = eINSTANCE.getInstanciaProceso_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCIA_PROCESO__DESCRIPCION = eINSTANCE.getInstanciaProceso_Descripcion();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl <em>Actividad Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoPackageImpl#getActividadProceso()
		 * @generated
		 */
		EClass ACTIVIDAD_PROCESO = eINSTANCE.getActividadProceso();

		/**
		 * The meta object literal for the '<em><b>Id Actividad Proceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_PROCESO__ID_ACTIVIDAD_PROCESO = eINSTANCE.getActividadProceso_IdActividadProceso();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_PROCESO__NOMBRE = eINSTANCE.getActividadProceso_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_PROCESO__DESCRIPCION = eINSTANCE.getActividadProceso_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_PROCESO__FECHA_INICIO = eINSTANCE.getActividadProceso_FechaInicio();

		/**
		 * The meta object literal for the '<em><b>Fecha Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_PROCESO__FECHA_FIN = eINSTANCE.getActividadProceso_FechaFin();

	}

} //ResultcomoPackage
