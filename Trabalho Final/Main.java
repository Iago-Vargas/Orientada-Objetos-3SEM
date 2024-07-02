package Trabalho;
import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Produto> p = new ArrayList<>();
    private static final String FILENAME = "produtos.txt"; // Nome do arquivo de dados

    public static void main(String[] args) {
        carregarDados(); // Carregar os dados do arquivo ao iniciar o programa
        
        Scanner s = new Scanner(System.in);
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
        salvarDados(); // Salvar os dados de produtos de volta ao arquivo ao sair
    }

    public static void menu () {
        System.out.println("0- Mostrar produtos");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Alterar preço produto"); // Corrigido o texto "Altenar" para "Alterar"
        System.out.println("3- Excluir produto");
        System.out.println("4- Sair");
    }

    public static void carregarDados() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dados = line.split(", ");
                Produto novoProduto = new Produto(dados[0], dados[1], Double.parseDouble(dados[2]), Double.parseDouble(dados[3]), Integer.parseInt(dados[4]));
                p.add(novoProduto);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    public static void salvarDados() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Produto produto : p) {
                bw.write(produto.getCodigo() + ", " + produto.getDescricao() + ", " + produto.getPrecocusto() + ", " + produto.getPrecovenda() + ", " + produto.getEstoque());
                bw.newLine();
            }
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }

    public static void cadastrar() {
        Scanner s = new Scanner(System.in);
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
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        String codigo = s.nextLine();
        Produto produtoalterar = null;
        for (Produto produto : p) {
            if (produto.getCodigo().equals(codigo)) {
                produtoalterar = produto;
                break; // Adicionado break para interromper o loop após encontrar o produto
            }
        }
        if (produtoalterar != null) {
            System.out.print("Novo preço de venda: ");
            double novoPrecoVenda = s.nextDouble();
            s.nextLine();
            produtoalterar.setPrecovenda(novoPrecoVenda);
            System.out.println("Preço do produto alterado com sucesso:");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void excluir() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        String codigo = s.nextLine();
        Produto excluir = null;

        for (Produto produto : p) {
            if (produto.getCodigo().equals(codigo)) {
                excluir = produto;
                break; // Adicionado break para interromper o loop após encontrar o produto
            }
        }
        if (excluir != null) {
            p.remove(excluir);
            System.out.println("Produto excluído com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void mostrar() {
        for (Produto produto : p) {
            System.out.println(produto.toString());
        }
    }
}
