package unidad3.regex.ejercicio03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solución2 {

	static DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
	static NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
	static StringBuilder sb = new StringBuilder();
	static Pattern numberRegex = Pattern.compile(
			String.format("\\d+(?:\\%s\\d+)?", dfs.getDecimalSeparator()));
	
	public static void main(String[] args) throws ParseException, IOException {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			String linea;
			double total = 0;
			System.out.print("# ");
			while (!(linea = in.readLine()).equals("comprar")) {
				total += analizar(linea);
				System.out.print("# ");
			}
			System.out.println(sb.toString());
			System.out.printf("Importe total: %.2f", total);
		}
	}
	
	static double analizar(String s) {
		try (Scanner scanner = new Scanner(s)) {
			String mueble;
			double precio, cantidad;
			int pos = 0;
			try {
				scanner.skip(">>");
				pos = scanner.match().end();
				try {
					scanner.skip("[\\p{L}\\s-\\d]+");
					mueble = scanner.match().group();
					pos = scanner.match().end();
					try {
						scanner.skip("<<");
						pos = scanner.match().end();
						try {
							scanner.skip(numberRegex);
							precio = numberFormat.parse(scanner.match().group()).doubleValue();
							pos = scanner.match().end();
							try {
								scanner.skip(":");
								pos = scanner.match().end();
								try {
									scanner.skip("\\d+");
									cantidad = Double.parseDouble(scanner.match().group());
									sb.append(String.format("%s%s (%d)",sb.length() == 0 ? "" : ", ", mueble, (int) cantidad));
									return cantidad * precio;
								} catch (Exception e) {
									printError("una cantidad", pos);
								}
							} catch (Exception e) {
								printError(":", pos);
							}
						} catch (Exception e) {
							printError("un precio", pos);
						}
					} catch (Exception e) {
						printError("<<", pos);
					}
				} catch (Exception e) {
					printError("un nombre válido para el mueble", pos);
				}
			} catch (Exception e) {
				printError(">>", pos);
			}
			return 0;
		}
	}
	
	static void printError(String s, int i) {
		System.out.println(" ".repeat(i + 2) + "^");
		System.out.printf("error: se esperaba %s\n", s);
	}
}
