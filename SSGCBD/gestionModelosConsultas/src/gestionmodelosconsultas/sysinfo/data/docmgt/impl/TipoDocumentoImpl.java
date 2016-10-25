/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Guia;
import gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo;
import gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion;
import gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla;
import gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento;

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
 * An implementation of the model object '<em><b>Tipo Documento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl#getLista <em>Lista</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl#getGuia <em>Guia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl#getPlantilla <em>Plantilla</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.TipoDocumentoImpl#getTheDocumento <em>The Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TipoDocumentoImpl extends ElementoModeloImpl implements TipoDocumento {
	/**
	 * The cached value of the '{@link #getLista() <em>Lista</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLista()
	 * @generated
	 * @ordered
	 */
	protected ListaChequeo lista;

	/**
	 * The cached value of the '{@link #getGuia() <em>Guia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuia()
	 * @generated
	 * @ordered
	 */
	protected Guia guia;

	/**
	 * The cached value of the '{@link #getPlantilla() <em>Plantilla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantilla()
	 * @generated
	 * @ordered
	 */
	protected Plantilla plantilla;

	/**
	 * The cached value of the '{@link #getTheDocumento() <em>The Documento</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDocumento()
	 * @generated
	 * @ordered
	 */
	protected EList<Documento> theDocumento;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TipoDocumentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.TIPO_DOCUMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientacion getOrientacion() {
		if (eContainerFeatureID() != DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION) return null;
		return (Orientacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientacion(Orientacion newOrientacion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrientacion, DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientacion(Orientacion newOrientacion) {
		if (newOrientacion != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION && newOrientacion != null)) {
			if (EcoreUtil.isAncestor(this, newOrientacion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrientacion != null)
				msgs = ((InternalEObject)newOrientacion).eInverseAdd(this, DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO, Orientacion.class, msgs);
			msgs = basicSetOrientacion(newOrientacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION, newOrientacion, newOrientacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListaChequeo getLista() {
		if (lista != null && lista.eIsProxy()) {
			InternalEObject oldLista = (InternalEObject)lista;
			lista = (ListaChequeo)eResolveProxy(oldLista);
			if (lista != oldLista) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.TIPO_DOCUMENTO__LISTA, oldLista, lista));
			}
		}
		return lista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListaChequeo basicGetLista() {
		return lista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLista(ListaChequeo newLista, NotificationChain msgs) {
		ListaChequeo oldLista = lista;
		lista = newLista;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.TIPO_DOCUMENTO__LISTA, oldLista, newLista);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLista(ListaChequeo newLista) {
		if (newLista != lista) {
			NotificationChain msgs = null;
			if (lista != null)
				msgs = ((InternalEObject)lista).eInverseRemove(this, DocmgtPackage.LISTA_CHEQUEO__SU_TIPO, ListaChequeo.class, msgs);
			if (newLista != null)
				msgs = ((InternalEObject)newLista).eInverseAdd(this, DocmgtPackage.LISTA_CHEQUEO__SU_TIPO, ListaChequeo.class, msgs);
			msgs = basicSetLista(newLista, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.TIPO_DOCUMENTO__LISTA, newLista, newLista));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guia getGuia() {
		if (guia != null && guia.eIsProxy()) {
			InternalEObject oldGuia = (InternalEObject)guia;
			guia = (Guia)eResolveProxy(oldGuia);
			if (guia != oldGuia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.TIPO_DOCUMENTO__GUIA, oldGuia, guia));
			}
		}
		return guia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guia basicGetGuia() {
		return guia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuia(Guia newGuia, NotificationChain msgs) {
		Guia oldGuia = guia;
		guia = newGuia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.TIPO_DOCUMENTO__GUIA, oldGuia, newGuia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuia(Guia newGuia) {
		if (newGuia != guia) {
			NotificationChain msgs = null;
			if (guia != null)
				msgs = ((InternalEObject)guia).eInverseRemove(this, DocmgtPackage.GUIA__SU_TIPO, Guia.class, msgs);
			if (newGuia != null)
				msgs = ((InternalEObject)newGuia).eInverseAdd(this, DocmgtPackage.GUIA__SU_TIPO, Guia.class, msgs);
			msgs = basicSetGuia(newGuia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.TIPO_DOCUMENTO__GUIA, newGuia, newGuia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plantilla getPlantilla() {
		if (plantilla != null && plantilla.eIsProxy()) {
			InternalEObject oldPlantilla = (InternalEObject)plantilla;
			plantilla = (Plantilla)eResolveProxy(oldPlantilla);
			if (plantilla != oldPlantilla) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA, oldPlantilla, plantilla));
			}
		}
		return plantilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plantilla basicGetPlantilla() {
		return plantilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlantilla(Plantilla newPlantilla, NotificationChain msgs) {
		Plantilla oldPlantilla = plantilla;
		plantilla = newPlantilla;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA, oldPlantilla, newPlantilla);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantilla(Plantilla newPlantilla) {
		if (newPlantilla != plantilla) {
			NotificationChain msgs = null;
			if (plantilla != null)
				msgs = ((InternalEObject)plantilla).eInverseRemove(this, DocmgtPackage.PLANTILLA__SU_TIPO, Plantilla.class, msgs);
			if (newPlantilla != null)
				msgs = ((InternalEObject)newPlantilla).eInverseAdd(this, DocmgtPackage.PLANTILLA__SU_TIPO, Plantilla.class, msgs);
			msgs = basicSetPlantilla(newPlantilla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA, newPlantilla, newPlantilla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documento> getTheDocumento() {
		if (theDocumento == null) {
			theDocumento = new EObjectWithInverseResolvingEList<Documento>(Documento.class, this, DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO, DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO);
		}
		return theDocumento;
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
			case DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrientacion((Orientacion)otherEnd, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__LISTA:
				if (lista != null)
					msgs = ((InternalEObject)lista).eInverseRemove(this, DocmgtPackage.LISTA_CHEQUEO__SU_TIPO, ListaChequeo.class, msgs);
				return basicSetLista((ListaChequeo)otherEnd, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__GUIA:
				if (guia != null)
					msgs = ((InternalEObject)guia).eInverseRemove(this, DocmgtPackage.GUIA__SU_TIPO, Guia.class, msgs);
				return basicSetGuia((Guia)otherEnd, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA:
				if (plantilla != null)
					msgs = ((InternalEObject)plantilla).eInverseRemove(this, DocmgtPackage.PLANTILLA__SU_TIPO, Plantilla.class, msgs);
				return basicSetPlantilla((Plantilla)otherEnd, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheDocumento()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION:
				return basicSetOrientacion(null, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__LISTA:
				return basicSetLista(null, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__GUIA:
				return basicSetGuia(null, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA:
				return basicSetPlantilla(null, msgs);
			case DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO:
				return ((InternalEList<?>)getTheDocumento()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO, Orientacion.class, msgs);
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
			case DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION:
				return getOrientacion();
			case DocmgtPackage.TIPO_DOCUMENTO__LISTA:
				if (resolve) return getLista();
				return basicGetLista();
			case DocmgtPackage.TIPO_DOCUMENTO__GUIA:
				if (resolve) return getGuia();
				return basicGetGuia();
			case DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA:
				if (resolve) return getPlantilla();
				return basicGetPlantilla();
			case DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO:
				return getTheDocumento();
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
			case DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION:
				setOrientacion((Orientacion)newValue);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__LISTA:
				setLista((ListaChequeo)newValue);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__GUIA:
				setGuia((Guia)newValue);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA:
				setPlantilla((Plantilla)newValue);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO:
				getTheDocumento().clear();
				getTheDocumento().addAll((Collection<? extends Documento>)newValue);
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
			case DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION:
				setOrientacion((Orientacion)null);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__LISTA:
				setLista((ListaChequeo)null);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__GUIA:
				setGuia((Guia)null);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA:
				setPlantilla((Plantilla)null);
				return;
			case DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO:
				getTheDocumento().clear();
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
			case DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION:
				return getOrientacion() != null;
			case DocmgtPackage.TIPO_DOCUMENTO__LISTA:
				return lista != null;
			case DocmgtPackage.TIPO_DOCUMENTO__GUIA:
				return guia != null;
			case DocmgtPackage.TIPO_DOCUMENTO__PLANTILLA:
				return plantilla != null;
			case DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO:
				return theDocumento != null && !theDocumento.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TipoDocumentoImpl
