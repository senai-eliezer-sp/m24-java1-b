package br.com.senaisp.bauru.eliezer.licao03;

public class Exemplo01 {
	public static int idade = 18;
	public static void main(String[] args) {
		byte vByte = 127;
		vByte ++; //aqui ocorre o estouro do limite do byte 
		System.out.println(vByte); //mostra o limite inferior 
		float vFloat = 6_000.00f; //preciso colocar f para dizer que é float
		if (vByte == -128) {
			String nome ="Eliezer";
			System.out.println("Meu nome é " + nome);
			
		}
		//Aqui não existe a variável nome
		//System.out.println(nome);
		//alterando a variável idade
		idade = 20;
		//A partir desse ponto passa a usar a variável local
		int idade = 50;
		System.out.println(idade);
		idade += 20; //somando 20 á idade
		System.out.println(idade);
	}

}
