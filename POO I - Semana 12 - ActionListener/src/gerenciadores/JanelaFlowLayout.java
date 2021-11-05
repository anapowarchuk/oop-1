package gerenciadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaFlowLayout extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldIdade;
	private JTextField fieldEndereco;
	private JTextField fieldBairro;

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
		
		JLabel labelNome = new JLabel("Nome");
		contentPane.add(labelNome);
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome);
		fieldNome.setColumns(50);
		
		JLabel labelIdade = new JLabel("Idade");
		contentPane.add(labelIdade);
		
		fieldIdade = new JTextField();
		contentPane.add(fieldIdade);
		fieldIdade.setColumns(50);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		contentPane.add(labelEndereco);
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco);
		fieldEndereco.setColumns(50);
		
		JLabel labelBairro = new JLabel("Bairro");
		contentPane.add(labelBairro);
		
		fieldBairro = new JTextField();
		contentPane.add(fieldBairro);
		fieldBairro.setColumns(50);
	}

}