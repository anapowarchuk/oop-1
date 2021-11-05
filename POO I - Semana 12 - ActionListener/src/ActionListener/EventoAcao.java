package ActionListener;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoAcao extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel labelMSG;
	private JButton buttonLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventoAcao frame = new EventoAcao();
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
	public EventoAcao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDispararEvento = new JButton("Disparar evento");
		btnDispararEvento.setBounds(10, 29, 151, 23);
		btnDispararEvento.addActionListener(this);
		contentPane.add(btnDispararEvento);
		
		labelMSG = new JLabel("");
		labelMSG.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelMSG.setBounds(85, 130, 268, 14);
		contentPane.add(labelMSG);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBounds(171, 40, 89, 23);
		buttonLimpar.addActionListener(this);
		contentPane.add(buttonLimpar);
	}
	
	public void limpar() {
		labelMSG.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase("Disparar Evento")) {
			labelMSG.setText("Funcionou!!");
			
		}
		
		if (e.getActionCommand().equalsIgnoreCase("Limpar")) {
			limpar();
		}
		
	}
}