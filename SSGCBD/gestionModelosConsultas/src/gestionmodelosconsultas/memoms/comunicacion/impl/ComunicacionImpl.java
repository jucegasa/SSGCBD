/**
 */
package gestionmodelosconsultas.memoms.comunicacion.impl;

import gestionmodelosconsultas.memoms.comunicacion.Comunicacion;
import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;

import gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl;

import gestionmodelosconsultas.sysinfo.people.Contacto;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comunicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl#getDestinatario <em>Destinatario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl#getRemitente <em>Remitente</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl#getNumeroRadicado <em>Numero Radicado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl#getAsunto <em>Asunto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionImpl#getContenido <em>Contenido</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComunicacionImpl extends DocumentoImpl implements Comunicacion {
	/**
	 * The cached value of the '{@link #getDestinatario() <em>Destinatario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinatario()
	 * @generated
	 * @ordered
	 */
	protected EList<Contacto> destinatario;

	/**
	 * The cached value of the '{@link #getRemitente() <em>Remitente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemitente()
	 * @generated
	 * @ordered
	 */
	protected Contacto remitente;

	/**
	 * The default value of the '{@link #getNumeroRadicado() <em>Numero Radicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRadicado()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_RADICADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroRadicado() <em>Numero Radicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRadicado()
	 * @generated
	 * @ordered
	 */
	protected String numeroRadicado = NUMERO_RADICADO_EDEFAULT;

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
	 * The default value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenido()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenido()
	 * @generated
	 * @ordered
	 */
	protected String contenido = CONTENIDO_EDEFAULT;

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
		return ComunicacionPackage.Literals.COMUNICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contacto> getDestinatario() {
		if (destinatario == null) {
			destinatario = new EObjectWithInverseResolvingEList.ManyInverse<Contacto>(Contacto.class, this, ComunicacionPackage.COMUNICACION__DESTINATARIO, PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION);
		}
		return destinatario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contacto getRemitente() {
		if (remitente != null && remitente.eIsProxy()) {
			InternalEObject oldRemitente = (InternalEObject)remitente;
			remitente = (Contacto)eResolveProxy(oldRemitente);
			if (remitente != oldRemitente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComunicacionPackage.COMUNICACION__REMITENTE, oldRemitente, remitente));
			}
		}
		return remitente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contacto basicGetRemitente() {
		return remitente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemitente(Contacto newRemitente, NotificationChain msgs) {
		Contacto oldRemitente = remitente;
		remitente = newRemitente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComunicacionPackage.COMUNICACION__REMITENTE, oldRemitente, newRemitente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemitente(Contacto newRemitente) {
		if (newRemitente != remitente) {
			NotificationChain msgs = null;
			if (remitente != null)
				msgs = ((InternalEObject)remitente).eInverseRemove(this, PeoplePackage.CONTACTO__REMITENTECOMUNICACION, Contacto.class, msgs);
			if (newRemitente != null)
				msgs = ((InternalEObject)newRemitente).eInverseAdd(this, PeoplePackage.CONTACTO__REMITENTECOMUNICACION, Contacto.class, msgs);
			msgs = basicSetRemitente(newRemitente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComunicacionPackage.COMUNICACION__REMITENTE, newRemitente, newRemitente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroRadicado() {
		return numeroRadicado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroRadicado(String newNumeroRadicado) {
		String oldNumeroRadicado = numeroRadicado;
		numeroRadicado = newNumeroRadicado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComunicacionPackage.COMUNICACION__NUMERO_RADICADO, oldNumeroRadicado, numeroRadicado));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComunicacionPackage.COMUNICACION__ASUNTO, oldAsunto, asunto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenido(String newContenido) {
		String oldContenido = contenido;
		contenido = newContenido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComunicacionPackage.COMUNICACION__CONTENIDO, oldContenido, contenido));
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
			case ComunicacionPackage.COMUNICACION__DESTINATARIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDestinatario()).basicAdd(otherEnd, msgs);
			case ComunicacionPackage.COMUNICACION__REMITENTE:
				if (remitente != null)
					msgs = ((InternalEObject)remitente).eInverseRemove(this, PeoplePackage.CONTACTO__REMITENTECOMUNICACION, Contacto.class, msgs);
				return basicSetRemitente((Contacto)otherEnd, msgs);
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
			case ComunicacionPackage.COMUNICACION__DESTINATARIO:
				return ((InternalEList<?>)getDestinatario()).basicRemove(otherEnd, msgs);
			case ComunicacionPackage.COMUNICACION__REMITENTE:
				return basicSetRemitente(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComunicacionPackage.COMUNICACION__DESTINATARIO:
				return getDestinatario();
			case ComunicacionPackage.COMUNICACION__REMITENTE:
				if (resolve) return getRemitente();
				return basicGetRemitente();
			case ComunicacionPackage.COMUNICACION__NUMERO_RADICADO:
				return getNumeroRadicado();
			case ComunicacionPackage.COMUNICACION__ASUNTO:
				return getAsunto();
			case ComunicacionPackage.COMUNICACION__CONTENIDO:
				return getContenido();
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
			case ComunicacionPackage.COMUNICACION__DESTINATARIO:
				getDestinatario().clear();
				getDestinatario().addAll((Collection<? extends Contacto>)newValue);
				return;
			case ComunicacionPackage.COMUNICACION__REMITENTE:
				setRemitente((Contacto)newValue);
				return;
			case ComunicacionPackage.COMUNICACION__NUMERO_RADICADO:
				setNumeroRadicado((String)newValue);
				return;
			case ComunicacionPackage.COMUNICACION__ASUNTO:
				setAsunto((String)newValue);
				return;
			case ComunicacionPackage.COMUNICACION__CONTENIDO:
				setContenido((String)newValue);
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
			case ComunicacionPackage.COMUNICACION__DESTINATARIO:
				getDestinatario().clear();
				return;
			case ComunicacionPackage.COMUNICACION__REMITENTE:
				setRemitente((Contacto)null);
				return;
			case ComunicacionPackage.COMUNICACION__NUMERO_RADICADO:
				setNumeroRadicado(NUMERO_RADICADO_EDEFAULT);
				return;
			case ComunicacionPackage.COMUNICACION__ASUNTO:
				setAsunto(ASUNTO_EDEFAULT);
				return;
			case ComunicacionPackage.COMUNICACION__CONTENIDO:
				setContenido(CONTENIDO_EDEFAULT);
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
			case ComunicacionPackage.COMUNICACION__DESTINATARIO:
				return destinatario != null && !destinatario.isEmpty();
			case ComunicacionPackage.COMUNICACION__REMITENTE:
				return remitente != null;
			case ComunicacionPackage.COMUNICACION__NUMERO_RADICADO:
				return NUMERO_RADICADO_EDEFAULT == null ? numeroRadicado != null : !NUMERO_RADICADO_EDEFAULT.equals(numeroRadicado);
			case ComunicacionPackage.COMUNICACION__ASUNTO:
				return ASUNTO_EDEFAULT == null ? asunto != null : !ASUNTO_EDEFAULT.equals(asunto);
			case ComunicacionPackage.COMUNICACION__CONTENIDO:
				return CONTENIDO_EDEFAULT == null ? contenido != null : !CONTENIDO_EDEFAULT.equals(contenido);
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
		result.append(" (numeroRadicado: ");
		result.append(numeroRadicado);
		result.append(", asunto: ");
		result.append(asunto);
		result.append(", contenido: ");
		result.append(contenido);
		result.append(')');
		return result.toString();
	}

} //ComunicacionImpl
