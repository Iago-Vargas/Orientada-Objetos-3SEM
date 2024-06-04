package Exemplo3;

public class Gato implements Animal {
	private String nome;
	private int idade;
	public void emitirSom() {
		System.out.println ("Miau");
	}
	public void exibeDados() {
		System.out.println ("Nome: "+nome);
		System.out.println ("Idade: "+idade);
	}

}
