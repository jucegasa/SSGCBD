/**
 */
package gestionmodelosconsultas.modeloconsultas;

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
 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloconsultasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modeloconsultas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloconsultasPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl <em>Modelo Consulta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl
	 * @see gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl#getModeloConsulta()
	 * @generated
	 */
	int MODELO_CONSULTA = 0;

	/**
	 * The feature id for the '<em><b>Realizacion Diagram Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_CONSULTA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Factory Modelo Consulta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_CONSULTA__FACTORY_MODELO_CONSULTA = 2;

	/**
	 * The feature id for the '<em><b>List EA Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_CONSULTA__LIST_EA_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>List Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_CONSULTA__LIST_RESULTADO = 4;

	/**
	 * The number of structural features of the '<em>Modelo Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_CONSULTA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Modelo Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_CONSULTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.impl.FactoryModeloConsultaImpl <em>Factory Modelo Consulta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.impl.FactoryModeloConsultaImpl
	 * @see gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl#getFactoryModeloConsulta()
	 * @generated
	 */
	int FACTORY_MODELO_CONSULTA = 1;

	/**
	 * The feature id for the '<em><b>Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_MODELO_CONSULTA__MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>List Modelo Consulta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA = 1;

	/**
	 * The number of structural features of the '<em>Factory Modelo Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_MODELO_CONSULTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Factory Modelo Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_MODELO_CONSULTA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta <em>Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelo Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta
	 * @generated
	 */
	EClass getModeloConsulta();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realizacion Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getRealizacionDiagramEntity()
	 * @see #getModeloConsulta()
	 * @generated
	 */
	EReference getModeloConsulta_RealizacionDiagramEntity();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getNombre()
	 * @see #getModeloConsulta()
	 * @generated
	 */
	EAttribute getModeloConsulta_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getFactoryModeloConsulta <em>Factory Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Modelo Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getFactoryModeloConsulta()
	 * @see #getModeloConsulta()
	 * @generated
	 */
	EReference getModeloConsulta_FactoryModeloConsulta();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListEADiagram <em>List EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List EA Diagram</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListEADiagram()
	 * @see #getModeloConsulta()
	 * @generated
	 */
	EReference getModeloConsulta_ListEADiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListResultado <em>List Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloConsulta#getListResultado()
	 * @see #getModeloConsulta()
	 * @generated
	 */
	EReference getModeloConsulta_ListResultado();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta <em>Factory Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Modelo Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta
	 * @generated
	 */
	EClass getFactoryModeloConsulta();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Factory</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getModelFactory()
	 * @see #getFactoryModeloConsulta()
	 * @generated
	 */
	EReference getFactoryModeloConsulta_ModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getListModeloConsulta <em>List Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Modelo Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getListModeloConsulta()
	 * @see #getFactoryModeloConsulta()
	 * @generated
	 */
	EReference getFactoryModeloConsulta_ListModeloConsulta();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloconsultasFactory getModeloconsultasFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl <em>Modelo Consulta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl
		 * @see gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl#getModeloConsulta()
		 * @generated
		 */
		EClass MODELO_CONSULTA = eINSTANCE.getModeloConsulta();

		/**
		 * The meta object literal for the '<em><b>Realizacion Diagram Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY = eINSTANCE.getModeloConsulta_RealizacionDiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELO_CONSULTA__NOMBRE = eINSTANCE.getModeloConsulta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Factory Modelo Consulta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELO_CONSULTA__FACTORY_MODELO_CONSULTA = eINSTANCE.getModeloConsulta_FactoryModeloConsulta();

		/**
		 * The meta object literal for the '<em><b>List EA Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELO_CONSULTA__LIST_EA_DIAGRAM = eINSTANCE.getModeloConsulta_ListEADiagram();

		/**
		 * The meta object literal for the '<em><b>List Resultado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELO_CONSULTA__LIST_RESULTADO = eINSTANCE.getModeloConsulta_ListResultado();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.impl.FactoryModeloConsultaImpl <em>Factory Modelo Consulta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.impl.FactoryModeloConsultaImpl
		 * @see gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl#getFactoryModeloConsulta()
		 * @generated
		 */
		EClass FACTORY_MODELO_CONSULTA = eINSTANCE.getFactoryModeloConsulta();

		/**
		 * The meta object literal for the '<em><b>Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_MODELO_CONSULTA__MODEL_FACTORY = eINSTANCE.getFactoryModeloConsulta_ModelFactory();

		/**
		 * The meta object literal for the '<em><b>List Modelo Consulta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA = eINSTANCE.getFactoryModeloConsulta_ListModeloConsulta();

	}

} //ModeloconsultasPackage
