package br.com.fabio.desafio.conta;

public class ContaBancaria {

    private String titular;
    private int saldo;
    private int valorDeposito;
    private int valorSaque;

    public ContaBancaria(int saldo, String titular, int valorSaque, int valorDeposito) {
        this.valorSaque = valorSaque;
        this.valorDeposito = valorDeposito;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(int valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public int getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(int valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double sacar(){

        if (saldo - valorSaque < 0) {
            System.out.println("Não possui esse valor");
        } else {
            return saldo - valorSaque;
        };
        return 0;
    }

    public double depositar(){
        return sacar() + valorDeposito;
    }

}
