/**
 */
package model.uimanager.impl;

import model.uimanager.*;

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
public class UimanagerFactoryImpl extends EFactoryImpl implements UimanagerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UimanagerFactory init() {
		try {
			UimanagerFactory theUimanagerFactory = (UimanagerFactory)EPackage.Registry.INSTANCE.getEFactory(UimanagerPackage.eNS_URI);
			if (theUimanagerFactory != null) {
				return theUimanagerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UimanagerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimanagerFactoryImpl() {
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
			case UimanagerPackage.UI_MANAGER: return createUIManager();
			case UimanagerPackage.VENTANA_MEMORANDO_VIEW_MODEL: return createVentanaMemorandoViewModel();
			case UimanagerPackage.CONTENEDOR_INFORMACION_MEMORANDO: return createContenedorInformacionMemorando();
			case UimanagerPackage.CONTENEDOR_MEMORANDO: return createContenedorMemorando();
			case UimanagerPackage.MEMORANDO_VIEW_MODEL: return createMemorandoViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIManager createUIManager() {
		UIManagerImpl uiManager = new UIManagerImpl();
		return uiManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VentanaMemorandoViewModel createVentanaMemorandoViewModel() {
		VentanaMemorandoViewModelImpl ventanaMemorandoViewModel = new VentanaMemorandoViewModelImpl();
		return ventanaMemorandoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformacionMemorando createContenedorInformacionMemorando() {
		ContenedorInformacionMemorandoImpl contenedorInformacionMemorando = new ContenedorInformacionMemorandoImpl();
		return contenedorInformacionMemorando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMemorando createContenedorMemorando() {
		ContenedorMemorandoImpl contenedorMemorando = new ContenedorMemorandoImpl();
		return contenedorMemorando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorandoViewModel createMemorandoViewModel() {
		MemorandoViewModelImpl memorandoViewModel = new MemorandoViewModelImpl();
		return memorandoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimanagerPackage getUimanagerPackage() {
		return (UimanagerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UimanagerPackage getPackage() {
		return UimanagerPackage.eINSTANCE;
	}

} //UimanagerFactoryImpl
