/**
 */
package gestionmodelosconsultas.modeloconsultas.donde;

import gestionmodelosconsultas.sysinfo.network.NetworkPackage;

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
 * @see gestionmodelosconsultas.modeloconsultas.donde.DondeFactory
 * @model kind="package"
 * @generated
 */
public interface DondePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "donde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/donde.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.donde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DondePackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.donde.impl.DepositoImpl <em>Deposito</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DepositoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl#getDeposito()
	 * @generated
	 */
	int DEPOSITO = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__OWNER = NetworkPackage.DEPOSITO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__CONTEXTO = NetworkPackage.DEPOSITO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__NOMBRE = NetworkPackage.DEPOSITO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__FROM = NetworkPackage.DEPOSITO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__TO = NetworkPackage.DEPOSITO__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__TIPO = NetworkPackage.DEPOSITO__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__ELEMENT = NetworkPackage.DEPOSITO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__DEPOSITOS = NetworkPackage.DEPOSITO__DEPOSITOS;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__COPIA = NetworkPackage.DEPOSITO__COPIA;

	/**
	 * The feature id for the '<em><b>Su Deposito</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__SU_DEPOSITO = NetworkPackage.DEPOSITO__SU_DEPOSITO;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__CONTAINER = NetworkPackage.DEPOSITO__CONTAINER;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__UNIDAD_ORGANIZACIONAL = NetworkPackage.DEPOSITO__UNIDAD_ORGANIZACIONAL;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__ORDER = NetworkPackage.DEPOSITO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__EA_DIAGRAM = NetworkPackage.DEPOSITO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__LIST_CAMPOS = NetworkPackage.DEPOSITO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deposito</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO_FEATURE_COUNT = NetworkPackage.DEPOSITO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Deposito</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO_OPERATION_COUNT = NetworkPackage.DEPOSITO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.donde.impl.DiscoImpl <em>Disco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DiscoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl#getDisco()
	 * @generated
	 */
	int DISCO = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__OWNER = NetworkPackage.DISCO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__CONTEXTO = NetworkPackage.DISCO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__NOMBRE = NetworkPackage.DISCO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__FROM = NetworkPackage.DISCO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__TO = NetworkPackage.DISCO__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__TIPO = NetworkPackage.DISCO__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__ELEMENT = NetworkPackage.DISCO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__DEPOSITOS = NetworkPackage.DISCO__DEPOSITOS;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__COPIA = NetworkPackage.DISCO__COPIA;

	/**
	 * The feature id for the '<em><b>Su Deposito</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__SU_DEPOSITO = NetworkPackage.DISCO__SU_DEPOSITO;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__CONTAINER = NetworkPackage.DISCO__CONTAINER;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__UNIDAD_ORGANIZACIONAL = NetworkPackage.DISCO__UNIDAD_ORGANIZACIONAL;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__REFERENCIA = NetworkPackage.DISCO__REFERENCIA;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__ORDER = NetworkPackage.DISCO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__EA_DIAGRAM = NetworkPackage.DISCO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__LIST_CAMPOS = NetworkPackage.DISCO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Disco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_FEATURE_COUNT = NetworkPackage.DISCO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Disco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_OPERATION_COUNT = NetworkPackage.DISCO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.donde.impl.ArmarioImpl <em>Armario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.ArmarioImpl
	 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl#getArmario()
	 * @generated
	 */
	int ARMARIO = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__OWNER = NetworkPackage.ARMARIO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__CONTEXTO = NetworkPackage.ARMARIO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__NOMBRE = NetworkPackage.ARMARIO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__FROM = NetworkPackage.ARMARIO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__TO = NetworkPackage.ARMARIO__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__TIPO = NetworkPackage.ARMARIO__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__ELEMENT = NetworkPackage.ARMARIO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__DEPOSITOS = NetworkPackage.ARMARIO__DEPOSITOS;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__COPIA = NetworkPackage.ARMARIO__COPIA;

	/**
	 * The feature id for the '<em><b>Su Deposito</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__SU_DEPOSITO = NetworkPackage.ARMARIO__SU_DEPOSITO;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__CONTAINER = NetworkPackage.ARMARIO__CONTAINER;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__UNIDAD_ORGANIZACIONAL = NetworkPackage.ARMARIO__UNIDAD_ORGANIZACIONAL;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__ORDER = NetworkPackage.ARMARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__EA_DIAGRAM = NetworkPackage.ARMARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__LIST_CAMPOS = NetworkPackage.ARMARIO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Armario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO_FEATURE_COUNT = NetworkPackage.ARMARIO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Armario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO_OPERATION_COUNT = NetworkPackage.ARMARIO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.donde.Deposito <em>Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deposito</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.donde.Deposito
	 * @generated
	 */
	EClass getDeposito();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.donde.Disco <em>Disco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disco</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.donde.Disco
	 * @generated
	 */
	EClass getDisco();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.donde.Armario <em>Armario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armario</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.donde.Armario
	 * @generated
	 */
	EClass getArmario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DondeFactory getDondeFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.donde.impl.DepositoImpl <em>Deposito</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DepositoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl#getDeposito()
		 * @generated
		 */
		EClass DEPOSITO = eINSTANCE.getDeposito();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.donde.impl.DiscoImpl <em>Disco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DiscoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl#getDisco()
		 * @generated
		 */
		EClass DISCO = eINSTANCE.getDisco();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.donde.impl.ArmarioImpl <em>Armario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.ArmarioImpl
		 * @see gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl#getArmario()
		 * @generated
		 */
		EClass ARMARIO = eINSTANCE.getArmario();

	}

} //DondePackage
