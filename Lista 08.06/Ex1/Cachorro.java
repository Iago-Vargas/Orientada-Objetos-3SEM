package Ex1;

public class Cachorro extends Animal{
	public Cachorro (String nome, int idade) {
		super (nome, idade);
	}
	
	@Override
	public void EmitirSom() {
		System.out.println ("Au au");
	}
}
