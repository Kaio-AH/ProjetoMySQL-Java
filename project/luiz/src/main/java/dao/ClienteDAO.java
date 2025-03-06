package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO {

	private Connection connection;
	
	public ClienteDAO() {
		try {
			// CONEXÃO COM O BANCO
			String url = "jdbc:mysql://localhost:3302/hotelkaiao";
			String user = "root";
			String password = "123456";
			connection = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			// DENTRO DO CATCH
			e.printStackTrace();
		}
	}
	
	public void adicionar(Cliente cliente) {
		String sql = "INSERT INTO clientes (nome, idade, cpf, genero) VALUES(?, ?, ?, ?)";
		
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNome());
			stmt.setInt(2, cliente.getIdade());
			stmt.setString(3, cliente.getCpf());
			stmt.setString(4, cliente.getGenero());
			stmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "SELECT * FROM clientes";
		try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setIdade(rs.getInt("idade"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setGenero(rs.getString("genero"));
				clientes.add(cliente);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return clientes;
		
	}
	
	public void atualizar(Cliente cliente) {
		String sql = "UPDATE clientes SET nome = ?, idade = ?, cpf = ?, genero = ? WHERE id = ?";
		
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNome());
			stmt.setInt(2, cliente.getIdade());
			stmt.setString(3, cliente.getCpf());
			stmt.setString(4, cliente.getGenero());
			stmt.setInt(5, cliente.getIdCliente());
			stmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int idCliente) {
		String sql = "DELETE FROM clientes WHERE id = ?";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, idCliente);
			stmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
