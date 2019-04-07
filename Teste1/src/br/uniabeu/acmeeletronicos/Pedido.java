package br.uniabeu.acmeeletronicos;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private int npedido;
	private Date dtpedido;
	private Date dtpreventrega;
	private float valortotal;
	private String status;
	private Cliente cliente;
	private ArrayList<Formapgt> Formapgt= new ArrayList<Formapgt>();
	public int getNpedido() {
		return npedido;
	}
	public void setNpedido(int npedido) {
		this.npedido = npedido;
	}
	public Date getDtpedido() {
		return dtpedido;
	}
	public void setDtpedido(Date dtpedido) {
		this.dtpedido = dtpedido;
	}
	public Date getDtpreventrega() {
		return dtpreventrega;
	}
	public void setDtpreventrega(Date dtpreventrega) {
		this.dtpreventrega = dtpreventrega;
	}
	public float getValortotal() {
		return valortotal;
	}
	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Formapgt> getFormapgt() {
		return Formapgt;
	}
	public void setFormapgt(ArrayList<Formapgt> formapgt) {
		Formapgt = formapgt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + npedido;
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
		if (npedido != other.npedido)
			return false;
		return true;
	}
	
}
	


	