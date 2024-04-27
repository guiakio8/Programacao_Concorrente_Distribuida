package Classes;

public class Loja extends Thread {
    private String nomeLoja;
    private Conta contaLoja;
    private double pagFunci;

    public Loja(String nomeLoja, double saldo) {
        this.nomeLoja = nomeLoja;
        this.contaLoja = new Conta(saldo);
    }


}