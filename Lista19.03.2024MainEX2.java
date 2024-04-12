package Aula;
import java.util.Scanner;

public class Main3 {
	public static void main (String [] src) {
		Scanner scanner = new Scanner (System.in);
		String name, sexuality;
		int age;
		
		System.out.println (" === Register ===");
		System.out.println ("Enter your name: ");
		name = scanner.nextLine();
		System.out.println ("Enter your age: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println ("Enter your sexuality: ");
		sexuality = scanner.nextLine();
		Pessoa pessoa = new Pessoa (name, age, sexuality);
	}
}
