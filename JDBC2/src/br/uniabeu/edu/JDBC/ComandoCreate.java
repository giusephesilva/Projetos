package br.uniabeu.edu.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ComandoCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conexao;
		
		try{
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
			System.out.println("Conectado!");	
			
			//Cria um slot de execução de SQL
			PreparedStatement stmt = 
				conexao.prepareStatement(
					"CREATE TABLE cliente"
					+ "(id INT(11) NOT NULL AUTO_INCREMENT,"
					+ "nome VARCHAR(45) NOT NULL,"
					+ "cpf bigint(45),"
					+ "cep Int(45),"
					+ "PRIMARY KEY(id))");
			stmt.execute();
			System.out.println("Tabela criada!");
			stmt.close();
		
			conexao.close();
			} catch (SQLException e) {
			System.out.println("Erro ao executar!"+e.getMessage());
			}

	}


	}


