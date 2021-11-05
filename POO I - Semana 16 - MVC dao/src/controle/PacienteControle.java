package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.JanelaPrincipal;

public class PacienteControle implements ActionListener {
	
	
	private JanelaPrincipal jan;
	private Paciente pac;
	private PacienteDAO pdao;

	public PacienteControle(JanelaPrincipal j, Paciente p)
	{
		this.jan=j;
		this.pac=p;
		this.jan.getMntmCadastrar().addActionListener(this);
		this.jan.getMntmConsultar().addActionListener(this);
		this.jan.getTcad().getBtnCadastrar().addActionListener(this);
		this.jan.getTcon().getBtnConsultar().addActionListener(this);
		this.jan.getTcad().getBtnLimpar().addActionListener(this);
		this.jan.getTcon().getBtnLimpar().addActionListener(this);
		pdao=new PacienteDAO();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("menuCad"))
		{
			this.jan.getTcad().limpar();
			this.jan.setContentPane(this.jan.getTcad());
			this.jan.revalidate();
			this.jan.repaint();
		}
		
		if(arg0.getActionCommand().equals("menuCon"))
		{
			this.jan.getTcon().limpar();
			this.jan.setContentPane(this.jan.getTcon());
			this.jan.revalidate();
			this.jan.repaint();
		}
		
		if(arg0.getActionCommand().equals("Cadastrar"))
		{
			String cpf= this.jan.getTcad().getFieldCPF().getText();
			String nome=this.jan.getTcad().getFieldNome().getText();
			String end=this.jan.getTcad().getFieldEndereço().getText();
			
			pac= new Paciente(cpf,nome,end);
			
			pdao.cadastrarPaciente(pac);
			this.jan.getTcad().limpar();
			
		}
		
		if(arg0.getActionCommand().equals("Consultar"))
		{
			String cpf= this.jan.getTcon().getFieldCPF().getText();		
			
			pac= new Paciente(cpf,null, null);
			
			pdao.consultarPaciente(pac);
		
			this.jan.getTcon().getFieldCPF().setText(pac.getCpf());
			this.jan.getTcon().getFieldNome().setText(pac.getNome());
			this.jan.getTcon().getFieldEndereço().setText(pac.getEndereco());
			
		}
		
		if(arg0.getActionCommand().equals("Limpar"))
		{
			this.jan.getTcad().limpar();
			this.jan.getTcon().limpar();
		}
		
	}
	
	

}
//mvc com final de gravacao em arquivo - registro em arquivo 