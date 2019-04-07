package br.uniabeu.edu.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ComandoUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Connection conexao;

		int id = 1; // id do contato

		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
			System.out.println("Conectado!");

			//Cria um slot de execução de SQL
			PreparedStatement stmt =
					conexao.prepareStatement("update cliente set nome = ?, cpf = ?, Cep = ? where id = ?");
			System.out.println("Atualizando contato id="+id);
			stmt.setLong(4, id); // Atribuição do id do contato e demais campos
			stmt.setString(1, "Ricardo");
			stmt.setString(2, "45607959784");
			stmt.setString(3, "90618940");
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

}
