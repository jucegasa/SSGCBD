/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.*;

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
public class ResultcomoFactoryImpl extends EFactoryImpl implements ResultcomoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultcomoFactory init() {
		try {
			ResultcomoFactory theResultcomoFactory = (ResultcomoFactory)EPackage.Registry.INSTANCE.getEFactory(ResultcomoPackage.eNS_URI);
			if (theResultcomoFactory != null) {
				return theResultcomoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultcomoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultcomoFactoryImpl() {
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
			case ResultcomoPackage.INSTANCIA_PROCESO: return createInstanciaProceso();
			case ResultcomoPackage.ACTIVIDAD_PROCESO: return createActividadProceso();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public ActividadProceso createActividadProceso() {
		ActividadProcesoImpl actividadProceso = new ActividadProcesoImpl();
		return actividadProceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultcomoPackage getResultcomoPackage() {
		return (ResultcomoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultcomoPackage getPackage() {
		return ResultcomoPackage.eINSTANCE;
	}

} //ResultcomoFactoryImpl
