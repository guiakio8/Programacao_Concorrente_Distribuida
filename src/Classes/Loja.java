package Classes;

public class Loja {
    private String nomeLoja;
    private Conta saldoLoja;
    private double pagamentoFunci;
    Funcionario funcionario1;
    Funcionario funcionario2;

    public Loja(String nomeLoja, double saldo, Funcionario funcionario1, Funcionario funcionario2) {
        this.nomeLoja = nomeLoja;
        this.saldoLoja = new Conta(saldo);
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
        System.out.println("Saldo atual: " + "R$" + saldoLoja.getSaldo() + " de " + getNomeLoja());
    }

    public void receber(double valorCompra){
        saldoLoja.depositar(valorCompra);
        pagamentoFunci += valorCompra;
//        System.out.println("Saldo da loja: " + getSaldoLoja());
        if (pagamentoFunci >= 1400) {
            if (funcionario1.getSaldoContaFunci() > funcionario2.getSaldoContaFunci()) {
                pagarFunci(funcionario2);
            } else {
                pagarFunci(funcionario1);
            }
        }
    }

    public void pagarFunci(Funcionario funci){
        double pagamento = 1400;
        saldoLoja.retirar(pagamento);
        funci.receber(pagamento);
        System.out.println("Pagamento do funcionário realizado");
    }


    public String getNomeLoja() {
        return nomeLoja;
    }

    public double getSaldoLoja() {
        return saldoLoja.getSaldo();
    }
}