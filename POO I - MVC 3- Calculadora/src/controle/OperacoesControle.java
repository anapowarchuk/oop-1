package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Operacoes;
import visao.Janela;

public class OperacoesControle implements ActionListener{
	private Janela jan;
	private Operacoes op;
	
	public OperacoesControle(Janela jan, Operacoes op) {
		super();
		this.jan = jan;
		this.op = op;
		this.jan.getButtonMultiplicacao().addActionListener(this);
		this.jan.getButtonDivisao().addActionListener(this);
		this.jan.getButtonSoma().addActionListener(this);
		this.jan.getButtonSubtracao().addActionListener(this);
		this.jan.getButtonLimpar().addActionListener(this);
		this.jan.getButtonSair().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("+")) {
			this.op.setN1(Integer.parseInt(jan.getFieldN1().getText()));
			this.op.setN2(Integer.parseInt(jan.getFieldN2().getText()));
			
			this.jan.getFieldResultado().setText(String.valueOf(op.soma()));
			
		}
		
		if (e.getActionCommand().equals("-")){
			this.op.setN1(Integer.parseInt(jan.getFieldN1().getText()));
			this.op.setN2(Integer.parseInt(jan.getFieldN2().getText()));
			
			this.jan.getFieldResultado().setText(String.valueOf(op.subtracao()));
		}
		
		if (e.getActionCommand().equals("*")) {
			this.op.setN1(Integer.parseInt(jan.getFieldN1().getText()));
			this.op.setN2(Integer.parseInt(jan.getFieldN2().getText()));
			
			this.jan.getFieldResultado().setText(String.valueOf(op.multiplicacao()));
		}
		
		if (e.getActionCommand().equals("/")) {
			this.op.setN1(Integer.parseInt(jan.getFieldN1().getText()));
			this.op.setN2(Integer.parseInt(jan.getFieldN2().getText()));
			
			this.jan.getFieldN1().setText(String.valueOf(op.divisao()));
		}
		
		if (e.getActionCommand().equals("Limpar")) {
			this.jan.limpar();
		}
	}
	

	
}
