/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

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

import gestionmodelosconsultas.memoms.info.InfoPackage;

import gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl;

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

import gestionmodelosconsultas.sysinfo.people.Actor;
import gestionmodelosconsultas.sysinfo.people.Actores;
import gestionmodelosconsultas.sysinfo.people.Contacto;
import gestionmodelosconsultas.sysinfo.people.Directorio;
import gestionmodelosconsultas.sysinfo.people.Organizacion;
import gestionmodelosconsultas.sysinfo.people.PeopleFactory;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.People_View;
import gestionmodelosconsultas.sysinfo.people.Quien;
import gestionmodelosconsultas.sysinfo.people.Rol;
import gestionmodelosconsultas.sysinfo.people.Roles;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import gestionmodelosconsultas.sysinfo.time.TimePackage;

import gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl;

import gestionmodelosconsultas.sysinfo.vision.VisionPackage;

import gestionmodelosconsultas.sysinfo.vision.impl.VisionPackageImpl;

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
public class PeoplePackageImpl extends EPackageImpl implements PeoplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass people_ViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unidadOrganizacionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directorioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolesEClass = null;

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
	 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PeoplePackageImpl() {
		super(eNS_URI, PeopleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PeoplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PeoplePackage init() {
		if (isInited) return (PeoplePackage)EPackage.Registry.INSTANCE.getEPackage(PeoplePackage.eNS_URI);

		// Obtain or create and register package
		PeoplePackageImpl thePeoplePackage = (PeoplePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PeoplePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PeoplePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		SysinfoPackageImpl theSysinfoPackage = (SysinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI) instanceof SysinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI) : SysinfoPackage.eINSTANCE);
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
		InfoPackageImpl theInfoPackage = (InfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) instanceof InfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) : InfoPackage.eINSTANCE);
		ComunicacionPackageImpl theComunicacionPackage = (ComunicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) instanceof ComunicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) : ComunicacionPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		thePeoplePackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theSysinfoPackage.createPackageContents();
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
		theInfoPackage.createPackageContents();
		theComunicacionPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		thePeoplePackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theSysinfoPackage.initializePackageContents();
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
		theInfoPackage.initializePackageContents();
		theComunicacionPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePeoplePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PeoplePackage.eNS_URI, thePeoplePackage);
		return thePeoplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeople_View() {
		return people_ViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeople_View_Directorio() {
		return (EReference)people_ViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeople_View_Organizacion() {
		return (EReference)people_ViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnidadOrganizacional() {
		return unidadOrganizacionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Rol() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Organizacion() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Edificio() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Unidad() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_UnidadPadre() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Actor() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_TheActores() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Roles() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Depositos() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Copias() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Copia() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_SusDepositos() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganizacional_Instanciacionesprocesos() {
		return (EReference)unidadOrganizacionalEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_UnidadOrganizacional() {
		return (EReference)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Actor() {
		return (EReference)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Roles() {
		return (EReference)rolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContacto() {
		return contactoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContacto_Directorio() {
		return (EReference)contactoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContacto_Quien() {
		return (EReference)contactoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContacto_Mensaje() {
		return (EReference)contactoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContacto_Destinatariocomunicacion() {
		return (EReference)contactoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContacto_Remitentecomunicacion() {
		return (EReference)contactoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectorio() {
		return directorioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectorio_People_View() {
		return (EReference)directorioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectorio_Contacto() {
		return (EReference)directorioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizacion() {
		return organizacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizacion_People_View() {
		return (EReference)organizacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizacion_Organizacion() {
		return (EReference)organizacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Rol() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Unidad() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Actores() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Ejecuta() {
		return (EReference)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ProcesosResponsable() {
		return (EReference)actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuien() {
		return quienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuien_Contacto() {
		return (EReference)quienEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuien_TheDocumento() {
		return (EReference)quienEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActores() {
		return actoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActores_UnidadOrganizacional() {
		return (EReference)actoresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActores_Actor() {
		return (EReference)actoresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoles() {
		return rolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_UnidadOrganizacional() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Rol() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeopleFactory getPeopleFactory() {
		return (PeopleFactory)getEFactoryInstance();
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
		people_ViewEClass = createEClass(PEOPLE_VIEW);
		createEReference(people_ViewEClass, PEOPLE_VIEW__DIRECTORIO);
		createEReference(people_ViewEClass, PEOPLE_VIEW__ORGANIZACION);

		unidadOrganizacionalEClass = createEClass(UNIDAD_ORGANIZACIONAL);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__ROL);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__ORGANIZACION);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__EDIFICIO);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__UNIDAD);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__UNIDAD_PADRE);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__ACTOR);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__THE_ACTORES);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__ROLES);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__DEPOSITOS);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__COPIAS);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__COPIA);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS);
		createEReference(unidadOrganizacionalEClass, UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS);

		rolEClass = createEClass(ROL);
		createEReference(rolEClass, ROL__UNIDAD_ORGANIZACIONAL);
		createEReference(rolEClass, ROL__ACTOR);
		createEReference(rolEClass, ROL__ROLES);

		contactoEClass = createEClass(CONTACTO);
		createEReference(contactoEClass, CONTACTO__DIRECTORIO);
		createEReference(contactoEClass, CONTACTO__QUIEN);
		createEReference(contactoEClass, CONTACTO__MENSAJE);
		createEReference(contactoEClass, CONTACTO__DESTINATARIOCOMUNICACION);
		createEReference(contactoEClass, CONTACTO__REMITENTECOMUNICACION);

		directorioEClass = createEClass(DIRECTORIO);
		createEReference(directorioEClass, DIRECTORIO__PEOPLE_VIEW);
		createEReference(directorioEClass, DIRECTORIO__CONTACTO);

		organizacionEClass = createEClass(ORGANIZACION);
		createEReference(organizacionEClass, ORGANIZACION__PEOPLE_VIEW);
		createEReference(organizacionEClass, ORGANIZACION__ORGANIZACION);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ROL);
		createEReference(actorEClass, ACTOR__UNIDAD);
		createEReference(actorEClass, ACTOR__ACTORES);
		createEReference(actorEClass, ACTOR__EJECUTA);
		createEReference(actorEClass, ACTOR__PROCESOS_RESPONSABLE);

		quienEClass = createEClass(QUIEN);
		createEReference(quienEClass, QUIEN__CONTACTO);
		createEReference(quienEClass, QUIEN__THE_DOCUMENTO);

		actoresEClass = createEClass(ACTORES);
		createEReference(actoresEClass, ACTORES__UNIDAD_ORGANIZACIONAL);
		createEReference(actoresEClass, ACTORES__ACTOR);

		rolesEClass = createEClass(ROLES);
		createEReference(rolesEClass, ROLES__UNIDAD_ORGANIZACIONAL);
		createEReference(rolesEClass, ROLES__ROL);
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
		SysinfoPackage theSysinfoPackage = (SysinfoPackage)EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		DocmgtPackage theDocmgtPackage = (DocmgtPackage)EPackage.Registry.INSTANCE.getEPackage(DocmgtPackage.eNS_URI);
		FunctionPackage theFunctionPackage = (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ComunicacionPackage theComunicacionPackage = (ComunicacionPackage)EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		people_ViewEClass.getESuperTypes().add(theSysinfoPackage.getPaquete());
		unidadOrganizacionalEClass.getESuperTypes().add(this.getQuien());
		rolEClass.getESuperTypes().add(this.getQuien());
		contactoEClass.getESuperTypes().add(theCorePackage.getElementoModelo());
		directorioEClass.getESuperTypes().add(theSysinfoPackage.getPaquete());
		organizacionEClass.getESuperTypes().add(theSysinfoPackage.getPaquete());
		actorEClass.getESuperTypes().add(this.getQuien());
		quienEClass.getESuperTypes().add(theCorePackage.getElementoModelo());

		// Initialize classes, features, and operations; add parameters
		initEClass(people_ViewEClass, People_View.class, "People_View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeople_View_Directorio(), this.getDirectorio(), this.getDirectorio_People_View(), "Directorio", null, 1, 1, People_View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeople_View_Organizacion(), this.getOrganizacion(), this.getOrganizacion_People_View(), "Organizacion", null, 1, 1, People_View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unidadOrganizacionalEClass, UnidadOrganizacional.class, "UnidadOrganizacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnidadOrganizacional_Rol(), this.getRol(), this.getRol_UnidadOrganizacional(), "Rol", null, 1, -1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Organizacion(), this.getOrganizacion(), this.getOrganizacion_Organizacion(), "Organizacion", null, 0, 1, UnidadOrganizacional.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Edificio(), theNetworkPackage.getEdificio(), theNetworkPackage.getEdificio_UnidadOrganizacional(), "Edificio", null, 1, -1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Unidad(), this.getUnidadOrganizacional(), this.getUnidadOrganizacional_UnidadPadre(), "unidad", null, 1, -1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_UnidadPadre(), this.getUnidadOrganizacional(), this.getUnidadOrganizacional_Unidad(), "unidadPadre", null, 0, 1, UnidadOrganizacional.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Actor(), this.getActor(), this.getActor_Unidad(), "Actor", null, 1, -1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_TheActores(), this.getActores(), this.getActores_UnidadOrganizacional(), "theActores", null, 1, 1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Roles(), this.getRoles(), this.getRoles_UnidadOrganizacional(), "Roles", null, 1, 1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Depositos(), theNetworkPackage.getDepositos(), theNetworkPackage.getDepositos_UnidadOrganizacional(), "Depositos", null, 1, 1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Copias(), theDocmgtPackage.getCopias(), theDocmgtPackage.getCopias_UnidadOrganizacional(), "Copias", null, 1, 1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Copia(), theDocmgtPackage.getCopia(), theDocmgtPackage.getCopia_UnidadOrganizacional(), "Copia", null, 1, -1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_SusDepositos(), theNetworkPackage.getDeposito(), theNetworkPackage.getDeposito_UnidadOrganizacional(), "susDepositos", null, 1, -1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganizacional_Instanciacionesprocesos(), theFunctionPackage.getInstanciaProceso(), theFunctionPackage.getInstanciaProceso_UnidadOrganizacional(), "instanciacionesprocesos", null, 0, -1, UnidadOrganizacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRol_UnidadOrganizacional(), this.getUnidadOrganizacional(), this.getUnidadOrganizacional_Rol(), "UnidadOrganizacional", null, 0, 1, Rol.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Actor(), this.getActor(), this.getActor_Rol(), "Actor", null, 1, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Roles(), this.getRoles(), this.getRoles_Rol(), "Roles", null, 0, 1, Rol.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactoEClass, Contacto.class, "Contacto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContacto_Directorio(), this.getDirectorio(), this.getDirectorio_Contacto(), "Directorio", null, 0, 1, Contacto.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContacto_Quien(), this.getQuien(), this.getQuien_Contacto(), "quien", null, 1, -1, Contacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContacto_Mensaje(), theDocmgtPackage.getMensaje(), theDocmgtPackage.getMensaje_Contacto(), "Mensaje", null, 1, -1, Contacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContacto_Destinatariocomunicacion(), theComunicacionPackage.getComunicacion(), theComunicacionPackage.getComunicacion_Destinatario(), "destinatariocomunicacion", null, 0, -1, Contacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContacto_Remitentecomunicacion(), theComunicacionPackage.getComunicacion(), theComunicacionPackage.getComunicacion_Remitente(), "remitentecomunicacion", null, 0, -1, Contacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directorioEClass, Directorio.class, "Directorio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectorio_People_View(), this.getPeople_View(), this.getPeople_View_Directorio(), "People_View", null, 0, 1, Directorio.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectorio_Contacto(), this.getContacto(), this.getContacto_Directorio(), "Contacto", null, 1, -1, Directorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizacionEClass, Organizacion.class, "Organizacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizacion_People_View(), this.getPeople_View(), this.getPeople_View_Organizacion(), "People_View", null, 0, 1, Organizacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizacion_Organizacion(), this.getUnidadOrganizacional(), this.getUnidadOrganizacional_Organizacion(), "organizacion", null, 1, -1, Organizacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Rol(), this.getRol(), this.getRol_Actor(), "Rol", null, 1, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Unidad(), this.getUnidadOrganizacional(), this.getUnidadOrganizacional_Actor(), "unidad", null, 0, 1, Actor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Actores(), this.getActores(), this.getActores_Actor(), "Actores", null, 0, 1, Actor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Ejecuta(), theFunctionPackage.getActividad(), theFunctionPackage.getActividad_Ejecutantes(), "ejecuta", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ProcesosResponsable(), theFunctionPackage.getInstanciaProceso(), theFunctionPackage.getInstanciaProceso_ActorResponsable(), "procesosResponsable", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quienEClass, Quien.class, "Quien", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuien_Contacto(), this.getContacto(), this.getContacto_Quien(), "contacto", null, 1, 1, Quien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuien_TheDocumento(), theDocmgtPackage.getDocumento(), theDocmgtPackage.getDocumento_TheRol(), "theDocumento", null, 0, -1, Quien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actoresEClass, Actores.class, "Actores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActores_UnidadOrganizacional(), this.getUnidadOrganizacional(), this.getUnidadOrganizacional_TheActores(), "UnidadOrganizacional", null, 0, 1, Actores.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActores_Actor(), this.getActor(), this.getActor_Actores(), "Actor", null, 0, -1, Actores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolesEClass, Roles.class, "Roles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoles_UnidadOrganizacional(), this.getUnidadOrganizacional(), this.getUnidadOrganizacional_Roles(), "UnidadOrganizacional", null, 0, 1, Roles.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Rol(), this.getRol(), this.getRol_Roles(), "Rol", null, 1, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PeoplePackageImpl
