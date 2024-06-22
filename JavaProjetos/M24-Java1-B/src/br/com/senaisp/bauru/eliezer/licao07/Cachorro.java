package br.com.senaisp.bauru.eliezer.licao07;

public class Cachorro extends Mamifero{
	//Campos/fields
	private boolean quadrupede;
	//Contructor
	//Getters e setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Métodos
	public void falar () {
		System.out.println("Au Au Au!");
	}
	@Override
	public String toString() {
		return super.toString() + 
				"Quadrupede: " + quadrupede + "\n";
	}
}
