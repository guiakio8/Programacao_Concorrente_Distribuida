package Classes;

public class Cliente extends Thread {
    private String nomeCli;
    private Conta contaCli;

    public Cliente(String nomeCli, double saldo) {
        this.nomeCli = nomeCli;
        this.contaCli = new Conta(saldo);
    }

    private boolean saldoPos() {
        synchronized (contaCli) {
            return contaCli.getSaldo() > 0;
        }
    }

    public void comprar() {
        double saldo;
        double valorCompra = Math.random() < 0.5 ? 100 : 200;

        synchronized (contaCli) {
            saldo = contaCli.getSaldo();

            if (saldo >= valorCompra) {
                contaCli.retirar(valorCompra);
                System.out.println(getNomeCli() + " Realizou uma compra no valor: " + valorCompra);
            }
        }
    }

    public String getNomeCli() {
        return nomeCli;
    }


    @Override
    public void run() {
        while (saldoPos()) {
            comprar();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}