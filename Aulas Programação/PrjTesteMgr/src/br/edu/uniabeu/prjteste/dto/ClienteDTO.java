package br.edu.uniabeu.prjteste.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = -8930829155682467275L;
	
	private BigInteger cpf;

	private String endereco;

	private String nome;

	private char sexo;

	private char uf;
	
	public ClienteDTO (BigInteger cpf, String endereco, String nome,char sexo,char uf) {
	super();
	this.cpf = cpf;
	this. endereco = endereco;
	this.nome = nome;
	this.sexo = sexo;
	this.uf = uf;

}

	public BigInteger getCpf() {
		return cpf;
	}

	public void setCpf(BigInteger cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getUf() {
		return uf;
	}

	public void setUf(char uf) {
		this.uf = uf;
	}
	
	
}
