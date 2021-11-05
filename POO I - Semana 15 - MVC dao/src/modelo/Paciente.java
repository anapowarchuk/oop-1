package modelo;

public class Paciente {
	
	String nome;
	String endereco;
	String cpf;
	String profissao;
	
	public Paciente(String nome, String endereco, String cpf, String profissao) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public Paciente() {
		
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	

	
}