package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * Programa que realice las tareas siguientes:
 * 
 *     a) Crear un vector de números enteros de un tamaño aleatorio
 *        comprendido entre 10 y 50 elementos.
 *     b) Llenar el vector con números aleatorios comprendidos entre
 *        -100 y 100 sin repetir ninguno.
 *     c) Crear un segundo vector que contenga los elementos del anterior
 *        almacenados en orden inverso.
 *     d) Mostrar ambos vectores en la consola.
 *     
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		Random r = new Random();
		int [] v1 = new int[r.nextInt(41) + 10];
		for (int i=0; i<v1.length; i++) {
			int j;
			do {
				v1[i] = r.nextInt(201) - 100;
				j = 0;
				while (j<i && v1[i] != v1[j])
					j++;
			} while (i != j);
		}
		int [] v2 = new int[v1.length];
		for (int i=0; i<v1.length; i++)
			v2[v1.length - i - 1] = v1[i];
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
	}

}
