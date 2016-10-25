/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;
import gestionmodelosconsultas.sysinfo.data.docmgt.Doc;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Producto;

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
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl#getUbicacion <em>Ubicacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ProductoImpl#getCopia <em>Copia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductoImpl extends ElementoModeloImpl implements Producto {
	/**
	 * The default value of the '{@link #getUbicacion() <em>Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbicacion()
	 * @generated
	 * @ordered
	 */
	protected static final String UBICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUbicacion() <em>Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbicacion()
	 * @generated
	 * @ordered
	 */
	protected String ubicacion = UBICACION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumento() <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected Documento documento;

	/**
	 * The cached value of the '{@link #getCopia() <em>Copia</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopia()
	 * @generated
	 * @ordered
	 */
	protected EList<Copia> copia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.PRODUCTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doc getDoc() {
		if (eContainerFeatureID() != DocmgtPackage.PRODUCTO__DOC) return null;
		return (Doc)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(Doc newDoc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoc, DocmgtPackage.PRODUCTO__DOC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(Doc newDoc) {
		if (newDoc != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.PRODUCTO__DOC && newDoc != null)) {
			if (EcoreUtil.isAncestor(this, newDoc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoc != null)
				msgs = ((InternalEObject)newDoc).eInverseAdd(this, DocmgtPackage.DOC__PRODUCTO, Doc.class, msgs);
			msgs = basicSetDoc(newDoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.PRODUCTO__DOC, newDoc, newDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUbicacion(String newUbicacion) {
		String oldUbicacion = ubicacion;
		ubicacion = newUbicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.PRODUCTO__UBICACION, oldUbicacion, ubicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getDocumento() {
		if (documento != null && documento.eIsProxy()) {
			InternalEObject oldDocumento = (InternalEObject)documento;
			documento = (Documento)eResolveProxy(oldDocumento);
			if (documento != oldDocumento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.PRODUCTO__DOCUMENTO, oldDocumento, documento));
			}
		}
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento basicGetDocumento() {
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumento(Documento newDocumento, NotificationChain msgs) {
		Documento oldDocumento = documento;
		documento = newDocumento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.PRODUCTO__DOCUMENTO, oldDocumento, newDocumento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumento(Documento newDocumento) {
		if (newDocumento != documento) {
			NotificationChain msgs = null;
			if (documento != null)
				msgs = ((InternalEObject)documento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__PRODUCTO, Documento.class, msgs);
			if (newDocumento != null)
				msgs = ((InternalEObject)newDocumento).eInverseAdd(this, DocmgtPackage.DOCUMENTO__PRODUCTO, Documento.class, msgs);
			msgs = basicSetDocumento(newDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.PRODUCTO__DOCUMENTO, newDocumento, newDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copia> getCopia() {
		if (copia == null) {
			copia = new EObjectWithInverseResolvingEList<Copia>(Copia.class, this, DocmgtPackage.PRODUCTO__COPIA, DocmgtPackage.COPIA__PRODUCTO);
		}
		return copia;
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
			case DocmgtPackage.PRODUCTO__DOC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDoc((Doc)otherEnd, msgs);
			case DocmgtPackage.PRODUCTO__DOCUMENTO:
				if (documento != null)
					msgs = ((InternalEObject)documento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__PRODUCTO, Documento.class, msgs);
				return basicSetDocumento((Documento)otherEnd, msgs);
			case DocmgtPackage.PRODUCTO__COPIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCopia()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.PRODUCTO__DOC:
				return basicSetDoc(null, msgs);
			case DocmgtPackage.PRODUCTO__DOCUMENTO:
				return basicSetDocumento(null, msgs);
			case DocmgtPackage.PRODUCTO__COPIA:
				return ((InternalEList<?>)getCopia()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.PRODUCTO__DOC:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.DOC__PRODUCTO, Doc.class, msgs);
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
			case DocmgtPackage.PRODUCTO__DOC:
				return getDoc();
			case DocmgtPackage.PRODUCTO__UBICACION:
				return getUbicacion();
			case DocmgtPackage.PRODUCTO__DOCUMENTO:
				if (resolve) return getDocumento();
				return basicGetDocumento();
			case DocmgtPackage.PRODUCTO__COPIA:
				return getCopia();
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
			case DocmgtPackage.PRODUCTO__DOC:
				setDoc((Doc)newValue);
				return;
			case DocmgtPackage.PRODUCTO__UBICACION:
				setUbicacion((String)newValue);
				return;
			case DocmgtPackage.PRODUCTO__DOCUMENTO:
				setDocumento((Documento)newValue);
				return;
			case DocmgtPackage.PRODUCTO__COPIA:
				getCopia().clear();
				getCopia().addAll((Collection<? extends Copia>)newValue);
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
			case DocmgtPackage.PRODUCTO__DOC:
				setDoc((Doc)null);
				return;
			case DocmgtPackage.PRODUCTO__UBICACION:
				setUbicacion(UBICACION_EDEFAULT);
				return;
			case DocmgtPackage.PRODUCTO__DOCUMENTO:
				setDocumento((Documento)null);
				return;
			case DocmgtPackage.PRODUCTO__COPIA:
				getCopia().clear();
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
			case DocmgtPackage.PRODUCTO__DOC:
				return getDoc() != null;
			case DocmgtPackage.PRODUCTO__UBICACION:
				return UBICACION_EDEFAULT == null ? ubicacion != null : !UBICACION_EDEFAULT.equals(ubicacion);
			case DocmgtPackage.PRODUCTO__DOCUMENTO:
				return documento != null;
			case DocmgtPackage.PRODUCTO__COPIA:
				return copia != null && !copia.isEmpty();
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
		result.append(" (ubicacion: ");
		result.append(ubicacion);
		result.append(')');
		return result.toString();
	}

} //ProductoImpl
