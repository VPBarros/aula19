import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        //dados  de 2 triangulos x e y exercicio p/ fixação classes,atributo e metodos POO
		//insira as medidas X enter insira as medidas Y, Dê enter virá o resultado.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x , y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Insira as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
				
		System.out.println("Insira as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangulo X area:  %.4f%n", areaX );
		System.out.printf("Triangulo Y area:  %.4f%n", areaY );
		
		if (areaX > areaY) {
			System.out.println ("Maior area: X");
		}
		else {
			System.out.println ("Maior area: Y");
		}
				
  sc.close();
    }
}
