package Classes;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {
    private Lock lock;

    public Banco() {
        this.lock = new ReentrantLock();
    }

    public void compraLoja(Cliente cliente, Loja loja, double valor) {
        lock.lock();
        try {
            loja.receber(valor);
            System.out.println("Pagamento de R$" + valor + " de " + cliente.getNomeCli() + " para " + loja.getNomeLoja());
        } finally {
            lock.unlock();
        }
    }

//    public void pagamentoFunci(Loja loja, Funcionario funcionario, double valor) {
//        lock.lock();
//        try {
//            loja.receber(valor);
//            System.out.println("Pagamento de R$" + valor + " de " + funcionario.getNomeFunci() + " para " + loja.getNomeLoja());
//        } finally {
//            lock.unlock();
//        }
//    }


}
