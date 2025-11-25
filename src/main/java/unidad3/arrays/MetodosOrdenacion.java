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
		int aux_j;
		long min;
		for(int i=0; i<v.length-1; i++) {
			aux_j=i;
			for(int j=i;j<v.length; j++)
				if(v[j]<v[aux_j]) 
					aux_j=j;
				
			if(aux_j!=i) {
				min= v[aux_j];
				v[aux_j]= v[i];
				v[i]= min;
			}
			
		}
	}

	static void intercambioDirecto(long [] v) {
		for(int indice = 0; indice < v.length - 1; indice++) {
			for(int b = v.length - 1; b > indice; b--) {
				if (v[b] < v[b -1]) {
					long g = v[b];
					v[b] = v[b - 1];
					v[b - 1] = g;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
//		long [] v = {44, 55, 12, 42, 94, 18, 6, 67};
//		intercambioDirecto(v);
//		System.out.println(Arrays.toString(v));
		
		Random r = new Random();
		long [] v = new long[100000];
		for (int i=0; i<v.length; i++)
			v[i] = r.nextLong();
		
		long [] vaux;
		long t0, t1;
		vaux = Arrays.copyOf(v, 100000);
		System.out.println("inserción directa");
		t0 = System.nanoTime();
		insercionDirecta(vaux);
		t1 = System.nanoTime();
		System.out.println(t1 - t0);
		
		vaux = Arrays.copyOf(v, 100000);
		System.out.println("selección directa");
		t0 = System.nanoTime();
		seleccionDirecta(vaux);
		t1 = System.nanoTime();
		System.out.println(t1 - t0);
		
		vaux = Arrays.copyOf(v, 100000);
		System.out.println("intercambio directo");
		t0 = System.nanoTime();
		intercambioDirecto(vaux);
		t1 = System.nanoTime();
		System.out.println(t1 - t0);
		
		vaux = Arrays.copyOf(v, 100000);
		System.out.println("Arrays.sort");
		t0 = System.nanoTime();
		Arrays.sort(vaux);
		t1 = System.nanoTime();
		System.out.println(t1 - t0);
		
		vaux = Arrays.copyOf(v, 100000);
		System.out.println("Arrays.parallelSort");
		t0 = System.nanoTime();
		Arrays.parallelSort(vaux);
		t1 = System.nanoTime();
		System.out.println(t1 - t0);
		
	}
}
