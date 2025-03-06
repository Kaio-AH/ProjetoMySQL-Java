package hotel.hotelkaiao;

import java.util.List;
import java.util.Scanner;
import controller.ClienteController;
import model.Cliente;

public class App {
    public static void main(String[] args) {
        
    	ClienteController controller = new ClienteController();
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int opcao;
    	
    	do {
    		System.out.println("1. Adicionar Cliente");
    		System.out.println("2. Listar Clientes");
    		System.out.println("3. Atualizar Cliente");
    		System.out.println("4. Deletar Cliente");
    		System.out.println("0. Sair do Sistema");
    		System.out.println("Escolha uma opção.");
    		opcao = scanner.nextInt();
    		scanner.nextLine();
    		
    		switch(opcao) {
    		case 1:
    			System.out.println("Nome: ");
    			String nome = scanner.nextLine();
    			
    			System.out.println("Idade: ");
    			int idade = scanner.nextInt();
    			scanner.nextLine();
    			
    			System.out.println("Cpf: ");
    			String cpf = scanner.nextLine();
    			
    			System.out.println("Genero: ");
    			String genero = scanner.nextLine();
    			
    			controller.adicionarCliente(nome, idade, cpf, genero);
    			break;
    			
    		case 2:
    			List<Cliente> clientes = controller.listarClientes();
    			for(Cliente c : clientes) {
    				System.out.println("Id: " + c.getIdCliente() + " Nome: " + c.getNome()
    				+ " Idade: " + c.getIdade() + " Cpf: " + c.getCpf() + " Gênero: " + c.getGenero());
    			}
    			break;
    			
    		case 3:
    			System.out.println("Id do cliente a atualizar: ");
    			int idAtualizar = scanner.nextInt();
    			scanner.nextLine();
    			
    			System.out.println("Novo Nome: ");
    			String novoNome = scanner.nextLine();
    			
    			System.out.println("Novo Idade: ");
    			int novoIdade = scanner.nextInt();
    			scanner.nextLine();
    			
    			System.out.println("Novo Cpf: ");
    			String novoCpf = scanner.nextLine();
    			
    			System.out.println("Novo Gênero: ");
    			String novoGenero = scanner.nextLine();
    			controller.atualizarCliente(idAtualizar, novoNome, novoIdade, novoCpf, novoGenero);
    			break;
    			
    		case 4:
    			System.out.println("Id: ");
    			int idDeletar = scanner.nextInt();
    			controller.deletarCliente(idDeletar);
    			break;
    			
    		case 0:
    			System.out.println("Saindo...");
    			break;
    			
    		default:
    			System.out.println("Opção Inválida!");
    			
    		}
    	} while(opcao != 0);
    	scanner.close();
    }
}
