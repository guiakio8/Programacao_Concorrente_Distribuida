package Classes;

public class Loja {
    private String nomeLoja;
    private Conta saldoLoja;
    private double pagamentoFunci;

    public Loja(String nomeLoja, double saldo) {
        this.nomeLoja = nomeLoja;
        this.saldoLoja = new Conta(saldo);
        System.out.println("Saldo atual: " + "R$" + saldoLoja.getSaldo() + " de " + getNomeLoja());
    }

    public void receber(double valorCompra){
        saldoLoja.depositar(valorCompra);
        pagamentoFunci += valorCompra;
//        System.out.println("Saldo da loja: " + getSaldoLoja());
//        if (pagamentoFunci >= 1400) {
//
//        }
    }

    public void pagarFunci(){
        saldoLoja.retirar(1400);
        System.out.println("Pagamento do funcionário realizado");
    }


    public String getNomeLoja() {
        return nomeLoja;
    }

    public double getSaldoLoja() {
        return saldoLoja.getSaldo();
    }
}