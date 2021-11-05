package modelo;

public class Paciente {

	String cpf;
	String nome;
	String endereco;

	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Paciente(String cpf, String nome, String endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
