package br.edu.uniabeu.digramaClasses;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private String status;
	private Date data;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	
}
