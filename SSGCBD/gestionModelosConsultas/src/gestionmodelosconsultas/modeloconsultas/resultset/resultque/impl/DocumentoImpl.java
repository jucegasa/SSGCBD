/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultquePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getIdDocumento <em>Id Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getEdicion <em>Edicion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getVigencia <em>Vigencia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getFechaCreacion <em>Fecha Creacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getAnexo <em>Anexo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl#getComentarios <em>Comentarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentoImpl extends ElementoModeloResultadoImpl implements Documento {
	/**
	 * The default value of the '{@link #getIdDocumento() <em>Id Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDocumento()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DOCUMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdDocumento() <em>Id Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDocumento()
	 * @generated
	 * @ordered
	 */
	protected String idDocumento = ID_DOCUMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdicion() <em>Edicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicion()
	 * @generated
	 * @ordered
	 */
	protected static final String EDICION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdicion() <em>Edicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicion()
	 * @generated
	 * @ordered
	 */
	protected String edicion = EDICION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVigencia() <em>Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVigencia()
	 * @generated
	 * @ordered
	 */
	protected static final String VIGENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVigencia() <em>Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVigencia()
	 * @generated
	 * @ordered
	 */
	protected String vigencia = VIGENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaCreacion() <em>Fecha Creacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaCreacion()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_CREACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaCreacion() <em>Fecha Creacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaCreacion()
	 * @generated
	 * @ordered
	 */
	protected String fechaCreacion = FECHA_CREACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnexo() <em>Anexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnexo()
	 * @generated
	 * @ordered
	 */
	protected static final String ANEXO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnexo() <em>Anexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnexo()
	 * @generated
	 * @ordered
	 */
	protected String anexo = ANEXO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getComentarios() <em>Comentarios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentarios()
	 * @generated
	 * @ordered
	 */
	protected static final String COMENTARIOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComentarios() <em>Comentarios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentarios()
	 * @generated
	 * @ordered
	 */
	protected String comentarios = COMENTARIOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultquePackage.Literals.DOCUMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdDocumento() {
		return idDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDocumento(String newIdDocumento) {
		String oldIdDocumento = idDocumento;
		idDocumento = newIdDocumento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__ID_DOCUMENTO, oldIdDocumento, idDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdicion() {
		return edicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdicion(String newEdicion) {
		String oldEdicion = edicion;
		edicion = newEdicion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__EDICION, oldEdicion, edicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVigencia() {
		return vigencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVigencia(String newVigencia) {
		String oldVigencia = vigencia;
		vigencia = newVigencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__VIGENCIA, oldVigencia, vigencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaCreacion(String newFechaCreacion) {
		String oldFechaCreacion = fechaCreacion;
		fechaCreacion = newFechaCreacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__FECHA_CREACION, oldFechaCreacion, fechaCreacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnexo() {
		return anexo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnexo(String newAnexo) {
		String oldAnexo = anexo;
		anexo = newAnexo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__ANEXO, oldAnexo, anexo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComentarios(String newComentarios) {
		String oldComentarios = comentarios;
		comentarios = newComentarios;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquePackage.DOCUMENTO__COMENTARIOS, oldComentarios, comentarios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultquePackage.DOCUMENTO__ID_DOCUMENTO:
				return getIdDocumento();
			case ResultquePackage.DOCUMENTO__TITULO:
				return getTitulo();
			case ResultquePackage.DOCUMENTO__EDICION:
				return getEdicion();
			case ResultquePackage.DOCUMENTO__VIGENCIA:
				return getVigencia();
			case ResultquePackage.DOCUMENTO__ESTADO:
				return getEstado();
			case ResultquePackage.DOCUMENTO__FECHA_CREACION:
				return getFechaCreacion();
			case ResultquePackage.DOCUMENTO__ANEXO:
				return getAnexo();
			case ResultquePackage.DOCUMENTO__TIPO:
				return getTipo();
			case ResultquePackage.DOCUMENTO__COMENTARIOS:
				return getComentarios();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultquePackage.DOCUMENTO__ID_DOCUMENTO:
				setIdDocumento((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__TITULO:
				setTitulo((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__EDICION:
				setEdicion((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__VIGENCIA:
				setVigencia((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__ESTADO:
				setEstado((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__FECHA_CREACION:
				setFechaCreacion((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__ANEXO:
				setAnexo((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__TIPO:
				setTipo((String)newValue);
				return;
			case ResultquePackage.DOCUMENTO__COMENTARIOS:
				setComentarios((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResultquePackage.DOCUMENTO__ID_DOCUMENTO:
				setIdDocumento(ID_DOCUMENTO_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__EDICION:
				setEdicion(EDICION_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__VIGENCIA:
				setVigencia(VIGENCIA_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__FECHA_CREACION:
				setFechaCreacion(FECHA_CREACION_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__ANEXO:
				setAnexo(ANEXO_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case ResultquePackage.DOCUMENTO__COMENTARIOS:
				setComentarios(COMENTARIOS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResultquePackage.DOCUMENTO__ID_DOCUMENTO:
				return ID_DOCUMENTO_EDEFAULT == null ? idDocumento != null : !ID_DOCUMENTO_EDEFAULT.equals(idDocumento);
			case ResultquePackage.DOCUMENTO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case ResultquePackage.DOCUMENTO__EDICION:
				return EDICION_EDEFAULT == null ? edicion != null : !EDICION_EDEFAULT.equals(edicion);
			case ResultquePackage.DOCUMENTO__VIGENCIA:
				return VIGENCIA_EDEFAULT == null ? vigencia != null : !VIGENCIA_EDEFAULT.equals(vigencia);
			case ResultquePackage.DOCUMENTO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case ResultquePackage.DOCUMENTO__FECHA_CREACION:
				return FECHA_CREACION_EDEFAULT == null ? fechaCreacion != null : !FECHA_CREACION_EDEFAULT.equals(fechaCreacion);
			case ResultquePackage.DOCUMENTO__ANEXO:
				return ANEXO_EDEFAULT == null ? anexo != null : !ANEXO_EDEFAULT.equals(anexo);
			case ResultquePackage.DOCUMENTO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case ResultquePackage.DOCUMENTO__COMENTARIOS:
				return COMENTARIOS_EDEFAULT == null ? comentarios != null : !COMENTARIOS_EDEFAULT.equals(comentarios);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idDocumento: ");
		result.append(idDocumento);
		result.append(", titulo: ");
		result.append(titulo);
		result.append(", edicion: ");
		result.append(edicion);
		result.append(", vigencia: ");
		result.append(vigencia);
		result.append(", estado: ");
		result.append(estado);
		result.append(", fechaCreacion: ");
		result.append(fechaCreacion);
		result.append(", anexo: ");
		result.append(anexo);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", comentarios: ");
		result.append(comentarios);
		result.append(')');
		return result.toString();
	}

} //DocumentoImpl
