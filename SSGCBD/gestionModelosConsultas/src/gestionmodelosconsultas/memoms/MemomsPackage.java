/**
 */
package gestionmodelosconsultas.memoms;

import gestionmodelosconsultas.sysinfo.core.CorePackage;

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
 * @see gestionmodelosconsultas.memoms.MemomsFactory
 * @model kind="package"
 * @generated
 */
public interface MemomsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "memoms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/memoms.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.memoms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemomsPackage eINSTANCE = gestionmodelosconsultas.memoms.impl.MemomsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.memoms.impl.MemoFactoryImpl <em>Memo Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.memoms.impl.MemoFactoryImpl
	 * @see gestionmodelosconsultas.memoms.impl.MemomsPackageImpl#getMemoFactory()
	 * @generated
	 */
	int MEMO_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Tabla Retencion Documental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actividad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__ACTIVIDAD = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memorando</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__MEMORANDO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY__CIRCULAR = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Memo Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Memo Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FACTORY_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.memoms.MemoFactory <em>Memo Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memo Factory</em>'.
	 * @see gestionmodelosconsultas.memoms.MemoFactory
	 * @generated
	 */
	EClass getMemoFactory();

	/**
	 * Returns the meta object for the containment reference '{@link gestionmodelosconsultas.memoms.MemoFactory#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tabla Retencion Documental</em>'.
	 * @see gestionmodelosconsultas.memoms.MemoFactory#getTablaRetencionDocumental()
	 * @see #getMemoFactory()
	 * @generated
	 */
	EReference getMemoFactory_TablaRetencionDocumental();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.memoms.MemoFactory#getActividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actividad</em>'.
	 * @see gestionmodelosconsultas.memoms.MemoFactory#getActividad()
	 * @see #getMemoFactory()
	 * @generated
	 */
	EReference getMemoFactory_Actividad();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.memoms.MemoFactory#getMemorando <em>Memorando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memorando</em>'.
	 * @see gestionmodelosconsultas.memoms.MemoFactory#getMemorando()
	 * @see #getMemoFactory()
	 * @generated
	 */
	EReference getMemoFactory_Memorando();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.memoms.MemoFactory#getCircular <em>Circular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circular</em>'.
	 * @see gestionmodelosconsultas.memoms.MemoFactory#getCircular()
	 * @see #getMemoFactory()
	 * @generated
	 */
	EReference getMemoFactory_Circular();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MemomsFactory getMemomsFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.memoms.impl.MemoFactoryImpl <em>Memo Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.memoms.impl.MemoFactoryImpl
		 * @see gestionmodelosconsultas.memoms.impl.MemomsPackageImpl#getMemoFactory()
		 * @generated
		 */
		EClass MEMO_FACTORY = eINSTANCE.getMemoFactory();

		/**
		 * The meta object literal for the '<em><b>Tabla Retencion Documental</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL = eINSTANCE.getMemoFactory_TablaRetencionDocumental();

		/**
		 * The meta object literal for the '<em><b>Actividad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO_FACTORY__ACTIVIDAD = eINSTANCE.getMemoFactory_Actividad();

		/**
		 * The meta object literal for the '<em><b>Memorando</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO_FACTORY__MEMORANDO = eINSTANCE.getMemoFactory_Memorando();

		/**
		 * The meta object literal for the '<em><b>Circular</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO_FACTORY__CIRCULAR = eINSTANCE.getMemoFactory_Circular();

	}

} //MemomsPackage
