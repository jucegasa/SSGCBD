/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.ArmarioImpl#getIdArmario <em>Id Armario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.ArmarioImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmarioImpl extends ElementoModeloResultadoImpl implements Armario {
	/**
	 * The default value of the '{@link #getIdArmario() <em>Id Armario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdArmario()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_ARMARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdArmario() <em>Id Armario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdArmario()
	 * @generated
	 * @ordered
	 */
	protected String idArmario = ID_ARMARIO_EDEFAULT;

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
	protected ArmarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultdondePackage.Literals.ARMARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdArmario() {
		return idArmario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdArmario(String newIdArmario) {
		String oldIdArmario = idArmario;
		idArmario = newIdArmario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultdondePackage.ARMARIO__ID_ARMARIO, oldIdArmario, idArmario));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultdondePackage.ARMARIO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultdondePackage.ARMARIO__ID_ARMARIO:
				return getIdArmario();
			case ResultdondePackage.ARMARIO__DESCRIPCION:
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
			case ResultdondePackage.ARMARIO__ID_ARMARIO:
				setIdArmario((String)newValue);
				return;
			case ResultdondePackage.ARMARIO__DESCRIPCION:
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
			case ResultdondePackage.ARMARIO__ID_ARMARIO:
				setIdArmario(ID_ARMARIO_EDEFAULT);
				return;
			case ResultdondePackage.ARMARIO__DESCRIPCION:
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
			case ResultdondePackage.ARMARIO__ID_ARMARIO:
				return ID_ARMARIO_EDEFAULT == null ? idArmario != null : !ID_ARMARIO_EDEFAULT.equals(idArmario);
			case ResultdondePackage.ARMARIO__DESCRIPCION:
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
		result.append(" (idArmario: ");
		result.append(idArmario);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ArmarioImpl
