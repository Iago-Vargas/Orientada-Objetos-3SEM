package ExAula;
import java.util.Scanner;
public class Main2304 {
	public static void main (String [] src) {
		Scanner scanner = new Scanner (System.in);
		
		Conta2304 conta = new Conta2304 (1345, 2000);
		double limite = conta.getLimite();
		double saldo = conta.getSaldo();
		System.out.println (conta.getSaldo());
		System.out.println (conta.getLimite());
		
		System.out.println ("Valor de saque: ");
		double saque = scanner.nextDouble();
		conta.setSaque(saque);
		
		conta.limite(limite, saque, saldo);
	}
}
