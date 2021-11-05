package Salario;

public class Professor implements Salario{

	String nome;
	int matricula;
	int cargaHoraria;
	double valorHora;
	
	@Override
	public double getSalarioLiquido() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getQuantidadeSalarioMinimo() {
		return cargaHoraria;
		// TODO Auto-generated method stub
	}

}
