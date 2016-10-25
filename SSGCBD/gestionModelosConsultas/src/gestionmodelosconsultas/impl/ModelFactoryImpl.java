/**
 */
package gestionmodelosconsultas.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;
import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;
import gestionmodelosconsultas.rules.factoryrules.RulesFactory;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.impl.ModelFactoryImpl#getRulesFactory <em>Rules Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.impl.ModelFactoryImpl#getFactoryModeloConsultas <em>Factory Modelo Consultas</em>}</li>
 *   <li>{@link gestionmodelosconsultas.impl.ModelFactoryImpl#getDiagramEntity <em>Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelFactoryImpl extends MinimalEObjectImpl.Container implements ModelFactory {
	/**
	 * The cached value of the '{@link #getRulesFactory() <em>Rules Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesFactory()
	 * @generated
	 * @ordered
	 */
	protected RulesFactory rulesFactory;

	/**
	 * The cached value of the '{@link #getFactoryModeloConsultas() <em>Factory Modelo Consultas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryModeloConsultas()
	 * @generated
	 * @ordered
	 */
	protected FactoryModeloConsulta factoryModeloConsultas;

	/**
	 * The cached value of the '{@link #getDiagramEntity() <em>Diagram Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramEntity()
	 * @generated
	 * @ordered
	 */
	protected DiagramEntity diagramEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionmodelosconsultasPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return rulesFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRulesFactory(RulesFactory newRulesFactory, NotificationChain msgs) {
		RulesFactory oldRulesFactory = rulesFactory;
		rulesFactory = newRulesFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY, oldRulesFactory, newRulesFactory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulesFactory(RulesFactory newRulesFactory) {
		if (newRulesFactory != rulesFactory) {
			NotificationChain msgs = null;
			if (rulesFactory != null)
				msgs = ((InternalEObject)rulesFactory).eInverseRemove(this, FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY, RulesFactory.class, msgs);
			if (newRulesFactory != null)
				msgs = ((InternalEObject)newRulesFactory).eInverseAdd(this, FactoryrulesPackage.RULES_FACTORY__MODEL_FACTORY, RulesFactory.class, msgs);
			msgs = basicSetRulesFactory(newRulesFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY, newRulesFactory, newRulesFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryModeloConsulta getFactoryModeloConsultas() {
		return factoryModeloConsultas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryModeloConsultas(FactoryModeloConsulta newFactoryModeloConsultas, NotificationChain msgs) {
		FactoryModeloConsulta oldFactoryModeloConsultas = factoryModeloConsultas;
		factoryModeloConsultas = newFactoryModeloConsultas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS, oldFactoryModeloConsultas, newFactoryModeloConsultas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryModeloConsultas(FactoryModeloConsulta newFactoryModeloConsultas) {
		if (newFactoryModeloConsultas != factoryModeloConsultas) {
			NotificationChain msgs = null;
			if (factoryModeloConsultas != null)
				msgs = ((InternalEObject)factoryModeloConsultas).eInverseRemove(this, ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY, FactoryModeloConsulta.class, msgs);
			if (newFactoryModeloConsultas != null)
				msgs = ((InternalEObject)newFactoryModeloConsultas).eInverseAdd(this, ModeloconsultasPackage.FACTORY_MODELO_CONSULTA__MODEL_FACTORY, FactoryModeloConsulta.class, msgs);
			msgs = basicSetFactoryModeloConsultas(newFactoryModeloConsultas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS, newFactoryModeloConsultas, newFactoryModeloConsultas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramEntity getDiagramEntity() {
		return diagramEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramEntity(DiagramEntity newDiagramEntity, NotificationChain msgs) {
		DiagramEntity oldDiagramEntity = diagramEntity;
		diagramEntity = newDiagramEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY, oldDiagramEntity, newDiagramEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramEntity(DiagramEntity newDiagramEntity) {
		if (newDiagramEntity != diagramEntity) {
			NotificationChain msgs = null;
			if (diagramEntity != null)
				msgs = ((InternalEObject)diagramEntity).eInverseRemove(this, EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY, DiagramEntity.class, msgs);
			if (newDiagramEntity != null)
				msgs = ((InternalEObject)newDiagramEntity).eInverseAdd(this, EntitymodelPackage.DIAGRAM_ENTITY__MODEL_FACTORY, DiagramEntity.class, msgs);
			msgs = basicSetDiagramEntity(newDiagramEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY, newDiagramEntity, newDiagramEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory cargar() {
		ModelFactory modelFactory = null;
				
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/GestionConsultas/modelos/produccion.gestionmodelosconsultas");
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
				try {
					resource.load(java.util.Collections.EMPTY_MAP);
					modelFactory = (ModelFactory) resource.getContents().get(0);
				} catch (java.io.IOException e) {
					// TO-DO Auto-generated catch block
					e.printStackTrace();
				}
		
				return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void salvar() {
		ModelFactory modelFactory = this;
				  
				
				  org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/GestionConsultas/modelos/produccion.gestionmodelosconsultas");
		
				  org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		
				  org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
				  resource.getContents().add(modelFactory);
				  try {
				   resource.save(java.util.Collections.EMPTY_MAP);
				  } catch (java.io.IOException e) {
				   // TO-DO Auto-generated catch block
				   e.printStackTrace();
				  }
		
				  return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY:
				if (rulesFactory != null)
					msgs = ((InternalEObject)rulesFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY, null, msgs);
				return basicSetRulesFactory((RulesFactory)otherEnd, msgs);
			case GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS:
				if (factoryModeloConsultas != null)
					msgs = ((InternalEObject)factoryModeloConsultas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS, null, msgs);
				return basicSetFactoryModeloConsultas((FactoryModeloConsulta)otherEnd, msgs);
			case GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY:
				if (diagramEntity != null)
					msgs = ((InternalEObject)diagramEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY, null, msgs);
				return basicSetDiagramEntity((DiagramEntity)otherEnd, msgs);
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
			case GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY:
				return basicSetRulesFactory(null, msgs);
			case GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS:
				return basicSetFactoryModeloConsultas(null, msgs);
			case GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY:
				return basicSetDiagramEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY:
				return getRulesFactory();
			case GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS:
				return getFactoryModeloConsultas();
			case GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY:
				return getDiagramEntity();
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
			case GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY:
				setRulesFactory((RulesFactory)newValue);
				return;
			case GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS:
				setFactoryModeloConsultas((FactoryModeloConsulta)newValue);
				return;
			case GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY:
				setDiagramEntity((DiagramEntity)newValue);
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
			case GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY:
				setRulesFactory((RulesFactory)null);
				return;
			case GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS:
				setFactoryModeloConsultas((FactoryModeloConsulta)null);
				return;
			case GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY:
				setDiagramEntity((DiagramEntity)null);
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
			case GestionmodelosconsultasPackage.MODEL_FACTORY__RULES_FACTORY:
				return rulesFactory != null;
			case GestionmodelosconsultasPackage.MODEL_FACTORY__FACTORY_MODELO_CONSULTAS:
				return factoryModeloConsultas != null;
			case GestionmodelosconsultasPackage.MODEL_FACTORY__DIAGRAM_ENTITY:
				return diagramEntity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GestionmodelosconsultasPackage.MODEL_FACTORY___CARGAR:
				return cargar();
			case GestionmodelosconsultasPackage.MODEL_FACTORY___SALVAR:
				salvar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModelFactoryImpl
