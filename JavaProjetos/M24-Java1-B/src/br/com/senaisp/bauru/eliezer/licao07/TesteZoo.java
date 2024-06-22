package br.com.senaisp.bauru.eliezer.licao07;

public class TesteZoo {

	public static void main(String[] args) {
		Mamifero mam = new Cachorro();
		mam.setCor("Caramelo");
		mam.setNome("Totó");
		mam.setIdade(3);
		//testa se o mam é um cachorro
		if (mam instanceof cachorro) {
			((Cachorro) mam).setQuadrupede(true);
		}
		mam.falar();
		System.out.println(mam.toString());
		
	}

}
