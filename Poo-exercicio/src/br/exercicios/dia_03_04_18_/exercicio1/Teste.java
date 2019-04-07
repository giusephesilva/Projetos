package br.exercicios.dia_03_04_18_.exercicio1;

import java.util.Scanner;

public class Teste {
	private FormaGeometrica r;
	

	public FormaGeometrica getR() {
		return r;
	}


	public void setR(FormaGeometrica r) {
		this.r = r;
	}


	public static void main(String[] args) {
	
	Circulo objc = new Circulo();
	Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor do raio do circulo");
		float raio = sc.nextFloat();
		System.out.println("A area tem o valor de :"+objc.area(raio));
		System.out.print("O comprimento tem o valor de :"+objc.comprimento(raio));

	}

}
