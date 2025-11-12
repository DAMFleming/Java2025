package unidad3.regex;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
>>sofá<<543.99:2
>>mesa<<155:1
>silla<<79.5-6
comprar
*/
public class Ejercicio03 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(?:\\>\\>(.+)\\<\\<(\\d+(?:\\.\\d+)?):(\\d+))");
		try (Scanner in = new Scanner(System.in)) {
			String linea;
			double total = 0;
			while (!(linea = in.nextLine()).equals("comprar")) {
				Matcher m = p.matcher(linea);
				if (m.matches()) {
					String mueble = m.group(1);
					double precio = Double.parseDouble(m.group(2));
					int cantidad = Integer.parseInt(m.group(3));
					total += precio * cantidad;
					System.out.printf("%s (%d), ", mueble, cantidad);
				}
			}
			System.out.println("Importe total:");
			System.out.println(total);
		}
	}
	
//	public static void main(String[] args) {
//		Pattern p = Pattern.compile("(?:\\>\\>(.+)\\<\\<(\\d+(?:,\\d+)?):(\\d+))|comprar");
//		try (Scanner in = new Scanner(System.in)) {
//			String linea;
//			double total = 0;
//			while (!(linea = in.nextLine()).equals("comprar")) {
//				Matcher m = p.matcher(linea);
//				if (m.matches()) {
//					String mueble = m.group(1);
//					NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
//					double precio;
//					try {
//						precio = nf.parse(m.group(2)).doubleValue();
//					} catch (ParseException e) {
//						precio = 0;
//					}
//					int cantidad = Integer.parseInt(m.group(3));
//					total += precio * cantidad;
//					System.out.printf("%s (%d), ", mueble, cantidad);
//				}
//			}
//			System.out.println("Importe total:");
//			System.out.println(total);
//		}
//	}

}
