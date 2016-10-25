package pruebaInterfaz;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = convertToInt("BR");
		System.out.println(r);
	}
	
	public static int convertToInt(String s){
		int res =0;
		int m = s.length()-1;
		int e=0;
		for(int i=m;i>=0;i--){
			res += ( (s.charAt(i) - 64))*pow(26,e);
			e++;
		}
		return res;
	}
	
	public static  int pow(int b,int e){
		int res =1;
		
		for(int i=0;i<e;i++){
			res*=b;
		}
		return res;
	}
}
