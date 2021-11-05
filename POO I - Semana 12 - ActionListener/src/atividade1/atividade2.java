package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import java.awt.Choice;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Component;

public class atividade2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividade2 frame = new atividade2();
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
	public atividade2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(6, 50));
		textField.setSize(new Dimension(6, 50));
		textField.setAlignmentY(Component.TOP_ALIGNMENT);
		textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		textField.setMinimumSize(new Dimension(6, 50));
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		Panel panel = new Panel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblPrimeiroNmero = new JLabel("Primeiro N\u00FAmero");
		lblPrimeiroNmero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrimeiroNmero.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel.add(lblPrimeiroNmero);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(25);
		
		JLabel lblSegundoNmero = new JLabel("Segundo N\u00FAmero");
		lblSegundoNmero.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel.add(lblSegundoNmero);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(25);
		
		Panel panel_1 = new Panel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSomar = new JButton("Somar");
		panel_1.add(btnSomar);
		
		JButton btnLimpar = new JButton("Limpar");
		panel_1.add(btnLimpar);
	}

}