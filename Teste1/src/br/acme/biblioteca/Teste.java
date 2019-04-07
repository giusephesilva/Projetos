package br.acme.biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf= new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		Aluno a= new Aluno();
		Emprestimo e= new Emprestimo();
		Livro l=new Livro();
		Autor au= new Autor();
		Livro_Autor lv= new Livro_Autor();
		
		
		a.setMatricula(171610212);
		a.setNome("joão");
		a.setDtnasc(sdf.parse("03-05-2017 00:00:00"));
		
		e.setStatus("R");
		e.setDtemprest(sdf.parse("09-06-2017 00:00:00"));
		e.setDtdevolucao(sdf.parse("08-04-2017 00:00:00"));
		
		l.setTitulo("A cabana");
		l.setRegisbn(895466556);
		l.setNumedicao(123);
		
		au.setNome("fernando ");
		au.setDtnascautor(sdf.parse("09-10-2016 00:00:00"));
		au.setCpf(89487456);
		
		lv.setAutor(au);
		lv.setLivro(l);
		lv.setCodlivro_autor(12354446);
		
		System.out.println("Nome->" + a.getNome());
		System.out.println("Matricula->" + a.getMatricula());
		System.out.println("Data de nascimento->"+ sdf.format(a.getDtnasc()) );
		System.out.println("status->" + e.getStatus());
		System.out.println("data de emprestimo->" + sdf.format(e.getDtemprest()));
		System.out.println("data de devolucao->"+ sdf.format(e.getDtdevolucao()));
	
	
	
	
	
	
	
	
	}

}
