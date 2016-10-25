/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.people.Organizacion;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.People_View;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

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
 * An implementation of the model object '<em><b>Organizacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.OrganizacionImpl#getPeople_View <em>People View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.OrganizacionImpl#getOrganizacion <em>Organizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizacionImpl extends PaqueteImpl implements Organizacion {
	/**
	 * The cached value of the '{@link #getOrganizacion() <em>Organizacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizacion()
	 * @generated
	 * @ordered
	 */
	protected EList<UnidadOrganizacional> organizacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeoplePackage.Literals.ORGANIZACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public People_View getPeople_View() {
		if (eContainerFeatureID() != PeoplePackage.ORGANIZACION__PEOPLE_VIEW) return null;
		return (People_View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeople_View(People_View newPeople_View, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPeople_View, PeoplePackage.ORGANIZACION__PEOPLE_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeople_View(People_View newPeople_View) {
		if (newPeople_View != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.ORGANIZACION__PEOPLE_VIEW && newPeople_View != null)) {
			if (EcoreUtil.isAncestor(this, newPeople_View))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPeople_View != null)
				msgs = ((InternalEObject)newPeople_View).eInverseAdd(this, PeoplePackage.PEOPLE_VIEW__ORGANIZACION, People_View.class, msgs);
			msgs = basicSetPeople_View(newPeople_View, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.ORGANIZACION__PEOPLE_VIEW, newPeople_View, newPeople_View));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnidadOrganizacional> getOrganizacion() {
		if (organizacion == null) {
			organizacion = new EObjectContainmentWithInverseEList<UnidadOrganizacional>(UnidadOrganizacional.class, this, PeoplePackage.ORGANIZACION__ORGANIZACION, PeoplePackage.UNIDAD_ORGANIZACIONAL__ORGANIZACION);
		}
		return organizacion;
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
			case PeoplePackage.ORGANIZACION__PEOPLE_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPeople_View((People_View)otherEnd, msgs);
			case PeoplePackage.ORGANIZACION__ORGANIZACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizacion()).basicAdd(otherEnd, msgs);
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
			case PeoplePackage.ORGANIZACION__PEOPLE_VIEW:
				return basicSetPeople_View(null, msgs);
			case PeoplePackage.ORGANIZACION__ORGANIZACION:
				return ((InternalEList<?>)getOrganizacion()).basicRemove(otherEnd, msgs);
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
			case PeoplePackage.ORGANIZACION__PEOPLE_VIEW:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.PEOPLE_VIEW__ORGANIZACION, People_View.class, msgs);
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
			case PeoplePackage.ORGANIZACION__PEOPLE_VIEW:
				return getPeople_View();
			case PeoplePackage.ORGANIZACION__ORGANIZACION:
				return getOrganizacion();
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
			case PeoplePackage.ORGANIZACION__PEOPLE_VIEW:
				setPeople_View((People_View)newValue);
				return;
			case PeoplePackage.ORGANIZACION__ORGANIZACION:
				getOrganizacion().clear();
				getOrganizacion().addAll((Collection<? extends UnidadOrganizacional>)newValue);
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
			case PeoplePackage.ORGANIZACION__PEOPLE_VIEW:
				setPeople_View((People_View)null);
				return;
			case PeoplePackage.ORGANIZACION__ORGANIZACION:
				getOrganizacion().clear();
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
			case PeoplePackage.ORGANIZACION__PEOPLE_VIEW:
				return getPeople_View() != null;
			case PeoplePackage.ORGANIZACION__ORGANIZACION:
				return organizacion != null && !organizacion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizacionImpl
