package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MinhaJanela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaJanela frame = new MinhaJanela();
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
	public MinhaJanela() {
		setTitle("Minha Primeira Janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem menuItemNovo = new JMenuItem("Novo");
		menuArquivo.add(menuItemNovo);
		
		JMenuItem menuItemSalvar = new JMenuItem("Salvar");
		menuArquivo.add(menuItemSalvar);
		
		JMenuItem menuItemFechar = new JMenuItem("Fechar");
		menuArquivo.add(menuItemFechar);
		
		JMenu menuEditar = new JMenu("Editar");
		menuBar.add(menuEditar);
		
		JMenuItem menuItemCopiar = new JMenuItem("Copiar");
		menuEditar.add(menuItemCopiar);
		
		JMenuItem menuItemColar = new JMenuItem("Colar");
		menuEditar.add(menuItemColar);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonAperteAqui = new JButton("APERTE AQUI");
		buttonAperteAqui.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAperteAqui.setBounds(10, 159, 126, 70);
		contentPane.add(buttonAperteAqui);
	}
}
