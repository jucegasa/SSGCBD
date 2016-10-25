/**
 */
package gestionmodelosconsultas.sysinfo.people.util;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.people.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage
 * @generated
 */
public class PeopleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PeoplePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeopleSwitch() {
		if (modelPackage == null) {
			modelPackage = PeoplePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PeoplePackage.PEOPLE_VIEW: {
				People_View people_View = (People_View)theEObject;
				T result = casePeople_View(people_View);
				if (result == null) result = casePaquete(people_View);
				if (result == null) result = caseElementoModelo(people_View);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.UNIDAD_ORGANIZACIONAL: {
				UnidadOrganizacional unidadOrganizacional = (UnidadOrganizacional)theEObject;
				T result = caseUnidadOrganizacional(unidadOrganizacional);
				if (result == null) result = caseQuien(unidadOrganizacional);
				if (result == null) result = caseElementoModelo(unidadOrganizacional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.ROL: {
				Rol rol = (Rol)theEObject;
				T result = caseRol(rol);
				if (result == null) result = caseQuien(rol);
				if (result == null) result = caseElementoModelo(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.CONTACTO: {
				Contacto contacto = (Contacto)theEObject;
				T result = caseContacto(contacto);
				if (result == null) result = caseElementoModelo(contacto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.DIRECTORIO: {
				Directorio directorio = (Directorio)theEObject;
				T result = caseDirectorio(directorio);
				if (result == null) result = casePaquete(directorio);
				if (result == null) result = caseElementoModelo(directorio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.ORGANIZACION: {
				Organizacion organizacion = (Organizacion)theEObject;
				T result = caseOrganizacion(organizacion);
				if (result == null) result = casePaquete(organizacion);
				if (result == null) result = caseElementoModelo(organizacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseQuien(actor);
				if (result == null) result = caseElementoModelo(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.QUIEN: {
				Quien quien = (Quien)theEObject;
				T result = caseQuien(quien);
				if (result == null) result = caseElementoModelo(quien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.ACTORES: {
				Actores actores = (Actores)theEObject;
				T result = caseActores(actores);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeoplePackage.ROLES: {
				Roles roles = (Roles)theEObject;
				T result = caseRoles(roles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>People View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>People View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeople_View(People_View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unidad Organizacional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unidad Organizacional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnidadOrganizacional(UnidadOrganizacional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contacto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contacto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContacto(Contacto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directorio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directorio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectorio(Directorio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizacion(Organizacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuien(Quien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActores(Actores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoles(Roles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Modelo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Modelo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoModelo(ElementoModelo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paquete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaquete(Paquete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PeopleSwitch
