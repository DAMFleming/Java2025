package ejemplos;

public class Arrays {

	public static void main(String[] args) {
		int [][] m1 = new int[10][];
		System.out.println(m1[0]);
		m1[0] = new int[100];
		m1[1] = new int[46];
		int [][] m2 = new int[][]{{51, 23}, {31, 47}};
		int [][] m3 = {{51, 23}, {31, 47}};
		int [][] m4 = {null, null};
		
		int [] v = m2[0];
		for (int i=0; i<v.length; i++)
			System.out.println(v[i]);
	}

}
