/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.util;

import gestionmodelosconsultas.sysinfo.Paquete;

import gestionmodelosconsultas.sysinfo.core.ElementoModelo;

import gestionmodelosconsultas.sysinfo.data.docmgt.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage
 * @generated
 */
public class DocmgtSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocmgtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocmgtSwitch() {
		if (modelPackage == null) {
			modelPackage = DocmgtPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DocmgtPackage.DOCUMENTO: {
				Documento documento = (Documento)theEObject;
				T result = caseDocumento(documento);
				if (result == null) result = caseElementoModelo(documento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.PLANTILLA: {
				Plantilla plantilla = (Plantilla)theEObject;
				T result = casePlantilla(plantilla);
				if (result == null) result = caseDocumento(plantilla);
				if (result == null) result = caseElementoModelo(plantilla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.GUIA: {
				Guia guia = (Guia)theEObject;
				T result = caseGuia(guia);
				if (result == null) result = caseDocumento(guia);
				if (result == null) result = caseElementoModelo(guia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.LISTA_CHEQUEO: {
				ListaChequeo listaChequeo = (ListaChequeo)theEObject;
				T result = caseListaChequeo(listaChequeo);
				if (result == null) result = caseDocumento(listaChequeo);
				if (result == null) result = caseElementoModelo(listaChequeo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.CONTENIDO: {
				Contenido contenido = (Contenido)theEObject;
				T result = caseContenido(contenido);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.TIPO_DOCUMENTO: {
				TipoDocumento tipoDocumento = (TipoDocumento)theEObject;
				T result = caseTipoDocumento(tipoDocumento);
				if (result == null) result = caseElementoModelo(tipoDocumento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.COPIA: {
				Copia copia = (Copia)theEObject;
				T result = caseCopia(copia);
				if (result == null) result = caseElementoModelo(copia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseElementoModelo(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.INDEX_ENTRY: {
				IndexEntry indexEntry = (IndexEntry)theEObject;
				T result = caseIndexEntry(indexEntry);
				if (result == null) result = caseElementoModelo(indexEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.PALABRA_CLAVE: {
				PalabraClave palabraClave = (PalabraClave)theEObject;
				T result = casePalabraClave(palabraClave);
				if (result == null) result = caseElementoModelo(palabraClave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.BASELINE: {
				Baseline baseline = (Baseline)theEObject;
				T result = caseBaseline(baseline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.INDICE: {
				Indice indice = (Indice)theEObject;
				T result = caseIndice(indice);
				if (result == null) result = casePaquete(indice);
				if (result == null) result = caseElementoModelo(indice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.PRODUCTO: {
				Producto producto = (Producto)theEObject;
				T result = caseProducto(producto);
				if (result == null) result = caseElementoModelo(producto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.MENSAJE: {
				Mensaje mensaje = (Mensaje)theEObject;
				T result = caseMensaje(mensaje);
				if (result == null) result = caseElementoModelo(mensaje);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.GLOSARIO: {
				Glosario glosario = (Glosario)theEObject;
				T result = caseGlosario(glosario);
				if (result == null) result = casePaquete(glosario);
				if (result == null) result = caseElementoModelo(glosario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.LIBRERIA: {
				Libreria libreria = (Libreria)theEObject;
				T result = caseLibreria(libreria);
				if (result == null) result = casePaquete(libreria);
				if (result == null) result = caseElementoModelo(libreria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.DISTRIBUCION: {
				Distribucion distribucion = (Distribucion)theEObject;
				T result = caseDistribucion(distribucion);
				if (result == null) result = casePaquete(distribucion);
				if (result == null) result = caseElementoModelo(distribucion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.ORIENTACION: {
				Orientacion orientacion = (Orientacion)theEObject;
				T result = caseOrientacion(orientacion);
				if (result == null) result = casePaquete(orientacion);
				if (result == null) result = caseElementoModelo(orientacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.DOC: {
				Doc doc = (Doc)theEObject;
				T result = caseDoc(doc);
				if (result == null) result = caseElementoModelo(doc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocmgtPackage.COPIAS: {
				Copias copias = (Copias)theEObject;
				T result = caseCopias(copias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumento(Documento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plantilla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plantilla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantilla(Plantilla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuia(Guia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lista Chequeo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lista Chequeo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListaChequeo(ListaChequeo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenido</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenido</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenido(Contenido object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Documento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Documento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoDocumento(TipoDocumento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopia(Copia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntry(IndexEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Palabra Clave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Palabra Clave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePalabraClave(PalabraClave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseline(Baseline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndice(Indice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Producto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProducto(Producto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mensaje</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMensaje(Mensaje object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glosario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlosario(Glosario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Libreria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Libreria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibreria(Libreria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribucion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribucion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistribucion(Distribucion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientacion(Orientacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoc(Doc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopias(Copias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Modelo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Modelo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoModelo(ElementoModelo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paquete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaquete(Paquete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DocmgtSwitch
