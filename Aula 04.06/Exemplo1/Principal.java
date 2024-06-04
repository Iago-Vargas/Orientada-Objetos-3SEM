package Exemplo1;

public class Principal {
	public static void main (String args[]) {
		Cachorro c = new Cachorro ();
		c.nome = "Cachorro";
		c.idade = 5;
		c.exibeDados();
		c.emiteSom();
		c.cuidarPatio();
	}
}
