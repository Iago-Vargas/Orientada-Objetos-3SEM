package Aula;

public class SobrecaargaExemplo {
	public static void main (String [] args) {
		Calculadoraa c = new Calculadoraa();
		int resultado1 = c.somar(3, 3);
		double resultado2 = c.somar(3.6, 5);
		double resultado3 = c.somar(4, 2.2, 7);
		
		System.out.println ("Resultado1: "+resultado1);
		System.out.println ("Resultado2: "+resultado2);
		System.out.println ("Resultado3: "+resultado3);

	}
}
