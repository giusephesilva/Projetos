package br.edu.uniabeu.digramaClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private String status;
	private Date data;
	private int numero;
	private Vendedor vendedor;
	private Cliente cliente;
	
	
	private ArrayList<Produtos> itens = new ArrayList<Produtos>();
	private ArrayList<Pedpagto> pedpagto = new ArrayList<Pedpagto>();
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public ArrayList<Produtos> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Produtos> itens) {
		this.itens = itens;
	}
	
	public ArrayList<Pedpagto> getPedpagto() {
		return pedpagto;
	}
	public void setPedpagto(ArrayList<Pedpagto> pedpagto) {
		this.pedpagto = pedpagto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
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
		Pedido other = (Pedido) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	public void incluirpedido(String status, Date data,int numero)
			throws SQLException{
			
			Connection conexao;
			try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
		
					 
			
			PreparedStatement stmt2 = conexao.prepareStatement("select * from cliente where cpf = ?");
			stmt2.setString(1, this.getCliente().getCpf());
			// Executa o comando select
			ResultSet rs = stmt2.executeQuery();
			if (!rs.next()) {
				//  inclusao do cliente
				this.getCliente().insert();
			}
							
			PreparedStatement stmt =
			conexao.prepareStatement("insert into pedido (status, data, numero,cpfvendedor,cpfcliente) values (?,?,?,?,?)");
			stmt.setString(1, status);
			stmt.setDate(2, (java.sql.Date) data);
			stmt.setInt(3, numero);
			stmt.setString(4, this.getVendedor().getCpf());
			stmt.setString(5, this.getCliente().getCpf());
			
			
			// Executa o comando insert
			if (stmt.executeUpdate() <= 0)
				throw new Exception("Pedido não incluido!");
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}
	}
			
		public void atualizarpedido(String status, Date data,int numero)
				throws SQLException{
				
		
			Connection conexao;

			try {
				conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
				System.out.println("Conectado!");

				//Cria um slot de execução de SQL
				PreparedStatement stmt =
						conexao.prepareStatement("update pedido set status =?, data = ? where numero= ?");
				System.out.println("Atualizando pedido numero="+numero);
				stmt.setString(1, status);
				stmt.setDate(2, (java.sql.Date) data);
				stmt.setInt(3, numero);

				
				// Executa o comando update
				if (stmt. executeUpdate()>0)
					System.out.println("pedido atualizado!");
				else
					System.out.println("pedido não atualizado!");
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println("Erro ao executar!"+e.getMessage());
			}
		
		
		
		}
		
		public void deletarpedido(String status, Date data,int numero)
				throws SQLException{

			Connection conexao;
				try {
			conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "uniabeu");
			System.out.println("Conectado!");
			PreparedStatement stmt =
			conexao.prepareStatement("delete from pedido where numero = ?");
			System.out.println("Excluindo pedido numero="+numero);
			stmt.setString(1, status);
			stmt.setDate(2, (java.sql.Date) data);
			stmt.setInt(3, numero);

			
			
			if (stmt. executeUpdate()>0)
			System.out.println("pedido excluído!");
			else
			System.out.println("pedido não excluído!");
			stmt.close();
			conexao.close();
			} catch (SQLException e) {
			System.out.println("Erro ao executar!"+e.getMessage());
			}
		}

		
		
	
}
