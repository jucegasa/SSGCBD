/**
 */
package gestionmodelosconsultas.sysinfo.core;

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
 * @see gestionmodelosconsultas.sysinfo.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo/core.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = gestionmodelosconsultas.sysinfo.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl <em>Elemento Modelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl
	 * @see gestionmodelosconsultas.sysinfo.core.impl.CorePackageImpl#getElementoModelo()
	 * @generated
	 */
	int ELEMENTO_MODELO = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO__CONTEXTO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO__TO = 4;

	/**
	 * The number of structural features of the '<em>Elemento Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Elemento Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_MODELO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo <em>Elemento Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Modelo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo
	 * @generated
	 */
	EClass getElementoModelo();

	/**
	 * Returns the meta object for the container reference '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getOwner()
	 * @see #getElementoModelo()
	 * @generated
	 */
	EReference getElementoModelo_Owner();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getContexto <em>Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexto</em>'.
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getContexto()
	 * @see #getElementoModelo()
	 * @generated
	 */
	EReference getElementoModelo_Contexto();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getNombre()
	 * @see #getElementoModelo()
	 * @generated
	 */
	EAttribute getElementoModelo_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getFrom()
	 * @see #getElementoModelo()
	 * @generated
	 */
	EReference getElementoModelo_From();

	/**
	 * Returns the meta object for the reference list '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getTo()
	 * @see #getElementoModelo()
	 * @generated
	 */
	EReference getElementoModelo_To();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl <em>Elemento Modelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl
		 * @see gestionmodelosconsultas.sysinfo.core.impl.CorePackageImpl#getElementoModelo()
		 * @generated
		 */
		EClass ELEMENTO_MODELO = eINSTANCE.getElementoModelo();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_MODELO__OWNER = eINSTANCE.getElementoModelo_Owner();

		/**
		 * The meta object literal for the '<em><b>Contexto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_MODELO__CONTEXTO = eINSTANCE.getElementoModelo_Contexto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_MODELO__NOMBRE = eINSTANCE.getElementoModelo_Nombre();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_MODELO__FROM = eINSTANCE.getElementoModelo_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_MODELO__TO = eINSTANCE.getElementoModelo_To();

	}

} //CorePackage
