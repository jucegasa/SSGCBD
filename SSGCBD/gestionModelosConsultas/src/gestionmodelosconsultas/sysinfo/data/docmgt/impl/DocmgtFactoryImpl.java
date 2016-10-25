/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.impl;

import gestionmodelosconsultas.sysinfo.data.docmgt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocmgtFactoryImpl extends EFactoryImpl implements DocmgtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocmgtFactory init() {
		try {
			DocmgtFactory theDocmgtFactory = (DocmgtFactory)EPackage.Registry.INSTANCE.getEFactory(DocmgtPackage.eNS_URI);
			if (theDocmgtFactory != null) {
				return theDocmgtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocmgtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocmgtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DocmgtPackage.DOCUMENTO: return createDocumento();
			case DocmgtPackage.PLANTILLA: return createPlantilla();
			case DocmgtPackage.GUIA: return createGuia();
			case DocmgtPackage.LISTA_CHEQUEO: return createListaChequeo();
			case DocmgtPackage.CONTENIDO: return createContenido();
			case DocmgtPackage.TIPO_DOCUMENTO: return createTipoDocumento();
			case DocmgtPackage.COPIA: return createCopia();
			case DocmgtPackage.VERSION: return createVersion();
			case DocmgtPackage.INDEX_ENTRY: return createIndexEntry();
			case DocmgtPackage.PALABRA_CLAVE: return createPalabraClave();
			case DocmgtPackage.ITEM: return createItem();
			case DocmgtPackage.BASELINE: return createBaseline();
			case DocmgtPackage.INDICE: return createIndice();
			case DocmgtPackage.PRODUCTO: return createProducto();
			case DocmgtPackage.MENSAJE: return createMensaje();
			case DocmgtPackage.GLOSARIO: return createGlosario();
			case DocmgtPackage.LIBRERIA: return createLibreria();
			case DocmgtPackage.DISTRIBUCION: return createDistribucion();
			case DocmgtPackage.ORIENTACION: return createOrientacion();
			case DocmgtPackage.DOC: return createDoc();
			case DocmgtPackage.COPIAS: return createCopias();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento createDocumento() {
		DocumentoImpl documento = new DocumentoImpl();
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plantilla createPlantilla() {
		PlantillaImpl plantilla = new PlantillaImpl();
		return plantilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guia createGuia() {
		GuiaImpl guia = new GuiaImpl();
		return guia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListaChequeo createListaChequeo() {
		ListaChequeoImpl listaChequeo = new ListaChequeoImpl();
		return listaChequeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenido createContenido() {
		ContenidoImpl contenido = new ContenidoImpl();
		return contenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDocumento createTipoDocumento() {
		TipoDocumentoImpl tipoDocumento = new TipoDocumentoImpl();
		return tipoDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copia createCopia() {
		CopiaImpl copia = new CopiaImpl();
		return copia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntry createIndexEntry() {
		IndexEntryImpl indexEntry = new IndexEntryImpl();
		return indexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalabraClave createPalabraClave() {
		PalabraClaveImpl palabraClave = new PalabraClaveImpl();
		return palabraClave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baseline createBaseline() {
		BaselineImpl baseline = new BaselineImpl();
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indice createIndice() {
		IndiceImpl indice = new IndiceImpl();
		return indice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto createProducto() {
		ProductoImpl producto = new ProductoImpl();
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mensaje createMensaje() {
		MensajeImpl mensaje = new MensajeImpl();
		return mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glosario createGlosario() {
		GlosarioImpl glosario = new GlosarioImpl();
		return glosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Libreria createLibreria() {
		LibreriaImpl libreria = new LibreriaImpl();
		return libreria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribucion createDistribucion() {
		DistribucionImpl distribucion = new DistribucionImpl();
		return distribucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientacion createOrientacion() {
		OrientacionImpl orientacion = new OrientacionImpl();
		return orientacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doc createDoc() {
		DocImpl doc = new DocImpl();
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copias createCopias() {
		CopiasImpl copias = new CopiasImpl();
		return copias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocmgtPackage getDocmgtPackage() {
		return (DocmgtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocmgtPackage getPackage() {
		return DocmgtPackage.eINSTANCE;
	}

} //DocmgtFactoryImpl
