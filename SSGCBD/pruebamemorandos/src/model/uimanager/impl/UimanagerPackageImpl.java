/**
 */
package model.uimanager.impl;

import model.ModelPackage;

import model.datatypes.DatatypesPackage;

import model.datatypes.impl.DatatypesPackageImpl;

import model.domain.DomainPackage;

import model.domain.impl.DomainPackageImpl;

import model.impl.ModelPackageImpl;

import model.uimanager.ContenedorInformacionMemorando;
import model.uimanager.ContenedorMemorando;
import model.uimanager.MemorandoViewModel;
import model.uimanager.UIManager;
import model.uimanager.UimanagerFactory;
import model.uimanager.UimanagerPackage;
import model.uimanager.VentanaMemorandoViewModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UimanagerPackageImpl extends EPackageImpl implements UimanagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ventanaMemorandoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorInformacionMemorandoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorMemorandoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memorandoViewModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.uimanager.UimanagerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UimanagerPackageImpl() {
		super(eNS_URI, UimanagerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UimanagerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UimanagerPackage init() {
		if (isInited) return (UimanagerPackage)EPackage.Registry.INSTANCE.getEPackage(UimanagerPackage.eNS_URI);

		// Obtain or create and register package
		UimanagerPackageImpl theUimanagerPackage = (UimanagerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UimanagerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UimanagerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theUimanagerPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theUimanagerPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUimanagerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UimanagerPackage.eNS_URI, theUimanagerPackage);
		return theUimanagerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIManager() {
		return uiManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIManager_OwnedByFactoryModel() {
		return (EReference)uiManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIManager_TheVentanaMemorandoViewModel() {
		return (EReference)uiManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIManager_TheDomain() {
		return (EReference)uiManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVentanaMemorandoViewModel() {
		return ventanaMemorandoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVentanaMemorandoViewModel_TheUiManager() {
		return (EReference)ventanaMemorandoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVentanaMemorandoViewModel_TheContenedorInformacionMemorando() {
		return (EReference)ventanaMemorandoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVentanaMemorandoViewModel_TheContenedorMemorando() {
		return (EReference)ventanaMemorandoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorInformacionMemorando() {
		return contenedorInformacionMemorandoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorInformacionMemorando_OwnedByVentanaMemorandoViewModel() {
		return (EReference)contenedorInformacionMemorandoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformacionMemorando_Unidado() {
		return (EAttribute)contenedorInformacionMemorandoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformacionMemorando_Remitente() {
		return (EAttribute)contenedorInformacionMemorandoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformacionMemorando_Fecha() {
		return (EAttribute)contenedorInformacionMemorandoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorMemorando() {
		return contenedorMemorandoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMemorando_OwnedByVentanaMemorandoViewModel() {
		return (EReference)contenedorMemorandoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMemorando_ListMemorando() {
		return (EReference)contenedorMemorandoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemorandoViewModel() {
		return memorandoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemorandoViewModel_OwnedByMemorando() {
		return (EReference)memorandoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemorandoViewModel_Id() {
		return (EAttribute)memorandoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemorandoViewModel_Tipo() {
		return (EAttribute)memorandoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemorandoViewModel_Hora() {
		return (EAttribute)memorandoViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimanagerFactory getUimanagerFactory() {
		return (UimanagerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uiManagerEClass = createEClass(UI_MANAGER);
		createEReference(uiManagerEClass, UI_MANAGER__OWNED_BY_FACTORY_MODEL);
		createEReference(uiManagerEClass, UI_MANAGER__THE_VENTANA_MEMORANDO_VIEW_MODEL);
		createEReference(uiManagerEClass, UI_MANAGER__THE_DOMAIN);

		ventanaMemorandoViewModelEClass = createEClass(VENTANA_MEMORANDO_VIEW_MODEL);
		createEReference(ventanaMemorandoViewModelEClass, VENTANA_MEMORANDO_VIEW_MODEL__THE_UI_MANAGER);
		createEReference(ventanaMemorandoViewModelEClass, VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_MEMORANDO);
		createEReference(ventanaMemorandoViewModelEClass, VENTANA_MEMORANDO_VIEW_MODEL__THE_CONTENEDOR_MEMORANDO);

		contenedorInformacionMemorandoEClass = createEClass(CONTENEDOR_INFORMACION_MEMORANDO);
		createEReference(contenedorInformacionMemorandoEClass, CONTENEDOR_INFORMACION_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL);
		createEAttribute(contenedorInformacionMemorandoEClass, CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO);
		createEAttribute(contenedorInformacionMemorandoEClass, CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE);
		createEAttribute(contenedorInformacionMemorandoEClass, CONTENEDOR_INFORMACION_MEMORANDO__FECHA);

		contenedorMemorandoEClass = createEClass(CONTENEDOR_MEMORANDO);
		createEReference(contenedorMemorandoEClass, CONTENEDOR_MEMORANDO__OWNED_BY_VENTANA_MEMORANDO_VIEW_MODEL);
		createEReference(contenedorMemorandoEClass, CONTENEDOR_MEMORANDO__LIST_MEMORANDO);

		memorandoViewModelEClass = createEClass(MEMORANDO_VIEW_MODEL);
		createEReference(memorandoViewModelEClass, MEMORANDO_VIEW_MODEL__OWNED_BY_MEMORANDO);
		createEAttribute(memorandoViewModelEClass, MEMORANDO_VIEW_MODEL__ID);
		createEAttribute(memorandoViewModelEClass, MEMORANDO_VIEW_MODEL__TIPO);
		createEAttribute(memorandoViewModelEClass, MEMORANDO_VIEW_MODEL__HORA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(uiManagerEClass, UIManager.class, "UIManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIManager_OwnedByFactoryModel(), theModelPackage.getFactoryModel(), theModelPackage.getFactoryModel_TheUIManager(), "ownedByFactoryModel", null, 1, 1, UIManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIManager_TheVentanaMemorandoViewModel(), this.getVentanaMemorandoViewModel(), this.getVentanaMemorandoViewModel_TheUiManager(), "theVentanaMemorandoViewModel", null, 1, 1, UIManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIManager_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheUIManager(), "theDomain", null, 1, 1, UIManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ventanaMemorandoViewModelEClass, VentanaMemorandoViewModel.class, "VentanaMemorandoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVentanaMemorandoViewModel_TheUiManager(), this.getUIManager(), this.getUIManager_TheVentanaMemorandoViewModel(), "theUiManager", null, 1, 1, VentanaMemorandoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVentanaMemorandoViewModel_TheContenedorInformacionMemorando(), this.getContenedorInformacionMemorando(), this.getContenedorInformacionMemorando_OwnedByVentanaMemorandoViewModel(), "theContenedorInformacionMemorando", null, 1, 1, VentanaMemorandoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVentanaMemorandoViewModel_TheContenedorMemorando(), this.getContenedorMemorando(), this.getContenedorMemorando_OwnedByVentanaMemorandoViewModel(), "theContenedorMemorando", null, 1, 1, VentanaMemorandoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorInformacionMemorandoEClass, ContenedorInformacionMemorando.class, "ContenedorInformacionMemorando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorInformacionMemorando_OwnedByVentanaMemorandoViewModel(), this.getVentanaMemorandoViewModel(), this.getVentanaMemorandoViewModel_TheContenedorInformacionMemorando(), "ownedByVentanaMemorandoViewModel", null, 1, 1, ContenedorInformacionMemorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformacionMemorando_Unidado(), theModelPackage.getString(), "unidado", null, 0, 1, ContenedorInformacionMemorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformacionMemorando_Remitente(), theModelPackage.getString(), "remitente", null, 0, 1, ContenedorInformacionMemorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformacionMemorando_Fecha(), theModelPackage.getString(), "fecha", null, 0, 1, ContenedorInformacionMemorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorMemorandoEClass, ContenedorMemorando.class, "ContenedorMemorando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorMemorando_OwnedByVentanaMemorandoViewModel(), this.getVentanaMemorandoViewModel(), this.getVentanaMemorandoViewModel_TheContenedorMemorando(), "ownedByVentanaMemorandoViewModel", null, 1, 1, ContenedorMemorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMemorando_ListMemorando(), this.getMemorandoViewModel(), this.getMemorandoViewModel_OwnedByMemorando(), "listMemorando", null, 0, -1, ContenedorMemorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memorandoViewModelEClass, MemorandoViewModel.class, "MemorandoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemorandoViewModel_OwnedByMemorando(), this.getContenedorMemorando(), this.getContenedorMemorando_ListMemorando(), "ownedByMemorando", null, 1, 1, MemorandoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemorandoViewModel_Id(), theModelPackage.getString(), "id", null, 0, 1, MemorandoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemorandoViewModel_Tipo(), theModelPackage.getString(), "tipo", null, 0, 1, MemorandoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemorandoViewModel_Hora(), theModelPackage.getString(), "hora", null, 0, 1, MemorandoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //UimanagerPackageImpl
