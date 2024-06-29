package br.com.senaisp.bauru.eliezer.licao07;

public class ShapeJava {
	private double altura;
	private double largura;
	String cor;
	//Contructor 
	public ShapeJava(double alt, double larg) {
		altura = alt;
		largura = larg;
	}
	//Getters e Setters
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	//Classe dentro de outra class
	public class apoio{
		public void chamarApoio() {
			ShapeJava sp2 = new ShapeJava(2,2);
			sp2.altura = 10;
		}
	}
	//método estatico de criação do objeto 
	public static ShapeJava getInstancia(double v1, double v2) {
		ShapeJava ret = new ShapeJava(v1, v2);
		ret.altura = 15;
		return ret;
	}
}