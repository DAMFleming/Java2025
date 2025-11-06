package unidad3;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 		\p{L}\d+.
 */

public class Ejercicio09 {

//	public static void main(String[] args) throws IOException {
//		var in = new BufferedReader(new InputStreamReader(System.in));
//		String linea;
//		double total = 0;
//		Pattern pattern = Pattern.compile("\\p{L}\\d+.");
//		System.out.print("> ");
//		while ((linea = in.readLine()) != null) {
//			Matcher matcher = pattern.matcher(linea);
//			while (matcher.find()) {
//				String subcadena = matcher.group();
//				total += calcular(subcadena);
//			}
//			System.out.print("> ");
//		}
//		System.out.println(total);
//	}
	
	public static void main(String[] args) throws IOException {
		var in = new Scanner(System.in);
		String linea;
		double total = 0;
		System.out.print("> ");
		String subcadena;
		while ((subcadena = in.findWithinHorizon("\\p{L}\\d+.", 0)) != null) {
			total += calcular(subcadena);
		}
		System.out.println(total);
	}
	
	static double calcular(String s) {
		System.out.println("Procesando " + s);
		
		return 0; // provisional
	}
	
}
