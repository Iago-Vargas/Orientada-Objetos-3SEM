package Ex11;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa (String nome, int idade) throws  IllegalArgumentException{
		this.nome = nome;
		setIdade(idade);
	}
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getIdade () {
		return idade;
	}
	
	public void setIdade (int idade) throws IllegalArgumentException {
		validarIdade(idade);
		this.idade = idade;
	}
	
	public void validarIdade (int idade ) throws IllegalArgumentException {
		if (idade < 0  || idade > 120) {
			throw new IllegalArgumentException ("Idade invalida: "+idade);
		}
	}
	
	public String toString () {
		return "{Pessoa:"+nome+", Idade:"+idade+"}";
	}
}
