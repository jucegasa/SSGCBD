/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.ResultquienPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unidad Organizacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.UnidadOrganizacionalImpl#getIdUnidadOrganizacional <em>Id Unidad Organizacional</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.UnidadOrganizacionalImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.UnidadOrganizacionalImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnidadOrganizacionalImpl extends ElementoModeloResultadoImpl implements UnidadOrganizacional {
	/**
	 * The default value of the '{@link #getIdUnidadOrganizacional() <em>Id Unidad Organizacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUnidadOrganizacional()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_UNIDAD_ORGANIZACIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdUnidadOrganizacional() <em>Id Unidad Organizacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUnidadOrganizacional()
	 * @generated
	 * @ordered
	 */
	protected String idUnidadOrganizacional = ID_UNIDAD_ORGANIZACIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	protected UnidadOrganizacionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultquienPackage.Literals.UNIDAD_ORGANIZACIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdUnidadOrganizacional() {
		return idUnidadOrganizacional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdUnidadOrganizacional(String newIdUnidadOrganizacional) {
		String oldIdUnidadOrganizacional = idUnidadOrganizacional;
		idUnidadOrganizacional = newIdUnidadOrganizacional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.UNIDAD_ORGANIZACIONAL__ID_UNIDAD_ORGANIZACIONAL, oldIdUnidadOrganizacional, idUnidadOrganizacional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.UNIDAD_ORGANIZACIONAL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.UNIDAD_ORGANIZACIONAL__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__ID_UNIDAD_ORGANIZACIONAL:
				return getIdUnidadOrganizacional();
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__NOMBRE:
				return getNombre();
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__DESCRIPCION:
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
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__ID_UNIDAD_ORGANIZACIONAL:
				setIdUnidadOrganizacional((String)newValue);
				return;
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__DESCRIPCION:
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
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__ID_UNIDAD_ORGANIZACIONAL:
				setIdUnidadOrganizacional(ID_UNIDAD_ORGANIZACIONAL_EDEFAULT);
				return;
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__DESCRIPCION:
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
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__ID_UNIDAD_ORGANIZACIONAL:
				return ID_UNIDAD_ORGANIZACIONAL_EDEFAULT == null ? idUnidadOrganizacional != null : !ID_UNIDAD_ORGANIZACIONAL_EDEFAULT.equals(idUnidadOrganizacional);
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ResultquienPackage.UNIDAD_ORGANIZACIONAL__DESCRIPCION:
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
		result.append(" (idUnidadOrganizacional: ");
		result.append(idUnidadOrganizacional);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //UnidadOrganizacionalImpl
