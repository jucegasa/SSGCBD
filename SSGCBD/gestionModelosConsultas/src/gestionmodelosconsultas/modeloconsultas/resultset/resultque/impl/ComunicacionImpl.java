/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultquePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comunicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ComunicacionImpl#getIdComunicacion <em>Id Comunicacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ComunicacionImpl#getAsunto <em>Asunto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComunicacionImpl extends ElementoModeloResultadoImpl implements Comunicacion {
	/**
	 * The default value of the '{@link #getIdComunicacion() <em>Id Comunicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdComunicacion()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_COMUNICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdComunicacion() <em>Id Comunicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdComunicacion()
	 * @generated
	 * @ordered
	 */
	protected String idComunicacion = ID_COMUNICACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsunto() <em>Asunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsunto()
	 * @generated
	 * @ordered
	 */
	protected static final String ASUNTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsunto() <em>Asunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsunto()
	 * @generated
	 * @ordered
	 */
	protected String asunto = ASUNTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComunicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultquePackage.Literals.COMUNICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdComunicacion() {
		return idComunicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdComunicacion(String newIdComunicacion) {
		String oldIdComunicacion = idComunicacion;
		idComunicacion = newIdComunicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.COMUNICACION__ID_COMUNICACION, oldIdComunicacion, idComunicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsunto() {
		return asunto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsunto(String newAsunto) {
		String oldAsunto = asunto;
		asunto = newAsunto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.COMUNICACION__ASUNTO, oldAsunto, asunto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultquePackage.COMUNICACION__ID_COMUNICACION:
				return getIdComunicacion();
			case ResultquePackage.COMUNICACION__ASUNTO:
				return getAsunto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultquePackage.COMUNICACION__ID_COMUNICACION:
				setIdComunicacion((String)newValue);
				return;
			case ResultquePackage.COMUNICACION__ASUNTO:
				setAsunto((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResultquePackage.COMUNICACION__ID_COMUNICACION:
				setIdComunicacion(ID_COMUNICACION_EDEFAULT);
				return;
			case ResultquePackage.COMUNICACION__ASUNTO:
				setAsunto(ASUNTO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResultquePackage.COMUNICACION__ID_COMUNICACION:
				return ID_COMUNICACION_EDEFAULT == null ? idComunicacion != null : !ID_COMUNICACION_EDEFAULT.equals(idComunicacion);
			case ResultquePackage.COMUNICACION__ASUNTO:
				return ASUNTO_EDEFAULT == null ? asunto != null : !ASUNTO_EDEFAULT.equals(asunto);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idComunicacion: ");
		result.append(idComunicacion);
		result.append(", asunto: ");
		result.append(asunto);
		result.append(')');
		return result.toString();
	}

} //ComunicacionImpl
