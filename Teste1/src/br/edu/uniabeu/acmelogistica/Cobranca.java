package br.edu.uniabeu.acmelogistica;

import java.sql.Date;
import java.util.ArrayList;

public class Cobranca {
	private int numero;
	private Date dtEmissao;
	private Date dtVencimento;
	private float valor;
	private Date dtPagto;
	private float valorPago;
	private ArrayList <Pedido> p = new ArrayList<Pedido>();
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public Date getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getDtPagto() {
		return dtPagto;
	}
	public void setDtPagto(Date dtPagto) {
		this.dtPagto = dtPagto;
	}
	public float getValorPago() {
		return valorPago;
	}
	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
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
		Cobranca other = (Cobranca) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	
	
}
