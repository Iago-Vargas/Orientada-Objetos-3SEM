package Trabalho;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	private static List<Produto> p = new ArrayList<>();

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int op = 0;
		while (op != 4) {
			menu();
			op = s.nextInt();
			s.nextLine();
			switch (op) {
			case 0:
				mostrar();
				break;
			case 1:
				cadastrar();
				break;
			case 2:
				preco();
				break;
			case 3:
				excluir();
				break;
			}
		}
		
	}
	public static void menu () {
		System.out.println("0- Mostrar produtos");
		System.out.println("1- Cadastrar Produto");
		System.out.println("2- Altenar preco produto");
		System.out.println("3- Excluir produto");
		System.out.println("4- Sair");
	}
	public static void cadastrar() {
		Scanner s = new Scanner (System.in);
		System.out.println("Codigo: ");
		String codigo = s.nextLine();

	    System.out.print("Descrição: ");
	    String descricao = s.nextLine();

	    System.out.print("Preço de Custo: ");
	    double precoCusto = s.nextDouble();

	     System.out.print("Preço de Venda: ");
	     double precoVenda = s.nextDouble();

	     System.out.print("Estoque: ");
	     int estoque = s.nextInt();
	     Produto novoProduto = new Produto(codigo, descricao, precoCusto, precoVenda, estoque);
	     p.add(novoProduto);
	     System.out.println("Produto cadastrado com sucesso:");
	     for (Produto produto : p) {
			 System.out.println(produto.toString());
	     }
	}
	public static void preco() {
		Scanner s = new Scanner (System.in);
		System.out.println("Digite o codigo do produto: ");
		String codigo  = s.nextLine();
		Produto produtoalterar = null;
		for (Produto produto : p) {
			if (produto.getCodigo().equals(codigo)) {
				produtoalterar = produto;
			}
		System.out.print("Novo preço de venda: ");
		double novoPrecoVenda = s.nextDouble();
		s.nextLine();
		produtoalterar.setPrecovenda(novoPrecoVenda);
		System.out.println("Preço do produto alterado com sucesso:");
		}
	}
	public static void excluir() {		
		Scanner s = new Scanner (System.in);
		System.out.println("Digite o codigo do produto: ");
		String codigo = s.nextLine();
		Produto excluir = null;
		
		for (Produto produto : p) {
			if (produto.getCodigo().equals(codigo)) {
				excluir = produto;
			}
		}
		p.remove(excluir);
	}
	public static void mostrar() {
		 for (Produto produto : p) {
			 System.out.println(produto.toString());
	     }
	}
}
