package ExAula;

public class Conta2304 {
    private double saldo;
    private double limite;
    private double saque;

    public Conta2304(int saldo, int limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }
    public void limite (double limite, double saque, double saldo) {
    	if (saque < limite) {
    		double saquefinal = limite - saque;
    		System.out.println ("O saldo final ficou de: "+saquefinal);
    	}else {
    		System.out.println ("Saldo insuficiente");
    	}
    }
}