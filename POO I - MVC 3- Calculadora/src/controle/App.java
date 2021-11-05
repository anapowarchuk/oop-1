package controle;

import modelo.Operacoes;
import visao.Janela;

public class App {

	public static void main(String[] args) {
		Janela j = new Janela();
		Operacoes op = new Operacoes ();
		j.setVisible(true);
		
		OperacoesControle opC =  new OperacoesControle(j, op);
		
	}
}
