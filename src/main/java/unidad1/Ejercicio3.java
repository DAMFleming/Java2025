package unidad1;

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

public class Ejercicio3 {

	public static void main(String[] args) {
		int año = 2049;
		boolean bisiesto = año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
		
	}

}
