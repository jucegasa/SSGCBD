package gestionmodelosconsultas.world;

import java.util.ArrayList;

public class Hijo {

	String id;
	String elemento;
	String idPadre;
	ArrayList<String[]> campos;
	String camino;
	int nivel;
	public Hijo(String id, String elemento, String idPadre,
			ArrayList<String[]> campos, String camino, int nivel) {
		super();
		this.id = id;
		this.elemento = elemento;
		this.idPadre = idPadre;
		this.campos = campos;
		this.camino = camino;
		this.nivel = nivel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public String getIdPadre() {
		return idPadre;
	}
	public void setIdPadre(String idPadre) {
		this.idPadre = idPadre;
	}
	public ArrayList<String[]> getCampos() {
		return campos;
	}
	public void setCampos(ArrayList<String[]> campos) {
		this.campos = campos;
	}
	public String getCamino() {
		return camino;
	}
	public void setCamino(String camino) {
		this.camino = camino;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
}
