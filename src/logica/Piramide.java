package logica;

public class Piramide extends Triangulo implements Cuerpo {

public Piramide(double valor1,double valor2) {
		super(valor1, valor2);
	}
	
	public Piramide() {
		super();
	}

	@Override
	public double volumen() {
		return (Math.pow(this.valor1, 2) * (Math.sqrt(Math.pow(this.getValor2(), 2) - Math.pow(((this.valor1)/2), 2))))/3;
	}
	
}
