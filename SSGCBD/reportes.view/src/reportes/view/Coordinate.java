package reportes.view;

/**
 * Clase que sirve para almacenar las dimenciones de 
 * los componentes de la herramienta Dataform
 * 
 * @author Julio Cesar Garcia Sabogal
 * @author Fabio Stiven Oquendo Soler
 * @author Cristian Daniel Palechor Sepulveda
 */
class Coordinate implements Comparable<Coordinate> {
	
	//--------------------------------------------------------
	//Atributos
	//--------------------------------------------------------
	
	/**
	 * Valor "x" de la coordenada
	 */
     protected int x;
	
	/**
	 * Valor "y" de la coordenada
	 */
	protected int y;
	
	
	//--------------------------------------------------------
	//Constructor
	//--------------------------------------------------------
	
	/**
	 * Contructor de la clase Coordinate
	 * @param x valor "x" de la coordenada
	 * @param y valor "y" de la coordenada
	 */
	public Coordinate(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	//--------------------------------------------------------
	//Metodos
	//--------------------------------------------------------
	
	/**
	 * Metodo palra obtener el valor "x" de la coordenada
	 * @return una variable de tipo entero con el valor "x" de la coordenada
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Metodo que cambia el valor "x" de la coordenada
	 * @param x una variable de tipo entero con el valor que de le asignara a "x"
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Metodo palra obtener el valor "y" de la coordenada
	 * @return una variable de tipo entero con el valor "y" de la coordenada
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Metodo que cambia el valor "y" de la coordenada
	 * @param y una variable de tipo entero con el valor que de le asignara a "y"
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Metodo que determina si una coordenada es mayor menor o igual que otra
	 */
	public int compareTo(Coordinate c) {
		if(x > c.x){
			return 1;
		}
		else if (x == c.x){
			if(y > c.y)
				return 1;
			else if(y == c.y)
				return 0;
		}
		return -1;
	}
}