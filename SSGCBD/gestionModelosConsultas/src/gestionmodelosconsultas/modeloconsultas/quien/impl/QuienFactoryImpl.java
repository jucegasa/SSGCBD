/**
 */
package gestionmodelosconsultas.modeloconsultas.quien.impl;

import gestionmodelosconsultas.modeloconsultas.quien.*;

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
public class QuienFactoryImpl extends EFactoryImpl implements QuienFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuienFactory init() {
		try {
			QuienFactory theQuienFactory = (QuienFactory)EPackage.Registry.INSTANCE.getEFactory(QuienPackage.eNS_URI);
			if (theQuienFactory != null) {
				return theQuienFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuienFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuienFactoryImpl() {
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
			case QuienPackage.UNIDAD_ORGANIZACIONAL: return createUnidadOrganizacional();
			case QuienPackage.CONTACTO: return createContacto();
			case QuienPackage.ACTOR: return createActor();
			case QuienPackage.ROL: return createRol();
			case QuienPackage.QUIEN: return createQuien();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Contacto createContacto() {
		ContactoImpl contacto = new ContactoImpl();
		return contacto;
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
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
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
	public QuienPackage getQuienPackage() {
		return (QuienPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuienPackage getPackage() {
		return QuienPackage.eINSTANCE;
	}

} //QuienFactoryImpl
