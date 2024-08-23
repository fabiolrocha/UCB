package br.com.fabio.conta;

public class Conta {

    public String nome;
    public int numero;
    public double saldo;

    public Conta(String nome, int numero, double saldo){
        super();
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public double saldo(){
        return saldo;
    }

    public double sacar(double valorSaque) {

        if (valorSaque <= saldo) {
            return saldo - valorSaque;
        } else {
            return 0;
        }
        
    }

    public double depositar(double valorDeposito){
        return saldo + valorDeposito;
    }
}
