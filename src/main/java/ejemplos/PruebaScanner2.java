package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PruebaScanner2 {

	public static void main(String[] args) throws IOException {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			String linea;
			while ((linea = in.readLine()) != null) {
				if (analizar(linea)) {
					System.out.println("correcto");
				}
			}
		}
	}
	
	static boolean analizar(String s) {
		int i=0;
		try (Scanner scanner = new Scanner(s)) {
			scanner.skip(">>");
			i++;
			scanner.skip("[\\p{L}\\s-\\d]+");
			System.out.println(scanner.match().group());
			i++;
			scanner.skip("<<");
			i++;
			scanner.skip("\\d+(?:\\.\\d+)?");
			i++;
			scanner.skip(":");
			i++;
			scanner.skip("\\d+");
			return true;
		} catch (Exception e) {
			System.out.println();
			System.out.print("error: ");
			switch (i) {
			case 0: 
				System.out.println("se esperaba \">>\"");
				break;
			}
			return false;
		}
	}

}
