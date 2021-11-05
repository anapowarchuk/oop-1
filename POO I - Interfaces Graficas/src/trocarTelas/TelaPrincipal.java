package trocarTelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnNovaJanela;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNovaJanela = new JButton("Nova Janela");
		btnNovaJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame jan = new JFrame ("Nova Janela");
				jan.setBounds(100, 100, 450, 300);
				JLabel label = new JLabel ("Nova Tela!!!!");
				jan.getContentPane().add(label,BorderLayout.NORTH);
				jan.setVisible(true);
				
			}
		});
		btnNovaJanela.setBounds(125, 90, 190, 23);
		contentPane.add(btnNovaJanela);
		
		JButton btnTrocarPainel = new JButton("Trocar Painel");
		btnTrocarPainel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Painel pan = new Painel ();
				getContentPane().removeAll();
				setContentPane(new Painel());
				revalidate();
				repaint();
			}
		});
		btnTrocarPainel.setBounds(125, 124, 190, 23);
		contentPane.add(btnTrocarPainel);
	}
}
