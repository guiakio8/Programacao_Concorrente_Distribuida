import Classes.Cliente;
import Classes.Conta;
import Classes.Loja;

public class Main {

    public static void main(String[] args) {

        Cliente cli1 = new Cliente("José", 1000);
        Cliente cli2 = new Cliente("Maria", 1000);
        Cliente cli3 = new Cliente("João", 1000);
        Cliente cli4 = new Cliente("Gabriel", 1000);
        Cliente cli5 = new Cliente("Ana", 1000);

        cli1.start();
        cli2.start();
        cli3.start();
        cli4.start();
        cli5.start();



    }
}