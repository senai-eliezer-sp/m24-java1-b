package br.com.senaisp.bauru.eliezer.licao07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	public static int lerInteiro(Scanner sc, 
			String mensagem,
			int faixaInicial, int faixaFinal) {
		int ret = 0;
		do {
			System.out.println(mensagem);
			System.out.println("Valr fora das faixas iniciais e finais redigite!");
			try {
				ret = sc.nextInt();
			} catch (InputMismatchException e) {
				ret = faixaInicial - 1;
				System.out.println("Valor inválido!"
						+ "Redigite!");
				sc.nextLine();
			}
			
		} while(ret<faixaInicial || ret>faixaFinal);
		return ret;
	}
}
