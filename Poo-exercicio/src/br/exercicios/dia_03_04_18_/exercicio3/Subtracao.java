package br.exercicios.dia_03_04_18_.exercicio3;

public class Subtracao implements OperacaoMatematica {

	private int su1,su2;
	
	public int getSu1() {
		return su1;
	}

	public void setSu1(int su1) {
		this.su1 = su1;
	}

	public int getSu2() {
		return su2;
	}

	public void setSu2(int su2) {
		this.su2 = su2;
	}

	@Override
	public int calcula(int su1, int su2) {
	
		return su1-su2;
	}

}
