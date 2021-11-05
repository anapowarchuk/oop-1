package Interfaces;

public class Caminhao extends Veiculo implements Impostos, Pedagio {
	private double capacidadeCarga;

	public Caminhao(String marca, String modelo, double motorizacao, double peso, int ano, int numEixos, double capac) {
		super(marca, modelo, motorizacao, peso, ano, numEixos);
		this.capacidadeCarga = capac;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public double calculaIPVA(int ano, double motor) {
		double ipva=0.0;
		if (ano>2015)
			ipva=1500.0;
		else 
			ipva=800.0;
		
		if (motorizacao>2.0)
			ipva=ipva*1.08;
		
		return ipva;
	}

	public double calculaSeguro(int ano, double motor) {
		double seguro;
		if (ano >2015)
			seguro = 2000.0;
		else 
			seguro = 1500.0;
		
		if (motorizacao > 1.0)
			seguro = seguro *1.5;
		
		return seguro;
	}

	public double calculaPedagio(int numEix) {
		double valP = 0;
		if (numEixos > 2) {
			valP = 30.0;
		} else
			valP = 20.0;

		if (capacidadeCarga > 3000.0)
			valP = valP * 1.02;
		return valP;
	}

}