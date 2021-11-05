package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Soma;
import visao.Janela;

public class SomaControle implements ActionListener {
	
	private Janela jan;
	private Soma som;
	
	public SomaControle (Janela j, Soma s) {
		this.jan = j;
		this.som = s;
		this.jan.getBtnLimpar().addActionListener(this);
		this.jan.getBtnSomar().addActionListener(this);
	}
	
	

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Somar")) {
			this.som.setPrimeiroNumero(Integer.parseInt(this.jan.getFieldPrimeiroNumero().getText()));
			this.som.setSegundoNumero(Integer.parseInt(this.jan.getFieldSegundoNumero().getText()));
			
			this.jan.getFieldResultadoSomas().setText(String.valueOf(som.Soma()));
			System.out.println();
		}
		
		if (e.getActionCommand().equals("Limpar")) {
			this.jan.Limpar();
		}
	}

}
