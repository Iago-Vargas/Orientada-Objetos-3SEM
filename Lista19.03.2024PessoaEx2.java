package Aula;

public class Pessoa {
	private String name;
	private int age;
	private String sexuality;
	public Pessoa (String name, int age, String sexuality){
		this.name = name;
		this.age = age;
		this.sexuality = sexuality;
		
		System.out.println ("My name is: "+this.name);
		System.out.println ("My age is: "+this.age);
		System.out.println ("My sexuality is: "+this.sexuality);
		
	}
}
