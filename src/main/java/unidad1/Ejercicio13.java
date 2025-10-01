package unidad1;

import java.util.Scanner;

/*
 * Escribe un programa que calcule la fuerza gravitatoria entre dos masas
 * usando la fórmula de la gravitación universal:
 * 
 *              𝐹 = 𝐺 × (𝑚₁ × 𝑚₂) / 𝑑²
 *          
 * 𝐺 es la constante de gravitación universal, cuyo valor es:
 *          
 *              6,67384×10−11 𝑁𝑚²𝑘𝑔²
 * 
 * El valor de las masas 𝑚₁, 𝑚2 y la distancia 𝑑 entre ellas se introducirán
 * por teclado.
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		final double G = 6.67384e-11d;
		double m1, m2, d, f;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce m₁: ");
		m1 = in.nextDouble();
		System.out.println("Introduce m₂: ");
		m2 = in.nextDouble();
		System.out.println("Introduce la distancia");
		d = in.nextDouble();
		f = G * (m1 * m2) / Math.pow(d, 2d);
		System.out.printf("Fuerza gravitatoria = %e\n", f);
		in.close();
	}

//	public static void main(String[] args) {
//		final double G = 6.67384e-11d;
//		double m1, m2, d, f;
//		try (Scanner in = new Scanner(System.in)) {
//			System.out.println("Introduce m₁: ");
//			m1 = in.nextDouble();
//			System.out.println("Introduce m₂: ");
//			m2 = in.nextDouble();
//			System.out.println("Introduce la distancia");
//			d = in.nextDouble();
//			f = G * (m1 * m2) / Math.pow(d, 2d);
//			System.out.printf("Fuerza gravitatoria = %e\n", f);
//		}
//	}

}
