package br.com.senaisp.bauru.eliezer.licao05;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println(
				(idade > 17 ? "Você é maior de idade" + ", voce pode dirigir":
					"Você é menor de idade"+ ", voce nao pode dirigir") 
				);
		sc.close();
	}

}
