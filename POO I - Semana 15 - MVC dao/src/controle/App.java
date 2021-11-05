package controle;

import modelo.Paciente;
import visao.Janela;

public class App {
	
 
	public static void main(String[] args) {
		Janela j = new Janela ();
		Paciente p = new Paciente();
		j.setVisible(true);
		
		PacienteControle pcon = new PacienteControle (p,j);
	}
}