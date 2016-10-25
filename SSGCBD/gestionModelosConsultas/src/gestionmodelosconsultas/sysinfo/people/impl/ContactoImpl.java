/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.memoms.comunicacion.Comunicacion;
import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje;

import gestionmodelosconsultas.sysinfo.people.Contacto;
import gestionmodelosconsultas.sysinfo.people.Directorio;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.Quien;

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
 * An implementation of the model object '<em><b>Contacto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl#getDirectorio <em>Directorio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl#getQuien <em>Quien</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl#getMensaje <em>Mensaje</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl#getDestinatariocomunicacion <em>Destinatariocomunicacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.ContactoImpl#getRemitentecomunicacion <em>Remitentecomunicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactoImpl extends ElementoModeloImpl implements Contacto {
	/**
	 * The cached value of the '{@link #getQuien() <em>Quien</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuien()
	 * @generated
	 * @ordered
	 */
	protected EList<Quien> quien;

	/**
	 * The cached value of the '{@link #getMensaje() <em>Mensaje</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected EList<Mensaje> mensaje;

	/**
	 * The cached value of the '{@link #getDestinatariocomunicacion() <em>Destinatariocomunicacion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinatariocomunicacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Comunicacion> destinatariocomunicacion;

	/**
	 * The cached value of the '{@link #getRemitentecomunicacion() <em>Remitentecomunicacion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemitentecomunicacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Comunicacion> remitentecomunicacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeoplePackage.Literals.CONTACTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directorio getDirectorio() {
		if (eContainerFeatureID() != PeoplePackage.CONTACTO__DIRECTORIO) return null;
		return (Directorio)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectorio(Directorio newDirectorio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDirectorio, PeoplePackage.CONTACTO__DIRECTORIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectorio(Directorio newDirectorio) {
		if (newDirectorio != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.CONTACTO__DIRECTORIO && newDirectorio != null)) {
			if (EcoreUtil.isAncestor(this, newDirectorio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDirectorio != null)
				msgs = ((InternalEObject)newDirectorio).eInverseAdd(this, PeoplePackage.DIRECTORIO__CONTACTO, Directorio.class, msgs);
			msgs = basicSetDirectorio(newDirectorio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.CONTACTO__DIRECTORIO, newDirectorio, newDirectorio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quien> getQuien() {
		if (quien == null) {
			quien = new EObjectWithInverseResolvingEList<Quien>(Quien.class, this, PeoplePackage.CONTACTO__QUIEN, PeoplePackage.QUIEN__CONTACTO);
		}
		return quien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mensaje> getMensaje() {
		if (mensaje == null) {
			mensaje = new EObjectWithInverseResolvingEList.ManyInverse<Mensaje>(Mensaje.class, this, PeoplePackage.CONTACTO__MENSAJE, DocmgtPackage.MENSAJE__CONTACTO);
		}
		return mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comunicacion> getDestinatariocomunicacion() {
		if (destinatariocomunicacion == null) {
			destinatariocomunicacion = new EObjectWithInverseResolvingEList.ManyInverse<Comunicacion>(Comunicacion.class, this, PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION, ComunicacionPackage.COMUNICACION__DESTINATARIO);
		}
		return destinatariocomunicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comunicacion> getRemitentecomunicacion() {
		if (remitentecomunicacion == null) {
			remitentecomunicacion = new EObjectWithInverseResolvingEList<Comunicacion>(Comunicacion.class, this, PeoplePackage.CONTACTO__REMITENTECOMUNICACION, ComunicacionPackage.COMUNICACION__REMITENTE);
		}
		return remitentecomunicacion;
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
			case PeoplePackage.CONTACTO__DIRECTORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDirectorio((Directorio)otherEnd, msgs);
			case PeoplePackage.CONTACTO__QUIEN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQuien()).basicAdd(otherEnd, msgs);
			case PeoplePackage.CONTACTO__MENSAJE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMensaje()).basicAdd(otherEnd, msgs);
			case PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDestinatariocomunicacion()).basicAdd(otherEnd, msgs);
			case PeoplePackage.CONTACTO__REMITENTECOMUNICACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemitentecomunicacion()).basicAdd(otherEnd, msgs);
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
			case PeoplePackage.CONTACTO__DIRECTORIO:
				return basicSetDirectorio(null, msgs);
			case PeoplePackage.CONTACTO__QUIEN:
				return ((InternalEList<?>)getQuien()).basicRemove(otherEnd, msgs);
			case PeoplePackage.CONTACTO__MENSAJE:
				return ((InternalEList<?>)getMensaje()).basicRemove(otherEnd, msgs);
			case PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION:
				return ((InternalEList<?>)getDestinatariocomunicacion()).basicRemove(otherEnd, msgs);
			case PeoplePackage.CONTACTO__REMITENTECOMUNICACION:
				return ((InternalEList<?>)getRemitentecomunicacion()).basicRemove(otherEnd, msgs);
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
			case PeoplePackage.CONTACTO__DIRECTORIO:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.DIRECTORIO__CONTACTO, Directorio.class, msgs);
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
			case PeoplePackage.CONTACTO__DIRECTORIO:
				return getDirectorio();
			case PeoplePackage.CONTACTO__QUIEN:
				return getQuien();
			case PeoplePackage.CONTACTO__MENSAJE:
				return getMensaje();
			case PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION:
				return getDestinatariocomunicacion();
			case PeoplePackage.CONTACTO__REMITENTECOMUNICACION:
				return getRemitentecomunicacion();
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
			case PeoplePackage.CONTACTO__DIRECTORIO:
				setDirectorio((Directorio)newValue);
				return;
			case PeoplePackage.CONTACTO__QUIEN:
				getQuien().clear();
				getQuien().addAll((Collection<? extends Quien>)newValue);
				return;
			case PeoplePackage.CONTACTO__MENSAJE:
				getMensaje().clear();
				getMensaje().addAll((Collection<? extends Mensaje>)newValue);
				return;
			case PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION:
				getDestinatariocomunicacion().clear();
				getDestinatariocomunicacion().addAll((Collection<? extends Comunicacion>)newValue);
				return;
			case PeoplePackage.CONTACTO__REMITENTECOMUNICACION:
				getRemitentecomunicacion().clear();
				getRemitentecomunicacion().addAll((Collection<? extends Comunicacion>)newValue);
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
			case PeoplePackage.CONTACTO__DIRECTORIO:
				setDirectorio((Directorio)null);
				return;
			case PeoplePackage.CONTACTO__QUIEN:
				getQuien().clear();
				return;
			case PeoplePackage.CONTACTO__MENSAJE:
				getMensaje().clear();
				return;
			case PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION:
				getDestinatariocomunicacion().clear();
				return;
			case PeoplePackage.CONTACTO__REMITENTECOMUNICACION:
				getRemitentecomunicacion().clear();
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
			case PeoplePackage.CONTACTO__DIRECTORIO:
				return getDirectorio() != null;
			case PeoplePackage.CONTACTO__QUIEN:
				return quien != null && !quien.isEmpty();
			case PeoplePackage.CONTACTO__MENSAJE:
				return mensaje != null && !mensaje.isEmpty();
			case PeoplePackage.CONTACTO__DESTINATARIOCOMUNICACION:
				return destinatariocomunicacion != null && !destinatariocomunicacion.isEmpty();
			case PeoplePackage.CONTACTO__REMITENTECOMUNICACION:
				return remitentecomunicacion != null && !remitentecomunicacion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContactoImpl
