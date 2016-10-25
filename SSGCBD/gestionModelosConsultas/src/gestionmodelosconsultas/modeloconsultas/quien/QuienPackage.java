/**
 */
package gestionmodelosconsultas.modeloconsultas.quien;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import gestionmodelosconsultas.sysinfo.people.PeoplePackage;

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
 * @see gestionmodelosconsultas.modeloconsultas.quien.QuienFactory
 * @model kind="package"
 * @generated
 */
public interface QuienPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quien";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/quien.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.quien";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuienPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl <em>Unidad Organizacional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getUnidadOrganizacional()
	 * @generated
	 */
	int UNIDAD_ORGANIZACIONAL = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__OWNER = PeoplePackage.UNIDAD_ORGANIZACIONAL__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__CONTEXTO = PeoplePackage.UNIDAD_ORGANIZACIONAL__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__NOMBRE = PeoplePackage.UNIDAD_ORGANIZACIONAL__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__FROM = PeoplePackage.UNIDAD_ORGANIZACIONAL__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__TO = PeoplePackage.UNIDAD_ORGANIZACIONAL__TO;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__CONTACTO = PeoplePackage.UNIDAD_ORGANIZACIONAL__CONTACTO;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__THE_DOCUMENTO = PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ROL = PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL;

	/**
	 * The feature id for the '<em><b>Organizacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ORGANIZACION = PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION;

	/**
	 * The feature id for the '<em><b>Edificio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__EDIFICIO = PeoplePackage.UNIDAD_ORGANIZACIONAL__EDIFICIO;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__UNIDAD = PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD;

	/**
	 * The feature id for the '<em><b>Unidad Padre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE = PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ACTOR = PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR;

	/**
	 * The feature id for the '<em><b>The Actores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__THE_ACTORES = PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ROLES = PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__DEPOSITOS = PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS;

	/**
	 * The feature id for the '<em><b>Copias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__COPIAS = PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__COPIA = PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA;

	/**
	 * The feature id for the '<em><b>Sus Depositos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS = PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS;

	/**
	 * The feature id for the '<em><b>Instanciacionesprocesos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS = PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ORDER = PeoplePackage.UNIDAD_ORGANIZACIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__EA_DIAGRAM = PeoplePackage.UNIDAD_ORGANIZACIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__LIST_CAMPOS = PeoplePackage.UNIDAD_ORGANIZACIONAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unidad Organizacional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL_FEATURE_COUNT = PeoplePackage.UNIDAD_ORGANIZACIONAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Unidad Organizacional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL_OPERATION_COUNT = PeoplePackage.UNIDAD_ORGANIZACIONAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.ContactoImpl <em>Contacto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.ContactoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getContacto()
	 * @generated
	 */
	int CONTACTO = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__OWNER = PeoplePackage.CONTACTO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__CONTEXTO = PeoplePackage.CONTACTO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__NOMBRE = PeoplePackage.CONTACTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__FROM = PeoplePackage.CONTACTO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__TO = PeoplePackage.CONTACTO__TO;

	/**
	 * The feature id for the '<em><b>Directorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__DIRECTORIO = PeoplePackage.CONTACTO__DIRECTORIO;

	/**
	 * The feature id for the '<em><b>Quien</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__QUIEN = PeoplePackage.CONTACTO__QUIEN;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__MENSAJE = PeoplePackage.CONTACTO__MENSAJE;

	/**
	 * The feature id for the '<em><b>Destinatariocomunicacion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__DESTINATARIOCOMUNICACION = PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION;

	/**
	 * The feature id for the '<em><b>Remitentecomunicacion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__REMITENTECOMUNICACION = PeoplePackage.CONTACTO__REMITENTECOMUNICACION;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__ORDER = PeoplePackage.CONTACTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__EA_DIAGRAM = PeoplePackage.CONTACTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__LIST_CAMPOS = PeoplePackage.CONTACTO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_FEATURE_COUNT = PeoplePackage.CONTACTO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_OPERATION_COUNT = PeoplePackage.CONTACTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.ActorImpl
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNER = PeoplePackage.ACTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTEXTO = PeoplePackage.ACTOR__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NOMBRE = PeoplePackage.ACTOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FROM = PeoplePackage.ACTOR__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TO = PeoplePackage.ACTOR__TO;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTACTO = PeoplePackage.ACTOR__CONTACTO;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__THE_DOCUMENTO = PeoplePackage.ACTOR__THE_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROL = PeoplePackage.ACTOR__ROL;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__UNIDAD = PeoplePackage.ACTOR__UNIDAD;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTORES = PeoplePackage.ACTOR__ACTORES;

	/**
	 * The feature id for the '<em><b>Ejecuta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EJECUTA = PeoplePackage.ACTOR__EJECUTA;

	/**
	 * The feature id for the '<em><b>Procesos Responsable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROCESOS_RESPONSABLE = PeoplePackage.ACTOR__PROCESOS_RESPONSABLE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ORDER = PeoplePackage.ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EA_DIAGRAM = PeoplePackage.ACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LIST_CAMPOS = PeoplePackage.ACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = PeoplePackage.ACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = PeoplePackage.ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.RolImpl
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__OWNER = PeoplePackage.ROL__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__CONTEXTO = PeoplePackage.ROL__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NOMBRE = PeoplePackage.ROL__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__FROM = PeoplePackage.ROL__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__TO = PeoplePackage.ROL__TO;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__CONTACTO = PeoplePackage.ROL__CONTACTO;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__THE_DOCUMENTO = PeoplePackage.ROL__THE_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__UNIDAD_ORGANIZACIONAL = PeoplePackage.ROL__UNIDAD_ORGANIZACIONAL;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ACTOR = PeoplePackage.ROL__ACTOR;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ROLES = PeoplePackage.ROL__ROLES;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ORDER = PeoplePackage.ROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__EA_DIAGRAM = PeoplePackage.ROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__LIST_CAMPOS = PeoplePackage.ROL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = PeoplePackage.ROL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_OPERATION_COUNT = PeoplePackage.ROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.QuienImpl <em>Quien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienImpl
	 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getQuien()
	 * @generated
	 */
	int QUIEN = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__OWNER = ModelPackage.ELEMENTO_CONSULTA__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__CONTEXTO = ModelPackage.ELEMENTO_CONSULTA__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__NOMBRE = ModelPackage.ELEMENTO_CONSULTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__FROM = ModelPackage.ELEMENTO_CONSULTA__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__TO = ModelPackage.ELEMENTO_CONSULTA__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__ORDER = ModelPackage.ELEMENTO_CONSULTA__ORDER;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__EA_DIAGRAM = ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__LIST_CAMPOS = ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__CONTACTO = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__THE_DOCUMENTO = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN_FEATURE_COUNT = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN_OPERATION_COUNT = ModelPackage.ELEMENTO_CONSULTA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.quien.UnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.quien.UnidadOrganizacional
	 * @generated
	 */
	EClass getUnidadOrganizacional();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.quien.Contacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacto</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.quien.Contacto
	 * @generated
	 */
	EClass getContacto();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.quien.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.quien.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.quien.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.quien.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.quien.Quien <em>Quien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quien</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.quien.Quien
	 * @generated
	 */
	EClass getQuien();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuienFactory getQuienFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl <em>Unidad Organizacional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getUnidadOrganizacional()
		 * @generated
		 */
		EClass UNIDAD_ORGANIZACIONAL = eINSTANCE.getUnidadOrganizacional();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.ContactoImpl <em>Contacto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.ContactoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getContacto()
		 * @generated
		 */
		EClass CONTACTO = eINSTANCE.getContacto();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.ActorImpl
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.RolImpl
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.quien.impl.QuienImpl <em>Quien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienImpl
		 * @see gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl#getQuien()
		 * @generated
		 */
		EClass QUIEN = eINSTANCE.getQuien();

	}

} //QuienPackage
