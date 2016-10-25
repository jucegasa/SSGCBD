/**
 */
package gestionmodelosconsultas.impl;

import gestionmodelosconsultas.*;

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
public class GestionmodelosconsultasFactoryImpl extends EFactoryImpl implements GestionmodelosconsultasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GestionmodelosconsultasFactory init() {
		try {
			GestionmodelosconsultasFactory theGestionmodelosconsultasFactory = (GestionmodelosconsultasFactory)EPackage.Registry.INSTANCE.getEFactory(GestionmodelosconsultasPackage.eNS_URI);
			if (theGestionmodelosconsultasFactory != null) {
				return theGestionmodelosconsultasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GestionmodelosconsultasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionmodelosconsultasFactoryImpl() {
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
			case GestionmodelosconsultasPackage.MODEL_FACTORY: return createModelFactory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionmodelosconsultasPackage getGestionmodelosconsultasPackage() {
		return (GestionmodelosconsultasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GestionmodelosconsultasPackage getPackage() {
		return GestionmodelosconsultasPackage.eINSTANCE;
	}

} //GestionmodelosconsultasFactoryImpl
