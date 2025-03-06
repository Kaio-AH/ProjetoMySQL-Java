package controller;

import model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

	private List<Funcionario> funcionarios;
	private int nextId;
	
	public FuncionarioController() {
		this.funcionarios = new ArrayList<>();
		this.nextId = 1;
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionario.setIdFuncionario(nextId++);
		funcionarios.add(funcionario);
	}
	
	public List<Funcionario> listarFuncionarios() {
		return funcionarios;
	}
}