package modelo;

public class Login {
	private String usuario;
	private String senha;
	
	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	public Login() {
		super();
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autenticaUsuario(){
		if (usuario.equals("admin") && senha.equals("admin")){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
