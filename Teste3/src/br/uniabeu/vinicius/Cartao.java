package br.uniabeu.vinicius;

import java.util.Date;

public class Cartao extends Formapgto{
	private int nro;
	private Date validade;
	private int cod_seguranca;
	private String nome;
	private int parcela;
	private float valorparcela;
	private int funcao;
	public void cadastrar () {
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public int getCod_seguranca() {
		return cod_seguranca;
	}
	public void setCod_seguranca(int cod_seguranca) {
		this.cod_seguranca = cod_seguranca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getParcela() {
		return parcela;
	}
	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
	public float getValorparcela() {
		return valorparcela;
	}
	public void setValorparcela(float valorparcela) {
		this.valorparcela = valorparcela;
	}
	public int getFuncao() {
		return funcao;
	}
	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod_seguranca;
		result = prime * result + nro;
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
		Cartao other = (Cartao) obj;
		if (cod_seguranca != other.cod_seguranca)
			return false;
		if (nro != other.nro)
			return false;
		return true;
	}
	

}
