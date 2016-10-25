/**
 */
package gestionmodelosconsultas.sysinfo.people;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

import gestionmodelosconsultas.sysinfo.core.CorePackage;

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
 * @see gestionmodelosconsultas.sysinfo.people.PeopleFactory
 * @model kind="package"
 * @generated
 */
public interface PeoplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "people";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/people.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.people";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PeoplePackage eINSTANCE = gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.People_ViewImpl <em>People View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.People_ViewImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getPeople_View()
	 * @generated
	 */
	int PEOPLE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Directorio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__DIRECTORIO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organizacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW__ORGANIZACION = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>People View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>People View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_VIEW_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.QuienImpl <em>Quien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.QuienImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getQuien()
	 * @generated
	 */
	int QUIEN = 7;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__CONTACTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN__THE_DOCUMENTO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIEN_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl <em>Unidad Organizacional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getUnidadOrganizacional()
	 * @generated
	 */
	int UNIDAD_ORGANIZACIONAL = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__OWNER = QUIEN__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__CONTEXTO = QUIEN__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__NOMBRE = QUIEN__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__FROM = QUIEN__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__TO = QUIEN__TO;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__CONTACTO = QUIEN__CONTACTO;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__THE_DOCUMENTO = QUIEN__THE_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ROL = QUIEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organizacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ORGANIZACION = QUIEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edificio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__EDIFICIO = QUIEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__UNIDAD = QUIEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unidad Padre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE = QUIEN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ACTOR = QUIEN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>The Actores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__THE_ACTORES = QUIEN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__ROLES = QUIEN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Depositos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__DEPOSITOS = QUIEN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Copias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__COPIAS = QUIEN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Copia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__COPIA = QUIEN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sus Depositos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS = QUIEN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Instanciacionesprocesos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS = QUIEN_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Unidad Organizacional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL_FEATURE_COUNT = QUIEN_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Unidad Organizacional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANIZACIONAL_OPERATION_COUNT = QUIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.RolImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getRol()
	 * @generated
	 */
	int ROL = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__OWNER = QUIEN__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__CONTEXTO = QUIEN__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NOMBRE = QUIEN__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__FROM = QUIEN__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__TO = QUIEN__TO;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__CONTACTO = QUIEN__CONTACTO;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__THE_DOCUMENTO = QUIEN__THE_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__UNIDAD_ORGANIZACIONAL = QUIEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ACTOR = QUIEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ROLES = QUIEN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = QUIEN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_OPERATION_COUNT = QUIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl <em>Contacto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getContacto()
	 * @generated
	 */
	int CONTACTO = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Directorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__DIRECTORIO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quien</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__QUIEN = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__MENSAJE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destinatariocomunicacion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__DESTINATARIOCOMUNICACION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remitentecomunicacion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__REMITENTECOMUNICACION = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.DirectorioImpl <em>Directorio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.DirectorioImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getDirectorio()
	 * @generated
	 */
	int DIRECTORIO = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>People View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__PEOPLE_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO__CONTACTO = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directorio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Directorio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORIO_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.OrganizacionImpl <em>Organizacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.OrganizacionImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getOrganizacion()
	 * @generated
	 */
	int ORGANIZACION = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__OWNER = SysinfoPackage.PAQUETE__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__CONTEXTO = SysinfoPackage.PAQUETE__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__NOMBRE = SysinfoPackage.PAQUETE__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__FROM = SysinfoPackage.PAQUETE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__TO = SysinfoPackage.PAQUETE__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__TIPO = SysinfoPackage.PAQUETE__TIPO;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__ELEMENT = SysinfoPackage.PAQUETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>People View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__PEOPLE_VIEW = SysinfoPackage.PAQUETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organizacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION__ORGANIZACION = SysinfoPackage.PAQUETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organizacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION_FEATURE_COUNT = SysinfoPackage.PAQUETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Organizacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZACION_OPERATION_COUNT = SysinfoPackage.PAQUETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.ActorImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNER = QUIEN__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTEXTO = QUIEN__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NOMBRE = QUIEN__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FROM = QUIEN__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TO = QUIEN__TO;

	/**
	 * The feature id for the '<em><b>Contacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTACTO = QUIEN__CONTACTO;

	/**
	 * The feature id for the '<em><b>The Documento</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__THE_DOCUMENTO = QUIEN__THE_DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROL = QUIEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__UNIDAD = QUIEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTORES = QUIEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ejecuta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EJECUTA = QUIEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Procesos Responsable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROCESOS_RESPONSABLE = QUIEN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = QUIEN_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = QUIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.ActoresImpl <em>Actores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.ActoresImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getActores()
	 * @generated
	 */
	int ACTORES = 8;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORES__UNIDAD_ORGANIZACIONAL = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORES__ACTOR = 1;

	/**
	 * The number of structural features of the '<em>Actores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.people.impl.RolesImpl <em>Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.people.impl.RolesImpl
	 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getRoles()
	 * @generated
	 */
	int ROLES = 9;

	/**
	 * The feature id for the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__UNIDAD_ORGANIZACIONAL = 0;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__ROL = 1;

	/**
	 * The number of structural features of the '<em>Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.People_View <em>People View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>People View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.People_View
	 * @generated
	 */
	EClass getPeople_View();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.people.People_View#getDirectorio <em>Directorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directorio</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.People_View#getDirectorio()
	 * @see #getPeople_View()
	 * @generated
	 */
	EReference getPeople_View_Directorio();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.people.People_View#getOrganizacion <em>Organizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.People_View#getOrganizacion()
	 * @see #getPeople_View()
	 * @generated
	 */
	EReference getPeople_View_Organizacion();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional
	 * @generated
	 */
	EClass getUnidadOrganizacional();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rol</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRol()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Rol();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getOrganizacion <em>Organizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organizacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getOrganizacion()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Organizacion();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getEdificio <em>Edificio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edificio</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getEdificio()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Edificio();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unidad</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidad()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Unidad();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidadPadre <em>Unidad Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Padre</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getUnidadPadre()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_UnidadPadre();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getActor()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Actor();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getTheActores <em>The Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Actores</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getTheActores()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_TheActores();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getRoles()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getDepositos <em>Depositos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depositos</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getDepositos()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Depositos();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopias <em>Copias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copias</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopias()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Copias();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copia</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopia()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Copia();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getSusDepositos <em>Sus Depositos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sus Depositos</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getSusDepositos()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_SusDepositos();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getInstanciacionesprocesos <em>Instanciacionesprocesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instanciacionesprocesos</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getInstanciacionesprocesos()
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	EReference getUnidadOrganizacional_Instanciacionesprocesos();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Rol#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Rol#getUnidadOrganizacional()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_UnidadOrganizacional();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Rol#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Rol#getActor()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Actor();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Rol#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Roles</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Rol#getRoles()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Roles();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Contacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto
	 * @generated
	 */
	EClass getContacto();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getDirectorio <em>Directorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Directorio</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getDirectorio()
	 * @see #getContacto()
	 * @generated
	 */
	EReference getContacto_Directorio();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getQuien <em>Quien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quien</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getQuien()
	 * @see #getContacto()
	 * @generated
	 */
	EReference getContacto_Quien();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mensaje</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getMensaje()
	 * @see #getContacto()
	 * @generated
	 */
	EReference getContacto_Mensaje();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getDestinatariocomunicacion <em>Destinatariocomunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destinatariocomunicacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getDestinatariocomunicacion()
	 * @see #getContacto()
	 * @generated
	 */
	EReference getContacto_Destinatariocomunicacion();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Contacto#getRemitentecomunicacion <em>Remitentecomunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Remitentecomunicacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Contacto#getRemitentecomunicacion()
	 * @see #getContacto()
	 * @generated
	 */
	EReference getContacto_Remitentecomunicacion();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Directorio <em>Directorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directorio</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Directorio
	 * @generated
	 */
	EClass getDirectorio();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Directorio#getPeople_View <em>People View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>People View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Directorio#getPeople_View()
	 * @see #getDirectorio()
	 * @generated
	 */
	EReference getDirectorio_People_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.Directorio#getContacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Directorio#getContacto()
	 * @see #getDirectorio()
	 * @generated
	 */
	EReference getDirectorio_Contacto();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Organizacion <em>Organizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Organizacion
	 * @generated
	 */
	EClass getOrganizacion();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Organizacion#getPeople_View <em>People View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>People View</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Organizacion#getPeople_View()
	 * @see #getOrganizacion()
	 * @generated
	 */
	EReference getOrganizacion_People_View();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.Organizacion#getOrganizacion <em>Organizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizacion</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Organizacion#getOrganizacion()
	 * @see #getOrganizacion()
	 * @generated
	 */
	EReference getOrganizacion_Organizacion();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Actor#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rol</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getRol()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Rol();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Actor#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getUnidad()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Unidad();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Actor#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Actores</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getActores()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Actores();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Actor#getEjecuta <em>Ejecuta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ejecuta</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getEjecuta()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Ejecuta();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Actor#getProcesosResponsable <em>Procesos Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procesos Responsable</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actor#getProcesosResponsable()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ProcesosResponsable();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Quien <em>Quien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quien</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Quien
	 * @generated
	 */
	EClass getQuien();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.sysinfo.people.Quien#getContacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contacto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Quien#getContacto()
	 * @see #getQuien()
	 * @generated
	 */
	EReference getQuien_Contacto();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.people.Quien#getTheDocumento <em>The Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>The Documento</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Quien#getTheDocumento()
	 * @see #getQuien()
	 * @generated
	 */
	EReference getQuien_TheDocumento();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Actores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actores</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actores
	 * @generated
	 */
	EClass getActores();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Actores#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actores#getUnidadOrganizacional()
	 * @see #getActores()
	 * @generated
	 */
	EReference getActores_UnidadOrganizacional();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.Actores#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Actores#getActor()
	 * @see #getActores()
	 * @generated
	 */
	EReference getActores_Actor();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.people.Roles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Roles
	 * @generated
	 */
	EClass getRoles();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.people.Roles#getUnidadOrganizacional <em>Unidad Organizacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidad Organizacional</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Roles#getUnidadOrganizacional()
	 * @see #getRoles()
	 * @generated
	 */
	EReference getRoles_UnidadOrganizacional();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.people.Roles#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rol</em>'.
	 * @see gestionmodelosconsultas.sysinfo.people.Roles#getRol()
	 * @see #getRoles()
	 * @generated
	 */
	EReference getRoles_Rol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PeopleFactory getPeopleFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.People_ViewImpl <em>People View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.People_ViewImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getPeople_View()
		 * @generated
		 */
		EClass PEOPLE_VIEW = eINSTANCE.getPeople_View();

		/**
		 * The meta object literal for the '<em><b>Directorio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEOPLE_VIEW__DIRECTORIO = eINSTANCE.getPeople_View_Directorio();

		/**
		 * The meta object literal for the '<em><b>Organizacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEOPLE_VIEW__ORGANIZACION = eINSTANCE.getPeople_View_Organizacion();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl <em>Unidad Organizacional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.UnidadOrganizacionalImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getUnidadOrganizacional()
		 * @generated
		 */
		EClass UNIDAD_ORGANIZACIONAL = eINSTANCE.getUnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__ROL = eINSTANCE.getUnidadOrganizacional_Rol();

		/**
		 * The meta object literal for the '<em><b>Organizacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__ORGANIZACION = eINSTANCE.getUnidadOrganizacional_Organizacion();

		/**
		 * The meta object literal for the '<em><b>Edificio</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__EDIFICIO = eINSTANCE.getUnidadOrganizacional_Edificio();

		/**
		 * The meta object literal for the '<em><b>Unidad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__UNIDAD = eINSTANCE.getUnidadOrganizacional_Unidad();

		/**
		 * The meta object literal for the '<em><b>Unidad Padre</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE = eINSTANCE.getUnidadOrganizacional_UnidadPadre();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__ACTOR = eINSTANCE.getUnidadOrganizacional_Actor();

		/**
		 * The meta object literal for the '<em><b>The Actores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__THE_ACTORES = eINSTANCE.getUnidadOrganizacional_TheActores();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__ROLES = eINSTANCE.getUnidadOrganizacional_Roles();

		/**
		 * The meta object literal for the '<em><b>Depositos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__DEPOSITOS = eINSTANCE.getUnidadOrganizacional_Depositos();

		/**
		 * The meta object literal for the '<em><b>Copias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__COPIAS = eINSTANCE.getUnidadOrganizacional_Copias();

		/**
		 * The meta object literal for the '<em><b>Copia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__COPIA = eINSTANCE.getUnidadOrganizacional_Copia();

		/**
		 * The meta object literal for the '<em><b>Sus Depositos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS = eINSTANCE.getUnidadOrganizacional_SusDepositos();

		/**
		 * The meta object literal for the '<em><b>Instanciacionesprocesos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS = eINSTANCE.getUnidadOrganizacional_Instanciacionesprocesos();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.RolImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__UNIDAD_ORGANIZACIONAL = eINSTANCE.getRol_UnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ACTOR = eINSTANCE.getRol_Actor();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ROLES = eINSTANCE.getRol_Roles();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl <em>Contacto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getContacto()
		 * @generated
		 */
		EClass CONTACTO = eINSTANCE.getContacto();

		/**
		 * The meta object literal for the '<em><b>Directorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTO__DIRECTORIO = eINSTANCE.getContacto_Directorio();

		/**
		 * The meta object literal for the '<em><b>Quien</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTO__QUIEN = eINSTANCE.getContacto_Quien();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTO__MENSAJE = eINSTANCE.getContacto_Mensaje();

		/**
		 * The meta object literal for the '<em><b>Destinatariocomunicacion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTO__DESTINATARIOCOMUNICACION = eINSTANCE.getContacto_Destinatariocomunicacion();

		/**
		 * The meta object literal for the '<em><b>Remitentecomunicacion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTO__REMITENTECOMUNICACION = eINSTANCE.getContacto_Remitentecomunicacion();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.DirectorioImpl <em>Directorio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.DirectorioImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getDirectorio()
		 * @generated
		 */
		EClass DIRECTORIO = eINSTANCE.getDirectorio();

		/**
		 * The meta object literal for the '<em><b>People View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORIO__PEOPLE_VIEW = eINSTANCE.getDirectorio_People_View();

		/**
		 * The meta object literal for the '<em><b>Contacto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORIO__CONTACTO = eINSTANCE.getDirectorio_Contacto();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.OrganizacionImpl <em>Organizacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.OrganizacionImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getOrganizacion()
		 * @generated
		 */
		EClass ORGANIZACION = eINSTANCE.getOrganizacion();

		/**
		 * The meta object literal for the '<em><b>People View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZACION__PEOPLE_VIEW = eINSTANCE.getOrganizacion_People_View();

		/**
		 * The meta object literal for the '<em><b>Organizacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZACION__ORGANIZACION = eINSTANCE.getOrganizacion_Organizacion();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.ActorImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ROL = eINSTANCE.getActor_Rol();

		/**
		 * The meta object literal for the '<em><b>Unidad</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__UNIDAD = eINSTANCE.getActor_Unidad();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACTORES = eINSTANCE.getActor_Actores();

		/**
		 * The meta object literal for the '<em><b>Ejecuta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__EJECUTA = eINSTANCE.getActor_Ejecuta();

		/**
		 * The meta object literal for the '<em><b>Procesos Responsable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PROCESOS_RESPONSABLE = eINSTANCE.getActor_ProcesosResponsable();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.QuienImpl <em>Quien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.QuienImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getQuien()
		 * @generated
		 */
		EClass QUIEN = eINSTANCE.getQuien();

		/**
		 * The meta object literal for the '<em><b>Contacto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIEN__CONTACTO = eINSTANCE.getQuien_Contacto();

		/**
		 * The meta object literal for the '<em><b>The Documento</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIEN__THE_DOCUMENTO = eINSTANCE.getQuien_TheDocumento();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.ActoresImpl <em>Actores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.ActoresImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getActores()
		 * @generated
		 */
		EClass ACTORES = eINSTANCE.getActores();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTORES__UNIDAD_ORGANIZACIONAL = eINSTANCE.getActores_UnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTORES__ACTOR = eINSTANCE.getActores_Actor();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.people.impl.RolesImpl <em>Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.people.impl.RolesImpl
		 * @see gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl#getRoles()
		 * @generated
		 */
		EClass ROLES = eINSTANCE.getRoles();

		/**
		 * The meta object literal for the '<em><b>Unidad Organizacional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES__UNIDAD_ORGANIZACIONAL = eINSTANCE.getRoles_UnidadOrganizacional();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES__ROL = eINSTANCE.getRoles_Rol();

	}

} //PeoplePackage
