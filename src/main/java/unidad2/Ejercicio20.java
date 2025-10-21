package unidad2;

/*
 * Escribe un programa que pida un número n por teclado
 * y dibuje en la consola triángulos usando asteriscos.
 * Por ejemplo, para n=4 se dibujarán los triángulos
 * siguientes:
 * 		****  ****  *        *     *    *******
 *      ***    ***  **      **    ***    *****
 *      **      **  ***    ***   *****    ***
 *      *        *  ****  ****  *******    *
21.
 * 
 */

public class Ejercicio20 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = n; i>0; i--) {
			for (int j = 1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
		System.out.println();
		
//		for (int i=n; i>0; i--) {
//			int espacios = n - i;
//			for (int j=1; j<=espacios; j++)
//				System.out.print(' ');
//			for (int j=1; j<=i; j++)
//				System.out.print('*');
//			System.out.println();
//		}
		int espacios = 0;
		for (int i=n; i>0; i--) {
			for (int j=1; j<=espacios; j++)
				System.out.print(' ');
			espacios++;
			for (int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
		
		for (int i=1; i<=n; i++) {
			for (int j = 1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
		
		espacios = 3;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=espacios; j++)
				System.out.print(' ');
			espacios--;
			for (int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
		
	}

}
