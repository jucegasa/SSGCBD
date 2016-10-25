/**
 */
package gestionmodelosconsultas.modeloconsultas.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nombre Campo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getNombreCampo()
 * @model
 * @generated
 */
public enum NombreCampo implements Enumerator {
	/**
	 * The '<em><b>Id Unidad Organizacional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_UNIDAD_ORGANIZACIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ID_UNIDAD_ORGANIZACIONAL(1, "idUnidadOrganizacional", "idUnidadOrganizacional"),

	/**
	 * The '<em><b>Nombre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMBRE_VALUE
	 * @generated
	 * @ordered
	 */
	NOMBRE(2, "nombre", "nombre"),

	/**
	 * The '<em><b>Descripcion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPCION_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPCION(3, "descripcion", "descripcion"),

	/**
	 * The '<em><b>Id Actividad Proceso</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_ACTIVIDAD_PROCESO_VALUE
	 * @generated
	 * @ordered
	 */
	ID_ACTIVIDAD_PROCESO(4, "idActividadProceso", "idActividadProceso"),

	/**
	 * The '<em><b>Fecha Inicio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECHA_INICIO_VALUE
	 * @generated
	 * @ordered
	 */
	FECHA_INICIO(5, "fechaInicio", "fechaInicio"),

	/**
	 * The '<em><b>Fecha Fin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECHA_FIN_VALUE
	 * @generated
	 * @ordered
	 */
	FECHA_FIN(6, "fechaFin", "fechaFin"),

	/**
	 * The '<em><b>Id Rol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_ROL_VALUE
	 * @generated
	 * @ordered
	 */
	ID_ROL(7, "idRol", "idRol"),

	/**
	 * The '<em><b>Id Actor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ID_ACTOR(8, "idActor", "idActor"),

	/**
	 * The '<em><b>Apellido</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APELLIDO_VALUE
	 * @generated
	 * @ordered
	 */
	APELLIDO(9, "apellido", "apellido"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(10, "email", "email"),

	/**
	 * The '<em><b>Id Instancia Proceso</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_INSTANCIA_PROCESO_VALUE
	 * @generated
	 * @ordered
	 */
	ID_INSTANCIA_PROCESO(11, "idInstanciaProceso", "idInstanciaProceso"),

	/**
	 * The '<em><b>Id Contacto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_CONTACTO_VALUE
	 * @generated
	 * @ordered
	 */
	ID_CONTACTO(12, "idContacto", "idContacto"),

	/**
	 * The '<em><b>Username</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERNAME_VALUE
	 * @generated
	 * @ordered
	 */
	USERNAME(13, "username", "username"),

	/**
	 * The '<em><b>Telefono</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEFONO_VALUE
	 * @generated
	 * @ordered
	 */
	TELEFONO(14, "telefono", "telefono"),

	/**
	 * The '<em><b>Password</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	PASSWORD(15, "password", "password"),

	/**
	 * The '<em><b>Id Documento</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_DOCUMENTO_VALUE
	 * @generated
	 * @ordered
	 */
	ID_DOCUMENTO(16, "idDocumento", "idDocumento"),

	/**
	 * The '<em><b>Titulo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITULO_VALUE
	 * @generated
	 * @ordered
	 */
	TITULO(17, "titulo", "titulo"),

	/**
	 * The '<em><b>Edicion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDICION_VALUE
	 * @generated
	 * @ordered
	 */
	EDICION(18, "edicion", "edicion"),

	/**
	 * The '<em><b>Vigencia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIGENCIA_VALUE
	 * @generated
	 * @ordered
	 */
	VIGENCIA(19, "vigencia", "vigencia"),

	/**
	 * The '<em><b>Estado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTADO_VALUE
	 * @generated
	 * @ordered
	 */
	ESTADO(20, "estado", "estado"),

	/**
	 * The '<em><b>Fecha Creacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECHA_CREACION_VALUE
	 * @generated
	 * @ordered
	 */
	FECHA_CREACION(21, "fechaCreacion", "fechaCreacion"),

	/**
	 * The '<em><b>Anexo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANEXO_VALUE
	 * @generated
	 * @ordered
	 */
	ANEXO(22, "anexo", "anexo"),

	/**
	 * The '<em><b>Tipo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIPO_VALUE
	 * @generated
	 * @ordered
	 */
	TIPO(23, "tipo", "tipo"),

	/**
	 * The '<em><b>Comentarios</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMENTARIOS_VALUE
	 * @generated
	 * @ordered
	 */
	COMENTARIOS(24, "comentarios", "comentarios"),

	/**
	 * The '<em><b>Id Deposito</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_DEPOSITO_VALUE
	 * @generated
	 * @ordered
	 */
	ID_DEPOSITO(25, "idDeposito", "idDeposito"),

	/**
	 * The '<em><b>Id Quien</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_QUIEN_VALUE
	 * @generated
	 * @ordered
	 */
	ID_QUIEN(26, "idQuien", "idQuien"),

	/**
	 * The '<em><b>Id Armario</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_ARMARIO_VALUE
	 * @generated
	 * @ordered
	 */
	ID_ARMARIO(27, "idArmario", "idArmario"),

	/**
	 * The '<em><b>Id Disco</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_DISCO_VALUE
	 * @generated
	 * @ordered
	 */
	ID_DISCO(28, "idDisco", "idDisco"),

	/**
	 * The '<em><b>Referencia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCIA_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCIA(29, "referencia", "referencia"),

	/**
	 * The '<em><b>Id Comunicacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_COMUNICACION_VALUE
	 * @generated
	 * @ordered
	 */
	ID_COMUNICACION(30, "idComunicacion", "idComunicacion"),

	/**
	 * The '<em><b>Asunto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASUNTO_VALUE
	 * @generated
	 * @ordered
	 */
	ASUNTO(31, "asunto", "asunto"),

	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "default");

