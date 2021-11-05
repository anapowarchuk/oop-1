package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MinhaJanela3 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JComboBox<String>comboBox;
	private JCheckBox chckbxDoador; 
	private ButtonGroup grupo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaJanela3 frame = new MinhaJanela3();
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
	public MinhaJanela3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		grupo = new ButtonGroup();
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 11, 46, 14);
		contentPane.add(labelNome);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(58, 8, 239, 20);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		JLabel labelOpcoes = new JLabel("Op\u00E7\u00F5es");
		labelOpcoes.setBounds(10, 50, 46, 14);
		contentPane.add(labelOpcoes);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "item 1", "item 2", "item 3"}));
		comboBox.setBounds(58, 47, 164, 20);
		contentPane.add(comboBox);
		
		JCheckBox checkBoxDoador = new JCheckBox("Doador");
		checkBoxDoador.setBounds(232, 46, 85, 23);
		contentPane.add(checkBoxDoador);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(319, 11, 109, 23);
		contentPane.add(rdbtnFeminino);
		grupo.add(rdbtnFeminino);

		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(319, 37, 109, 23);
		contentPane.add(rdbtnMasculino);
		grupo.add(rdbtnMasculino);
		
		JLabel lblEscrevaAqui = new JLabel("Escreva Aqui");
		lblEscrevaAqui.setBounds(10, 123, 97, 14);
		contentPane.add(lblEscrevaAqui);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setBounds(18, 216, 89, 23);
		contentPane.add(btnCadastro);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(157, 216, 89, 23);
		contentPane.add(btnLimpar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(117, 112, 166, 82);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
