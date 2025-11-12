package unidad3.strings;

import java.util.Scanner;

/*
 * Escribe un programa que lea dos cadenas y muestre el número de veces
 * que la segunda está contenida en la primera.
 *  
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String a = in.nextLine();
		System.out.println("Introduce otra cadena: ");
		String b = in.nextLine();
		int cont = 0;
		int i = 0;
//		do {
//			i = a.indexOf(b, i);
//			if (i != -1) {
//				i++;
//				cont++;
//			}
//		} while(i != -1);
//		System.out.printf("b dentro de a %d veces", cont);
		
		while ((i = a.indexOf(b,i)) != -1) {
			i++;
			cont++;
		}
		System.out.printf("b dentro de a %d veces", cont);
	}
	
	
	
	
	

}



