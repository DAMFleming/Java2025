package unidad2;

/*
 * Crea los métodos siguientes:
 * 
 * • Método que clasifique un triángulo a partir de la longitud de sus lados
 *   como equilátero, isósceles, escaleno o imposible (ver teorema de la desigualdad
 *   del triángulo).
 *   
 * • Método que clasifique un triángulo a partir del valor de sus ángulos interiores
 *   como acutángulo, rectángulo, obtusángulo o imposible (la suma de sus ángulos
 *   interiores es distinta de 180).
 *   
 *   Busca en Internet la información que te permita resolver el problema.
 *   
 * Finalmente, escribe un programa para poner a prueba estos métodos mostrando
 * un menú donde el usuario pueda elegir entre uno de los dos tipos de clasificación
 * de triángulos. Una vez hecha la elección, el programa le pedirá por teclado
 * los datos necesarios y mostrará el resultado. Para que este proceso se pueda
 * repetir indefinidamente, el menú deberá incluir una opción que permita finalizar
 * el programa.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
				
	}
	
	static String clasificarPorLados(double l1, double l2, double l3) {
		if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
			if (l1 == l2 && l2 == l3)
				return "equilátero";
			else if (l1 == l2 || l2 == l3 || l1 == l3)
				return "isósceles";
			else /* if (l1 != l2 && l2 != l3 && l1 != l3) */
				return "escaleno";
		}
		else 
			return "imposible";
		
	}
	
	static String clasificarPorAngulos(double a1, double a2, double a3) {
//		if (a1 > 0 && a2 > 0 && a3 > 0 && a1 + a2 + a3 == 180) {
//			if (a1 < 90 && a2 < 90 && a3 < 90)
//				return "acutángulo";
//			else if (a1 == 90 || a2 == 90 || a3 == 90)
//				)
//				return "rectángulo";
//			else /* if (a1 > 90 || a2 > 90 || a3 > 90) */
//				return "escaleno";
//		}
//		else 
//			return "imposible";
		
		if (!(a1 > 0 && a2 > 0 && a3 > 0 && a1 + a2 + a3 == 180)) 
			return "imposible";
		else {
			if (a1 < 90 && a2 < 90 && a3 < 90)
				return "acutángulo";
			else if (a1 == 90 || a2 == 90 || a3 == 90)
				)
				return "rectángulo";
			else /* if (a1 > 90 || a2 > 90 || a3 > 90) */
				return "escaleno";
		}
		
	}
	
}
