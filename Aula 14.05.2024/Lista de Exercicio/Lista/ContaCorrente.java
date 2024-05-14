package Aula;

class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(double saldo, double taxaManutencao) {
        super(saldo);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public double calcularSaldo() {
        return saldo - taxaManutencao;
    }
}