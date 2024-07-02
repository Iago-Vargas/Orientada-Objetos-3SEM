package Ex5;

public class Main {

	public static void main(String[] args) {
		Funcionario v = new Vendedor ("Iago Vargas", 1800, 1000);
		v.calcularSalario();
		
		Funcionario g = new Gerente ("Maria Clara", 3000);
		g.calcularSalario();
	}

}
