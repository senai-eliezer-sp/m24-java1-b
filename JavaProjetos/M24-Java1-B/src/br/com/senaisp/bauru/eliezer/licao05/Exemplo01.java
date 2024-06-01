package br.com.senaisp.bauru.eliezer.licao05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade =sc.nextInt();
		System.out.println("Digite seu nome:");
		sc.nextLine(); 
		System.out.println("Digite sua cidade:");
		String ciade = sc.next();
		//Mostrando os dados
		System.out.println("Nome: " + nome +
							"\nIdade: " + idade
							"\nCidade: " + cidade);
		
		sc.close();
	}

}
