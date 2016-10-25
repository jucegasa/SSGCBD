/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultque.*;

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
public class ResultqueFactoryImpl extends EFactoryImpl implements ResultqueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultqueFactory init() {
		try {
			ResultqueFactory theResultqueFactory = (ResultqueFactory)EPackage.Registry.INSTANCE.getEFactory(ResultquePackage.eNS_URI);
			if (theResultqueFactory != null) {
				return theResultqueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultqueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultqueFactoryImpl() {
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
			case ResultquePackage.DOCUMENTO: return createDocumento();
			case ResultquePackage.COMUNICACION: return createComunicacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento createDocumento() {
		DocumentoImpl documento = new DocumentoImpl();
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comunicacion createComunicacion() {
		ComunicacionImpl comunicacion = new ComunicacionImpl();
		return comunicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultquePackage getResultquePackage() {
		return (ResultquePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultquePackage getPackage() {
		return ResultquePackage.eINSTANCE;
	}

} //ResultqueFactoryImpl
