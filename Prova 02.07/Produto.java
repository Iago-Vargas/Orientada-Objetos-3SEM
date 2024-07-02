package Prova;

public abstract class Produto {
 protected String nome;
 protected double preco;
 protected int quantidade;

 public Produto(String nome, double preco, int quantidade) {
     this.nome = nome;
     this.preco = preco;
     this.quantidade = quantidade;
 }

 public abstract void atualizarQuantidade(int novaQuantidade);

 public void exibirDetalhes() {
     System.out.println("Nome: " + nome);
     System.out.println("Preco: R$" + preco);
     System.out.println("Quantidade: " + quantidade);
 }
}
