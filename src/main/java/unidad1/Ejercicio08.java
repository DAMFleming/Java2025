package unidad1;

/*
 * Escribe un programa que calcule el perímetro y el área de un círculo
 * a partir de su radio (r) usando las expresiones siguientes:
 * 
 * 				perímetro = 2𝜋𝑟
 *              área = 𝜋𝑟2
 * 
 * Para especificar el valor de  usa la expresión Math.PI.
 * 
 */

public class Ejercicio08 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Radio del círculo: ");
//		String linea = in.readLine();
//		double r = Double.parseDouble(linea);
//		System.out.println("Perímetro: " + (r * 2d * Math.PI));
//		System.out.println("Área: " + (Math.pow(r, 2d) * Math.PI));
//	}
	
	public static void main(String[] args) {
		System.out.print("Radio del círculo: ");
		String linea = System.console().readLine();
		double r = Double.parseDouble(linea);
		System.out.println("Perímetro: " + (r * 2d * Math.PI));
		System.out.println("Área: " + (Math.pow(r, 2d) * Math.PI));
	}

}
