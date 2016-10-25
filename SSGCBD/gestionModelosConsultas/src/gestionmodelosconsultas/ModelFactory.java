/**
 */
package gestionmodelosconsultas;

import gestionmodelosconsultas.entitymodel.DiagramEntity;

import gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta;

import gestionmodelosconsultas.rules.factoryrules.RulesFactory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.ModelFactory#getRulesFactory <em>Rules Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.ModelFactory#getFactoryModeloConsultas <em>Factory Modelo Consultas</em>}</li>
 *   <li>{@link gestionmodelosconsultas.ModelFactory#getDiagramEntity <em>Diagram Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.GestionmodelosconsultasPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules Factory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.rules.factoryrules.RulesFactory#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules Factory</em>' containment reference.
	 * @see #setRulesFactory(RulesFactory)
	 * @see gestionmodelosconsultas.GestionmodelosconsultasPackage#getModelFactory_RulesFactory()
	 * @see gestionmodelosconsultas.rules.factoryrules.RulesFactory#getModelFactory
	 * @model opposite="ModelFactory" containment="true" required="true"
	 * @generated
	 */
	RulesFactory getRulesFactory();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.ModelFactory#getRulesFactory <em>Rules Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules Factory</em>' containment reference.
	 * @see #getRulesFactory()
	 * @generated
	 */
	void setRulesFactory(RulesFactory value);

	/**
	 * Returns the value of the '<em><b>Factory Modelo Consultas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Modelo Consultas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Modelo Consultas</em>' containment reference.
	 * @see #setFactoryModeloConsultas(FactoryModeloConsulta)
	 * @see gestionmodelosconsultas.GestionmodelosconsultasPackage#getModelFactory_FactoryModeloConsultas()
	 * @see gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta#getModelFactory
	 * @model opposite="ModelFactory" containment="true" required="true"
	 * @generated
	 */
	FactoryModeloConsulta getFactoryModeloConsultas();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.ModelFactory#getFactoryModeloConsultas <em>Factory Modelo Consultas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Modelo Consultas</em>' containment reference.
	 * @see #getFactoryModeloConsultas()
	 * @generated
	 */
	void setFactoryModeloConsultas(FactoryModeloConsulta value);

	/**
	 * Returns the value of the '<em><b>Diagram Entity</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Entity</em>' containment reference.
	 * @see #setDiagramEntity(DiagramEntity)
	 * @see gestionmodelosconsultas.GestionmodelosconsultasPackage#getModelFactory_DiagramEntity()
	 * @see gestionmodelosconsultas.entitymodel.DiagramEntity#getModelFactory
	 * @model opposite="ModelFactory" containment="true" required="true"
	 * @generated
	 */
	DiagramEntity getDiagramEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.ModelFactory#getDiagramEntity <em>Diagram Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Entity</em>' containment reference.
	 * @see #getDiagramEntity()
	 * @generated
	 */
	void setDiagramEntity(DiagramEntity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = null;\r\n\t\t\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/testConsultas/modelos/produccion.gestionmodelosconsultas\");\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\ttry {\r\n\t\t\tresource.load(java.util.Collections.EMPTY_MAP);\r\n\t\t\tmodelFactory = (ModelFactory) resource.getContents().get(0);\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\r\n\t\treturn modelFactory;'"
	 * @generated
	 */
	ModelFactory cargar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = this;\r\n\t\t  \r\n\t\t\r\n\t\t  org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/testConsultas/modelos/produccion.gestionmodelosconsultas\");\r\n\r\n\t\t  org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\r\n\t\t  org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\t  resource.getContents().add(modelFactory);\r\n\t\t  try {\r\n\t\t   resource.save(java.util.Collections.EMPTY_MAP);\r\n\t\t  } catch (java.io.IOException e) {\r\n\t\t   // TO-DO Auto-generated catch block\r\n\t\t   e.printStackTrace();\r\n\t\t  }\r\n\r\n\t\t  return;'"
	 * @generated
	 */
	void salvar();

} // ModelFactory
