package br.uniabeu.acmeeletronicos;

import java.util.Date;

public class Boleto extends Formapgt {
	private Date dtvencimento;
	private float valor;
	public Date getDtvencimento() {
		return dtvencimento;
	}
	public void setDtvencimento(Date dtvencimento) {
		this.dtvencimento = dtvencimento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtvencimento == null) ? 0 : dtvencimento.hashCode());
		result = prime * result + Float.floatToIntBits(valor);
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
		Boleto other = (Boleto) obj;
		if (dtvencimento == null) {
			if (other.dtvencimento != null)
				return false;
		} else if (!dtvencimento.equals(other.dtvencimento))
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	}
	
	
	

}
