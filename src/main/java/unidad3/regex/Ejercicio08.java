package unidad3.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
 * Escribe un programa que lea un documento de texto que encierre
 * parte de su contenido entre etiquetas <uppercase> … </uppercase>
 * y lo transforme convirtiendo a mayúsculas el contenido encerrado
 * entre las etiquetas y suprimiendo las mismas.
 * 
 */

public class Ejercicio08 {

	public static void main(String[] args) throws IOException {
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(
						Ejercicio08.class.getResourceAsStream("/documento.txt")))) {
			String documento = in.lines().collect(Collectors.joining("\n"));
			System.out.println(documento);
			Pattern p = Pattern.compile("<uppercase>(.*)</uppercase>");
			Matcher m = p.matcher(documento);
			StringBuffer sb = new StringBuffer();
			while (m.find())
				m.appendReplacement(sb, m.group(1).toUpperCase());
			m.appendTail(sb).toString();
			System.err.println(sb.toString());
		}
	}

}
