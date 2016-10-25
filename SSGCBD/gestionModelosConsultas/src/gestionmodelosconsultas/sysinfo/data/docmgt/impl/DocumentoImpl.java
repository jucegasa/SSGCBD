/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.memoms.info.Anexo;
import gestionmodelosconsultas.memoms.info.Expediente;
import gestionmodelosconsultas.memoms.info.InfoPackage;
import gestionmodelosconsultas.memoms.info.Observacion;
import gestionmodelosconsultas.memoms.info.TablaRetencionDocumental;

import gestionmodelosconsultas.sysinfo.core.impl.ElementoModeloImpl;

import gestionmodelosconsultas.sysinfo.data.docmgt.Baseline;
import gestionmodelosconsultas.sysinfo.data.docmgt.Contenido;
import gestionmodelosconsultas.sysinfo.data.docmgt.Doc;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;
import gestionmodelosconsultas.sysinfo.data.docmgt.IndexEntry;
import gestionmodelosconsultas.sysinfo.data.docmgt.Item;
import gestionmodelosconsultas.sysinfo.data.docmgt.PalabraClave;
import gestionmodelosconsultas.sysinfo.data.docmgt.Producto;
import gestionmodelosconsultas.sysinfo.data.docmgt.TipoDocumento;
import gestionmodelosconsultas.sysinfo.data.docmgt.Version;

import gestionmodelosconsultas.sysinfo.function.Actividad;
import gestionmodelosconsultas.sysinfo.function.FunctionPackage;

