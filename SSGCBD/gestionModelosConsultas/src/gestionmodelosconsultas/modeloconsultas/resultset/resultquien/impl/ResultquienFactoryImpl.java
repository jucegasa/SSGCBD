/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.*;

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
public class ResultquienFactoryImpl extends EFactoryImpl implements ResultquienFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultquienFactory init() {
		try {
			ResultquienFactory theResultquienFactory = (ResultquienFactory)EPackage.Registry.INSTANCE.getEFactory(ResultquienPackage.eNS_URI);
			if (theResultquienFactory != null) {
				return theResultquienFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultquienFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultquienFactoryImpl() {
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
			case ResultquienPackage.ACTOR: return createActor();
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL: return createUnidadOrganizacional();
			case ResultquienPackage.ROL: return createRol();
			case ResultquienPackage.CONTACTO: return createContacto();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public ResultquienPackage getResultquienPackage() {
		return (ResultquienPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultquienPackage getPackage() {
		return ResultquienPackage.eINSTANCE;
	}

} //ResultquienFactoryImpl
