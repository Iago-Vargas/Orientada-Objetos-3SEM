package Ex14;

public class Agenda {
	private String nome;
	private String numero;
	
	public Agenda (String nome, String numero) throws IllegalArgumentException{
		verificar(nome, numero);
		this.nome = nome;
		this.numero = numero;
		
	}
	public void verificar (String nome, String numero) throws IllegalArgumentException{
		if (nome == null  || nome.trim().isEmpty()) {
			throw new IllegalArgumentException ("Nome esta vazio") ;
		}
		if (numero == null || numero.trim().isEmpty()) {
			throw new IllegalArgumentException ("Numero vazio");
		}
	}
	public String toString () {
		return "{Nome: "+nome+", Numero: "+numero+"}";
	}
}
