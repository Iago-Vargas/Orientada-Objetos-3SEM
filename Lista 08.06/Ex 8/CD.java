package Ex8;

public class CD implements Produto{
	private String nome;
	private double preco;
	private String descricao;
	
	public CD (String nome, double preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	
	public String getNome() {
		return nome;
	}

	
	public double getPreco() {
		return preco;
	}

	
	public String getDescricao() {
		return descricao;
	}
	public String toString () {
		return "CD {Nome:"+getNome()+", Preco:"+getPreco()+", Descricao:"+getDescricao()+" }";
	}
}
