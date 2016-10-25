/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.impl;

import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resultado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultadoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultadoImpl#getModeloConsulta <em>Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultadoImpl#getListResultElement <em>List Result Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultadoImpl extends MinimalEObjectImpl.Container implements Resultado {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListResultElement() <em>List Result Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListResultElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultElement> listResultElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsetPackage.Literals.RESULTADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsetPackage.RESULTADO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConsulta getModeloConsulta() {
		if (eContainerFeatureID() != ResultsetPackage.RESULTADO__MODELO_CONSULTA) return null;
		return (ModeloConsulta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeloConsulta(ModeloConsulta newModeloConsulta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModeloConsulta, ResultsetPackage.RESULTADO__MODELO_CONSULTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeloConsulta(ModeloConsulta newModeloConsulta) {
		if (newModeloConsulta != eInternalContainer() || (eContainerFeatureID() != ResultsetPackage.RESULTADO__MODELO_CONSULTA && newModeloConsulta != null)) {
			if (EcoreUtil.isAncestor(this, newModeloConsulta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModeloConsulta != null)
				msgs = ((InternalEObject)newModeloConsulta).eInverseAdd(this, ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO, ModeloConsulta.class, msgs);
			msgs = basicSetModeloConsulta(newModeloConsulta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsetPackage.RESULTADO__MODELO_CONSULTA, newModeloConsulta, newModeloConsulta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultElement> getListResultElement() {
		if (listResultElement == null) {
			listResultElement = new EObjectContainmentWithInverseEList<ResultElement>(ResultElement.class, this, ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT, ResultsetPackage.RESULT_ELEMENT__RESULTADO);
		}
		return listResultElement;
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
			case ResultsetPackage.RESULTADO__MODELO_CONSULTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModeloConsulta((ModeloConsulta)otherEnd, msgs);
			case ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListResultElement()).basicAdd(otherEnd, msgs);
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
			case ResultsetPackage.RESULTADO__MODELO_CONSULTA:
				return basicSetModeloConsulta(null, msgs);
			case ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT:
				return ((InternalEList<?>)getListResultElement()).basicRemove(otherEnd, msgs);
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
			case ResultsetPackage.RESULTADO__MODELO_CONSULTA:
				return eInternalContainer().eInverseRemove(this, ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO, ModeloConsulta.class, msgs);
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
			case ResultsetPackage.RESULTADO__NOMBRE:
				return getNombre();
			case ResultsetPackage.RESULTADO__MODELO_CONSULTA:
				return getModeloConsulta();
			case ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT:
				return getListResultElement();
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
			case ResultsetPackage.RESULTADO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ResultsetPackage.RESULTADO__MODELO_CONSULTA:
				setModeloConsulta((ModeloConsulta)newValue);
				return;
			case ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT:
				getListResultElement().clear();
				getListResultElement().addAll((Collection<? extends ResultElement>)newValue);
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
			case ResultsetPackage.RESULTADO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ResultsetPackage.RESULTADO__MODELO_CONSULTA:
				setModeloConsulta((ModeloConsulta)null);
				return;
			case ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT:
				getListResultElement().clear();
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
			case ResultsetPackage.RESULTADO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ResultsetPackage.RESULTADO__MODELO_CONSULTA:
				return getModeloConsulta() != null;
			case ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT:
				return listResultElement != null && !listResultElement.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ResultadoImpl
