package Aula;

public class Computador {
	private String brand;
	private	String model;
	private String type;
	private Double price;
	public Computador (String brand, String model, String type, Double price) {
		this.brand = brand;
		this.model = model;
		this.type  = type;
		this.price = price;
		
		System.out.println ("The brand of the PC is:  "+this.brand);
		System.out.println ("Of model: "+this.model);
		System.out.println ("Type: "+this.type);
		System.out.println ("Price: "+this.price);
		
	}
	
}
