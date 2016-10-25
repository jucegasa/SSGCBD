/**
 */
package model.uimanager;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.uimanager.UimanagerPackage
 * @generated
 */
public interface UimanagerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimanagerFactory eINSTANCE = model.uimanager.impl.UimanagerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UI Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Manager</em>'.
	 * @generated
	 */
	UIManager createUIManager();

	/**
	 * Returns a new object of class '<em>Ventana Memorando View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ventana Memorando View Model</em>'.
	 * @generated
	 */
	VentanaMemorandoViewModel createVentanaMemorandoViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Informacion Memorando</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Informacion Memorando</em>'.
	 * @generated
	 */
	ContenedorInformacionMemorando createContenedorInformacionMemorando();

	/**
	 * Returns a new object of class '<em>Contenedor Memorando</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Memorando</em>'.
	 * @generated
	 */
	ContenedorMemorando createContenedorMemorando();

	/**
	 * Returns a new object of class '<em>Memorando View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memorando View Model</em>'.
	 * @generated
	 */
	MemorandoViewModel createMemorandoViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UimanagerPackage getUimanagerPackage();

} //UimanagerFactory
