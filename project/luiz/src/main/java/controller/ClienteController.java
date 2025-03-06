package controller;

import java.util.List;
import model.Cliente;
import dao.ClienteDAO;
import controller.ClienteController;

public class ClienteController {

	private ClienteDAO clienteDAO;
	
	public ClienteController() {
		clienteDAO = new ClienteDAO();
	}
	
	public void adicionarCliente(String nome, int idade, String cpf, String genero) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setIdade(idade);
		cliente.setCpf(cpf);
		cliente.setGenero(genero);
		clienteDAO.adicionar(cliente);
	}
	
	public List<Cliente> listarClientes() {
		return clienteDAO.listar();
	}
	
	public void atualizarCliente(int id, String nome, int idade, String cpf, String genero) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(id);
		cliente.setNome(nome);
		cliente.setIdade(idade);
		cliente.setCpf(cpf);
		cliente.setGenero(genero);
		clienteDAO.atualizar(cliente);
	}
	
	public void deletarCliente(int idCliente) {
		clienteDAO.delete(idCliente);
	}
}
