package gerenciadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JanelaBorderLayout2 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaBorderLayout2 frame = new JanelaBorderLayout2();
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
	public JanelaBorderLayout2() {
		setTitle("Exemplo Border Layout 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setForeground(Color.WHITE);
		panel1.add(labelNome);
		
		fieldNome = new JTextField();
		panel1.add(fieldNome);
		fieldNome.setColumns(10);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Aperte aqui");
		panel2.add(btnNewButton, BorderLayout.CENTER);
	}

}