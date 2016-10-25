package gestionmodelosconsultas.compilador;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.model.ViewModel;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetFactory;
import gestionmodelosconsultas.produccion.GeneradorElementoResultado;
import gestionmodelosconsultas.world.Hijo;
import gestionmodelosconsultas.world.Padre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.mysql.jdbc.ResultSetMetaData;

public class CompiladorResulsetResultado {

	/**
	 * Este metodo se encarga de generar el resultado en la produccion a partir
	 * de la informacion dada en las viewModel
	 * @param rs
	 * @param modelFactory
	 * @param idConsulta
	 * @param campos
	 */
	public void generarResultado(ResultSet rs, ModelFactory modelFactory,
			ArrayList<String> idConsulta, ArrayList<String> campos, ArrayList<String> entidades) {
		// TODO Auto-generated method stub
		if(!modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListResultado().isEmpty()){
			modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListResultado().clear();
		}
		for (int i = 0; i < modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size(); i++) {
			
			if(modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) instanceof ViewModel){
				
				if(comprobarViewModel((ViewModel)modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i), entidades)){

					ArrayList<String[]> order = new ArrayList<String[]>();
					order = obtenerOrder((ViewModel)modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i));
					if(order!=null){
						
						crearResultado(order, modelFactory, campos, entidades, idConsulta, rs, modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i).getNombre() );
						
					}else{
						System.err.println("El order esta mal definido");
					}
					
				}else{
					modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListResultado().clear();
					modelFactory.salvar();
					System.err.println("El viewModel "+modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i).getNombre()+"  no coincide con la Proyeccion");
				}
			}
		}
		
	}

	/**
	 * Crea el resultado en la Produccion segun el viewModel
	 * @param order
	 * @param modelFactory
	 * @param campos
	 * @param entidades
	 * @param idConsulta
	 * @param rs
	 */
	private void crearResultado(ArrayList<String[]> order,
			ModelFactory modelFactory, ArrayList<String> campos,
			ArrayList<String> entidades, ArrayList<String> idConsulta,
			ResultSet rs, String nombreViewModel) {
		
		for (int j = 0; j < order.size(); j++) {//algoritmo de ordenacion Burbuja 
			
			for (int k = 0; k < order.size()-1; k++) { 
				if(Integer.parseInt(order.get(k)[0])>Integer.parseInt(order.get(k+1)[0])){ 
					String[] orderMayor= order.get(k);
					order.set(k, order.get(k+1)); 
					order.set(k+1, orderMayor); 
				} 
			} 
		}
		
		ArrayList<String[]> newOrder = crearNewOrder(order,idConsulta);
		
		// TODO Auto-generated method stub
		try {
			if(rs.next()){
				ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
				HashMap<String, Padre> padresMap = new HashMap<String, Padre>();
				ArrayList<Hijo> hijosMap = new ArrayList<Hijo>();
				ArrayList<String> caminos = new ArrayList<String>();
				ArrayList<String> caminoValido = new ArrayList<String>();
					for (int i = 0; i <newOrder.size(); i++) {
						
						do{
							if(i==0){
								caminos.add(rs.getString(newOrder.get(i)[1]));
								//Crear Padre
								if(!padresMap.containsKey(rs.getString(newOrder.get(i)[1]))){
									
									ArrayList<String[]> camposPadre = obtenerCamposPadre(rs, order.get(i), campos, metaData);
									Padre padre = new Padre(rs.getString(newOrder.get(i)[1]), order.get(i)[1], camposPadre);
									padresMap.put(padre.getId(), padre);
								}
							}else{
								//Crear Hijos
								
									caminos.set(rs.getRow()-1, caminos.get(rs.getRow()-1)+"-"+rs.getString(newOrder.get(i)[1]));
									int band = 0;
									for(String caminoTemp: caminoValido){
										
										if(caminos.get(rs.getRow()-1).equals(caminoTemp)){
											band=1;
										}
									}
									if(band==0){
										caminoValido.add(caminos.get(rs.getRow()-1));
										ArrayList<String[]> camposHijo = obtenerCamposPadre(rs, order.get(i), campos, metaData);
										Hijo hijo = new Hijo(rs.getString(newOrder.get(i)[1]), order.get(i)[1], rs.getString(newOrder.get(i-1)[1]), camposHijo, caminos.get(rs.getRow()-1), i);
										hijosMap.add(hijo);
									}
									
								
							}
							
						}
						while(rs.next());
						
						rs.first();
					}
					if(rs.getRow()==1){
						rs.previous();
					}

					
					Resultado resultado = ResultsetFactory.eINSTANCE.createResultado();
					resultado.setNombre(nombreViewModel);
					GeneradorElementoResultado  generador = new GeneradorElementoResultado();
					resultado = generador.crearResultado(resultado, padresMap, hijosMap, newOrder.size());
					modelFactory.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListResultado().add(resultado);
					modelFactory.salvar();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Obtiene los campos del elemento Padre
	 * @param rs
	 * @param order
	 * @param campos
	 * @return
	 */
	private ArrayList<String[]> obtenerCamposPadre(ResultSet rs,
			String[] order, ArrayList<String> campos, ResultSetMetaData metaData) {
		// TODO Auto-generated method stub
		ArrayList<String[]> camposPadre = new ArrayList<String[]>();
		try {
			
			int columnas = metaData.getColumnCount();
			for (int i = 1; i <= columnas; i++) {
				
				for (int j = 0; j < campos.size(); j++) {
					
					if((metaData.getTableName(i)+"."+metaData.getColumnName(i)).equals(campos.get(j))&&metaData.getTableName(i).equals(order[1])){
						String[] camposArray= new String[2];
						camposArray[0] = metaData.getColumnName(i);
						camposArray[1] = rs.getString(i);
						camposPadre.add(camposArray);
						break;
					}
				}
			}
			return camposPadre;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return camposPadre;
	}

	/**
	 * Crea el order definitivo
	 * @param order
	 * @param idConsulta
	 * @return
	 */
	private ArrayList<String[]> crearNewOrder(ArrayList<String[]> order,
			ArrayList<String> idConsulta) {
		// TODO Auto-generated method stub
		
		for (int j = 0; j < order.size(); j++) {//algoritmo de ordenacion Burbuja 
			
			for (int k = 0; k < order.size()-1; k++) { 
				if(Integer.parseInt(order.get(k)[0])>Integer.parseInt(order.get(k+1)[0])){ 
					String[] orderMayor= order.get(k);
					order.set(k, order.get(k+1)); 
					order.set(k+1, orderMayor); 
				} 
			} 
		}
		ArrayList<String[]> newOrder = new ArrayList<String[]>();
		for(String[] orderTemp : order){
			
			for(String idTemp : idConsulta){
				
				String[] idTempArray = idTemp.split("[.]");
				if(orderTemp[1].equals(idTempArray[0])){
					String newOrderArray[] = new String[2];
					newOrderArray[0]= orderTemp[0];
					newOrderArray[1]= idTemp;
					newOrder.add(newOrderArray);
					break;
				}
			}
		}
		return newOrder;
	}

	/**
	 * Obtiene el order de la view model para el resultado
	 * @param modelFactory
	 * @return
	 */
	private ArrayList<String[]> obtenerOrder(ViewModel viewModel) {
		// TODO Auto-generated method stub
		//comprobar order
				ArrayList<String[]>  order = new ArrayList<String[]>();
				for (int i = 0; i < viewModel.getListElementoConsulta().size(); i++) {
					
					for (int j = 0; j < viewModel.getListElementoConsulta().size(); j++) {
						
						if(viewModel.getListElementoConsulta().get(i).getOrder()==(j+1)){
							String[] orderTemp = new String[2];
							orderTemp[0] = ""+(j+1);
							orderTemp[1] = viewModel.getListElementoConsulta().get(i).getClass().getSimpleName().toLowerCase().substring(0,viewModel.getListElementoConsulta().get(i).getClass().getSimpleName().length()-4);
							order.add(orderTemp);
						}
					}
				}
				if(order.size()==viewModel.getListElementoConsulta().size()){
					
					return order;
				}

		return null;
	}

	/**
	 * Comprueba si el viewmodel posee elementos que coinciden con la proyeccion
	 * @param eaDiagram
	 * @param entidades
	 * @return
	 */
	private boolean comprobarViewModel(ViewModel viewModel,
			ArrayList<String> entidades) {
		// TODO Auto-generated method stub
		//buscamos elementos repetidos en view model
		if(viewModel.getListElementoConsulta().size()==0){
			System.err.println("El viewModel "+viewModel.getNombre()+" esta vacio");
			return false;
		}
		for (int i = 0; i < viewModel.getListElementoConsulta().size(); i++) {
			int cont=0;
			for (int j = 0; j < viewModel.getListElementoConsulta().size(); j++) {
				
				if(viewModel.getListElementoConsulta().get(i).getClass().getSimpleName().equals(viewModel.getListElementoConsulta().get(j).getClass().getSimpleName())){
					cont++;
					if(cont>1){
						
						System.err.println("El viewModel tiene Elementos Repetidos");
						return false;
					}
				}
			}
		}
		//comparamos elementos con las entidades de proyeccion
		
		for (int i = 0; i < viewModel.getListElementoConsulta().size(); i++) {
			int bandera = 0;
			for (int j = 0; j < entidades.size(); j++) {
				
				if(viewModel.getListElementoConsulta().get(i).getClass().getSimpleName().toLowerCase().substring(0,viewModel.getListElementoConsulta().get(i).getClass().getSimpleName().toLowerCase().length()-4).equals(entidades.get(j))){
					bandera = 1;
					break;
				}
				
			}
			if(bandera == 0){
				return false;
			}
		}
		
		
		return true;
	}

	
}
