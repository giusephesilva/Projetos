package br.edu.uniabeu.exerciciopoo;

public class TesteMotorista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorista []v = new Motorista[2]; 
		
		v[0]= new Motorista();
		v[0].setNome("João Pereira");
		v[0].setCpf("823.334.556-43");
		v[0].setIdade(21);
		v[0].setNascimento("03/02/1996");
		
		
		
		v[1]= new Motorista();
		v[1].setNome("Jairo");
		v[1].setCpf("8989088");
		v[1].setIdade(24);
		v[1].setNascimento("jisajdioa");
		
		for(int i=0;i<2;i++){
		System.out.println("Nome->" + v[i].getNome());
		System.out.println("Cpf->" + v[i].getCpf());
		System.out.println("Idade->" + v[i].getIdade());
		System.out.println("Data de nascimento->" + v[i].getNascimento());
			
		
		}
		if(v[0].equals(v[1])){
			System.out.println("são iguais");}
			else
		    System.out.println("São diferentes");
	}
	}


