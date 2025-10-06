package ejemplos;

import java.util.Scanner;

public class SentenciaIf {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un año: ");
		int año = in.nextInt();
		if (año % 4 == 0) {
			if (año % 100 == 0) {
				if (año % 400 == 0)
					System.out.println("bisiesto");
				else
					System.out.println("no bisiesto");
			}
			else
				System.out.println("bisiesto");
		}
		else
			System.out.println("no bisiesto");
	}

}
