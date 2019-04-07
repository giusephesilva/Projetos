package teste;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pedido database table.
 * 
 */
@Entity
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer nro;

	private double valorTot;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="IdCliente")
	private Cliente cliente;

	public Pedido() {
	}

	public Integer getNro() {
		return this.nro;
	}

	public void setNro(Integer nro) {
		this.nro = nro;
	}

	public double getValorTot() {
		return this.valorTot;
	}

	public void setValorTot(double valorTot) {
		this.valorTot = valorTot;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}