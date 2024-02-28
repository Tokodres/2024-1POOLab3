package logica;

public class Esfera extends Circulo implements Cuerpo {

public Esfera(double valor1) {
		super(valor1);
	}
	
	public Esfera() {
		super();
	}

	@Override
	public double volumen() {
		return (2*(Math.PI * Math.pow(this.valor1, 2))/3);
	}



}
