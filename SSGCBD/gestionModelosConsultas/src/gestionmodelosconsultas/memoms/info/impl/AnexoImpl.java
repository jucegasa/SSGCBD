/**
 */
package gestionmodelosconsultas.memoms.info.impl;

import gestionmodelosconsultas.memoms.info.Anexo;
import gestionmodelosconsultas.memoms.info.InfoPackage;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anexo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.AnexoImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.AnexoImpl#getId <em>Id</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.AnexoImpl#getArchivo <em>Archivo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnexoImpl extends MinimalEObjectImpl.Container implements Anexo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchivo() <em>Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchivo()
	 * @generated
	 * @ordered
	 */
	protected static final Byte ARCHIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchivo() <em>Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchivo()
	 * @generated
	 * @ordered
	 */
	protected Byte archivo = ARCHIVO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnexoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfoPackage.Literals.ANEXO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getDocumento() {
		if (eContainerFeatureID() != InfoPackage.ANEXO__DOCUMENTO) return null;
		return (Documento)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumento(Documento newDocumento, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumento, InfoPackage.ANEXO__DOCUMENTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumento(Documento newDocumento) {
		if (newDocumento != eInternalContainer() || (eContainerFeatureID() != InfoPackage.ANEXO__DOCUMENTO && newDocumento != null)) {
			if (EcoreUtil.isAncestor(this, newDocumento))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumento != null)
				msgs = ((InternalEObject)newDocumento).eInverseAdd(this, DocmgtPackage.DOCUMENTO__ANEXO, Documento.class, msgs);
			msgs = basicSetDocumento(newDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.ANEXO__DOCUMENTO, newDocumento, newDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.ANEXO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getArchivo() {
		return archivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchivo(Byte newArchivo) {
		Byte oldArchivo = archivo;
		archivo = newArchivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.ANEXO__ARCHIVO, oldArchivo, archivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfoPackage.ANEXO__DOCUMENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumento((Documento)otherEnd, msgs);
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
			case InfoPackage.ANEXO__DOCUMENTO:
				return basicSetDocumento(null, msgs);
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
			case InfoPackage.ANEXO__DOCUMENTO:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.DOCUMENTO__ANEXO, Documento.class, msgs);
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
			case InfoPackage.ANEXO__DOCUMENTO:
				return getDocumento();
			case InfoPackage.ANEXO__ID:
				return getId();
			case InfoPackage.ANEXO__ARCHIVO:
				return getArchivo();
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
			case InfoPackage.ANEXO__DOCUMENTO:
				setDocumento((Documento)newValue);
				return;
			case InfoPackage.ANEXO__ID:
				setId((String)newValue);
				return;
			case InfoPackage.ANEXO__ARCHIVO:
				setArchivo((Byte)newValue);
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
			case InfoPackage.ANEXO__DOCUMENTO:
				setDocumento((Documento)null);
				return;
			case InfoPackage.ANEXO__ID:
				setId(ID_EDEFAULT);
				return;
			case InfoPackage.ANEXO__ARCHIVO:
				setArchivo(ARCHIVO_EDEFAULT);
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
			case InfoPackage.ANEXO__DOCUMENTO:
				return getDocumento() != null;
			case InfoPackage.ANEXO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InfoPackage.ANEXO__ARCHIVO:
				return ARCHIVO_EDEFAULT == null ? archivo != null : !ARCHIVO_EDEFAULT.equals(archivo);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", archivo: ");
		result.append(archivo);
		result.append(')');
		return result.toString();
	}

} //AnexoImpl
