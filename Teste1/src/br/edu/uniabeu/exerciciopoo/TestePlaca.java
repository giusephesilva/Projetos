package br.edu.uniabeu.exerciciopoo;

public class TestePlaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Placa p = new Placa();
		p.setLetras("kjf");
		p.setNumero("1234");
		p.setEstado("Rj"); 
		p.setMunicipio("Nova Iguaçu");
		
		
		System.out.println("Letras->" + p.getLetras());
		System.out.println("Numero->" + p.getNumero());
		System.out.println("Estado->" + p.getEstado());
		System.out.println("Municipio->" + p.getMunicipio());
		
	}

}
