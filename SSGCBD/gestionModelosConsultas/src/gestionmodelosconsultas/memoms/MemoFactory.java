/**
 */
package gestionmodelosconsultas.memoms;

import gestionmodelosconsultas.memoms.comunicacion.Circular;
import gestionmodelosconsultas.memoms.comunicacion.Memorando;

import gestionmodelosconsultas.memoms.info.Actividad;
import gestionmodelosconsultas.memoms.info.TablaRetencionDocumental;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memo Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.MemoFactory#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.MemoFactory#getActividad <em>Actividad</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.MemoFactory#getMemorando <em>Memorando</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.MemoFactory#getCircular <em>Circular</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.MemomsPackage#getMemoFactory()
 * @model
 * @generated
 */
public interface MemoFactory extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Tabla Retencion Documental</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getMemoFactory <em>Memo Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabla Retencion Documental</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla Retencion Documental</em>' containment reference.
	 * @see #setTablaRetencionDocumental(TablaRetencionDocumental)
	 * @see gestionmodelosconsultas.memoms.MemomsPackage#getMemoFactory_TablaRetencionDocumental()
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getMemoFactory
	 * @model opposite="MemoFactory" containment="true" required="true"
	 * @generated
	 */
	TablaRetencionDocumental getTablaRetencionDocumental();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.MemoFactory#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla Retencion Documental</em>' containment reference.
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 */
	void setTablaRetencionDocumental(TablaRetencionDocumental value);

	/**
	 * Returns the value of the '<em><b>Actividad</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.info.Actividad}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.Actividad#getMemoFactory <em>Memo Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actividad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividad</em>' containment reference list.
	 * @see gestionmodelosconsultas.memoms.MemomsPackage#getMemoFactory_Actividad()
	 * @see gestionmodelosconsultas.memoms.info.Actividad#getMemoFactory
	 * @model opposite="MemoFactory" containment="true" required="true"
	 * @generated
	 */
	EList<Actividad> getActividad();

	/**
	 * Returns the value of the '<em><b>Memorando</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.comunicacion.Memorando}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memorando</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memorando</em>' containment reference list.
	 * @see gestionmodelosconsultas.memoms.MemomsPackage#getMemoFactory_Memorando()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Memorando> getMemorando();

	/**
	 * Returns the value of the '<em><b>Circular</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.comunicacion.Circular}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circular</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circular</em>' containment reference list.
	 * @see gestionmodelosconsultas.memoms.MemomsPackage#getMemoFactory_Circular()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Circular> getCircular();

} // MemoFactory
