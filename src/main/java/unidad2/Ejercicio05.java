package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que pida por teclado un nombre de un mes
 * y muestre el número de días que tiene. Si el nombre introducido
 * no es correcto, se mostrará un mensaje de error.
 */

public class Ejercicio05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un mes: ");
		String mes = in.readLine();
		
		if ("enero".equalsIgnoreCase(mes) || 
			"marzo".equalsIgnoreCase(mes) ||
		    "mayo".equalsIgnoreCase(mes) ||
		    "julio".equalsIgnoreCase(mes) ||
		    "agosto".equalsIgnoreCase(mes) ||
		    "octubre".equalsIgnoreCase(mes) ||
		    "diciembre".equalsIgnoreCase(mes)){
			System.out.println("31 días");
		}
		else {
			if ("febrero".equalsIgnoreCase(mes)) {
				System.out.println("28 O 29 días");
			}
			else {
				if ("abril".equalsIgnoreCase(mes) || 
					"junio".equalsIgnoreCase(mes) ||
					"septiembre".equalsIgnoreCase(mes) ||
					"noviembre".equalsIgnoreCase(mes)){
					System.out.println("30 días");
				}
				else {
					System.out.println("No has introducido un més válido");
				}
			}
		}
	}
}
