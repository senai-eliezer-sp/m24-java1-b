package br.com.senaisp.bauru.eliezer.licao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		//Mostrando a mensagem para o usuário 
		System.out.println("Digite seu nome completo:");
		nome = scn.nextLine();
		//Vamos separar nome de sobrenome
		String primNome = nome.substring(0, (nome+" ").indexOf(" "));
		//Pegar último sobrenome 
		String lastName = nome.substring(nome.lastIndexOf(" ")+1);
		//mostrando o nome 
		System.out.println(primNome);
		System.out.println(lastName);
		//Fechando scanner
		scn.close();
	}

}
