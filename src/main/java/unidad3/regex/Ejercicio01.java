package unidad3.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio01 {

	public static void main(String[] args) throws IOException {
		String regex = "ATG(?:[ACGT]{3})+(?:TAA|TAG|TGA)";
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(Ejercicio01.class.getResourceAsStream("/adn.txt")))) {
			String linea;
			while ((linea = in.readLine()) != null) {
				System.out.print(linea + ": ");
				if (linea.matches(regex))
					System.out.println("ACEPTADA");
				else
					System.out.println("RECHAZADA");
			}
		}
	}

}
