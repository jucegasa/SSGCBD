/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultque;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultqueFactory
 * @model kind="package"
 * @generated
 */
public interface ResultquePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resultque";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/resultset/resultque.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.resultset.resultque";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultquePackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ResultquePackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl <em>Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ResultquePackageImpl#getDocumento()
	 * @generated
	 */
	int DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Id Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ID_DOCUMENTO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TITULO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__EDICION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__VIGENCIA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ESTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fecha Creacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__FECHA_CREACION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anexo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ANEXO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TIPO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comentarios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__COMENTARIOS = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ComunicacionImpl <em>Comunicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ComunicacionImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ResultquePackageImpl#getComunicacion()
	 * @generated
	 */
	int COMUNICACION = 1;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Id Comunicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ID_COMUNICACION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION__ASUNTO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comunicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comunicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento
	 * @generated
	 */
	EClass getDocumento();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getIdDocumento <em>Id Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Documento</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getIdDocumento()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_IdDocumento();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getTitulo()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getEdicion <em>Edicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edicion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getEdicion()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Edicion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getVigencia <em>Vigencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vigencia</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getVigencia()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Vigencia();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getEstado()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Estado();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getFechaCreacion <em>Fecha Creacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Creacion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getFechaCreacion()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_FechaCreacion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getAnexo <em>Anexo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anexo</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getAnexo()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Anexo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getTipo()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getComentarios <em>Comentarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentarios</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento#getComentarios()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Comentarios();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion <em>Comunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comunicacion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion
	 * @generated
	 */
	EClass getComunicacion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getIdComunicacion <em>Id Comunicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Comunicacion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getIdComunicacion()
	 * @see #getComunicacion()
	 * @generated
	 */
	EAttribute getComunicacion_IdComunicacion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getAsunto <em>Asunto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asunto</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion#getAsunto()
	 * @see #getComunicacion()
	 * @generated
	 */
	EAttribute getComunicacion_Asunto();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultqueFactory getResultqueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl <em>Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.DocumentoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ResultquePackageImpl#getDocumento()
		 * @generated
		 */
		EClass DOCUMENTO = eINSTANCE.getDocumento();

		/**
		 * The meta object literal for the '<em><b>Id Documento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__ID_DOCUMENTO = eINSTANCE.getDocumento_IdDocumento();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TITULO = eINSTANCE.getDocumento_Titulo();

		/**
		 * The meta object literal for the '<em><b>Edicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__EDICION = eINSTANCE.getDocumento_Edicion();

		/**
		 * The meta object literal for the '<em><b>Vigencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__VIGENCIA = eINSTANCE.getDocumento_Vigencia();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__ESTADO = eINSTANCE.getDocumento_Estado();

		/**
		 * The meta object literal for the '<em><b>Fecha Creacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__FECHA_CREACION = eINSTANCE.getDocumento_FechaCreacion();

		/**
		 * The meta object literal for the '<em><b>Anexo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__ANEXO = eINSTANCE.getDocumento_Anexo();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TIPO = eINSTANCE.getDocumento_Tipo();

		/**
		 * The meta object literal for the '<em><b>Comentarios</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__COMENTARIOS = eINSTANCE.getDocumento_Comentarios();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ComunicacionImpl <em>Comunicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ComunicacionImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ResultquePackageImpl#getComunicacion()
		 * @generated
		 */
		EClass COMUNICACION = eINSTANCE.getComunicacion();

		/**
		 * The meta object literal for the '<em><b>Id Comunicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMUNICACION__ID_COMUNICACION = eINSTANCE.getComunicacion_IdComunicacion();

		/**
		 * The meta object literal for the '<em><b>Asunto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMUNICACION__ASUNTO = eINSTANCE.getComunicacion_Asunto();

	}

} //ResultquePackage
