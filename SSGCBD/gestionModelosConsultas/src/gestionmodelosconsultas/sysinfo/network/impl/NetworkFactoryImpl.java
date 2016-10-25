/**
 */
package gestionmodelosconsultas.sysinfo.network.impl;

import gestionmodelosconsultas.sysinfo.network.*;

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
public class NetworkFactoryImpl extends EFactoryImpl implements NetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkFactory init() {
		try {
			NetworkFactory theNetworkFactory = (NetworkFactory)EPackage.Registry.INSTANCE.getEFactory(NetworkPackage.eNS_URI);
			if (theNetworkFactory != null) {
				return theNetworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkFactoryImpl() {
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
			case NetworkPackage.DISCO: return createDisco();
			case NetworkPackage.ARMARIO: return createArmario();
			case NetworkPackage.DEPOSITO: return createDeposito();
			case NetworkPackage.NETWORK_VIEW: return createNetwork_View();
			case NetworkPackage.EDIFICIO: return createEdificio();
			case NetworkPackage.DEPOSITOS: return createDepositos();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Deposito createDeposito() {
		DepositoImpl deposito = new DepositoImpl();
		return deposito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network_View createNetwork_View() {
		Network_ViewImpl network_View = new Network_ViewImpl();
		return network_View;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edificio createEdificio() {
		EdificioImpl edificio = new EdificioImpl();
		return edificio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depositos createDepositos() {
		DepositosImpl depositos = new DepositosImpl();
		return depositos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkPackage getNetworkPackage() {
		return (NetworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetworkPackage getPackage() {
		return NetworkPackage.eINSTANCE;
	}

} //NetworkFactoryImpl
