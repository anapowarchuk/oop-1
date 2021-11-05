package atividade1;

public class ListaEncadeada {
	private No primeiro;

	// Construtor da lista
	public ListaEncadeada() {
		this.primeiro = null;
	}
	
	// Verifica se a lista esta vazia
		public boolean estaVazia() {
			if (this.primeiro == null) {
				return true;
			}
			return false;
		}

	// Adicionar no inicio da lista
	public void adicionarInicio(String letra) {
		No novo = new No(letra, primeiro);
		primeiro = novo;
	}

	// Imprime a lista
	public void imprimir() {
		No aux;
		for (aux = primeiro; aux != null; aux = aux.getProximo()) {
			System.out.print(aux.getLetra() + " - ");
		}
	}
}
