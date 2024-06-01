package br.com.senaisp.bauru.eliezer.licao05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 valores separados "
						 + "por espaço ");
		int vlr1 = sc.nextInt();
		int vlr2 = sc.nextInt();
		int vlr3 = sc.nextInt();
		System.out.println("Seus valores são: ");
		System.out.println(vlr1);
		System.out.println(vlr2);
		System.out.println(vlr3);
		sc.close();
	}

}
