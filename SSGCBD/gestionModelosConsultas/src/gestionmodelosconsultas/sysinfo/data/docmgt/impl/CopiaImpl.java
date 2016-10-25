/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Copia;
import gestionmodelosconsultas.sysinfo.data.docmgt.Copias;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje;
import gestionmodelosconsultas.sysinfo.data.docmgt.Producto;

import gestionmodelosconsultas.sysinfo.network.Deposito;
import gestionmodelosconsultas.sysinfo.network.NetworkPackage;

import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

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
 * An implementation of the model object '<em><b>Copia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl#getCopias <em>Copias</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl#getFormato <em>Formato</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl#getConsecutivo <em>Consecutivo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl#getDeposito <em>Deposito</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl#getMensaje <em>Mensaje</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.CopiaImpl#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopiaImpl extends ElementoModeloImpl implements Copia {
	/**
	 * The default value of the '{@link #getFormato() <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormato()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormato() <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormato()
	 * @generated
	 * @ordered
	 */
	protected String formato = FORMATO_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsecutivo() <em>Consecutivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutivo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSECUTIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsecutivo() <em>Consecutivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutivo()
	 * @generated
	 * @ordered
	 */
	protected String consecutivo = CONSECUTIVO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeposito() <em>Deposito</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeposito()
	 * @generated
	 * @ordered
	 */
	protected Deposito deposito;

	/**
	 * The cached value of the '{@link #getMensaje() <em>Mensaje</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected EList<Mensaje> mensaje;

	/**
	 * The cached value of the '{@link #getProducto() <em>Producto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto()
	 * @generated
	 * @ordered
	 */
	protected Producto producto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocmgtPackage.Literals.COPIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copias getCopias() {
		if (eContainerFeatureID() != DocmgtPackage.COPIA__COPIAS) return null;
		return (Copias)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopias(Copias newCopias, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCopias, DocmgtPackage.COPIA__COPIAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopias(Copias newCopias) {
		if (newCopias != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.COPIA__COPIAS && newCopias != null)) {
			if (EcoreUtil.isAncestor(this, newCopias))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCopias != null)
				msgs = ((InternalEObject)newCopias).eInverseAdd(this, DocmgtPackage.COPIAS__COPIA, Copias.class, msgs);
			msgs = basicSetCopias(newCopias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__COPIAS, newCopias, newCopias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormato() {
		return formato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormato(String newFormato) {
		String oldFormato = formato;
		formato = newFormato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__FORMATO, oldFormato, formato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsecutivo() {
		return consecutivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsecutivo(String newConsecutivo) {
		String oldConsecutivo = consecutivo;
		consecutivo = newConsecutivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__CONSECUTIVO, oldConsecutivo, consecutivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deposito getDeposito() {
		if (deposito != null && deposito.eIsProxy()) {
			InternalEObject oldDeposito = (InternalEObject)deposito;
			deposito = (Deposito)eResolveProxy(oldDeposito);
			if (deposito != oldDeposito) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.COPIA__DEPOSITO, oldDeposito, deposito));
			}
		}
		return deposito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deposito basicGetDeposito() {
		return deposito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeposito(Deposito newDeposito, NotificationChain msgs) {
		Deposito oldDeposito = deposito;
		deposito = newDeposito;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__DEPOSITO, oldDeposito, newDeposito);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeposito(Deposito newDeposito) {
		if (newDeposito != deposito) {
			NotificationChain msgs = null;
			if (deposito != null)
				msgs = ((InternalEObject)deposito).eInverseRemove(this, NetworkPackage.DEPOSITO__COPIA, Deposito.class, msgs);
			if (newDeposito != null)
				msgs = ((InternalEObject)newDeposito).eInverseAdd(this, NetworkPackage.DEPOSITO__COPIA, Deposito.class, msgs);
			msgs = basicSetDeposito(newDeposito, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__DEPOSITO, newDeposito, newDeposito));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mensaje> getMensaje() {
		if (mensaje == null) {
			mensaje = new EObjectWithInverseResolvingEList<Mensaje>(Mensaje.class, this, DocmgtPackage.COPIA__MENSAJE, DocmgtPackage.MENSAJE__COPIA);
		}
		return mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto getProducto() {
		if (producto != null && producto.eIsProxy()) {
			InternalEObject oldProducto = (InternalEObject)producto;
			producto = (Producto)eResolveProxy(oldProducto);
			if (producto != oldProducto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.COPIA__PRODUCTO, oldProducto, producto));
			}
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto basicGetProducto() {
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducto(Producto newProducto, NotificationChain msgs) {
		Producto oldProducto = producto;
		producto = newProducto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__PRODUCTO, oldProducto, newProducto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducto(Producto newProducto) {
		if (newProducto != producto) {
			NotificationChain msgs = null;
			if (producto != null)
				msgs = ((InternalEObject)producto).eInverseRemove(this, DocmgtPackage.PRODUCTO__COPIA, Producto.class, msgs);
			if (newProducto != null)
				msgs = ((InternalEObject)newProducto).eInverseAdd(this, DocmgtPackage.PRODUCTO__COPIA, Producto.class, msgs);
			msgs = basicSetProducto(newProducto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__PRODUCTO, newProducto, newProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacional getUnidadOrganizacional() {
		if (eContainerFeatureID() != DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL) return null;
		return (UnidadOrganizacional)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidadOrganizacional, DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadOrganizacional(UnidadOrganizacional newUnidadOrganizacional) {
		if (newUnidadOrganizacional != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL && newUnidadOrganizacional != null)) {
			if (EcoreUtil.isAncestor(this, newUnidadOrganizacional))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidadOrganizacional != null)
				msgs = ((InternalEObject)newUnidadOrganizacional).eInverseAdd(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA, UnidadOrganizacional.class, msgs);
			msgs = basicSetUnidadOrganizacional(newUnidadOrganizacional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL, newUnidadOrganizacional, newUnidadOrganizacional));
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
			case DocmgtPackage.COPIA__COPIAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCopias((Copias)otherEnd, msgs);
			case DocmgtPackage.COPIA__DEPOSITO:
				if (deposito != null)
					msgs = ((InternalEObject)deposito).eInverseRemove(this, NetworkPackage.DEPOSITO__COPIA, Deposito.class, msgs);
				return basicSetDeposito((Deposito)otherEnd, msgs);
			case DocmgtPackage.COPIA__MENSAJE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMensaje()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.COPIA__PRODUCTO:
				if (producto != null)
					msgs = ((InternalEObject)producto).eInverseRemove(this, DocmgtPackage.PRODUCTO__COPIA, Producto.class, msgs);
				return basicSetProducto((Producto)otherEnd, msgs);
			case DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidadOrganizacional((UnidadOrganizacional)otherEnd, msgs);
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
			case DocmgtPackage.COPIA__COPIAS:
				return basicSetCopias(null, msgs);
			case DocmgtPackage.COPIA__DEPOSITO:
				return basicSetDeposito(null, msgs);
			case DocmgtPackage.COPIA__MENSAJE:
				return ((InternalEList<?>)getMensaje()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.COPIA__PRODUCTO:
				return basicSetProducto(null, msgs);
			case DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL:
				return basicSetUnidadOrganizacional(null, msgs);
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
			case DocmgtPackage.COPIA__COPIAS:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.COPIAS__COPIA, Copias.class, msgs);
			case DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA, UnidadOrganizacional.class, msgs);
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
			case DocmgtPackage.COPIA__COPIAS:
				return getCopias();
			case DocmgtPackage.COPIA__FORMATO:
				return getFormato();
			case DocmgtPackage.COPIA__CONSECUTIVO:
				return getConsecutivo();
			case DocmgtPackage.COPIA__DEPOSITO:
				if (resolve) return getDeposito();
				return basicGetDeposito();
			case DocmgtPackage.COPIA__MENSAJE:
				return getMensaje();
			case DocmgtPackage.COPIA__PRODUCTO:
				if (resolve) return getProducto();
				return basicGetProducto();
			case DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional();
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
			case DocmgtPackage.COPIA__COPIAS:
				setCopias((Copias)newValue);
				return;
			case DocmgtPackage.COPIA__FORMATO:
				setFormato((String)newValue);
				return;
			case DocmgtPackage.COPIA__CONSECUTIVO:
				setConsecutivo((String)newValue);
				return;
			case DocmgtPackage.COPIA__DEPOSITO:
				setDeposito((Deposito)newValue);
				return;
			case DocmgtPackage.COPIA__MENSAJE:
				getMensaje().clear();
				getMensaje().addAll((Collection<? extends Mensaje>)newValue);
				return;
			case DocmgtPackage.COPIA__PRODUCTO:
				setProducto((Producto)newValue);
				return;
			case DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)newValue);
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
			case DocmgtPackage.COPIA__COPIAS:
				setCopias((Copias)null);
				return;
			case DocmgtPackage.COPIA__FORMATO:
				setFormato(FORMATO_EDEFAULT);
				return;
			case DocmgtPackage.COPIA__CONSECUTIVO:
				setConsecutivo(CONSECUTIVO_EDEFAULT);
				return;
			case DocmgtPackage.COPIA__DEPOSITO:
				setDeposito((Deposito)null);
				return;
			case DocmgtPackage.COPIA__MENSAJE:
				getMensaje().clear();
				return;
			case DocmgtPackage.COPIA__PRODUCTO:
				setProducto((Producto)null);
				return;
			case DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL:
				setUnidadOrganizacional((UnidadOrganizacional)null);
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
			case DocmgtPackage.COPIA__COPIAS:
				return getCopias() != null;
			case DocmgtPackage.COPIA__FORMATO:
				return FORMATO_EDEFAULT == null ? formato != null : !FORMATO_EDEFAULT.equals(formato);
			case DocmgtPackage.COPIA__CONSECUTIVO:
				return CONSECUTIVO_EDEFAULT == null ? consecutivo != null : !CONSECUTIVO_EDEFAULT.equals(consecutivo);
			case DocmgtPackage.COPIA__DEPOSITO:
				return deposito != null;
			case DocmgtPackage.COPIA__MENSAJE:
				return mensaje != null && !mensaje.isEmpty();
			case DocmgtPackage.COPIA__PRODUCTO:
				return producto != null;
			case DocmgtPackage.COPIA__UNIDAD_ORGANIZACIONAL:
				return getUnidadOrganizacional() != null;
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
		result.append(" (formato: ");
		result.append(formato);
		result.append(", consecutivo: ");
		result.append(consecutivo);
		result.append(')');
		return result.toString();
	}

} //CopiaImpl
