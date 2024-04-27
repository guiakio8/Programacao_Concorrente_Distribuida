package Classes;

import java.util.concurrent.locks.Lock;

public class Conta {
    private double saldo;
    private Lock lock;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void depositar(double valor) {
        this.saldo += valor;
//        System.out.println("Saldo atual: " + getSaldo());
    }

    public synchronized void retirar(double valor) {
        this.saldo -= valor;
//        System.out.println("Saldo atual: " + getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }
}
