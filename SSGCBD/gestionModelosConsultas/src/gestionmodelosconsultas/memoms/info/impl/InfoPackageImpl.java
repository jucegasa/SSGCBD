/**
 */
package gestionmodelosconsultas.memoms.info.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;

import gestionmodelosconsultas.datatypes.DatatypesPackage;

import gestionmodelosconsultas.datatypes.impl.DatatypesPackageImpl;

import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl;

import gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl;

import gestionmodelosconsultas.memoms.MemomsPackage;

import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;

import gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl;

import gestionmodelosconsultas.memoms.impl.MemomsPackageImpl;

import gestionmodelosconsultas.memoms.info.Actividad;
import gestionmodelosconsultas.memoms.info.Anexo;
import gestionmodelosconsultas.memoms.info.Expediente;
import gestionmodelosconsultas.memoms.info.InfoFactory;
import gestionmodelosconsultas.memoms.info.InfoPackage;
import gestionmodelosconsultas.memoms.info.Observacion;
import gestionmodelosconsultas.memoms.info.SerieDocumental;
import gestionmodelosconsultas.memoms.info.TablaRetencionDocumental;

import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.modeloconsultas.como.ComoPackage;

import gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl;

import gestionmodelosconsultas.modeloconsultas.cuando.CuandoPackage;

import gestionmodelosconsultas.modeloconsultas.cuando.impl.CuandoPackageImpl;

import gestionmodelosconsultas.modeloconsultas.donde.DondePackage;

import gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl;

import gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl;

import gestionmodelosconsultas.modeloconsultas.que.QuePackage;

import gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl;

