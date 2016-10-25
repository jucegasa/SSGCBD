/**
 */
package gestionmodelosconsultas.memoms.info.impl;

import gestionmodelosconsultas.memoms.info.*;

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
public class InfoFactoryImpl extends EFactoryImpl implements InfoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfoFactory init() {
		try {
			InfoFactory theInfoFactory = (InfoFactory)EPackage.Registry.INSTANCE.getEFactory(InfoPackage.eNS_URI);
			if (theInfoFactory != null) {
				return theInfoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoFactoryImpl() {
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
			case InfoPackage.OBSERVACION: return createObservacion();
			case InfoPackage.EXPEDIENTE: return createExpediente();
			case InfoPackage.ANEXO: return createAnexo();
			case InfoPackage.ACTIVIDAD: return createActividad();
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL: return createTablaRetencionDocumental();
			case InfoPackage.SERIE_DOCUMENTAL: return createSerieDocumental();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observacion createObservacion() {
		ObservacionImpl observacion = new ObservacionImpl();
		return observacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expediente createExpediente() {
		ExpedienteImpl expediente = new ExpedienteImpl();
		return expediente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anexo createAnexo() {
		AnexoImpl anexo = new AnexoImpl();
		return anexo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actividad createActividad() {
		ActividadImpl actividad = new ActividadImpl();
		return actividad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablaRetencionDocumental createTablaRetencionDocumental() {
		TablaRetencionDocumentalImpl tablaRetencionDocumental = new TablaRetencionDocumentalImpl();
		return tablaRetencionDocumental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerieDocumental createSerieDocumental() {
		SerieDocumentalImpl serieDocumental = new SerieDocumentalImpl();
		return serieDocumental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoPackage getInfoPackage() {
		return (InfoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfoPackage getPackage() {
		return InfoPackage.eINSTANCE;
	}

} //InfoFactoryImpl
