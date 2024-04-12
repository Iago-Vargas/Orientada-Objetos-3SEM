package Aula;
import java.util.Scanner;

public class main2 {
	public static void main (String[] src) {
		Scanner scanner = new Scanner (System.in);
	
		System.out.println (" === Register Computer === ");
		System.out.println ("Which brand: ");
		String brand = scanner.nextLine();
		System.out.println ("Enter model: ");
		String model = scanner.nextLine();
		System.out.println ("Type: ");
		String type = scanner.nextLine();
		System.out.println ("Price: ");
		Double price = scanner.nextDouble();
		
		Computador computador = new Computador(brand,model,type,price);
	}
}
