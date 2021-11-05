package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Panel;
import javax.swing.JButton;

public class BlocoDeNotas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlocoDeNotas frame = new BlocoDeNotas();
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
	public BlocoDeNotas() {
		setTitle("Tela Bloco de Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmNovo = new JMenuItem("Novo");
		mnArquivo.add(mntmNovo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArquivo.add(mntmAbrir);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		mnEditar.add(mntmCopiar);
		
		JMenuItem mntmColar = new JMenuItem("Colar");
		mnEditar.add(mntmColar);
		
		JMenuItem mntmRecortar = new JMenuItem("Recortar");
		mnEditar.add(mntmRecortar);
		
		JMenuItem mntmLimpar = new JMenuItem("Limpar");
		mnEditar.add(mntmLimpar);
		
		JMenu mnFormatar = new JMenu("Formatar");
		menuBar.add(mnFormatar);
		
		JMenuItem mntmDesfazer = new JMenuItem("Desfazer");
		mnFormatar.add(mntmDesfazer);
		
		JMenu mnExibir = new JMenu("Exibir");
		menuBar.add(mnExibir);
		
		JMenuItem mntmBarraDeStatus = new JMenuItem("Barra de Status");
		mnExibir.add(mntmBarraDeStatus);
		
		JMenuItem mntmExibirAjuda = new JMenuItem("Exibir Ajuda");
		menuBar.add(mntmExibirAjuda);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnGravar = new JButton("Gravar");
		panel.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		panel.add(btnLimpar);
	}

}