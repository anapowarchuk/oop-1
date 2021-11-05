package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonAbrirNovaJanela = new JButton("Abrir Nova Janela");
		buttonAbrirNovaJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				JFrame jan = new JFrame ("Nova Janela");
				jan.setBounds(250, 250, 477, 331);
				JLabel labelTitulo = new JLabel("Nova Tela!");
				jan.getContentPane().add(labelTitulo,BorderLayout.NORTH);
				jan.setVisible(true);
				
			}
		});
		buttonAbrirNovaJanela.setBounds(114, 59, 155, 23);
		contentPane.add(buttonAbrirNovaJanela);
		
		JButton buttonTrocarPainel = new JButton("Trocar Painel");
		buttonTrocarPainel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				getContentPane().removeAll();//removi os elementos da interface grafica
				setContentPane (new Painel());
				revalidate();//revalidar
				repaint();//pintar
			}
		});
		buttonTrocarPainel.setBounds(114, 93, 155, 23);
		contentPane.add(buttonTrocarPainel);
	}
}