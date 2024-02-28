package logica;

public class Cilindro extends Circulo implements Cuerpo {
    private double valor2;
public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

public Cilindro(double valor1, double valor2) {
		super(valor1);
		this.valor2 = valor2;
	}
	
	public Cilindro() {
		super();
	}



	@Override
	public double volumen() {
		return  Math.PI * Math.pow(this.valor1, 2) * this.valor2;
	}



}