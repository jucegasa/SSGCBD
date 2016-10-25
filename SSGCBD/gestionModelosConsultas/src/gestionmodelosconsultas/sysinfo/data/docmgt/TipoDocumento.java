/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Documento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un tipo de documento especifica el tipo de un documento. Las instancias tipicas son libros y reportes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getLista <em>Lista</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getGuia <em>Guia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getPlantilla <em>Plantilla</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getTheDocumento <em>The Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getTipoDocumento()
 * @model
 * @generated
 */
public interface TipoDocumento extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Orientacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getTipoDocumento <em>Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientacion</em>' container reference.
	 * @see #setOrientacion(Orientacion)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getTipoDocumento_Orientacion()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getTipoDocumento
	 * @model opposite="TipoDocumento"
	 * @generated
	 */
	Orientacion getOrientacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getOrientacion <em>Orientacion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientacion</em>' container reference.
	 * @see #getOrientacion()
	 * @generated
	 */
	void setOrientacion(Orientacion value);

	/**
	 * Returns the value of the '<em><b>Lista</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getSuTipo <em>Su Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista</em>' reference.
	 * @see #setLista(ListaChequeo)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getTipoDocumento_Lista()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.ListaChequeo#getSuTipo
	 * @model opposite="suTipo"
	 * @generated
	 */
	ListaChequeo getLista();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getLista <em>Lista</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lista</em>' reference.
	 * @see #getLista()
	 * @generated
	 */
	void setLista(ListaChequeo value);

	/**
	 * Returns the value of the '<em><b>Guia</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getSuTipo <em>Su Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guia</em>' reference.
	 * @see #setGuia(Guia)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getTipoDocumento_Guia()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Guia#getSuTipo
	 * @model opposite="suTipo" required="true"
	 * @generated
	 */
	Guia getGuia();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getGuia <em>Guia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guia</em>' reference.
	 * @see #getGuia()
	 * @generated
	 */
	void setGuia(Guia value);

	/**
	 * Returns the value of the '<em><b>Plantilla</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getSuTipo <em>Su Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plantilla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantilla</em>' reference.
	 * @see #setPlantilla(Plantilla)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getTipoDocumento_Plantilla()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Plantilla#getSuTipo
	 * @model opposite="suTipo" required="true"
	 * @generated
	 */
	Plantilla getPlantilla();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento#getPlantilla <em>Plantilla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plantilla</em>' reference.
	 * @see #getPlantilla()
	 * @generated
	 */
	void setPlantilla(Plantilla value);

	/**
	 * Returns the value of the '<em><b>The Documento</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheTipoDocumento <em>The Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Documento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Documento</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getTipoDocumento_TheDocumento()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Documento#getTheTipoDocumento
	 * @model opposite="theTipoDocumento" required="true"
	 * @generated
	 */
	EList<Documento> getTheDocumento();

} // TipoDocumento
