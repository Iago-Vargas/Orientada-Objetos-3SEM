package Ex5;

public class Gerente extends Funcionario{
	public Gerente (String nome, double salario) {
		super (nome, salario);
	}
	
	public void calcularSalario() {
		double bonus = getSalario() * 0.20;
		double total = getSalario() + bonus;
		System.out.println ("Gerente {Nome: "+getNome()+", Salario: "+getSalario()+", Bonus: "+bonus+", Liquido: "+total +"}");

	}
}
