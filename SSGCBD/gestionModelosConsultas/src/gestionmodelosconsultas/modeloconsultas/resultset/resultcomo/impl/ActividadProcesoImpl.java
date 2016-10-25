/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad Proceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl#getIdActividadProceso <em>Id Actividad Proceso</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ActividadProcesoImpl#getFechaFin <em>Fecha Fin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadProcesoImpl extends ElementoModeloResultadoImpl implements ActividadProceso {
	/**
	 * The default value of the '{@link #getIdActividadProceso() <em>Id Actividad Proceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdActividadProceso()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_ACTIVIDAD_PROCESO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdActividadProceso() <em>Id Actividad Proceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdActividadProceso()
	 * @generated
	 * @ordered
	 */
	protected String idActividadProceso = ID_ACTIVIDAD_PROCESO_EDEFAULT;

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
	 * The default value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_INICIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected String fechaInicio = FECHA_INICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaFin() <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFin()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaFin() <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFin()
	 * @generated
	 * @ordered
	 */
	protected String fechaFin = FECHA_FIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadProcesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcomoPackage.Literals.ACTIVIDAD_PROCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdActividadProceso() {
		return idActividadProceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdActividadProceso(String newIdActividadProceso) {
		String oldIdActividadProceso = idActividadProceso;
		idActividadProceso = newIdActividadProceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.ACTIVIDAD_PROCESO__ID_ACTIVIDAD_PROCESO, oldIdActividadProceso, idActividadProceso));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.ACTIVIDAD_PROCESO__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.ACTIVIDAD_PROCESO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaInicio(String newFechaInicio) {
		String oldFechaInicio = fechaInicio;
		fechaInicio = newFechaInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_INICIO, oldFechaInicio, fechaInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaFin(String newFechaFin) {
		String oldFechaFin = fechaFin;
		fechaFin = newFechaFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_FIN, oldFechaFin, fechaFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcomoPackage.ACTIVIDAD_PROCESO__ID_ACTIVIDAD_PROCESO:
				return getIdActividadProceso();
			case ResultcomoPackage.ACTIVIDAD_PROCESO__NOMBRE:
				return getNombre();
			case ResultcomoPackage.ACTIVIDAD_PROCESO__DESCRIPCION:
				return getDescripcion();
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_INICIO:
				return getFechaInicio();
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_FIN:
				return getFechaFin();
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
			case ResultcomoPackage.ACTIVIDAD_PROCESO__ID_ACTIVIDAD_PROCESO:
				setIdActividadProceso((String)newValue);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_INICIO:
				setFechaInicio((String)newValue);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_FIN:
				setFechaFin((String)newValue);
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
			case ResultcomoPackage.ACTIVIDAD_PROCESO__ID_ACTIVIDAD_PROCESO:
				setIdActividadProceso(ID_ACTIVIDAD_PROCESO_EDEFAULT);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_INICIO:
				setFechaInicio(FECHA_INICIO_EDEFAULT);
				return;
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_FIN:
				setFechaFin(FECHA_FIN_EDEFAULT);
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
			case ResultcomoPackage.ACTIVIDAD_PROCESO__ID_ACTIVIDAD_PROCESO:
				return ID_ACTIVIDAD_PROCESO_EDEFAULT == null ? idActividadProceso != null : !ID_ACTIVIDAD_PROCESO_EDEFAULT.equals(idActividadProceso);
			case ResultcomoPackage.ACTIVIDAD_PROCESO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ResultcomoPackage.ACTIVIDAD_PROCESO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_INICIO:
				return FECHA_INICIO_EDEFAULT == null ? fechaInicio != null : !FECHA_INICIO_EDEFAULT.equals(fechaInicio);
			case ResultcomoPackage.ACTIVIDAD_PROCESO__FECHA_FIN:
				return FECHA_FIN_EDEFAULT == null ? fechaFin != null : !FECHA_FIN_EDEFAULT.equals(fechaFin);
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
		result.append(" (idActividadProceso: ");
		result.append(idActividadProceso);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", fechaInicio: ");
		result.append(fechaInicio);
		result.append(", fechaFin: ");
		result.append(fechaFin);
		result.append(')');
		return result.toString();
	}

} //ActividadProcesoImpl