	/**
	 * The '<em><b>Id Unidad Organizacional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Unidad Organizacional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_UNIDAD_ORGANIZACIONAL
	 * @model name="idUnidadOrganizacional"
	 * @generated
	 * @ordered
	 */
	public static final int ID_UNIDAD_ORGANIZACIONAL_VALUE = 1;

	/**
	 * The '<em><b>Nombre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nombre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOMBRE
	 * @model name="nombre"
	 * @generated
	 * @ordered
	 */
	public static final int NOMBRE_VALUE = 2;

	/**
	 * The '<em><b>Descripcion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Descripcion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCRIPCION
	 * @model name="descripcion"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPCION_VALUE = 3;

	/**
	 * The '<em><b>Id Actividad Proceso</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Actividad Proceso</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_ACTIVIDAD_PROCESO
	 * @model name="idActividadProceso"
	 * @generated
	 * @ordered
	 */
	public static final int ID_ACTIVIDAD_PROCESO_VALUE = 4;

	/**
	 * The '<em><b>Fecha Inicio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fecha Inicio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECHA_INICIO
	 * @model name="fechaInicio"
	 * @generated
	 * @ordered
	 */
	public static final int FECHA_INICIO_VALUE = 5;

	/**
	 * The '<em><b>Fecha Fin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fecha Fin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECHA_FIN
	 * @model name="fechaFin"
	 * @generated
	 * @ordered
	 */
	public static final int FECHA_FIN_VALUE = 6;

	/**
	 * The '<em><b>Id Rol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Rol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_ROL
	 * @model name="idRol"
	 * @generated
	 * @ordered
	 */
	public static final int ID_ROL_VALUE = 7;

	/**
	 * The '<em><b>Id Actor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Actor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_ACTOR
	 * @model name="idActor"
	 * @generated
	 * @ordered
	 */
	public static final int ID_ACTOR_VALUE = 8;

	/**
	 * The '<em><b>Apellido</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apellido</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APELLIDO
	 * @model name="apellido"
	 * @generated
	 * @ordered
	 */
	public static final int APELLIDO_VALUE = 9;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Email</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model name="email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 10;

