package ExAula;
import java.util.Scanner;

public class M3ain2304 {
	public static void main (String [] src) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Digite a marca: ");
		String marca = scanner.nextLine();
		
		System.out.println ("Digite o modelo: ");
		String modelo = scanner.nextLine();
		
		System.out.println ("Ano do carro: ");
		int ano = scanner.nextInt();
		
		Carro car = new Carro (marca, ano, modelo);
		
		car.lista(marca,ano,modelo);
	}
}
