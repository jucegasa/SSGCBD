/**
 */
package gestionmodelosconsultas.sysinfo.people;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.sysinfo.people.PeoplePackage
 * @generated
 */
public interface PeopleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PeopleFactory eINSTANCE = gestionmodelosconsultas.sysinfo.people.impl.PeopleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>People View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>People View</em>'.
	 * @generated
	 */
	People_View createPeople_View();

	/**
	 * Returns a new object of class '<em>Unidad Organizacional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unidad Organizacional</em>'.
	 * @generated
	 */
	UnidadOrganizacional createUnidadOrganizacional();

	/**
	 * Returns a new object of class '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol</em>'.
	 * @generated
	 */
	Rol createRol();

	/**
	 * Returns a new object of class '<em>Contacto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contacto</em>'.
	 * @generated
	 */
	Contacto createContacto();

	/**
	 * Returns a new object of class '<em>Directorio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directorio</em>'.
	 * @generated
	 */
	Directorio createDirectorio();

	/**
	 * Returns a new object of class '<em>Organizacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizacion</em>'.
	 * @generated
	 */
	Organizacion createOrganizacion();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Quien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quien</em>'.
	 * @generated
	 */
	Quien createQuien();

	/**
	 * Returns a new object of class '<em>Actores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actores</em>'.
	 * @generated
	 */
	Actores createActores();

	/**
	 * Returns a new object of class '<em>Roles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roles</em>'.
	 * @generated
	 */
	Roles createRoles();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PeoplePackage getPeoplePackage();

} //PeopleFactory
