package presentacion;

import logica.Cilindro;
import logica.Circulo;
import logica.Cuadrado;
import logica.Cubo;
import logica.Cuerpo;
import logica.Esfera;
import logica.Figura;
import logica.Paralelepipedo;
import logica.Paralelogramo;
import logica.Piramide;
import logica.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Figura f;
		f = new Cuadrado(5);
		System.out.println("//////////Cuadrado//////////");
		System.out.println("Area = "+f.area());
		System.out.println("Perimetro = "+f.perimetro());
				
		f = new Circulo(5);
		System.out.println("//////////Circulo//////////");
		System.out.println("Area = "+f.area());
		System.out.println("Perimetro = "+f.perimetro());

		f = new Triangulo(5, 4);
		System.out.println("//////////Triangulo//////////");
		System.out.println("Area = "+f.area());
		System.out.println("Perimetro = "+f.perimetro());
		
		f = new Paralelogramo(5,4,3);
		System.out.println("//////////Paralelogramo//////////");
		System.out.println("Area = "+f.area());
		System.out.println("Perimetro = "+f.perimetro());
		
		Cuerpo c;
		c = new Cubo(5);
		System.out.println("//////////Cubo//////////");
		System.out.println("Volumen = "+c.volumen());
		c = new Esfera(5);
		System.out.println("//////////Esfera//////////");
		System.out.println("Volumen = "+c.volumen());
		c = new Piramide(4,5);
		System.out.println("//////////Piramide//////////");
		System.out.println("Volumen = "+c.volumen());
		c = new Cilindro(5,4);
		System.out.println("//////////Cilindro//////////");
		System.out.println("Volumen = "+c.volumen());
		c = new Paralelepipedo(5,4,3);
		System.out.println("//////////Paralelepipedo//////////");
		System.out.println("Volumen = "+c.volumen());
	}
}
