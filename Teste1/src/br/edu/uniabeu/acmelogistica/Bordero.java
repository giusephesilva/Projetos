package br.edu.uniabeu.acmelogistica;

import java.util.ArrayList;
import java.util.Date;

public class Bordero {
	
	private int numero;
	private Date dataColeta;
	private Date dataEmissao;
	private ClienteAcme clienteacme;
	private ArrayList <Pedido> p = new ArrayList<Pedido>();
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDataColeta() {
		return dataColeta;
	}
	public void setDataColeta(Date dataColeta) {
		this.dataColeta = dataColeta;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public ClienteAcme getClienteacme() {
		return clienteacme;
	}
	public void setClienteacme(ClienteAcme clienteacme) {
		this.clienteacme = clienteacme;
	}
	public ArrayList<Pedido> getP() {
		return p;
	}
	public void setP(ArrayList<Pedido> p) {
		this.p = p;
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
		Bordero other = (Bordero) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
	
	
	
	

}
