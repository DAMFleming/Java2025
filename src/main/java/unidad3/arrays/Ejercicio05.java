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
			if (vector[i].indexOf(cadena)!= -1) {
				contador ++;
			}
		}
		return contador;
	}
	
	static boolean VectorCadena (String [] vector1 , String [] vector2 ) {
		if (vector1.length != vector2.length)
			return false;
		for(int i = 0 ; i<vector1.length ; i++)
			if (!vector1[i].equals(vector2[i]))
					return false;
		return true;
	}
	
//	static boolean VectorCadena (String [] vector1 , String [] vector2 ) {
//		boolean iguales = true;
//		if (vector1.length != vector2.length)
//			iguales = false;
//		else {
//			int i = 0;
//			while (i < vector1.length && vector1[i].equals(vector2[i]))
//				i++;
//			if (i < vector1.length)
//				iguales = false;
//		}
//		return iguales;
//	}
	
	static double desviacionEstandar(int [] v) {
		double media = 0;
		for (int valor: v)
			media += valor;
		media /= v.length;
		double s = 0;
		for (int valor: v)
			s += (valor - media);
		return Math.sqrt(s / (v.length - 1));
	}
	
	static int subsecuenciaMasLarga(int[] v) {
		int record = 0;
		int contador = 1;
		
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] < v[i+1])
				contador++;
			else {
				if (contador > record) {
					record = contador;
				}
				contador = 1;
			}
		}
		return record;
	}
	
	public static void main(String[] args) {
		int [] vector = {21, 30, 2, 57, 71, 4, 29};
		int max = maximoAlmacenado(vector);
		System.out.println(max);
		double media = mediaExacta(vector);
		System.out.println(media);
		
		int[] v= {5, 9, 11, 2, 7, 17, -9, 0, 13, 209, 75, 99, 21};
		System.out.println("La subsecuencia más larga: "+subsecuenciaMasLarga(v));
	}
	
	

}
