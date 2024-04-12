package Aula;

public class Livro {
	private String title;
	private String author;
	private int releaseYear;
	private Double price;
	
	public Livro (String title, String author, int releaseYear, Double price) {
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
		this.price = price;
		
		System.out.println ("Book's title: "+this.title);
		System.out.println ("Author: "+this.author);
		System.out.println ("Release year: "+this.releaseYear);
		System.out.println ("Price: "+price);

	}
}
