package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField fieldUsuario;
	private JTextField fieldSenha;
	private JLabel labelSenha;
	private JLabel labelUsuario;
	private JButton buttonAutenticar;
	private JButton btnAutenticar;
	private JButton btnLimpar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel painel1 = new JPanel();
		contentPane.add(painel1, BorderLayout.NORTH);
		
		JLabel lblTelaLogin = new JLabel("TELA LOGIN");
		lblTelaLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		painel1.add(lblTelaLogin);
		
		JPanel painel2 = new JPanel();
		contentPane.add(painel2, BorderLayout.CENTER);
		painel2.setLayout(new GridLayout(0, 1, 0, 0));
		
		labelUsuario = new JLabel("Usu\u00E1rio");
		painel2.add(labelUsuario);
		
		fieldUsuario = new JTextField();
		painel2.add(fieldUsuario);
		fieldUsuario.setColumns(50);
		
		labelSenha = new JLabel("Senha");
		painel2.add(labelSenha);
		
		fieldSenha = new JTextField();
		fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel2.add(fieldSenha);
		fieldSenha.setColumns(50);
		
		JPanel painel3 = new JPanel();
		contentPane.add(painel3, BorderLayout.SOUTH);
		
		btnAutenticar = new JButton("Autenticar");
		painel3.add(btnAutenticar);
		
		btnLimpar = new JButton("Limpar");
		painel3.add(btnLimpar);
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

	public JLabel getLabelSenha() {
		return labelSenha;
	}

	public void setLabelSenha(JLabel labelSenha) {
		this.labelSenha = labelSenha;
	}

	public JLabel getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(JLabel labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public JButton getButtonAutenticar() {
		return buttonAutenticar;
	}

	public void setButtonAutenticar(JButton buttonAutenticar) {
		this.buttonAutenticar = buttonAutenticar;
	}

	public JButton getBtnAutenticar() {
		return btnAutenticar;
	}

	public void setBtnAutenticar(JButton btnAutenticar) {
		this.btnAutenticar = btnAutenticar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	
	
}
