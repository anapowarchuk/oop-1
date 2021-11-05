package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField fieldUsuario;
	private JTextField fieldSenha;
	private JButton buttonAutenticar;
	private JButton buttonLimpar;
	
	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel painel1 = new JPanel();
		contentPane.add(painel1, BorderLayout.NORTH);
		
		JLabel labelLogin = new JLabel("Tela de Login");
		labelLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		painel1.add(labelLogin);
		
		JPanel painel2 = new JPanel();
		contentPane.add(painel2, BorderLayout.CENTER);
		painel2.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel labelUsuario = new JLabel("Usu\u00E1rio");
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painel2.add(labelUsuario);
		
		fieldUsuario = new JTextField();
		fieldUsuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel2.add(fieldUsuario);
		fieldUsuario.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painel2.add(labelSenha);
		
		fieldSenha = new JTextField();
		fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel2.add(fieldSenha);
		fieldSenha.setColumns(10);
		
		JPanel painel3 = new JPanel();
		contentPane.add(painel3, BorderLayout.SOUTH);
		
		buttonAutenticar = new JButton("Autenticar");
		painel3.add(buttonAutenticar);
		
		buttonLimpar = new JButton("Limpar");
		painel3.add(buttonLimpar);
	}

	public void limparTela() {
		fieldSenha.setText("");
		fieldUsuario.setText("");
	}
	
	public JTextField getFieldUsuario() {
		return fieldUsuario;
	}

	public void setFieldUsuario(JTextField fieldUsuario) {
		this.fieldUsuario = fieldUsuario;
	}

	public JTextField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JTextField fieldSenha) {
		this.fieldSenha = fieldSenha;
	}

	public JButton getButtonAutenticar() {
		return buttonAutenticar;
	}

	public void setButtonAutenticar(JButton buttonAutenticar) {
		this.buttonAutenticar = buttonAutenticar;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttoonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}
	
	

}