package controle;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.JanelaPrincipal;

public class App {

	public static void main(String[] args) {
		JanelaPrincipal j = new JanelaPrincipal();
		j.setVisible(true);
		Paciente p = new Paciente();

		PacienteControle pcon = new PacienteControle(j, p);

	}
}
