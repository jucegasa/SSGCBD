/**
 */
package gestionmodelosconsultas.sysinfo.people.impl;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import gestionmodelosconsultas.sysinfo.people.Directorio;
import gestionmodelosconsultas.sysinfo.people.Organizacion;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.People_View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>People View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.People_ViewImpl#getDirectorio <em>Directorio</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.people.impl.People_ViewImpl#getOrganizacion <em>Organizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class People_ViewImpl extends PaqueteImpl implements People_View {
	/**
	 * The cached value of the '{@link #getDirectorio() <em>Directorio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectorio()
	 * @generated
	 * @ordered
	 */
	protected Directorio directorio;

	/**
	 * The cached value of the '{@link #getOrganizacion() <em>Organizacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizacion()
	 * @generated
	 * @ordered
	 */
	protected Organizacion organizacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected People_ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeoplePackage.Literals.PEOPLE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directorio getDirectorio() {
		return directorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectorio(Directorio newDirectorio, NotificationChain msgs) {
		Directorio oldDirectorio = directorio;
		directorio = newDirectorio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PeoplePackage.PEOPLE_VIEW__DIRECTORIO, oldDirectorio, newDirectorio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectorio(Directorio newDirectorio) {
		if (newDirectorio != directorio) {
			NotificationChain msgs = null;
			if (directorio != null)
				msgs = ((InternalEObject)directorio).eInverseRemove(this, PeoplePackage.DIRECTORIO__PEOPLE_VIEW, Directorio.class, msgs);
			if (newDirectorio != null)
				msgs = ((InternalEObject)newDirectorio).eInverseAdd(this, PeoplePackage.DIRECTORIO__PEOPLE_VIEW, Directorio.class, msgs);
			msgs = basicSetDirectorio(newDirectorio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.PEOPLE_VIEW__DIRECTORIO, newDirectorio, newDirectorio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizacion getOrganizacion() {
		return organizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizacion(Organizacion newOrganizacion, NotificationChain msgs) {
		Organizacion oldOrganizacion = organizacion;
		organizacion = newOrganizacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PeoplePackage.PEOPLE_VIEW__ORGANIZACION, oldOrganizacion, newOrganizacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizacion(Organizacion newOrganizacion) {
		if (newOrganizacion != organizacion) {
			NotificationChain msgs = null;
			if (organizacion != null)
				msgs = ((InternalEObject)organizacion).eInverseRemove(this, PeoplePackage.ORGANIZACION__PEOPLE_VIEW, Organizacion.class, msgs);
			if (newOrganizacion != null)
				msgs = ((InternalEObject)newOrganizacion).eInverseAdd(this, PeoplePackage.ORGANIZACION__PEOPLE_VIEW, Organizacion.class, msgs);
			msgs = basicSetOrganizacion(newOrganizacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeoplePackage.PEOPLE_VIEW__ORGANIZACION, newOrganizacion, newOrganizacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PeoplePackage.PEOPLE_VIEW__DIRECTORIO:
				if (directorio != null)
					msgs = ((InternalEObject)directorio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PeoplePackage.PEOPLE_VIEW__DIRECTORIO, null, msgs);
				return basicSetDirectorio((Directorio)otherEnd, msgs);
			case PeoplePackage.PEOPLE_VIEW__ORGANIZACION:
				if (organizacion != null)
					msgs = ((InternalEObject)organizacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PeoplePackage.PEOPLE_VIEW__ORGANIZACION, null, msgs);
				return basicSetOrganizacion((Organizacion)otherEnd, msgs);
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
			case PeoplePackage.PEOPLE_VIEW__DIRECTORIO:
				return basicSetDirectorio(null, msgs);
			case PeoplePackage.PEOPLE_VIEW__ORGANIZACION:
				return basicSetOrganizacion(null, msgs);
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
			case PeoplePackage.PEOPLE_VIEW__DIRECTORIO:
				return getDirectorio();
			case PeoplePackage.PEOPLE_VIEW__ORGANIZACION:
				return getOrganizacion();
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
			case PeoplePackage.PEOPLE_VIEW__DIRECTORIO:
				setDirectorio((Directorio)newValue);
				return;
			case PeoplePackage.PEOPLE_VIEW__ORGANIZACION:
				setOrganizacion((Organizacion)newValue);
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
			case PeoplePackage.PEOPLE_VIEW__DIRECTORIO:
				setDirectorio((Directorio)null);
				return;
			case PeoplePackage.PEOPLE_VIEW__ORGANIZACION:
				setOrganizacion((Organizacion)null);
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
			case PeoplePackage.PEOPLE_VIEW__DIRECTORIO:
				return directorio != null;
			case PeoplePackage.PEOPLE_VIEW__ORGANIZACION:
				return organizacion != null;
		}
		return super.eIsSet(featureID);
	}

} //People_ViewImpl
