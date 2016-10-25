/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;
import gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje;

import gestionmodelosconsultas.sysinfo.people.Contacto;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;

import gestionmodelosconsultas.sysinfo.time.Fecha;
import gestionmodelosconsultas.sysinfo.time.TimePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mensaje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl#getDistribucion <em>Distribucion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl#getAsunto <em>Asunto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl#getMensaje <em>Mensaje</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl#getCopia <em>Copia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl#getContacto <em>Contacto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.MensajeImpl#getFecha <em>Fecha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MensajeImpl extends ElementoModeloImpl implements Mensaje {
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
	 * The default value of the '{@link #getMensaje() <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected static final String MENSAJE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMensaje() <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected String mensaje = MENSAJE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCopia() <em>Copia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopia()
	 * @generated
	 * @ordered
	 */
	protected Copia copia;

	/**
	 * The cached value of the '{@link #getContacto() <em>Contacto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacto()
	 * @generated
	 * @ordered
	 */
	protected EList<Contacto> contacto;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected Fecha fecha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MensajeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.MENSAJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribucion getDistribucion() {
		if (eContainerFeatureID() != DocmgtPackage.MENSAJE__DISTRIBUCION) return null;
		return (Distribucion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribucion(Distribucion newDistribucion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDistribucion, DocmgtPackage.MENSAJE__DISTRIBUCION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribucion(Distribucion newDistribucion) {
		if (newDistribucion != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.MENSAJE__DISTRIBUCION && newDistribucion != null)) {
			if (EcoreUtil.isAncestor(this, newDistribucion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDistribucion != null)
				msgs = ((InternalEObject)newDistribucion).eInverseAdd(this, DocmgtPackage.DISTRIBUCION__MENSAJE, Distribucion.class, msgs);
			msgs = basicSetDistribucion(newDistribucion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.MENSAJE__DISTRIBUCION, newDistribucion, newDistribucion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.MENSAJE__ASUNTO, oldAsunto, asunto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMensaje(String newMensaje) {
		String oldMensaje = mensaje;
		mensaje = newMensaje;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.MENSAJE__MENSAJE, oldMensaje, mensaje));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copia getCopia() {
		if (copia != null && copia.eIsProxy()) {
			InternalEObject oldCopia = (InternalEObject)copia;
			copia = (Copia)eResolveProxy(oldCopia);
			if (copia != oldCopia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.MENSAJE__COPIA, oldCopia, copia));
			}
		}
		return copia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copia basicGetCopia() {
		return copia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopia(Copia newCopia, NotificationChain msgs) {
		Copia oldCopia = copia;
		copia = newCopia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.MENSAJE__COPIA, oldCopia, newCopia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopia(Copia newCopia) {
		if (newCopia != copia) {
			NotificationChain msgs = null;
			if (copia != null)
				msgs = ((InternalEObject)copia).eInverseRemove(this, DocmgtPackage.COPIA__MENSAJE, Copia.class, msgs);
			if (newCopia != null)
				msgs = ((InternalEObject)newCopia).eInverseAdd(this, DocmgtPackage.COPIA__MENSAJE, Copia.class, msgs);
			msgs = basicSetCopia(newCopia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.MENSAJE__COPIA, newCopia, newCopia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contacto> getContacto() {
		if (contacto == null) {
			contacto = new EObjectWithInverseResolvingEList.ManyInverse<Contacto>(Contacto.class, this, DocmgtPackage.MENSAJE__CONTACTO, PeoplePackage.CONTACTO__MENSAJE);
		}
		return contacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fecha getFecha() {
		if (fecha != null && fecha.eIsProxy()) {
			InternalEObject oldFecha = (InternalEObject)fecha;
			fecha = (Fecha)eResolveProxy(oldFecha);
			if (fecha != oldFecha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.MENSAJE__FECHA, oldFecha, fecha));
			}
		}
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fecha basicGetFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFecha(Fecha newFecha, NotificationChain msgs) {
		Fecha oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.MENSAJE__FECHA, oldFecha, newFecha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(Fecha newFecha) {
		if (newFecha != fecha) {
			NotificationChain msgs = null;
			if (fecha != null)
				msgs = ((InternalEObject)fecha).eInverseRemove(this, TimePackage.FECHA__MENSAJE, Fecha.class, msgs);
			if (newFecha != null)
				msgs = ((InternalEObject)newFecha).eInverseAdd(this, TimePackage.FECHA__MENSAJE, Fecha.class, msgs);
			msgs = basicSetFecha(newFecha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.MENSAJE__FECHA, newFecha, newFecha));
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
			case DocmgtPackage.MENSAJE__DISTRIBUCION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDistribucion((Distribucion)otherEnd, msgs);
			case DocmgtPackage.MENSAJE__COPIA:
				if (copia != null)
					msgs = ((InternalEObject)copia).eInverseRemove(this, DocmgtPackage.COPIA__MENSAJE, Copia.class, msgs);
				return basicSetCopia((Copia)otherEnd, msgs);
			case DocmgtPackage.MENSAJE__CONTACTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContacto()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.MENSAJE__FECHA:
				if (fecha != null)
					msgs = ((InternalEObject)fecha).eInverseRemove(this, TimePackage.FECHA__MENSAJE, Fecha.class, msgs);
				return basicSetFecha((Fecha)otherEnd, msgs);
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
			case DocmgtPackage.MENSAJE__DISTRIBUCION:
				return basicSetDistribucion(null, msgs);
			case DocmgtPackage.MENSAJE__COPIA:
				return basicSetCopia(null, msgs);
			case DocmgtPackage.MENSAJE__CONTACTO:
				return ((InternalEList<?>)getContacto()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.MENSAJE__FECHA:
				return basicSetFecha(null, msgs);
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
			case DocmgtPackage.MENSAJE__DISTRIBUCION:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.DISTRIBUCION__MENSAJE, Distribucion.class, msgs);
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
			case DocmgtPackage.MENSAJE__DISTRIBUCION:
				return getDistribucion();
			case DocmgtPackage.MENSAJE__ASUNTO:
				return getAsunto();
			case DocmgtPackage.MENSAJE__MENSAJE:
				return getMensaje();
			case DocmgtPackage.MENSAJE__COPIA:
				if (resolve) return getCopia();
				return basicGetCopia();
			case DocmgtPackage.MENSAJE__CONTACTO:
				return getContacto();
			case DocmgtPackage.MENSAJE__FECHA:
				if (resolve) return getFecha();
				return basicGetFecha();
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
			case DocmgtPackage.MENSAJE__DISTRIBUCION:
				setDistribucion((Distribucion)newValue);
				return;
			case DocmgtPackage.MENSAJE__ASUNTO:
				setAsunto((String)newValue);
				return;
			case DocmgtPackage.MENSAJE__MENSAJE:
				setMensaje((String)newValue);
				return;
			case DocmgtPackage.MENSAJE__COPIA:
				setCopia((Copia)newValue);
				return;
			case DocmgtPackage.MENSAJE__CONTACTO:
				getContacto().clear();
				getContacto().addAll((Collection<? extends Contacto>)newValue);
				return;
			case DocmgtPackage.MENSAJE__FECHA:
				setFecha((Fecha)newValue);
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
			case DocmgtPackage.MENSAJE__DISTRIBUCION:
				setDistribucion((Distribucion)null);
				return;
			case DocmgtPackage.MENSAJE__ASUNTO:
				setAsunto(ASUNTO_EDEFAULT);
				return;
			case DocmgtPackage.MENSAJE__MENSAJE:
				setMensaje(MENSAJE_EDEFAULT);
				return;
			case DocmgtPackage.MENSAJE__COPIA:
				setCopia((Copia)null);
				return;
			case DocmgtPackage.MENSAJE__CONTACTO:
				getContacto().clear();
				return;
			case DocmgtPackage.MENSAJE__FECHA:
				setFecha((Fecha)null);
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
			case DocmgtPackage.MENSAJE__DISTRIBUCION:
				return getDistribucion() != null;
			case DocmgtPackage.MENSAJE__ASUNTO:
				return ASUNTO_EDEFAULT == null ? asunto != null : !ASUNTO_EDEFAULT.equals(asunto);
			case DocmgtPackage.MENSAJE__MENSAJE:
				return MENSAJE_EDEFAULT == null ? mensaje != null : !MENSAJE_EDEFAULT.equals(mensaje);
			case DocmgtPackage.MENSAJE__COPIA:
				return copia != null;
			case DocmgtPackage.MENSAJE__CONTACTO:
				return contacto != null && !contacto.isEmpty();
			case DocmgtPackage.MENSAJE__FECHA:
				return fecha != null;
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
		result.append(" (asunto: ");
		result.append(asunto);
		result.append(", mensaje: ");
		result.append(mensaje);
		result.append(')');
		return result.toString();
	}

} //MensajeImpl
