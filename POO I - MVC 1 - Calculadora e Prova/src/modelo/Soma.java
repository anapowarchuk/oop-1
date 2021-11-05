package modelo;

public class Soma {
	private int primeiroNumero;
	private int segundoNumero;

	public Soma() {

	}

	public Soma(int primeiroNumero, int segundoNumero) {
		super();
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}

	public int getPrimeiroNumero() {
		return primeiroNumero;
	}

	public void setPrimeiroNumero(int primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}

	public int getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}

	public int Soma() {
		return primeiroNumero+ segundoNumero;
	}


}
