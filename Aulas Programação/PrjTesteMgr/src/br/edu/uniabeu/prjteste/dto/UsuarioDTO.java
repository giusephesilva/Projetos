package br.edu.uniabeu.prjteste.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {
	
	private static final long serialVersionUID = -9188876673296347404L;
	private Integer idusuario;
	private String nome;
	private String senha;

	public UsuarioDTO(Integer idusuario, String nome, String senha) {
		super();
		this.idusuario = idusuario;
		this.nome = nome;
		this.senha = senha;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idusuario == null) ? 0 : idusuario.hashCode());
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
		UsuarioDTO other = (UsuarioDTO) obj;
		if (idusuario == null) {
			if (other.idusuario != null)
				return false;
		} else if (!idusuario.equals(other.idusuario))
			return false;
		return true;
	}
}

