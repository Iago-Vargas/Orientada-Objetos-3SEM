package Ex4;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario () {}
	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome () {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario () {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double aumentarSalario() {
		return salario;
	}
	public String toString () {
		return "Funcionario {Nome: "+nome+", Salario: "+salario+"}";

	}
}
