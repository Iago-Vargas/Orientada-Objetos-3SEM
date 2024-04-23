package ExAula;

public class Retangulo2304 {
	private double base;
	private double altura;
	private double area;
	public Retangulo2304 (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public double getBase () {
		return base;
	}
	public void setBase (double base) {
		this.base = base;
	}
	public double getAltura () {
		return altura;
	}
	public void setAltura (double altura){
		this.altura = altura;
	}
	public double calculo () {
		this.altura = altura;
		this.base = base;
		this.area = area;
		 
		area = base * altura;
		return area;
	}
}
