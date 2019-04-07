package exercicio1;

import java.util.Scanner;

public class testepessoa {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		pessoa pessoa= new pessoa ();
		
		
		   System.out.println(" Escreva O seu nome :");
		   pessoa.nome = a.next();
		
		   System.out.println(" Escreva O seu sobrenome :");		
           pessoa.sobrenome = b.nextLine();
           
           
           System.out.println(pessoa.Sobrenome " " pessoa.nome);
	}

}
