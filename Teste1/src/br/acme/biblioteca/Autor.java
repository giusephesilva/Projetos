package br.acme.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Autor {

	private String nome;
	private Date dtnascautor;
	private int cpf;
	private ArrayList<Livro_Autor> livro_autor= new ArrayList<Livro_Autor>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtnascautor() {
		return dtnascautor;
	}
	public void setDtnascautor(Date dtnascautor) {
		this.dtnascautor = dtnascautor;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public ArrayList<Livro_Autor> getLivro_autor() {
		return livro_autor;
	}
	public void setLivro_autor(ArrayList<Livro_Autor> livro_autor) {
		this.livro_autor = livro_autor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
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
		Autor other = (Autor) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}
	
	
	
	
}
