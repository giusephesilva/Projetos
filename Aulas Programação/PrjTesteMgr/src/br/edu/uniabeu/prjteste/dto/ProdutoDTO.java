package br.edu.uniabeu.prjteste.dto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = -8723831896665429207L;

	private int idprodutos;
	
	private String nome;
	
	private String quantidade;
	
	private int idfornecedor;
	
	public ProdutoDTO(int idprodutos,String nome, String quantidade,int idfornecedor) {
		super();
		this.idprodutos = idprodutos;
		this.nome = nome;
		this.quantidade = quantidade;
		this.idfornecedor = idfornecedor;
		}

	public int getIdprodutos() {
		return idprodutos;
	}

	public void setIdprodutos(int idprodutos) {
		this.idprodutos = idprodutos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public int getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(int idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idprodutos;
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
		ProdutoDTO other = (ProdutoDTO) obj;
		if (idprodutos != other.idprodutos)
			return false;
		return true;
	}
	
	
	
}
