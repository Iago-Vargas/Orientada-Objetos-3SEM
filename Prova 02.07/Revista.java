package Prova;


public class Revista extends Produto implements Descontavel {
 private String editora;

 public Revista(String nome, double preco, int quantidade, String editora) {
     super(nome, preco, quantidade);
     this.editora = editora;
 }

 @Override
 public void atualizarQuantidade(int novaQuantidade) {
     this.quantidade = novaQuantidade;
 }

 @Override
 public void aplicarDesconto(double percentual) {
     this.preco -= this.preco * (percentual / 100);
 }

 public String getEditora() {
     return editora;
 }
}

