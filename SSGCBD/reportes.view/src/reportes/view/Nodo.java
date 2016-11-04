package reportes.view;

class Nodo implements Comparable<Nodo> {

	int x,y;
	public Nodo(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int compareTo(Nodo n) {
		if(x>n.x){
			return 1;
		}
		else if (x==n.x){
			if(y>n.y)
				return 1;
			else if(y==n.y)
				return 0;
		}
		return -1;
	}
}