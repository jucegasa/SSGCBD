/**
 */
package model.uimanager.util;

import model.uimanager.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.uimanager.UimanagerPackage
 * @generated
 */
public class UimanagerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UimanagerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimanagerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UimanagerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UimanagerSwitch<Adapter> modelSwitch =
		new UimanagerSwitch<Adapter>() {
			@Override
			public Adapter caseUIManager(UIManager object) {
				return createUIManagerAdapter();
			}
			@Override
			public Adapter caseVentanaMemorandoViewModel(VentanaMemorandoViewModel object) {
				return createVentanaMemorandoViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorInformacionMemorando(ContenedorInformacionMemorando object) {
				return createContenedorInformacionMemorandoAdapter();
			}
			@Override
			public Adapter caseContenedorMemorando(ContenedorMemorando object) {
				return createContenedorMemorandoAdapter();
			}
			@Override
			public Adapter caseMemorandoViewModel(MemorandoViewModel object) {
				return createMemorandoViewModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.uimanager.UIManager <em>UI Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.uimanager.UIManager
	 * @generated
	 */
	public Adapter createUIManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.uimanager.VentanaMemorandoViewModel <em>Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.uimanager.VentanaMemorandoViewModel
	 * @generated
	 */
	public Adapter createVentanaMemorandoViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.uimanager.ContenedorInformacionMemorando <em>Contenedor Informacion Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.uimanager.ContenedorInformacionMemorando
	 * @generated
	 */
	public Adapter createContenedorInformacionMemorandoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.uimanager.ContenedorMemorando <em>Contenedor Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.uimanager.ContenedorMemorando
	 * @generated
	 */
	public Adapter createContenedorMemorandoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.uimanager.MemorandoViewModel <em>Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.uimanager.MemorandoViewModel
	 * @generated
	 */
	public Adapter createMemorandoViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UimanagerAdapterFactory
