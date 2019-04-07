package br.uniabeu.acmeeletronicos;

import java.util.ArrayList;

public abstract class Formapgt {
	private ArrayList<Pedido> pedido= new ArrayList<Pedido>();

	public ArrayList<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}

	
	
	
}
