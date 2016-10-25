/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Guia;
import gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion;
import gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.GuiaImpl#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.GuiaImpl#getSuTipo <em>Su Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiaImpl extends DocumentoImpl implements Guia {
	/**
	 * The cached value of the '{@link #getSuTipo() <em>Su Tipo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoDocumento suTipo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.GUIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientacion getOrientacion() {
		if (eContainerFeatureID() != DocmgtPackage.GUIA__ORIENTACION) return null;
		return (Orientacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientacion(Orientacion newOrientacion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrientacion, DocmgtPackage.GUIA__ORIENTACION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientacion(Orientacion newOrientacion) {
		if (newOrientacion != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.GUIA__ORIENTACION && newOrientacion != null)) {
			if (EcoreUtil.isAncestor(this, newOrientacion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrientacion != null)
				msgs = ((InternalEObject)newOrientacion).eInverseAdd(this, DocmgtPackage.ORIENTACION__GUIA, Orientacion.class, msgs);
			msgs = basicSetOrientacion(newOrientacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.GUIA__ORIENTACION, newOrientacion, newOrientacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDocumento getSuTipo() {
		if (suTipo != null && suTipo.eIsProxy()) {
			InternalEObject oldSuTipo = (InternalEObject)suTipo;
			suTipo = (TipoDocumento)eResolveProxy(oldSuTipo);
			if (suTipo != oldSuTipo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.GUIA__SU_TIPO, oldSuTipo, suTipo));
			}
		}
		return suTipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDocumento basicGetSuTipo() {
		return suTipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuTipo(TipoDocumento newSuTipo, NotificationChain msgs) {
		TipoDocumento oldSuTipo = suTipo;
		suTipo = newSuTipo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.GUIA__SU_TIPO, oldSuTipo, newSuTipo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuTipo(TipoDocumento newSuTipo) {
		if (newSuTipo != suTipo) {
			NotificationChain msgs = null;
			if (suTipo != null)
				msgs = ((InternalEObject)suTipo).eInverseRemove(this, DocmgtPackage.TIPO_DOCUMENTO__GUIA, TipoDocumento.class, msgs);
			if (newSuTipo != null)
				msgs = ((InternalEObject)newSuTipo).eInverseAdd(this, DocmgtPackage.TIPO_DOCUMENTO__GUIA, TipoDocumento.class, msgs);
			msgs = basicSetSuTipo(newSuTipo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.GUIA__SU_TIPO, newSuTipo, newSuTipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocmgtPackage.GUIA__ORIENTACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrientacion((Orientacion)otherEnd, msgs);
			case DocmgtPackage.GUIA__SU_TIPO:
				if (suTipo != null)
					msgs = ((InternalEObject)suTipo).eInverseRemove(this, DocmgtPackage.TIPO_DOCUMENTO__GUIA, TipoDocumento.class, msgs);
				return basicSetSuTipo((TipoDocumento)otherEnd, msgs);
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
			case DocmgtPackage.GUIA__ORIENTACION:
				return basicSetOrientacion(null, msgs);
			case DocmgtPackage.GUIA__SU_TIPO:
				return basicSetSuTipo(null, msgs);
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
			case DocmgtPackage.GUIA__ORIENTACION:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.ORIENTACION__GUIA, Orientacion.class, msgs);
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
			case DocmgtPackage.GUIA__ORIENTACION:
				return getOrientacion();
			case DocmgtPackage.GUIA__SU_TIPO:
				if (resolve) return getSuTipo();
				return basicGetSuTipo();
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
			case DocmgtPackage.GUIA__ORIENTACION:
				setOrientacion((Orientacion)newValue);
				return;
			case DocmgtPackage.GUIA__SU_TIPO:
				setSuTipo((TipoDocumento)newValue);
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
			case DocmgtPackage.GUIA__ORIENTACION:
				setOrientacion((Orientacion)null);
				return;
			case DocmgtPackage.GUIA__SU_TIPO:
				setSuTipo((TipoDocumento)null);
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
			case DocmgtPackage.GUIA__ORIENTACION:
				return getOrientacion() != null;
			case DocmgtPackage.GUIA__SU_TIPO:
				return suTipo != null;
		}
		return super.eIsSet(featureID);
	}

} //GuiaImpl
