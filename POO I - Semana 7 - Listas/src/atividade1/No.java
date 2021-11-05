package atividade1;

public class No {

	private String letra;
	private No proximo;

	public No(String letra) {
		this.letra = letra;
		this.proximo = null;
	}

	public No(String letra, No prox) {
		this.letra = letra;
		this.proximo = prox;
	}
	
	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}


}
