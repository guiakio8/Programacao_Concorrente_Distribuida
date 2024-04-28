package Classes;

public class Loja {
    private String nomeLoja;
    private Conta saldoLoja;
    private double pagamentoFunci;
    Banco banco;
    Funcionario funcionario1;
    Funcionario funcionario2;

    public Loja(String nomeLoja, double saldo, Funcionario funcionario1, Funcionario funcionario2, Banco banco) {
        this.nomeLoja = nomeLoja;
        this.saldoLoja = new Conta(saldo);
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
        this.banco = banco;
        System.out.println("Saldo atual: " + "R$" + saldoLoja.getSaldo() + " de " + getNomeLoja());
    }

    public void receber(double valorCompra) {
        saldoLoja.depositar(valorCompra);
        pagamentoFunci += valorCompra;

        if (pagamentoFunci >= 1400) {
            Funcionario funcionario = funcionario1.getSaldoContaFunci() > funcionario2.getSaldoContaFunci() ? funcionario2 : funcionario1;
            pagarFunci(funcionario);
        }
    }

    public void pagarFunci(Funcionario funcionario) {
        double pagamento = 1400;
        if (saldoLoja.getSaldo() >= pagamento) {
            saldoLoja.retirar(pagamento);
            funcionario.receber(pagamento);
            System.out.println("Pagamento de R$" + pagamento + " para " + funcionario.getNomeFunci() + " realizado pela loja " + getNomeLoja());
        }
    }

    public void pagar(double valor){
        saldoLoja.retirar(valor);
    }


    public String getNomeLoja() {
        return nomeLoja;
    }

    public double getSaldoLoja() {
        return saldoLoja.getSaldo();
    }
}