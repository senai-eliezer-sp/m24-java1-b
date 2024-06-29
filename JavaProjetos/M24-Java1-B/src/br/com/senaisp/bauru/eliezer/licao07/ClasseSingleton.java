package br.com.senaisp.bauru.eliezer.licao07;
/*
 * Exemplo de uso do padrão Singleton no Java
 */
public class ClasseSingleton {
	private static ClasseSingleton instancia = null;
	private static int nSeqInstancia = 0;
	private int id;
	private String nome;
	//Contructor
	private ClasseSingleton() {
		id = ++nSeqInstancia;
		nome = null;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	//Métodos
	public static ClasseSingleton getInstancia() {
		if ( instancia==null) {
			instancia = new ClasseSingleton();
		}
		return instancia;
	}
}