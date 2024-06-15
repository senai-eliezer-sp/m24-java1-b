package br.com.senaisp.bauru.eliezer.licao06;

import java.util.Random;

public class Baralho {
	private Carta[] cartas;
	private boolean[] cartaUsada;
	//Contructor 
	public Baralho() {
		cartas = new Carta [Carta.NAIPES.length * 
		                    Carta.NUMEROS.length];
		cartaUsada = new boolean [cartas.length];
		//Inicializar o baralho
		for(int np=1;np<=Carta.NAIPES.length;np++) {
			for(int nm=1;nm<=Carta.NUMEROS.length;nm++) {
				int idx = (np-1) * Carta.NUMEROS.length + (nm -1);
				cartas[idx] = new Carta(np,nm);
				cartaUsada[idx] = false;
			}
		}
	}
	public Carta sortearCarta() {
		Random rnd = new Random();
		boolean sorteado = false;
		Carta ret = null;
		do {
			int sor = rnd.nextInt(cartas.length);
			if (!cartaUsada[sor]) {
				cartaUsada[sor] = true;
				ret = cartas[sor];
				sorteado = true;
			}
		} while (!sorteado);
		return ret;
	}
	
}