import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.Quien;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getEdicion <em>Edicion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getVigencia <em>Vigencia</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getSuVersion <em>Su Version</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getContextoDocumento <em>Contexto Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getPalabraClave <em>Palabra Clave</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getSuContenido <em>Su Contenido</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getSuItem <em>Su Item</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getDerivadas <em>Derivadas</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getSuBaseline <em>Su Baseline</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getTheTipoDocumento <em>The Tipo Documento</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getTheRol <em>The Rol</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getAsociado <em>Asociado</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getTablaRetencionDocumental <em>Tabla Retencion Documental</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getExpediente <em>Expediente</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getObservacion <em>Observacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocumentoImpl#getAnexo <em>Anexo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentoImpl extends ElementoModeloImpl implements Documento {
	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

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
	protected static final Integer ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected Integer estado = ESTADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuVersion() <em>Su Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuVersion()
	 * @generated
	 * @ordered
	 */
	protected Version suVersion;

	/**
	 * The cached value of the '{@link #getContextoDocumento() <em>Contexto Documento</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextoDocumento()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexEntry> contextoDocumento;

	/**
	 * The cached value of the '{@link #getPalabraClave() <em>Palabra Clave</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalabraClave()
	 * @generated
	 * @ordered
	 */
	protected EList<PalabraClave> palabraClave;

	/**
	 * The cached value of the '{@link #getSuContenido() <em>Su Contenido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuContenido()
	 * @generated
	 * @ordered
	 */
	protected Contenido suContenido;

	/**
	 * The cached value of the '{@link #getSuItem() <em>Su Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> suItem;

	/**
	 * The cached value of the '{@link #getDerivadas() <em>Derivadas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivadas()
	 * @generated
	 * @ordered
	 */
	protected EList<Documento> derivadas;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Documento base;

	/**
	 * The cached value of the '{@link #getSuBaseline() <em>Su Baseline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuBaseline()
	 * @generated
	 * @ordered
	 */
	protected Baseline suBaseline;

	/**
	 * The cached value of the '{@link #getTheTipoDocumento() <em>The Tipo Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected TipoDocumento theTipoDocumento;

	/**
	 * The cached value of the '{@link #getProducto() <em>Producto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto()
	 * @generated
	 * @ordered
	 */
	protected Producto producto;

	/**
	 * The cached value of the '{@link #getTheRol() <em>The Rol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheRol()
	 * @generated
	 * @ordered
	 */
	protected EList<Quien> theRol;

	/**
	 * The cached value of the '{@link #getAsociado() <em>Asociado</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsociado()
	 * @generated
	 * @ordered
	 */
	protected EList<Actividad> asociado;

	/**
	 * The cached value of the '{@link #getTablaRetencionDocumental() <em>Tabla Retencion Documental</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablaRetencionDocumental()
	 * @generated
	 * @ordered
	 */
	protected TablaRetencionDocumental tablaRetencionDocumental;

	/**
	 * The cached value of the '{@link #getExpediente() <em>Expediente</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpediente()
	 * @generated
	 * @ordered
	 */
	protected EList<Expediente> expediente;

	/**
	 * The cached value of the '{@link #getObservacion() <em>Observacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Observacion> observacion;

	/**
	 * The cached value of the '{@link #getAnexo() <em>Anexo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnexo()
	 * @generated
	 * @ordered
	 */
	protected EList<Anexo> anexo;

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
		return DocmgtPackage.Literals.DOCUMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doc getDoc() {
		if (eContainerFeatureID() != DocmgtPackage.DOCUMENTO__DOC) return null;
		return (Doc)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(Doc newDoc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoc, DocmgtPackage.DOCUMENTO__DOC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(Doc newDoc) {
		if (newDoc != eInternalContainer() || (eContainerFeatureID() != DocmgtPackage.DOCUMENTO__DOC && newDoc != null)) {
			if (EcoreUtil.isAncestor(this, newDoc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoc != null)
				msgs = ((InternalEObject)newDoc).eInverseAdd(this, DocmgtPackage.DOC__DOCUMENTO, Doc.class, msgs);
			msgs = basicSetDoc(newDoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__DOC, newDoc, newDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__TITULO, oldTitulo, titulo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__EDICION, oldEdicion, edicion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__VIGENCIA, oldVigencia, vigencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(Integer newEstado) {
		Integer oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getSuVersion() {
		if (suVersion != null && suVersion.eIsProxy()) {
			InternalEObject oldSuVersion = (InternalEObject)suVersion;
			suVersion = (Version)eResolveProxy(oldSuVersion);
			if (suVersion != oldSuVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.DOCUMENTO__SU_VERSION, oldSuVersion, suVersion));
			}
		}
		return suVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetSuVersion() {
		return suVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuVersion(Version newSuVersion, NotificationChain msgs) {
		Version oldSuVersion = suVersion;
		suVersion = newSuVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__SU_VERSION, oldSuVersion, newSuVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuVersion(Version newSuVersion) {
		if (newSuVersion != suVersion) {
			NotificationChain msgs = null;
			if (suVersion != null)
				msgs = ((InternalEObject)suVersion).eInverseRemove(this, DocmgtPackage.VERSION__SU_DOCUMENTO, Version.class, msgs);
			if (newSuVersion != null)
				msgs = ((InternalEObject)newSuVersion).eInverseAdd(this, DocmgtPackage.VERSION__SU_DOCUMENTO, Version.class, msgs);
			msgs = basicSetSuVersion(newSuVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__SU_VERSION, newSuVersion, newSuVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntry> getContextoDocumento() {
		if (contextoDocumento == null) {
			contextoDocumento = new EObjectWithInverseResolvingEList<IndexEntry>(IndexEntry.class, this, DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO, DocmgtPackage.INDEX_ENTRY__SU_DOCUMENTO);
		}
		return contextoDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PalabraClave> getPalabraClave() {
		if (palabraClave == null) {
			palabraClave = new EObjectWithInverseResolvingEList.ManyInverse<PalabraClave>(PalabraClave.class, this, DocmgtPackage.DOCUMENTO__PALABRA_CLAVE, DocmgtPackage.PALABRA_CLAVE__DOCUMENTO);
		}
		return palabraClave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenido getSuContenido() {
		return suContenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuContenido(Contenido newSuContenido, NotificationChain msgs) {
		Contenido oldSuContenido = suContenido;
		suContenido = newSuContenido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__SU_CONTENIDO, oldSuContenido, newSuContenido);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuContenido(Contenido newSuContenido) {
		if (newSuContenido != suContenido) {
			NotificationChain msgs = null;
			if (suContenido != null)
				msgs = ((InternalEObject)suContenido).eInverseRemove(this, DocmgtPackage.CONTENIDO__SU_DOCUMENTO, Contenido.class, msgs);
			if (newSuContenido != null)
				msgs = ((InternalEObject)newSuContenido).eInverseAdd(this, DocmgtPackage.CONTENIDO__SU_DOCUMENTO, Contenido.class, msgs);
			msgs = basicSetSuContenido(newSuContenido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__SU_CONTENIDO, newSuContenido, newSuContenido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getSuItem() {
		if (suItem == null) {
			suItem = new EObjectWithInverseResolvingEList<Item>(Item.class, this, DocmgtPackage.DOCUMENTO__SU_ITEM, DocmgtPackage.ITEM__SU_DOCUMENTO);
		}
		return suItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documento> getDerivadas() {
		if (derivadas == null) {
			derivadas = new EObjectWithInverseResolvingEList<Documento>(Documento.class, this, DocmgtPackage.DOCUMENTO__DERIVADAS, DocmgtPackage.DOCUMENTO__BASE);
		}
		return derivadas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Documento)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.DOCUMENTO__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Documento newBase, NotificationChain msgs) {
		Documento oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Documento newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, DocmgtPackage.DOCUMENTO__DERIVADAS, Documento.class, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, DocmgtPackage.DOCUMENTO__DERIVADAS, Documento.class, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baseline getSuBaseline() {
		return suBaseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuBaseline(Baseline newSuBaseline, NotificationChain msgs) {
		Baseline oldSuBaseline = suBaseline;
		suBaseline = newSuBaseline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__SU_BASELINE, oldSuBaseline, newSuBaseline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuBaseline(Baseline newSuBaseline) {
		if (newSuBaseline != suBaseline) {
			NotificationChain msgs = null;
			if (suBaseline != null)
				msgs = ((InternalEObject)suBaseline).eInverseRemove(this, DocmgtPackage.BASELINE__SU_DOCUMENTO, Baseline.class, msgs);
			if (newSuBaseline != null)
				msgs = ((InternalEObject)newSuBaseline).eInverseAdd(this, DocmgtPackage.BASELINE__SU_DOCUMENTO, Baseline.class, msgs);
			msgs = basicSetSuBaseline(newSuBaseline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__SU_BASELINE, newSuBaseline, newSuBaseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDocumento getTheTipoDocumento() {
		if (theTipoDocumento != null && theTipoDocumento.eIsProxy()) {
			InternalEObject oldTheTipoDocumento = (InternalEObject)theTipoDocumento;
			theTipoDocumento = (TipoDocumento)eResolveProxy(oldTheTipoDocumento);
			if (theTipoDocumento != oldTheTipoDocumento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO, oldTheTipoDocumento, theTipoDocumento));
			}
		}
		return theTipoDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDocumento basicGetTheTipoDocumento() {
		return theTipoDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTipoDocumento(TipoDocumento newTheTipoDocumento, NotificationChain msgs) {
		TipoDocumento oldTheTipoDocumento = theTipoDocumento;
		theTipoDocumento = newTheTipoDocumento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO, oldTheTipoDocumento, newTheTipoDocumento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTipoDocumento(TipoDocumento newTheTipoDocumento) {
		if (newTheTipoDocumento != theTipoDocumento) {
			NotificationChain msgs = null;
			if (theTipoDocumento != null)
				msgs = ((InternalEObject)theTipoDocumento).eInverseRemove(this, DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO, TipoDocumento.class, msgs);
			if (newTheTipoDocumento != null)
				msgs = ((InternalEObject)newTheTipoDocumento).eInverseAdd(this, DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO, TipoDocumento.class, msgs);
			msgs = basicSetTheTipoDocumento(newTheTipoDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO, newTheTipoDocumento, newTheTipoDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto getProducto() {
		if (producto != null && producto.eIsProxy()) {
			InternalEObject oldProducto = (InternalEObject)producto;
			producto = (Producto)eResolveProxy(oldProducto);
			if (producto != oldProducto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.DOCUMENTO__PRODUCTO, oldProducto, producto));
			}
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto basicGetProducto() {
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducto(Producto newProducto, NotificationChain msgs) {
		Producto oldProducto = producto;
		producto = newProducto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__PRODUCTO, oldProducto, newProducto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducto(Producto newProducto) {
		if (newProducto != producto) {
			NotificationChain msgs = null;
			if (producto != null)
				msgs = ((InternalEObject)producto).eInverseRemove(this, DocmgtPackage.PRODUCTO__DOCUMENTO, Producto.class, msgs);
			if (newProducto != null)
				msgs = ((InternalEObject)newProducto).eInverseAdd(this, DocmgtPackage.PRODUCTO__DOCUMENTO, Producto.class, msgs);
			msgs = basicSetProducto(newProducto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__PRODUCTO, newProducto, newProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quien> getTheRol() {
		if (theRol == null) {
			theRol = new EObjectWithInverseResolvingEList.ManyInverse<Quien>(Quien.class, this, DocmgtPackage.DOCUMENTO__THE_ROL, PeoplePackage.QUIEN__THE_DOCUMENTO);
		}
		return theRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actividad> getAsociado() {
		if (asociado == null) {
			asociado = new EObjectWithInverseResolvingEList.ManyInverse<Actividad>(Actividad.class, this, DocmgtPackage.DOCUMENTO__ASOCIADO, FunctionPackage.ACTIVIDAD__GENERA);
		}
		return asociado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablaRetencionDocumental getTablaRetencionDocumental() {
		if (tablaRetencionDocumental != null && tablaRetencionDocumental.eIsProxy()) {
			InternalEObject oldTablaRetencionDocumental = (InternalEObject)tablaRetencionDocumental;
			tablaRetencionDocumental = (TablaRetencionDocumental)eResolveProxy(oldTablaRetencionDocumental);
			if (tablaRetencionDocumental != oldTablaRetencionDocumental) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL, oldTablaRetencionDocumental, tablaRetencionDocumental));
			}
		}
		return tablaRetencionDocumental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablaRetencionDocumental basicGetTablaRetencionDocumental() {
		return tablaRetencionDocumental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTablaRetencionDocumental(TablaRetencionDocumental newTablaRetencionDocumental, NotificationChain msgs) {
		TablaRetencionDocumental oldTablaRetencionDocumental = tablaRetencionDocumental;
		tablaRetencionDocumental = newTablaRetencionDocumental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL, oldTablaRetencionDocumental, newTablaRetencionDocumental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablaRetencionDocumental(TablaRetencionDocumental newTablaRetencionDocumental) {
		if (newTablaRetencionDocumental != tablaRetencionDocumental) {
			NotificationChain msgs = null;
			if (tablaRetencionDocumental != null)
				msgs = ((InternalEObject)tablaRetencionDocumental).eInverseRemove(this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO, TablaRetencionDocumental.class, msgs);
			if (newTablaRetencionDocumental != null)
				msgs = ((InternalEObject)newTablaRetencionDocumental).eInverseAdd(this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO, TablaRetencionDocumental.class, msgs);
			msgs = basicSetTablaRetencionDocumental(newTablaRetencionDocumental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL, newTablaRetencionDocumental, newTablaRetencionDocumental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expediente> getExpediente() {
		if (expediente == null) {
			expediente = new EObjectWithInverseResolvingEList.ManyInverse<Expediente>(Expediente.class, this, DocmgtPackage.DOCUMENTO__EXPEDIENTE, InfoPackage.EXPEDIENTE__DOCUMENTO);
		}
		return expediente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observacion> getObservacion() {
		if (observacion == null) {
			observacion = new EObjectContainmentWithInverseEList<Observacion>(Observacion.class, this, DocmgtPackage.DOCUMENTO__OBSERVACION, InfoPackage.OBSERVACION__DOCUMENTO);
		}
		return observacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Anexo> getAnexo() {
		if (anexo == null) {
			anexo = new EObjectContainmentWithInverseEList<Anexo>(Anexo.class, this, DocmgtPackage.DOCUMENTO__ANEXO, InfoPackage.ANEXO__DOCUMENTO);
		}
		return anexo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Registrar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Aprobar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Expirar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocmgtPackage.DOCUMENTO__DOC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDoc((Doc)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__SU_VERSION:
				if (suVersion != null)
					msgs = ((InternalEObject)suVersion).eInverseRemove(this, DocmgtPackage.VERSION__SU_DOCUMENTO, Version.class, msgs);
				return basicSetSuVersion((Version)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextoDocumento()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__PALABRA_CLAVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPalabraClave()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__SU_CONTENIDO:
				if (suContenido != null)
					msgs = ((InternalEObject)suContenido).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocmgtPackage.DOCUMENTO__SU_CONTENIDO, null, msgs);
				return basicSetSuContenido((Contenido)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__SU_ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuItem()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__DERIVADAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivadas()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__BASE:
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, DocmgtPackage.DOCUMENTO__DERIVADAS, Documento.class, msgs);
				return basicSetBase((Documento)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__SU_BASELINE:
				if (suBaseline != null)
					msgs = ((InternalEObject)suBaseline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocmgtPackage.DOCUMENTO__SU_BASELINE, null, msgs);
				return basicSetSuBaseline((Baseline)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO:
				if (theTipoDocumento != null)
					msgs = ((InternalEObject)theTipoDocumento).eInverseRemove(this, DocmgtPackage.TIPO_DOCUMENTO__THE_DOCUMENTO, TipoDocumento.class, msgs);
				return basicSetTheTipoDocumento((TipoDocumento)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__PRODUCTO:
				if (producto != null)
					msgs = ((InternalEObject)producto).eInverseRemove(this, DocmgtPackage.PRODUCTO__DOCUMENTO, Producto.class, msgs);
				return basicSetProducto((Producto)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__THE_ROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheRol()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__ASOCIADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAsociado()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL:
				if (tablaRetencionDocumental != null)
					msgs = ((InternalEObject)tablaRetencionDocumental).eInverseRemove(this, InfoPackage.TABLA_RETENCION_DOCUMENTAL__DOCUMENTO, TablaRetencionDocumental.class, msgs);
				return basicSetTablaRetencionDocumental((TablaRetencionDocumental)otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__EXPEDIENTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpediente()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__OBSERVACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObservacion()).basicAdd(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__ANEXO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnexo()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocmgtPackage.DOCUMENTO__DOC:
				return basicSetDoc(null, msgs);
			case DocmgtPackage.DOCUMENTO__SU_VERSION:
				return basicSetSuVersion(null, msgs);
			case DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO:
				return ((InternalEList<?>)getContextoDocumento()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__PALABRA_CLAVE:
				return ((InternalEList<?>)getPalabraClave()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__SU_CONTENIDO:
				return basicSetSuContenido(null, msgs);
			case DocmgtPackage.DOCUMENTO__SU_ITEM:
				return ((InternalEList<?>)getSuItem()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__DERIVADAS:
				return ((InternalEList<?>)getDerivadas()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__BASE:
				return basicSetBase(null, msgs);
			case DocmgtPackage.DOCUMENTO__SU_BASELINE:
				return basicSetSuBaseline(null, msgs);
			case DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO:
				return basicSetTheTipoDocumento(null, msgs);
			case DocmgtPackage.DOCUMENTO__PRODUCTO:
				return basicSetProducto(null, msgs);
			case DocmgtPackage.DOCUMENTO__THE_ROL:
				return ((InternalEList<?>)getTheRol()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__ASOCIADO:
				return ((InternalEList<?>)getAsociado()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL:
				return basicSetTablaRetencionDocumental(null, msgs);
			case DocmgtPackage.DOCUMENTO__EXPEDIENTE:
				return ((InternalEList<?>)getExpediente()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__OBSERVACION:
				return ((InternalEList<?>)getObservacion()).basicRemove(otherEnd, msgs);
			case DocmgtPackage.DOCUMENTO__ANEXO:
				return ((InternalEList<?>)getAnexo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DocmgtPackage.DOCUMENTO__DOC:
				return eInternalContainer().eInverseRemove(this, DocmgtPackage.DOC__DOCUMENTO, Doc.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocmgtPackage.DOCUMENTO__DOC:
				return getDoc();
			case DocmgtPackage.DOCUMENTO__DESCRIPCION:
				return getDescripcion();
			case DocmgtPackage.DOCUMENTO__TITULO:
				return getTitulo();
			case DocmgtPackage.DOCUMENTO__EDICION:
				return getEdicion();
			case DocmgtPackage.DOCUMENTO__VIGENCIA:
				return getVigencia();
			case DocmgtPackage.DOCUMENTO__ESTADO:
				return getEstado();
			case DocmgtPackage.DOCUMENTO__SU_VERSION:
				if (resolve) return getSuVersion();
				return basicGetSuVersion();
			case DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO:
				return getContextoDocumento();
			case DocmgtPackage.DOCUMENTO__PALABRA_CLAVE:
				return getPalabraClave();
			case DocmgtPackage.DOCUMENTO__SU_CONTENIDO:
				return getSuContenido();
			case DocmgtPackage.DOCUMENTO__SU_ITEM:
				return getSuItem();
			case DocmgtPackage.DOCUMENTO__DERIVADAS:
				return getDerivadas();
			case DocmgtPackage.DOCUMENTO__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case DocmgtPackage.DOCUMENTO__SU_BASELINE:
				return getSuBaseline();
			case DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO:
				if (resolve) return getTheTipoDocumento();
				return basicGetTheTipoDocumento();
			case DocmgtPackage.DOCUMENTO__PRODUCTO:
				if (resolve) return getProducto();
				return basicGetProducto();
			case DocmgtPackage.DOCUMENTO__THE_ROL:
				return getTheRol();
			case DocmgtPackage.DOCUMENTO__ASOCIADO:
				return getAsociado();
			case DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL:
				if (resolve) return getTablaRetencionDocumental();
				return basicGetTablaRetencionDocumental();
			case DocmgtPackage.DOCUMENTO__EXPEDIENTE:
				return getExpediente();
			case DocmgtPackage.DOCUMENTO__OBSERVACION:
				return getObservacion();
			case DocmgtPackage.DOCUMENTO__ANEXO:
				return getAnexo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocmgtPackage.DOCUMENTO__DOC:
				setDoc((Doc)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__TITULO:
				setTitulo((String)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__EDICION:
				setEdicion((String)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__VIGENCIA:
				setVigencia((String)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__ESTADO:
				setEstado((Integer)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__SU_VERSION:
				setSuVersion((Version)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO:
				getContextoDocumento().clear();
				getContextoDocumento().addAll((Collection<? extends IndexEntry>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__PALABRA_CLAVE:
				getPalabraClave().clear();
				getPalabraClave().addAll((Collection<? extends PalabraClave>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__SU_CONTENIDO:
				setSuContenido((Contenido)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__SU_ITEM:
				getSuItem().clear();
				getSuItem().addAll((Collection<? extends Item>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__DERIVADAS:
				getDerivadas().clear();
				getDerivadas().addAll((Collection<? extends Documento>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__BASE:
				setBase((Documento)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__SU_BASELINE:
				setSuBaseline((Baseline)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO:
				setTheTipoDocumento((TipoDocumento)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__PRODUCTO:
				setProducto((Producto)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__THE_ROL:
				getTheRol().clear();
				getTheRol().addAll((Collection<? extends Quien>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__ASOCIADO:
				getAsociado().clear();
				getAsociado().addAll((Collection<? extends Actividad>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL:
				setTablaRetencionDocumental((TablaRetencionDocumental)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__EXPEDIENTE:
				getExpediente().clear();
				getExpediente().addAll((Collection<? extends Expediente>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__OBSERVACION:
				getObservacion().clear();
				getObservacion().addAll((Collection<? extends Observacion>)newValue);
				return;
			case DocmgtPackage.DOCUMENTO__ANEXO:
				getAnexo().clear();
				getAnexo().addAll((Collection<? extends Anexo>)newValue);
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
			case DocmgtPackage.DOCUMENTO__DOC:
				setDoc((Doc)null);
				return;
			case DocmgtPackage.DOCUMENTO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case DocmgtPackage.DOCUMENTO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case DocmgtPackage.DOCUMENTO__EDICION:
				setEdicion(EDICION_EDEFAULT);
				return;
			case DocmgtPackage.DOCUMENTO__VIGENCIA:
				setVigencia(VIGENCIA_EDEFAULT);
				return;
			case DocmgtPackage.DOCUMENTO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DocmgtPackage.DOCUMENTO__SU_VERSION:
				setSuVersion((Version)null);
				return;
			case DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO:
				getContextoDocumento().clear();
				return;
			case DocmgtPackage.DOCUMENTO__PALABRA_CLAVE:
				getPalabraClave().clear();
				return;
			case DocmgtPackage.DOCUMENTO__SU_CONTENIDO:
				setSuContenido((Contenido)null);
				return;
			case DocmgtPackage.DOCUMENTO__SU_ITEM:
				getSuItem().clear();
				return;
			case DocmgtPackage.DOCUMENTO__DERIVADAS:
				getDerivadas().clear();
				return;
			case DocmgtPackage.DOCUMENTO__BASE:
				setBase((Documento)null);
				return;
			case DocmgtPackage.DOCUMENTO__SU_BASELINE:
				setSuBaseline((Baseline)null);
				return;
			case DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO:
				setTheTipoDocumento((TipoDocumento)null);
				return;
			case DocmgtPackage.DOCUMENTO__PRODUCTO:
				setProducto((Producto)null);
				return;
			case DocmgtPackage.DOCUMENTO__THE_ROL:
				getTheRol().clear();
				return;
			case DocmgtPackage.DOCUMENTO__ASOCIADO:
				getAsociado().clear();
				return;
			case DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL:
				setTablaRetencionDocumental((TablaRetencionDocumental)null);
				return;
			case DocmgtPackage.DOCUMENTO__EXPEDIENTE:
				getExpediente().clear();
				return;
			case DocmgtPackage.DOCUMENTO__OBSERVACION:
				getObservacion().clear();
				return;
			case DocmgtPackage.DOCUMENTO__ANEXO:
				getAnexo().clear();
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
			case DocmgtPackage.DOCUMENTO__DOC:
				return getDoc() != null;
			case DocmgtPackage.DOCUMENTO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case DocmgtPackage.DOCUMENTO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case DocmgtPackage.DOCUMENTO__EDICION:
				return EDICION_EDEFAULT == null ? edicion != null : !EDICION_EDEFAULT.equals(edicion);
			case DocmgtPackage.DOCUMENTO__VIGENCIA:
				return VIGENCIA_EDEFAULT == null ? vigencia != null : !VIGENCIA_EDEFAULT.equals(vigencia);
			case DocmgtPackage.DOCUMENTO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DocmgtPackage.DOCUMENTO__SU_VERSION:
				return suVersion != null;
			case DocmgtPackage.DOCUMENTO__CONTEXTO_DOCUMENTO:
				return contextoDocumento != null && !contextoDocumento.isEmpty();
			case DocmgtPackage.DOCUMENTO__PALABRA_CLAVE:
				return palabraClave != null && !palabraClave.isEmpty();
			case DocmgtPackage.DOCUMENTO__SU_CONTENIDO:
				return suContenido != null;
			case DocmgtPackage.DOCUMENTO__SU_ITEM:
				return suItem != null && !suItem.isEmpty();
			case DocmgtPackage.DOCUMENTO__DERIVADAS:
				return derivadas != null && !derivadas.isEmpty();
			case DocmgtPackage.DOCUMENTO__BASE:
				return base != null;
			case DocmgtPackage.DOCUMENTO__SU_BASELINE:
				return suBaseline != null;
			case DocmgtPackage.DOCUMENTO__THE_TIPO_DOCUMENTO:
				return theTipoDocumento != null;
			case DocmgtPackage.DOCUMENTO__PRODUCTO:
				return producto != null;
			case DocmgtPackage.DOCUMENTO__THE_ROL:
				return theRol != null && !theRol.isEmpty();
			case DocmgtPackage.DOCUMENTO__ASOCIADO:
				return asociado != null && !asociado.isEmpty();
			case DocmgtPackage.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL:
				return tablaRetencionDocumental != null;
			case DocmgtPackage.DOCUMENTO__EXPEDIENTE:
				return expediente != null && !expediente.isEmpty();
			case DocmgtPackage.DOCUMENTO__OBSERVACION:
				return observacion != null && !observacion.isEmpty();
			case DocmgtPackage.DOCUMENTO__ANEXO:
				return anexo != null && !anexo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DocmgtPackage.DOCUMENTO___REGISTRAR:
				Registrar();
				return null;
			case DocmgtPackage.DOCUMENTO___APROBAR:
				Aprobar();
				return null;
			case DocmgtPackage.DOCUMENTO___EXPIRAR:
				Expirar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (descripcion: ");
		result.append(descripcion);
		result.append(", titulo: ");
		result.append(titulo);
		result.append(", edicion: ");
		result.append(edicion);
		result.append(", vigencia: ");
		result.append(vigencia);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //DocumentoImpl
