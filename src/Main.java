import Classes.Banco;
import Classes.Cliente;
import Classes.Funcionario;
import Classes.Loja;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Funcionario funcionario1 = new Funcionario("Aline", 0);
        Funcionario funcionario2 = new Funcionario("Carlos", 0);
        Funcionario funcionario3 = new Funcionario("Marcos", 0);
        Funcionario funcionario4 = new Funcionario("Pedro", 0);

        Loja loja1 = new Loja("Loja 1", 0, funcionario1, funcionario2,banco);
        Loja loja2 = new Loja("Loja 2", 0, funcionario3, funcionario4,banco);

        Cliente cli1 = new Cliente("José", 1000, loja1, loja2, banco);
        Cliente cli2 = new Cliente("Maria", 1000, loja1, loja2, banco);
        Cliente cli3 = new Cliente("João", 1000, loja1, loja2, banco);
        Cliente cli4 = new Cliente("Gabriel", 1000, loja1, loja2, banco);
        Cliente cli5 = new Cliente("Ana", 1000, loja1, loja2, banco);

        cli1.start();
        cli2.start();
        cli3.start();
        cli4.start();
        cli5.start();

        try {
            cli1.join();
            cli2.join();
            cli3.join();
            cli4.join();
            cli5.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Saldo atual: " + "R$" + cli1.getSaldoCli() + " de " + cli1.getNomeCli());
        System.out.println("Saldo atual: " + "R$" + cli2.getSaldoCli() + " de " + cli2.getNomeCli());
        System.out.println("Saldo atual: " + "R$" + cli3.getSaldoCli() + " de " + cli3.getNomeCli());
        System.out.println("Saldo atual: " + "R$" + cli4.getSaldoCli() + " de " + cli4.getNomeCli());
        System.out.println("Saldo atual: " + "R$" + cli5.getSaldoCli() + " de " + cli5.getNomeCli());

        System.out.println("\nSaldo final da Loja1: R$" + loja1.getSaldoLoja());
        System.out.println("\nSaldo final da Loja2: R$" + loja2.getSaldoLoja());

        System.out.println("\nSaldo da conta de " + funcionario1.getNomeFunci() + " R$" + funcionario1.getSaldoContaFunci() +
        "\nSaldo da conta de investimento de " + funcionario1.getNomeFunci() + " R$" + funcionario1.getSaldoContaInvestFunci());

        System.out.println("\nSaldo da conta de " + funcionario2.getNomeFunci() + " R$" + funcionario2.getSaldoContaFunci() +
        "\nSaldo da conta de investimento de " + funcionario2.getNomeFunci() + " R$" + funcionario2.getSaldoContaInvestFunci());

        System.out.println("\nSaldo da conta de " + funcionario3.getNomeFunci() + " R$" + funcionario3.getSaldoContaFunci() +
        "\nSaldo da conta de investimento de " + funcionario3.getNomeFunci() + " R$" + funcionario3.getSaldoContaInvestFunci());

        System.out.println("\nSaldo da conta de " + funcionario4.getNomeFunci() + " R$" + funcionario4.getSaldoContaFunci() +
        "\nSaldo da conta de investimento de " + funcionario4.getNomeFunci() + " R$" + funcionario4.getSaldoContaInvestFunci());



    }
}