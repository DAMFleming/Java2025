package unidad2;

import java.util.Scanner;

public class Ejercicio01 {

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Introduce un número entero (dividendo): ");
//		int dividendo = in.nextInt();
//		System.out.print("Introduce otro número entero (divisor): ");
//		int divisor = in.nextInt();
//		if (divisor == 0)
//			System.err.println("error: el divisor no puede ser cero");
//		else
//			System.out.printf("%d / %d = %d", dividendo, divisor, dividendo / divisor);
//		
////		if (divisor != 0)
////			System.out.printf("%d / %d = %d", dividendo, divisor, dividendo / divisor);
////		else
////			System.err.println("error: el divisor no puede ser cero");
//			
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un número entero (dividendo): ");
		double dividendo = in.nextDouble();
		System.out.print("Introduce otro número entero (divisor): ");
		double divisor = in.nextDouble();
		System.out.printf("%f / %f = %f", dividendo, divisor, dividendo / divisor);
	}

	
	
}
