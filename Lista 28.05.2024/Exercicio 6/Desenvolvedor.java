package Ex4;

public class Desenvolvedor extends Funcionario{
	private int horasEx;
	
	public Desenvolvedor () {}
	public Desenvolvedor (String nome, double salario, int horasEx) {
		super(nome, salario);
		this.horasEx = horasEx;
	}
	public int getHorasEx() {
		return horasEx;
	}
	public void setHorasEx(int horasEx) {
		this.horasEx = horasEx;
	}
	public double aumentarSalario() {
		double novoSal;
		return novoSal = super.aumentarSalario() + horasEx;
	}
	public String toString() {
		return "Desenvolvedor {Nome: "+nome+", Salario antigo: "+super.aumentarSalario()+", Salario novo: "+aumentarSalario()+"}";
	}
}
