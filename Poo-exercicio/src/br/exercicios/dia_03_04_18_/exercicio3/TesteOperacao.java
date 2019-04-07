package br.exercicios.dia_03_04_18_.exercicio3;

import java.util.Scanner;

public class TesteOperacao {

	private OperacaoMatematica o;

	public OperacaoMatematica getO() {
		return o;
	}

	public void setO(OperacaoMatematica o) {
		this.o = o;
	}
	
	public static void main(String[] args) {
		
		Soma objso = new Soma();
		Subtracao objsu = new Subtracao();
		Multiplicacao objm = new Multiplicacao();
		Divisao objd = new Divisao();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("digite o primeiro Numero:");
		int n1 = sc1.nextInt();
		System.out.println("digite o Segundo Numero:");
		int n2 = sc2.nextInt();
		System.out.println("digite o  Numero da operacao desejada :  1=soma , 2=subtracao , 3=multiplicacao , 4=divisao");
		int g = sc3.nextInt();
		
		 switch (g) {
         case 1:  System.out.println(" O valor da soma foi de:"+objso.calcula(n1, n2));
                  break;
         case 2:  System.out.println(" O valor da subtracao foi de:"+objsu.calcula(n1, n2));
                  break;
         case 3:  System.out.println(" O valor da multiplicacao foi de:"+objm.calcula(n1, n2));
                  break;
         case 4:  System.out.println(" O valor da divisao foi de:"+objd.calcula(n1, n2));
                  break;
       
		
		
		
		
		 }
	   }
	}
