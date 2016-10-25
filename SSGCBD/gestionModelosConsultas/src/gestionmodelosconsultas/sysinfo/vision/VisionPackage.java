/**
 */
package gestionmodelosconsultas.sysinfo.vision;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

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
 * @see gestionmodelosconsultas.sysinfo.vision.VisionFactory
 * @model kind="package"
 * @generated
 */
public interface VisionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vision";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/vision.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.vision";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisionPackage eINSTANCE = gestionmodelosconsultas.sysinfo.vision.impl.VisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.vision.impl.Vision_ViewImpl <em>Vision View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.vision.impl.Vision_ViewImpl
	 * @see gestionmodelosconsultas.sysinfo.vision.impl.VisionPackageImpl#getVision_View()
	 * @generated
	 */
	int VISION_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Vision View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vision View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_VIEW_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.vision.Vision_View <em>Vision View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vision View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.vision.Vision_View
	 * @generated
	 */
	EClass getVision_View();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisionFactory getVisionFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.vision.impl.Vision_ViewImpl <em>Vision View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.vision.impl.Vision_ViewImpl
		 * @see gestionmodelosconsultas.sysinfo.vision.impl.VisionPackageImpl#getVision_View()
		 * @generated
		 */
		EClass VISION_VIEW = eINSTANCE.getVision_View();

	}

} //VisionPackage
