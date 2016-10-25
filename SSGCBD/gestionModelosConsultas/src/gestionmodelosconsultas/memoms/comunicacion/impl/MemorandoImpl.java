/**
 */
package gestionmodelosconsultas.memoms.comunicacion.impl;

import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;
import gestionmodelosconsultas.memoms.comunicacion.Memorando;

import gestionmodelosconsultas.memoms.info.Actividad;
import gestionmodelosconsultas.memoms.info.InfoPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memorando</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.comunicacion.impl.MemorandoImpl#getActividad <em>Actividad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemorandoImpl extends ComunicacionImpl implements Memorando {
	/**
	 * The cached value of the '{@link #getActividad() <em>Actividad</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActividad()
	 * @generated
	 * @ordered
	 */
	protected EList<Actividad> actividad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemorandoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComunicacionPackage.Literals.MEMORANDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actividad> getActividad() {
		if (actividad == null) {
			actividad = new EObjectWithInverseResolvingEList.ManyInverse<Actividad>(Actividad.class, this, ComunicacionPackage.MEMORANDO__ACTIVIDAD, InfoPackage.ACTIVIDAD__MEMORANDO);
		}
		return actividad;
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
			case ComunicacionPackage.MEMORANDO__ACTIVIDAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActividad()).basicAdd(otherEnd, msgs);
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
			case ComunicacionPackage.MEMORANDO__ACTIVIDAD:
				return ((InternalEList<?>)getActividad()).basicRemove(otherEnd, msgs);
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
			case ComunicacionPackage.MEMORANDO__ACTIVIDAD:
				return getActividad();
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
			case ComunicacionPackage.MEMORANDO__ACTIVIDAD:
				getActividad().clear();
				getActividad().addAll((Collection<? extends Actividad>)newValue);
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
			case ComunicacionPackage.MEMORANDO__ACTIVIDAD:
				getActividad().clear();
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
			case ComunicacionPackage.MEMORANDO__ACTIVIDAD:
				return actividad != null && !actividad.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemorandoImpl
