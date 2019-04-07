package prova;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the fornecedor database table.
 * 
 */
@Entity
@NamedQuery(name="Fornecedor.findAll", query="SELECT f FROM Fornecedor f")
public class Fornecedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idfornecedor;

	@Column(name="cnpj_cpf")
	private BigInteger cnpjCpf;

	private String email;

	@Lob
	private String empresa;

	@Lob
	private String endereco;

	private int telefone;

	//bi-directional many-to-one association to Produtos
	@OneToMany(mappedBy="fornecedor")
	private List<Produtos> produtos;

	public Fornecedor() {
	}

	public int getIdfornecedor() {
		return this.idfornecedor;
	}

	public void setIdfornecedor(int idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public BigInteger getCnpjCpf() {
		return this.cnpjCpf;
	}

	public void setCnpjCpf(BigInteger cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return this.telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public List<Produtos> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	public Produtos addProduto(Produtos produto) {
		getProdutos().add(produto);
		produto.setFornecedor(this);

		return produto;
	}

	public Produtos removeProduto(Produtos produto) {
		getProdutos().remove(produto);
		produto.setFornecedor(null);

		return produto;
	}

}