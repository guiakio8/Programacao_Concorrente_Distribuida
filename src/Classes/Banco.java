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
            System.out.println("\nCompra de R$" + valor + " de " + cliente.getNomeCli() + " para " + loja.getNomeLoja());
        } finally {
            lock.unlock();
        }
    }

    public void pagamentoFunci(Loja loja, Funcionario funcionario, double pagamento) {
        lock.lock();
        try {
            loja.retirar(pagamento);
            funcionario.receber(pagamento);
            System.out.println("\nPagamento de R$" + pagamento + " para " + funcionario.getNomeFunci() + " realizado pela loja " + loja.getNomeLoja());
            loja.pagarFunci(funcionario);
        } finally {
            lock.unlock();
        }
    }


}
