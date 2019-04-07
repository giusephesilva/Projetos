package br.uniabeu.edu.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComandoSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao;
		try {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
		System.out.println("Conectado!");
		//Cria um slot de execução de SQL
		PreparedStatement stmt = conexao.prepareStatement("select * from cliente");
		// Executa o comando select
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
		String nome = rs.getString("nome");
		String cpf = rs.getString("cpf");
		String Cep = rs.getString("Cep");
		System.out.println(nome + " - "+cpf+ " - " +Cep);
		}
		stmt.close();
		conexao.close();
		} catch (SQLException e) {
		System.out.println("Não conectado!"+e.getMessage());
		}
	}

}
