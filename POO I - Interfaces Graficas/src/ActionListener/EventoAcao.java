package ActionListener;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class EventoAcao extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel labelMSG;
	private JButton btnLimpar;
	
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
		
		JButton btnDisparar = new JButton("Disparar");
		btnDisparar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDisparar.setBounds(146, 38, 140, 23);
		contentPane.add(btnDisparar);
		btnDisparar.addActionListener(this);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimpar.setBounds(156, 82, 123, 23);
		contentPane.add(btnLimpar);
		btnLimpar.addActionListener(this);
		
		labelMSG = new JLabel("");
		labelMSG.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelMSG.setBounds(84, 144, 288, 70);
		contentPane.add(labelMSG);
	}

	public void limpar() {
		labelMSG.setText("");		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase("Disparar")) {
			labelMSG.setText("Funcionou");
		}
		if (e.getActionCommand().equalsIgnoreCase("Limpar")) {
			limpar();
		}
	}

}
