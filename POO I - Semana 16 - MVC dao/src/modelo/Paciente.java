package modelo;

public class Paciente {
	
	private String cpf;
	private String endereco;
	private String nome;
	

	public Paciente(String cpf, String endereco, String nome) {
		super();
		this.cpf = cpf;
		this.endereco = endereco;
		this.nome = nome;
	}
	
	public Paciente() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}