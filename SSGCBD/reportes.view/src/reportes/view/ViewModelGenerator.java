package reportes.view;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;

import gestionmodelosconsultas.modeloconsultas.como.ActividadProceso;
import gestionmodelosconsultas.modeloconsultas.como.ComoFactory;
import gestionmodelosconsultas.modeloconsultas.como.InstanciaProceso;
import gestionmodelosconsultas.modeloconsultas.cuando.CuandoFactory;
import gestionmodelosconsultas.modeloconsultas.cuando.Fecha;
import gestionmodelosconsultas.modeloconsultas.donde.Armario;
import gestionmodelosconsultas.modeloconsultas.donde.Deposito;
import gestionmodelosconsultas.modeloconsultas.donde.Disco;
import gestionmodelosconsultas.modeloconsultas.donde.DondeFactory;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;
import gestionmodelosconsultas.modeloconsultas.que.Comunicacion;
import gestionmodelosconsultas.modeloconsultas.que.Documento;
import gestionmodelosconsultas.modeloconsultas.que.QueFactory;
import gestionmodelosconsultas.modeloconsultas.quien.Actor;
import gestionmodelosconsultas.modeloconsultas.quien.Contacto;
import gestionmodelosconsultas.modeloconsultas.quien.Quien;
import gestionmodelosconsultas.modeloconsultas.quien.QuienFactory;
import gestionmodelosconsultas.modeloconsultas.quien.Rol;
import gestionmodelosconsultas.modeloconsultas.quien.UnidadOrganizacional;
import tooldataform.ModelFactory;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.RelacionDataForm;
import tooldataform.formmodel.concreta.impl.ContainerImpl;
import tooldataform.formmodel.concreta.impl.ContainmentImpl;

public class ViewModelGenerator {
	
	ModelFactory modelFactoryDF = null;
	gestionmodelosconsultas.ModelFactory modelFactoryMC = null;
	whoownme.model.ModelFactoryModel modelFactoryModel = whoownme.model.ModelFactoryModel.getInstance();
	
	DataForm_Diagram dfDiagram;
	
	EList<RelacionDataForm> relations;
	
	ArrayList<String> namesViewModel;
	
	HashMap<String , ElementoConsulta> elementosConsulta;
	
	public ViewModelGenerator(ArrayList<String> namesViewModel) {

		
		this.namesViewModel = new ArrayList<String>();
		elementosConsulta  = new HashMap<String, ElementoConsulta>();
		
	}
	
	public void generateViewModel(){
		initMap();
		inicializarMC();
		createViewModel();
		JOptionPane.showMessageDialog(null, "Se genero ViewModel");
	}
	public String getNameEntity(String rol) {	
		return rol.substring(4, rol.length());
	}
	
	public void exploreRelations() {
		
		RelacionDataForm relation = null;
		String bRol;
		for (int i = 0; i < relations.size(); i++) {
			relation = relations.get(i);
			if(relation.getSource().get(0) instanceof ContainerImpl && relation instanceof ContainmentImpl) {
				break;
			}
		}
		
		while (relation != null) {
			
			bRol = getNameEntity(relation.getBRol());
			relation = null;
			
			for (int i = 0; i < relations.size(); i++) {
				
				if(relations.get(i).getARol().equals("ownedBy"+bRol) && relations.get(i) instanceof ContainmentImpl) {
					relation = relations.get(i);
				}
			}
			
			namesViewModel.add(bRol);
		}
	}
	
	public void inicializarMC() {
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/GestionConsultas/modelos/produccion.gestionmodelosconsultas");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(java.util.Collections.EMPTY_MAP);
			modelFactoryMC = (gestionmodelosconsultas.ModelFactory) resource.getContents().get(0);
		} catch (java.io.IOException e) {
			
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createViewModel() {
		
		EList<EADiagram> listaViewModel = modelFactoryMC.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram();
		EADiagram vm = gestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createViewModel();;
		
		for (int i = 0; i < namesViewModel.size(); i++) {	
			ElementoConsulta elementoConsulta = elementosConsulta.get(  namesViewModel.get(i) );
			elementoConsulta.setOrder(i+1);
			vm.getListElementoConsulta().add(elementoConsulta);		
		}
				
		for (int i = 0; i < namesViewModel.size()-1; i++) {
			Relacion r = gestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createRelacion();
			r.setOrder(i+1);
			r.setSource(vm.getListElementoConsulta().get(i));
			r.setTarget(vm.getListElementoConsulta().get(i+1));
			vm.getListRelacion().add(r);
		}
		
		listaViewModel.add(vm);
		modelFactoryMC.salvar();
	}
	
	
	void initMap(){
		
		UnidadOrganizacional unidadOrganizacional = QuienFactory.eINSTANCE.createUnidadOrganizacional();
		elementosConsulta.put("UnidadOrganizacional", unidadOrganizacional);
		
		Actor actor = QuienFactory.eINSTANCE.createActor();
		elementosConsulta.put("Actor", actor);
		
		Rol rol = QuienFactory.eINSTANCE.createRol();
		elementosConsulta.put("Rol", rol);
		
		Contacto contacto = QuienFactory.eINSTANCE.createContacto();
		elementosConsulta.put("Contacto", contacto);
		
		Quien quien = QuienFactory.eINSTANCE.createQuien();
		elementosConsulta.put("Quien", quien);
		
		Documento documento = QueFactory.eINSTANCE.createDocumento();
		elementosConsulta.put("Documento", documento);
		
		Comunicacion comunicacion = QueFactory.eINSTANCE.createComunicacion();
		elementosConsulta.put("Comunicacion", comunicacion);
		
		ActividadProceso actividad = ComoFactory.eINSTANCE.createActividadProceso();
		elementosConsulta.put("Actividad", actividad);
		
		InstanciaProceso instancia = ComoFactory.eINSTANCE.createInstanciaProceso();
		elementosConsulta.put("Instancia", instancia);
		
		Deposito deposito = DondeFactory.eINSTANCE.createDeposito();
		elementosConsulta.put("Deposito", deposito);
		
		Disco disco = DondeFactory.eINSTANCE.createDisco();
		elementosConsulta.put("Disco", disco);
		
		Armario armario = DondeFactory.eINSTANCE.createArmario();
		elementosConsulta.put("Armario", armario);
		
		Fecha fecha = CuandoFactory.eINSTANCE.createFecha();
		elementosConsulta.put("Fecha", fecha);
	}
}
