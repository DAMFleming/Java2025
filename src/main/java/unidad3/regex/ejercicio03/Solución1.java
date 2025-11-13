package unidad3.regex.ejercicio03;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solución1 {

	public static void main(String[] args) throws ParseException {
		try (Scanner in = new Scanner(System.in)) {
			DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
			NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
			Pattern p = Pattern.compile(String.format("(?:\\>\\>(.+)\\<\\<(\\d+(?:\\%s\\d+)?):(\\d+))", dfs.getDecimalSeparator()));
			String linea;
			double total = 0;
			StringBuilder sb = new StringBuilder();
			System.out.print("# ");
			while (!(linea = in.nextLine()).equals("comprar")) {
				Matcher m = p.matcher(linea);
				if (m.matches()) {
					String mueble = m.group(1);
					double precio = numberFormat.parse(m.group(2)).doubleValue();
					int cantidad = Integer.parseInt(m.group(3));
					total += precio * cantidad;
					sb.append(String.format("%s%s (%d)",sb.length() == 0 ? "" : ", ", mueble, cantidad));
				}
				System.out.print("# ");
			}
			System.out.println(sb.toString());
			System.out.printf("Importe total: %.2f", total);
		}
	}
	
}
