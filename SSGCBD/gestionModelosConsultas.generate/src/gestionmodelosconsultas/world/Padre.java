package gestionmodelosconsultas.world;

import java.util.ArrayList;

public class Padre {

	String id;
	String elemento;
	ArrayList<String[]> campos;
	
	public Padre(String id, String elemento, ArrayList<String[]> campos) {
		super();
		this.id = id;
		this.elemento = elemento;
		this.campos = campos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<String[]> getCampos() {
		return campos;
	}

	public void setCampos(ArrayList<String[]> campos) {
		this.campos = campos;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	
	
}
