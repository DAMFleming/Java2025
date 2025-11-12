package unidad3.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio06 {

	public static void main(String[] args) throws IOException {
		String line=null;
		
		try(BufferedReader reader= new BufferedReader(new InputStreamReader(System.in))){
			StringBuffer sb = new StringBuffer();
			Pattern p = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
			while((line=reader.readLine())!=null) {
				Matcher m = p.matcher(line);
				while (m.find()) {
					m.appendReplacement(sb, "$3-$2-$1");
				}
				String resultado = m.appendTail(sb).toString();
				System.out.println(resultado);
			}
		}

	}

}
