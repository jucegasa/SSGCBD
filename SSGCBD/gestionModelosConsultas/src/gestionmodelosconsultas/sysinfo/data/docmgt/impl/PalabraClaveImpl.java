/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Glosario;
import gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave;

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
 * An implementation of the model object '<em><b>Palabra Clave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.PalabraClaveImpl#getGlosario <em>Glosario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.PalabraClaveImpl#getDocumento <em>Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PalabraClaveImpl extends ElementoModeloImpl implements PalabraClave {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PalabraClaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.PALABRA_CLAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glosario getGlosario() {
		if (eContainerFeatureID() != DocmgtPackage.PALABRA_CLAVE__GLOSARIO) return null;
		return (Glosario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlosario(Glosario newGlosario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGlosario, DocmgtPackage.PALABRA_CLAVE__GLOSARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlosario(Glosario newGlosario) {
		if (newGlosario != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.PALABRA_CLAVE__GLOSARIO && newGlosario != null)) {
			if (EcoreUtil.isAncestor(this, newGlosario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGlosario != null)
				msgs = ((InternalEObject)newGlosario).eInverseAdd(this, DocmgtPackage.GLOSARIO__PALABRA_CLAVE, Glosario.class, msgs);
			msgs = basicSetGlosario(newGlosario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.PALABRA_CLAVE__GLOSARIO, newGlosario, newGlosario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documento> getDocumento() {
		if (documento == null) {
			documento = new EObjectWithInverseResolvingEList.ManyInverse<Documento>(Documento.class, this, DocmgtPackage.PALABRA_CLAVE__DOCUMENTO, DocmgtPackage.DOCUMENTO__PALABRA_CLAVE);
		}
		return documento;
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
			case DocmgtPackage.PALABRA_CLAVE__GLOSARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGlosario((Glosario)otherEnd, msgs);
			case DocmgtPackage.PALABRA_CLAVE__DOCUMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumento()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.PALABRA_CLAVE__GLOSARIO:
				return basicSetGlosario(null, msgs);
			case DocmgtPackage.PALABRA_CLAVE__DOCUMENTO:
				return ((InternalEList<?>)getDocumento()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.PALABRA_CLAVE__GLOSARIO:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.GLOSARIO__PALABRA_CLAVE, Glosario.class, msgs);
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
			case DocmgtPackage.PALABRA_CLAVE__GLOSARIO:
				return getGlosario();
			case DocmgtPackage.PALABRA_CLAVE__DOCUMENTO:
				return getDocumento();
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
			case DocmgtPackage.PALABRA_CLAVE__GLOSARIO:
				setGlosario((Glosario)newValue);
				return;
			case DocmgtPackage.PALABRA_CLAVE__DOCUMENTO:
				getDocumento().clear();
				getDocumento().addAll((Collection<? extends Documento>)newValue);
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
			case DocmgtPackage.PALABRA_CLAVE__GLOSARIO:
				setGlosario((Glosario)null);
				return;
			case DocmgtPackage.PALABRA_CLAVE__DOCUMENTO:
				getDocumento().clear();
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
			case DocmgtPackage.PALABRA_CLAVE__GLOSARIO:
				return getGlosario() != null;
			case DocmgtPackage.PALABRA_CLAVE__DOCUMENTO:
				return documento != null && !documento.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PalabraClaveImpl
