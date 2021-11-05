package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class JanelaFlowLayout extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaFlowLayout frame = new JanelaFlowLayout();
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
	public JanelaFlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNome = new JLabel("Nome");
		contentPane.add(lblNome);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(50);
		
		JLabel lblNewLabel = new JLabel("Idade");
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1);
		textField_1.setColumns(50);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		contentPane.add(lblEndereo);
		
		textField_2 = new JTextField();
		contentPane.add(textField_2);
		textField_2.setColumns(50);
		
		JLabel lblBairro = new JLabel("Bairro");
		contentPane.add(lblBairro);
		
		textField_3 = new JTextField();
		contentPane.add(textField_3);
		textField_3.setColumns(50);
	}

}
