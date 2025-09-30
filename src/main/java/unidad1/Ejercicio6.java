package unidad1;

/*
 * Escribe un programa que muestre la división de 1234 entre 532,
 * con un formato de salida de 15 dígitos, de los cuales dos se
 * usarán para la parte decimal.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		float v = 1234f / 532f;
		System.out.printf("1234 / 532 = %15.2f", v);
	}

}
