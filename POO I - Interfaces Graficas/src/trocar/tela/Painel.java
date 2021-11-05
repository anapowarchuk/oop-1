package trocar.tela;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Painel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Painel() {
		setBackground(Color.PINK);
		
		JLabel lblNovaTela = new JLabel("NOVA TELA");
		lblNovaTela.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovaTela.setForeground(new Color(0, 0, 0));
		lblNovaTela.setFont(new Font("Tahoma", Font.BOLD, 30));
		add(lblNovaTela);

	}

}
