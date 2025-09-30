package unidad1;
       
/*
 * Dadas las variables a, b, c, d y e de tipo int, inicializadas
 * con los valores -9, 21, -35, 51 y 33 respectivamente,
 * crea una sola expresión que realice las operaciones siguientes:
 * 
 *  • Sumar los valores almacenados en a y b y multiplicar el
 *    resultado por el valor almacenado en e.
 *    
 *  • Dividir el resultado de la operación anterior entre el
 *    resto de dividir el valor almacenado en d entre el valor
 *    almacenado en c.
 *    
 *  • Almacenar en una variable f el resultado parcial que se
 *    obtiene de la operación descrita en el primer punto. 
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int a = -9;
		int b = 21;
		int c = -35;
		int d = 51;
		int e = 33;
		int f;
		
		
//		int a = -9, b = 21, c = -35, d = 51, e = 33;
		
		System.out.println((f = ((a + b) * e)) / (d % c));
	
	}

}
