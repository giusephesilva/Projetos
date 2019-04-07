package prova;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the vendas database table.
 * 
 */
@Entity
@Table(name="vendas")
@NamedQuery(name="Venda.findAll", query="SELECT v FROM Venda v")
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idvendas;

	private BigInteger quantidade;

	//bi-directional many-to-one association to Cliente1
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente1 cliente1;

	//bi-directional many-to-one association to Produtos
	@ManyToOne
	@JoinColumn(name="idprodutos")
	private Produtos produto;

	public Venda() {
	}

	public int getIdvendas() {
		return this.idvendas;
	}

	public void setIdvendas(int idvendas) {
		this.idvendas = idvendas;
	}

	public BigInteger getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(BigInteger quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente1 getCliente1() {
		return this.cliente1;
	}

	public void setCliente1(Cliente1 cliente1) {
		this.cliente1 = cliente1;
	}

	public Produtos getProduto() {
		return this.produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

}