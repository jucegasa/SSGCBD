/**
 */
package gestionmodelosconsultas.entitymodel.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;

import gestionmodelosconsultas.datatypes.DatatypesPackage;

import gestionmodelosconsultas.datatypes.impl.DatatypesPackageImpl;

import gestionmodelosconsultas.entitymodel.AssociativeEntity;
import gestionmodelosconsultas.entitymodel.Attribute;
import gestionmodelosconsultas.entitymodel.AttributeType;
import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionValueAttribute;
import gestionmodelosconsultas.entitymodel.ElementoRealizacionVisibleAttribute;
import gestionmodelosconsultas.entitymodel.Entity;
import gestionmodelosconsultas.entitymodel.EntityRelation;
import gestionmodelosconsultas.entitymodel.EntitymodelFactory;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.ModelElementEntity;
import gestionmodelosconsultas.entitymodel.Multiplicity;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;
import gestionmodelosconsultas.entitymodel.SimpleRelation;
import gestionmodelosconsultas.entitymodel.TipoModelElementEntity;
import gestionmodelosconsultas.entitymodel.Type;
import gestionmodelosconsultas.entitymodel.Value;

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
public class EntitymodelPackageImpl extends EPackageImpl implements EntitymodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associativeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizacionDiagramEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoRealizacionDiagramEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoRealizacionValueAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoRealizacionVisibleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoModelElementEntityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

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
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EntitymodelPackageImpl() {
		super(eNS_URI, EntitymodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EntitymodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EntitymodelPackage init() {
		if (isInited) return (EntitymodelPackage)EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI);

		// Obtain or create and register package
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EntitymodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
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
		InfoPackageImpl theInfoPackage = (InfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) instanceof InfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) : InfoPackage.eINSTANCE);
		ComunicacionPackageImpl theComunicacionPackage = (ComunicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) instanceof ComunicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) : ComunicacionPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theEntitymodelPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
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
		theInfoPackage.createPackageContents();
		theComunicacionPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theEntitymodelPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
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
		theInfoPackage.initializePackageContents();
		theComunicacionPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEntitymodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EntitymodelPackage.eNS_URI, theEntitymodelPackage);
		return theEntitymodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_OwnedByFactoryEntity() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_ListAttributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRelation() {
		return entityRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelation_AtributteForeingKeySource() {
		return (EAttribute)entityRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelation_AtributtePrimaryKeyTarget() {
		return (EAttribute)entityRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelation_MultiplicitySource() {
		return (EAttribute)entityRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelation_MultiplicityTarget() {
		return (EAttribute)entityRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelation_TheFactoryEntity() {
		return (EReference)entityRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelation_Source() {
		return (EReference)entityRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelation_Target() {
		return (EReference)entityRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRelation() {
		return simpleRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociativeEntity() {
		return associativeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Visible() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributeType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Entity() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_ElementoRealizacionValueAttribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_ElementoRealizacionVisibleAttribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementEntity() {
		return modelElementEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementEntity_Name() {
		return (EAttribute)modelElementEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementEntity_Stereotype() {
		return (EAttribute)modelElementEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementEntity_ElementoRealizacionDiagramEntity() {
		return (EReference)modelElementEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramEntity() {
		return diagramEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramEntity_ModelFactory() {
		return (EReference)diagramEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramEntity_ListEntity() {
		return (EReference)diagramEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramEntity_ListEntityRelation() {
		return (EReference)diagramEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizacionDiagramEntity() {
		return realizacionDiagramEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizacionDiagramEntity_ModeloConsulta() {
		return (EReference)realizacionDiagramEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizacionDiagramEntity_ListElementoRealizacionDiagramEntity() {
		return (EReference)realizacionDiagramEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizacionDiagramEntity_RealizacionVisibleAttribute() {
		return (EReference)realizacionDiagramEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizacionDiagramEntity_ListValues() {
		return (EReference)realizacionDiagramEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoRealizacionDiagramEntity() {
		return elementoRealizacionDiagramEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoRealizacionDiagramEntity_Tipo() {
		return (EAttribute)elementoRealizacionDiagramEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoRealizacionDiagramEntity_NombreModelElementEntity() {
		return (EAttribute)elementoRealizacionDiagramEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionDiagramEntity_ModelElementEntity() {
		return (EReference)elementoRealizacionDiagramEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionDiagramEntity_RealizacionDiagramEntity() {
		return (EReference)elementoRealizacionDiagramEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionDiagramEntity_ListElementoRealizacionAttribute() {
		return (EReference)elementoRealizacionDiagramEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoRealizacionValueAttribute() {
		return elementoRealizacionValueAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoRealizacionValueAttribute_Nombre() {
		return (EAttribute)elementoRealizacionValueAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionValueAttribute_ValueAttribute() {
		return (EReference)elementoRealizacionValueAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionValueAttribute_ElementoRealizacionDiagramEntity() {
		return (EReference)elementoRealizacionValueAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionValueAttribute_Values() {
		return (EReference)elementoRealizacionValueAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoRealizacionVisibleAttribute() {
		return elementoRealizacionVisibleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoRealizacionVisibleAttribute_Nombre() {
		return (EAttribute)elementoRealizacionVisibleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionVisibleAttribute_RealizacionDiagramEntity() {
		return (EReference)elementoRealizacionVisibleAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoRealizacionVisibleAttribute_VisibleAttribute() {
		return (EReference)elementoRealizacionVisibleAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Value() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_ElementoRealizacionValueAttribute() {
		return (EReference)valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_RealizacionDiagramEntity() {
		return (EReference)valueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoModelElementEntity() {
		return tipoModelElementEntityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitymodelFactory getEntitymodelFactory() {
		return (EntitymodelFactory)getEFactoryInstance();
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
		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__OWNED_BY_FACTORY_ENTITY);
		createEReference(entityEClass, ENTITY__LIST_ATTRIBUTES);

		entityRelationEClass = createEClass(ENTITY_RELATION);
		createEAttribute(entityRelationEClass, ENTITY_RELATION__ATRIBUTTE_FOREING_KEY_SOURCE);
		createEAttribute(entityRelationEClass, ENTITY_RELATION__ATRIBUTTE_PRIMARY_KEY_TARGET);
		createEAttribute(entityRelationEClass, ENTITY_RELATION__MULTIPLICITY_SOURCE);
		createEAttribute(entityRelationEClass, ENTITY_RELATION__MULTIPLICITY_TARGET);
		createEReference(entityRelationEClass, ENTITY_RELATION__THE_FACTORY_ENTITY);
		createEReference(entityRelationEClass, ENTITY_RELATION__SOURCE);
		createEReference(entityRelationEClass, ENTITY_RELATION__TARGET);

		simpleRelationEClass = createEClass(SIMPLE_RELATION);

		associativeEntityEClass = createEClass(ASSOCIATIVE_ENTITY);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__VISIBLE);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_TYPE);
		createEReference(attributeEClass, ATTRIBUTE__ENTITY);
		createEReference(attributeEClass, ATTRIBUTE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE);

		modelElementEntityEClass = createEClass(MODEL_ELEMENT_ENTITY);
		createEAttribute(modelElementEntityEClass, MODEL_ELEMENT_ENTITY__NAME);
		createEAttribute(modelElementEntityEClass, MODEL_ELEMENT_ENTITY__STEREOTYPE);
		createEReference(modelElementEntityEClass, MODEL_ELEMENT_ENTITY__ELEMENTO_REALIZACION_DIAGRAM_ENTITY);

		diagramEntityEClass = createEClass(DIAGRAM_ENTITY);
		createEReference(diagramEntityEClass, DIAGRAM_ENTITY__MODEL_FACTORY);
		createEReference(diagramEntityEClass, DIAGRAM_ENTITY__LIST_ENTITY);
		createEReference(diagramEntityEClass, DIAGRAM_ENTITY__LIST_ENTITY_RELATION);

		realizacionDiagramEntityEClass = createEClass(REALIZACION_DIAGRAM_ENTITY);
		createEReference(realizacionDiagramEntityEClass, REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA);
		createEReference(realizacionDiagramEntityEClass, REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_DIAGRAM_ENTITY);
		createEReference(realizacionDiagramEntityEClass, REALIZACION_DIAGRAM_ENTITY__REALIZACION_VISIBLE_ATTRIBUTE);
		createEReference(realizacionDiagramEntityEClass, REALIZACION_DIAGRAM_ENTITY__LIST_VALUES);

		elementoRealizacionDiagramEntityEClass = createEClass(ELEMENTO_REALIZACION_DIAGRAM_ENTITY);
		createEAttribute(elementoRealizacionDiagramEntityEClass, ELEMENTO_REALIZACION_DIAGRAM_ENTITY__TIPO);
		createEAttribute(elementoRealizacionDiagramEntityEClass, ELEMENTO_REALIZACION_DIAGRAM_ENTITY__NOMBRE_MODEL_ELEMENT_ENTITY);
		createEReference(elementoRealizacionDiagramEntityEClass, ELEMENTO_REALIZACION_DIAGRAM_ENTITY__MODEL_ELEMENT_ENTITY);
		createEReference(elementoRealizacionDiagramEntityEClass, ELEMENTO_REALIZACION_DIAGRAM_ENTITY__REALIZACION_DIAGRAM_ENTITY);
		createEReference(elementoRealizacionDiagramEntityEClass, ELEMENTO_REALIZACION_DIAGRAM_ENTITY__LIST_ELEMENTO_REALIZACION_ATTRIBUTE);

		elementoRealizacionValueAttributeEClass = createEClass(ELEMENTO_REALIZACION_VALUE_ATTRIBUTE);
		createEAttribute(elementoRealizacionValueAttributeEClass, ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__NOMBRE);
		createEReference(elementoRealizacionValueAttributeEClass, ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUE_ATTRIBUTE);
		createEReference(elementoRealizacionValueAttributeEClass, ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__ELEMENTO_REALIZACION_DIAGRAM_ENTITY);
		createEReference(elementoRealizacionValueAttributeEClass, ELEMENTO_REALIZACION_VALUE_ATTRIBUTE__VALUES);

		elementoRealizacionVisibleAttributeEClass = createEClass(ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE);
		createEAttribute(elementoRealizacionVisibleAttributeEClass, ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__NOMBRE);
		createEReference(elementoRealizacionVisibleAttributeEClass, ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__REALIZACION_DIAGRAM_ENTITY);
		createEReference(elementoRealizacionVisibleAttributeEClass, ELEMENTO_REALIZACION_VISIBLE_ATTRIBUTE__VISIBLE_ATTRIBUTE);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__VALUE);
		createEReference(valueEClass, VALUE__ELEMENTO_REALIZACION_VALUE_ATTRIBUTE);
		createEReference(valueEClass, VALUE__REALIZACION_DIAGRAM_ENTITY);

		// Create enums
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		multiplicityEEnum = createEEnum(MULTIPLICITY);
		tipoModelElementEntityEEnum = createEEnum(TIPO_MODEL_ELEMENT_ENTITY);
		typeEEnum = createEEnum(TYPE);
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
		GestionmodelosconsultasPackage theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI);
		ModeloconsultasPackage theModeloconsultasPackage = (ModeloconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getModelElementEntity());
		entityRelationEClass.getESuperTypes().add(this.getModelElementEntity());
		simpleRelationEClass.getESuperTypes().add(this.getEntityRelation());
		associativeEntityEClass.getESuperTypes().add(this.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_OwnedByFactoryEntity(), this.getDiagramEntity(), this.getDiagramEntity_ListEntity(), "ownedByFactoryEntity", null, 0, 1, Entity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ListAttributes(), this.getAttribute(), this.getAttribute_Entity(), "listAttributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityRelationEClass, EntityRelation.class, "EntityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityRelation_AtributteForeingKeySource(), ecorePackage.getEString(), "atributteForeingKeySource", null, 0, 1, EntityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelation_AtributtePrimaryKeyTarget(), ecorePackage.getEString(), "atributtePrimaryKeyTarget", null, 0, 1, EntityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelation_MultiplicitySource(), this.getMultiplicity(), "multiplicitySource", "many_to_one", 0, 1, EntityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelation_MultiplicityTarget(), this.getMultiplicity(), "multiplicityTarget", "one_to_many", 0, 1, EntityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelation_TheFactoryEntity(), this.getDiagramEntity(), this.getDiagramEntity_ListEntityRelation(), "theFactoryEntity", null, 0, 1, EntityRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelation_Source(), this.getEntity(), null, "source", null, 1, 1, EntityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelation_Target(), this.getEntity(), null, "target", null, 1, 1, EntityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRelationEClass, SimpleRelation.class, "SimpleRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associativeEntityEClass, AssociativeEntity.class, "AssociativeEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getType(), "type", "string", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_AttributeType(), this.getAttributeType(), "attributeType", "ordinary", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Entity(), this.getEntity(), this.getEntity_ListAttributes(), "Entity", null, 0, 1, Attribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ElementoRealizacionValueAttribute(), this.getElementoRealizacionValueAttribute(), this.getElementoRealizacionValueAttribute_ValueAttribute(), "ElementoRealizacionValueAttribute", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ElementoRealizacionVisibleAttribute(), this.getElementoRealizacionVisibleAttribute(), this.getElementoRealizacionVisibleAttribute_VisibleAttribute(), "ElementoRealizacionVisibleAttribute", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEntityEClass, ModelElementEntity.class, "ModelElementEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElementEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElementEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementEntity_Stereotype(), ecorePackage.getEString(), "stereotype", null, 0, 1, ModelElementEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementEntity_ElementoRealizacionDiagramEntity(), this.getElementoRealizacionDiagramEntity(), this.getElementoRealizacionDiagramEntity_ModelElementEntity(), "ElementoRealizacionDiagramEntity", null, 0, -1, ModelElementEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramEntityEClass, DiagramEntity.class, "DiagramEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramEntity_ModelFactory(), theGestionmodelosconsultasPackage.getModelFactory(), theGestionmodelosconsultasPackage.getModelFactory_DiagramEntity(), "ModelFactory", null, 0, 1, DiagramEntity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramEntity_ListEntity(), this.getEntity(), this.getEntity_OwnedByFactoryEntity(), "listEntity", null, 0, -1, DiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramEntity_ListEntityRelation(), this.getEntityRelation(), this.getEntityRelation_TheFactoryEntity(), "listEntityRelation", null, 0, -1, DiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizacionDiagramEntityEClass, RealizacionDiagramEntity.class, "RealizacionDiagramEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizacionDiagramEntity_ModeloConsulta(), theModeloconsultasPackage.getModeloConsulta(), theModeloconsultasPackage.getModeloConsulta_RealizacionDiagramEntity(), "ModeloConsulta", null, 0, 1, RealizacionDiagramEntity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizacionDiagramEntity_ListElementoRealizacionDiagramEntity(), this.getElementoRealizacionDiagramEntity(), this.getElementoRealizacionDiagramEntity_RealizacionDiagramEntity(), "listElementoRealizacionDiagramEntity", null, 0, -1, RealizacionDiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizacionDiagramEntity_RealizacionVisibleAttribute(), this.getElementoRealizacionVisibleAttribute(), this.getElementoRealizacionVisibleAttribute_RealizacionDiagramEntity(), "realizacionVisibleAttribute", null, 1, 1, RealizacionDiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizacionDiagramEntity_ListValues(), this.getValue(), this.getValue_RealizacionDiagramEntity(), "listValues", null, 0, -1, RealizacionDiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoRealizacionDiagramEntityEClass, ElementoRealizacionDiagramEntity.class, "ElementoRealizacionDiagramEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoRealizacionDiagramEntity_Tipo(), this.getTipoModelElementEntity(), "tipo", "entity", 0, 1, ElementoRealizacionDiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementoRealizacionDiagramEntity_NombreModelElementEntity(), ecorePackage.getEString(), "nombreModelElementEntity", null, 0, 1, ElementoRealizacionDiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionDiagramEntity_ModelElementEntity(), this.getModelElementEntity(), this.getModelElementEntity_ElementoRealizacionDiagramEntity(), "modelElementEntity", null, 1, 1, ElementoRealizacionDiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionDiagramEntity_RealizacionDiagramEntity(), this.getRealizacionDiagramEntity(), this.getRealizacionDiagramEntity_ListElementoRealizacionDiagramEntity(), "RealizacionDiagramEntity", null, 0, 1, ElementoRealizacionDiagramEntity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionDiagramEntity_ListElementoRealizacionAttribute(), this.getElementoRealizacionValueAttribute(), this.getElementoRealizacionValueAttribute_ElementoRealizacionDiagramEntity(), "listElementoRealizacionAttribute", null, 0, -1, ElementoRealizacionDiagramEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoRealizacionValueAttributeEClass, ElementoRealizacionValueAttribute.class, "ElementoRealizacionValueAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoRealizacionValueAttribute_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ElementoRealizacionValueAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionValueAttribute_ValueAttribute(), this.getAttribute(), this.getAttribute_ElementoRealizacionValueAttribute(), "valueAttribute", null, 0, -1, ElementoRealizacionValueAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionValueAttribute_ElementoRealizacionDiagramEntity(), this.getElementoRealizacionDiagramEntity(), this.getElementoRealizacionDiagramEntity_ListElementoRealizacionAttribute(), "ElementoRealizacionDiagramEntity", null, 0, 1, ElementoRealizacionValueAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionValueAttribute_Values(), this.getValue(), this.getValue_ElementoRealizacionValueAttribute(), "values", null, 0, -1, ElementoRealizacionValueAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoRealizacionVisibleAttributeEClass, ElementoRealizacionVisibleAttribute.class, "ElementoRealizacionVisibleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoRealizacionVisibleAttribute_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ElementoRealizacionVisibleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionVisibleAttribute_RealizacionDiagramEntity(), this.getRealizacionDiagramEntity(), this.getRealizacionDiagramEntity_RealizacionVisibleAttribute(), "RealizacionDiagramEntity", null, 0, 1, ElementoRealizacionVisibleAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoRealizacionVisibleAttribute_VisibleAttribute(), this.getAttribute(), this.getAttribute_ElementoRealizacionVisibleAttribute(), "visibleAttribute", null, 0, -1, ElementoRealizacionVisibleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValue_ElementoRealizacionValueAttribute(), this.getElementoRealizacionValueAttribute(), this.getElementoRealizacionValueAttribute_Values(), "ElementoRealizacionValueAttribute", null, 0, -1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValue_RealizacionDiagramEntity(), this.getRealizacionDiagramEntity(), this.getRealizacionDiagramEntity_ListValues(), "RealizacionDiagramEntity", null, 0, 1, Value.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.PRIMARY_KEY);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.ORDINARY);

		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_TO_MANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MANY_TO_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_TO_ONE);

		initEEnum(tipoModelElementEntityEEnum, TipoModelElementEntity.class, "TipoModelElementEntity");
		addEEnumLiteral(tipoModelElementEntityEEnum, TipoModelElementEntity.ENTITY);
		addEEnumLiteral(tipoModelElementEntityEEnum, TipoModelElementEntity.RELATION);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.FLOAT);
		addEEnumLiteral(typeEEnum, Type.DATE);
	}

} //EntitymodelPackageImpl
