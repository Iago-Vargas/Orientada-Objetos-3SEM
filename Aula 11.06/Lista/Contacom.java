package Exercicio1;

public abstract class Contacom {
	protected double saldo;
	protected double limite;
	public abstract void ExibeDados();
	
	public void exibeDados() {
		System.out.println ("Saldo: "+saldo);
		System.out.println ("Limite: "+limite);
		System.out.println ("Deposito: ");
	}
}
