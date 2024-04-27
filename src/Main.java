import Classes.Banco;
import Classes.Cliente;
import Classes.Loja;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Loja loja1 = new Loja("Loja 1", 0);
        Loja loja2 = new Loja("Loja 2", 0);

        Cliente cli1 = new Cliente("José", 1000,loja1,loja2,banco);
        Cliente cli2 = new Cliente("Maria", 1000,loja1,loja2,banco);
        Cliente cli3 = new Cliente("João", 1000,loja1,loja2,banco);
        Cliente cli4 = new Cliente("Gabriel", 1000,loja1,loja2,banco);
        Cliente cli5 = new Cliente("Ana", 1000,loja1,loja2,banco);

        cli1.start();
        cli2.start();
        cli3.start();
        cli4.start();
        cli5.start();

        try{
            cli1.join();
            cli2.join();
            cli3.join();
            cli4.join();
            cli5.join();
        } catch (InterruptedException e){
            System.out.println(e);
        }



        System.out.println("Saldo final da Loja1: R$" + loja1.getSaldoLoja());
        System.out.println("Saldo final da Loja2: R$" + loja2.getSaldoLoja());




    }
}