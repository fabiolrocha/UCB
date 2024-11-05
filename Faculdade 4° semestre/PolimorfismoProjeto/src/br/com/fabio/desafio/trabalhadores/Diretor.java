package br.com.fabio.desafio.trabalhadores;

public class Diretor extends Bonificacao {

    private int salario;

    public Diretor(int planoSaude, int valeAlimentacao,int diasExtras, int salario) {
        super(planoSaude, valeAlimentacao, diasExtras);
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double salarioCompletoDiretor(){
        return salario * calculoDiasExtras() + salario + bonusAvancado();
    }

}
