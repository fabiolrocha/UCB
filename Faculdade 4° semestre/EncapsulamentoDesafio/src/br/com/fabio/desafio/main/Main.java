package br.com.fabio.desafio.main;
import br.com.fabio.desafio.conta.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria objContaBancaria = new ContaBancaria(1000, "Fábio",100, 300);

        System.out.println("O titular é: " + objContaBancaria.getTitular());
        System.out.println("O saldo atual é: " + objContaBancaria.getSaldo());

        System.out.println("=============================");

        objContaBancaria.sacar();

        System.out.println("O titular é: " + objContaBancaria.getTitular());
        System.out.println("O saldo após o saque é: " + objContaBancaria.sacar());

        System.out.println("=============================");

        objContaBancaria.depositar();

        System.out.println("O titular é: " + objContaBancaria.getTitular());
        System.out.println("O saldo após o deposito é: " + objContaBancaria.depositar());

        System.out.println("=============================");

        objContaBancaria.setTitular("Junior");
        objContaBancaria.setSaldo(2200);

        System.out.println("O novo titular é: " + objContaBancaria.getTitular());
        System.out.println("O novo saldo é: " + objContaBancaria.getSaldo());

    }
}