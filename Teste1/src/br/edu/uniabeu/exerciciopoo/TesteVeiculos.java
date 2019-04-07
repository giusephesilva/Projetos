package br.edu.uniabeu.exerciciopoo;

public class TesteVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculos v = new Veiculos(); 
		v.setMarca("Honda");
		v.setModelo("Civic");
		v.setCor("Preto");
		v.setAnofab(2016);
		v.setAnomodelo(2017);
		
		
		System.out.println("Marca->" + v.getMarca());
		System.out.println("Modelo->" + v.getModelo());
		System.out.println("Cor->" + v.getCor());
		System.out.println("Ano de fabricacao->" + v.getAnofab());
		System.out.println("Ano do modelo->" + v.getAnomodelo());
	}

}
