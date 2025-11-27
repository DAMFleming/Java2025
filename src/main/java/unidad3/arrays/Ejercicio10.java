package unidad3.arrays;

import java.util.Random;

public class Ejercicio10 {

	public static void main(String[] args) {
		Random r = new Random();
		int [][] m = new int[r.nextInt(19) + 2][r.nextInt(19) + 2];
		for (int i=0; i<m.length; i++)
			for (int j=0; j<m[i].length; j++)
				m[i][j] = r.nextInt(100);
		int [] sumaFilas = sumaFilas(m);
		int [] sumaColumnas = sumaColumnas(m);
		if (sumaFilas != null && sumaColumnas != null) {
			for (int i=0; i<m.length; i++) {
				for (int j=0; j<m[i].length; j++)
					System.out.printf(" %2d  ", m[i][j]);
				System.out.printf("= %d\n", sumaFilas[i]);
			}
			System.out.println("-".repeat(sumaColumnas.length * 5));
			for (int i=0; i<sumaColumnas.length; i++)
				System.out.printf("%3d  ", sumaColumnas[i]);
		}
	}
	
	static int [] sumaFilas(int [][] m) {
		if (m.length > 0) {
			int [] v = new int [m.length];
			for (int i=0; i<m.length; i++) {
				int suma = 0;
				for (int j=0; j<m[i].length; j++)
					suma += m[i][j];
				v[i] = suma;
			}
			return v;
		}
		return null;
	}
	
	static int [] sumaColumnas(int[][] m) {
		if (m.length > 0) {
			int [] v = new int[m[0].length];
			for (int j=0; j<m[0].length; j++) {
				int suma = 0;
				for (int i=0; i<m.length; i++)
					suma += m[i][j];
				v[j] = suma;
			}
			return v;
		}
		return null;
	}

}
