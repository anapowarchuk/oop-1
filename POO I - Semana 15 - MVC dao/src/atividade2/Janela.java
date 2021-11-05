package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
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
import net.miginfocom.swing.MigLayout;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldEndereco;
	private JTextField fieldCPF;

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
		contentPane.setLayout(new MigLayout("", "[499px]", "[30px][255px][33px]"));

		//PAINEL 1
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, "cell 0 0,growx,aligny top");

		JLabel lblTelaDeCadastro = new JLabel("Tela de Cadastro");
		lblTelaDeCadastro.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel1.add(lblTelaDeCadastro);

		//PAINEL 2
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, "cell 0 1,grow");
		panel2.setLayout(new MigLayout("", "[grow][grow][][][][grow]",
				"[]20[]20[]20[grow]20[grow]20[]20[]20[grow]20[]20[]20[]20[]"));// 20 é o espaçamento entre as linhas

		JLabel labelNome = new JLabel("Nome");
		panel2.add(labelNome, "split 2,cell 0 0 4 1,alignx left");

		fieldNome = new JTextField();
		panel2.add(fieldNome, "cell 1 0 3 1,growx");// growx - expande x expanx
		fieldNome.setColumns(10);

		JLabel labelCpf = new JLabel("CPF");
		panel2.add(labelCpf, "cell 4 0,alignx trailing");

		fieldCPF = new JTextField();
		panel2.add(fieldCPF, "cell 5 0,growx");
		fieldCPF.setColumns(10);

		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		panel2.add(labelEndereco, "split 2,cell 0 1 6 1,alignx left");

		fieldEndereco = new JTextField();
		panel2.add(fieldEndereco, "cell 1 1 5 1,growx");
		fieldEndereco.setColumns(10);

		JLabel labelProfissao = new JLabel("Profiss\u00E3o");
		panel2.add(labelProfissao, "split 2,cell 0 2,alignx left");

		JComboBox<String> comboBoxProfissao = new JComboBox<String>();
		comboBoxProfissao.addItem("");
		comboBoxProfissao.addItem("Médico");
		comboBoxProfissao.addItem("Advogado");
		comboBoxProfissao.addItem("Engenheiro");
		panel2.add(comboBoxProfissao, "cell 1 2 2 1,growx");

		JScrollPane scrollPane = new JScrollPane();
		panel2.add(scrollPane, "cell 0 3 6 7,grow");

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		///
		JPanel panel3 = new JPanel();
		contentPane.add(panel3, "cell 0 2,growx,aligny top");

		JButton buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel3.add(buttonCadastrar);

		JButton buttonLimpar = new JButton("Limpar");
		panel3.add(buttonLimpar);
	}

}