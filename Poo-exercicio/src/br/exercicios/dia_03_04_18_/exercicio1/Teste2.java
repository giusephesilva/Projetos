package br.exercicios.dia_03_04_18_.exercicio1;

import java.util.Scanner;

public class Teste2 {

	private FormaGeometrica c;
	
	
	public FormaGeometrica getC() {
		return c;
	}


	public void setC(FormaGeometrica c) {
		this.c = c;
	}


	public static void main(String[] args) {
	Quadrado objq = new Quadrado();
	Scanner sc = new Scanner(System.in);
	System.out.println("digite o valor do lado do quadrado:");
	float lado =  sc.nextFloat();
	System.out.println("A area tem o valor de :"+objq.area(lado));
	System.out.print("O perimetro tem o valor de :"+objq.comprimento(lado));

	}

}
