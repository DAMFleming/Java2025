package unidad3.arrays;

public class Ejercicio05 {

	static Integer maximoAlmacenado (int [] vector) {
		if (vector.length == 0)
			return null;
		
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < vector.length; i++)
//			if (vector[i] > max) {
//				max = vector [i];
//			}
		
		int max = vector[0];
		for (int i = 1; i < vector.length; i++)
			if (vector[i] > max) {
				max = vector [i];
			}
		
		return max;
	}
	
	static double mediaExacta (int [] vector) {
		double suma = 0;
		for(int i = 0 ; i<vector.length ; i++)
			suma += vector[i];
		double media = suma / vector.length;
		return media;
	}
	static int contarSubcadena (String[] vector , String cadena ) {
		int contador = 0;
		for(int i = 0 ; i<vector.length ; i++) {
			if (vector[i])
		}
	}
	
	
	
	public static void main(String[] args) {
		int [] vector = {21, 30, 2, 57, 71, 4, 29};
		int max = maximoAlmacenado(vector);
		System.out.println(max);
		double media = mediaExacta(vector);
		System.out.println(media);
	}
	
	

}
