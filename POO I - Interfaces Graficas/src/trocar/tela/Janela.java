package trocar.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JButton buttonNovaJanela;
	private JButton btnNewButton;

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

		buttonNovaJanela = new JButton("Abrir Nova Janela");
		buttonNovaJanela.setBounds(54, 111, 117, 23);
		buttonNovaJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JFrame jan = new JFrame("Nova Janela");
				jan.setBounds(250, 250, 477, 331);
				JLabel labelTitulo = new JLabel("Nova Tela!");
				jan.getContentPane().add(labelTitulo, BorderLayout.NORTH);
				jan.setVisible(true);

			}

		});

		contentPane.add(buttonNovaJanela);

		btnNewButton = new JButton("Trocar Painel");
		btnNewButton.setBounds(225, 111, 123, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();// removi os elementos da interface grafica
				setContentPane(new Painel());
				revalidate();// revalidar
				repaint();// pintar
			}
		});
	}

}
