package model;

public class Funcionario {
	
	private int idFuncionario;
	private String nome;
	private int idade;
	private int salario;

	public Funcionario(String nome, int idade, int salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
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
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
}