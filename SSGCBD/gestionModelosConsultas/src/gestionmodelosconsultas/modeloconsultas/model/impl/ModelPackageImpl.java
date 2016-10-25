/**
 */
package gestionmodelosconsultas.modeloconsultas.model.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;
import gestionmodelosconsultas.datatypes.DatatypesPackage;
import gestionmodelosconsultas.datatypes.impl.DatatypesPackageImpl;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl;
import gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl;
import gestionmodelosconsultas.memoms.MemomsPackage;
import gestionmodelosconsultas.memoms.comunicacion.Comunicacion;
import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;
import gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl;
import gestionmodelosconsultas.memoms.impl.MemomsPackageImpl;
import gestionmodelosconsultas.memoms.info.InfoPackage;
import gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;
import gestionmodelosconsultas.modeloconsultas.como.ActividadProceso;
import gestionmodelosconsultas.modeloconsultas.como.ComoPackage;
import gestionmodelosconsultas.modeloconsultas.como.InstanciaProceso;
import gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl;
import gestionmodelosconsultas.modeloconsultas.cuando.CuandoPackage;
import gestionmodelosconsultas.modeloconsultas.cuando.impl.CuandoPackageImpl;
import gestionmodelosconsultas.modeloconsultas.donde.Armario;
import gestionmodelosconsultas.modeloconsultas.donde.Deposito;
import gestionmodelosconsultas.modeloconsultas.donde.Disco;
import gestionmodelosconsultas.modeloconsultas.donde.DondePackage;
import gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl;
import gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl;
import gestionmodelosconsultas.modeloconsultas.model.Campo;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.NombreCampo;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;
import gestionmodelosconsultas.modeloconsultas.model.ViewModel;
import gestionmodelosconsultas.modeloconsultas.que.Documento;
import gestionmodelosconsultas.modeloconsultas.que.QuePackage;
import gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl;
import gestionmodelosconsultas.modeloconsultas.quien.Actor;
import gestionmodelosconsultas.modeloconsultas.quien.Contacto;
import gestionmodelosconsultas.modeloconsultas.quien.Quien;
import gestionmodelosconsultas.modeloconsultas.quien.QuienPackage;
import gestionmodelosconsultas.modeloconsultas.quien.Rol;
import gestionmodelosconsultas.modeloconsultas.quien.UnidadOrganizacional;
import gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoPackageImpl;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.ResultdondePackageImpl;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultquePackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ResultquePackageImpl;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.ResultquienPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ResultquienPackageImpl;
import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;
import gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl;
import gestionmodelosconsultas.sysinfo.SysinfoPackage;
import gestionmodelosconsultas.sysinfo.core.CorePackage;
import gestionmodelosconsultas.sysinfo.core.impl.CorePackageImpl;
import gestionmodelosconsultas.sysinfo.data.DataPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl;
import gestionmodelosconsultas.sysinfo.data.impl.DataPackageImpl;
import gestionmodelosconsultas.sysinfo.function.FunctionPackage;
import gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl;
import gestionmodelosconsultas.sysinfo.impl.SysinfoPackageImpl;
import gestionmodelosconsultas.sysinfo.network.NetworkPackage;
import gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl;
import gestionmodelosconsultas.sysinfo.time.TimePackage;
import gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl;
import gestionmodelosconsultas.sysinfo.vision.VisionPackage;
import gestionmodelosconsultas.sysinfo.vision.impl.VisionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoConsultaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proyeccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nombreCampoEEnum = null;

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
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		SysinfoPackageImpl theSysinfoPackage = (SysinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI) instanceof SysinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI) : SysinfoPackage.eINSTANCE);
		PeoplePackageImpl thePeoplePackage = (PeoplePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PeoplePackage.eNS_URI) instanceof PeoplePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PeoplePackage.eNS_URI) : PeoplePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		DocmgtPackageImpl theDocmgtPackage = (DocmgtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocmgtPackage.eNS_URI) instanceof DocmgtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocmgtPackage.eNS_URI) : DocmgtPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI) instanceof FunctionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI) : FunctionPackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);
		VisionPackageImpl theVisionPackage = (VisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisionPackage.eNS_URI) instanceof VisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisionPackage.eNS_URI) : VisionPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) : ModeloconsultasPackage.eINSTANCE);
		QuePackageImpl theQuePackage = (QuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuePackage.eNS_URI) instanceof QuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuePackage.eNS_URI) : QuePackage.eINSTANCE);
		QuienPackageImpl theQuienPackage = (QuienPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuienPackage.eNS_URI) instanceof QuienPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuienPackage.eNS_URI) : QuienPackage.eINSTANCE);
		ComoPackageImpl theComoPackage = (ComoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComoPackage.eNS_URI) instanceof ComoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComoPackage.eNS_URI) : ComoPackage.eINSTANCE);
		CuandoPackageImpl theCuandoPackage = (CuandoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CuandoPackage.eNS_URI) instanceof CuandoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CuandoPackage.eNS_URI) : CuandoPackage.eINSTANCE);
		DondePackageImpl theDondePackage = (DondePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DondePackage.eNS_URI) instanceof DondePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DondePackage.eNS_URI) : DondePackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		ResultquienPackageImpl theResultquienPackage = (ResultquienPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultquienPackage.eNS_URI) instanceof ResultquienPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultquienPackage.eNS_URI) : ResultquienPackage.eINSTANCE);
		ResultquePackageImpl theResultquePackage = (ResultquePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultquePackage.eNS_URI) instanceof ResultquePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultquePackage.eNS_URI) : ResultquePackage.eINSTANCE);
		ResultdondePackageImpl theResultdondePackage = (ResultdondePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultdondePackage.eNS_URI) instanceof ResultdondePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultdondePackage.eNS_URI) : ResultdondePackage.eINSTANCE);
		ResultcomoPackageImpl theResultcomoPackage = (ResultcomoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcomoPackage.eNS_URI) instanceof ResultcomoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcomoPackage.eNS_URI) : ResultcomoPackage.eINSTANCE);
		MemomsPackageImpl theMemomsPackage = (MemomsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI) instanceof MemomsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI) : MemomsPackage.eINSTANCE);
		InfoPackageImpl theInfoPackage = (InfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) instanceof InfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) : InfoPackage.eINSTANCE);
		ComunicacionPackageImpl theComunicacionPackage = (ComunicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) instanceof ComunicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) : ComunicacionPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theSysinfoPackage.createPackageContents();
		thePeoplePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theDocmgtPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theFunctionPackage.createPackageContents();
		theTimePackage.createPackageContents();
		theVisionPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theModeloconsultasPackage.createPackageContents();
		theQuePackage.createPackageContents();
		theQuienPackage.createPackageContents();
		theComoPackage.createPackageContents();
		theCuandoPackage.createPackageContents();
		theDondePackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theResultquienPackage.createPackageContents();
		theResultquePackage.createPackageContents();
		theResultdondePackage.createPackageContents();
		theResultcomoPackage.createPackageContents();
		theMemomsPackage.createPackageContents();
		theInfoPackage.createPackageContents();
		theComunicacionPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theSysinfoPackage.initializePackageContents();
		thePeoplePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theDocmgtPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theFunctionPackage.initializePackageContents();
		theTimePackage.initializePackageContents();
		theVisionPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theModeloconsultasPackage.initializePackageContents();
		theQuePackage.initializePackageContents();
		theQuienPackage.initializePackageContents();
		theComoPackage.initializePackageContents();
		theCuandoPackage.initializePackageContents();
		theDondePackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theResultquienPackage.initializePackageContents();
		theResultquePackage.initializePackageContents();
		theResultdondePackage.initializePackageContents();
		theResultcomoPackage.initializePackageContents();
		theMemomsPackage.initializePackageContents();
		theInfoPackage.initializePackageContents();
		theComunicacionPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Estereotipo() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Order() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_EADiagram() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Target() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Source() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampo() {
		return campoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_NombreCampo() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Criterio() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Seleccion() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampo_OwnedElementoConsulta() {
		return (EReference)campoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEADiagram() {
		return eaDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagram_Nombre() {
		return (EAttribute)eaDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_ListRelacion() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_ModeloConsulta() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_ListElementoConsulta() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModel() {
		return viewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoConsulta() {
		return elementoConsultaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoConsulta_Order() {
		return (EAttribute)elementoConsultaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoConsulta_EADiagram() {
		return (EReference)elementoConsultaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoConsulta_ListCampos() {
		return (EReference)elementoConsultaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProyeccion() {
		return proyeccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNombreCampo() {
		return nombreCampoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		relacionEClass = createEClass(RELACION);
		createEAttribute(relacionEClass, RELACION__ESTEREOTIPO);
		createEAttribute(relacionEClass, RELACION__ORDER);
		createEReference(relacionEClass, RELACION__EA_DIAGRAM);
		createEReference(relacionEClass, RELACION__TARGET);
		createEReference(relacionEClass, RELACION__SOURCE);

		campoEClass = createEClass(CAMPO);
		createEAttribute(campoEClass, CAMPO__NOMBRE_CAMPO);
		createEAttribute(campoEClass, CAMPO__CRITERIO);
		createEAttribute(campoEClass, CAMPO__SELECCION);
		createEReference(campoEClass, CAMPO__OWNED_ELEMENTO_CONSULTA);

		eaDiagramEClass = createEClass(EA_DIAGRAM);
		createEAttribute(eaDiagramEClass, EA_DIAGRAM__NOMBRE);
		createEReference(eaDiagramEClass, EA_DIAGRAM__LIST_RELACION);
		createEReference(eaDiagramEClass, EA_DIAGRAM__MODELO_CONSULTA);
		createEReference(eaDiagramEClass, EA_DIAGRAM__LIST_ELEMENTO_CONSULTA);

		viewModelEClass = createEClass(VIEW_MODEL);

		elementoConsultaEClass = createEClass(ELEMENTO_CONSULTA);
		createEAttribute(elementoConsultaEClass, ELEMENTO_CONSULTA__ORDER);
		createEReference(elementoConsultaEClass, ELEMENTO_CONSULTA__EA_DIAGRAM);
		createEReference(elementoConsultaEClass, ELEMENTO_CONSULTA__LIST_CAMPOS);

		proyeccionEClass = createEClass(PROYECCION);

		// Create enums
		nombreCampoEEnum = createEEnum(NOMBRE_CAMPO);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ModeloconsultasPackage theModeloconsultasPackage = (ModeloconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relacionEClass.getESuperTypes().add(theCorePackage.getElementoModelo());
		viewModelEClass.getESuperTypes().add(this.getEADiagram());
		elementoConsultaEClass.getESuperTypes().add(theCorePackage.getElementoModelo());
		proyeccionEClass.getESuperTypes().add(this.getEADiagram());

		// Initialize classes, features, and operations; add parameters
		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacion_Estereotipo(), ecorePackage.getEString(), "estereotipo", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Order(), ecorePackage.getEIntegerObject(), "order", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_EADiagram(), this.getEADiagram(), this.getEADiagram_ListRelacion(), "EADiagram", null, 0, 1, Relacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Target(), this.getElementoConsulta(), null, "target", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Source(), this.getElementoConsulta(), null, "source", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoEClass, Campo.class, "Campo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampo_NombreCampo(), this.getNombreCampo(), "nombreCampo", "default", 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampo_Criterio(), ecorePackage.getEString(), "criterio", null, 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampo_Seleccion(), ecorePackage.getEBoolean(), "seleccion", "false", 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampo_OwnedElementoConsulta(), this.getElementoConsulta(), this.getElementoConsulta_ListCampos(), "ownedElementoConsulta", null, 0, 1, Campo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaDiagramEClass, EADiagram.class, "EADiagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEADiagram_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_ListRelacion(), this.getRelacion(), this.getRelacion_EADiagram(), "listRelacion", null, 0, -1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_ModeloConsulta(), theModeloconsultasPackage.getModeloConsulta(), theModeloconsultasPackage.getModeloConsulta_ListEADiagram(), "ModeloConsulta", null, 0, 1, EADiagram.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_ListElementoConsulta(), this.getElementoConsulta(), this.getElementoConsulta_EADiagram(), "listElementoConsulta", null, 0, -1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewModelEClass, ViewModel.class, "ViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementoConsultaEClass, ElementoConsulta.class, "ElementoConsulta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoConsulta_Order(), ecorePackage.getEIntegerObject(), "order", null, 0, 1, ElementoConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoConsulta_EADiagram(), this.getEADiagram(), this.getEADiagram_ListElementoConsulta(), "EADiagram", null, 0, 1, ElementoConsulta.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoConsulta_ListCampos(), this.getCampo(), this.getCampo_OwnedElementoConsulta(), "listCampos", null, 0, -1, ElementoConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proyeccionEClass, Proyeccion.class, "Proyeccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_UNIDAD_ORGANIZACIONAL);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ACTIVIDAD_PROCESO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.FECHA_INICIO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.FECHA_FIN);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ROL);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ACTOR);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.APELLIDO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.EMAIL);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_INSTANCIA_PROCESO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_CONTACTO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.USERNAME);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TELEFONO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.PASSWORD);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_DOCUMENTO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TITULO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.EDICION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.VIGENCIA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.FECHA_CREACION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ANEXO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TIPO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.COMENTARIOS);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_DEPOSITO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_QUIEN);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ARMARIO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_DISCO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.REFERENCIA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_COMUNICACION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ASUNTO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
	}
	
	@Override
	public void inizializarEEnum(ElementoConsulta elementoConsulta) {
		// TODO Auto-generated method stub
		if(elementoConsulta instanceof UnidadOrganizacional ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_UNIDAD_ORGANIZACIONAL);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		if(elementoConsulta instanceof Actor ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ACTOR);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.APELLIDO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.EMAIL);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		if(elementoConsulta instanceof Rol ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ROL);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		if(elementoConsulta instanceof Documento ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_DOCUMENTO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TITULO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.EDICION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.VIGENCIA);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.FECHA_CREACION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ANEXO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TIPO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.COMENTARIOS);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		if(elementoConsulta instanceof Deposito ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_DEPOSITO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		if(elementoConsulta instanceof InstanciaProceso ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_INSTANCIA_PROCESO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		if(elementoConsulta instanceof ActividadProceso ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ACTIVIDAD_PROCESO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.FECHA_INICIO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.FECHA_FIN);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		if(elementoConsulta instanceof Contacto ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_CONTACTO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.EMAIL);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.USERNAME);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.PASSWORD);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TELEFONO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		
		if(elementoConsulta instanceof Quien ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_QUIEN);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TIPO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		
		if(elementoConsulta instanceof Disco ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_DISCO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.REFERENCIA);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		
		if(elementoConsulta instanceof Armario ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_ARMARIO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
		
		if(elementoConsulta instanceof Comunicacion ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID_COMUNICACION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ASUNTO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
		}
	}

} //ModelPackageImpl
