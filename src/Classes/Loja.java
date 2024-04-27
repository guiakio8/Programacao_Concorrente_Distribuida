package Classes;

public class Loja {
    private String nomeLoja;
    private Conta contaLoja;
    private double pagamentoFunci;

    public Loja(String nomeLoja, double saldo) {
        this.nomeLoja = nomeLoja;
        this.contaLoja = new Conta(saldo);
    }

    public void receber(double valorCompra){
        contaLoja.depositar(valorCompra);
        pagamentoFunci += valorCompra;

        if (pagamentoFunci >= 1400) {

        }
    }

    public void pagarFunci(){
        contaLoja.retirar(1400);

        System.out.println("Pagamento do funcionário realizado");
    }

}