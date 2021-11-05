package arquivo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnCriarArquivo = new JButton("Criar Arquivo");
		btnCriarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File arquivo = new File("exemplo1.txt");
				
				try {
					FileWriter fw = new FileWriter(arquivo, true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write ("C\n");
					bw.write ("A\n");
					bw.write ("N\n");
					bw.write ("S\n");
					bw.write ("A\n");
					bw.write ("D\n");
					bw.write ("A\n");
					
					bw.flush();
					fw.close();
					bw.close();
					
				} catch (IOException e1) {
					
					
					e1.printStackTrace();
				}
				
				
			}
			
		});
		contentPane.add(btnCriarArquivo, BorderLayout.CENTER);
	}

}
