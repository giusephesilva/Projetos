package br.uniabeu.acmeeletronicos;

public class Produto {
	private String Codbarra;
	private String descricao;
	private float preco_venda;
	private Vitrine vitrine ;
	private Pedido pedido;
	public String getCodbarra() {
		return Codbarra;
	}
	public void setCodbarra(String codbarra) {
		Codbarra = codbarra;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public Vitrine getVitrine() {
		return vitrine;
	}
	public void setVitrine(Vitrine vitrine) {
		this.vitrine = vitrine;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Codbarra == null) ? 0 : Codbarra.hashCode());
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
		Produto other = (Produto) obj;
		if (Codbarra == null) {
			if (other.Codbarra != null)
				return false;
		} else if (!Codbarra.equals(other.Codbarra))
			return false;
		return true;
	}
	
	
	
	

}
