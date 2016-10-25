/**
 */
package gestionmodelosconsultas.modeloconsultas.como.impl;

import gestionmodelosconsultas.modeloconsultas.como.*;

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
public class ComoFactoryImpl extends EFactoryImpl implements ComoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComoFactory init() {
		try {
			ComoFactory theComoFactory = (ComoFactory)EPackage.Registry.INSTANCE.getEFactory(ComoPackage.eNS_URI);
			if (theComoFactory != null) {
				return theComoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComoFactoryImpl() {
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
			case ComoPackage.ACTIVIDAD_PROCESO: return createActividadProceso();
			case ComoPackage.INSTANCIA_PROCESO: return createInstanciaProceso();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadProceso createActividadProceso() {
		ActividadProcesoImpl actividadProceso = new ActividadProcesoImpl();
		return actividadProceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanciaProceso createInstanciaProceso() {
		InstanciaProcesoImpl instanciaProceso = new InstanciaProcesoImpl();
		return instanciaProceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComoPackage getComoPackage() {
		return (ComoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComoPackage getPackage() {
		return ComoPackage.eINSTANCE;
	}

} //ComoFactoryImpl
