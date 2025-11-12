package unidad3.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Programa que lea una cadena de teclado y muestre por pantalla
 * el número de veces que aparece cada vocal en ella.
 * 
 */

public class Ejercicio01 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una cadena: ");
		String s = in.readLine();
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case 'a', 'A':
					contadorA++;
					break;
				case 'e', 'E':
					contadorE++;
					break;
				case 'i', 'I':
					contadorI++;
					break;
				case 'o', 'O':
					contadorO++;
					break;
				case 'u', 'U':
					contadorU++;
					break;
			}
		}
		System.out.println("Número de caracteres 'a/A': " + contadorA);
		System.out.println("Número de caracteres 'e/E': " + contadorE);
		System.out.println("Número de caracteres 'i/I': " + contadorI);
		System.out.println("Número de caracteres 'o/O': " + contadorO);
		System.out.println("Número de caracteres 'u/U': " + contadorU);
	}
	
}
