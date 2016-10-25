/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancia Proceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.InstanciaProcesoImpl#getIdInstanciaProceso <em>Id Instancia Proceso</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.InstanciaProcesoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.InstanciaProcesoImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanciaProcesoImpl extends ElementoModeloResultadoImpl implements InstanciaProceso {
	/**
	 * The default value of the '{@link #getIdInstanciaProceso() <em>Id Instancia Proceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdInstanciaProceso()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_INSTANCIA_PROCESO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdInstanciaProceso() <em>Id Instancia Proceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdInstanciaProceso()
	 * @generated
	 * @ordered
	 */
	protected String idInstanciaProceso = ID_INSTANCIA_PROCESO_EDEFAULT;

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
	protected InstanciaProcesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcomoPackage.Literals.INSTANCIA_PROCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdInstanciaProceso() {
		return idInstanciaProceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdInstanciaProceso(String newIdInstanciaProceso) {
		String oldIdInstanciaProceso = idInstanciaProceso;
		idInstanciaProceso = newIdInstanciaProceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.INSTANCIA_PROCESO__ID_INSTANCIA_PROCESO, oldIdInstanciaProceso, idInstanciaProceso));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.INSTANCIA_PROCESO__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.INSTANCIA_PROCESO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcomoPackage.INSTANCIA_PROCESO__ID_INSTANCIA_PROCESO:
				return getIdInstanciaProceso();
			case ResultcomoPackage.INSTANCIA_PROCESO__NOMBRE:
				return getNombre();
			case ResultcomoPackage.INSTANCIA_PROCESO__DESCRIPCION:
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
			case ResultcomoPackage.INSTANCIA_PROCESO__ID_INSTANCIA_PROCESO:
				setIdInstanciaProceso((String)newValue);
				return;
			case ResultcomoPackage.INSTANCIA_PROCESO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ResultcomoPackage.INSTANCIA_PROCESO__DESCRIPCION:
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
			case ResultcomoPackage.INSTANCIA_PROCESO__ID_INSTANCIA_PROCESO:
				setIdInstanciaProceso(ID_INSTANCIA_PROCESO_EDEFAULT);
				return;
			case ResultcomoPackage.INSTANCIA_PROCESO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ResultcomoPackage.INSTANCIA_PROCESO__DESCRIPCION:
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
			case ResultcomoPackage.INSTANCIA_PROCESO__ID_INSTANCIA_PROCESO:
				return ID_INSTANCIA_PROCESO_EDEFAULT == null ? idInstanciaProceso != null : !ID_INSTANCIA_PROCESO_EDEFAULT.equals(idInstanciaProceso);
			case ResultcomoPackage.INSTANCIA_PROCESO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ResultcomoPackage.INSTANCIA_PROCESO__DESCRIPCION:
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
		result.append(" (idInstanciaProceso: ");
		result.append(idInstanciaProceso);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //InstanciaProcesoImpl
