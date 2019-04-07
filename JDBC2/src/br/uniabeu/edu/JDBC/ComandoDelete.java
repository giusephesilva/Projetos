package br.uniabeu.edu.JDBC;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ComandoDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conexao;
		int id = 2; // id do contato
		try {
		conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
		System.out.println("Conectado!");
		//Cria um slot de execu��o de SQL
		PreparedStatement stmt =
		conexao.prepareStatement("delete from cliente where id = ?");
		System.out.println("Excluindo cliente id="+id);
		stmt.setLong(1, id); // Atribui��o do id do contato
		// Executa o comando delete
		if (stmt. executeUpdate()>0)
		System.out.println("Cliente exclu�do!");
		else
		System.out.println("Cliente n�o exclu�do!");
		stmt.close();
		conexao.close();
		} catch (SQLException e) {
		System.out.println("Erro ao executar!"+e.getMessage());
		}
	}

}
