/**
 */
package gestionmodelosconsultas.modeloconsultas.model.impl;

import gestionmodelosconsultas.modeloconsultas.model.Campo;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.NombreCampo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl#getNombreCampo <em>Nombre Campo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl#getCriterio <em>Criterio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl#isSeleccion <em>Seleccion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.CampoImpl#getOwnedElementoConsulta <em>Owned Elemento Consulta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CampoImpl extends MinimalEObjectImpl.Container implements Campo {
	/**
	 * The default value of the '{@link #getNombreCampo() <em>Nombre Campo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCampo()
	 * @generated
	 * @ordered
	 */
	protected static final NombreCampo NOMBRE_CAMPO_EDEFAULT = NombreCampo.DEFAULT;

	/**
	 * The cached value of the '{@link #getNombreCampo() <em>Nombre Campo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCampo()
	 * @generated
	 * @ordered
	 */
	protected NombreCampo nombreCampo = NOMBRE_CAMPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriterio() <em>Criterio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterio()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriterio() <em>Criterio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterio()
	 * @generated
	 * @ordered
	 */
	protected String criterio = CRITERIO_EDEFAULT;

	/**
	 * The default value of the '{@link #isSeleccion() <em>Seleccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeleccion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECCION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeleccion() <em>Seleccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeleccion()
	 * @generated
	 * @ordered
	 */
	protected boolean seleccion = SELECCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CAMPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombreCampo getNombreCampo() {
		return nombreCampo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCampo(NombreCampo newNombreCampo) {
		NombreCampo oldNombreCampo = nombreCampo;
		nombreCampo = newNombreCampo == null ? NOMBRE_CAMPO_EDEFAULT : newNombreCampo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAMPO__NOMBRE_CAMPO, oldNombreCampo, nombreCampo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriterio() {
		return criterio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterio(String newCriterio) {
		String oldCriterio = criterio;
		criterio = newCriterio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAMPO__CRITERIO, oldCriterio, criterio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeleccion() {
		return seleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeleccion(boolean newSeleccion) {
		boolean oldSeleccion = seleccion;
		seleccion = newSeleccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAMPO__SELECCION, oldSeleccion, seleccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoConsulta getOwnedElementoConsulta() {
		if (eContainerFeatureID() != ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA) return null;
		return (ElementoConsulta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElementoConsulta(ElementoConsulta newOwnedElementoConsulta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedElementoConsulta, ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedElementoConsulta(ElementoConsulta newOwnedElementoConsulta) {
		if (newOwnedElementoConsulta != eInternalContainer() || (eContainerFeatureID() != ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA && newOwnedElementoConsulta != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedElementoConsulta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedElementoConsulta != null)
				msgs = ((InternalEObject)newOwnedElementoConsulta).eInverseAdd(this, ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS, ElementoConsulta.class, msgs);
			msgs = basicSetOwnedElementoConsulta(newOwnedElementoConsulta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA, newOwnedElementoConsulta, newOwnedElementoConsulta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedElementoConsulta((ElementoConsulta)otherEnd, msgs);
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
			case ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA:
				return basicSetOwnedElementoConsulta(null, msgs);
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
			case ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA:
				return eInternalContainer().eInverseRemove(this, ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS, ElementoConsulta.class, msgs);
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
			case ModelPackage.CAMPO__NOMBRE_CAMPO:
				return getNombreCampo();
			case ModelPackage.CAMPO__CRITERIO:
				return getCriterio();
			case ModelPackage.CAMPO__SELECCION:
				return isSeleccion();
			case ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA:
				return getOwnedElementoConsulta();
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
			case ModelPackage.CAMPO__NOMBRE_CAMPO:
				setNombreCampo((NombreCampo)newValue);
				return;
			case ModelPackage.CAMPO__CRITERIO:
				setCriterio((String)newValue);
				return;
			case ModelPackage.CAMPO__SELECCION:
				setSeleccion((Boolean)newValue);
				return;
			case ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA:
				setOwnedElementoConsulta((ElementoConsulta)newValue);
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
			case ModelPackage.CAMPO__NOMBRE_CAMPO:
				setNombreCampo(NOMBRE_CAMPO_EDEFAULT);
				return;
			case ModelPackage.CAMPO__CRITERIO:
				setCriterio(CRITERIO_EDEFAULT);
				return;
			case ModelPackage.CAMPO__SELECCION:
				setSeleccion(SELECCION_EDEFAULT);
				return;
			case ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA:
				setOwnedElementoConsulta((ElementoConsulta)null);
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
			case ModelPackage.CAMPO__NOMBRE_CAMPO:
				return nombreCampo != NOMBRE_CAMPO_EDEFAULT;
			case ModelPackage.CAMPO__CRITERIO:
				return CRITERIO_EDEFAULT == null ? criterio != null : !CRITERIO_EDEFAULT.equals(criterio);
			case ModelPackage.CAMPO__SELECCION:
				return seleccion != SELECCION_EDEFAULT;
			case ModelPackage.CAMPO__OWNED_ELEMENTO_CONSULTA:
				return getOwnedElementoConsulta() != null;
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
		result.append(" (nombreCampo: ");
		result.append(nombreCampo);
		result.append(", criterio: ");
		result.append(criterio);
		result.append(", seleccion: ");
		result.append(seleccion);
		result.append(')');
		return result.toString();
	}

} //CampoImpl
