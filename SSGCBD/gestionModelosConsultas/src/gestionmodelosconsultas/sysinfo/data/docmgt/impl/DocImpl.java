/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Doc;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Libreria;
import gestionmodelosconsultas.sysinfo.data.docmgt.Producto;
import gestionmodelosconsultas.sysinfo.data.docmgt.Version;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocImpl#getLibreria <em>Libreria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocImpl extends ElementoModeloImpl implements Doc {
	/**
	 * The cached value of the '{@link #getDocumento() <em>Documento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected EList<Documento> documento;

	/**
	 * The cached value of the '{@link #getProducto() <em>Producto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> producto;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.DOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documento> getDocumento() {
		if (documento == null) {
			documento = new EObjectContainmentWithInverseEList<Documento>(Documento.class, this, DocmgtPackage.DOC__DOCUMENTO, DocmgtPackage.DOCUMENTO__DOC);
		}
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProducto() {
		if (producto == null) {
			producto = new EObjectContainmentWithInverseEList<Producto>(Producto.class, this, DocmgtPackage.DOC__PRODUCTO, DocmgtPackage.PRODUCTO__DOC);
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersion() {
		if (version == null) {
			version = new EObjectContainmentWithInverseEList<Version>(Version.class, this, DocmgtPackage.DOC__VERSION, DocmgtPackage.VERSION__DOC);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Libreria getLibreria() {
		if (eContainerFeatureID() != DocmgtPackage.DOC__LIBRERIA) return null;
		return (Libreria)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibreria(Libreria newLibreria, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibreria, DocmgtPackage.DOC__LIBRERIA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibreria(Libreria newLibreria) {
		if (newLibreria != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.DOC__LIBRERIA && newLibreria != null)) {
			if (EcoreUtil.isAncestor(this, newLibreria))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibreria != null)
				msgs = ((InternalEObject)newLibreria).eInverseAdd(this, DocmgtPackage.LIBRERIA__DOC, Libreria.class, msgs);
			msgs = basicSetLibreria(newLibreria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOC__LIBRERIA, newLibreria, newLibreria));
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
			case DocmgtPackage.DOC__DOCUMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumento()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOC__PRODUCTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducto()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOC__VERSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersion()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOC__LIBRERIA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibreria((Libreria)otherEnd, msgs);
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
			case DocmgtPackage.DOC__DOCUMENTO:
				return ((InternalEList<?>)getDocumento()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOC__PRODUCTO:
				return ((InternalEList<?>)getProducto()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOC__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOC__LIBRERIA:
				return basicSetLibreria(null, msgs);
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
			case DocmgtPackage.DOC__LIBRERIA:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.LIBRERIA__DOC, Libreria.class, msgs);
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
			case DocmgtPackage.DOC__DOCUMENTO:
				return getDocumento();
			case DocmgtPackage.DOC__PRODUCTO:
				return getProducto();
			case DocmgtPackage.DOC__VERSION:
				return getVersion();
			case DocmgtPackage.DOC__LIBRERIA:
				return getLibreria();
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
			case DocmgtPackage.DOC__DOCUMENTO:
				getDocumento().clear();
				getDocumento().addAll((Collection<? extends Documento>)newValue);
				return;
			case DocmgtPackage.DOC__PRODUCTO:
				getProducto().clear();
				getProducto().addAll((Collection<? extends Producto>)newValue);
				return;
			case DocmgtPackage.DOC__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends Version>)newValue);
				return;
			case DocmgtPackage.DOC__LIBRERIA:
				setLibreria((Libreria)newValue);
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
			case DocmgtPackage.DOC__DOCUMENTO:
				getDocumento().clear();
				return;
			case DocmgtPackage.DOC__PRODUCTO:
				getProducto().clear();
				return;
			case DocmgtPackage.DOC__VERSION:
				getVersion().clear();
				return;
			case DocmgtPackage.DOC__LIBRERIA:
				setLibreria((Libreria)null);
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
			case DocmgtPackage.DOC__DOCUMENTO:
				return documento != null && !documento.isEmpty();
			case DocmgtPackage.DOC__PRODUCTO:
				return producto != null && !producto.isEmpty();
			case DocmgtPackage.DOC__VERSION:
				return version != null && !version.isEmpty();
			case DocmgtPackage.DOC__LIBRERIA:
				return getLibreria() != null;
		}
		return super.eIsSet(featureID);
	}

} //DocImpl
