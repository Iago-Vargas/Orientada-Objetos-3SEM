package Exercicios;

public class Cachorro extends Animal{
	private String raca;
	
	public String getRaca () {
		return raca;
	}
	
	public void setRaca (String raca) {
		this.raca = raca;
	}
	
	public void latir () {
		System.out.println (som);
	}
}
