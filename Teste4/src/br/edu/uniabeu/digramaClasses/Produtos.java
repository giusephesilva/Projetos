package br.edu.uniabeu.digramaClasses;

import java.util.ArrayList;

public abstract class Produtos {

	
	private ArrayList<Pedido> pedido = new ArrayList<Pedido>();

	public ArrayList<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}
}
