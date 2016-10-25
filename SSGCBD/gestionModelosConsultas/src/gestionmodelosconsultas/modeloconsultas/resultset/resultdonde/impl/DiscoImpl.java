/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disco</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.DiscoImpl#getIdDisco <em>Id Disco</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.DiscoImpl#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.DiscoImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscoImpl extends ElementoModeloResultadoImpl implements Disco {
	/**
	 * The default value of the '{@link #getIdDisco() <em>Id Disco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDisco()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DISCO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdDisco() <em>Id Disco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDisco()
	 * @generated
	 * @ordered
	 */
	protected String idDisco = ID_DISCO_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected String referencia = REFERENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultdondePackage.Literals.DISCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdDisco() {
		return idDisco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDisco(String newIdDisco) {
		String oldIdDisco = idDisco;
		idDisco = newIdDisco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultdondePackage.DISCO__ID_DISCO, oldIdDisco, idDisco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencia(String newReferencia) {
		String oldReferencia = referencia;
		referencia = newReferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultdondePackage.DISCO__REFERENCIA, oldReferencia, referencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultdondePackage.DISCO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultdondePackage.DISCO__ID_DISCO:
				return getIdDisco();
			case ResultdondePackage.DISCO__REFERENCIA:
				return getReferencia();
			case ResultdondePackage.DISCO__DESCRIPCION:
				return getDescripcion();
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
			case ResultdondePackage.DISCO__ID_DISCO:
				setIdDisco((String)newValue);
				return;
			case ResultdondePackage.DISCO__REFERENCIA:
				setReferencia((String)newValue);
				return;
			case ResultdondePackage.DISCO__DESCRIPCION:
				setDescripcion((String)newValue);
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
			case ResultdondePackage.DISCO__ID_DISCO:
				setIdDisco(ID_DISCO_EDEFAULT);
				return;
			case ResultdondePackage.DISCO__REFERENCIA:
				setReferencia(REFERENCIA_EDEFAULT);
				return;
			case ResultdondePackage.DISCO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
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
			case ResultdondePackage.DISCO__ID_DISCO:
				return ID_DISCO_EDEFAULT == null ? idDisco != null : !ID_DISCO_EDEFAULT.equals(idDisco);
			case ResultdondePackage.DISCO__REFERENCIA:
				return REFERENCIA_EDEFAULT == null ? referencia != null : !REFERENCIA_EDEFAULT.equals(referencia);
			case ResultdondePackage.DISCO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
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
		result.append(" (idDisco: ");
		result.append(idDisco);
		result.append(", referencia: ");
		result.append(referencia);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //DiscoImpl
