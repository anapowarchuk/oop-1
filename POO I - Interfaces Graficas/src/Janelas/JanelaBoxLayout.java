package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class JanelaBoxLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaBoxLayout frame = new JanelaBoxLayout();
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
	public JanelaBoxLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JButton btnBotao = new JButton("botao 1");
		contentPane.add(btnBotao);
		
		JButton btnBotao_1 = new JButton("botao 2");
		contentPane.add(btnBotao_1);
		
		JButton btnBotao_2 = new JButton("botao 3");
		contentPane.add(btnBotao_2);
		
		JButton btnBotao_3 = new JButton("botao 4");
		contentPane.add(btnBotao_3);
		
		JButton btnBotao_4 = new JButton("botao 5");
		contentPane.add(btnBotao_4);
		
		JButton btnBotao_5 = new JButton("botao 6");
		contentPane.add(btnBotao_5);
		
		JButton btnBotao_6 = new JButton("botao 7");
		contentPane.add(btnBotao_6);
		
		setResizable(true);
	}

}
