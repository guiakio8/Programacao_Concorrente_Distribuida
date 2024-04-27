package Classes;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
        System.out.println("Saldo atual: " + getSaldo());
    }

    public synchronized void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Saldo atual: " + getSaldo());
    }

    public synchronized void retirar(double valor) {
        this.saldo -= valor;
        System.out.println("Saldo atual da: " + getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }
}