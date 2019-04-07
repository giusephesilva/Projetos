package br.exercicios.dia_03_04_18_.exercicio3;

public class Multiplicacao implements OperacaoMatematica {

	private int m1,m2;
	
	
	public int getM1() {
		return m1;
	}


	public void setM1(int m1) {
		this.m1 = m1;
	}


	public int getM2() {
		return m2;
	}


	public void setM2(int m2) {
		this.m2 = m2;
	}


	@Override
	public int calcula(int m1, int m2) {
		
		return m1*m2;
	}

}
