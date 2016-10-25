/**
 */
package gestionmodelosconsultas.sysinfo;

import gestionmodelosconsultas.sysinfo.core.CorePackage;

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
 * <!-- begin-model-doc -->
 * version inicial de sistema de  información genérico para una organización
 * <!-- end-model-doc -->
 * @see gestionmodelosconsultas.sysinfo.SysinfoFactory
 * @model kind="package"
 * @generated
 */
public interface SysinfoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sysinfo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/sysinfo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.sysinfo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysinfoPackage eINSTANCE = gestionmodelosconsultas.sysinfo.impl.SysinfoPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.sysinfo.impl.PaqueteImpl <em>Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.sysinfo.impl.PaqueteImpl
	 * @see gestionmodelosconsultas.sysinfo.impl.SysinfoPackageImpl#getPaquete()
	 * @generated
	 */
	int PAQUETE = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__OWNER = CorePackage.ELEMENTO_MODELO__OWNER;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__CONTEXTO = CorePackage.ELEMENTO_MODELO__CONTEXTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__NOMBRE = CorePackage.ELEMENTO_MODELO__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__FROM = CorePackage.ELEMENTO_MODELO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__TO = CorePackage.ELEMENTO_MODELO__TO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__TIPO = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__ELEMENT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_FEATURE_COUNT = CorePackage.ELEMENTO_MODELO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_OPERATION_COUNT = CorePackage.ELEMENTO_MODELO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.sysinfo.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquete</em>'.
	 * @see gestionmodelosconsultas.sysinfo.Paquete
	 * @generated
	 */
	EClass getPaquete();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.sysinfo.Paquete#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see gestionmodelosconsultas.sysinfo.Paquete#getTipo()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link gestionmodelosconsultas.sysinfo.Paquete#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see gestionmodelosconsultas.sysinfo.Paquete#getElement()
	 * @see #getPaquete()
	 * @generated
	 */
	EReference getPaquete_Element();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SysinfoFactory getSysinfoFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.sysinfo.impl.PaqueteImpl <em>Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.sysinfo.impl.PaqueteImpl
		 * @see gestionmodelosconsultas.sysinfo.impl.SysinfoPackageImpl#getPaquete()
		 * @generated
		 */
		EClass PAQUETE = eINSTANCE.getPaquete();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__TIPO = eINSTANCE.getPaquete_Tipo();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE__ELEMENT = eINSTANCE.getPaquete_Element();

	}

} //SysinfoPackage
