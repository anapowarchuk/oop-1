package modelo;

public class Operacoes {
	
	int n1;
	int n2;
	
	
	public Operacoes(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public Operacoes() {
		// TODO Auto-generated constructor stub
	}

	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	
	public int soma () {
		return n1+n2;
	}
	
	
	public int subtracao () {
		return n1-n2;
	}
	
	public int multiplicacao () {
		return n1*n2;
	}
	
	public int divisao () {
		if (n2!=0)
			return n1/n2;
		else 
			return 0;
	}
	
	
}
