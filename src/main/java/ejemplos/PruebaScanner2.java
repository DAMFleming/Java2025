package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;

public class PruebaScanner2 {

	static DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
	static NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
	
	public static void main(String[] args) throws IOException {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
			NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
			String linea;
			double total = 0;
			StringBuilder sb = new StringBuilder();
			System.out.print("# ");
			while (!(linea = in.readLine()).equals("comprar")) {
				total += analizar(linea);
				System.out.print("# ");
				sb.setLength(0);
			}
			System.out.println(sb.toString());
			System.out.printf("Importe total: %.2f", total);
		}
	}
	
	
	}

}
