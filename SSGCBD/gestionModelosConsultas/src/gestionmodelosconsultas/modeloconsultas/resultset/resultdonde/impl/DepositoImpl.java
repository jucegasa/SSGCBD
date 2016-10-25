/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deposito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.DepositoImpl#getIdDeposito <em>Id Deposito</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.DepositoImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepositoImpl extends ElementoModeloResultadoImpl implements Deposito {
	/**
	 * The default value of the '{@link #getIdDeposito() <em>Id Deposito</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDeposito()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DEPOSITO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdDeposito() <em>Id Deposito</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDeposito()
	 * @generated
	 * @ordered
	 */
	protected String idDeposito = ID_DEPOSITO_EDEFAULT;

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
	protected DepositoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultdondePackage.Literals.DEPOSITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdDeposito() {
		return idDeposito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDeposito(String newIdDeposito) {
		String oldIdDeposito = idDeposito;
		idDeposito = newIdDeposito;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultdondePackage.DEPOSITO__ID_DEPOSITO, oldIdDeposito, idDeposito));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultdondePackage.DEPOSITO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultdondePackage.DEPOSITO__ID_DEPOSITO:
				return getIdDeposito();
			case ResultdondePackage.DEPOSITO__DESCRIPCION:
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
			case ResultdondePackage.DEPOSITO__ID_DEPOSITO:
				setIdDeposito((String)newValue);
				return;
			case ResultdondePackage.DEPOSITO__DESCRIPCION:
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
			case ResultdondePackage.DEPOSITO__ID_DEPOSITO:
				setIdDeposito(ID_DEPOSITO_EDEFAULT);
				return;
			case ResultdondePackage.DEPOSITO__DESCRIPCION:
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
			case ResultdondePackage.DEPOSITO__ID_DEPOSITO:
				return ID_DEPOSITO_EDEFAULT == null ? idDeposito != null : !ID_DEPOSITO_EDEFAULT.equals(idDeposito);
			case ResultdondePackage.DEPOSITO__DESCRIPCION:
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
		result.append(" (idDeposito: ");
		result.append(idDeposito);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //DepositoImpl
