package model;

public class Cliente {

	private int idCliente;
	private String nome;
	private int idade;
	private String cpf;
	private String genero;
	
/*	public Cliente(String nome, int idade, String cpf, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
	}*/

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}