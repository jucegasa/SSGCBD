/**
 */
package gestionmodelosconsultas.memoms.info.util;

import gestionmodelosconsultas.memoms.info.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.memoms.info.InfoPackage
 * @generated
 */
public class InfoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoSwitch() {
		if (modelPackage == null) {
			modelPackage = InfoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InfoPackage.OBSERVACION: {
				Observacion observacion = (Observacion)theEObject;
				T result = caseObservacion(observacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfoPackage.EXPEDIENTE: {
				Expediente expediente = (Expediente)theEObject;
				T result = caseExpediente(expediente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfoPackage.ANEXO: {
				Anexo anexo = (Anexo)theEObject;
				T result = caseAnexo(anexo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfoPackage.ACTIVIDAD: {
				Actividad actividad = (Actividad)theEObject;
				T result = caseActividad(actividad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL: {
				TablaRetencionDocumental tablaRetencionDocumental = (TablaRetencionDocumental)theEObject;
				T result = caseTablaRetencionDocumental(tablaRetencionDocumental);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfoPackage.SERIE_DOCUMENTAL: {
				SerieDocumental serieDocumental = (SerieDocumental)theEObject;
				T result = caseSerieDocumental(serieDocumental);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservacion(Observacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expediente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expediente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpediente(Expediente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anexo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anexo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnexo(Anexo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividad(Actividad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabla Retencion Documental</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabla Retencion Documental</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTablaRetencionDocumental(TablaRetencionDocumental object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serie Documental</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serie Documental</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerieDocumental(SerieDocumental object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InfoSwitch
