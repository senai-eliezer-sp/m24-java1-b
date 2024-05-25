package br.com.senaisp.bauru.eliezer.licao04;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Strings
		String nome1 = "Eliezer";
		String nome2 = "Eliezer";
		//Solicitando os nomes 
		System.out.println("Digite o nome:");
		nome2 = sc.next();
		//comparando endereços de memória quando é objeto
		if (nome1 == nome2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		 //Comparando conteúdo de objeto
		if (nome1.equals(nome2)) {
			System.out.println("São iguais no conteúdo");
		} else {
			System.out.println("São diferentes no conteúdo");
		}
		//Nome1 é maior que nome 2
		if (nome1.compareTo(nome2)>0) {
			System.out.println("Nome2 é maior que noem 1");
		}
		if (nome1.compareTo(nome2)==0) {
			System.out.println("Nome1 é igual noem 1- ");
		}
		                             
	}

}
