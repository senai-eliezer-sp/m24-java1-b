package br.com.senaisp.bauru.eliezer.licao05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o operando 1: ");
		int vlr1 = sc.nextInt();
		sc.nextLine(); //captura do enter
		System.out.println("Digite a operação: ");
		String operacao = sc.nextLine();
		System.out.println("Digite o operando 2:");
		int vlr2 = sc.nextInt();
		//verificando as operações
		int valor =0;
		//testes
		switch(operacao) {
		case "-" -> valor = vlr1 vlr2; 
		case "*" -> {
			valor = vlr1 * vlr2; 
		}
		case "/" -> valor = vlr1 / vlr2; 
		default -> System.out.println("Operação inválida!");
		}
		
		}
		
	}
