package gerenciadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class JanelaBoxLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaBoxLayout frame = new JanelaBoxLayout();
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
	public JanelaBoxLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JButton btnBoto = new JButton("bot\u00E3o 1");
		contentPane.add(btnBoto);
		
		JButton btnBoto_1 = new JButton("bot\u00E3o 2");
		contentPane.add(btnBoto_1);
		
		JButton btnBoto_2 = new JButton("bot\u00E3o 3");
		contentPane.add(btnBoto_2);
		
		JButton btnBoto_3 = new JButton("bot\u00E3o 4");
		contentPane.add(btnBoto_3);
		
		JButton btnBoto_4 = new JButton("bot\u00E3o5");
		contentPane.add(btnBoto_4);
		
		JButton btnBoto_5 = new JButton("bot\u00E3o6");
		contentPane.add(btnBoto_5);
	}

}