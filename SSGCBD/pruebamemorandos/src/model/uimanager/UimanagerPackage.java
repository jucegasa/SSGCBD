/**
 */
package model.uimanager;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.uimanager.UimanagerFactory
 * @model kind="package"
 * @generated
 */
public interface UimanagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uimanager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "model/uimanager.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.uimanager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimanagerPackage eINSTANCE = model.uimanager.impl.UimanagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.uimanager.impl.UIManagerImpl <em>UI Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.uimanager.impl.UIManagerImpl
	 * @see model.uimanager.impl.UimanagerPackageImpl#getUIManager()
	 * @generated
	 */
	int UI_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Owned By Factory Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MANAGER__OWNED_BY_FACTORY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Ventana Memorando View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MANAGER__THE_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>UI Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UI Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.uimanager.impl.VentanaMemorandoViewModelImpl <em>Ventana Memorando View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.uimanager.impl.VentanaMemorandoViewModelImpl
	 * @see model.uimanager.impl.UimanagerPackageImpl#getVentanaMemorandoViewModel()
	 * @generated
	 */
	int VENTANA_MEMORANDO_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Ui Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Informacion Memorando</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Memorando</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO = 2;

	/**
	 * The number of structural features of the '<em>Ventana Memorando View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTANA_MEMORANDO_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ventana Memorando View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTANA_MEMORANDO_VIEW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.uimanager.impl.ContenedorInformacionMemorandoImpl <em>Contenedor Informacion Memorando</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.uimanager.impl.ContenedorInformacionMemorandoImpl
	 * @see model.uimanager.impl.UimanagerPackageImpl#getContenedorInformacionMemorando()
	 * @generated
	 */
	int CONTENEDOR_INFORMACION_MEMORANDO = 2;

	/**
	 * The feature id for the '<em><b>Owned By Ventana Memorando View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Unidado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO = 1;

	/**
	 * The feature id for the '<em><b>Remitente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE = 2;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_MEMORANDO__FECHA = 3;

	/**
	 * The number of structural features of the '<em>Contenedor Informacion Memorando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_MEMORANDO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Contenedor Informacion Memorando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_MEMORANDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.uimanager.impl.ContenedorMemorandoImpl <em>Contenedor Memorando</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.uimanager.impl.ContenedorMemorandoImpl
	 * @see model.uimanager.impl.UimanagerPackageImpl#getContenedorMemorando()
	 * @generated
	 */
	int CONTENEDOR_MEMORANDO = 3;

	/**
	 * The feature id for the '<em><b>Owned By Ventana Memorando View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>List Memorando</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MEMORANDO__LIST_MEMORANDO = 1;

	/**
	 * The number of structural features of the '<em>Contenedor Memorando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MEMORANDO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contenedor Memorando</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MEMORANDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.uimanager.impl.MemorandoViewModelImpl <em>Memorando View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.uimanager.impl.MemorandoViewModelImpl
	 * @see model.uimanager.impl.UimanagerPackageImpl#getMemorandoViewModel()
	 * @generated
	 */
	int MEMORANDO_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Owned By Memorando</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_VIEW_MODEL__ID = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_VIEW_MODEL__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_VIEW_MODEL__HORA = 3;

	/**
	 * The number of structural features of the '<em>Memorando View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Memorando View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORANDO_VIEW_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.uimanager.UIManager <em>UI Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Manager</em>'.
	 * @see model.uimanager.UIManager
	 * @generated
	 */
	EClass getUIManager();

	/**
	 * Returns the meta object for the container reference '{@link model.uimanager.UIManager#getOwnedByFactoryModel <em>Owned By Factory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Factory Model</em>'.
	 * @see model.uimanager.UIManager#getOwnedByFactoryModel()
	 * @see #getUIManager()
	 * @generated
	 */
	EReference getUIManager_OwnedByFactoryModel();

	/**
	 * Returns the meta object for the containment reference '{@link model.uimanager.UIManager#getTheVentanaMemorandoViewModel <em>The Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Ventana Memorando View Model</em>'.
	 * @see model.uimanager.UIManager#getTheVentanaMemorandoViewModel()
	 * @see #getUIManager()
	 * @generated
	 */
	EReference getUIManager_TheVentanaMemorandoViewModel();

	/**
	 * Returns the meta object for the reference '{@link model.uimanager.UIManager#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Domain</em>'.
	 * @see model.uimanager.UIManager#getTheDomain()
	 * @see #getUIManager()
	 * @generated
	 */
	EReference getUIManager_TheDomain();

	/**
	 * Returns the meta object for class '{@link model.uimanager.VentanaMemorandoViewModel <em>Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ventana Memorando View Model</em>'.
	 * @see model.uimanager.VentanaMemorandoViewModel
	 * @generated
	 */
	EClass getVentanaMemorandoViewModel();

	/**
	 * Returns the meta object for the container reference '{@link model.uimanager.VentanaMemorandoViewModel#getTheUiManager <em>The Ui Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Ui Manager</em>'.
	 * @see model.uimanager.VentanaMemorandoViewModel#getTheUiManager()
	 * @see #getVentanaMemorandoViewModel()
	 * @generated
	 */
	EReference getVentanaMemorandoViewModel_TheUiManager();

	/**
	 * Returns the meta object for the containment reference '{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorInformacionMemorando <em>The Contenedor Informacion Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Informacion Memorando</em>'.
	 * @see model.uimanager.VentanaMemorandoViewModel#getTheContenedorInformacionMemorando()
	 * @see #getVentanaMemorandoViewModel()
	 * @generated
	 */
	EReference getVentanaMemorandoViewModel_TheContenedorInformacionMemorando();

	/**
	 * Returns the meta object for the containment reference '{@link model.uimanager.VentanaMemorandoViewModel#getTheContenedorMemorando <em>The Contenedor Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Memorando</em>'.
	 * @see model.uimanager.VentanaMemorandoViewModel#getTheContenedorMemorando()
	 * @see #getVentanaMemorandoViewModel()
	 * @generated
	 */
	EReference getVentanaMemorandoViewModel_TheContenedorMemorando();

	/**
	 * Returns the meta object for class '{@link model.uimanager.ContenedorInformacionMemorando <em>Contenedor Informacion Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Informacion Memorando</em>'.
	 * @see model.uimanager.ContenedorInformacionMemorando
	 * @generated
	 */
	EClass getContenedorInformacionMemorando();

	/**
	 * Returns the meta object for the container reference '{@link model.uimanager.ContenedorInformacionMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Ventana Memorando View Model</em>'.
	 * @see model.uimanager.ContenedorInformacionMemorando#getOwnedByVentanaMemorandoViewModel()
	 * @see #getContenedorInformacionMemorando()
	 * @generated
	 */
	EReference getContenedorInformacionMemorando_OwnedByVentanaMemorandoViewModel();

	/**
	 * Returns the meta object for the attribute '{@link model.uimanager.ContenedorInformacionMemorando#getUnidado <em>Unidado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unidado</em>'.
	 * @see model.uimanager.ContenedorInformacionMemorando#getUnidado()
	 * @see #getContenedorInformacionMemorando()
	 * @generated
	 */
	EAttribute getContenedorInformacionMemorando_Unidado();

	/**
	 * Returns the meta object for the attribute '{@link model.uimanager.ContenedorInformacionMemorando#getRemitente <em>Remitente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remitente</em>'.
	 * @see model.uimanager.ContenedorInformacionMemorando#getRemitente()
	 * @see #getContenedorInformacionMemorando()
	 * @generated
	 */
	EAttribute getContenedorInformacionMemorando_Remitente();

	/**
	 * Returns the meta object for the attribute '{@link model.uimanager.ContenedorInformacionMemorando#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see model.uimanager.ContenedorInformacionMemorando#getFecha()
	 * @see #getContenedorInformacionMemorando()
	 * @generated
	 */
	EAttribute getContenedorInformacionMemorando_Fecha();

	/**
	 * Returns the meta object for class '{@link model.uimanager.ContenedorMemorando <em>Contenedor Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Memorando</em>'.
	 * @see model.uimanager.ContenedorMemorando
	 * @generated
	 */
	EClass getContenedorMemorando();

	/**
	 * Returns the meta object for the container reference '{@link model.uimanager.ContenedorMemorando#getOwnedByVentanaMemorandoViewModel <em>Owned By Ventana Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Ventana Memorando View Model</em>'.
	 * @see model.uimanager.ContenedorMemorando#getOwnedByVentanaMemorandoViewModel()
	 * @see #getContenedorMemorando()
	 * @generated
	 */
	EReference getContenedorMemorando_OwnedByVentanaMemorandoViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link model.uimanager.ContenedorMemorando#getListMemorando <em>List Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Memorando</em>'.
	 * @see model.uimanager.ContenedorMemorando#getListMemorando()
	 * @see #getContenedorMemorando()
	 * @generated
	 */
	EReference getContenedorMemorando_ListMemorando();

	/**
	 * Returns the meta object for class '{@link model.uimanager.MemorandoViewModel <em>Memorando View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memorando View Model</em>'.
	 * @see model.uimanager.MemorandoViewModel
	 * @generated
	 */
	EClass getMemorandoViewModel();

	/**
	 * Returns the meta object for the container reference '{@link model.uimanager.MemorandoViewModel#getOwnedByMemorando <em>Owned By Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Memorando</em>'.
	 * @see model.uimanager.MemorandoViewModel#getOwnedByMemorando()
	 * @see #getMemorandoViewModel()
	 * @generated
	 */
	EReference getMemorandoViewModel_OwnedByMemorando();

	/**
	 * Returns the meta object for the attribute '{@link model.uimanager.MemorandoViewModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.uimanager.MemorandoViewModel#getId()
	 * @see #getMemorandoViewModel()
	 * @generated
	 */
	EAttribute getMemorandoViewModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.uimanager.MemorandoViewModel#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see model.uimanager.MemorandoViewModel#getTipo()
	 * @see #getMemorandoViewModel()
	 * @generated
	 */
	EAttribute getMemorandoViewModel_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link model.uimanager.MemorandoViewModel#getHora <em>Hora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora</em>'.
	 * @see model.uimanager.MemorandoViewModel#getHora()
	 * @see #getMemorandoViewModel()
	 * @generated
	 */
	EAttribute getMemorandoViewModel_Hora();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UimanagerFactory getUimanagerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.uimanager.impl.UIManagerImpl <em>UI Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.uimanager.impl.UIManagerImpl
		 * @see model.uimanager.impl.UimanagerPackageImpl#getUIManager()
		 * @generated
		 */
		EClass UI_MANAGER = eINSTANCE.getUIManager();

		/**
		 * The meta object literal for the '<em><b>Owned By Factory Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MANAGER__OWNED_BY_FACTORY_MODEL = eINSTANCE.getUIManager_OwnedByFactoryModel();

		/**
		 * The meta object literal for the '<em><b>The Ventana Memorando View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL = eINSTANCE.getUIManager_TheVentanaMemorandoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MANAGER__THE_DOMAIN = eINSTANCE.getUIManager_TheDomain();

		/**
		 * The meta object literal for the '{@link model.uimanager.impl.VentanaMemorandoViewModelImpl <em>Ventana Memorando View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.uimanager.impl.VentanaMemorandoViewModelImpl
		 * @see model.uimanager.impl.UimanagerPackageImpl#getVentanaMemorandoViewModel()
		 * @generated
		 */
		EClass VENTANA_MEMORANDO_VIEW_MODEL = eINSTANCE.getVentanaMemorandoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Ui Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER = eINSTANCE.getVentanaMemorandoViewModel_TheUiManager();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Informacion Memorando</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO = eINSTANCE.getVentanaMemorandoViewModel_TheContenedorInformacionMemorando();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Memorando</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO = eINSTANCE.getVentanaMemorandoViewModel_TheContenedorMemorando();

		/**
		 * The meta object literal for the '{@link model.uimanager.impl.ContenedorInformacionMemorandoImpl <em>Contenedor Informacion Memorando</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.uimanager.impl.ContenedorInformacionMemorandoImpl
		 * @see model.uimanager.impl.UimanagerPackageImpl#getContenedorInformacionMemorando()
		 * @generated
		 */
		EClass CONTENEDOR_INFORMACION_MEMORANDO = eINSTANCE.getContenedorInformacionMemorando();

		/**
		 * The meta object literal for the '<em><b>Owned By Ventana Memorando View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL = eINSTANCE.getContenedorInformacionMemorando_OwnedByVentanaMemorandoViewModel();

		/**
		 * The meta object literal for the '<em><b>Unidado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO = eINSTANCE.getContenedorInformacionMemorando_Unidado();

		/**
		 * The meta object literal for the '<em><b>Remitente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE = eINSTANCE.getContenedorInformacionMemorando_Remitente();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_MEMORANDO__FECHA = eINSTANCE.getContenedorInformacionMemorando_Fecha();

		/**
		 * The meta object literal for the '{@link model.uimanager.impl.ContenedorMemorandoImpl <em>Contenedor Memorando</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.uimanager.impl.ContenedorMemorandoImpl
		 * @see model.uimanager.impl.UimanagerPackageImpl#getContenedorMemorando()
		 * @generated
		 */
		EClass CONTENEDOR_MEMORANDO = eINSTANCE.getContenedorMemorando();

		/**
		 * The meta object literal for the '<em><b>Owned By Ventana Memorando View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL = eINSTANCE.getContenedorMemorando_OwnedByVentanaMemorandoViewModel();

		/**
		 * The meta object literal for the '<em><b>List Memorando</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MEMORANDO__LIST_MEMORANDO = eINSTANCE.getContenedorMemorando_ListMemorando();

		/**
		 * The meta object literal for the '{@link model.uimanager.impl.MemorandoViewModelImpl <em>Memorando View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.uimanager.impl.MemorandoViewModelImpl
		 * @see model.uimanager.impl.UimanagerPackageImpl#getMemorandoViewModel()
		 * @generated
		 */
		EClass MEMORANDO_VIEW_MODEL = eINSTANCE.getMemorandoViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Memorando</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO = eINSTANCE.getMemorandoViewModel_OwnedByMemorando();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORANDO_VIEW_MODEL__ID = eINSTANCE.getMemorandoViewModel_Id();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORANDO_VIEW_MODEL__TIPO = eINSTANCE.getMemorandoViewModel_Tipo();

		/**
		 * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORANDO_VIEW_MODEL__HORA = eINSTANCE.getMemorandoViewModel_Hora();

	}

} //UimanagerPackage
