/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.DataPackage;
import gestionmodelosconsultas.sysinfo.data.Data_View;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Guia;
import gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo;
import gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion;
import gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla;
import gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

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
 * An implementation of the model object '<em><b>Orientacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl#getData_View <em>Data View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl#getPlantilla <em>Plantilla</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl#getGuia <em>Guia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl#getListaChequeo <em>Lista Chequeo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.OrientacionImpl#getTipoDocumento <em>Tipo Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrientacionImpl extends PaqueteImpl implements Orientacion {
	/**
	 * The cached value of the '{@link #getPlantilla() <em>Plantilla</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantilla()
	 * @generated
	 * @ordered
	 */
	protected EList<Plantilla> plantilla;

	/**
	 * The cached value of the '{@link #getGuia() <em>Guia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuia()
	 * @generated
	 * @ordered
	 */
	protected EList<Guia> guia;

	/**
	 * The cached value of the '{@link #getListaChequeo() <em>Lista Chequeo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaChequeo()
	 * @generated
	 * @ordered
	 */
	protected EList<ListaChequeo> listaChequeo;

	/**
	 * The cached value of the '{@link #getTipoDocumento() <em>Tipo Documento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoDocumento> tipoDocumento;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrientacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.ORIENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_View getData_View() {
		if (eContainerFeatureID() != DocmgtPackage.ORIENTACION__DATA_VIEW) return null;
		return (Data_View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData_View(Data_View newData_View, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newData_View, DocmgtPackage.ORIENTACION__DATA_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_View(Data_View newData_View) {
		if (newData_View != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.ORIENTACION__DATA_VIEW && newData_View != null)) {
			if (EcoreUtil.isAncestor(this, newData_View))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newData_View != null)
				msgs = ((InternalEObject)newData_View).eInverseAdd(this, DataPackage.DATA_VIEW__ORIENTACION, Data_View.class, msgs);
			msgs = basicSetData_View(newData_View, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.ORIENTACION__DATA_VIEW, newData_View, newData_View));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plantilla> getPlantilla() {
		if (plantilla == null) {
			plantilla = new EObjectContainmentWithInverseEList<Plantilla>(Plantilla.class, this, DocmgtPackage.ORIENTACION__PLANTILLA, DocmgtPackage.PLANTILLA__ORIENTACION);
		}
		return plantilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guia> getGuia() {
		if (guia == null) {
			guia = new EObjectContainmentWithInverseEList<Guia>(Guia.class, this, DocmgtPackage.ORIENTACION__GUIA, DocmgtPackage.GUIA__ORIENTACION);
		}
		return guia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListaChequeo> getListaChequeo() {
		if (listaChequeo == null) {
			listaChequeo = new EObjectContainmentWithInverseEList<ListaChequeo>(ListaChequeo.class, this, DocmgtPackage.ORIENTACION__LISTA_CHEQUEO, DocmgtPackage.LISTA_CHEQUEO__ORIENTACION);
		}
		return listaChequeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoDocumento> getTipoDocumento() {
		if (tipoDocumento == null) {
			tipoDocumento = new EObjectContainmentWithInverseEList<TipoDocumento>(TipoDocumento.class, this, DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO, DocmgtPackage.TIPO_DOCUMENTO__ORIENTACION);
		}
		return tipoDocumento;
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
			case DocmgtPackage.ORIENTACION__DATA_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetData_View((Data_View)otherEnd, msgs);
			case DocmgtPackage.ORIENTACION__PLANTILLA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlantilla()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.ORIENTACION__GUIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuia()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.ORIENTACION__LISTA_CHEQUEO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaChequeo()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTipoDocumento()).basicAdd(otherEnd, msgs);
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
			case DocmgtPackage.ORIENTACION__DATA_VIEW:
				return basicSetData_View(null, msgs);
			case DocmgtPackage.ORIENTACION__PLANTILLA:
				return ((InternalEList<?>)getPlantilla()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.ORIENTACION__GUIA:
				return ((InternalEList<?>)getGuia()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.ORIENTACION__LISTA_CHEQUEO:
				return ((InternalEList<?>)getListaChequeo()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO:
				return ((InternalEList<?>)getTipoDocumento()).basicRemove(otherEnd, msgs);
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
			case DocmgtPackage.ORIENTACION__DATA_VIEW:
				return eInternalContainer().eInverseRemove(this, DataPackage.DATA_VIEW__ORIENTACION, Data_View.class, msgs);
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
			case DocmgtPackage.ORIENTACION__DATA_VIEW:
				return getData_View();
			case DocmgtPackage.ORIENTACION__PLANTILLA:
				return getPlantilla();
			case DocmgtPackage.ORIENTACION__GUIA:
				return getGuia();
			case DocmgtPackage.ORIENTACION__LISTA_CHEQUEO:
				return getListaChequeo();
			case DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO:
				return getTipoDocumento();
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
			case DocmgtPackage.ORIENTACION__DATA_VIEW:
				setData_View((Data_View)newValue);
				return;
			case DocmgtPackage.ORIENTACION__PLANTILLA:
				getPlantilla().clear();
				getPlantilla().addAll((Collection<? extends Plantilla>)newValue);
				return;
			case DocmgtPackage.ORIENTACION__GUIA:
				getGuia().clear();
				getGuia().addAll((Collection<? extends Guia>)newValue);
				return;
			case DocmgtPackage.ORIENTACION__LISTA_CHEQUEO:
				getListaChequeo().clear();
				getListaChequeo().addAll((Collection<? extends ListaChequeo>)newValue);
				return;
			case DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO:
				getTipoDocumento().clear();
				getTipoDocumento().addAll((Collection<? extends TipoDocumento>)newValue);
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
			case DocmgtPackage.ORIENTACION__DATA_VIEW:
				setData_View((Data_View)null);
				return;
			case DocmgtPackage.ORIENTACION__PLANTILLA:
				getPlantilla().clear();
				return;
			case DocmgtPackage.ORIENTACION__GUIA:
				getGuia().clear();
				return;
			case DocmgtPackage.ORIENTACION__LISTA_CHEQUEO:
				getListaChequeo().clear();
				return;
			case DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO:
				getTipoDocumento().clear();
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
			case DocmgtPackage.ORIENTACION__DATA_VIEW:
				return getData_View() != null;
			case DocmgtPackage.ORIENTACION__PLANTILLA:
				return plantilla != null && !plantilla.isEmpty();
			case DocmgtPackage.ORIENTACION__GUIA:
				return guia != null && !guia.isEmpty();
			case DocmgtPackage.ORIENTACION__LISTA_CHEQUEO:
				return listaChequeo != null && !listaChequeo.isEmpty();
			case DocmgtPackage.ORIENTACION__TIPO_DOCUMENTO:
				return tipoDocumento != null && !tipoDocumento.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrientacionImpl
