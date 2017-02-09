package gestionmodelosconsultas.produccion;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondeFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.ResultdondeFactoryImpl;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultqueFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.ResultquienFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional;
import gestionmodelosconsultas.world.Hijo;
import gestionmodelosconsultas.world.Padre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GeneradorElementoResultado {

	/**
	 * Crea el resultado de la consulta
	 * @param resultado
	 * @param padresMap
	 * @param hijosMap
	 * @return
	 */
	public Resultado crearResultado(Resultado resultado,
			HashMap<String, Padre> padresMap, ArrayList<Hijo> hijosMap, int orderSize) {
		// TODO Auto-generated method stub
		String caminoActual="";
//		resultado = (resultado, padresMap);
		for (Padre padre : padresMap.values()) {
			caminoActual= padre.getId();
			int nivel=1;
			ElementoModeloResultado elementoPadre = crearPadre(padre, nivel, orderSize, caminoActual, hijosMap);
			elementoPadre.setResultado(resultado);
		}
		return resultado;
	}

	/**
	 * Crea el Padre
	 * @param padre
	 * @param nivel
	 * @param orderSize
	 * @param caminoActual
	 * @return
	 */
	private ElementoModeloResultado crearPadre(Padre padre, int nivel,
			int orderSize, String caminoActual, ArrayList<Hijo> hijos) {
		// TODO Auto-generated method stub
		//crear elemento
		
		switch (padre.getElemento()) {
			
			//Quien
			case "actor":
				Actor actor = ResultquienFactory.eINSTANCE.createActor();
				actor = crearActor(padre.getCampos(), actor);
				actor.setKey(padre.getId());
				if( nivel<orderSize){
					nivel++;
					actor = (Actor) crearHijos(actor, nivel, caminoActual, orderSize, hijos);
				}
				return actor;
				
			case "rol":
				Rol rol = ResultquienFactory.eINSTANCE.createRol();
				rol = crearRol(padre.getCampos(), rol);
				rol.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					rol = (Rol) crearHijos(rol, nivel, caminoActual, orderSize, hijos);
				}
				return rol;
			
			case "unidadorganizacional":
				UnidadOrganizacional unidadOrganizacional = ResultquienFactory.eINSTANCE.createUnidadOrganizacional();
				unidadOrganizacional = crearUnidadOrganizacional(padre.getCampos(), unidadOrganizacional);
				unidadOrganizacional.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					unidadOrganizacional = (UnidadOrganizacional) crearHijos(unidadOrganizacional, nivel, caminoActual, orderSize, hijos);
				}
				return unidadOrganizacional;
			
			case "contacto":
				Contacto contacto = ResultquienFactory.eINSTANCE.createContacto();
				contacto = crearContacto(padre.getCampos(), contacto);
				contacto.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					contacto = (Contacto) crearHijos(contacto, nivel, caminoActual, orderSize, hijos);
				}
				return contacto;
			//Que
			case "comunicacion":
				Comunicacion comunicacion = ResultqueFactory.eINSTANCE.createComunicacion();
				comunicacion = crearComunicacion(padre.getCampos(), comunicacion);
				comunicacion.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					comunicacion = (Comunicacion) crearHijos(comunicacion, nivel, caminoActual, orderSize, hijos);
				}
				return comunicacion;
				
			case "documento":
				Documento documento = ResultqueFactory.eINSTANCE.createDocumento();
				documento = crearDocumento(padre.getCampos(), documento);
				documento.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					documento = (Documento) crearHijos(documento, nivel, caminoActual, orderSize, hijos);
				}
				return documento;	
			//Donde	
			case "deposito":
				Deposito deposito = ResultdondeFactory.eINSTANCE.createDeposito();
				deposito = crearDeposito(padre.getCampos(), deposito);
				deposito.setKey(padre.getId());
				if( nivel<orderSize){
					nivel++;
					deposito = (Deposito) crearHijos(deposito, nivel, caminoActual, orderSize, hijos);
				}
				return deposito;
				
			case "disco":
				Disco disco = ResultdondeFactory.eINSTANCE.createDisco();
				disco = crearDisco(padre.getCampos(), disco);
				disco.setKey(padre.getId());
				if( nivel<orderSize){
					nivel++;
					disco = (Disco) crearHijos(disco, nivel, caminoActual, orderSize, hijos);
				}
				return disco;
				
			case "armario":
				Armario armario = ResultdondeFactory.eINSTANCE.createArmario();
				armario = crearArmario(padre.getCampos(), armario);
				armario.setKey(padre.getId());
				if( nivel<orderSize){
					nivel++;
					armario = (Armario) crearHijos(armario, nivel, caminoActual, orderSize, hijos);
				}
				return armario;
			//Como
			case "actividadproceso":
				ActividadProceso actividad = ResultcomoFactory.eINSTANCE.createActividadProceso();
				actividad = crearActividad(padre.getCampos(), actividad);
				actividad.setKey(padre.getId());
				if( nivel<orderSize){
					nivel++;
					actividad = (ActividadProceso) crearHijos(actividad, nivel, caminoActual, orderSize, hijos);
				}
				return actividad;
			
			case "instanciaproceso":
				InstanciaProceso proceso = ResultcomoFactory.eINSTANCE.createInstanciaProceso();
				proceso = crearProceso(padre.getCampos(), proceso);
				proceso.setKey(padre.getId());
				if( nivel<orderSize){
					nivel++;
					proceso = (InstanciaProceso) crearHijos(proceso, nivel, caminoActual, orderSize, hijos);
				}
				return proceso;	

		default:
			return null;
		}
		
		
	}

	/**
	 * Crea los hijos
	 * @param nivel
	 * @param caminoActual
	 * @param orderSize
	 * @param hijos
	 */
	private ElementoModeloResultado crearHijos(ElementoModeloResultado padre, int nivel, String caminoActual, int orderSize,
			ArrayList<Hijo> hijos) {
		// TODO Auto-generated method stub
		String caminoTemporal = caminoActual;
		for(Hijo hijo : hijos){
			
			caminoActual += "-"+hijo.getId();
			if(hijo.getCamino().equals(caminoActual)){
				
				ElementoModeloResultado elemento = crearElementoHijo(hijo, nivel, orderSize, caminoActual, hijos);
				elemento.setElementoModeloResultado(padre);
				caminoActual =caminoTemporal;
				
			}else{
				caminoActual = caminoTemporal;
			}
		}
		return padre;
	}

	/**
	 * se crea un elemento Hijo
	 * @param nivel
	 * @param orderSize
	 * @param caminoActual
	 * @return
	 */
	private ElementoModeloResultado crearElementoHijo(Hijo hijo, int nivel, int orderSize,
			String caminoActual, ArrayList<Hijo> hijos) {
		
		switch (hijo.getElemento()) {
		//Quien
		case "actor":
			Actor actor = ResultquienFactory.eINSTANCE.createActor();
			actor = crearActor(hijo.getCampos(), actor);
			actor.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel++;
				actor = (Actor) crearHijos(actor, nivel, caminoActual, orderSize, hijos);
			}
			return actor;
			
		case "rol":
			Rol rol = ResultquienFactory.eINSTANCE.createRol();
			rol = crearRol(hijo.getCampos(), rol);
			rol.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel ++;
				rol = (Rol) crearHijos(rol, nivel, caminoActual, orderSize, hijos);
			}
			return rol;
		
		case "unidadorganizacional":
			UnidadOrganizacional unidadOrganizacional = ResultquienFactory.eINSTANCE.createUnidadOrganizacional();
			unidadOrganizacional = crearUnidadOrganizacional(hijo.getCampos(), unidadOrganizacional);
			unidadOrganizacional.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel ++;
				unidadOrganizacional = (UnidadOrganizacional) crearHijos(unidadOrganizacional, nivel, caminoActual, orderSize, hijos);
			}
			return unidadOrganizacional;
		
		case "contacto":
			Contacto contacto = ResultquienFactory.eINSTANCE.createContacto();
			contacto = crearContacto(hijo.getCampos(), contacto);
			contacto.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel ++;
				contacto = (Contacto) crearHijos(contacto, nivel, caminoActual, orderSize, hijos);
			}
			return contacto;
		//Que
		case "comunicacion":
			Comunicacion comunicacion = ResultqueFactory.eINSTANCE.createComunicacion();
			comunicacion = crearComunicacion(hijo.getCampos(), comunicacion);
			comunicacion.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel ++;
				comunicacion = (Comunicacion) crearHijos(comunicacion, nivel, caminoActual, orderSize, hijos);
			}
			return comunicacion;
			
		case "documento":
			Documento documento = ResultqueFactory.eINSTANCE.createDocumento();
			documento = crearDocumento(hijo.getCampos(), documento);
			documento.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel ++;
				documento = (Documento) crearHijos(documento, nivel, caminoActual, orderSize, hijos);
			}
			return documento;	
		//Donde	
		case "deposito":
			Deposito deposito = ResultdondeFactory.eINSTANCE.createDeposito();
			deposito = crearDeposito(hijo.getCampos(), deposito);
			deposito.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel++;
				deposito = (Deposito) crearHijos(deposito, nivel, caminoActual, orderSize, hijos);
			}
			return deposito;
			
		case "disco":
			Disco disco = ResultdondeFactory.eINSTANCE.createDisco();
			disco = crearDisco(hijo.getCampos(), disco);
			disco.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel++;
				disco = (Disco) crearHijos(disco, nivel, caminoActual, orderSize, hijos);
			}
			return disco;
			
		case "armario":
			Armario armario = ResultdondeFactory.eINSTANCE.createArmario();
			armario = crearArmario(hijo.getCampos(), armario);
			armario.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel++;
				armario = (Armario) crearHijos(armario, nivel, caminoActual, orderSize, hijos);
			}
			return armario;
		//Como
		case "actividadproceso":
			ActividadProceso actividad = ResultcomoFactory.eINSTANCE.createActividadProceso();
			actividad = crearActividad(hijo.getCampos(), actividad);
			actividad.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel++;
				actividad = (ActividadProceso) crearHijos(actividad, nivel, caminoActual, orderSize, hijos);
			}
			return actividad;
		
		case "instanciaproceso":
			InstanciaProceso proceso = ResultcomoFactory.eINSTANCE.createInstanciaProceso();
			proceso = crearProceso(hijo.getCampos(), proceso);
			proceso.setKey(hijo.getId());
			if( nivel<orderSize){
				nivel++;
				proceso = (InstanciaProceso) crearHijos(proceso, nivel, caminoActual, orderSize, hijos);
			}
			return proceso;	
			
		default:
			return null;
		}
	}
	
	//CREACION DE LOS ELEMENTOS
	
	
	/**
	 * Crea el armario
	 * @param campos
	 * @param armario
	 * @return
	 */
	private Armario crearArmario(ArrayList<String[]> campos, Armario armario) {
		// TODO Auto-generated method stub
		for(String[] campo: campos){
			
			if(campo[0].equals("idArmario")){
				armario.setIdArmario(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				armario.setDescripcion(campo[1]);
			}
		}
		return armario;
	}

	private Disco crearDisco(ArrayList<String[]> campos, Disco disco) {
		// TODO Auto-generated method stub
		for(String[] campo: campos){
			
			if(campo[0].equals("idDisco")){
				disco.setIdDisco(campo[1]);
			}
			if(campo[0].equals("referencia")){
				disco.setReferencia(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				disco.setDescripcion(campo[1]);
			}
		}
		return disco;
	}

	private Deposito crearDeposito(ArrayList<String[]> campos, Deposito deposito) {
		// TODO Auto-generated method stub
		for(String[] campo: campos){
			
			if(campo[0].equals("idDeposito")){
				deposito.setIdDeposito(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				deposito.setDescripcion(campo[1]);
			}
		}
		return deposito;
	}

	private Documento crearDocumento(ArrayList<String[]> campos,
			Documento documento) {
		for(String[] campo: campos){
		
			if(campo[0].equals("idComunicacion")){
				documento.setIdDocumento(campo[1]);
			}
			if(campo[0].equals("titulo")){
				documento.setTitulo(campo[1]);
			}
			if(campo[0].equals("edicion")){
				documento.setEdicion(campo[1]);
			}
			if(campo[0].equals("vigencia")){
				documento.setVigencia(campo[1]);
			}
			if(campo[0].equals("estado")){
				documento.setEstado(campo[1]);
			}
			if(campo[0].equals("fechaCreacion")){
				documento.setFechaCreacion(campo[1]);
			}
			if(campo[0].equals("anexo")){
				documento.setAnexo(campo[1]);
			}
			if(campo[0].equals("tipo")){
				documento.setTipo(campo[1]);
			}
			if(campo[0].equals("comentarios")){
				documento.setComentarios(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				documento.setComentarios(campo[1]);
			}
		}
		return documento;
	}

	private Comunicacion crearComunicacion(ArrayList<String[]> campos,
			Comunicacion comunicacion) {
		// TODO Auto-generated method stub
		for(String[] campo: campos){
			
			if(campo[0].equals("idComunicacion")){
				comunicacion.setIdComunicacion(campo[1]);
			}
			if(campo[0].equals("asunto")){
				comunicacion.setAsunto(campo[1]);
			}
		}
		return comunicacion;
	}

	private Contacto crearContacto(ArrayList<String[]> campos, 
				Contacto contacto) {
		for(String[] campo: campos){
			
			if(campo[0].equals("idContacto")){
				contacto.setIdContacto(campo[1]);
			}
			if(campo[0].equals("nombre")){
				contacto.setNombre(campo[1]);
			}
			if(campo[0].equals("email")){
				contacto.setUsername(campo[1]);
			}
			if(campo[0].equals("username")){
				contacto.setUsername(campo[1]);
			}
			if(campo[0].equals("password")){
				contacto.setPassword(campo[1]);
			}
			if(campo[0].equals("telefono")){
				contacto.setTelefono(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				contacto.setDescripcion(campo[1]);
			}
		}
		return contacto;
	}

	private UnidadOrganizacional crearUnidadOrganizacional(
			ArrayList<String[]> campos,
			UnidadOrganizacional unidadOrganizacional) {
		for(String[] campo: campos){
			
			if(campo[0].equals("idUnidadOrganizacional")){
				unidadOrganizacional.setIdUnidadOrganizacional(campo[1]);
			}
			if(campo[0].equals("nombre")){
				unidadOrganizacional.setNombre(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				unidadOrganizacional.setDescripcion(campo[1]);
			}
			
		}
		
		return unidadOrganizacional;
	}

	private Rol crearRol(ArrayList<String[]> campos, Rol rol) {
		// TODO Auto-generated method stub
		for(String[] campo: campos){
			
			if(campo[0].equals("idRol")){
				rol.setIdRol(campo[1]);
			}
			if(campo[0].equals("nombre")){
				rol.setNombre(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				rol.setDescripcion(campo[1]);
			}
		}
		return rol;
	}

	/**
	 * Crea el proceso
	 * @param campos
	 * @param proceso
	 * @return
	 */
	private InstanciaProceso crearProceso(ArrayList<String[]> campos,
			InstanciaProceso proceso) {
		// TODO Auto-generated method stub
		for(String[] campo: campos){
			
			if(campo[0].equals("idInstanciaProceso")){
				proceso.setIdInstanciaProceso(campo[1]);
			}
			if(campo[0].equals("nombre")){
				proceso.setNombre(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				proceso.setDescripcion(campo[1]);
			}
			
			
		}
		return proceso;
	}

	/**
	 * Crea la actividad
	 * @param campos
	 * @param actividad
	 * @return
	 */
	private ActividadProceso crearActividad(ArrayList<String[]> campos,
			ActividadProceso actividad) {
		// TODO Auto-generated method stub
		for(String[] campo: campos){
			
			if(campo[0].equals("idActividadProceso")){
				actividad.setIdActividadProceso(campo[1]);
			}
			if(campo[0].equals("nombre")){
				actividad.setNombre(campo[1]);
			}
			if(campo[0].equals("descripcion")){
				actividad.setDescripcion(campo[1]);
			}
			if(campo[0].equals("fechaInicio")){
				actividad.setFechaInicio(campo[1]);
			}
			if(campo[0].equals("fechaFin")){
				actividad.setFechaFin(campo[1]);
			}
			
		}
		return actividad;
	}

	/**
	 * Crea el Actor
	 * @param campos
	 * @param actor
	 * @return
	 */
	private Actor crearActor(ArrayList<String[]> campos, Actor actor) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			
			
			if(campoTemp[0].equals("idActor")){
				actor.setIdActor(campoTemp[1]);
			}
			if(campoTemp[0].equals("nombre")){
				actor.setNombre(campoTemp[1]);
			}
			if(campoTemp[0].equals("apellido")){
				actor.setApellido(campoTemp[1]);
			}
			if(campoTemp[0].equals("email")){
				actor.setEmail(campoTemp[1]);
			}
			if(campoTemp[0].equals("descripcion")){
				actor.setDescripcion(campoTemp[1]);
			}
		}
		return actor;
	}

	

}
