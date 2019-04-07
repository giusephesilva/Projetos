package br.exercicios.dia_03_04_18_.exercicio1;

public class Quadrado implements FormaGeometrica {

	private float lado;
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float area(float lado) {
		
		return lado*lado;
	}

	@Override
	public float comprimento(float lado) {
		
		return 4*lado;
	}

}
