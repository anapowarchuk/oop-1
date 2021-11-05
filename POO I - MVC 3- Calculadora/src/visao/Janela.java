package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldResultado;
	private JTextField fieldN1;
	private JTextField fieldN2;
	private JLabel labelResultado;
	private JButton buttonDivisao;
	private JButton buttonMultiplicacao;
	private JLabel labelN2;
	private JButton buttonSubtracao;
	private JLabel labelN1;
	private JButton buttonSoma;
	private JButton buttonLimpar;
	private JButton buttonSair;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][][grow]", "[][][][][][][][][]"));
		
		buttonSoma = new JButton("+");
		contentPane.add(buttonSoma, "cell 2 0,growx");
		
		labelN1 = new JLabel("PRIMEIRO N\u00DAMERO");
		contentPane.add(labelN1, "cell 0 1,alignx center");
		
		buttonSubtracao = new JButton("-");
		contentPane.add(buttonSubtracao, "cell 2 1,growx");
		
		labelN2 = new JLabel("SEGUNDO N\u00DAMERO");
		contentPane.add(labelN2, "cell 4 1,alignx center");
		
		fieldN1 = new JTextField();
		contentPane.add(fieldN1, "cell 0 2,growx");
		fieldN1.setColumns(10);
		
		buttonMultiplicacao = new JButton("*");
		contentPane.add(buttonMultiplicacao, "cell 2 2,growx");
		
		fieldN2 = new JTextField();
		contentPane.add(fieldN2, "cell 4 2,growx");
		fieldN2.setColumns(10);
		
		buttonDivisao = new JButton("/");
		contentPane.add(buttonDivisao, "cell 2 3,growx");
		
		labelResultado = new JLabel("RESULTADO");
		contentPane.add(labelResultado, "cell 2 5,alignx center");
		
		fieldResultado = new JTextField();
		contentPane.add(fieldResultado, "cell 0 6 5 1,growx");
		fieldResultado.setColumns(10);
		
		buttonLimpar = new JButton("LIMPAR");
		contentPane.add(buttonLimpar, "cell 0 8,growx,alignx center");
		
		buttonSair = new JButton("SAIR");
		contentPane.add(buttonSair, "cell 4 8,growx,alignx center");
	}

	public JTextField getFieldResultado() {
		return fieldResultado;
	}

	public void setFieldResultado(JTextField fieldResultado) {
		this.fieldResultado = fieldResultado;
	}

	public JTextField getFieldN1() {
		return fieldN1;
	}

	public void setFieldN1(JTextField fieldN1) {
		this.fieldN1 = fieldN1;
	}

	public JTextField getFieldN2() {
		return fieldN2;
	}

	public void setFieldN2(JTextField fieldN2) {
		this.fieldN2 = fieldN2;
	}

	public JLabel getLabelResultado() {
		return labelResultado;
	}

	public void setLabelResultado(JLabel labelResultado) {
		this.labelResultado = labelResultado;
	}

	public JButton getButtonDivisao() {
		return buttonDivisao;
	}

	public void setButtonDivisao(JButton buttonDivisao) {
		this.buttonDivisao = buttonDivisao;
	}

	public JButton getButtonMultiplicacao() {
		return buttonMultiplicacao;
	}

	public void setButtonMultiplicacao(JButton buttonMultiplicacao) {
		this.buttonMultiplicacao = buttonMultiplicacao;
	}

	public JLabel getLabelN2() {
		return labelN2;
	}

	public void setLabelN2(JLabel labelN2) {
		this.labelN2 = labelN2;
	}

	public JButton getButtonSubtracao() {
		return buttonSubtracao;
	}

	public void setButtonSubtracao(JButton buttonSubtracao) {
		this.buttonSubtracao = buttonSubtracao;
	}

	public JLabel getLabelN1() {
		return labelN1;
	}

	public void setLabelN1(JLabel labelN1) {
		this.labelN1 = labelN1;
	}

	public JButton getButtonSoma() {
		return buttonSoma;
	}

	public void setButtonSoma(JButton buttonSoma) {
		this.buttonSoma = buttonSoma;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JButton getButtonSair() {
		return buttonSair;
	}

	public void setButtonSair(JButton buttonSair) {
		this.buttonSair = buttonSair;
	}
	
	public void limpar () {
		fieldN1.setText("");
		fieldN2.setText("");
		fieldResultado.setText("");
	}
	

}
