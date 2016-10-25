/**
 */
package gestionmodelosconsultas.sysinfo.data;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

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
 * @see gestionmodelosconsultas.sysinfo.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/data.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = gestionmodelosconsultas.sysinfo.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl <em>Data View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl
	 * @see gestionmodelosconsultas.sysinfo.data.impl.DataPackageImpl#getData_View()
	 * @generated
	 */
	int DATA_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Indice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__INDICE = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libreria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__LIBRERIA = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__ORIENTACION = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Glosario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__GLOSARIO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distribucion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW__DISTRIBUCION = SysinfoPackage.PAQUETE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VIEW_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.data.Data_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View
	 * @generated
	 */
	EClass getData_View();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indice</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getIndice()
	 * @see #getData_View()
	 * @generated
	 */
	EReference getData_View_Indice();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getLibreria <em>Libreria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Libreria</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getLibreria()
	 * @see #getData_View()
	 * @generated
	 */
	EReference getData_View_Libreria();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getOrientacion <em>Orientacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getOrientacion()
	 * @see #getData_View()
	 * @generated
	 */
	EReference getData_View_Orientacion();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glosario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getGlosario()
	 * @see #getData_View()
	 * @generated
	 */
	EReference getData_View_Glosario();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getDistribucion <em>Distribucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribucion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.data.Data_View#getDistribucion()
	 * @see #getData_View()
	 * @generated
	 */
	EReference getData_View_Distribucion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl <em>Data View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl
		 * @see gestionmodelosconsultas.sysinfo.data.impl.DataPackageImpl#getData_View()
		 * @generated
		 */
		EClass DATA_VIEW = eINSTANCE.getData_View();

		/**
		 * The meta object literal for the '<em><b>Indice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VIEW__INDICE = eINSTANCE.getData_View_Indice();

		/**
		 * The meta object literal for the '<em><b>Libreria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VIEW__LIBRERIA = eINSTANCE.getData_View_Libreria();

		/**
		 * The meta object literal for the '<em><b>Orientacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VIEW__ORIENTACION = eINSTANCE.getData_View_Orientacion();

		/**
		 * The meta object literal for the '<em><b>Glosario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VIEW__GLOSARIO = eINSTANCE.getData_View_Glosario();

		/**
		 * The meta object literal for the '<em><b>Distribucion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VIEW__DISTRIBUCION = eINSTANCE.getData_View_Distribucion();

	}

} //DataPackage
