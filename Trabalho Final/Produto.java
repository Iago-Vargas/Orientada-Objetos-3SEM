package Trabalho;

public class Produto {
	private String codigo;
	private String descricao;
	private double precocusto;
	private double precovenda;
	private int estoque;
	
	public Produto(String codigo, String descricao, double precoCusto, double precoVenda, int estoque) {
	        this.codigo = codigo;
	        this.descricao = descricao;
	        this.precocusto = precoCusto;
	        this.precovenda = precoVenda;
	        this.estoque = estoque;
	    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecocusto() {
		return precocusto;
	}

	public void setPrecocusto(double precocusto) {
		this.precocusto = precocusto;
	}

	public double getPrecovenda() {
		return precovenda;
	}

	public void setPrecovenda(double precovenda) {
		this.precovenda = precovenda;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public String toString () {
		return "Mercado {Codigo: "+codigo+", Descricao: "+descricao+", Preco custo: "+precocusto+", Preco venda:"+precovenda+", Estoque: "+estoque+"} ";
	}
}