import gestionmodelosconsultas.modeloconsultas.quien.QuienPackage;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfoPackageImpl extends EPackageImpl implements InfoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expedienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anexoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablaRetencionDocumentalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serieDocumentalEClass = null;

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
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfoPackageImpl() {
		super(eNS_URI, InfoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InfoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InfoPackage init() {
		if (isInited) return (InfoPackage)EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI);

		// Obtain or create and register package
		InfoPackageImpl theInfoPackage = (InfoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfoPackageImpl());

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
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		ResultquienPackageImpl theResultquienPackage = (ResultquienPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultquienPackage.eNS_URI) instanceof ResultquienPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultquienPackage.eNS_URI) : ResultquienPackage.eINSTANCE);
		ResultquePackageImpl theResultquePackage = (ResultquePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultquePackage.eNS_URI) instanceof ResultquePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultquePackage.eNS_URI) : ResultquePackage.eINSTANCE);
		ResultdondePackageImpl theResultdondePackage = (ResultdondePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultdondePackage.eNS_URI) instanceof ResultdondePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultdondePackage.eNS_URI) : ResultdondePackage.eINSTANCE);
		ResultcomoPackageImpl theResultcomoPackage = (ResultcomoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcomoPackage.eNS_URI) instanceof ResultcomoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcomoPackage.eNS_URI) : ResultcomoPackage.eINSTANCE);
		MemomsPackageImpl theMemomsPackage = (MemomsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI) instanceof MemomsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI) : MemomsPackage.eINSTANCE);
		ComunicacionPackageImpl theComunicacionPackage = (ComunicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) instanceof ComunicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) : ComunicacionPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theInfoPackage.createPackageContents();
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
		theModelPackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theResultquienPackage.createPackageContents();
		theResultquePackage.createPackageContents();
		theResultdondePackage.createPackageContents();
		theResultcomoPackage.createPackageContents();
		theMemomsPackage.createPackageContents();
		theComunicacionPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theInfoPackage.initializePackageContents();
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
		theModelPackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theResultquienPackage.initializePackageContents();
		theResultquePackage.initializePackageContents();
		theResultdondePackage.initializePackageContents();
		theResultcomoPackage.initializePackageContents();
		theMemomsPackage.initializePackageContents();
		theComunicacionPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInfoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfoPackage.eNS_URI, theInfoPackage);
		return theInfoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservacion() {
		return observacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservacion_Documento() {
		return (EReference)observacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservacion_Observacion() {
		return (EAttribute)observacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservacion_Check() {
		return (EAttribute)observacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpediente() {
		return expedienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpediente_Documento() {
		return (EReference)expedienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnexo() {
		return anexoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnexo_Documento() {
		return (EReference)anexoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnexo_Id() {
		return (EAttribute)anexoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnexo_Archivo() {
		return (EAttribute)anexoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividad() {
		return actividadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividad_Memorando() {
		return (EReference)actividadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividad_MemoFactory() {
		return (EReference)actividadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividad_Id() {
		return (EAttribute)actividadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividad_Descripcion() {
		return (EAttribute)actividadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividad_Estado() {
		return (EAttribute)actividadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTablaRetencionDocumental() {
		return tablaRetencionDocumentalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTablaRetencionDocumental_Documento() {
		return (EReference)tablaRetencionDocumentalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTablaRetencionDocumental_SerieDocumental() {
		return (EReference)tablaRetencionDocumentalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTablaRetencionDocumental_MemoFactory() {
		return (EReference)tablaRetencionDocumentalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTablaRetencionDocumental_Descripcion() {
		return (EAttribute)tablaRetencionDocumentalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerieDocumental() {
		return serieDocumentalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerieDocumental_TablaRetencionDocumental() {
		return (EReference)serieDocumentalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerieDocumental_Subserie() {
		return (EReference)serieDocumentalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerieDocumental_Serie() {
		return (EReference)serieDocumentalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerieDocumental_Codigo() {
		return (EAttribute)serieDocumentalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerieDocumental_Nombre() {
		return (EAttribute)serieDocumentalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerieDocumental_RetencionAnios() {
		return (EAttribute)serieDocumentalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerieDocumental_DisposicionFinal() {
		return (EAttribute)serieDocumentalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerieDocumental_Descripcion() {
		return (EAttribute)serieDocumentalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoFactory getInfoFactory() {
		return (InfoFactory)getEFactoryInstance();
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
		observacionEClass = createEClass(OBSERVACION);
		createEReference(observacionEClass, OBSERVACION__DOCUMENTO);
		createEAttribute(observacionEClass, OBSERVACION__OBSERVACION);
		createEAttribute(observacionEClass, OBSERVACION__CHECK);

		expedienteEClass = createEClass(EXPEDIENTE);
		createEReference(expedienteEClass, EXPEDIENTE__DOCUMENTO);

		anexoEClass = createEClass(ANEXO);
		createEReference(anexoEClass, ANEXO__DOCUMENTO);
		createEAttribute(anexoEClass, ANEXO__ID);
		createEAttribute(anexoEClass, ANEXO__ARCHIVO);

		actividadEClass = createEClass(ACTIVIDAD);
		createEReference(actividadEClass, ACTIVIDAD__MEMORANDO);
		createEReference(actividadEClass, ACTIVIDAD__MEMO_FACTORY);
		createEAttribute(actividadEClass, ACTIVIDAD__ID);
		createEAttribute(actividadEClass, ACTIVIDAD__DESCRIPCION);
		createEAttribute(actividadEClass, ACTIVIDAD__ESTADO);

		tablaRetencionDocumentalEClass = createEClass(TABLA_RETENCION_DOCUMENTAL);
		createEReference(tablaRetencionDocumentalEClass, TABLA_RETENCION_DOCUMENTAL__DOCUMENTO);
		createEReference(tablaRetencionDocumentalEClass, TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL);
		createEReference(tablaRetencionDocumentalEClass, TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY);
		createEAttribute(tablaRetencionDocumentalEClass, TABLA_RETENCION_DOCUMENTAL__DESCRIPCION);

		serieDocumentalEClass = createEClass(SERIE_DOCUMENTAL);
		createEReference(serieDocumentalEClass, SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL);
		createEReference(serieDocumentalEClass, SERIE_DOCUMENTAL__SUBSERIE);
		createEReference(serieDocumentalEClass, SERIE_DOCUMENTAL__SERIE);
		createEAttribute(serieDocumentalEClass, SERIE_DOCUMENTAL__CODIGO);
		createEAttribute(serieDocumentalEClass, SERIE_DOCUMENTAL__NOMBRE);
		createEAttribute(serieDocumentalEClass, SERIE_DOCUMENTAL__RETENCION_ANIOS);
		createEAttribute(serieDocumentalEClass, SERIE_DOCUMENTAL__DISPOSICION_FINAL);
		createEAttribute(serieDocumentalEClass, SERIE_DOCUMENTAL__DESCRIPCION);
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
		DocmgtPackage theDocmgtPackage = (DocmgtPackage)EPackage.Registry.INSTANCE.getEPackage(DocmgtPackage.eNS_URI);
		ComunicacionPackage theComunicacionPackage = (ComunicacionPackage)EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI);
		MemomsPackage theMemomsPackage = (MemomsPackage)EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(observacionEClass, Observacion.class, "Observacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservacion_Documento(), theDocmgtPackage.getDocumento(), theDocmgtPackage.getDocumento_Observacion(), "Documento", null, 0, 1, Observacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservacion_Observacion(), ecorePackage.getEString(), "observacion", null, 0, 1, Observacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservacion_Check(), ecorePackage.getEString(), "check", null, 0, 1, Observacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expedienteEClass, Expediente.class, "Expediente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpediente_Documento(), theDocmgtPackage.getDocumento(), theDocmgtPackage.getDocumento_Expediente(), "Documento", null, 1, -1, Expediente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anexoEClass, Anexo.class, "Anexo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnexo_Documento(), theDocmgtPackage.getDocumento(), theDocmgtPackage.getDocumento_Anexo(), "Documento", null, 0, 1, Anexo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnexo_Id(), ecorePackage.getEString(), "id", null, 0, 1, Anexo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnexo_Archivo(), ecorePackage.getEByteObject(), "archivo", null, 0, 1, Anexo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actividadEClass, Actividad.class, "Actividad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActividad_Memorando(), theComunicacionPackage.getMemorando(), theComunicacionPackage.getMemorando_Actividad(), "Memorando", null, 0, -1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActividad_MemoFactory(), theMemomsPackage.getMemoFactory(), theMemomsPackage.getMemoFactory_Actividad(), "MemoFactory", null, 0, 1, Actividad.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividad_Id(), ecorePackage.getEString(), "id", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividad_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividad_Estado(), ecorePackage.getEString(), "estado", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablaRetencionDocumentalEClass, TablaRetencionDocumental.class, "TablaRetencionDocumental", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTablaRetencionDocumental_Documento(), theDocmgtPackage.getDocumento(), theDocmgtPackage.getDocumento_TablaRetencionDocumental(), "Documento", null, 0, -1, TablaRetencionDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTablaRetencionDocumental_SerieDocumental(), this.getSerieDocumental(), this.getSerieDocumental_TablaRetencionDocumental(), "SerieDocumental", null, 1, -1, TablaRetencionDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTablaRetencionDocumental_MemoFactory(), theMemomsPackage.getMemoFactory(), theMemomsPackage.getMemoFactory_TablaRetencionDocumental(), "MemoFactory", null, 0, 1, TablaRetencionDocumental.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablaRetencionDocumental_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, TablaRetencionDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serieDocumentalEClass, SerieDocumental.class, "SerieDocumental", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSerieDocumental_TablaRetencionDocumental(), this.getTablaRetencionDocumental(), this.getTablaRetencionDocumental_SerieDocumental(), "TablaRetencionDocumental", null, 0, 1, SerieDocumental.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerieDocumental_Subserie(), this.getSerieDocumental(), this.getSerieDocumental_Serie(), "subserie", null, 1, -1, SerieDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerieDocumental_Serie(), this.getSerieDocumental(), this.getSerieDocumental_Subserie(), "serie", null, 1, 1, SerieDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerieDocumental_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, SerieDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerieDocumental_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, SerieDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerieDocumental_RetencionAnios(), ecorePackage.getEString(), "retencionAnios", null, 0, 1, SerieDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerieDocumental_DisposicionFinal(), ecorePackage.getEString(), "disposicionFinal", null, 0, 1, SerieDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerieDocumental_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, SerieDocumental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //InfoPackageImpl
