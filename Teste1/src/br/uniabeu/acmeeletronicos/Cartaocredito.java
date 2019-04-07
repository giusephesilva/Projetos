package br.uniabeu.acmeeletronicos;

public class Cartaocredito extends Formapgt {
	
	private int parcela;
	private float valorparcela;
	private int nro;
	private int cvv;
	public int getParcela() {
		return parcela;
	}
	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
	public float getValorparcela() {
		return valorparcela;
	}
	public void setValorparcela(float valorparcela) {
		this.valorparcela = valorparcela;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cvv;
		result = prime * result + nro;
		result = prime * result + parcela;
		result = prime * result + Float.floatToIntBits(valorparcela);
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
		Cartaocredito other = (Cartaocredito) obj;
		if (cvv != other.cvv)
			return false;
		if (nro != other.nro)
			return false;
		if (parcela != other.parcela)
			return false;
		if (Float.floatToIntBits(valorparcela) != Float.floatToIntBits(other.valorparcela))
			return false;
		return true;
	}
	
	
	
	

}
