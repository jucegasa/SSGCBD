/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.CorePackage;
import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry;
import gestionmodelosconsultas.sysinfo.data.docmgt.Indice;

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
 * An implementation of the model object '<em><b>Index Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndexEntryImpl#getSuDocumento <em>Su Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndexEntryImpl#getIndice <em>Indice</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.IndexEntryImpl#getSuElemento <em>Su Elemento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexEntryImpl extends ElementoModeloImpl implements IndexEntry {
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
	 * The cached value of the '{@link #getSuElemento() <em>Su Elemento</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuElemento()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoModelo> suElemento;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.INDEX_ENTRY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO, oldSuDocumento, suDocumento));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO, oldSuDocumento, newSuDocumento);
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
				msgs = ((InternalEObject)suDocumento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO, Documento.class, msgs);
			if (newSuDocumento != null)
				msgs = ((InternalEObject)newSuDocumento).eInverseAdd(this, DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO, Documento.class, msgs);
			msgs = basicSetSuDocumento(newSuDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO, newSuDocumento, newSuDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indice getIndice() {
		if (eContainerFeatureID() != DocmgtPackage.INDEX_ENTRY__INDICE) return null;
		return (Indice)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndice(Indice newIndice, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIndice, DocmgtPackage.INDEX_ENTRY__INDICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndice(Indice newIndice) {
		if (newIndice != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.INDEX_ENTRY__INDICE && newIndice != null)) {
			if (EcoreUtil.isAncestor(this, newIndice))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIndice != null)
				msgs = ((InternalEObject)newIndice).eInverseAdd(this, DocmgtPackage.INDICE__INDICE, Indice.class, msgs);
			msgs = basicSetIndice(newIndice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.INDEX_ENTRY__INDICE, newIndice, newIndice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoModelo> getSuElemento() {
		if (suElemento == null) {
			suElemento = new EObjectWithInverseResolvingEList.ManyInverse<ElementoModelo>(ElementoModelo.class, this, DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO, CorePackage.ELEMENTO_MODELO__CONTEXTO);
		}
		return suElemento;
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
			case DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO:
				if (suDocumento != null)
					msgs = ((InternalEObject)suDocumento).eInverseRemove(this, DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO, Documento.class, msgs);
				return basicSetSuDocumento((Documento)otherEnd, msgs);
			case DocmgtPackage.INDEX_ENTRY__INDICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIndice((Indice)otherEnd, msgs);
			case DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuElemento()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO:
				return basicSetSuDocumento(null, msgs);
			case DocmgtPackage.INDEX_ENTRY__INDICE:
				return basicSetIndice(null, msgs);
			case DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO:
				return ((InternalEList<?>)getSuElemento()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.INDEX_ENTRY__INDICE:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.INDICE__INDICE, Indice.class, msgs);
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
			case DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO:
				if (resolve) return getSuDocumento();
				return basicGetSuDocumento();
			case DocmgtPackage.INDEX_ENTRY__INDICE:
				return getIndice();
			case DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO:
				return getSuElemento();
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
			case DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO:
				setSuDocumento((Documento)newValue);
				return;
			case DocmgtPackage.INDEX_ENTRY__INDICE:
				setIndice((Indice)newValue);
				return;
			case DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO:
				getSuElemento().clear();
				getSuElemento().addAll((Collection<? extends ElementoModelo>)newValue);
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
			case DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO:
				setSuDocumento((Documento)null);
				return;
			case DocmgtPackage.INDEX_ENTRY__INDICE:
				setIndice((Indice)null);
				return;
			case DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO:
				getSuElemento().clear();
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
			case DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO:
				return suDocumento != null;
			case DocmgtPackage.INDEX_ENTRY__INDICE:
				return getIndice() != null;
			case DocmgtPackage.INDEX_ENTRY__SU_ELEMENTO:
				return suElemento != null && !suElemento.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndexEntryImpl
