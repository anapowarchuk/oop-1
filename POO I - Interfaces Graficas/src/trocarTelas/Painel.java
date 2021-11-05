package trocarTelas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Painel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Painel() {
		setBackground(Color.PINK);
		setLayout(null);
		
		JLabel lblPainel = new JLabel("PAINEL");
		lblPainel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPainel.setBounds(175, 89, 224, 98);
		add(lblPainel);

	}
}
