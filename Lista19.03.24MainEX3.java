package Aula;
import java.util.Scanner;

public class Main4 {
	public static void main (String [] src){
	Scanner scanner = new Scanner (System.in);
	
	String title, author;
	double price;
	int releaseYear;
	
	System.out.println (" === Register Book ===");
	System.out.println ("Book title: ");
	title = scanner.nextLine();
	System.out.println ("Author: ");
	author = scanner.nextLine();
	System.out.println ("Year: ");
	releaseYear = scanner.nextInt();
	System.out.println ("Price: ");
	price = scanner.nextDouble();
	
	Livro livro = new Livro(title, author, releaseYear, price);
	}
	
}
