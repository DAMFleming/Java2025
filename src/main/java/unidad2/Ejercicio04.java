package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que pida por teclado un número de mes y muestre
 * el número de días que tiene. Si el usuario no introduce un valor entre
 * 1 y 12, se mostrará un mensaje de error.
 */

public class Ejercicio04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un mes (número de 1 a 12): ");
		int mes = Integer.parseInt(in.readLine());
		
		if (mes < 1 || mes > 12) { // el més no está entre 1 y 12
			System.out.println("No es un mes válido");
		}
		else {
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7
					|| mes == 8 || mes == 10 || mes == 12) { // es un més de 31 días
				System.out.println("31 días");
			}
			else {
				if (mes == 2) { // es febrero
					System.out.println("28 O 29 días");
				}
				else { // es un més de 30 días
					System.out.println("30 días");
				}
			}
		}
		
//		if (mes < 1 || mes > 12) // el més no está entre 1 y 12
//			System.out.println("No es un mes válido");
//		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes = 10 || mes == 12) // es un més de 31 días
//			System.out.println("31 días");
//		else if (mes == 2) // es febrero
//			System.out.println("28 O 29 días");
//		else // es un més de 30 días
//			System.out.println("30 días");
	
	}
	
}
