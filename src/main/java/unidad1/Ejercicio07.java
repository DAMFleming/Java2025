package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que calcule el espacio recorrido por un vehículo
 * con una velocidad inicial de 5 m/s y una aceleración de 2 m/s2.
 */

public class Ejercicio07 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el tiempo que permanece el vehículo en movimiento: ");
		String linea = in.readLine();
		double t = Double.parseDouble(linea);
		
		// velocidad inicial * tiempo + aceleración / 2 * tiempo al cuadrado
		
//		double d = 5d * t + 0.5d * 2d * Math.pow(t, 2d);
//		System.out.printf("Distancia recorrida: %15.2f", d);
		
		System.out.printf("Distancia recorrida: %15.2f", 5d * t + 0.5d * 2d * Math.pow(t, 2d));
		
	}

}
