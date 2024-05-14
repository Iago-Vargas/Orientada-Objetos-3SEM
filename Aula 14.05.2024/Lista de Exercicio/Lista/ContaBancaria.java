package Aula;

class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double calcularSaldo() {
        return saldo;
    }
}
