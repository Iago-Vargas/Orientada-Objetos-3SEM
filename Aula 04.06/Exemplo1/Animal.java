package Exemplo1;

public abstract class Animal {
	public String nome;
	public int idade;
	public abstract void emiteSom();
	public void exibeDados() {
		System.out.println ("Raca: "+nome);
		System.out.println ("Idade: "+idade);
	}
}
