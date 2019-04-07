package br.edu.uniabeu.digramaClasses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Cliente extends Pessoa {
			
	public void insert()
			throws SQLException{
			
			Connection conexao;
			try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
			System.out.println("Conectado!");
			
			//Cria um slot de execução de SQL
			PreparedStatement stmt =
			conexao.prepareStatement("insert into cliente (nome, cpf, endereco, telefone, sexo) values (?,?,?,?,?)");
			stmt.setString(1, this.getNome());
			stmt.setString(2, this.getCpf());
			stmt.setString(3, this.getEndereco());
			stmt.setInt(4, this.getTelefone());
			stmt.setString(5, this.getSexo());
			
			// Executa o comando insert
			if (stmt.executeUpdate() > 0)
			System.out.println("cliente incluido!");
			else
			System.out.println("cliente não incluido!");
			stmt.close();
			conexao.close();
			} catch (SQLException e) {
			System.out.println("Erro ao executar!"+e.getMessage());
			}
		}
	public static void update (String nome, String cpf, String endereco, int telefone, String sexo)
			 throws SQLException{

		Connection conexao;
				try {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/testepoo", "root", "uniabeu");
		System.out.println("Conectado!");
		
		PreparedStatement stmt =
		conexao.prepareStatement("update cliente set nome = ?, endereco = ?, telefone = ?, sexo = ? where cpf = ?");
		System.out.println("Atualizando cliente cpf="+cpf);
		stmt.setString(1, nome);
		stmt.setString(2, cpf);
		stmt.setString(3, endereco);
		stmt.setInt(4, telefone);
		stmt.setString(5,sexo);
		// Executa o comando update
		
		if (stmt. executeUpdate()>0)
		System.out.println("Cliente atualizado!");
		else
		System.out.println("Cliente não atualizado!");
		stmt.close();
		conexao.close();
		} catch (SQLException e) {
		System.out.println("Erro ao executar!"+e.getMessage());
		}
	}
	public static void delete (String nome, String cpf, String endereco, int telefone, String sexo)
			 throws SQLException{
		Connection conexao;
				try {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/testepoo", "root", "uniabeu");
		System.out.println("Conectado!");
		//Cria um slot de execução de SQL
		PreparedStatement stmt =
		conexao.prepareStatement("delete from Cliente where cpf = ?");
		System.out.println("Excluindo cliente cpf="+cpf);
		
		// Executa o comando delete
		if (stmt. executeUpdate()>0)
		System.out.println("Cliente excluído!");
		else
		System.out.println("Cliente não excluído!");
		stmt.close();
		conexao.close();
		} catch (SQLException e) {
		System.out.println("Erro ao executar!"+e.getMessage());
		}
	}
	}
	
	
	





