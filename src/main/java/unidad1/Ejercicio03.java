package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Según Wikipedia: 
 * 
 *     Año bisiesto es el divisible entre 4, salvo que sea
 *     año secular —último de cada siglo, terminado en «00»—,
 *     en cuyo caso también ha de ser divisible entre 400.
 * 
 * Basándote en esta definición, crea una expresión Java que se
 * evalúe como true si el valor almacenado en una variable llamada
 * año representa un año bisiesto, y false en caso contrario.
 * Completa la expresión para que se convierta en una sentencia.
 *  
 */

public class Ejercicio03 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un año: ");
		String linea;
		linea = in.readLine();
		short año = Short.parseShort(linea);
		boolean bisiesto = año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
		System.out.println("Bisiesto: " + bisiesto);
	}

}