	/**
	 * The '<em><b>Id Instancia Proceso</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Instancia Proceso</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_INSTANCIA_PROCESO
	 * @model name="idInstanciaProceso"
	 * @generated
	 * @ordered
	 */
	public static final int ID_INSTANCIA_PROCESO_VALUE = 11;

	/**
	 * The '<em><b>Id Contacto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Contacto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_CONTACTO
	 * @model name="idContacto"
	 * @generated
	 * @ordered
	 */
	public static final int ID_CONTACTO_VALUE = 12;

	/**
	 * The '<em><b>Username</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Username</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERNAME
	 * @model name="username"
	 * @generated
	 * @ordered
	 */
	public static final int USERNAME_VALUE = 13;

	/**
	 * The '<em><b>Telefono</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Telefono</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TELEFONO
	 * @model name="telefono"
	 * @generated
	 * @ordered
	 */
	public static final int TELEFONO_VALUE = 14;

	/**
	 * The '<em><b>Password</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Password</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSWORD
	 * @model name="password"
	 * @generated
	 * @ordered
	 */
	public static final int PASSWORD_VALUE = 15;

	/**
	 * The '<em><b>Id Documento</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Documento</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_DOCUMENTO
	 * @model name="idDocumento"
	 * @generated
	 * @ordered
	 */
	public static final int ID_DOCUMENTO_VALUE = 16;

	/**
	 * The '<em><b>Titulo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Titulo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TITULO
	 * @model name="titulo"
	 * @generated
	 * @ordered
	 */
	public static final int TITULO_VALUE = 17;

	/**
	 * The '<em><b>Edicion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Edicion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDICION
	 * @model name="edicion"
	 * @generated
	 * @ordered
	 */
	public static final int EDICION_VALUE = 18;

	/**
	 * The '<em><b>Vigencia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vigencia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIGENCIA
	 * @model name="vigencia"
	 * @generated
	 * @ordered
	 */
	public static final int VIGENCIA_VALUE = 19;

	/**
	 * The '<em><b>Estado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Estado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTADO
	 * @model name="estado"
	 * @generated
	 * @ordered
	 */
	public static final int ESTADO_VALUE = 20;

	/**
	 * The '<em><b>Fecha Creacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fecha Creacion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECHA_CREACION
	 * @model name="fechaCreacion"
	 * @generated
	 * @ordered
	 */
	public static final int FECHA_CREACION_VALUE = 21;

	/**
	 * The '<em><b>Anexo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anexo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANEXO
	 * @model name="anexo"
	 * @generated
	 * @ordered
	 */
	public static final int ANEXO_VALUE = 22;

	/**
	 * The '<em><b>Tipo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tipo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIPO
	 * @model name="tipo"
	 * @generated
	 * @ordered
	 */
	public static final int TIPO_VALUE = 23;

	/**
	 * The '<em><b>Comentarios</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comentarios</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMENTARIOS
	 * @model name="comentarios"
	 * @generated
	 * @ordered
	 */
	public static final int COMENTARIOS_VALUE = 24;

	/**
	 * The '<em><b>Id Deposito</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Deposito</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_DEPOSITO
	 * @model name="idDeposito"
	 * @generated
	 * @ordered
	 */
	public static final int ID_DEPOSITO_VALUE = 25;

	/**
	 * The '<em><b>Id Quien</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Quien</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_QUIEN
	 * @model name="idQuien"
	 * @generated
	 * @ordered
	 */
	public static final int ID_QUIEN_VALUE = 26;

	/**
	 * The '<em><b>Id Armario</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Armario</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_ARMARIO
	 * @model name="idArmario"
	 * @generated
	 * @ordered
	 */
	public static final int ID_ARMARIO_VALUE = 27;

	/**
	 * The '<em><b>Id Disco</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Disco</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_DISCO
	 * @model name="idDisco"
	 * @generated
	 * @ordered
	 */
	public static final int ID_DISCO_VALUE = 28;

