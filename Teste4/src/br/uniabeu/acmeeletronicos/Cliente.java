package br.uniabeu.acmeeletronicos;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
	private int cpf;
	private String nome;
	private int telefone;
	private String sexo;
	private Date dtnasc;
	
	private ArrayList<Pedido> pedido= new ArrayList<Pedido>();
	private ArrayList<Endereco> endereco= new ArrayList<Endereco>();
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}
	public ArrayList<Pedido> getPedido() {
		return pedido;
	}
	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}
	public ArrayList<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(ArrayList<Endereco> endereco) {
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
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
		Cliente other = (Cliente) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}
	
	
	
	
	
	
}
