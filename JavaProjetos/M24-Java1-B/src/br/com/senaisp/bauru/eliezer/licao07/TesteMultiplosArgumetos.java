package br.com.senaisp.bauru.eliezer.licao07;

public class TesteMultiplosArgumetos {

	public static void main(String[] args) {
		System.out.println("Soma de 2 valores: " + calcularSoma(10,20));
		System.out.println("Soma de 4 valores: " + calcularSoma(10,20,30,40));
	}
	//Metodo que soma valores
	public static int calcularSoma(int ... itens) {
		int ret =0;
		for(int vl : itens) {
			ret += vl;
		}
		return ret;
	}
	public static int calcularSomaX(double abc, int ... itens) {
		int ret = 0;
		for (int vl : itens) {
			ret += vl;
		}
		return ret;
	}

}
