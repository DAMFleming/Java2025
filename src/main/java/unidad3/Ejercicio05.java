package unidad3;

import java.util.Scanner;

/*
 * Escribe un programa que lea líneas hasta que se introduzca
 * en una de ellas la cadena "fin" sin importar si se hace en
 * mayúsculas o en minúsculas o en cualquier combinación de
 * ambas.
 * Por cada línea leída, excepto la última, mostrará cuál es el
 * primer carácter que no se repite.
 * 
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String linea;
		System.out.print("> ");
		while (!(linea = in.nextLine()).equalsIgnoreCase("fin")) {
			Character c = primerCaracterQueNoSeRepite(linea);
			System.out.println(c);
			System.out.print("> ");
		}
	}
	
	static Character primerCaracterQueNoSeRepite(String s) {
		if (s.length() == 0)
			return null;
		int i=0, j;
		do {
			j = 0;
			while (j < s.length() && (i == j || s.charAt(i) != s.charAt(j)))
				j++;
			if (j < s.length())
				i++;
		} while (i < s.length() && j < s.length());
		if (i < s.length())
			return s.charAt(i);
		else
			return null;
	}

}
