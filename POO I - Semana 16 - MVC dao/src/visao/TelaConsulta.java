package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaConsulta extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextField fieldEndereço;
	private JButton btnConsultar;
	private JButton btnLimpar;

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(new MigLayout("", "[][][grow]", "[][][][][][grow]"));
		
		JLabel lblTelaDeCadastro = new JLabel("TELA DE CONSULTA");
		lblTelaDeCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblTelaDeCadastro, "cell 0 0");
		
		JLabel lblCpf = new JLabel("CPF");
		add(lblCpf, "flowx,cell 0 2 3 1");
		
		fieldCPF = new JTextField();
		add(fieldCPF, "split 2,cell 0 2,alignx left");
		fieldCPF.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		add(lblNome, "flowx,cell 1 2,alignx trailing");
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		add(lblEndereo, "flowx,cell 0 3 3 1");
		
		fieldEndereço = new JTextField();
		add(fieldEndereço, "cell 0 3 3 1,growx");
		fieldEndereço.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		add(btnConsultar, "flowx,cell 0 5,alignx left,aligny bottom");
		
		btnLimpar = new JButton("Limpar");
		add(btnLimpar, "cell 0 5,aligny bottom");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 0 2 3 1,growx");
		fieldNome.setColumns(10);

	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldEndereço() {
		return fieldEndereço;
	}

	public void setFieldEndereço(JTextField fieldEndereço) {
		this.fieldEndereço = fieldEndereço;
	}


	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}
	
	public void limpar()
	{
		fieldCPF.setText("");
		fieldNome.setText("");
		fieldEndereço.setText("");
	}
	

}