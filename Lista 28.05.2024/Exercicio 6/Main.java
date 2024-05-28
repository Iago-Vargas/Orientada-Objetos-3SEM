package Ex4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String [] args) {
		Scanner s = new Scanner (System.in);
		
		Funcionario[] f = new Funcionario [3];
		 for (int i = 0; i < 3; i++) {
	            System.out.println("=== MENU ===");
	            System.out.println("1- Funcionario");
	            System.out.println("2- Gerente");
	            System.out.println("3- Desenvolvedor");
	            int op = s.nextInt();
	            s.nextLine(); 

	            System.out.print("Nome: ");
	            String nome = s.nextLine();

	            System.out.print("Salario: ");
	            double salario = s.nextDouble();
	            s.nextLine(); 

	            if (op == 1) {
	                f[i] = new Funcionario(nome, salario);
	            } else if (op == 2) {
	                System.out.print("Bonus do Gerente: ");
	                double bonus = s.nextDouble();
	                s.nextLine(); 
	                f[i] = new Gerente(nome, salario, bonus);
	            } else if (op == 3) {
	                System.out.print("Horas Extras: ");
	                int horasExt = s.nextInt();
	                s.nextLine(); 
	                f[i] = new Desenvolvedor(nome, salario, horasExt);
	            }
	        }
			s.nextLine();

		
		for (Funcionario func : f) {
			System.out.println (func);
		}
	}
}
