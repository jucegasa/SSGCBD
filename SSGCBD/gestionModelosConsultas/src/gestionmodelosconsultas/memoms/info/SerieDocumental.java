/**
 */
package gestionmodelosconsultas.memoms.info;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serie Documental</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getSubserie <em>Subserie</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getSerie <em>Serie</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getRetencionAnios <em>Retencion Anios</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getDisposicionFinal <em>Disposicion Final</em>}</li>
 *   <li>{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental()
 * @model
 * @generated
 */
public interface SerieDocumental extends EObject {
	/**
	 * Returns the value of the '<em><b>Tabla Retencion Documental</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getSerieDocumental <em>Serie Documental</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabla Retencion Documental</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla Retencion Documental</em>' container reference.
	 * @see #setTablaRetencionDocumental(TablaRetencionDocumental)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_TablaRetencionDocumental()
	 * @see gestionmodelosconsultas.memoms.info.TablaRetencionDocumental#getSerieDocumental
	 * @model opposite="SerieDocumental"
	 * @generated
	 */
	TablaRetencionDocumental getTablaRetencionDocumental();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla Retencion Documental</em>' container reference.
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 */
	void setTablaRetencionDocumental(TablaRetencionDocumental value);

	/**
	 * Returns the value of the '<em><b>Subserie</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.memoms.info.SerieDocumental}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getSerie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subserie</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subserie</em>' reference list.
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_Subserie()
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getSerie
	 * @model opposite="serie" required="true"
	 * @generated
	 */
	EList<SerieDocumental> getSubserie();

	/**
	 * Returns the value of the '<em><b>Serie</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getSubserie <em>Subserie</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serie</em>' reference.
	 * @see #setSerie(SerieDocumental)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_Serie()
	 * @see gestionmodelosconsultas.memoms.info.SerieDocumental#getSubserie
	 * @model opposite="subserie" required="true"
	 * @generated
	 */
	SerieDocumental getSerie();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getSerie <em>Serie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serie</em>' reference.
	 * @see #getSerie()
	 * @generated
	 */
	void setSerie(SerieDocumental value);

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

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
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Retencion Anios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retencion Anios</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retencion Anios</em>' attribute.
	 * @see #setRetencionAnios(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_RetencionAnios()
	 * @model
	 * @generated
	 */
	String getRetencionAnios();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getRetencionAnios <em>Retencion Anios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retencion Anios</em>' attribute.
	 * @see #getRetencionAnios()
	 * @generated
	 */
	void setRetencionAnios(String value);

	/**
	 * Returns the value of the '<em><b>Disposicion Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposicion Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposicion Final</em>' attribute.
	 * @see #setDisposicionFinal(String)
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_DisposicionFinal()
	 * @model
	 * @generated
	 */
	String getDisposicionFinal();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getDisposicionFinal <em>Disposicion Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposicion Final</em>' attribute.
	 * @see #getDisposicionFinal()
	 * @generated
	 */
	void setDisposicionFinal(String value);

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
	 * @see gestionmodelosconsultas.memoms.info.InfoPackage#getSerieDocumental_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.memoms.info.SerieDocumental#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // SerieDocumental
