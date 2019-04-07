package br.acme.biblioteca;

import java.util.ArrayList;

public class Livro {
	
	private String titulo;
	private int regisbn;
	private int numedicao;
	private ArrayList<Emprestimo> emprestimo= new ArrayList<Emprestimo>();
	private ArrayList<Livro_Autor> livro_autor= new ArrayList<Livro_Autor>();
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getRegisbn() {
		return regisbn;
	}
	public void setRegisbn(int regisbn) {
		this.regisbn = regisbn;
	}
	public int getNumedicao() {
		return numedicao;
	}
	public void setNumedicao(int numedicao) {
		this.numedicao = numedicao;
	}
	public ArrayList<Emprestimo> getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(ArrayList<Emprestimo> emprestimo) {
		this.emprestimo = emprestimo;
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
		result = prime * result + regisbn;
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
		Livro other = (Livro) obj;
		if (regisbn != other.regisbn)
			return false;
		return true;
	}
	
	
	
	
}
