package unidad2;

import java.util.Random;

/*
 * Escribe un programa que genere mil millones de números aleatorios
 * de tipo long y muestre cuántos pertenecen al intervalo
 * [-1.000.000.000.000.000.000, 1.000.000.000.000.000.000] y el tiempo
 * empleado en obtener ese resultado.
 */

public class Ejercicio13 {
	
	public static void main(String[] args) {
		Random random = new Random();
		long t0;
		long t1;
		int contador = 0;
		t0 = System.nanoTime();
		for (int i=0; i<1000000000; i++) {
			long n = random.nextLong();
			if (n >= -1000000000000000000L && n <= 1000000000000000000L)
				contador++;
		}
		t1 = System.nanoTime();
		System.out.printf("%d números en el intervalo\n", contador);
		System.out.printf("ha tardado %d nanosegundos", t1 - t0);
	}
	
}
