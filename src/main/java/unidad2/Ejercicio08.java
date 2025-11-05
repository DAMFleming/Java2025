package unidad2;

import java.util.Scanner;

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

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op;
		do {
			System.out.println("1 - Clasificar triángulo por lados");
			System.out.println("2 - Clasificar triángulo por ángulos");
			System.out.println("3 - Salir");
			System.out.print("Elige una opción: ");
			op = in.nextInt();
			String resultado = null;
			if (op == 1) {
				int lado1, lado2, lado3;
				System.out.print("Introduce la longitud del primer lado: ");
				lado1 = in.nextInt();
				System.out.print("Introduce la longitud del segundo lado: ");
				lado2 = in.nextInt();
				System.out.print("Introduce la longitud del tercer lado: ");
				lado3 = in.nextInt();
				resultado = clasificarPorLados(lado1, lado2, lado3);
			}
			else if (op == 2) {
				int angulo1, angulo2, angulo3;
				System.out.print("Introduce el valor del primer ángulo: ");
				angulo1 = in.nextInt();
				System.out.print("Introduce el valor del segundo ángulo: ");
				angulo2 = in.nextInt();
				System.out.print("Introduce el valor del tercer ángulo: ");
				angulo3 = in.nextInt();
				resultado = clasificarPorAngulos(angulo1, angulo2, angulo3);
			}
			else if (op != 3)
				System.out.println("opción incorrecta");
			
			if (op == 1 || op == 2)
				System.out.println("Triángulo " + resultado);
		} while(op != 3);
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
				return "rectángulo";
			else /* if (a1 > 90 || a2 > 90 || a3 > 90) */
				return "escaleno";
		}
		
	}
	
}
