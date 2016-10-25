/**
 */
package gestionmodelosconsultas.modeloconsultas.model.impl;

import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;

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
 * An implementation of the model object '<em><b>EA Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl#getListRelacion <em>List Relacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl#getModeloConsulta <em>Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.EADiagramImpl#getListElementoConsulta <em>List Elemento Consulta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EADiagramImpl extends MinimalEObjectImpl.Container implements EADiagram {
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
	 * The cached value of the '{@link #getListRelacion() <em>List Relacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRelacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> listRelacion;

	/**
	 * The cached value of the '{@link #getListElementoConsulta() <em>List Elemento Consulta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElementoConsulta()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoConsulta> listElementoConsulta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EADiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EA_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EA_DIAGRAM__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getListRelacion() {
		if (listRelacion == null) {
			listRelacion = new EObjectContainmentWithInverseEList<Relacion>(Relacion.class, this, ModelPackage.EA_DIAGRAM__LIST_RELACION, ModelPackage.RELACION__EA_DIAGRAM);
		}
		return listRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConsulta getModeloConsulta() {
		if (eContainerFeatureID() != ModelPackage.EA_DIAGRAM__MODELO_CONSULTA) return null;
		return (ModeloConsulta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeloConsulta(ModeloConsulta newModeloConsulta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModeloConsulta, ModelPackage.EA_DIAGRAM__MODELO_CONSULTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeloConsulta(ModeloConsulta newModeloConsulta) {
		if (newModeloConsulta != eInternalContainer() || (eContainerFeatureID() != ModelPackage.EA_DIAGRAM__MODELO_CONSULTA && newModeloConsulta != null)) {
			if (EcoreUtil.isAncestor(this, newModeloConsulta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModeloConsulta != null)
				msgs = ((InternalEObject)newModeloConsulta).eInverseAdd(this, ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM, ModeloConsulta.class, msgs);
			msgs = basicSetModeloConsulta(newModeloConsulta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EA_DIAGRAM__MODELO_CONSULTA, newModeloConsulta, newModeloConsulta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoConsulta> getListElementoConsulta() {
		if (listElementoConsulta == null) {
			listElementoConsulta = new EObjectContainmentWithInverseEList<ElementoConsulta>(ElementoConsulta.class, this, ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA, ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM);
		}
		return listElementoConsulta;
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
			case ModelPackage.EA_DIAGRAM__LIST_RELACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListRelacion()).basicAdd(otherEnd, msgs);
			case ModelPackage.EA_DIAGRAM__MODELO_CONSULTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModeloConsulta((ModeloConsulta)otherEnd, msgs);
			case ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListElementoConsulta()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.EA_DIAGRAM__LIST_RELACION:
				return ((InternalEList<?>)getListRelacion()).basicRemove(otherEnd, msgs);
			case ModelPackage.EA_DIAGRAM__MODELO_CONSULTA:
				return basicSetModeloConsulta(null, msgs);
			case ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA:
				return ((InternalEList<?>)getListElementoConsulta()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.EA_DIAGRAM__MODELO_CONSULTA:
				return eInternalContainer().eInverseRemove(this, ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM, ModeloConsulta.class, msgs);
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
			case ModelPackage.EA_DIAGRAM__NOMBRE:
				return getNombre();
			case ModelPackage.EA_DIAGRAM__LIST_RELACION:
				return getListRelacion();
			case ModelPackage.EA_DIAGRAM__MODELO_CONSULTA:
				return getModeloConsulta();
			case ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA:
				return getListElementoConsulta();
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
			case ModelPackage.EA_DIAGRAM__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModelPackage.EA_DIAGRAM__LIST_RELACION:
				getListRelacion().clear();
				getListRelacion().addAll((Collection<? extends Relacion>)newValue);
				return;
			case ModelPackage.EA_DIAGRAM__MODELO_CONSULTA:
				setModeloConsulta((ModeloConsulta)newValue);
				return;
			case ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA:
				getListElementoConsulta().clear();
				getListElementoConsulta().addAll((Collection<? extends ElementoConsulta>)newValue);
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
			case ModelPackage.EA_DIAGRAM__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModelPackage.EA_DIAGRAM__LIST_RELACION:
				getListRelacion().clear();
				return;
			case ModelPackage.EA_DIAGRAM__MODELO_CONSULTA:
				setModeloConsulta((ModeloConsulta)null);
				return;
			case ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA:
				getListElementoConsulta().clear();
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
			case ModelPackage.EA_DIAGRAM__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModelPackage.EA_DIAGRAM__LIST_RELACION:
				return listRelacion != null && !listRelacion.isEmpty();
			case ModelPackage.EA_DIAGRAM__MODELO_CONSULTA:
				return getModeloConsulta() != null;
			case ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA:
				return listElementoConsulta != null && !listElementoConsulta.isEmpty();
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

} //EADiagramImpl
