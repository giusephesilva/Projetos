package br.edu.uniabeu.digramaClasses;

import java.util.Date;

public class Pedpagto {

	private float valor;
	private int parcelas;
	private Date dtPagto;
	private Pedido pedido;
	private Formapgt formapgt;
	
	/**
	 * @return the valor
	 */
	public float getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}
	/**
	 * @return the parcelas
	 */
	public int getParcelas() {
		return parcelas;
	}
	/**
	 * @param parcelas the parcelas to set
	 */
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	/**
	 * @return the dtPagto
	 */
	public Date getDtPagto() {
		return dtPagto;
	}
	/**
	 * @param dtPagto the dtPagto to set
	 */
	public void setDtPagto(Date dtPagto) {
		this.dtPagto = dtPagto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Formapgt getFormapgt() {
		return formapgt;
	}
	public void setFormapgt(Formapgt formapgt) {
		this.formapgt = formapgt;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtPagto == null) ? 0 : dtPagto.hashCode());
		result = prime * result + parcelas;
		result = prime * result + Float.floatToIntBits(valor);
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
		Pedpagto other = (Pedpagto) obj;
		if (dtPagto == null) {
			if (other.dtPagto != null)
				return false;
		} else if (!dtPagto.equals(other.dtPagto))
			return false;
		if (parcelas != other.parcelas)
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	}
	
	
}
