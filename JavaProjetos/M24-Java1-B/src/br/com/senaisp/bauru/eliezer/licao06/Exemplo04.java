package br.com.senaisp.bauru.eliezer.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		
		//Calculando 
		try {
			int vl03 = vl01 / vl02;
			System.out.println("Resultado:" + vl03);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu uma " 
					+ "divisão por zero!");
		} catch (InputMismatchException e ) {
			System.out.println("Digitar somente " + "números inteiros!");
		}

	}

}
