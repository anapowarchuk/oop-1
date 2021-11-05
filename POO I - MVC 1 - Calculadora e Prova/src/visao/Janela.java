package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldResultadoSomas;
	private JTextField fieldPrimeiroNumero;
	private JTextField fieldSegundoNumero;
	private JButton btnLimpar;
	private JButton btnSomar;
	private JLabel labelSegundoNumero;
	private JLabel labelPrimeiroNumero;
	private JMenuItem mntmSair;
		

	
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
		setTitle("PROVA 2 POO I ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		mnArquivo.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel painel1 = new JPanel();
		painel1.setBackground(Color.PINK);
		painel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(painel1, BorderLayout.NORTH);
		
		fieldResultadoSomas = new JTextField();
		fieldResultadoSomas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		painel1.add(fieldResultadoSomas);
		fieldResultadoSomas.setColumns(10);
		fieldResultadoSomas.setPreferredSize(new Dimension(600,70));
		
		JPanel painel2 = new JPanel();
		painel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		painel2.setBackground(Color.PINK);
		contentPane.add(painel2, BorderLayout.CENTER);
		
		labelPrimeiroNumero = new JLabel("Primeiro N\u00FAmero");
		labelPrimeiroNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		painel2.add(labelPrimeiroNumero);
		
		fieldPrimeiroNumero = new JTextField();
		fieldPrimeiroNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		painel2.add(fieldPrimeiroNumero);
		fieldPrimeiroNumero.setColumns(10);
		
		labelSegundoNumero = new JLabel("Segundo N\u00FAmero");
		labelSegundoNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		painel2.add(labelSegundoNumero);
		
		fieldSegundoNumero = new JTextField();
		fieldSegundoNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		painel2.add(fieldSegundoNumero);
		fieldSegundoNumero.setColumns(10);
		
		JPanel painel3 = new JPanel();
		painel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		painel3.setBackground(Color.PINK);
		contentPane.add(painel3, BorderLayout.SOUTH);
		
		btnSomar = new JButton("Somar");
		btnSomar.setFont(new Font("Tahoma", Font.BOLD, 14));
		painel3.add(btnSomar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		painel3.add(btnLimpar);
		setResizable(false);
	}
	
	public void Limpar() {
		fieldPrimeiroNumero.setText("");
		fieldSegundoNumero.setText("");
		fieldResultadoSomas.setText("");
	}
	
	
	public JTextField getFieldResultadoSomas() {
		return fieldResultadoSomas;
	}

	public void setFieldResultadoSomas(JTextField fieldResultadoSomas) {
		this.fieldResultadoSomas = fieldResultadoSomas;
	}

	public JTextField getFieldPrimeiroNumero() {
		return fieldPrimeiroNumero;
	}

	public void setFieldPrimeiroNumero(JTextField fieldPrimeiroNumero) {
		this.fieldPrimeiroNumero = fieldPrimeiroNumero;
	}

	public JTextField getFieldSegundoNumero() {
		return fieldSegundoNumero;
	}

	public void setFieldSegundoNumero(JTextField fieldSegundoNumero) {
		this.fieldSegundoNumero = fieldSegundoNumero;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnSomar() {
		return btnSomar;
	}

	public void setBtnSomar(JButton btnSomar) {
		this.btnSomar = btnSomar;
	}

	public JLabel getLabelSegundoNumero() {
		return labelSegundoNumero;
	}

	public void setLabelSegundoNumero(JLabel labelSegundoNumero) {
		this.labelSegundoNumero = labelSegundoNumero;
	}

	public JLabel getLabelPrimeiroNumero() {
		return labelPrimeiroNumero;
	}

	public void setLabelPrimeiroNumero(JLabel labelPrimeiroNumero) {
		this.labelPrimeiroNumero = labelPrimeiroNumero;
	}

	public JMenuItem getMntmSair() {
		return mntmSair;
	}

	public void setMntmSair(JMenuItem mntmSair) {
		this.mntmSair = mntmSair;
	}
	
	

	
	
}
