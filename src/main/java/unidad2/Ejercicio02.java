package unidad2;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Coordenada X de la primera circunferencia: ");
		float x1 = Float.parseFloat(in.readLine());
		System.out.print("Coordenada Y de la primera circunferencia: ");
		float y1 = Float.parseFloat(in.readLine());
		System.out.print("Radio de la primera circunferencia: ");
		float r1 = Float.parseFloat(in.readLine());
		System.out.print("Coordenada X de la segunda circunferencia: ");
		float x2 = Float.parseFloat(in.readLine());
		System.out.print("Coordenada Y de la segunda circunferencia: ");
		float y2 = Float.parseFloat(in.readLine());
		System.out.print("Radio de la segunda circunferencia: ");
		float r2 = Float.parseFloat(in.readLine());
		
//		Point2D.Float c1 = new Point2D.Float(x1, y1);
//		Point2D.Float c2 = new Point2D.Float(x2, y2);
//		float dCentros = (float) c1.distance(c2);
		
		float dCentros = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		float sumRadios = r1 + r2;
		float difRadios = Math.abs(r1 - r2);
		
		
		if (dCentros > sumRadios) {
			System.out.println("Exteriores");
		}
		else {
			if () {
				
			}
			else {
				
			}
		}
	}

}
