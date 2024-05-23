package Ex1;

public class ProdutoComDesconto extends Produto{
	private double desconto;
	 public ProdutoComDesconto(String nome, double preco, double desconto) {
	        super(nome, preco, desconto); // Chama o construtor da superclasse Produto
	        this.desconto = desconto;
	    }
	 
        @Override
        public double desconto() {
           return super.desconto();
        }
        public void imprimir () {
        	System.out.println ("Produto: "+this.getNome());
        	System.out.println ("Desconto: "+this.getDesconto());
        	System.out.println ("Preço: "+this.getPreco());
        	double precoComDesconto = desconto();
        	System.out.println ("Preço com desconto: "+precoComDesconto);
        }
	}

