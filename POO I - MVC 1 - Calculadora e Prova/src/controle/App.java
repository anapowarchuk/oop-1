package controle;

import modelo.Soma;
import visao.Janela;

public class App {

	public static void main(String[] args) {
		Janela j = new Janela ();
		Soma s = new Soma ();
		j.setVisible(true);
		SomaControle scon =  new SomaControle (j,s);
		
	}
}
