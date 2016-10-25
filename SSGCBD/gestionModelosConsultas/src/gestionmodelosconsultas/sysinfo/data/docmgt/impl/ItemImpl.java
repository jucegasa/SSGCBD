/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Baseline;
import gestionmodelosconsultas.sysinfo.data.docmgt.Contenido;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Item;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl#getHInt <em>HInt</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl#getSuContenido <em>Su Contenido</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ItemImpl#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getHInt() <em>HInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHInt()
	 * @generated
	 * @ordered
	 */
	protected static final String HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHInt() <em>HInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHInt()
	 * @generated
	 * @ordered
	 */
	protected String hInt = HINT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.ITEM__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHInt() {
		return hInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHInt(String newHInt) {
		String oldHInt = hInt;
		hInt = newHInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.ITEM__HINT, oldHInt, hInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenido getSuContenido() {
		if (eContainerFeatureID() != DocmgtPackage.ITEM__SU_CONTENIDO) return null;
		return (Contenido)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuContenido(Contenido newSuContenido, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuContenido, DocmgtPackage.ITEM__SU_CONTENIDO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuContenido(Contenido newSuContenido) {
		if (newSuContenido != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.ITEM__SU_CONTENIDO && newSuContenido != null)) {
			if (EcoreUtil.isAncestor(this, newSuContenido))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuContenido != null)
				msgs = ((InternalEObject)newSuContenido).eInverseAdd(this, DocmgtPackage.CONTENIDO__SU_ITEM, Contenido.class, msgs);
			msgs = basicSetSuContenido(newSuContenido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.ITEM__SU_CONTENIDO, newSuContenido, newSuContenido));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.ITEM__SU_DOCUMENTO, oldSuDocumento, suDocumento));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.ITEM__SU_DOCUMENTO, oldSuDocumento, newSuDocumento);
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
				msgs = ((InternalEObject)suDocumento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__SU_ITEM, Documento.class, msgs);
			if (newSuDocumento != null)
				msgs = ((InternalEObject)newSuDocumento).eInverseAdd(this, DocmgtPackage.DOCUMENTO__SU_ITEM, Documento.class, msgs);
			msgs = basicSetSuDocumento(newSuDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.ITEM__SU_DOCUMENTO, newSuDocumento, newSuDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baseline getBaseline() {
		if (eContainerFeatureID() != DocmgtPackage.ITEM__BASELINE) return null;
		return (Baseline)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseline(Baseline newBaseline, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBaseline, DocmgtPackage.ITEM__BASELINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseline(Baseline newBaseline) {
		if (newBaseline != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.ITEM__BASELINE && newBaseline != null)) {
			if (EcoreUtil.isAncestor(this, newBaseline))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBaseline != null)
				msgs = ((InternalEObject)newBaseline).eInverseAdd(this, DocmgtPackage.BASELINE__SU_ITEM, Baseline.class, msgs);
			msgs = basicSetBaseline(newBaseline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.ITEM__BASELINE, newBaseline, newBaseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocmgtPackage.ITEM__SU_CONTENIDO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuContenido((Contenido)otherEnd, msgs);
			case DocmgtPackage.ITEM__SU_DOCUMENTO:
				if (suDocumento != null)
					msgs = ((InternalEObject)suDocumento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__SU_ITEM, Documento.class, msgs);
				return basicSetSuDocumento((Documento)otherEnd, msgs);
			case DocmgtPackage.ITEM__BASELINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBaseline((Baseline)otherEnd, msgs);
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
			case DocmgtPackage.ITEM__SU_CONTENIDO:
				return basicSetSuContenido(null, msgs);
			case DocmgtPackage.ITEM__SU_DOCUMENTO:
				return basicSetSuDocumento(null, msgs);
			case DocmgtPackage.ITEM__BASELINE:
				return basicSetBaseline(null, msgs);
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
			case DocmgtPackage.ITEM__SU_CONTENIDO:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.CONTENIDO__SU_ITEM, Contenido.class, msgs);
			case DocmgtPackage.ITEM__BASELINE:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.BASELINE__SU_ITEM, Baseline.class, msgs);
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
			case DocmgtPackage.ITEM__TEXTO:
				return getTexto();
			case DocmgtPackage.ITEM__HINT:
				return getHInt();
			case DocmgtPackage.ITEM__SU_CONTENIDO:
				return getSuContenido();
			case DocmgtPackage.ITEM__SU_DOCUMENTO:
				if (resolve) return getSuDocumento();
				return basicGetSuDocumento();
			case DocmgtPackage.ITEM__BASELINE:
				return getBaseline();
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
			case DocmgtPackage.ITEM__TEXTO:
				setTexto((String)newValue);
				return;
			case DocmgtPackage.ITEM__HINT:
				setHInt((String)newValue);
				return;
			case DocmgtPackage.ITEM__SU_CONTENIDO:
				setSuContenido((Contenido)newValue);
				return;
			case DocmgtPackage.ITEM__SU_DOCUMENTO:
				setSuDocumento((Documento)newValue);
				return;
			case DocmgtPackage.ITEM__BASELINE:
				setBaseline((Baseline)newValue);
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
			case DocmgtPackage.ITEM__TEXTO:
				setTexto(TEXTO_EDEFAULT);
				return;
			case DocmgtPackage.ITEM__HINT:
				setHInt(HINT_EDEFAULT);
				return;
			case DocmgtPackage.ITEM__SU_CONTENIDO:
				setSuContenido((Contenido)null);
				return;
			case DocmgtPackage.ITEM__SU_DOCUMENTO:
				setSuDocumento((Documento)null);
				return;
			case DocmgtPackage.ITEM__BASELINE:
				setBaseline((Baseline)null);
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
			case DocmgtPackage.ITEM__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
			case DocmgtPackage.ITEM__HINT:
				return HINT_EDEFAULT == null ? hInt != null : !HINT_EDEFAULT.equals(hInt);
			case DocmgtPackage.ITEM__SU_CONTENIDO:
				return getSuContenido() != null;
			case DocmgtPackage.ITEM__SU_DOCUMENTO:
				return suDocumento != null;
			case DocmgtPackage.ITEM__BASELINE:
				return getBaseline() != null;
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
		result.append(" (texto: ");
		result.append(texto);
		result.append(", hInt: ");
		result.append(hInt);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
