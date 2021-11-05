package visao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class TelaCadastro extends JPanel {
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextField fieldEnderco;
	private JButton buttonCadastrar;
	private JButton buttonLimpar;
	private JLabel labelEndereco;
	private JLabel labelNome;
	private JLabel labelCPF;

	/**
	 * Create the panel.
	 */
	public TelaCadastro() {
		setLayout(new MigLayout("", "[][][grow]", "[][][][][][][]"));

		JLabel labelTelaConsulta = new JLabel("Tela Cadastro");
		labelTelaConsulta.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(labelTelaConsulta, "cell 0 0");

		labelCPF = new JLabel("Cpf");
		add(labelCPF, "flowx,cell 0 2");

		fieldCPF = new JTextField();
		add(fieldCPF, "cell 0 2, growx");
		fieldCPF.setColumns(10);

		labelNome = new JLabel("Nome");
		add(labelNome, "cell 1 2,alignx trailing");

		fieldNome = new JTextField();
		add(fieldNome, "cell 2 2 ,growx");
		fieldNome.setColumns(10);

		labelEndereco = new JLabel("Endere\u00E7o");
		add(labelEndereco, "flowx,cell 0 4 3 1");

		fieldEnderco = new JTextField();
		add(fieldEnderco, "cell 0 4 3 1,growx");
		fieldEnderco.setColumns(10);

		buttonCadastrar = new JButton("Cadastrar");
		add(buttonCadastrar, "flowx,cell 0 6");

		buttonLimpar = new JButton("Limpar");
		add(buttonLimpar, "cell 0 6");

	}

	public void limparCad () {
		fieldCPF.setText("");
		fieldNome.setText("");
		fieldEnderco.setText("");
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

	public JTextField getFieldEnderco() {
		return fieldEnderco;
	}

	public void setFieldEnderco(JTextField fieldEnderco) {
		this.fieldEnderco = fieldEnderco;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JLabel getLabelEndereco() {
		return labelEndereco;
	}

	public void setLabelEndereco(JLabel labelEndereco) {
		this.labelEndereco = labelEndereco;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JLabel getLabelCPF() {
		return labelCPF;
	}

	public void setLabelCPF(JLabel labelCPF) {
		this.labelCPF = labelCPF;
	}

}
