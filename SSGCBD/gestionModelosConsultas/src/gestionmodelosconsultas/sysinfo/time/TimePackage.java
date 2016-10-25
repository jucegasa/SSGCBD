/**
 */
package gestionmodelosconsultas.sysinfo.time;

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
 * @see gestionmodelosconsultas.sysinfo.time.TimeFactory
 * @model kind="package"
 * @generated
 */
public interface TimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "time";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/time.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.time";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimePackage eINSTANCE = gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.time.impl.Time_ViewImpl <em>Time View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.time.impl.Time_ViewImpl
	 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getTime_View()
	 * @generated
	 */
	int TIME_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Agenda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW__AGENDA = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VIEW_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.time.impl.FechaImpl <em>Fecha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.time.impl.FechaImpl
	 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getFecha()
	 * @generated
	 */
	int FECHA = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Dia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__DIA = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__MES = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__ANO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Calendario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__CALENDARIO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__MENSAJE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fecha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Fecha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl <em>Calendario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl
	 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getCalendario()
	 * @generated
	 */
	int CALENDARIO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARIO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARIO__FECHA = 1;

	/**
	 * The feature id for the '<em><b>Agenda</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARIO__AGENDA = 2;

	/**
	 * The feature id for the '<em><b>Su Calendario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARIO__SU_CALENDARIO = 3;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARIO__PLAN = 4;

	/**
	 * The number of structural features of the '<em>Calendario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARIO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Calendario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.time.impl.AgendaImpl <em>Agenda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.time.impl.AgendaImpl
	 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getAgenda()
	 * @generated
	 */
	int AGENDA = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Time View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__TIME_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calendario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__CALENDARIO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.time.Time_View <em>Time View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Time_View
	 * @generated
	 */
	EClass getTime_View();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.time.Time_View#getAgenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agenda</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Time_View#getAgenda()
	 * @see #getTime_View()
	 * @generated
	 */
	EReference getTime_View_Agenda();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.time.Fecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fecha</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha
	 * @generated
	 */
	EClass getFecha();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getDia <em>Dia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha#getDia()
	 * @see #getFecha()
	 * @generated
	 */
	EAttribute getFecha_Dia();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getMes <em>Mes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mes</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha#getMes()
	 * @see #getFecha()
	 * @generated
	 */
	EAttribute getFecha_Mes();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getAno <em>Ano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ano</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha#getAno()
	 * @see #getFecha()
	 * @generated
	 */
	EAttribute getFecha_Ano();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getCalendario <em>Calendario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Calendario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha#getCalendario()
	 * @see #getFecha()
	 * @generated
	 */
	EReference getFecha_Calendario();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.time.Fecha#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mensaje</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Fecha#getMensaje()
	 * @see #getFecha()
	 * @generated
	 */
	EReference getFecha_Mensaje();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.time.Calendario <em>Calendario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario
	 * @generated
	 */
	EClass getCalendario();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getNombre()
	 * @see #getCalendario()
	 * @generated
	 */
	EAttribute getCalendario_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fecha</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getFecha()
	 * @see #getCalendario()
	 * @generated
	 */
	EReference getCalendario_Fecha();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getAgenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Agenda</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getAgenda()
	 * @see #getCalendario()
	 * @generated
	 */
	EReference getCalendario_Agenda();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getSuCalendario <em>Su Calendario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Su Calendario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getSuCalendario()
	 * @see #getCalendario()
	 * @generated
	 */
	EReference getCalendario_SuCalendario();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.time.Calendario#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Plan</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Calendario#getPlan()
	 * @see #getCalendario()
	 * @generated
	 */
	EReference getCalendario_Plan();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.time.Agenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agenda</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Agenda
	 * @generated
	 */
	EClass getAgenda();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.time.Agenda#getTime_View <em>Time View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Time View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Agenda#getTime_View()
	 * @see #getAgenda()
	 * @generated
	 */
	EReference getAgenda_Time_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.time.Agenda#getCalendario <em>Calendario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.time.Agenda#getCalendario()
	 * @see #getAgenda()
	 * @generated
	 */
	EReference getAgenda_Calendario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeFactory getTimeFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.time.impl.Time_ViewImpl <em>Time View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.time.impl.Time_ViewImpl
		 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getTime_View()
		 * @generated
		 */
		EClass TIME_VIEW = eINSTANCE.getTime_View();

		/**
		 * The meta object literal for the '<em><b>Agenda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_VIEW__AGENDA = eINSTANCE.getTime_View_Agenda();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.time.impl.FechaImpl <em>Fecha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.time.impl.FechaImpl
		 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getFecha()
		 * @generated
		 */
		EClass FECHA = eINSTANCE.getFecha();

		/**
		 * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FECHA__DIA = eINSTANCE.getFecha_Dia();

		/**
		 * The meta object literal for the '<em><b>Mes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FECHA__MES = eINSTANCE.getFecha_Mes();

		/**
		 * The meta object literal for the '<em><b>Ano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FECHA__ANO = eINSTANCE.getFecha_Ano();

		/**
		 * The meta object literal for the '<em><b>Calendario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FECHA__CALENDARIO = eINSTANCE.getFecha_Calendario();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FECHA__MENSAJE = eINSTANCE.getFecha_Mensaje();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl <em>Calendario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.time.impl.CalendarioImpl
		 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getCalendario()
		 * @generated
		 */
		EClass CALENDARIO = eINSTANCE.getCalendario();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDARIO__NOMBRE = eINSTANCE.getCalendario_Nombre();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARIO__FECHA = eINSTANCE.getCalendario_Fecha();

		/**
		 * The meta object literal for the '<em><b>Agenda</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARIO__AGENDA = eINSTANCE.getCalendario_Agenda();

		/**
		 * The meta object literal for the '<em><b>Su Calendario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARIO__SU_CALENDARIO = eINSTANCE.getCalendario_SuCalendario();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARIO__PLAN = eINSTANCE.getCalendario_Plan();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.time.impl.AgendaImpl <em>Agenda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.time.impl.AgendaImpl
		 * @see gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl#getAgenda()
		 * @generated
		 */
		EClass AGENDA = eINSTANCE.getAgenda();

		/**
		 * The meta object literal for the '<em><b>Time View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA__TIME_VIEW = eINSTANCE.getAgenda_Time_View();

		/**
		 * The meta object literal for the '<em><b>Calendario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA__CALENDARIO = eINSTANCE.getAgenda_Calendario();

	}

} //TimePackage
