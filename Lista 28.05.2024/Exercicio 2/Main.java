package Ex3;
import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner s = new Scanner (System.in);
		Gerente g = new Gerente ();
		
		System.out.println ("Nome: ");
		String nome = s.nextLine();
		g.setNome(nome);
		System.out.println ("Salario: ");
		double salario = s.nextDouble();
		g.setSalario(salario);
		System.out.println ("Bonus: ");
		double bonus = s.nextDouble();
		g.setBonus(bonus);
		
		System.out.println (g);
	}
}
