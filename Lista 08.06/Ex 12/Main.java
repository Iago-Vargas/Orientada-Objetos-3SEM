package Ex13;

public class Main {
	  public static void main(String[] args) {
	        try {
	            Triangulo triangulo1 = new Triangulo(3, 4, 5); // Triângulo retângulo válido
	            System.out.println("Triângulo 1:");
	            System.out.println("Lado 1: " + triangulo1.getLado1());
	            System.out.println("Lado 2: " + triangulo1.getLado2());
	            System.out.println("Lado 3: " + triangulo1.getLado3());

	        } catch (IllegalArgumentException e) {
	            System.out.println("Erro ao criar triângulo: " + e.getMessage());
	        }
	    }
}
