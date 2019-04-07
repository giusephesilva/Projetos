package br.acme.biblioteca;

import java.util.Date;

public class Emprestimo {
	
	private String status;
	private Date dtemprest;
	private Date dtdevolucao;
	private Aluno aluno;
	private Livro livro;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDtemprest() {
		return dtemprest;
	}
	public void setDtemprest(Date dtemprest) {
		this.dtemprest = dtemprest;
	}
	public Date getDtdevolucao() {
		return dtdevolucao;
	}
	public void setDtdevolucao(Date dtdevolucao) {
		this.dtdevolucao = dtdevolucao;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((dtemprest == null) ? 0 : dtemprest.hashCode());
		result = prime * result + ((livro == null) ? 0 : livro.hashCode());
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
		Emprestimo other = (Emprestimo) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (dtemprest == null) {
			if (other.dtemprest != null)
				return false;
		} else if (!dtemprest.equals(other.dtemprest))
			return false;
		if (livro == null) {
			if (other.livro != null)
				return false;
		} else if (!livro.equals(other.livro))
			return false;
		return true;
	}
	
	
	

}
