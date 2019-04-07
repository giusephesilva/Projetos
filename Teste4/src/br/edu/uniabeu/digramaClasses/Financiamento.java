package br.edu.uniabeu.digramaClasses;

public class Financiamento extends Formapgt {

	private float juros;

	/**
	 * @return the juros
	 */
	public float getJuros() {
		return juros;
	}

	/**
	 * @param juros the juros to set
	 */
	public void setJuros(float juros) {
		this.juros = juros;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(juros);
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
		Financiamento other = (Financiamento) obj;
		if (Float.floatToIntBits(juros) != Float.floatToIntBits(other.juros))
			return false;
		return true;
	}
	
	
}
