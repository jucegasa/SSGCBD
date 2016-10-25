/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.*;

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
public class ResultdondeFactoryImpl extends EFactoryImpl implements ResultdondeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultdondeFactory init() {
		try {
			ResultdondeFactory theResultdondeFactory = (ResultdondeFactory)EPackage.Registry.INSTANCE.getEFactory(ResultdondePackage.eNS_URI);
			if (theResultdondeFactory != null) {
				return theResultdondeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultdondeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultdondeFactoryImpl() {
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
			case ResultdondePackage.DEPOSITO: return createDeposito();
			case ResultdondePackage.DISCO: return createDisco();
			case ResultdondePackage.ARMARIO: return createArmario();
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
	public ResultdondePackage getResultdondePackage() {
		return (ResultdondePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultdondePackage getPackage() {
		return ResultdondePackage.eINSTANCE;
	}

} //ResultdondeFactoryImpl
