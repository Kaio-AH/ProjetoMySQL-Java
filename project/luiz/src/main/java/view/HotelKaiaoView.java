package view;

import controller.ClienteController;
import controller.ReservaController;
import controller.FuncionarioController;

import model.Cliente;
import model.Funcionario;
import model.Reserva;

import java.util.List;
import java.util.Scanner;

public class HotelKaiaoView {

	private ClienteController clienteController;
	private ReservaController reservaController;
	private FuncionarioController funcionarioController;
	private Scanner scanner;

	public HotelKaiaoView() {
		this.clienteController = new ClienteController();
		this.reservaController = new ReservaController();
		this.funcionarioController = new FuncionarioController();
		this.scanner = new Scanner(System.in);
	}
	
	public void iniciar() {
		while (true) {
			System.out.println("1 - Adicionar Clientes");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Adicionar Funcionarios");
			System.out.println("4 - Listar Funcionarios");
			System.out.println("5 - Adicionar Reservas");
			System.out.println("6 - Listar Reservas");
			System.out.println("7 - Sair");
			
			int escolha = scanner.nextInt();
			scanner.nextLine();
			
			switch (escolha) {
			
			case 1:	
				adicionarCliente();
				break;
			case 2:
				listarClientes();
				break;
			case 3:
				adicionarFuncionario();
				break;
			case 4:
				listarFuncionarios();
				break;
			case 5:
				adicionarReserva();
				break;
			case 6:
				listarReservas();
				break;
			case 7:
				System.out.println("Você saiu !");
				return;
			default:
				System.out.println("Escolha um número válido !");
			
			}
		}
	}
	
	private void adicionarCliente() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Cpf: ");
		String cpf = scanner.nextLine();
		
		System.out.print("Gênero: ");
		String genero = scanner.nextLine();
		
		//Cliente cliente = new Cliente(nome, idade, cpf, genero);
		
		//clienteController.adicionarCliente(cliente);
		
		System.out.println("Cliente adicionado com sucesso !");
	}
	
	private void listarClientes() {
		List<Cliente> clientes = clienteController.listarClientes();
		if (clientes != null) {
			for (Cliente cliente : clientes) {
				System.out.println("Nome: " + cliente.getNome() + ", Idade: " + cliente.getIdade() 
				+ ", Cpf: " + cliente.getCpf() + ", Gênero: " + cliente.getGenero());
			}
		}
		else {
			System.out.println("Nenhum cliente encontrado !");
		}
	}
	
	private void adicionarFuncionario() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Salário: ");
		int salario = Integer.parseInt(scanner.nextLine());
		
		Funcionario funcionario = new Funcionario(nome, idade, salario);
		
		funcionarioController.adicionarFuncionario(funcionario);
		
		System.out.println("Funcionario adicionado com sucesso !");
	}
	
	private void listarFuncionarios() {
		List<Funcionario> funcionarios = funcionarioController.listarFuncionarios();
		if (funcionarios != null) {
			for (Funcionario funcionario : funcionarios) {
				System.out.println("Nome: " + funcionario.getNome() + ", Idade: " + funcionario.getIdade()
				+ ", Salário: " + funcionario.getSalario());
			}
		}
		else {
			System.out.println("Nenhum funcionário encontrado !");
		}
	}
	
	private void adicionarReserva() {
		
		System.out.print("Quarto: ");
		int quarto = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Andar: ");
		int andar = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Checkin: ");
		String DataCheckin = scanner.nextLine();
		
		System.out.print("Checkout: ");
		String DataCheckout = scanner.nextLine();
		
		Reserva reserva = new Reserva(quarto, andar, DataCheckin, DataCheckout);
		
		reservaController.adicionarReserva(reserva);
		
		System.out.println("Funcionario adicionado com sucesso !");
	}
	
	private void listarReservas() {
		List<Reserva> reservas = reservaController.listarReservas();
		if (reservas != null) {
			for (Reserva reserva : reservas) {
				System.out.println("Quarto: " + reserva.getQuarto() + ", Andar: " + reserva.getAndar()
				+ ", Checkin: " + reserva.getDataCheckin() + ", Checkout: " + reserva.getDataCheckout());
			}
		}
		else {
			System.out.println("Nenhuma reserva encontrada !");
		}
	}

}