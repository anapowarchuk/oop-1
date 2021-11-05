package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Login;
import visao.TelaLogin;

public class LoginControle implements ActionListener {

	private Login lo;
	private TelaLogin te;

	public LoginControle(TelaLogin t, Login l) {
		this.te = t;
		this.lo = l;
		this.te.getButtonAutenticar().addActionListener(this);
		this.te.getButtonLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Autenticar")) {
			this.lo.setUsuario(this.te.getFieldUsuario().getText());
			this.lo.setSenha(this.te.getFieldSenha().getText());

			if (lo.autenticaUsuario()) {
				System.out.println("Autenticou com sucesso!");
			} else {
				System.out.println("Erro na autenticação");
				this.te.limparTela();
			}
		}

		if (e.getActionCommand().equals("Limpar")) {
			this.te.limparTela();
		}

	}
}
