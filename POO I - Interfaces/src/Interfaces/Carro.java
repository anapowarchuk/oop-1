package Interfaces;

public class Carro extends Veiculo implements Impostos, Pedagio {
	private int numPassageiros;

	public Carro(String marca, String modelo, double motorizacao, double peso, int ano, int numEixos, int numP) {
		super(marca, modelo, motorizacao, peso, ano, numEixos);
		this.numPassageiros = numP;
	}

	public double calculaPedagio(int numEix) {
		double valP = 0;
		if (numEixos > 2) {
			valP = 30.0;
		} else
			valP = 20.0;
		return valP;
	}

	public double calculaIPVA(int ano, double motor) {
		double ipva=0.0;
		if (ano>2015)
			ipva=1000.0;
		else 
			ipva=500.0;
		
		if (motorizacao>2.0)
			ipva=ipva*1.08;
		
		return ipva;	}

	public double calculaSeguro(int ano, double motor) {
		double seguro;
		if (ano >2015)
			seguro = 1000.0;
		else 
			seguro = 1200.0;
		
		if (motorizacao > 1.0)
			seguro = seguro *1.3;
		
		return seguro;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

}