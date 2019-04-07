package br.uniabeu.edu.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ComandoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao;
		try {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
		System.out.println("Conectado!");
		//Cria um slot de execução de SQL
		PreparedStatement stmt =
		conexao.prepareStatement("insert into cliente (nome, cpf, Cep) values (?,?,?)");
		stmt.setString(1, "Julia");
		stmt.setString(2, "70459785608");
		stmt.setString(3, "25897102");
		// Executa o comando insert
		if (stmt.executeUpdate() > 0)
		System.out.println("Cliente incluido!");
		else
		System.out.println("Cliente não incluido!");
		stmt.close();
		conexao.close();
		} catch (SQLException e) {
		System.out.println("Erro ao executar!"+e.getMessage());
		}
	}

}
