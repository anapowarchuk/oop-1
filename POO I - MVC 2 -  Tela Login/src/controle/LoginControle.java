package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Login;
import visao.TelaLogin;

public class LoginControle implements ActionListener {

	private TelaLogin tela;
	private Login login;

	public LoginControle(TelaLogin t, Login l) {
		this.tela=t;
		this.login=l;
		this.tela.getBtnAutenticar().addActionListener(this);
		this.tela.getBtnLimpar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Autenticar")) {
			this.login.setUsuario(this.tela.getFieldUsuario().getText());
			this.login.setSenha(this.tela.getFieldSenha().getText());
			
			if (login.autenticaUsuario()) {
				System.out.println("Autenticou com sucesso");
			}
			else {
				System.out.println("Erro na autenticação");
				this.tela.limparTela();
			}
		}
		if (e.getActionCommand().equals("Limpar")) {
			tela.limparTela();
		}
	}

}
