package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.Janela;

public class PacienteControle implements ActionListener {
	
	private Paciente pa;
	private Janela ja;
	private PacienteDAO pdao;
	

	public PacienteControle(Paciente pa, Janela ja) {
		super();
		this.pa = pa;
		this.ja = ja;
		
		this.ja.getButtonCadastrar().addActionListener(this);
		pdao = new PacienteDAO();
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Cadastrar")) {
			String nomeAux = this.ja.getFieldNome().getText();
			String endAux = this.ja.getFieldEndereco().getText();
			String cpfAux = this.ja.getFieldCPF().getText();
			String profAux = (String) this.ja.getComboBoxProfissao().getSelectedItem();
			Paciente pac = new Paciente (nomeAux, endAux, cpfAux, profAux);
			
			pdao.cadastrarPaciente(pac);
			
		
		}
	
	}
}