/**
 */
package gestionmodelosconsultas.sysinfo.core;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Modelo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getOwner <em>Owner</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getContexto <em>Contexto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getFrom <em>From</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.core.CorePackage#getElementoModelo()
 * @model
 * @generated
 */
public interface ElementoModelo extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.Paquete#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Paquete)
	 * @see gestionmodelosconsultas.sysinfo.core.CorePackage#getElementoModelo_Owner()
	 * @see gestionmodelosconsultas.sysinfo.Paquete#getElement
	 * @model opposite="element"
	 * @generated
	 */
	Paquete getOwner();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Paquete value);

	/**
	 * Returns the value of the '<em><b>Contexto</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuElemento <em>Su Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexto</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexto</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.core.CorePackage#getElementoModelo_Contexto()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry#getSuElemento
	 * @model opposite="suElemento"
	 * @generated
	 */
	EList<IndexEntry> getContexto();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see gestionmodelosconsultas.sysinfo.core.CorePackage#getElementoModelo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.core.ElementoModelo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.core.CorePackage#getElementoModelo_From()
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<ElementoModelo> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.core.ElementoModelo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.core.ElementoModelo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.core.CorePackage#getElementoModelo_To()
	 * @see gestionmodelosconsultas.sysinfo.core.ElementoModelo#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<ElementoModelo> getTo();

} // ElementoModelo
