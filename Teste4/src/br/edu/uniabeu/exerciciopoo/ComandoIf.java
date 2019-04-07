package br.edu.uniabeu.exerciciopoo;

public class ComandoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nota = 0;
		
		if (args.length > 0)
			nota= Integer.parseInt(args[0]);

		if (nota>=6)
		System.out.println("aprovado");
		
		else
			
			System.out.println("reprovado");
	}

}
