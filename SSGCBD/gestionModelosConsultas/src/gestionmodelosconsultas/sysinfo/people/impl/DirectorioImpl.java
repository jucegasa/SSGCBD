/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.people.Contacto;
import gestionmodelosconsultas.sysinfo.people.Directorio;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.People_View;

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
 * An implementation of the model object '<em><b>Directorio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.DirectorioImpl#getPeople_View <em>People View</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.DirectorioImpl#getContacto <em>Contacto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectorioImpl extends PaqueteImpl implements Directorio {
	/**
	 * The cached value of the '{@link #getContacto() <em>Contacto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacto()
	 * @generated
	 * @ordered
	 */
	protected EList<Contacto> contacto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectorioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeoplePackage.Literals.DIRECTORIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public People_View getPeople_View() {
		if (eContainerFeatureID() != PeoplePackage.DIRECTORIO__PEOPLE_VIEW) return null;
		return (People_View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeople_View(People_View newPeople_View, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPeople_View, PeoplePackage.DIRECTORIO__PEOPLE_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeople_View(People_View newPeople_View) {
		if (newPeople_View != eInternalContainer() || (eContainerFeatureID() != PeoplePackage.DIRECTORIO__PEOPLE_VIEW && newPeople_View != null)) {
			if (EcoreUtil.isAncestor(this, newPeople_View))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPeople_View != null)
				msgs = ((InternalEObject)newPeople_View).eInverseAdd(this, PeoplePackage.PEOPLE_VIEW__DIRECTORIO, People_View.class, msgs);
			msgs = basicSetPeople_View(newPeople_View, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.DIRECTORIO__PEOPLE_VIEW, newPeople_View, newPeople_View));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contacto> getContacto() {
		if (contacto == null) {
			contacto = new EObjectContainmentWithInverseEList<Contacto>(Contacto.class, this, PeoplePackage.DIRECTORIO__CONTACTO, PeoplePackage.CONTACTO__DIRECTORIO);
		}
		return contacto;
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
			case PeoplePackage.DIRECTORIO__PEOPLE_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPeople_View((People_View)otherEnd, msgs);
			case PeoplePackage.DIRECTORIO__CONTACTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContacto()).basicAdd(otherEnd, msgs);
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
			case PeoplePackage.DIRECTORIO__PEOPLE_VIEW:
				return basicSetPeople_View(null, msgs);
			case PeoplePackage.DIRECTORIO__CONTACTO:
				return ((InternalEList<?>)getContacto()).basicRemove(otherEnd, msgs);
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
			case PeoplePackage.DIRECTORIO__PEOPLE_VIEW:
				return eInternalContainer().eInverseRemove(this, PeoplePackage.PEOPLE_VIEW__DIRECTORIO, People_View.class, msgs);
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
			case PeoplePackage.DIRECTORIO__PEOPLE_VIEW:
				return getPeople_View();
			case PeoplePackage.DIRECTORIO__CONTACTO:
				return getContacto();
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
			case PeoplePackage.DIRECTORIO__PEOPLE_VIEW:
				setPeople_View((People_View)newValue);
				return;
			case PeoplePackage.DIRECTORIO__CONTACTO:
				getContacto().clear();
				getContacto().addAll((Collection<? extends Contacto>)newValue);
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
			case PeoplePackage.DIRECTORIO__PEOPLE_VIEW:
				setPeople_View((People_View)null);
				return;
			case PeoplePackage.DIRECTORIO__CONTACTO:
				getContacto().clear();
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
			case PeoplePackage.DIRECTORIO__PEOPLE_VIEW:
				return getPeople_View() != null;
			case PeoplePackage.DIRECTORIO__CONTACTO:
				return contacto != null && !contacto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectorioImpl
