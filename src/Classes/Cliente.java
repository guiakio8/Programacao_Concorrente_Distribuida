package Classes;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cliente extends Thread {
    private String nomeCli;
    private Conta contaCli;
    Lock lock;
    Loja loja1;
    Loja loja2;
    Banco banco;

    public Cliente(String nomeCli, double saldo, Loja loja1, Loja loja2, Banco banco) {
        this.nomeCli = nomeCli;
        this.contaCli = new Conta(saldo);
        this.banco = banco;
        this.loja1 = loja1;
        this.loja2 = loja2;
        this.lock = new ReentrantLock();
        System.out.println("Saldo atual: " + "R$" + contaCli.getSaldo() + " de " + getNomeCli());
    }

    public boolean saldoPos() {
        synchronized (contaCli) {
            return contaCli.getSaldo() > 0;
        }
    }

    public double comprar(double valorCompra) {
        double saldo;
//        double valorCompra = Math.random() < 0.5 ? 100 : 200;
        saldo = contaCli.getSaldo();

        if (saldo >= valorCompra) {
            contaCli.retirar(valorCompra);
            System.out.println(getNomeCli() + " Realizou uma compra no valor: " + valorCompra);
            System.out.println("Saldo atual: " + "R$" + contaCli.getSaldo() + " de " + getNomeCli());
            return valorCompra;
        }else {
            return 0;
        }
    }

    public String getNomeCli() {
        return nomeCli;
    }


    @Override
    public void run() {


        synchronized (contaCli) {
            while (saldoPos()) {
                double valorCompra = Math.random() < 0.5 ? 100 : 200;
                Loja lojaSelecionada = Math.random() < 0.5 ? loja1 : loja2;
                double valorGasto = comprar(valorCompra);

                if (valorGasto > 0) {

                    synchronized (banco){
                        banco.compraLoja(this, lojaSelecionada, valorCompra);
                    }
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
