package Interfaces;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected double motorizacao;
	protected double peso;
	protected int ano;
	protected int numEixos;

	public Veiculo(String marca, String modelo, double motorizacao, double peso, int ano, int numEixos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motorizacao = motorizacao;
		this.peso = peso;
		this.ano = ano;
		this.numEixos = numEixos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(double motorizacao) {
		this.motorizacao = motorizacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumEixos() {
		return numEixos;
	}

	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}

}
