package ExAula;
import java.util.Scanner;
public class M2ain2304 {
	public static void main (String [] src) {
		Scanner scanner = new Scanner (System.in);

		
		System.out.println ("Digite a base: ");
		double base = scanner.nextDouble();
		System.out.println ("Digite a altura: ");
		double altura = scanner.nextDouble();

		Retangulo2304 retangulo = new Retangulo2304 (base, altura);

		System.out.println ("Resultado da area: ");
		System.out.println (retangulo.calculo());
	}
}
