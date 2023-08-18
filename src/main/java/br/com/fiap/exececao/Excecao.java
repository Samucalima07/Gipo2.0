package br.com.fiap.exececao;

@SuppressWarnings("serial")
public class Excecao extends Exception {
	
	public Excecao() {
		super();
	}
	
	public Excecao(NullPointerException e) {
		super();
		System.out.println("Alguns campos não foram preenchidos!!");
	}
	
	public Excecao (NumberFormatException e) {
		super();
		System.out.println("Digitou Letra no lugar do Número");
	}
	
}