package ExAula;
import java.util.Scanner;

public class MainProva {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Carro carro = null;

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("1- Criar um carro informando marca");
      System.out.println("2- Criar um carro informando marca e tipo");
      System.out.println("3- Exibir informações do carro");
      System.out.println("4- Atribuir tipo do carro");
      System.out.println("5- Obter tipo do carro");
      System.out.println("6- Atribuir marca do carro");
      System.out.println("7- Obter marca do carro");
      System.out.println("8- Sair");

      System.out.println("Escolha uma opção: ");
      int opcao = entrada.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite a marca do carro: ");
          entrada.nextLine();
          String marca = entrada.nextLine();
          carro = new Carro(marca);
          break;
        case 2:
          System.out.print("Digite a marca do carro: ");
          entrada.nextLine();
          String marca2 = entrada.nextLine();
          System.out.print("Digite o tipo do carro: ");
          String tipo = entrada.nextLine();
          carro = new Carro(marca2, tipo);
          break;
        case 3:
          if (carro != null) {
            carro.mostrarDetalhes();
          } else {
            System.out.println("Nenhum carro foi criado ainda.");
          }
          break;
        case 4:
          if (carro != null) {
            System.out.print("Digite o novo tipo do carro: ");
            entrada.nextLine();
            String novoTipo = entrada.nextLine();
            carro.setTipo(novoTipo);
          } else {
            System.out.println("Nenhum carro foi criado ainda.");
          }
          break;
        case 5:
          if (carro != null) {
            System.out.println("Tipo do carro: " + carro.getTipo());
          } else {
            System.out.println("Nenhum carro foi criado ainda.");
          }
          break;
        case 6:
          if (carro != null) {
            System.out.print("Digite a nova marca do carro: ");
            entrada.nextLine();
            String novaMarca = entrada.nextLine();
            carro.setMarca(novaMarca);
          } else {
            System.out.println("Nenhum carro foi criado ainda.");
          }
          break;
        case 7:
          if (carro != null) {
            System.out.println("Marca do carro: " + carro.getMarca());
          } else {
            System.out.println("Nenhum carro foi criado ainda.");
          }
          break;
        case 8:
          System.out.println("Programa terminado.");
          System.exit(0);
      }
    }
  }
}
