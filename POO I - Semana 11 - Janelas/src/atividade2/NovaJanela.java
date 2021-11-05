package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class NovaJanela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JComboBox<String>comboBox;
	private JCheckBox chckbxDoador; 
	private ButtonGroup grupo;
	private JTextArea txtrProgramaoOrientadaA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaJanela frame = new NovaJanela();
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
	public NovaJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		grupo = new ButtonGroup();
				
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(323, 7, 105, 30);
		contentPane.add(rdbtnMasculino);
		grupo.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(323, 40, 105, 30);
		contentPane.add(rdbtnFeminino);
		grupo.add(rdbtnFeminino);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(68, 12, 202, 20);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		chckbxDoador = new JCheckBox("Doador");
		chckbxDoador.setBounds(173, 40, 97, 23);
		contentPane.add(chckbxDoador);
		
		JToggleButton tglbtnCadastrar = new JToggleButton("Cadastrar");
		tglbtnCadastrar.setBounds(30, 227, 87, 23);
		contentPane.add(tglbtnCadastrar);
		
		JToggleButton tglbtnLimpar = new JToggleButton("Limpar");
		tglbtnLimpar.setBounds(127, 227, 79, 23);
		contentPane.add(tglbtnLimpar);
		
		comboBox = new JComboBox <String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "item 1", "item 2", "item 3"}));
		comboBox.setBounds(68, 41, 99, 20);
		contentPane.add(comboBox);
		
		JList list = new JList();
		list.setBounds(53, 96, 25, -12);
		contentPane.add(list);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(22, 15, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblOpes = new JLabel("Op\u00E7\u00F5es");
		lblOpes.setBounds(22, 44, 46, 14);
		contentPane.add(lblOpes);
		
		JLabel lblEscrevaAqui = new JLabel("Escreva Aqui:");
		lblEscrevaAqui.setBounds(22, 115, 123, 14);
		contentPane.add(lblEscrevaAqui);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 140, 370, 76);
		contentPane.add(scrollPane);
		
		txtrProgramaoOrientadaA = new JTextArea();
		txtrProgramaoOrientadaA.setText("Programa\u00E7\u00E3o Orientada a Objetos I");
		scrollPane.setViewportView(txtrProgramaoOrientadaA);
		setTitle("Alguns Tipos de Componentes");

	}
	
	
	public void limparTela () {
		fieldNome.setText("");
		comboBox.setSelectedIndex(0);
		chckbxDoador.setSelected(false);
		grupo.clearSelection();
		}
}