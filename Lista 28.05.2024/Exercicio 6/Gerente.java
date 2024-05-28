package Ex4;

public class Gerente extends Funcionario{
	private double bonus;
	
	public Gerente () {}
	public Gerente (String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}
	public double getBonus () {
		return bonus;
	}
	public void setBonus (double bonus) {
		this.bonus = bonus;
	}
	public double aumentarSalario () {
		double novoSal;
		novoSal = super.aumentarSalario() + bonus;
		return novoSal;
	}
	public String toString () {
		return "Gerente {Nome: "+nome+", Salario antigo: "+super.aumentarSalario()+", Salario novo: "+aumentarSalario()+"}";

	}
}
