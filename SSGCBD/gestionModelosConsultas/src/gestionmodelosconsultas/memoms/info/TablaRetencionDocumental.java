/**
 */
package gestionmodelosconsultas.memoms.info;

import gestionmodelosconsultas.memoms.MemoFactory;

import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabla Retencion Documental</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDocumento <em>Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getSerieDocumental <em>Serie Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getMemoFactory <em>Memo Factory</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getTablaRetencionDocumental()
 * @model
 * @generated
 */
public interface TablaRetencionDocumental extends EObject {
	/**
	 * Returns the value of the '<em><b>Documento</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' reference list.
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getTablaRetencionDocumental_Documento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTablaRetencionDocumental
	 * @model opposite="TablaRetencionDocumental"
	 * @generated
	 */
	EList<Documento> getDocumento();

	/**
	 * Returns the value of the '<em><b>Serie Documental</b></em>' containment reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.info.SerieDocumental}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serie Documental</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serie Documental</em>' containment reference list.
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getTablaRetencionDocumental_SerieDocumental()
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getTablaRetencionDocumental
	 * @model opposite="TablaRetencionDocumental" containment="true" required="true"
	 * @generated
	 */
	EList<SerieDocumental> getSerieDocumental();

	/**
	 * Returns the value of the '<em><b>Memo Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.MemoFactory#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memo Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memo Factory</em>' container reference.
	 * @see #setMemoFactory(MemoFactory)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getTablaRetencionDocumental_MemoFactory()
	 * @see gestionmodelosconsultas.memoms.MemoFactory#getTablaRetencionDocumental
	 * @model opposite="TablaRetencionDocumental"
	 * @generated
	 */
	MemoFactory getMemoFactory();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getMemoFactory <em>Memo Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memo Factory</em>' container reference.
	 * @see #getMemoFactory()
	 * @generated
	 */
	void setMemoFactory(MemoFactory value);

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
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getTablaRetencionDocumental_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // TablaRetencionDocumental
