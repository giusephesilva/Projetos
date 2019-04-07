package br.edu.uniabeu.exerciciopoo;

public class Motorista {
	
	private String Nome;
	private String Cpf;
	private int Idade;
	private String Nascimento;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getNascimento() {
		return Nascimento;
	}
	public void setNascimento(String nascimento) {
		Nascimento = nascimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cpf == null) ? 0 : Cpf.hashCode());
		result = prime * result + Idade;
		result = prime * result + ((Nascimento == null) ? 0 : Nascimento.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
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
		Motorista other = (Motorista) obj;
		if (Cpf == null) {
			if (other.Cpf != null)
				return false;
		} else if (!Cpf.equals(other.Cpf))
			return false;
		if (Idade != other.Idade)
			return false;
		if (Nascimento == null) {
			if (other.Nascimento != null)
				return false;
		} else if (!Nascimento.equals(other.Nascimento))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		return true;
	}
	
	
	
	
	
}
