package unidad3.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Programa que simule el lanzamiento de un dado N veces, siendo N
 * un número entero que se introducirá por teclado. Antes de finalizar
 * mostrará el número de veces que salió cada una de las caras.
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Número de caras: ");
		int c = in.nextInt();
		System.out.print("Número de tiradas: ");
		int n = in.nextInt();
		int [] contadores = new int[c];
		Random r = new Random();
		for (int i=0; i<n; i++) {
			int tirada = r.nextInt(c);
			contadores[tirada]++;
		}
		for (int i=0; i<contadores.length; i++)
			System.out.printf("El número %d ha salido %d veces\n", i + 1, contadores[i]);
	}
	
}
