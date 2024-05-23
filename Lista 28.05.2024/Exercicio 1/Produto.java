package Ex1;

public class Produto {
private String nome;
private double preco;
private double desconto;

public Produto (String nome, double preco, double desconto){
	this.desconto = desconto;
	this.nome = nome;
	this.preco = preco;
}
public double desconto() {
	double precoTotal = this.preco * (this.desconto / 100);
	return preco - precoTotal;
}
public String getNome() {
	return nome;
}
public double getPreco() {
	return preco;
}
public double getDesconto() {
	return desconto;
}
public void imprimir () {
	System.out.println ("Produto: "+this.nome);
	System.out.println ("Desconto: "+this.desconto);
	System.out.println ("Preço: "+this.preco);
	double precoComDesconto = desconto();
	System.out.println ("Preço com desconto: "+precoComDesconto);
}
}
