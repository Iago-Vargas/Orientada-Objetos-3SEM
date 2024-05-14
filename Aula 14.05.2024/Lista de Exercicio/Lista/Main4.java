package Aula;

public class Main4 {
	public static void main(String[] args) {
        Casa casa = new Casa();

        double precoTamanho = casa.calcularPreco(150);
        System.out.println("Preço da casa baseado no tamanho: $" + precoTamanho);

        double precoTamanhoQuartos = casa.calcularPreco(150, 3);
        System.out.println("Preço da casa baseado no tamanho e no número de quartos: $" + precoTamanhoQuartos);
    }
}
