package Exercicios;

public class Principal {
	
	public static void main (String [] src) {
		Onibus o = new Onibus();
		
		o.setNome("Marcopolo");
		o.setModelo("OF-1519");
		
		o.exibeMsg();
		
		System.out.println ("Nome do carro: "+o.getNome());
		System.out.println ("Modelo do onibus: "+o.getModelo());
	}
}
