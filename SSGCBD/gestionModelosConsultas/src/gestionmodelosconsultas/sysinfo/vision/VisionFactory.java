/**
 */
package gestionmodelosconsultas.sysinfo.vision;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.sysinfo.vision.VisionPackage
 * @generated
 */
public interface VisionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisionFactory eINSTANCE = gestionmodelosconsultas.sysinfo.vision.impl.VisionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vision View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision View</em>'.
	 * @generated
	 */
	Vision_View createVision_View();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisionPackage getVisionPackage();

} //VisionFactory
