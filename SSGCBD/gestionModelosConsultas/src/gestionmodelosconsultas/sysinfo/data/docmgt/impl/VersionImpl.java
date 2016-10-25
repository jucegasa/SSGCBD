/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Doc;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Version;

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
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl#getCuenta <em>Cuenta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl#getFormato <em>Formato</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.VersionImpl#getDerivadas <em>Derivadas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends ElementoModeloImpl implements Version {
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
	 * The default value of the '{@link #getCuenta() <em>Cuenta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuenta()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CUENTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuenta() <em>Cuenta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuenta()
	 * @generated
	 * @ordered
	 */
	protected Integer cuenta = CUENTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormato() <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormato()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FORMATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormato() <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormato()
	 * @generated
	 * @ordered
	 */
	protected Boolean formato = FORMATO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuDocumento() <em>Su Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuDocumento()
	 * @generated
	 * @ordered
	 */
	protected Documento suDocumento;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Version base;

	/**
	 * The cached value of the '{@link #getDerivadas() <em>Derivadas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivadas()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> derivadas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doc getDoc() {
		if (eContainerFeatureID() != DocmgtPackage.VERSION__DOC) return null;
		return (Doc)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(Doc newDoc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoc, DocmgtPackage.VERSION__DOC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(Doc newDoc) {
		if (newDoc != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.VERSION__DOC && newDoc != null)) {
			if (EcoreUtil.isAncestor(this, newDoc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoc != null)
				msgs = ((InternalEObject)newDoc).eInverseAdd(this, DocmgtPackage.DOC__VERSION, Doc.class, msgs);
			msgs = basicSetDoc(newDoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__DOC, newDoc, newDoc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCuenta() {
		return cuenta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuenta(Integer newCuenta) {
		Integer oldCuenta = cuenta;
		cuenta = newCuenta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__CUENTA, oldCuenta, cuenta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFormato() {
		return formato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormato(Boolean newFormato) {
		Boolean oldFormato = formato;
		formato = newFormato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__FORMATO, oldFormato, formato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getSuDocumento() {
		if (suDocumento != null && suDocumento.eIsProxy()) {
			InternalEObject oldSuDocumento = (InternalEObject)suDocumento;
			suDocumento = (Documento)eResolveProxy(oldSuDocumento);
			if (suDocumento != oldSuDocumento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.VERSION__SU_DOCUMENTO, oldSuDocumento, suDocumento));
			}
		}
		return suDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento basicGetSuDocumento() {
		return suDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuDocumento(Documento newSuDocumento, NotificationChain msgs) {
		Documento oldSuDocumento = suDocumento;
		suDocumento = newSuDocumento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__SU_DOCUMENTO, oldSuDocumento, newSuDocumento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuDocumento(Documento newSuDocumento) {
		if (newSuDocumento != suDocumento) {
			NotificationChain msgs = null;
			if (suDocumento != null)
				msgs = ((InternalEObject)suDocumento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__SU_VERSION, Documento.class, msgs);
			if (newSuDocumento != null)
				msgs = ((InternalEObject)newSuDocumento).eInverseAdd(this, DocmgtPackage.DOCUMENTO__SU_VERSION, Documento.class, msgs);
			msgs = basicSetSuDocumento(newSuDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__SU_DOCUMENTO, newSuDocumento, newSuDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Version)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.VERSION__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Version newBase, NotificationChain msgs) {
		Version oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Version newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, DocmgtPackage.VERSION__DERIVADAS, Version.class, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, DocmgtPackage.VERSION__DERIVADAS, Version.class, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.VERSION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getDerivadas() {
		if (derivadas == null) {
			derivadas = new EObjectWithInverseResolvingEList<Version>(Version.class, this, DocmgtPackage.VERSION__DERIVADAS, DocmgtPackage.VERSION__BASE);
		}
		return derivadas;
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
			case DocmgtPackage.VERSION__DOC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDoc((Doc)otherEnd, msgs);
			case DocmgtPackage.VERSION__SU_DOCUMENTO:
				if (suDocumento != null)
					msgs = ((InternalEObject)suDocumento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__SU_VERSION, Documento.class, msgs);
				return basicSetSuDocumento((Documento)otherEnd, msgs);
			case DocmgtPackage.VERSION__BASE:
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, DocmgtPackage.VERSION__DERIVADAS, Version.class, msgs);
				return basicSetBase((Version)otherEnd, msgs);
			case DocmgtPackage.VERSION__DERIVADAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivadas()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.VERSION__DOC:
				return basicSetDoc(null, msgs);
			case DocmgtPackage.VERSION__SU_DOCUMENTO:
				return basicSetSuDocumento(null, msgs);
			case DocmgtPackage.VERSION__BASE:
				return basicSetBase(null, msgs);
			case DocmgtPackage.VERSION__DERIVADAS:
				return ((InternalEList<?>)getDerivadas()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.VERSION__DOC:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.DOC__VERSION, Doc.class, msgs);
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
			case DocmgtPackage.VERSION__DOC:
				return getDoc();
			case DocmgtPackage.VERSION__DESCRIPCION:
				return getDescripcion();
			case DocmgtPackage.VERSION__CUENTA:
				return getCuenta();
			case DocmgtPackage.VERSION__FORMATO:
				return getFormato();
			case DocmgtPackage.VERSION__SU_DOCUMENTO:
				if (resolve) return getSuDocumento();
				return basicGetSuDocumento();
			case DocmgtPackage.VERSION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case DocmgtPackage.VERSION__DERIVADAS:
				return getDerivadas();
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
			case DocmgtPackage.VERSION__DOC:
				setDoc((Doc)newValue);
				return;
			case DocmgtPackage.VERSION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case DocmgtPackage.VERSION__CUENTA:
				setCuenta((Integer)newValue);
				return;
			case DocmgtPackage.VERSION__FORMATO:
				setFormato((Boolean)newValue);
				return;
			case DocmgtPackage.VERSION__SU_DOCUMENTO:
				setSuDocumento((Documento)newValue);
				return;
			case DocmgtPackage.VERSION__BASE:
				setBase((Version)newValue);
				return;
			case DocmgtPackage.VERSION__DERIVADAS:
				getDerivadas().clear();
				getDerivadas().addAll((Collection<? extends Version>)newValue);
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
			case DocmgtPackage.VERSION__DOC:
				setDoc((Doc)null);
				return;
			case DocmgtPackage.VERSION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case DocmgtPackage.VERSION__CUENTA:
				setCuenta(CUENTA_EDEFAULT);
				return;
			case DocmgtPackage.VERSION__FORMATO:
				setFormato(FORMATO_EDEFAULT);
				return;
			case DocmgtPackage.VERSION__SU_DOCUMENTO:
				setSuDocumento((Documento)null);
				return;
			case DocmgtPackage.VERSION__BASE:
				setBase((Version)null);
				return;
			case DocmgtPackage.VERSION__DERIVADAS:
				getDerivadas().clear();
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
			case DocmgtPackage.VERSION__DOC:
				return getDoc() != null;
			case DocmgtPackage.VERSION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case DocmgtPackage.VERSION__CUENTA:
				return CUENTA_EDEFAULT == null ? cuenta != null : !CUENTA_EDEFAULT.equals(cuenta);
			case DocmgtPackage.VERSION__FORMATO:
				return FORMATO_EDEFAULT == null ? formato != null : !FORMATO_EDEFAULT.equals(formato);
			case DocmgtPackage.VERSION__SU_DOCUMENTO:
				return suDocumento != null;
			case DocmgtPackage.VERSION__BASE:
				return base != null;
			case DocmgtPackage.VERSION__DERIVADAS:
				return derivadas != null && !derivadas.isEmpty();
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
		result.append(" (descripcion: ");
		result.append(descripcion);
		result.append(", cuenta: ");
		result.append(cuenta);
		result.append(", formato: ");
		result.append(formato);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
