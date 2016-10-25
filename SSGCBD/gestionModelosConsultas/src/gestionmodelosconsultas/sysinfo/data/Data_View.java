/**
 */
package gestionmodelosconsultas.sysinfo.data;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion;
import gestionmodelosconsultas.sysinfo.data.docmgt.Glosario;
import gestionmodelosconsultas.sysinfo.data.docmgt.Indice;
import gestionmodelosconsultas.sysinfo.data.docmgt.Libreria;
import gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.Data_View#getIndice <em>Indice</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.Data_View#getLibreria <em>Libreria</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.Data_View#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.Data_View#getGlosario <em>Glosario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.Data_View#getDistribucion <em>Distribucion</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.sysinfo.data.DataPackage#getData_View()
 * @model
 * @generated
 */
public interface Data_View extends Paquete {
	/**
	 * Returns the value of the '<em><b>Indice</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice</em>' containment reference.
	 * @see #setIndice(Indice)
	 * @see gestionmodelosconsultas.sysinfo.data.DataPackage#getData_View_Indice()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Indice#getData_View
	 * @model opposite="Data_View" containment="true" required="true"
	 * @generated
	 */
	Indice getIndice();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getIndice <em>Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice</em>' containment reference.
	 * @see #getIndice()
	 * @generated
	 */
	void setIndice(Indice value);

	/**
	 * Returns the value of the '<em><b>Libreria</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libreria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libreria</em>' containment reference.
	 * @see #setLibreria(Libreria)
	 * @see gestionmodelosconsultas.sysinfo.data.DataPackage#getData_View_Libreria()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Libreria#getData_View
	 * @model opposite="Data_View" containment="true" required="true"
	 * @generated
	 */
	Libreria getLibreria();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getLibreria <em>Libreria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libreria</em>' containment reference.
	 * @see #getLibreria()
	 * @generated
	 */
	void setLibreria(Libreria value);

	/**
	 * Returns the value of the '<em><b>Orientacion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientacion</em>' containment reference.
	 * @see #setOrientacion(Orientacion)
	 * @see gestionmodelosconsultas.sysinfo.data.DataPackage#getData_View_Orientacion()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion#getData_View
	 * @model opposite="Data_View" containment="true" required="true"
	 * @generated
	 */
	Orientacion getOrientacion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getOrientacion <em>Orientacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientacion</em>' containment reference.
	 * @see #getOrientacion()
	 * @generated
	 */
	void setOrientacion(Orientacion value);

	/**
	 * Returns the value of the '<em><b>Glosario</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glosario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosario</em>' containment reference.
	 * @see #setGlosario(Glosario)
	 * @see gestionmodelosconsultas.sysinfo.data.DataPackage#getData_View_Glosario()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Glosario#getData_View
	 * @model opposite="Data_View" containment="true" required="true"
	 * @generated
	 */
	Glosario getGlosario();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getGlosario <em>Glosario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glosario</em>' containment reference.
	 * @see #getGlosario()
	 * @generated
	 */
	void setGlosario(Glosario value);

	/**
	 * Returns the value of the '<em><b>Distribucion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getData_View <em>Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribucion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribucion</em>' containment reference.
	 * @see #setDistribucion(Distribucion)
	 * @see gestionmodelosconsultas.sysinfo.data.DataPackage#getData_View_Distribucion()
	 * @see gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion#getData_View
	 * @model opposite="Data_View" containment="true" required="true"
	 * @generated
	 */
	Distribucion getDistribucion();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.sysinfo.data.Data_View#getDistribucion <em>Distribucion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribucion</em>' containment reference.
	 * @see #getDistribucion()
	 * @generated
	 */
	void setDistribucion(Distribucion value);

} // Data_View
