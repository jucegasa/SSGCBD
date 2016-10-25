/**
 */
package model;

import model.domain.Domain;

import model.uimanager.UIManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.FactoryModel#getTheUIManager <em>The UI Manager</em>}</li>
 *   <li>{@link model.FactoryModel#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFactoryModel()
 * @model
 * @generated
 */
public interface FactoryModel extends EObject {
	/**
	 * Returns the value of the '<em><b>The UI Manager</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.uimanager.UIManager#getOwnedByFactoryModel <em>Owned By Factory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI Manager</em>' containment reference.
	 * @see #setTheUIManager(UIManager)
	 * @see model.ModelPackage#getFactoryModel_TheUIManager()
	 * @see model.uimanager.UIManager#getOwnedByFactoryModel
	 * @model opposite="ownedByFactoryModel" containment="true" required="true"
	 * @generated
	 */
	UIManager getTheUIManager();

	/**
	 * Sets the value of the '{@link model.FactoryModel#getTheUIManager <em>The UI Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI Manager</em>' containment reference.
	 * @see #getTheUIManager()
	 * @generated
	 */
	void setTheUIManager(UIManager value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.domain.Domain#getOwnedByFactoryModel <em>Owned By Factory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' containment reference.
	 * @see #setTheDomain(Domain)
	 * @see model.ModelPackage#getFactoryModel_TheDomain()
	 * @see model.domain.Domain#getOwnedByFactoryModel
	 * @model opposite="ownedByFactoryModel" containment="true" required="true"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link model.FactoryModel#getTheDomain <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' containment reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelPackage modelPackage = ModelPackage.eINSTANCE; \n FactoryModel factoryModel = null;\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/dataformmodel/persistencia/dataform.model\");\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\ntry {\nresource.load(java.util.Collections.EMPTY_MAP);\nfactoryModel = (FactoryModel) resource.getContents().get(0);\n} catch (java.io.IOException e) {\ne.printStackTrace();\n}\nreturn factoryModel;\n'"
	 * @generated
	 */
	FactoryModel cargar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='FactoryModel factoryModel = this;\n org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/dataformmodel/persistencia/dataform.model\");\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\nresource.getContents().add(factoryModel);\ntry {\nresource.save(java.util.Collections.EMPTY_MAP);\n} catch (java.io.IOException e) {\ne.printStackTrace();\n}\nreturn;\n'"
	 * @generated
	 */
	void salvar();

} // FactoryModel
