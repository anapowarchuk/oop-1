package controle;

import modelo.Login;
import visao.TelaLogin;

public class App {

	public static void main(String[] args) {
		TelaLogin t = new TelaLogin();
		Login m = new Login();
		t.setVisible(true);
		LoginControle con = new LoginControle (t,m);
		
	}
}
