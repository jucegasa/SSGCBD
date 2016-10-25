/**
 */
package gestionmodelosconsultas.sysinfo.network;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

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
 * @see gestionmodelosconsultas.sysinfo.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "network";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/network.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.network";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkPackage eINSTANCE = gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl <em>Deposito</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl
	 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getDeposito()
	 * @generated
	 */
	int DEPOSITO = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__DEPOSITOS = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__COPIA = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Su Deposito</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__SU_DEPOSITO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__CONTAINER = SysinfoPackage.PAQUETE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO__UNIDAD_ORGANIZACIONAL = SysinfoPackage.PAQUETE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Deposito</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Deposito</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITO_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.network.impl.DiscoImpl <em>Disco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.network.impl.DiscoImpl
	 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getDisco()
	 * @generated
	 */
	int DISCO = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__OWNER = DEPOSITO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__CONTEXTO = DEPOSITO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__NOMBRE = DEPOSITO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__FROM = DEPOSITO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__TO = DEPOSITO__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__TIPO = DEPOSITO__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__ELEMENT = DEPOSITO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__DEPOSITOS = DEPOSITO__DEPOSITOS;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__COPIA = DEPOSITO__COPIA;

	/**
	 * The feature id for the '<em><b>Su Deposito</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__SU_DEPOSITO = DEPOSITO__SU_DEPOSITO;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__CONTAINER = DEPOSITO__CONTAINER;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__UNIDAD_ORGANIZACIONAL = DEPOSITO__UNIDAD_ORGANIZACIONAL;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__REFERENCIA = DEPOSITO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_FEATURE_COUNT = DEPOSITO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_OPERATION_COUNT = DEPOSITO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.network.impl.ArmarioImpl <em>Armario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.network.impl.ArmarioImpl
	 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getArmario()
	 * @generated
	 */
	int ARMARIO = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__OWNER = DEPOSITO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__CONTEXTO = DEPOSITO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__NOMBRE = DEPOSITO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__FROM = DEPOSITO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__TO = DEPOSITO__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__TIPO = DEPOSITO__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__ELEMENT = DEPOSITO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__DEPOSITOS = DEPOSITO__DEPOSITOS;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__COPIA = DEPOSITO__COPIA;

	/**
	 * The feature id for the '<em><b>Su Deposito</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__SU_DEPOSITO = DEPOSITO__SU_DEPOSITO;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__CONTAINER = DEPOSITO__CONTAINER;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO__UNIDAD_ORGANIZACIONAL = DEPOSITO__UNIDAD_ORGANIZACIONAL;

	/**
	 * The number of structural features of the '<em>Armario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO_FEATURE_COUNT = DEPOSITO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Armario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMARIO_OPERATION_COUNT = DEPOSITO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.network.impl.Network_ViewImpl <em>Network View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.network.impl.Network_ViewImpl
	 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getNetwork_View()
	 * @generated
	 */
	int NETWORK_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Edificio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW__EDIFICIO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_VIEW_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.network.impl.EdificioImpl <em>Edificio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.network.impl.EdificioImpl
	 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getEdificio()
	 * @generated
	 */
	int EDIFICIO = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__UNIDAD_ORGANIZACIONAL = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO__NETWORK_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edificio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edificio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIFICIO_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.network.impl.DepositosImpl <em>Depositos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.network.impl.DepositosImpl
	 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getDepositos()
	 * @generated
	 */
	int DEPOSITOS = 5;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOS__UNIDAD_ORGANIZACIONAL = 0;

	/**
	 * The feature id for the '<em><b>Deposito</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOS__DEPOSITO = 1;

	/**
	 * The number of structural features of the '<em>Depositos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Depositos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.network.Disco <em>Disco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disco</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Disco
	 * @generated
	 */
	EClass getDisco();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.network.Disco#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referencia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Disco#getReferencia()
	 * @see #getDisco()
	 * @generated
	 */
	EAttribute getDisco_Referencia();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.network.Armario <em>Armario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armario</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Armario
	 * @generated
	 */
	EClass getArmario();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.network.Deposito <em>Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deposito</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito
	 * @generated
	 */
	EClass getDeposito();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getDepositos <em>Depositos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Depositos</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getDepositos()
	 * @see #getDeposito()
	 * @generated
	 */
	EReference getDeposito_Depositos();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Copia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getCopia()
	 * @see #getDeposito()
	 * @generated
	 */
	EReference getDeposito_Copia();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getSuDeposito <em>Su Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Su Deposito</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getSuDeposito()
	 * @see #getDeposito()
	 * @generated
	 */
	EReference getDeposito_SuDeposito();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getContainer()
	 * @see #getDeposito()
	 * @generated
	 */
	EReference getDeposito_Container();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getUnidadOrganizacional()
	 * @see #getDeposito()
	 * @generated
	 */
	EReference getDeposito_UnidadOrganizacional();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.network.Network_View <em>Network View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Network_View
	 * @generated
	 */
	EClass getNetwork_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.network.Network_View#getEdificio <em>Edificio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edificio</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Network_View#getEdificio()
	 * @see #getNetwork_View()
	 * @generated
	 */
	EReference getNetwork_View_Edificio();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.network.Edificio <em>Edificio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edificio</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Edificio
	 * @generated
	 */
	EClass getEdificio();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.network.Edificio#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Edificio#getUnidadOrganizacional()
	 * @see #getEdificio()
	 * @generated
	 */
	EReference getEdificio_UnidadOrganizacional();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.network.Edificio#getNetwork_View <em>Network View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Edificio#getNetwork_View()
	 * @see #getEdificio()
	 * @generated
	 */
	EReference getEdificio_Network_View();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.network.Depositos <em>Depositos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depositos</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Depositos
	 * @generated
	 */
	EClass getDepositos();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.network.Depositos#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Depositos#getUnidadOrganizacional()
	 * @see #getDepositos()
	 * @generated
	 */
	EReference getDepositos_UnidadOrganizacional();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.network.Depositos#getDeposito <em>Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deposito</em>'.
	 * @see gestionmodelosconsultas.sysinfo.network.Depositos#getDeposito()
	 * @see #getDepositos()
	 * @generated
	 */
	EReference getDepositos_Deposito();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkFactory getNetworkFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.network.impl.DiscoImpl <em>Disco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.network.impl.DiscoImpl
		 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getDisco()
		 * @generated
		 */
		EClass DISCO = eINSTANCE.getDisco();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCO__REFERENCIA = eINSTANCE.getDisco_Referencia();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.network.impl.ArmarioImpl <em>Armario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.network.impl.ArmarioImpl
		 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getArmario()
		 * @generated
		 */
		EClass ARMARIO = eINSTANCE.getArmario();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl <em>Deposito</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.network.impl.DepositoImpl
		 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getDeposito()
		 * @generated
		 */
		EClass DEPOSITO = eINSTANCE.getDeposito();

		/**
		 * The meta object literal for the '<em><b>Depositos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOSITO__DEPOSITOS = eINSTANCE.getDeposito_Depositos();

		/**
		 * The meta object literal for the '<em><b>Copia</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOSITO__COPIA = eINSTANCE.getDeposito_Copia();

		/**
		 * The meta object literal for the '<em><b>Su Deposito</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOSITO__SU_DEPOSITO = eINSTANCE.getDeposito_SuDeposito();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOSITO__CONTAINER = eINSTANCE.getDeposito_Container();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOSITO__UNIDAD_ORGANIZACIONAL = eINSTANCE.getDeposito_UnidadOrganizacional();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.network.impl.Network_ViewImpl <em>Network View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.network.impl.Network_ViewImpl
		 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getNetwork_View()
		 * @generated
		 */
		EClass NETWORK_VIEW = eINSTANCE.getNetwork_View();

		/**
		 * The meta object literal for the '<em><b>Edificio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_VIEW__EDIFICIO = eINSTANCE.getNetwork_View_Edificio();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.network.impl.EdificioImpl <em>Edificio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.network.impl.EdificioImpl
		 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getEdificio()
		 * @generated
		 */
		EClass EDIFICIO = eINSTANCE.getEdificio();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIFICIO__UNIDAD_ORGANIZACIONAL = eINSTANCE.getEdificio_UnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Network View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIFICIO__NETWORK_VIEW = eINSTANCE.getEdificio_Network_View();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.network.impl.DepositosImpl <em>Depositos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.network.impl.DepositosImpl
		 * @see gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl#getDepositos()
		 * @generated
		 */
		EClass DEPOSITOS = eINSTANCE.getDepositos();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOSITOS__UNIDAD_ORGANIZACIONAL = eINSTANCE.getDepositos_UnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Deposito</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOSITOS__DEPOSITO = eINSTANCE.getDepositos_Deposito();

	}

} //NetworkPackage
