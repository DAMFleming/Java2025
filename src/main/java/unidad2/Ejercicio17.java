package unidad2;

/*
 * Escribe un programa para jugar al juego de adivinar el número desconocido:
 * 
 *   • El programa genera un número aleatorio comprendido entre 1 y N, siendo
 *     N otro número aleatorio comprendido entre 1.000 y 100.000.
 *     
 *   • Después muestra el mensaje “He pensado un número entre 1 y N, adivina
 *     cuál es: “. El usuario tendrá que introducir números hasta que acierte.
 *     
 *   • Por cada respuesta no acertada el programa dirá si el valor introducido
 *     es mayor o menor que la respuesta correcta y volverá a preguntar.
 *     
 *   • Cuando el usuario responda correctamente, el programa dirá cuántos intentos
 *     han sido necesarios para adivinar el número le preguntará al usuario si
 *     desea volver a jugar.
 *     
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int max = random.nextInt(99001) + 1000;
		int cpu = random.nextInt(max) + 1;
		int contador = 0;
		
		System.out.printf("He pensado un número entre 1 y %d, adivina cuál es:\\n", max);
		int jugador;
		do {
			contador++;
			System.out.print("Número: ");
			jugador = in.nextInt();
			if (cpu != jugador) {
				System.out.print("Has fallado, el número es ");
				if (cpu < jugador)
					System.out.println("menor.");
				else
					System.out.println("mayor.");
			}
		} while(cpu != jugador);
		System.out.printf("Has acertado después de %d intentos!", contador);
		in.close();
		
//		System.out.printf("He pensado un número entre 1 y %d, adivina cuál es:\n", max);
//		int jugador;
//		do {
//			contador++;
//			System.out.print("Número: ");
//			jugador = in.nextInt();
//			if (cpu != jugador)
//				System.out.printf("Has fallado, el número es %s\n",
//						cpu < jugador ? "menor" : "mayor");
//		} while(!(cpu == jugador));
//		System.out.printf("Has acertado después de %d intentos!", contador);
	}

}
