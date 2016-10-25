/**
 */
package gestionmodelosconsultas.modeloconsultas.impl;

import gestionmodelosconsultas.modeloconsultas.*;

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
public class ModeloconsultasFactoryImpl extends EFactoryImpl implements ModeloconsultasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeloconsultasFactory init() {
		try {
			ModeloconsultasFactory theModeloconsultasFactory = (ModeloconsultasFactory)EPackage.Registry.INSTANCE.getEFactory(ModeloconsultasPackage.eNS_URI);
			if (theModeloconsultasFactory != null) {
				return theModeloconsultasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeloconsultasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloconsultasFactoryImpl() {
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
			case ModeloconsultasPackage.MODELO_CONSULTA: return createModeloConsulta();
			case ModeloconsultasPackage.FACTORY_MODELO_CONSULTA: return createFactoryModeloConsulta();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConsulta createModeloConsulta() {
		ModeloConsultaImpl modeloConsulta = new ModeloConsultaImpl();
		return modeloConsulta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryModeloConsulta createFactoryModeloConsulta() {
		FactoryModeloConsultaImpl factoryModeloConsulta = new FactoryModeloConsultaImpl();
		return factoryModeloConsulta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloconsultasPackage getModeloconsultasPackage() {
		return (ModeloconsultasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeloconsultasPackage getPackage() {
		return ModeloconsultasPackage.eINSTANCE;
	}

} //ModeloconsultasFactoryImpl
