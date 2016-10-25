/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.network.Deposito;

import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Una copia representa los items fisicos, como todas las copias impresas de un libro. Un documento debe existir en varias copias.
 * 
 * o un cd.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getCopias <em>Copias</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getFormato <em>Formato</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getConsecutivo <em>Consecutivo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getDeposito <em>Deposito</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getMensaje <em>Mensaje</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getProducto <em>Producto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getUnidadOrganizacional <em>Unidad Organizacional</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia()
 * @model
 * @generated
 */
public interface Copia extends ElementoModelo {
	/**
	 * Returns the value of the '<em><b>Copias</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copias</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copias</em>' container reference.
	 * @see #setCopias(Copias)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia_Copias()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Copias#getCopia
	 * @model opposite="Copia"
	 * @generated
	 */
	Copias getCopias();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getCopias <em>Copias</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copias</em>' container reference.
	 * @see #getCopias()
	 * @generated
	 */
	void setCopias(Copias value);

	/**
	 * Returns the value of the '<em><b>Formato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * puede ser:
	 * 
	 * físico: una copia impresa.
	 * lógico: una copia en un medio magnetico.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formato</em>' attribute.
	 * @see #setFormato(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia_Formato()
	 * @model
	 * @generated
	 */
	String getFormato();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getFormato <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formato</em>' attribute.
	 * @see #getFormato()
	 * @generated
	 */
	void setFormato(String value);

	/**
	 * Returns the value of the '<em><b>Consecutivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consecutivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consecutivo</em>' attribute.
	 * @see #setConsecutivo(String)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia_Consecutivo()
	 * @model
	 * @generated
	 */
	String getConsecutivo();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getConsecutivo <em>Consecutivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consecutivo</em>' attribute.
	 * @see #getConsecutivo()
	 * @generated
	 */
	void setConsecutivo(String value);

	/**
	 * Returns the value of the '<em><b>Deposito</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.network.Deposito#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposito</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposito</em>' reference.
	 * @see #setDeposito(Deposito)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia_Deposito()
	 * @see gestionmodelosconsultas.sysinfo.network.Deposito#getCopia
	 * @model opposite="Copia" required="true"
	 * @generated
	 */
	Deposito getDeposito();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getDeposito <em>Deposito</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposito</em>' reference.
	 * @see #getDeposito()
	 * @generated
	 */
	void setDeposito(Deposito value);

	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mensaje</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' reference list.
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia_Mensaje()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Mensaje#getCopia
	 * @model opposite="Copia" required="true"
	 * @generated
	 */
	EList<Mensaje> getMensaje();

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' reference.
	 * @see #setProducto(Producto)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia_Producto()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Producto#getCopia
	 * @model opposite="Copia" required="true"
	 * @generated
	 */
	Producto getProducto();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getProducto <em>Producto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producto</em>' reference.
	 * @see #getProducto()
	 * @generated
	 */
	void setProducto(Producto value);

	/**
	 * Returns the value of the '<em><b>Unidad Organizacional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopia <em>Copia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad Organizacional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #setUnidadOrganizacional(UnidadOrganizacional)
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage#getCopia_UnidadOrganizacional()
	 * @see gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional#getCopia
	 * @model opposite="Copia"
	 * @generated
	 */
	UnidadOrganizacional getUnidadOrganizacional();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Copia#getUnidadOrganizacional <em>Unidad Organizacional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad Organizacional</em>' container reference.
	 * @see #getUnidadOrganizacional()
	 * @generated
	 */
	void setUnidadOrganizacional(UnidadOrganizacional value);

} // Copia
