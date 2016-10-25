/**
 */
package gestionmodelosconsultas.modeloconsultas.donde.impl;

import gestionmodelosconsultas.modeloconsultas.donde.*;

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
public class DondeFactoryImpl extends EFactoryImpl implements DondeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DondeFactory init() {
		try {
			DondeFactory theDondeFactory = (DondeFactory)EPackage.Registry.INSTANCE.getEFactory(DondePackage.eNS_URI);
			if (theDondeFactory != null) {
				return theDondeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DondeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DondeFactoryImpl() {
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
			case DondePackage.DEPOSITO: return createDeposito();
			case DondePackage.DISCO: return createDisco();
			case DondePackage.ARMARIO: return createArmario();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deposito createDeposito() {
		DepositoImpl deposito = new DepositoImpl();
		return deposito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disco createDisco() {
		DiscoImpl disco = new DiscoImpl();
		return disco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Armario createArmario() {
		ArmarioImpl armario = new ArmarioImpl();
		return armario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DondePackage getDondePackage() {
		return (DondePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DondePackage getPackage() {
		return DondePackage.eINSTANCE;
	}

} //DondeFactoryImpl
