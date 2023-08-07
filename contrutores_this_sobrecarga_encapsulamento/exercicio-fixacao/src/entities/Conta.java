package entities;

public class Conta {
    private int numeroConta;
    private String titular;
    private double valor;


    public Conta(int numeroConta, String titular, double valor) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        deposito(valor);
    }

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;

    }

    public void deposito(double valor) {
        this.valor += valor;
    }

    public void sacar(double valor) {
        int taxa = 5;
        this.valor -= valor + taxa;
    }

    @Override
    public String toString() {
        return ("Account: " + numeroConta + ", Holder: " + titular + ", Balance: $ " + String.format("%.2f", valor));
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValor() {
        return valor;
    }


}
