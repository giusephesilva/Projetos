package br.edu.uniabeu.acmelogistica;

import java.util.ArrayList;

public class Pedido {
	private long numero;
	private String nome;
	private String endEntrega;
	private String telContato;
	private String status;
	private Cobranca cobranca;
	private Bordero bordero;
	private ArrayList <Itens> i = new ArrayList<Itens>();
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndEntrega() {
		return endEntrega;
	}
	public void setEndEntrega(String endEntrega) {
		this.endEntrega = endEntrega;
	}
	public String getTelContato() {
		return telContato;
	}
	public void setTelContato(String telContato) {
		this.telContato = telContato;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Cobranca getCobranca() {
		return cobranca;
	}
	public void setCobranca(Cobranca cobranca) {
		this.cobranca = cobranca;
	}
	public Bordero getBordero() {
		return bordero;
	}
	public void setBordero(Bordero bordero) {
		this.bordero = bordero;
	}
	public ArrayList<Itens> getI() {
		return i;
	}
	public void setI(ArrayList<Itens> i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (numero ^ (numero >>> 32));
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
	
	
	
	
	

}
