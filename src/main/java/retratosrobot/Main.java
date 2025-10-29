package retratosrobot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1 - crear retrato, 2 - salir");
		while (in.nextInt() == 1) {
			String pelo = elegirOpción(in, "WWWWWWWWW", "\\\\\\//////",
					"\"|||||||\"" ,"|||||||||");
			String ojos = elegirOpción(in, "| o   o |", "|-(· ·)-|",
					"|-(o o)-|", "| \\   / |");
			String orejasNariz = elegirOpción(in, "@   J   @",
					"{   \"   }", "[   j   ]", "<   -   >");
			String boca = elegirOpción(in, "|  ===  |", "|   -   |",
					"|  ___  |", "|  ---  |");
			String barbilla = elegirOpción(in, "\\_______/", "\\,,,,,,,/",
					"\\......./", "\\mmmmmmm/");
			System.out.println(pelo);
			System.out.println(ojos);
			System.out.println(orejasNariz);
			System.out.println(boca);
			System.out.println(barbilla);
			System.out.println("1 - crear retrato, 2 - salir");
		}
	}

//	static String elegirOpción(Scanner in,
//			String op1, String op2, String op3, String op4) {
//		do {
//			System.out.println("Elige una opción:");
//			System.out.println("1 - " + op1);
//			System.out.println("2 - " + op2);
//			System.out.println("3 - " + op3);
//			System.out.println("4 - " + op4);
//			int numOpción = in.nextInt();
//			
//			switch (numOpción) {
//			case 1:
//				return op1;
//			case 2:
//				return op2;
//			case 3:
//				return op3;
//			case 4:
//				return op4;
//			}
//			System.out.println("No has elegido una opción válida");
//			System.out.println("Inténtalo de nuevo...");
//		} while (true);
//	}
	
	static String elegirOpción(Scanner in,
			String op1, String op2, String op3, String op4) {
		String opción = null;
		do {
			System.out.println("Elige una opción:");
			System.out.println("1 - " + op1);
			System.out.println("2 - " + op2);
			System.out.println("3 - " + op3);
			System.out.println("4 - " + op4);
			int numOpción = in.nextInt();
			switch (numOpción) {
			case 1:
				opción =  op1;
				break;
			case 2:
				opción = op2;
				break;
			case 3:
				opción = op3;
				break;
			case 4:
				opción = op4;
				break;
			default:
				System.out.println("No has elegido una opción válida");
				System.out.println("Inténtalo de nuevo...");
			}
		} while (opción == null);
		return opción;
	}
	
//	static String elegirOpción(Scanner in,
//			String op1, String op2, String op3, String op4) {
//		System.out.println("Elige una opción:");
//		System.out.println("1 - " + op1);
//		System.out.println("2 - " + op2);
//		System.out.println("3 - " + op3);
//		System.out.println("4 - " + op4);
//		int numOpción = in.nextInt();
//		String opción = null;
//		if (numOpción == 1)
//			opción = op1;
//		else if (numOpción == 2)
//			opción = op2;
//		else if (numOpción == 3)
//			opción = op3;
//		else if (numOpción == 4)
//			opción = op4;
//		return opción;
//	}
	
}
