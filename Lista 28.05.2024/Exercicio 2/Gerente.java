package Ex3;

public class Gerente extends Funcionario{
	private double bonus;
	
	public Gerente () {}
	public Gerente (String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calcularSalario () {
		double novoSalario;
		return novoSalario = super.calcularSalario() + this.bonus;
	}
	public String toString () {
		return "Funcionario {Nome: "+nome+", Salario antigo: "+super.calcularSalario()+", Bonus: "+bonus+", Salario: "+calcularSalario()+"}";
	}
}
