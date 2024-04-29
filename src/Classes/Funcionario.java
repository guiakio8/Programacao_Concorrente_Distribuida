package Classes;

public class Funcionario extends Thread{
    private String nomeFunci;
    private Conta contaFunci;
    private Conta contaInvestFunci;

    public Funcionario(String nome, double saldo) {
        this.nomeFunci = nome;
        this.contaFunci = new Conta(saldo);
        this.contaInvestFunci = new Conta(saldo);
        System.out.println("\nSaldo atual: " + "R$" + contaFunci.getSaldo() + " de " + getNomeFunci());
    }


    public void receber(double salario){
        contaFunci.depositar(salario);
        double investimento = salario * 0.20;
        contaInvestFunci.depositar(investimento);
        contaFunci.retirar(investimento);
    }

    public String getNomeFunci() {
        return nomeFunci;
    }

    public double getSaldoContaFunci() {
        return contaFunci.getSaldo();
    }

    public double getSaldoContaInvestFunci() {
        return contaInvestFunci.getSaldo();
    }
}
