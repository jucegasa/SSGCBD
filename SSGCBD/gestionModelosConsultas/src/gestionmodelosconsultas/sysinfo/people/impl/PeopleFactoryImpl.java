/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.sysinfo.people.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PeopleFactoryImpl extends EFactoryImpl implements PeopleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PeopleFactory init() {
		try {
			PeopleFactory thePeopleFactory = (PeopleFactory)EPackage.Registry.INSTANCE.getEFactory(PeoplePackage.eNS_URI);
			if (thePeopleFactory != null) {
				return thePeopleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PeopleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeopleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PeoplePackage.PEOPLE_VIEW: return createPeople_View();
			case PeoplePackage.UNIDAD_ORGANIZACIONAL: return createUnidadOrganizacional();
			case PeoplePackage.ROL: return createRol();
			case PeoplePackage.CONTACTO: return createContacto();
			case PeoplePackage.DIRECTORIO: return createDirectorio();
			case PeoplePackage.ORGANIZACION: return createOrganizacion();
			case PeoplePackage.ACTOR: return createActor();
			case PeoplePackage.QUIEN: return createQuien();
			case PeoplePackage.ACTORES: return createActores();
			case PeoplePackage.ROLES: return createRoles();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public People_View createPeople_View() {
		People_ViewImpl people_View = new People_ViewImpl();
		return people_View;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional createUnidadOrganizacional() {
		UnidadOrganizacionalImpl unidadOrganizacional = new UnidadOrganizacionalImpl();
		return unidadOrganizacional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contacto createContacto() {
		ContactoImpl contacto = new ContactoImpl();
		return contacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directorio createDirectorio() {
		DirectorioImpl directorio = new DirectorioImpl();
		return directorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizacion createOrganizacion() {
		OrganizacionImpl organizacion = new OrganizacionImpl();
		return organizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quien createQuien() {
		QuienImpl quien = new QuienImpl();
		return quien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actores createActores() {
		ActoresImpl actores = new ActoresImpl();
		return actores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles createRoles() {
		RolesImpl roles = new RolesImpl();
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeoplePackage getPeoplePackage() {
		return (PeoplePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PeoplePackage getPackage() {
		return PeoplePackage.eINSTANCE;
	}

} //PeopleFactoryImpl
