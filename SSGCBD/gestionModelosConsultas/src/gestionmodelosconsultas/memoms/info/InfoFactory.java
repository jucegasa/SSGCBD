/**
 */
package gestionmodelosconsultas.memoms.info;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.memoms.info.InfoPackage
 * @generated
 */
public interface InfoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfoFactory eINSTANCE = gestionmodelosconsultas.memoms.info.impl.InfoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Observacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observacion</em>'.
	 * @generated
	 */
	Observacion createObservacion();

	/**
	 * Returns a new object of class '<em>Expediente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expediente</em>'.
	 * @generated
	 */
	Expediente createExpediente();

	/**
	 * Returns a new object of class '<em>Anexo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anexo</em>'.
	 * @generated
	 */
	Anexo createAnexo();

	/**
	 * Returns a new object of class '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad</em>'.
	 * @generated
	 */
	Actividad createActividad();

	/**
	 * Returns a new object of class '<em>Tabla Retencion Documental</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabla Retencion Documental</em>'.
	 * @generated
	 */
	TablaRetencionDocumental createTablaRetencionDocumental();

	/**
	 * Returns a new object of class '<em>Serie Documental</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serie Documental</em>'.
	 * @generated
	 */
	SerieDocumental createSerieDocumental();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfoPackage getInfoPackage();

} //InfoFactory