	/**
	 * The '<em><b>Referencia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Referencia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCIA
	 * @model name="referencia"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCIA_VALUE = 29;

	/**
	 * The '<em><b>Id Comunicacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id Comunicacion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_COMUNICACION
	 * @model name="idComunicacion"
	 * @generated
	 * @ordered
	 */
	public static final int ID_COMUNICACION_VALUE = 30;

	/**
	 * The '<em><b>Asunto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asunto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASUNTO
	 * @model name="asunto"
	 * @generated
	 * @ordered
	 */
	public static final int ASUNTO_VALUE = 31;

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Nombre Campo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NombreCampo[] VALUES_ARRAY =
		new NombreCampo[] {
			ID_UNIDAD_ORGANIZACIONAL,
			NOMBRE,
			DESCRIPCION,
			ID_ACTIVIDAD_PROCESO,
			FECHA_INICIO,
			FECHA_FIN,
			ID_ROL,
			ID_ACTOR,
			APELLIDO,
			EMAIL,
			ID_INSTANCIA_PROCESO,
			ID_CONTACTO,
			USERNAME,
			TELEFONO,
			PASSWORD,
			ID_DOCUMENTO,
			TITULO,
			EDICION,
			VIGENCIA,
			ESTADO,
			FECHA_CREACION,
			ANEXO,
			TIPO,
			COMENTARIOS,
			ID_DEPOSITO,
			ID_QUIEN,
			ID_ARMARIO,
			ID_DISCO,
			REFERENCIA,
			ID_COMUNICACION,
			ASUNTO,
			DEFAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Nombre Campo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NombreCampo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nombre Campo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreCampo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreCampo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Campo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreCampo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreCampo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Campo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreCampo get(int value) {
		switch (value) {
			case ID_UNIDAD_ORGANIZACIONAL_VALUE: return ID_UNIDAD_ORGANIZACIONAL;
			case NOMBRE_VALUE: return NOMBRE;
			case DESCRIPCION_VALUE: return DESCRIPCION;
			case ID_ACTIVIDAD_PROCESO_VALUE: return ID_ACTIVIDAD_PROCESO;
			case FECHA_INICIO_VALUE: return FECHA_INICIO;
			case FECHA_FIN_VALUE: return FECHA_FIN;
			case ID_ROL_VALUE: return ID_ROL;
			case ID_ACTOR_VALUE: return ID_ACTOR;
			case APELLIDO_VALUE: return APELLIDO;
			case EMAIL_VALUE: return EMAIL;
			case ID_INSTANCIA_PROCESO_VALUE: return ID_INSTANCIA_PROCESO;
			case ID_CONTACTO_VALUE: return ID_CONTACTO;
			case USERNAME_VALUE: return USERNAME;
			case TELEFONO_VALUE: return TELEFONO;
			case PASSWORD_VALUE: return PASSWORD;
			case ID_DOCUMENTO_VALUE: return ID_DOCUMENTO;
			case TITULO_VALUE: return TITULO;
			case EDICION_VALUE: return EDICION;
			case VIGENCIA_VALUE: return VIGENCIA;
			case ESTADO_VALUE: return ESTADO;
			case FECHA_CREACION_VALUE: return FECHA_CREACION;
			case ANEXO_VALUE: return ANEXO;
			case TIPO_VALUE: return TIPO;
			case COMENTARIOS_VALUE: return COMENTARIOS;
			case ID_DEPOSITO_VALUE: return ID_DEPOSITO;
			case ID_QUIEN_VALUE: return ID_QUIEN;
			case ID_ARMARIO_VALUE: return ID_ARMARIO;
			case ID_DISCO_VALUE: return ID_DISCO;
			case REFERENCIA_VALUE: return REFERENCIA;
			case ID_COMUNICACION_VALUE: return ID_COMUNICACION;
			case ASUNTO_VALUE: return ASUNTO;
			case DEFAULT_VALUE: return DEFAULT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NombreCampo(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NombreCampo
