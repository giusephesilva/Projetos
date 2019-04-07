package br.edu.uniabeu.digramaClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Veiculo extends Produtos {

	private String marca;
	private String cor;
	private String modelo;
	private Date anoFab;
	private int chassi;
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the anoFab
	 */
	public Date getAnoFab() {
		return anoFab;
	}
	/**
	 * @param anoFab the anoFab to set
	 */
	public void setAnoFab(Date anoFab) {
		this.anoFab = anoFab;
	}
	/**
	 * @return the chassi
	 */
	public int getChassi() {
		return chassi;
	}
	/**
	 * @param chassi the chassi to set
	 */
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chassi;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (chassi != other.chassi)
			return false;
		return true;
	}
	
	public void incluirveiculo(String marca, String cor,String modelo, Date anoFab, int chassi)
		throws SQLException{
		
		Connection conexao;
		try {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
		System.out.println("Conectado!");
		PreparedStatement stmt =
		conexao.prepareStatement("insert into veiculo (marca,cor,modelo,anoFab,chassi) values (?,?,?,?,?)");
		stmt.setString(1, marca);
		stmt.setString(2, cor);
		stmt.setString(3, modelo);
		stmt.setDate(4, (java.sql.Date) anoFab);
		stmt.setInt(5, chassi );

		
		
		// Executa o comando insert
		if (stmt.executeUpdate() > 0)
		System.out.println("veiculo incluido!");
		else
		System.out.println("veiculo não incluido!");
		stmt.close();
		conexao.close();
		} catch (SQLException e) {
		System.out.println("Erro ao executar!"+e.getMessage());
		}
	}
		
	public void atualizarveiculo(String marca, String cor,String modelo, Date anoFab, int chassi)
			throws SQLException{
			
	
		Connection conexao;

		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
			System.out.println("Conectado!");

			//Cria um slot de execução de SQL
			PreparedStatement stmt =
					conexao.prepareStatement("update veiculo set marca = ?, cor = ? , modelo = ? , anoFab = ? where chassi = ? ");
			System.out.println("Atualizando veiculo chassi="+chassi);
			stmt.setString(1, marca);
			stmt.setString(2, cor);
			stmt.setString(3, modelo);
			stmt.setDate(4, (java.sql.Date) anoFab);
			stmt.setInt(5, chassi );

			
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
	
	public void deletarveiculo(String marca, String cor,String modelo, Date anoFab, int chassi)
			throws SQLException{

		Connection conexao;
			try {
		conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
		System.out.println("Conectado!");
		PreparedStatement stmt =
		conexao.prepareStatement("delete from veiculo where chassi = ?");
		System.out.println("Excluindo cliente chassi="+chassi);
		stmt.setString(1, marca);
		stmt.setString(2, cor);
		stmt.setString(3, modelo);
		stmt.setDate(4, (java.sql.Date) anoFab);
		stmt.setInt(5, chassi );
		
		
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
	
