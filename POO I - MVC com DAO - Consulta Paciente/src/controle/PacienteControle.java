package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.JanelaPrincipal;

public class PacienteControle implements ActionListener {

	private PacienteDAO pacDao;
	private JanelaPrincipal jan;
	private Paciente pac;
	
	public PacienteControle(JanelaPrincipal j, Paciente p) {
		this.jan= j;
		this.pac = p;
		this.jan.getMenuItemCadastrar().addActionListener(this);
		this.jan.getMenuItemConsultar().addActionListener(this);
		this.jan.getMenuSair().addActionListener(this);
		this.jan.getTelaCad().getButtonCadastrar().addActionListener(this);
		this.jan.getTelaCon().getButtonConsultar().addActionListener(this);
		this.jan.getTelaCad().getButtonLimpar().addActionListener(this);
		this.jan.getTelaCon().getButtonConsultar().addActionListener(this);
		pacDao = new PacienteDAO();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("menuCad")) {
			this.jan.getTelaCad().limparCad();
			this.jan.setContentPane(this.jan.getTelaCad());
			this.jan.revalidate();
			this.jan.repaint();
		}
		
		if (e.getActionCommand().equals("menuCon")) {
			this.jan.getTelaCon().limparCon();
			this.jan.setContentPane(this.jan.getTelaCon());
			this.jan.revalidate();
			this.jan.repaint();
		}
		
		if (e.getActionCommand().equals("Cadastrar")) {
			String cpf = jan.getTelaCad().getLabelCPF().getText();
			String nome = jan.getTelaCad().getLabelNome().getText();
			String endereco = jan.getTelaCad().getLabelEndereco().getText();
			
			pac = new Paciente(cpf,nome,endereco);
			
			pacDao.cadastrarPaciente(pac);
			this.jan.getTelaCad().limparCad();
		}
		
		if (e.getActionCommand().equals("Consultar")) {
			String cpf = jan.getTelaCon().getFieldCPF().getText();
						
			pac = new Paciente(cpf, null, null);
			
			pacDao.cadastrarPaciente(pac);
			
			this.jan.getTelaCon().getFieldCPF().setText(pac.getCpf());
			this.jan.getTelaCon().getFieldNome().setText(pac.getNome());
			this.jan.getTelaCon().getFieldEnderco().setText(pac.getEndereco());
		}
		
		if (e.getActionCommand().equals("Limpar")) {
			this.jan.getTelaCad().limparCad();
			this.jan.getTelaCon().limparCon();
		}
		
		if (e.getActionCommand().equals("menuSair")) {
			System.exit(0);
		}
		
	}

	
}
