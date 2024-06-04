package Exemplo3;

public class Principal {
	public static void main (String [] args) {
		Animal cachorro = new Cachorro();
		cachorro.emitirSom();
		cachorro.nome = "Pacoca";
		
		
		Animal gato = new Gato();
		gato.emitirSom();
	}
}
