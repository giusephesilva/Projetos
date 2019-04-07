package br.edu.uniabeu.digramaClasses;

import java.util.Date;

public class Cartao extends Formapgt {

	private int nro;
	private int cvv;
	private String nome;
	private Date vencimento;
	/**
	 * @return the nro
	 */
	public int getNro() {
		return nro;
	}
	/**
	 * @param nro the nro to set
	 */
	public void setNro(int nro) {
		this.nro = nro;
	}
	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the vencimento
	 */
	public Date getVencimento() {
		return vencimento;
	}
	/**
	 * @param vencimento the vencimento to set
	 */
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cvv;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + nro;
		result = prime * result + ((vencimento == null) ? 0 : vencimento.hashCode());
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
		Cartao other = (Cartao) obj;
		if (cvv != other.cvv)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nro != other.nro)
			return false;
		if (vencimento == null) {
			if (other.vencimento != null)
				return false;
		} else if (!vencimento.equals(other.vencimento))
			return false;
		return true;
	}
	
	
	
}
