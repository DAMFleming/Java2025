package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class MetodosOrdenacion {

	static void insercionDirecta(long [] v) {
		for (int i=1; i<v.length; i++ ) {
			int j=0;
			while (j < i && v[i] >= v[j])
				j++;
			if (j < i) {
				long aux = v[i];
				for (int k=i-1; k>=j; k--)
					v[k+1] = v[k];
				v[j] = aux;
			}
		}
	}
		
	static void seleccionDirecta(long [] v) {
		
	}

	static void intercambioDirecto(long [] v) {
		
	}
	
	
	public static void main(String[] args) {
		long [] v = {44, 55, 12, 42, 94, 18, 6, 67};
		insercionDirecta(v);
		System.out.println(Arrays.toString(v));
		
		Random r = new Random();
		long [] v2 = new long[1000000];
		for (int i=0; i<v2.length; i++)
			v2[i] = r.nextLong();
		System.out.println("Ordenando");
		long t0 = System.nanoTime();
//		insercionDirecta(v2);
		Arrays.sort(v2);
		long t1 = System.nanoTime();
		System.out.println(t1 - t0);
	}
}
