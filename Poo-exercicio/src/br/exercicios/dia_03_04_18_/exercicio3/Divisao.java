package br.exercicios.dia_03_04_18_.exercicio3;

public class Divisao implements OperacaoMatematica {

	private int d1,d2;
	
	
	public int getD1() {
		return d1;
	}


	public void setD1(int d1) {
		this.d1 = d1;
	}


	public int getD2() {
		return d2;
	}


	public void setD2(int d2) {
		this.d2 = d2;
	}


	@Override
	public int calcula(int d1, int d2) {
		
		return d1/d2;
	}

}
