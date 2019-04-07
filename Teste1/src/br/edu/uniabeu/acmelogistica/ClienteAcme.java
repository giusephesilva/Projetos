package br.edu.uniabeu.acmelogistica;

import java.util.ArrayList;

public class ClienteAcme {
	private long cnpj;
	private String razaoSocial;
	private String enderecoCob;
	private String enderecoDest;
	private String telefone;
	private String pessoaContato;
	
	private ArrayList <Bordero> b = new ArrayList<Bordero>();
	
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEnderecoCob() {
		return enderecoCob;
	}
	public void setEnderecoCob(String enderecoCob) {
		this.enderecoCob = enderecoCob;
	}
	public String getEnderecoDest() {
		return enderecoDest;
	}
	public void setEnderecoDest(String enderecoDest) {
		this.enderecoDest = enderecoDest;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getPessoaContato() {
		return pessoaContato;
	}
	public void setPessoaContato(String pessoaContato) {
		this.pessoaContato = pessoaContato;
	}

	
	public ArrayList<Bordero> getB() {
		return b;
	}
	public void setB(ArrayList<Bordero> b) {
		this.b = b;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cnpj ^ (cnpj >>> 32));
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
		ClienteAcme other = (ClienteAcme) obj;
		if (cnpj != other.cnpj)
			return false;
		return true;
	}
	
	
	
	
	

}
