package Ex5;

public class Vendedor extends Funcionario{
	private double comissao;
	public Vendedor (String nome, double salario, double comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}
	
	public double getComissao () {
		return comissao;
	}
	public void setComissao (double comissao) {
		this.comissao = comissao;
	}
	public void calcularSalario() {
		double total = this.salario + this.comissao;
		System.out.println ("Vendedor {Nome: "+getNome()+", Salario: "+getSalario()+", Comissao: "+getComissao()+ ", Liquido: "+total +"}");
	}
}
