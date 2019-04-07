package br.acme.biblioteca;

public class Livro_Autor {
	
	private Livro livro;
	private Autor autor;
	private int codlivro_autor;
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getCodlivro_autor() {
		return codlivro_autor;
	}
	public void setCodlivro_autor(int codlivro_autor) {
		this.codlivro_autor = codlivro_autor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codlivro_autor;
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
		Livro_Autor other = (Livro_Autor) obj;
		if (codlivro_autor != other.codlivro_autor)
			return false;
		return true;
	}
	
	
	

}
