package Aula;

public class SobrescritaExemplo {
	public static void main (String [] args) {
		Animal animal = new Animal();
		animal.fazerSom();
		
		animal = new Cachorro();
		animal.fazerSom();
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();
	}
}
