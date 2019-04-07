package br.edu.uniabeu.acmelogistica;

import java.util.ArrayList;

public class Produtos {
	private long codigo;
	private String descricao;
	private ArrayList <Itens> i = new ArrayList<Itens>();
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Itens> getI() {
		return i;
	}
	public void setI(ArrayList<Itens> i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
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
		Produtos other = (Produtos) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	
	
}
