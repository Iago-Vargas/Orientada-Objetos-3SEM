package Prova;


public class Main {
 public static void main(String[] args) throws QuantidadeInvalidaException{
   
     Livro livro = new Livro("Macunaima", 39.99, 10, "Sei la");
     livro.exibirDetalhes();
     livro.aplicarDesconto(10); 
     livro.exibirDetalhes();

   
     Revista revista = new Revista("Globo", 7.5, 100, "Pele");
     revista.exibirDetalhes();
     revista.aplicarDesconto(5);
     revista.exibirDetalhes();


     livro.atualizarQuantidade(5);
	 livro.exibirDetalhes();
	 revista.atualizarQuantidade(80);
	 revista.exibirDetalhes();
	 revista.atualizarQuantidade(-10);
 }
}
