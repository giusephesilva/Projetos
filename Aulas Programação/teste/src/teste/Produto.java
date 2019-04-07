package teste;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the produto database table.
 * 
 */
@Entity
@NamedQuery(name="Produto.findAll", query="SELECT p FROM Produto p")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codigoEAN;

	private String descricao;

	private Integer grupofk;

	private double precoUN;

	private int qtdEstoque;

	//bi-directional many-to-one association to Grupo
	@ManyToOne
	@JoinColumn(name="codigoEAN")
	private Grupo grupo;

	public Produto() {
	}

	public Integer getCodigoEAN() {
		return this.codigoEAN;
	}

	public void setCodigoEAN(Integer codigoEAN) {
		this.codigoEAN = codigoEAN;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getGrupofk() {
		return this.grupofk;
	}

	public void setGrupofk(Integer grupofk) {
		this.grupofk = grupofk;
	}

	public double getPrecoUN() {
		return this.precoUN;
	}

	public void setPrecoUN(double precoUN) {
		this.precoUN = precoUN;
	}

	public int getQtdEstoque() {
		return this.qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}