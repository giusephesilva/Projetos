package exercicios.dia_10_04_18;

import java.util.Scanner;

public class Alunosteste {

	

	public static void main(String[] args) {
		
		String nome[] = new String[3];
		int matricula [] = new int [3];
		int idade [] = new int [3];
		float n1[] = new float [3];
		float n2[] = new float [3];
		float n3[] = new float [3];
		float n4[] = new float [3];
		float media[] = new float[3];
		float m = 0;
		int caracter = 0;
		int posicao = 0;
		
		Scanner obj = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			
			System.out.println("Digite o seu nome: ");
			nome[i] = obj.next();
			System.out.println("Digite a sua matricula: ");
			matricula[i] = obj.nextInt();
			System.out.println("Digite a sua idade: ");
			idade[i] = obj.nextInt();
			System.out.println("Digite a sua nota 1: ");
			n1[i] = obj.nextFloat();
			System.out.println("Digite a sua nota 2: ");
			n2[i] = obj.nextFloat();
			System.out.println("Digite a sua nota 3: ");
			n3[i] = obj.nextFloat();
			System.out.println("Digite a sua nota 4: ");
			n4[i] = obj.nextFloat();

		}
		for(int i=0; i<3; i++) {
		media[i]=(n1[i]+n2[i]+n3[i]+n4[i])/4;
			
		m += media[i];	
		}
		
		
		for(int i=0; i<3; i++) {
			if(media[i]>7) {
			System.out.println("seu nome: "+ nome[i]);
			System.out.println("sua matricula: "+ matricula[i]);
			System.out.println("sua idade: "+ idade[i]);
			System.out.println("sua media: "+media[i]);
			}
			if(nome[i].length()>caracter) {
			caracter = nome[i].length();
			posicao = i;
			}
			
	}
		System.out.println("a media total da turma: "+m);
		System.out.println("O nome com maior caracter: "+nome[posicao]);
		System.out.println("a posicao: "+posicao);
		System.out.println("a quantidade de caracter: "+caracter);
		
}
	
}
