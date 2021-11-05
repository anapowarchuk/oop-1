package atividade1;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Painel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Painel() {
		setBackground(Color.PINK);
		
		JLabel lblNovaTela = new JLabel("NOVA TELA ");
		lblNovaTela.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblNovaTela);

	}

}