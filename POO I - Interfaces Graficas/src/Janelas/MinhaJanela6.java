package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class MinhaJanela6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaJanela6 frame = new MinhaJanela6();
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
	public MinhaJanela6() {
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
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		panel_1.add(btnLimpar);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

}
