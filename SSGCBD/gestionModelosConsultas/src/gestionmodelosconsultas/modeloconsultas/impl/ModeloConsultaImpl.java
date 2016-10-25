/**
 */
package gestionmodelosconsultas.modeloconsultas.impl;

import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.RealizacionDiagramEntity;

import gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

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
 * An implementation of the model object '<em><b>Modelo Consulta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl#getRealizacionDiagramEntity <em>Realizacion Diagram Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl#getFactoryModeloConsulta <em>Factory Modelo Consulta</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl#getListEADiagram <em>List EA Diagram</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.impl.ModeloConsultaImpl#getListResultado <em>List Resultado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeloConsultaImpl extends MinimalEObjectImpl.Container implements ModeloConsulta {
	/**
	 * The cached value of the '{@link #getRealizacionDiagramEntity() <em>Realizacion Diagram Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizacionDiagramEntity()
	 * @generated
	 * @ordered
	 */
	protected RealizacionDiagramEntity realizacionDiagramEntity;

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
	 * The cached value of the '{@link #getListEADiagram() <em>List EA Diagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListEADiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<EADiagram> listEADiagram;

	/**
	 * The cached value of the '{@link #getListResultado() <em>List Resultado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListResultado()
	 * @generated
	 * @ordered
	 */
	protected EList<Resultado> listResultado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloConsultaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloconsultasPackage.Literals.MODELO_CONSULTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizacionDiagramEntity getRealizacionDiagramEntity() {
		return realizacionDiagramEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity, NotificationChain msgs) {
		RealizacionDiagramEntity oldRealizacionDiagramEntity = realizacionDiagramEntity;
		realizacionDiagramEntity = newRealizacionDiagramEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY, oldRealizacionDiagramEntity, newRealizacionDiagramEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizacionDiagramEntity(RealizacionDiagramEntity newRealizacionDiagramEntity) {
		if (newRealizacionDiagramEntity != realizacionDiagramEntity) {
			NotificationChain msgs = null;
			if (realizacionDiagramEntity != null)
				msgs = ((InternalEObject)realizacionDiagramEntity).eInverseRemove(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA, RealizacionDiagramEntity.class, msgs);
			if (newRealizacionDiagramEntity != null)
				msgs = ((InternalEObject)newRealizacionDiagramEntity).eInverseAdd(this, EntitymodelPackage.REALIZACION_DIAGRAM_ENTITY__MODELO_CONSULTA, RealizacionDiagramEntity.class, msgs);
			msgs = basicSetRealizacionDiagramEntity(newRealizacionDiagramEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY, newRealizacionDiagramEntity, newRealizacionDiagramEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloconsultasPackage.MODELO_CONSULTA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryModeloConsulta getFactoryModeloConsulta() {
		if (eContainerFeatureID() != ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA) return null;
		return (FactoryModeloConsulta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryModeloConsulta(FactoryModeloConsulta newFactoryModeloConsulta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryModeloConsulta, ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryModeloConsulta(FactoryModeloConsulta newFactoryModeloConsulta) {
		if (newFactoryModeloConsulta != eInternalContainer() || (eContainerFeatureID() != ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA && newFactoryModeloConsulta != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryModeloConsulta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryModeloConsulta != null)
				msgs = ((InternalEObject)newFactoryModeloConsulta).eInverseAdd(this, ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA, FactoryModeloConsulta.class, msgs);
			msgs = basicSetFactoryModeloConsulta(newFactoryModeloConsulta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA, newFactoryModeloConsulta, newFactoryModeloConsulta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EADiagram> getListEADiagram() {
		if (listEADiagram == null) {
			listEADiagram = new EObjectContainmentWithInverseEList<EADiagram>(EADiagram.class, this, ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM, ModelPackage.EA_DIAGRAM__MODELO_CONSULTA);
		}
		return listEADiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resultado> getListResultado() {
		if (listResultado == null) {
			listResultado = new EObjectContainmentWithInverseEList<Resultado>(Resultado.class, this, ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO, ResultsetPackage.RESULTADO__MODELO_CONSULTA);
		}
		return listResultado;
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
			case ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY:
				if (realizacionDiagramEntity != null)
					msgs = ((InternalEObject)realizacionDiagramEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY, null, msgs);
				return basicSetRealizacionDiagramEntity((RealizacionDiagramEntity)otherEnd, msgs);
			case ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFactoryModeloConsulta((FactoryModeloConsulta)otherEnd, msgs);
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListEADiagram()).basicAdd(otherEnd, msgs);
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListResultado()).basicAdd(otherEnd, msgs);
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
			case ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY:
				return basicSetRealizacionDiagramEntity(null, msgs);
			case ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA:
				return basicSetFactoryModeloConsulta(null, msgs);
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM:
				return ((InternalEList<?>)getListEADiagram()).basicRemove(otherEnd, msgs);
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO:
				return ((InternalEList<?>)getListResultado()).basicRemove(otherEnd, msgs);
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
			case ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA:
				return eInternalContainer().eInverseRemove(this, ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA, FactoryModeloConsulta.class, msgs);
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
			case ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY:
				return getRealizacionDiagramEntity();
			case ModeloconsultasPackage.MODELO_CONSULTA__NOMBRE:
				return getNombre();
			case ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA:
				return getFactoryModeloConsulta();
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM:
				return getListEADiagram();
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO:
				return getListResultado();
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
			case ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)newValue);
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA:
				setFactoryModeloConsulta((FactoryModeloConsulta)newValue);
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM:
				getListEADiagram().clear();
				getListEADiagram().addAll((Collection<? extends EADiagram>)newValue);
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO:
				getListResultado().clear();
				getListResultado().addAll((Collection<? extends Resultado>)newValue);
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
			case ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY:
				setRealizacionDiagramEntity((RealizacionDiagramEntity)null);
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA:
				setFactoryModeloConsulta((FactoryModeloConsulta)null);
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM:
				getListEADiagram().clear();
				return;
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO:
				getListResultado().clear();
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
			case ModeloconsultasPackage.MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY:
				return realizacionDiagramEntity != null;
			case ModeloconsultasPackage.MODELO_CONSULTA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModeloconsultasPackage.MODELO_CONSULTA__FACTORY_MODELO_CONSULTA:
				return getFactoryModeloConsulta() != null;
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_EA_DIAGRAM:
				return listEADiagram != null && !listEADiagram.isEmpty();
			case ModeloconsultasPackage.MODELO_CONSULTA__LIST_RESULTADO:
				return listResultado != null && !listResultado.isEmpty();
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

} //ModeloConsultaImpl
