/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo;
import gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion;
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
 * An implementation of the model object '<em><b>Lista Chequeo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ListaChequeoImpl#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.ListaChequeoImpl#getSuTipo <em>Su Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListaChequeoImpl extends DocumentoImpl implements ListaChequeo {
	/**
	 * The cached value of the '{@link #getSuTipo() <em>Su Tipo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuTipo()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoDocumento> suTipo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListaChequeoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.LISTA_CHEQUEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientacion getOrientacion() {
		if (eContainerFeatureID() != DocmgtPackage.LISTA_CHEQUEO__ORIENTACION) return null;
		return (Orientacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientacion(Orientacion newOrientacion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrientacion, DocmgtPackage.LISTA_CHEQUEO__ORIENTACION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientacion(Orientacion newOrientacion) {
		if (newOrientacion != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.LISTA_CHEQUEO__ORIENTACION && newOrientacion != null)) {
			if (EcoreUtil.isAncestor(this, newOrientacion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrientacion != null)
				msgs = ((InternalEObject)newOrientacion).eInverseAdd(this, DocmgtPackage.ORIENTACION__LISTA_CHEQUEO, Orientacion.class, msgs);
			msgs = basicSetOrientacion(newOrientacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.LISTA_CHEQUEO__ORIENTACION, newOrientacion, newOrientacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoDocumento> getSuTipo() {
		if (suTipo == null) {
			suTipo = new EObjectWithInverseResolvingEList<TipoDocumento>(TipoDocumento.class, this, DocmgtPackage.LISTA_CHEQUEO__SU_TIPO, DocmgtPackage.TIPO_DOCUMENTO__LISTA);
		}
		return suTipo;
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
			case DocmgtPackage.LISTA_CHEQUEO__ORIENTACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrientacion((Orientacion)otherEnd, msgs);
			case DocmgtPackage.LISTA_CHEQUEO__SU_TIPO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuTipo()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.LISTA_CHEQUEO__ORIENTACION:
				return basicSetOrientacion(null, msgs);
			case DocmgtPackage.LISTA_CHEQUEO__SU_TIPO:
				return ((InternalEList<?>)getSuTipo()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.LISTA_CHEQUEO__ORIENTACION:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.ORIENTACION__LISTA_CHEQUEO, Orientacion.class, msgs);
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
			case DocmgtPackage.LISTA_CHEQUEO__ORIENTACION:
				return getOrientacion();
			case DocmgtPackage.LISTA_CHEQUEO__SU_TIPO:
				return getSuTipo();
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
			case DocmgtPackage.LISTA_CHEQUEO__ORIENTACION:
				setOrientacion((Orientacion)newValue);
				return;
			case DocmgtPackage.LISTA_CHEQUEO__SU_TIPO:
				getSuTipo().clear();
				getSuTipo().addAll((Collection<? extends TipoDocumento>)newValue);
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
			case DocmgtPackage.LISTA_CHEQUEO__ORIENTACION:
				setOrientacion((Orientacion)null);
				return;
			case DocmgtPackage.LISTA_CHEQUEO__SU_TIPO:
				getSuTipo().clear();
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
			case DocmgtPackage.LISTA_CHEQUEO__ORIENTACION:
				return getOrientacion() != null;
			case DocmgtPackage.LISTA_CHEQUEO__SU_TIPO:
				return suTipo != null && !suTipo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListaChequeoImpl
