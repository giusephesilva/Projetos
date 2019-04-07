package prova;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the produtos database table.
 * 
 */
@Entity
@NamedQuery(name="Produtos.findAll", query="SELECT p FROM Produtos p")
public class Produtos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idprodutos;

	@Lob
	private String nome;

	private String quantidade;

	//bi-directional many-to-one association to Fornecedor
	@ManyToOne
	@JoinColumn(name="idfornecedor")
	private Fornecedor fornecedor;

	//bi-directional many-to-one association to Venda
	@OneToMany(mappedBy="produto")
	private List<Venda> vendas;

	public Produtos() {
	}

	public int getIdprodutos() {
		return this.idprodutos;
	}

	public void setIdprodutos(int idprodutos) {
		this.idprodutos = idprodutos;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Venda> getVendas() {
		return this.vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public Venda addVenda(Venda venda) {
		getVendas().add(venda);
		venda.setProduto(this);

		return venda;
	}

	public Venda removeVenda(Venda venda) {
		getVendas().remove(venda);
		venda.setProduto(null);

		return venda;
	}

}