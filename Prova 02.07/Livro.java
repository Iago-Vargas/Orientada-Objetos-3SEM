package Prova;

	public class Livro extends Produto implements Descontavel {
	    private String autor;

	    public Livro(String nome, double preco, int quantidade, String autor) {
	        super(nome, preco, quantidade);
	        this.autor = autor;
	    }

	    @Override
	    public void atualizarQuantidade(int novaQuantidade) {
	        this.quantidade = novaQuantidade;
	    }

	    @Override
	    public void aplicarDesconto(double percentual) {
	        this.preco -= this.preco * (percentual / 100);
	    }

	    public String getAutor() {
	        return autor;
	    }
	}


