/**
 */
package gestionmodelosconsultas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see gestionmodelosconsultas.GestionmodelosconsultasFactory
 * @model kind="package"
 * @generated
 */
public interface GestionmodelosconsultasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gestionmodelosconsultas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GestionmodelosconsultasPackage eINSTANCE = gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.impl.ModelFactoryImpl
	 * @see gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Rules Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__RULES_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Factory Modelo Consultas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__FACTORY_MODELO_CONSULTAS = 1;

	/**
	 * The feature id for the '<em><b>Diagram Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__DIAGRAM_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Cargar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___CARGAR = 0;

	/**
	 * The operation id for the '<em>Salvar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___SALVAR = 1;

	/**
	 * The number of operations of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see gestionmodelosconsultas.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.ModelFactory#getRulesFactory <em>Rules Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rules Factory</em>'.
	 * @see gestionmodelosconsultas.ModelFactory#getRulesFactory()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_RulesFactory();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.ModelFactory#getFactoryModeloConsultas <em>Factory Modelo Consultas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory Modelo Consultas</em>'.
	 * @see gestionmodelosconsultas.ModelFactory#getFactoryModeloConsultas()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_FactoryModeloConsultas();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.ModelFactory#getDiagramEntity <em>Diagram Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram Entity</em>'.
	 * @see gestionmodelosconsultas.ModelFactory#getDiagramEntity()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_DiagramEntity();

	/**
	 * Returns the meta object for the '{@link gestionmodelosconsultas.ModelFactory#cargar() <em>Cargar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cargar</em>' operation.
	 * @see gestionmodelosconsultas.ModelFactory#cargar()
	 * @generated
	 */
	EOperation getModelFactory__Cargar();

	/**
	 * Returns the meta object for the '{@link gestionmodelosconsultas.ModelFactory#salvar() <em>Salvar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Salvar</em>' operation.
	 * @see gestionmodelosconsultas.ModelFactory#salvar()
	 * @generated
	 */
	EOperation getModelFactory__Salvar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GestionmodelosconsultasFactory getGestionmodelosconsultasFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.impl.ModelFactoryImpl
		 * @see gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Rules Factory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__RULES_FACTORY = eINSTANCE.getModelFactory_RulesFactory();

		/**
		 * The meta object literal for the '<em><b>Factory Modelo Consultas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__FACTORY_MODELO_CONSULTAS = eINSTANCE.getModelFactory_FactoryModeloConsultas();

		/**
		 * The meta object literal for the '<em><b>Diagram Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__DIAGRAM_ENTITY = eINSTANCE.getModelFactory_DiagramEntity();

		/**
		 * The meta object literal for the '<em><b>Cargar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___CARGAR = eINSTANCE.getModelFactory__Cargar();

		/**
		 * The meta object literal for the '<em><b>Salvar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___SALVAR = eINSTANCE.getModelFactory__Salvar();

	}

} //GestionmodelosconsultasPackage
