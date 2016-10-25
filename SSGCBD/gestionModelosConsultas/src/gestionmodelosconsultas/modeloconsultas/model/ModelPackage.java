/**
 */
package gestionmodelosconsultas.modeloconsultas.model;

import gestionmodelosconsultas.sysinfo.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see gestionmodelosconsultas.modeloconsultas.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.RelacionImpl
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ESTEREOTIPO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ORDER = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__EA_DIAGRAM = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__TARGET = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__SOURCE = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl <em>Campo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getCampo()
	 * @generated
	 */
	int CAMPO = 1;

	/**
	 * The feature id for the '<em><b>Nombre Campo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__NOMBRE_CAMPO = 0;

	/**
	 * The feature id for the '<em><b>Criterio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__CRITERIO = 1;

	/**
	 * The feature id for the '<em><b>Seleccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__SELECCION = 2;

	/**
	 * The feature id for the '<em><b>Owned Elemento Consulta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__OWNED_ELEMENTO_CONSULTA = 3;

	/**
	 * The number of structural features of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl <em>EA Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getEADiagram()
	 * @generated
	 */
	int EA_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>List Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__LIST_RELACION = 1;

	/**
	 * The feature id for the '<em><b>Modelo Consulta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__MODELO_CONSULTA = 2;

	/**
	 * The feature id for the '<em><b>List Elemento Consulta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__LIST_ELEMENTO_CONSULTA = 3;

	/**
	 * The number of structural features of the '<em>EA Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EA Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.ViewModelImpl <em>View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ViewModelImpl
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getViewModel()
	 * @generated
	 */
	int VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__NOMBRE = EA_DIAGRAM__NOMBRE;

	/**
	 * The feature id for the '<em><b>List Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__LIST_RELACION = EA_DIAGRAM__LIST_RELACION;

	/**
	 * The feature id for the '<em><b>Modelo Consulta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__MODELO_CONSULTA = EA_DIAGRAM__MODELO_CONSULTA;

	/**
	 * The feature id for the '<em><b>List Elemento Consulta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__LIST_ELEMENTO_CONSULTA = EA_DIAGRAM__LIST_ELEMENTO_CONSULTA;

	/**
	 * The number of structural features of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_FEATURE_COUNT = EA_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_OPERATION_COUNT = EA_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.ElementoConsultaImpl <em>Elemento Consulta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ElementoConsultaImpl
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getElementoConsulta()
	 * @generated
	 */
	int ELEMENTO_CONSULTA = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__ORDER = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__EA_DIAGRAM = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA__LIST_CAMPOS = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Elemento Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Elemento Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_CONSULTA_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.ProyeccionImpl <em>Proyeccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ProyeccionImpl
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getProyeccion()
	 * @generated
	 */
	int PROYECCION = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECCION__NOMBRE = EA_DIAGRAM__NOMBRE;

	/**
	 * The feature id for the '<em><b>List Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECCION__LIST_RELACION = EA_DIAGRAM__LIST_RELACION;

	/**
	 * The feature id for the '<em><b>Modelo Consulta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECCION__MODELO_CONSULTA = EA_DIAGRAM__MODELO_CONSULTA;

	/**
	 * The feature id for the '<em><b>List Elemento Consulta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECCION__LIST_ELEMENTO_CONSULTA = EA_DIAGRAM__LIST_ELEMENTO_CONSULTA;

	/**
	 * The number of structural features of the '<em>Proyeccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECCION_FEATURE_COUNT = EA_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proyeccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECCION_OPERATION_COUNT = EA_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.model.NombreCampo <em>Nombre Campo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.NombreCampo
	 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getNombreCampo()
	 * @generated
	 */
	int NOMBRE_CAMPO = 6;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getEstereotipo <em>Estereotipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estereotipo</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Relacion#getEstereotipo()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Estereotipo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Relacion#getOrder()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Order();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getEADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EA Diagram</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Relacion#getEADiagram()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_EADiagram();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Relacion#getTarget()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Target();

	/**
	 * Returns the meta object for the reference '{@link gestionmodelosconsultas.modeloconsultas.model.Relacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Relacion#getSource()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Source();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.model.Campo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campo</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Campo
	 * @generated
	 */
	EClass getCampo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getNombreCampo <em>Nombre Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Campo</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Campo#getNombreCampo()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_NombreCampo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getCriterio <em>Criterio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criterio</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Campo#getCriterio()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Criterio();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#isSeleccion <em>Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seleccion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Campo#isSeleccion()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Seleccion();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.model.Campo#getOwnedElementoConsulta <em>Owned Elemento Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Elemento Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Campo#getOwnedElementoConsulta()
	 * @see #getCampo()
	 * @generated
	 */
	EReference getCampo_OwnedElementoConsulta();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Diagram</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram
	 * @generated
	 */
	EClass getEADiagram();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram#getNombre()
	 * @see #getEADiagram()
	 * @generated
	 */
	EAttribute getEADiagram_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListRelacion <em>List Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Relacion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListRelacion()
	 * @see #getEADiagram()
	 * @generated
	 */
	EReference getEADiagram_ListRelacion();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getModeloConsulta <em>Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Modelo Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram#getModeloConsulta()
	 * @see #getEADiagram()
	 * @generated
	 */
	EReference getEADiagram_ModeloConsulta();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListElementoConsulta <em>List Elemento Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Elemento Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram#getListElementoConsulta()
	 * @see #getEADiagram()
	 * @generated
	 */
	EReference getEADiagram_ListElementoConsulta();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.model.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ViewModel
	 * @generated
	 */
	EClass getViewModel();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta <em>Elemento Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta
	 * @generated
	 */
	EClass getElementoConsulta();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getOrder()
	 * @see #getElementoConsulta()
	 * @generated
	 */
	EAttribute getElementoConsulta_Order();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getEADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EA Diagram</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getEADiagram()
	 * @see #getElementoConsulta()
	 * @generated
	 */
	EReference getElementoConsulta_EADiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getListCampos <em>List Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Campos</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta#getListCampos()
	 * @see #getElementoConsulta()
	 * @generated
	 */
	EReference getElementoConsulta_ListCampos();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.model.Proyeccion <em>Proyeccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proyeccion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Proyeccion
	 * @generated
	 */
	EClass getProyeccion();

	/**
	 * Returns the meta object for enum '{@link gestionmodelosconsultas.modeloconsultas.model.NombreCampo <em>Nombre Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nombre Campo</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.NombreCampo
	 * @generated
	 */
	EEnum getNombreCampo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.RelacionImpl
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Estereotipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ESTEREOTIPO = eINSTANCE.getRelacion_Estereotipo();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ORDER = eINSTANCE.getRelacion_Order();

		/**
		 * The meta object literal for the '<em><b>EA Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__EA_DIAGRAM = eINSTANCE.getRelacion_EADiagram();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__TARGET = eINSTANCE.getRelacion_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__SOURCE = eINSTANCE.getRelacion_Source();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl <em>Campo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getCampo()
		 * @generated
		 */
		EClass CAMPO = eINSTANCE.getCampo();

		/**
		 * The meta object literal for the '<em><b>Nombre Campo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__NOMBRE_CAMPO = eINSTANCE.getCampo_NombreCampo();

		/**
		 * The meta object literal for the '<em><b>Criterio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__CRITERIO = eINSTANCE.getCampo_Criterio();

		/**
		 * The meta object literal for the '<em><b>Seleccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__SELECCION = eINSTANCE.getCampo_Seleccion();

		/**
		 * The meta object literal for the '<em><b>Owned Elemento Consulta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPO__OWNED_ELEMENTO_CONSULTA = eINSTANCE.getCampo_OwnedElementoConsulta();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl <em>EA Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getEADiagram()
		 * @generated
		 */
		EClass EA_DIAGRAM = eINSTANCE.getEADiagram();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM__NOMBRE = eINSTANCE.getEADiagram_Nombre();

		/**
		 * The meta object literal for the '<em><b>List Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM__LIST_RELACION = eINSTANCE.getEADiagram_ListRelacion();

		/**
		 * The meta object literal for the '<em><b>Modelo Consulta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM__MODELO_CONSULTA = eINSTANCE.getEADiagram_ModeloConsulta();

		/**
		 * The meta object literal for the '<em><b>List Elemento Consulta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM__LIST_ELEMENTO_CONSULTA = eINSTANCE.getEADiagram_ListElementoConsulta();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.ViewModelImpl <em>View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ViewModelImpl
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getViewModel()
		 * @generated
		 */
		EClass VIEW_MODEL = eINSTANCE.getViewModel();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.ElementoConsultaImpl <em>Elemento Consulta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ElementoConsultaImpl
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getElementoConsulta()
		 * @generated
		 */
		EClass ELEMENTO_CONSULTA = eINSTANCE.getElementoConsulta();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_CONSULTA__ORDER = eINSTANCE.getElementoConsulta_Order();

		/**
		 * The meta object literal for the '<em><b>EA Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_CONSULTA__EA_DIAGRAM = eINSTANCE.getElementoConsulta_EADiagram();

		/**
		 * The meta object literal for the '<em><b>List Campos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_CONSULTA__LIST_CAMPOS = eINSTANCE.getElementoConsulta_ListCampos();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.model.impl.ProyeccionImpl <em>Proyeccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ProyeccionImpl
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getProyeccion()
		 * @generated
		 */
		EClass PROYECCION = eINSTANCE.getProyeccion();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.model.NombreCampo <em>Nombre Campo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.NombreCampo
		 * @see gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl#getNombreCampo()
		 * @generated
		 */
		EEnum NOMBRE_CAMPO = eINSTANCE.getNombreCampo();

	}

	void inizializarEEnum(ElementoConsulta elementoConsulta);

} //ModelPackage
