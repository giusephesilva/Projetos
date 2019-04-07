package br.edu.uniabeu.exerciciopoo;

import java.util.Scanner;

public class ComandoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1-Inclusao \n. 2-alteracao\n. 3-exclusao\n");
		System.out.println("Digite a opcao: ");
		
		Scanner ler = new Scanner(System.in);
		int opcao= ler.nextInt();
		
		switch(opcao){
		case 1:
			System.out.println("selecionaou inclusao"); break;
		case 2:
			System.out.println("selecionaou alteracao"); break;
		case 3:
			System.out.println("selecionaou exclusao"); break;
		default:
			System.out.println("opcao invalida"); break;
		
		}
		
       ler.close();
	}

}
