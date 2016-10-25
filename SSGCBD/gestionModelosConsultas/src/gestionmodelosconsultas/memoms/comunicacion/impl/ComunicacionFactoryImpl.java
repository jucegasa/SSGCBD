/**
 */
package gestionmodelosconsultas.memoms.comunicacion.impl;

import gestionmodelosconsultas.memoms.comunicacion.*;

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
public class ComunicacionFactoryImpl extends EFactoryImpl implements ComunicacionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComunicacionFactory init() {
		try {
			ComunicacionFactory theComunicacionFactory = (ComunicacionFactory)EPackage.Registry.INSTANCE.getEFactory(ComunicacionPackage.eNS_URI);
			if (theComunicacionFactory != null) {
				return theComunicacionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComunicacionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComunicacionFactoryImpl() {
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
			case ComunicacionPackage.MEMORANDO: return createMemorando();
			case ComunicacionPackage.CIRCULAR: return createCircular();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memorando createMemorando() {
		MemorandoImpl memorando = new MemorandoImpl();
		return memorando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circular createCircular() {
		CircularImpl circular = new CircularImpl();
		return circular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComunicacionPackage getComunicacionPackage() {
		return (ComunicacionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComunicacionPackage getPackage() {
		return ComunicacionPackage.eINSTANCE;
	}

} //ComunicacionFactoryImpl
