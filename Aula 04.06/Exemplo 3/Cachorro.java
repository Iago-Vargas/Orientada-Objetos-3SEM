package Exemplo3;

public class Cachorro implements Animal {
	private String nome;
	private int idade;
	public void emitirSom() {
		System.out.println ("AUUUUUUUU");
	}
	public void cuidarPatio() {
		System.out.println ("Cuidando do patio");
	}
	public void exibeDados() {
		System.out.println ("Nome: "+nome);
		System.out.println ("Idade: "+idade);
	}
}
