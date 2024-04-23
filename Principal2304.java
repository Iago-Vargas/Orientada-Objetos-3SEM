package ExAula;

public class Principal2304 {
	public static void main (String [] args) {
		Pessoa2304 pessoa = new Pessoa2304 ("Iago Vargas", 23);
		System.out.println (pessoa.getNome());
		System.out.println (pessoa.getIdade());
		
		pessoa.setNome("Iago Vargas");
		pessoa.setIdade(63);
		
		System.out.println (pessoa.getNome());
		System.out.println (pessoa.getIdade());
	}
}
