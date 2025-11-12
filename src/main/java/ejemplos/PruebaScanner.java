package ejemplos;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		System.out.println( 1234 );
		try (Scanner s = new Scanner(System.in)) {
			while (s.hasNext()) {
				if (s.hasNextInt())
					System.out.println(s.nextInt());
				else
					s.next();
			}
		}

	}

}
