package br.exercicios.dia_03_04_18_.exercicio3;

public class Soma implements OperacaoMatematica {

	private int so1,so2;
	
	
	public int getSo1() {
		return so1;
	}


	public void setSo1(int so1) {
		this.so1 = so1;
	}


	public int getSo2() {
		return so2;
	}


	public void setSo2(int so2) {
		this.so2 = so2;
	}


	@Override
	public int calcula(int so1, int so2) {

		return so1+so2;
	}

}
