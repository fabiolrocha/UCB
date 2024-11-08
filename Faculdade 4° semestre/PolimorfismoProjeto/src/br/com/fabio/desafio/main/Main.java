package br.com.fabio.desafio.main;
import br.com.fabio.desafio.trabalhadores.*;


public class Main {
    public static void main(String[] args){
        System.out.println("========== Folha de pagamento ==========");

        Estagiario objEstagiario = new Estagiario(650,800, 0,2500);
        System.out.println("O salário completo do Estagiario é: " + objEstagiario.salarioCompletoEstagiario());

        Gerente objGerente = new Gerente(2500,1500, 12,7500);
        System.out.println("O salário completo do Gerente é: " + objGerente.salarioCompletoGerente());

        Diretor objDiretor = new Diretor(5500,3500, 2,15500);
        System.out.println("O salário completo do Diretor é: " + objDiretor.salarioCompletoDiretor());
    }
}