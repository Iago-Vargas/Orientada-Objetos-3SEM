package Ex1;

public class Gato extends Animal{
	public Gato (String nome, int idade) {
		super (nome, idade);
	}
	
	public void EmitirSom () {
		System.out.println ("Miau");
	}
}
