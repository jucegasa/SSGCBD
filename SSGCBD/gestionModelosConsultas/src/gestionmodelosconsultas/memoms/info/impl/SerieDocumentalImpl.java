/**
 */
package gestionmodelosconsultas.memoms.info.impl;

import gestionmodelosconsultas.memoms.info.InfoPackage;
import gestionmodelosconsultas.memoms.info.SerieDocumental;
import gestionmodelosconsultas.memoms.info.TablaRetencionDocumental;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serie Documental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getSubserie <em>Subserie</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getSerie <em>Serie</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getRetencionAnios <em>Retencion Anios</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getDisposicionFinal <em>Disposicion Final</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.SerieDocumentalImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerieDocumentalImpl extends MinimalEObjectImpl.Container implements SerieDocumental {
	/**
	 * The cached value of the '{@link #getSubserie() <em>Subserie</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubserie()
	 * @generated
	 * @ordered
	 */
	protected EList<SerieDocumental> subserie;

	/**
	 * The cached value of the '{@link #getSerie() <em>Serie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerie()
	 * @generated
	 * @ordered
	 */
	protected SerieDocumental serie;

	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

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
	 * The default value of the '{@link #getRetencionAnios() <em>Retencion Anios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetencionAnios()
	 * @generated
	 * @ordered
	 */
	protected static final String RETENCION_ANIOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetencionAnios() <em>Retencion Anios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetencionAnios()
	 * @generated
	 * @ordered
	 */
	protected String retencionAnios = RETENCION_ANIOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisposicionFinal() <em>Disposicion Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposicionFinal()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPOSICION_FINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisposicionFinal() <em>Disposicion Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposicionFinal()
	 * @generated
	 * @ordered
	 */
	protected String disposicionFinal = DISPOSICION_FINAL_EDEFAULT;

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
	protected SerieDocumentalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfoPackage.Literals.SERIE_DOCUMENTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablaRetencionDocumental getTablaRetencionDocumental() {
		if (eContainerFeatureID() != InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL) return null;
		return (TablaRetencionDocumental)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTablaRetencionDocumental(TablaRetencionDocumental newTablaRetencionDocumental, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTablaRetencionDocumental, InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablaRetencionDocumental(TablaRetencionDocumental newTablaRetencionDocumental) {
		if (newTablaRetencionDocumental != eInternalContainer() || (eContainerFeatureID() != InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL && newTablaRetencionDocumental != null)) {
			if (EcoreUtil.isAncestor(this, newTablaRetencionDocumental))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTablaRetencionDocumental != null)
				msgs = ((InternalEObject)newTablaRetencionDocumental).eInverseAdd(this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL, TablaRetencionDocumental.class, msgs);
			msgs = basicSetTablaRetencionDocumental(newTablaRetencionDocumental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL, newTablaRetencionDocumental, newTablaRetencionDocumental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerieDocumental> getSubserie() {
		if (subserie == null) {
			subserie = new EObjectWithInverseResolvingEList<SerieDocumental>(SerieDocumental.class, this, InfoPackage.SERIE_DOCUMENTAL__SUBSERIE, InfoPackage.SERIE_DOCUMENTAL__SERIE);
		}
		return subserie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerieDocumental getSerie() {
		if (serie != null && serie.eIsProxy()) {
			InternalEObject oldSerie = (InternalEObject)serie;
			serie = (SerieDocumental)eResolveProxy(oldSerie);
			if (serie != oldSerie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfoPackage.SERIE_DOCUMENTAL__SERIE, oldSerie, serie));
			}
		}
		return serie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerieDocumental basicGetSerie() {
		return serie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerie(SerieDocumental newSerie, NotificationChain msgs) {
		SerieDocumental oldSerie = serie;
		serie = newSerie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__SERIE, oldSerie, newSerie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerie(SerieDocumental newSerie) {
		if (newSerie != serie) {
			NotificationChain msgs = null;
			if (serie != null)
				msgs = ((InternalEObject)serie).eInverseRemove(this, InfoPackage.SERIE_DOCUMENTAL__SUBSERIE, SerieDocumental.class, msgs);
			if (newSerie != null)
				msgs = ((InternalEObject)newSerie).eInverseAdd(this, InfoPackage.SERIE_DOCUMENTAL__SUBSERIE, SerieDocumental.class, msgs);
			msgs = basicSetSerie(newSerie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__SERIE, newSerie, newSerie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetencionAnios() {
		return retencionAnios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetencionAnios(String newRetencionAnios) {
		String oldRetencionAnios = retencionAnios;
		retencionAnios = newRetencionAnios;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__RETENCION_ANIOS, oldRetencionAnios, retencionAnios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisposicionFinal() {
		return disposicionFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposicionFinal(String newDisposicionFinal) {
		String oldDisposicionFinal = disposicionFinal;
		disposicionFinal = newDisposicionFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__DISPOSICION_FINAL, oldDisposicionFinal, disposicionFinal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.SERIE_DOCUMENTAL__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTablaRetencionDocumental((TablaRetencionDocumental)otherEnd, msgs);
			case InfoPackage.SERIE_DOCUMENTAL__SUBSERIE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubserie()).basicAdd(otherEnd, msgs);
			case InfoPackage.SERIE_DOCUMENTAL__SERIE:
				if (serie != null)
					msgs = ((InternalEObject)serie).eInverseRemove(this, InfoPackage.SERIE_DOCUMENTAL__SUBSERIE, SerieDocumental.class, msgs);
				return basicSetSerie((SerieDocumental)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL:
				return basicSetTablaRetencionDocumental(null, msgs);
			case InfoPackage.SERIE_DOCUMENTAL__SUBSERIE:
				return ((InternalEList<?>)getSubserie()).basicRemove(otherEnd, msgs);
			case InfoPackage.SERIE_DOCUMENTAL__SERIE:
				return basicSetSerie(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL:
				return eInternalContainer().eInverseRemove(this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL, TablaRetencionDocumental.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL:
				return getTablaRetencionDocumental();
			case InfoPackage.SERIE_DOCUMENTAL__SUBSERIE:
				return getSubserie();
			case InfoPackage.SERIE_DOCUMENTAL__SERIE:
				if (resolve) return getSerie();
				return basicGetSerie();
			case InfoPackage.SERIE_DOCUMENTAL__CODIGO:
				return getCodigo();
			case InfoPackage.SERIE_DOCUMENTAL__NOMBRE:
				return getNombre();
			case InfoPackage.SERIE_DOCUMENTAL__RETENCION_ANIOS:
				return getRetencionAnios();
			case InfoPackage.SERIE_DOCUMENTAL__DISPOSICION_FINAL:
				return getDisposicionFinal();
			case InfoPackage.SERIE_DOCUMENTAL__DESCRIPCION:
				return getDescripcion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL:
				setTablaRetencionDocumental((TablaRetencionDocumental)newValue);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__SUBSERIE:
				getSubserie().clear();
				getSubserie().addAll((Collection<? extends SerieDocumental>)newValue);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__SERIE:
				setSerie((SerieDocumental)newValue);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__CODIGO:
				setCodigo((String)newValue);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__NOMBRE:
				setNombre((String)newValue);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__RETENCION_ANIOS:
				setRetencionAnios((String)newValue);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__DISPOSICION_FINAL:
				setDisposicionFinal((String)newValue);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__DESCRIPCION:
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
			case InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL:
				setTablaRetencionDocumental((TablaRetencionDocumental)null);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__SUBSERIE:
				getSubserie().clear();
				return;
			case InfoPackage.SERIE_DOCUMENTAL__SERIE:
				setSerie((SerieDocumental)null);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__RETENCION_ANIOS:
				setRetencionAnios(RETENCION_ANIOS_EDEFAULT);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__DISPOSICION_FINAL:
				setDisposicionFinal(DISPOSICION_FINAL_EDEFAULT);
				return;
			case InfoPackage.SERIE_DOCUMENTAL__DESCRIPCION:
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
			case InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL:
				return getTablaRetencionDocumental() != null;
			case InfoPackage.SERIE_DOCUMENTAL__SUBSERIE:
				return subserie != null && !subserie.isEmpty();
			case InfoPackage.SERIE_DOCUMENTAL__SERIE:
				return serie != null;
			case InfoPackage.SERIE_DOCUMENTAL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case InfoPackage.SERIE_DOCUMENTAL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case InfoPackage.SERIE_DOCUMENTAL__RETENCION_ANIOS:
				return RETENCION_ANIOS_EDEFAULT == null ? retencionAnios != null : !RETENCION_ANIOS_EDEFAULT.equals(retencionAnios);
			case InfoPackage.SERIE_DOCUMENTAL__DISPOSICION_FINAL:
				return DISPOSICION_FINAL_EDEFAULT == null ? disposicionFinal != null : !DISPOSICION_FINAL_EDEFAULT.equals(disposicionFinal);
			case InfoPackage.SERIE_DOCUMENTAL__DESCRIPCION:
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", retencionAnios: ");
		result.append(retencionAnios);
		result.append(", disposicionFinal: ");
		result.append(disposicionFinal);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //SerieDocumentalImpl
