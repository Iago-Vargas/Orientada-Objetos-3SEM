package Aula;

public class Main2 {
	public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente(1234, 150);
        System.out.println("Saldo da conta corrente: " + c.calcularSaldo());
    }
}
