package Ex11;

public class Livro {
	private String atributos;
	private String autor;
	private int ano;
	
	public Livro (String atributos, String autor, int ano) {
		this.atributos = atributos;
		this.autor = autor;
		this.ano = ano;
	}
	
	public int getAno () {
		return ano;
	}
	
	public String toString () {
		return "Livro {Atributo: "+this.atributos+", Autor: "+this.autor+", Ano: "+this.ano+"}";
	}
}
