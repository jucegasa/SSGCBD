/**
 */
package gestionmodelosconsultas.sysinfo.network;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disco</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Medio magnetico de almacenamiento (CD, Disco Duro, Memoria, Dikette).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.network.Disco#getReferencia <em>Referencia</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDisco()
 * @model
 * @generated
 */
public interface Disco extends Deposito {
	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * referencia a un CD. Puede ser el nombre de una recopilación o de una edición.
	 * En general, consiste en almacenar el nombre del medio magnético donde se piensa almacenar el documento bien sea para tenerlo en un estante o para enviarlo a alguien
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referencia</em>' attribute.
	 * @see #setReferencia(String)
	 * @see gestionmodelosconsultas.sysinfo.network.NetworkPackage#getDisco_Referencia()
	 * @model
	 * @generated
	 */
	String getReferencia();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.network.Disco#getReferencia <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' attribute.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(String value);

} // Disco
