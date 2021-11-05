package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldEndereco;
	private JTextField fieldCPF;
	private JButton buttonLimpar;
	private JButton buttonCadastrar;
	private JComboBox<String> comboBoxProfissao;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setTitle("Testando MigLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JLabel lblTelaDeCadastro = new JLabel("Tela de Cadastro");
		lblTelaDeCadastro.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel1.add(lblTelaDeCadastro);
		
		JPanel panel3 = new JPanel();
		contentPane.add(panel3, BorderLayout.CENTER);
		panel3.setLayout(new MigLayout("", "[grow][grow][][][][grow]", "[]20[]20[]20[grow]20[grow]20[]20[]20[grow]20[]20[]20[]20[]"));//20 é o espaçamento entre as linhas 
		
		JLabel labelNome = new JLabel("Nome");
		panel3.add(labelNome, "split 2,cell 0 0 4 1,alignx left");
		
		fieldNome = new JTextField();
		panel3.add(fieldNome, "cell 1 0 3 1,growx");//growx - expande x expanx
		fieldNome.setColumns(10);
		
		JLabel labelCpf = new JLabel("CPF");
		panel3.add(labelCpf, "cell 4 0,alignx trailing");
		
		fieldCPF = new JTextField();
		panel3.add(fieldCPF, "cell 5 0,growx");
		fieldCPF.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		panel3.add(labelEndereco, "split 2,cell 0 1 6 1,alignx left");
		
		fieldEndereco = new JTextField();
		panel3.add(fieldEndereco, "cell 1 1 5 1,growx");
		fieldEndereco.setColumns(10);
		
		JLabel labelProfissao = new JLabel("Profiss\u00E3o");
		panel3.add(labelProfissao, "split 2,cell 0 2,alignx left");
		
		comboBoxProfissao = new JComboBox<String>();
		comboBoxProfissao.addItem ("");
		comboBoxProfissao.addItem ("Médico");
		comboBoxProfissao.addItem ("Advogado");
		comboBoxProfissao.addItem ("Engenheiro");
		panel3.add(comboBoxProfissao, "cell 1 2 2 1,growx");
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		panel3.add(scrollPane, "cell 0 3 6 7,grow");
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.SOUTH);
		
		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel2.add(buttonCadastrar);
		
		buttonLimpar = new JButton("Limpar");
		panel2.add(buttonLimpar);
	}

	public JComboBox<String> getComboBoxProfissao() {
		return comboBoxProfissao;
	}

	public void setComboBoxProfissao(JComboBox<String> comboBoxProfissao) {
		this.comboBoxProfissao = comboBoxProfissao;
	}


	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	
	
}