package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JanelaMigLayout extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaMigLayout frame = new JanelaMigLayout();
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
	public JanelaMigLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 371);
		contentPane = new JPanel();
		contentPane.setToolTipText("Testando Mig Layout");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[485px,grow]", "[30px][grow][294px,grow][grow][33px]"));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 1,grow");
		
		JLabel lblTelaDeCadastro = new JLabel("Tela de Cadastro");
		lblTelaDeCadastro.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(lblTelaDeCadastro);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "cell 0 2,grow");
		panel_1.setLayout(new MigLayout("", "[grow][grow][][][][grow]", "[]20[]20[]20[grow]20[]20[grow]20[grow]"));// 20 é o espaçamento entre as linhas

		
		JLabel labelNome = new JLabel("Nome:");
		panel_1.add(labelNome, "cell 0 0 4 1,alignx left");
		
		fieldNome = new JTextField();
		panel_1.add(fieldNome, "cell 0 0 4 1,growx");
		fieldNome.setColumns(10);
		
		JLabel labelCPF = new JLabel("CPF:");
		labelCPF.setToolTipText("CPF");
		panel_1.add(labelCPF, "cell 4 0,alignx trailing");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 5 0,growx");
		textField.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o:");
		panel_1.add(labelEndereco, "cell 0 1 6 1,alignx left");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 0 1 6 1,grow");
		textField_1.setColumns(10);
		
		JLabel labelProfissao = new JLabel("Profiss\u00E3o:");
		panel_1.add(labelProfissao, "cell 0 2 6 1,alignx left");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("\r\nEngenheiro\r\nMedico\r\nDiretor\r\n");
		panel_1.add(comboBox, "cell 0 2 8 1,growx");
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, "cell 0 3 9 4,grow");
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "cell 0 3,grow");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		panel_2.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		panel_2.add(btnLimpar);
	}

}
