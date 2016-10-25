/**
 */
package gestionmodelosconsultas.memoms.info.impl;

import gestionmodelosconsultas.memoms.MemoFactory;
import gestionmodelosconsultas.memoms.MemomsPackage;

import gestionmodelosconsultas.memoms.info.InfoPackage;
import gestionmodelosconsultas.memoms.info.SerieDocumental;
import gestionmodelosconsultas.memoms.info.TablaRetencionDocumental;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabla Retencion Documental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl#getSerieDocumental <em>Serie Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl#getMemoFactory <em>Memo Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.impl.TablaRetencionDocumentalImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TablaRetencionDocumentalImpl extends MinimalEObjectImpl.Container implements TablaRetencionDocumental {
	/**
	 * The cached value of the '{@link #getDocumento() <em>Documento</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected EList<Documento> documento;

	/**
	 * The cached value of the '{@link #getSerieDocumental() <em>Serie Documental</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerieDocumental()
	 * @generated
	 * @ordered
	 */
	protected EList<SerieDocumental> serieDocumental;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TablaRetencionDocumentalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfoPackage.Literals.TABLA_RETENCION_DOCUMENTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documento> getDocumento() {
		if (documento == null) {
			documento = new EObjectWithInverseResolvingEList<Documento>(Documento.class, this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO, DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL);
		}
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerieDocumental> getSerieDocumental() {
		if (serieDocumental == null) {
			serieDocumental = new EObjectContainmentWithInverseEList<SerieDocumental>(SerieDocumental.class, this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL, InfoPackage.SERIE_DOCUMENTAL__TABLA_RETENCION_DOCUMENTAL);
		}
		return serieDocumental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoFactory getMemoFactory() {
		if (eContainerFeatureID() != InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY) return null;
		return (MemoFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoFactory(MemoFactory newMemoFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMemoFactory, InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoFactory(MemoFactory newMemoFactory) {
		if (newMemoFactory != eInternalContainer() || (eContainerFeatureID() != InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY && newMemoFactory != null)) {
			if (EcoreUtil.isAncestor(this, newMemoFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMemoFactory != null)
				msgs = ((InternalEObject)newMemoFactory).eInverseAdd(this, MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL, MemoFactory.class, msgs);
			msgs = basicSetMemoFactory(newMemoFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY, newMemoFactory, newMemoFactory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfoPackage.TABLA_RETENCION_DOCUMENTAL__DESCRIPCION, oldDescripcion, descripcion));
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
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumento()).basicAdd(otherEnd, msgs);
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSerieDocumental()).basicAdd(otherEnd, msgs);
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMemoFactory((MemoFactory)otherEnd, msgs);
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
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO:
				return ((InternalEList<?>)getDocumento()).basicRemove(otherEnd, msgs);
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL:
				return ((InternalEList<?>)getSerieDocumental()).basicRemove(otherEnd, msgs);
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY:
				return basicSetMemoFactory(null, msgs);
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
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY:
				return eInternalContainer().eInverseRemove(this, MemomsPackage.MEMO_FACTORY__TABLA_RETENCION_DOCUMENTAL, MemoFactory.class, msgs);
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
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO:
				return getDocumento();
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL:
				return getSerieDocumental();
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY:
				return getMemoFactory();
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DESCRIPCION:
				return getDescripcion();
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
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO:
				getDocumento().clear();
				getDocumento().addAll((Collection<? extends Documento>)newValue);
				return;
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL:
				getSerieDocumental().clear();
				getSerieDocumental().addAll((Collection<? extends SerieDocumental>)newValue);
				return;
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY:
				setMemoFactory((MemoFactory)newValue);
				return;
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DESCRIPCION:
				setDescripcion((String)newValue);
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
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO:
				getDocumento().clear();
				return;
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL:
				getSerieDocumental().clear();
				return;
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY:
				setMemoFactory((MemoFactory)null);
				return;
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
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
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO:
				return documento != null && !documento.isEmpty();
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__SERIE_DOCUMENTAL:
				return serieDocumental != null && !serieDocumental.isEmpty();
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__MEMO_FACTORY:
				return getMemoFactory() != null;
			case InfoPackage.TABLA_RETENCION_DOCUMENTAL__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
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
		result.append(')');
		return result.toString();
	}

} //TablaRetencionDocumentalImpl
