package Exercicios;

public class Principal3 {
	public static void main (String [] src) {
		Pessoa p = new Pessoa ("Ricado", 40);
		
		p.exibeDados();
		
		PessoaJuridica pj = new PessoaJuridica ("Iago Vargas", 10, "2424252355-23214", "Maria Clara", "10-2-2020");
		
		pj.exibeDados();
	}
}
