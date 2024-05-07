import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean verificaMaiorDeIdade() {
        return idade >= 18;
    }

    ======================================Programa 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o CPF da pessoa: ");
        String cpf = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, cpf);

        if (pessoa.verificaMaiorDeIdade()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa não é maior de idade.");
        }

        scanner.close();
    }
}
