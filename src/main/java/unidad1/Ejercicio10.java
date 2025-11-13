package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que le pregunte al usuario su nombre
 * y a continuación muestre los segundos que ha tardado en
 * contestar con una precisión de milisegundos.
 * 
 */

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce tu nombre: ");
		long t0 = System.nanoTime();
		String nombre = teclado.readLine(); 
		long t1 = System.nanoTime();
		long t = t1 - t0;
		System.out.printf("%s, has tardado %d milisegundos en introducir tu nombre \n", nombre, t);
	}

}
