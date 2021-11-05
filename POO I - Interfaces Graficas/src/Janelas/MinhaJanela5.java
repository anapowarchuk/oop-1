package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;

public class MinhaJanela5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaJanela5 frame = new MinhaJanela5();
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
	public MinhaJanela5() {
		setTitle("CalculadoraSoma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextField textField = new JTextField();
		textField.setSize(new Dimension(6, 50));
		textField.setPreferredSize(new Dimension(6, 50));
		textField.setMinimumSize(new Dimension(6, 50));
		textField.setAlignmentY(Component.TOP_ALIGNMENT);
		textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(textField, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblPrimeiroNmero = new JLabel("Primeiro N\u00FAmero");
		lblPrimeiroNmero.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblPrimeiroNmero);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		panel.add(textField_1);
		textField_1.setColumns(25);
		
		JLabel lblSegundoNmero = new JLabel("Segundo N\u00FAmero");
		lblSegundoNmero.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblSegundoNmero);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(25);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton buttonSomar = new JButton("Somar");
		panel_1.add(buttonSomar);
		
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(buttonLimpar);
	}

}
