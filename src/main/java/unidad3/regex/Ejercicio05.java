package unidad3.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio05 {

	/** Escribe un programa que acepte por teclado un texto que contenga uno o varios números de tarjetas
		de crédito (####-####-####-####) y enmascare los doce primeros dígitos de cada uno de ellos. Usar
		una expresión regular compilada 
	 * @throws IOException */
	public static void main(String[] args) throws IOException {
		Pattern p= Pattern.compile("(?:\\d{4}-){3}(\\d{4})");
		String line=null;
		Matcher m=null;
		
		try(BufferedReader reader= new BufferedReader(new InputStreamReader(System.in))){
			while((line=reader.readLine())!=null) {
				m= p.matcher(line);
				if(m.matches()) {
					System.out.println("####-####-####-"+m.group(1));
				}
			}
		}

	}

}
