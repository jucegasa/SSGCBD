/**
 */
package gestionmodelosconsultas.memoms.info;

import gestionmodelosconsultas.memoms.MemoFactory;

import gestionmodelosconsultas.memoms.comunicacion.Memorando;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Actividad#getMemorando <em>Memorando</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Actividad#getMemoFactory <em>Memo Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Actividad#getId <em>Id</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Actividad#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.Actividad#getEstado <em>Estado</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getActividad()
 * @model
 * @generated
 */
public interface Actividad extends EObject {
	/**
	 * Returns the value of the '<em><b>Memorando</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.comunicacion.Memorando}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.comunicacion.Memorando#getActividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memorando</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memorando</em>' reference list.
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getActividad_Memorando()
	 * @see gestionmodelosconsultas.memoms.comunicacion.Memorando#getActividad
	 * @model opposite="Actividad"
	 * @generated
	 */
	EList<Memorando> getMemorando();

	/**
	 * Returns the value of the '<em><b>Memo Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.MemoFactory#getActividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memo Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memo Factory</em>' container reference.
	 * @see #setMemoFactory(MemoFactory)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getActividad_MemoFactory()
	 * @see gestionmodelosconsultas.memoms.MemoFactory#getActividad
	 * @model opposite="Actividad"
	 * @generated
	 */
	MemoFactory getMemoFactory();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Actividad#getMemoFactory <em>Memo Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memo Factory</em>' container reference.
	 * @see #getMemoFactory()
	 * @generated
	 */
	void setMemoFactory(MemoFactory value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getActividad_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Actividad#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getActividad_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Actividad#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getActividad_Estado()
	 * @model
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.Actividad#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

} // Actividad
