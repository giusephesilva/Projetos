package br.edu.uniabeu.digramaClasses;

import java.util.Date;

public class Veiculo extends Produtos {

	private String marca;
	private String cor;
	private String modelo;
	private Date anoFab;
	private int chassi;
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the anoFab
	 */
	public Date getAnoFab() {
		return anoFab;
	}
	/**
	 * @param anoFab the anoFab to set
	 */
	public void setAnoFab(Date anoFab) {
		this.anoFab = anoFab;
	}
	/**
	 * @return the chassi
	 */
	public int getChassi() {
		return chassi;
	}
	/**
	 * @param chassi the chassi to set
	 */
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chassi;
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
		Veiculo other = (Veiculo) obj;
		if (chassi != other.chassi)
			return false;
		return true;
	}
	
	
}
