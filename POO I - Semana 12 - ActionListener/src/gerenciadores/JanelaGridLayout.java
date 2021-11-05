package gerenciadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class JanelaGridLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaGridLayout frame = new JanelaGridLayout();
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
	public JanelaGridLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 0, 0));
		
		JButton Botao1 = new JButton("New button");
		contentPane.add(Botao1);
		
		JButton Botao2 = new JButton("New button");
		contentPane.add(Botao2);
		
		JButton Botao3 = new JButton("New button");
		contentPane.add(Botao3);
		
		JButton Botao4 = new JButton("New button");
		contentPane.add(Botao4);
		
		JButton Botao5 = new JButton("New button");
		contentPane.add(Botao5);
	}

}