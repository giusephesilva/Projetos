package br.acme.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Aluno {
	
	private String nome;
	private int matricula;
	private Date dtnasc;
	private ArrayList<Emprestimo> emprestimo= new ArrayList<Emprestimo>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Date getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}
	public ArrayList<Emprestimo> getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(ArrayList<Emprestimo> emprestimo) {
		this.emprestimo = emprestimo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
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
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}
	

}
