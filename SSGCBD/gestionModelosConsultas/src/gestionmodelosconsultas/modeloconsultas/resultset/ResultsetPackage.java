/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset;

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
 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetFactory
 * @model kind="package"
 * @generated
 */
public interface ResultsetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resultset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/resultset.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.resultset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsetPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultadoImpl <em>Resultado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultadoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl#getResultado()
	 * @generated
	 */
	int RESULTADO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Modelo Consulta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO__MODELO_CONSULTA = 1;

	/**
	 * The feature id for the '<em><b>List Result Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO__LIST_RESULT_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Resultado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resultado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTADO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultElementImpl <em>Result Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultElementImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl#getResultElement()
	 * @generated
	 */
	int RESULT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ELEMENT__RESULTADO = 0;

	/**
	 * The number of structural features of the '<em>Result Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Result Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl <em>Elemento Modelo Resultado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl#getElementoModeloResultado()
	 * @generated
	 */
	int ELEMENTO_MODELO_RESULTADO = 1;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_RESULTADO__RESULTADO = RESULT_ELEMENT__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_RESULTADO__KEY = RESULT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO = RESULT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO = RESULT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Elemento Modelo Resultado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT = RESULT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Elemento Modelo Resultado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT = RESULT_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado <em>Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado
	 * @generated
	 */
	EClass getResultado();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getNombre()
	 * @see #getResultado()
	 * @generated
	 */
	EAttribute getResultado_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getModeloConsulta <em>Modelo Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Modelo Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getModeloConsulta()
	 * @see #getResultado()
	 * @generated
	 */
	EReference getResultado_ModeloConsulta();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getListResultElement <em>List Result Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Result Element</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado#getListResultElement()
	 * @see #getResultado()
	 * @generated
	 */
	EReference getResultado_ListResultElement();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado <em>Elemento Modelo Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Modelo Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado
	 * @generated
	 */
	EClass getElementoModeloResultado();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getKey()
	 * @see #getElementoModeloResultado()
	 * @generated
	 */
	EAttribute getElementoModeloResultado_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getListElementoModeloResultado <em>List Elemento Modelo Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Elemento Modelo Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getListElementoModeloResultado()
	 * @see #getElementoModeloResultado()
	 * @generated
	 */
	EReference getElementoModeloResultado_ListElementoModeloResultado();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getElementoModeloResultado <em>Elemento Modelo Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Elemento Modelo Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado#getElementoModeloResultado()
	 * @see #getElementoModeloResultado()
	 * @generated
	 */
	EReference getElementoModeloResultado_ElementoModeloResultado();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement <em>Result Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Element</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultElement
	 * @generated
	 */
	EClass getResultElement();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement#getResultado <em>Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultElement#getResultado()
	 * @see #getResultElement()
	 * @generated
	 */
	EReference getResultElement_Resultado();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultsetFactory getResultsetFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultadoImpl <em>Resultado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultadoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl#getResultado()
		 * @generated
		 */
		EClass RESULTADO = eINSTANCE.getResultado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTADO__NOMBRE = eINSTANCE.getResultado_Nombre();

		/**
		 * The meta object literal for the '<em><b>Modelo Consulta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTADO__MODELO_CONSULTA = eINSTANCE.getResultado_ModeloConsulta();

		/**
		 * The meta object literal for the '<em><b>List Result Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTADO__LIST_RESULT_ELEMENT = eINSTANCE.getResultado_ListResultElement();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl <em>Elemento Modelo Resultado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl#getElementoModeloResultado()
		 * @generated
		 */
		EClass ELEMENTO_MODELO_RESULTADO = eINSTANCE.getElementoModeloResultado();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_MODELO_RESULTADO__KEY = eINSTANCE.getElementoModeloResultado_Key();

		/**
		 * The meta object literal for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO = eINSTANCE.getElementoModeloResultado_ListElementoModeloResultado();

		/**
		 * The meta object literal for the '<em><b>Elemento Modelo Resultado</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO = eINSTANCE.getElementoModeloResultado_ElementoModeloResultado();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultElementImpl <em>Result Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultElementImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl#getResultElement()
		 * @generated
		 */
		EClass RESULT_ELEMENT = eINSTANCE.getResultElement();

		/**
		 * The meta object literal for the '<em><b>Resultado</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ELEMENT__RESULTADO = eINSTANCE.getResultElement_Resultado();

	}

} //ResultsetPackage
