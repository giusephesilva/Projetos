package prova;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the cliente1 database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente1.findAll", query="SELECT c FROM Cliente1 c")
public class Cliente1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcliente;

	private BigInteger cpf;

	@Temporal(TemporalType.DATE)
	private Date dataDeNasc;

	@Lob
	private String endereco;

	@Lob
	private String nome;

	private int telefone;

	//bi-directional many-to-one association to Venda
	@OneToMany(mappedBy="cliente1")
	private List<Venda> vendas;

	public Cliente1() {
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public BigInteger getCpf() {
		return this.cpf;
	}

	public void setCpf(BigInteger cpf) {
		this.cpf = cpf;
	}

	public Date getDataDeNasc() {
		return this.dataDeNasc;
	}

	public void setDataDeNasc(Date dataDeNasc) {
		this.dataDeNasc = dataDeNasc;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return this.telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public List<Venda> getVendas() {
		return this.vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public Venda addVenda(Venda venda) {
		getVendas().add(venda);
		venda.setCliente1(this);

		return venda;
	}

	public Venda removeVenda(Venda venda) {
		getVendas().remove(venda);
		venda.setCliente1(null);

		return venda;
	}

}